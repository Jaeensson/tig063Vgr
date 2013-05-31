package com.example.tig063vgr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScanNfc extends UiInit {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scan_nfc);
	}

	public void buttonEmulate(View v) {
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
	}
}
