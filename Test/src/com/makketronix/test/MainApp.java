package com.makketronix.test;

import android.app.Activity;
import android.app.Application;

public class MainApp extends Application {
	
	private static final String TAG = "MainApp"; // Global TAG used in logging
	private static MainApp instance;			 // App Singleton
	private static Activity currentUIActivity;   // UI Activity Singleton
	
	@Override
	public String toString() {
		return TAG;
	}
	
	static {
		instance = null;	// call only once
	}
	
	private static synchronized void setInstance(MainApp app) {
		instance = app;
	}
	
	public static synchronized MainApp getInstance() {
		return instance;
	}
	
	public static synchronized void setCurrentActivity(Activity act) {
		currentUIActivity = act;
	}
	
	public static synchronized Activity getCurrentActivity() {
		return currentUIActivity;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		MainApp.setInstance(this);
	}
	
	@Override
	public void onLowMemory() {
		super.onLowMemory();
	}
}
