package com.example.tig063vgr;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class Rapport extends UiInit {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_rapport);
		super.onCreate(savedInstanceState);

		ListView rapportList = (ListView) findViewById(R.id.listRapport);

		ArrayList<HashMap<String, String>> customAdapter = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> item = new HashMap<String, String>();
		item.put("large", "Rubrik1");
		item.put("small", "Text1");
		customAdapter.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Rubrik2");
		item.put("small", "Text2");
		customAdapter.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Rubrik3");
		item.put("small", "Text3");
		customAdapter.add(item);

		ListViewAdapter adapter = new ListViewAdapter(this, customAdapter);

		rapportList.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.rapport, menu);
		return true;
	}

}
