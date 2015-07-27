package com.nao20010128nao.DexConverterAndroid.App;
import android.app.*;
import android.content.*;

public class AppApplication extends Application {
	@Override
	public void onCreate() {
		// TODO: Implement this method
		super.onCreate();
		startService(new Intent(this, ConvertManageService.class));
	}
}
