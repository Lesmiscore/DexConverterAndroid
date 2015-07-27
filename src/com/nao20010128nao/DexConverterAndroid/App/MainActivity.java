package com.nao20010128nao.DexConverterAndroid.App;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.preference.*;

public class MainActivity extends SHablePreferenceActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_main);
    }
}
