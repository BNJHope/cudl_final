package com.test;

import com.test.services.HeartBeatIntentService;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Settings extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
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
	
	public void editContacts (View view) {
		Intent intent = new Intent (this, EmergencyContacts.class);
		startActivity(intent);
	}
	
	public void editTextBody (View view) {
		Intent intent = new Intent (this, TextBody.class);
		startActivity(intent);
}
	public void enterMedicInfo (View view) {
		Intent intent = new Intent (this, SmsSend.class);
		startActivity(intent);
	}
	
	public void HeartBeatLauncher (View view) {
		Intent intent = new Intent(this, HeartBeatIntentService.class);
		startService(intent);
	}
	}

