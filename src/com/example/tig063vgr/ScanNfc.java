package com.example.tig063vgr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class ScanNfc extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scan_nfc);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.scan_nfc, menu);
		return true;
	}

	public void buttonEmulate(View v) {
		Intent i = new Intent(getApplicationContext(), MainActivity.class);
		startActivity(i);
		finish();
	}
}
