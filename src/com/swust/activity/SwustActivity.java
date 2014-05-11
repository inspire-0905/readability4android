package com.swust.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.swust.SerializationDeserialization4Json.http.APIClient;

public abstract class SwustActivity<T extends APIClient> extends FragmentActivity {
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
