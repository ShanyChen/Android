package com.example.activity101;

import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.Window;

public class MainActivity extends ActionBarActivity {
    String tag = "Lifecycle";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Log.d(tag, "In the onCreate() event");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);

	}
//	public void onStart() {
//		super.onStart();
//		Log.d(tag, "In the OnStart() event");
//	}
//	public void onRestart() {
//		super.onStart();
//		Log.d(tag, "In the OnRestart() event");
//	}
//	public void onPause() {
//		super.onStart();
// 		Log.d(tag, "In the OnPauset() event");
//	}
//	public void onStop() {
//		super.onStart();
//		Log.d(tag, "In the OnStop() event");
//	}
//	public void onDestory() {
//		super.onStart();
//		Log.d(tag, "In the onDestory() event");
//	}
}
