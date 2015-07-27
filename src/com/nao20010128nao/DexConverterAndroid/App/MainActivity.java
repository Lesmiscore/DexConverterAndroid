package com.nao20010128nao.DexConverterAndroid.App;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.preference.*;
import com.nao20010128nao.ToolBox.*;
import android.content.*;

public class MainActivity extends SHablePreferenceActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_main);
		sH("checklist",new HandledPreference.OnClickListener(){
			public void onClick(String a,String b,String c){
				startActivity(new Intent(MainActivity.this,ConvertQueueActivity.class));
			}
		});
		sH("newreq",new HandledPreference.OnClickListener(){
				public void onClick(String a,String b,String c){
					startActivity(new Intent(MainActivity.this,RequestActivity.class));
				}
			});
    }
}
