package com.nao20010128nao.DexConverterAndroid.App;
import android.app.*;
import java.util.*;

public class ConvertQueueActivity extends ListActivity implements List<ConvertQueueActivity.ConvertData>
{
	ArrayList<ConvertData> q=new ArrayList<>();
	public static class ConvertData{
		java.lang.Process process;
		String[] args;
		String tag;
	}

	@Override
	public int indexOf(Object p1)
	{
		// TODO: Implement this method
		return q.indexOf(p1);
	}
}
