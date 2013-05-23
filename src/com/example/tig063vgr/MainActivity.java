package com.example.tig063vgr;

import org.json.JSONArray;

import com.example.tig063vgr.httprules.Modality;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView v;
	public static JSONArray JSONResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		v = (TextView) findViewById(R.id.textView1);
		Modality mod = new Modality(this);
		mod.GetOrganizations();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
