package com.example.tig063vgr;

import android.os.Bundle;
import android.view.Menu;

public class Rapport extends UiInit {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_rapport);
		super.onCreate(savedInstanceState);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.rapport, menu);
		return true;
	}

}
