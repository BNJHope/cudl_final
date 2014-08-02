package com.test;

import java.io.FileInputStream;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MedicalInfoDisplay extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_medical_info_display);
		////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		String temp="";
		try{
	        FileInputStream fin1 = openFileInput("Name");
	        int c;
	        
	        while( (c = fin1.read()) != -1){
	           temp = temp + Character.toString((char)c);
	        }
	        
	        fin1.close();
	        Toast.makeText(getBaseContext(),"file read",
	        Toast.LENGTH_SHORT).show();

	     }catch(Exception e){

	     }
		
		String Name = temp.toString();
		
		temp="";
		try{
	        FileInputStream fin2 = openFileInput("medicalCondition");
	        int c;
	        
	        while( (c = fin2.read()) != -1){
	           temp = temp + Character.toString((char)c);
	        }
	        
	        fin2.close();
	        Toast.makeText(getBaseContext(),"file read",
	        Toast.LENGTH_SHORT).show();

	     }catch(Exception e){

	     }
		
		String medicalCondition = temp.toString();
		
		temp="";
		try{
	        FileInputStream fin3 = openFileInput("medication");
	        int c;
	        
	        while( (c = fin3.read()) != -1){
	           temp = temp + Character.toString((char)c);
	        }
	        
	        fin3.close();
	        Toast.makeText(getBaseContext(),"file read",
	        Toast.LENGTH_SHORT).show();

	     }catch(Exception e){

	     }
		
		String medication = temp.toString();
		
		temp="";
		try{
	        FileInputStream fin4 = openFileInput("otherNotes");
	        int c;
	        
	        while( (c = fin4.read()) != -1){
	           temp = temp + Character.toString((char)c);
	        }
	        
	        fin4.close();
	        Toast.makeText(getBaseContext(),"file read",
	        Toast.LENGTH_SHORT).show();

	     }catch(Exception e){

	     }
		
		String otherNotes = temp.toString();
		
		View view1 = this.findViewById(R.id.MedCondition);//R.) TODO
		View view2 = this.findViewById(R.id.Name);
		View view3 = this.findViewById(R.id.Medication);
		View view4 = this.findViewById(R.id.OtherNotes);
		try{
			TextView text1 = (TextView)view1;
			TextView text2 = (TextView)view2;
			TextView text3 = (TextView)view3;
			TextView text4 = (TextView)view4;
			text1.setText(medicalCondition);
			text2.setText(Name);
			text3.setText(medication);
			text4.setText(otherNotes);
		}catch(Exception e) {
			System.out.println("TextView setting error");
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.medical_info_display, menu);
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
	
}
