package com.example.tig063vgr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class Rapport extends UiInit {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_rapport);
		super.onCreate(savedInstanceState);

		// Init Vy and header
		ListView rapportList = (ListView) findViewById(R.id.listRapport);
		View header = getLayoutInflater().inflate(R.layout.listheader, null);
		rapportList.addHeaderView(header);

		// Populate hashmap
		ArrayList<HashMap<String, String>> customAdapter = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> item = new HashMap<String, String>();
		item.put("large", "Utrustning ID");
		item.put("small", "EQUIPMENT_ID");
		customAdapter.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Namn");
		item.put("small", "NAME");
		customAdapter.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Tillverkare");
		String[] menyItems = { " Simens", "Nokia", "Volvo", "SAAB", "Intel",
				"AMD", "Nvidia", "LG", "Apple", "Dell", "Microsoft", "Google",
				"NASA" };
		Random r = new Random();
		item.put("small", menyItems[r.nextInt(menyItems.length)]);
		customAdapter.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Plats");
		item.put("small", "LOCATION_ID");
		customAdapter.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Status");
		item.put("small", "STAUTS_ID");
		customAdapter.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Modality Group");
		item.put("small", "MOD_GROUP");
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
