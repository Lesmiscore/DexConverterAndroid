package com.nao20010128nao.DexConverterAndroid.App;
import android.app.*;
import android.os.*;
import android.content.*;
import com.nao20010128nao.ToolBox.*;
import java.lang.ref.*;
import java.util.*;

public class ConvertManageService extends ServiceX{
	public static WeakReference<ConvertManageService> instance=new WeakReference<>(null);
	@Override
	public IBinder onBind() {
		// TODO: Implement this method
		return null;
	}

	@Override
	public int onStartCommand(int flags, int startId) {
		// TODO: Implement this method
		instance=new WeakReference<>(this);
		new Thread(){
			public void run(){
				try {
					startForeground(0,new Notification.Builder(ConvertManageService.this).
											setContentText("Running").
											setSubText("Running").build());
					List list=ConvertQueueActivity.list();
					while (list.size() != 0) {
						list = ConvertQueueActivity.list();
						for (ConvertQueueActivity.ConvertData data:list) {
							while (data.worker.getStatus() == AsyncTask.Status.RUNNING)
								sleep(100);
						}
					}
				} finally {
					
				}
			}
			void sleep(long t){
				try {
					super.sleep(t);
				} catch (InterruptedException e) {
					
				}
			}
		}.start();
		return super.onStartCommand(flags, startId);
	}
}
