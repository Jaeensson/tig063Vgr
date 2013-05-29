package com.example.tig063vgr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class Rapport extends UiInit {

	private static final int PICTURE_RESULT = 1337;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_rapport);
		super.onCreate(savedInstanceState);

		// Init Vy and header
		ListView rapportList = (ListView) findViewById(R.id.listRapport);
		View header = getLayoutInflater().inflate(R.layout.listheader, null);
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

		ListViewAdapter adapter = new ListViewAdapter(this, list);
		rapportList.setAdapter(adapter);
	}

	public void btnCameraClick(View v) {
		Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		this.startActivityForResult(camera, PICTURE_RESULT);
	}

	@Override
	protected void onActivityResult(int requestCode, int result, Intent intent) {
		super.onActivityResult(requestCode, result, intent);
		if (requestCode == PICTURE_RESULT) {
			if (result == Activity.RESULT_OK) {
				Bundle b = intent.getExtras();
				Bitmap bmp = (Bitmap) b.get("data");
				if (bmp != null) {
					// ImageView imageView = (ImageView)
					// findViewById(R.id.imageView);
					// imageView.setImageBitmap(bmp);
					// imageView.invalidate();
				}
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.rapport, menu);
		return true;
	}
}
