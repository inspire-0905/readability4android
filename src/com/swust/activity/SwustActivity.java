package com.swust.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.swust.SerializationDeserialization4Json.http.APIClient;

public abstract class SwustActivity<T extends APIClient> extends Activity {
	protected T client;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public abstract T getClient();
	
}
