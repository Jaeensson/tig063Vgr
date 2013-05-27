package com.example.tig063vgr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends UiInit {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_main);
		super.onCreate(savedInstanceState);

	}

	public void buttonEmulate(View v) {
		Intent logOut = new Intent(this, Rapport.class);
		startActivity(logOut);
	}
}
