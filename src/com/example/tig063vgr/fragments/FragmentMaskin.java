package com.example.tig063vgr.fragments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tig063vgr.ListViewAdapter;
import com.example.tig063vgr.R;

public class FragmentMaskin extends Fragment {

	public FragmentMaskin() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_maskin, container,
				false);

		// Init Vy and header
		ListView rapportList = (ListView) rootView
				.findViewById(R.id.listRapport);
		View header = inflater.inflate(R.layout.listheader, null);
		rapportList.addHeaderView(header);

		// Populate hashmap
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> item = new HashMap<String, String>();
		item.put("large", "Utrustning ID");
		item.put("small", "EQUIPMENT_ID");
		list.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Namn");
		item.put("small", "NAME");
		list.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Tillverkare");
		String[] menyItems = { " Simens", "Nokia", "Volvo", "SAAB", "Intel",
				"AMD", "Nvidia", "LG", "Apple", "Dell", "Microsoft", "Google",
				"NASA" };
		Random r = new Random();
		item.put("small", menyItems[r.nextInt(menyItems.length)]);
		list.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Plats");
		item.put("small", "LOCATION_ID");
		list.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Status");
		item.put("small", "STAUTS_ID");
		list.add(item);

		item = new HashMap<String, String>();
		item.put("large", "Modality Group");
		item.put("small", "MOD_GROUP");
		list.add(item);

		ListViewAdapter adapter = new ListViewAdapter(getActivity(), list);
		rapportList.setAdapter(adapter);

		return rootView;
	}
}