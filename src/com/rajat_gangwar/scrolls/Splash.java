package com.rajat_gangwar.scrolls;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		new Handler().postDelayed(new Runnable() {

			
			@Override
			public void run() {
				Intent i = new Intent(Splash.this, MainActivity.class);
				startActivity(i);
				finish();
			}
		},4000);
	}
}
