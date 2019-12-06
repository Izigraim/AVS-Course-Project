package com.example.virus;

import android.app.Activity;
import android.os.Bundle;

/**
 * This class is used for lock screen.
 */
public class LockScreen extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(R.anim.fadein, R.anim.fadeout);  
		setContentView(R.layout.lock_screen);
	}
}
