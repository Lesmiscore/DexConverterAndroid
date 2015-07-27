package com.nao20010128nao.DexConverterAndroid.App;
import android.preference.*;
import android.os.*;
import android.app.*;
import android.widget.*;

public class RequestActivity extends Activity {
	TextView input,output;
	CheckBox multidex;
	Button start;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.request);
		
	}
}
