package com.example.activitylifecycletest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Button btn1=(Button)findViewById(R.id.btn1);
		btn1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(SecondActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});
		
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

}
