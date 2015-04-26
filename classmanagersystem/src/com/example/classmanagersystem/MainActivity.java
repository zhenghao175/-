package com.example.classmanagersystem;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private AutoCompleteTextView userName;
	private EditText userPassword;
	private Button btn_register;
	private Button btn_login;
	private Button btn_exit;

	private List<String> lists = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_login = (Button) findViewById(R.id.login);
		
		btn_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				login();
			}
		});	
	}

	//×¢²á
	
	//µÇÂ¼
	public void login() {

		Intent intent = new Intent(MainActivity.this,
				StudentInformationManagerActivity.class);
		startActivity(intent);

}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
