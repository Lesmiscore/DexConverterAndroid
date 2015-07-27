package com.nao20010128nao.DexConverterAndroid.App;
import android.preference.*;
import android.os.*;
import android.app.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.util.*;
import java.io.*;
import android.content.*;

public class RequestActivity extends SmartFindViewActivity {
	TextView input,output;
	CheckBox multidex;
	Button start;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.request);
		input=find("input");
		output=find("output");
		multidex=find("multidex");
		start=find("start");
		start.setOnClickListener(new View.OnClickListener(){
			public void onClick(View p){
				String in=input.getText().toString();
				String out=output.getText().toString();
				boolean md=multidex.isChecked();
				new File(getFilesDir(), "dex").mkdir();
				List<String> args=new ArrayList<>(7);
				args.add("/system/bin/dalvikvm");
				args.add("-classpath");
				args.add(getApplicationInfo().sourceDir);
				args.add("app.Main");
				args.add("--dex");
				if(md)args.add("--multi-dex");
				args.add("--output="+out);
				args.add(in);
				ConvertQueueActivity.ConvertData data=new ConvertQueueActivity.ConvertData();
				data.args=args.toArray(new String[args.size()]);
				data.tag=tag();
				try {
					data.process = new ProcessBuilder().
						command(args).
						directory(new File(getFilesDir(), "dex")).
						start();
				} catch (IOException e) {
					e.printStackTrace();
					Toast.makeText(getApplication(),R.string.startfailed,1);
					return;
				}
				data.worker=new AsyncTask<ConvertQueueActivity.ConvertData,Void,Boolean>(){
					ConvertQueueActivity.ConvertData data;
					public Boolean doInBackground(ConvertQueueActivity.ConvertData... a){
						java.lang.Process p=(data=a[0]).process;
						try {
							p.waitFor();
						} catch (InterruptedException e) {
							return false;
						}
						return true;
					}
					public void onPostExecute(Boolean r){
						List list=ConvertQueueActivity.list();
						list.remove(data);
					}
				};
				data.worker.execute(data);
				List toAdd=ConvertQueueActivity.list();
				toAdd.add(data);
				finish();
				startService(new Intent(RequestActivity.this, ConvertManageService.class));
			}
			String tag(){
				StringBuilder sb=new StringBuilder();
				FileInputStream fis=null;
				try{
					fis=new FileInputStream("/dev/random");
					for(int i=0;i<10;i++){
						sb.append(Integer.toHexString(fis.read()));
					}
				}catch(Throwable ez){
					
				}finally{
					try {
						fis.close();
					} catch (IOException e) {
						
					}
				}
				return sb.toString();
			}
		});
	}
}
