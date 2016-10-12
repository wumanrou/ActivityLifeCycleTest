package com.example.activitylifecycletest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		System.out.println("MainActivity's onCreate");
	}

	protected void onStart(){
		super.onStart();
		System.out.println("MainActivity's onStart");
	}
	protected void  onRestart(){
		super.onRestart();
		System.out.println("MainActivity's onRestart");
	}
	protected void  onResume(){
		super.onRestart();
		System.out.println("MainActivity's onResume");
	}
	protected void  onStop(){
		super.onRestart();
		System.out.println("MainActivity's onStop");
	}
	protected void  onDestory(){
		super.onRestart();
		System.out.println("MainActivity's onDestory");
	}
	protected void  onPause(){
		super.onRestart();
		System.out.println("MainActivity's onPause");
	}
	
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

}
