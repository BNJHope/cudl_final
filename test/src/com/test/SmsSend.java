package com.test;

import java.io.FileOutputStream;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SmsSend extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sms_send);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sms_send, menu);
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
	

public void detailsConfirm ( View view ) {
		
	
	
		String file = "Name";
		EditText editText1 = (EditText) findViewById(R.id.editText1);
		String data1 = editText1.getText().toString();
	      try {
	         FileOutputStream fOut1 = openFileOutput(file,MODE_WORLD_READABLE);
	         fOut1.write(data1.getBytes());
	         fOut1.close();
	         Toast.makeText(getBaseContext(),"Name Saved",
	         Toast.LENGTH_SHORT).show();
	      } catch (Exception e1) {
	         // TODO Auto-generated catch block
	         e1.printStackTrace();
	      }

String file2 = "medicalCondition";
EditText editText2 = (EditText) findViewById(R.id.editText2);
String data2 = editText2.getText().toString();
  try {
     FileOutputStream fOut2 = openFileOutput(file2,MODE_WORLD_READABLE);
     fOut2.write(data2.getBytes());
     fOut2.close();
     Toast.makeText(getBaseContext(),"Medical Condition Saved",
     Toast.LENGTH_SHORT).show();
  } catch (Exception e2) {
     // TODO Auto-generated catch block
     e2.printStackTrace();
  }


String file3 = "medication";
EditText editText3 = (EditText) findViewById(R.id.editText3);
String data3 = editText3.getText().toString();
  try {
     FileOutputStream fOut3 = openFileOutput(file3,MODE_WORLD_READABLE);
     fOut3.write(data3.getBytes());
     fOut3.close();
     Toast.makeText(getBaseContext(),"Medication Saved",
     Toast.LENGTH_SHORT).show();
  } catch (Exception e3) {
     // TODO Auto-generated catch block
     e3.printStackTrace();
  }



String file4 = "otherNotes";
EditText editText4 = (EditText) findViewById(R.id.editText3);
String data4 = editText4.getText().toString();
  try {
     FileOutputStream fOut4 = openFileOutput(file4,MODE_WORLD_READABLE);
     fOut4.write(data4.getBytes());
     fOut4.close();
     Toast.makeText(getBaseContext(),"Other Notes Saved",
     Toast.LENGTH_SHORT).show();
  } catch (Exception e4) {
     // TODO Auto-generated catch block
     e4.printStackTrace();
  }
}
			 
	 
	    }
