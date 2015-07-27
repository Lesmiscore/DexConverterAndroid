package com.nao20010128nao.DexConverterAndroid.App;
import android.app.*;
import android.os.*;
import android.content.*;
import com.nao20010128nao.ToolBox.*;
import java.lang.ref.*;

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
		
		return super.onStartCommand(flags, startId);
	}
}
