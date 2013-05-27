package com.example.tig063vgr;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends Activity {

	private SlidingMenu menu;
	public static JSONArray JSONResult;
	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		initSliding();
		populateListMenu();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
		case android.R.id.home:
			menu.toggle();
			return true;
		case R.id.action_logout:
			SessionManager session = new SessionManager(getApplicationContext());
			session.logoutUser();
			// After logout redirect user to Loing Activity
			Intent logOut = new Intent(this, LoginActivity.class);
			// i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(logOut);
			finish();
			return true;
		case R.id.action_settings:
			Intent settings = new Intent(this, SettingsActivity.class);
			startActivity(settings);
			return true;
		default:
			return super.onOptionsItemSelected(item);

		}
	}

	public void initSliding() {

		menu = new SlidingMenu(this);
		menu.setMode(SlidingMenu.LEFT);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
		menu.setShadowWidthRes(R.dimen.shadow_width);
		menu.setShadowDrawable(R.drawable.shadow);
		menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		menu.setFadeDegree(0.35f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		menu.setMenu(R.layout.menu);

	}

	public void populateListMenu() {
		mainListView = (ListView) findViewById(R.id.menuList);

		String[] menyItems = new String[] { "Adam", "Rasmus", "Jonathan",
				"Patrik", "David", "John", "Linnea", "Gud" };
		ArrayList<String> menuList = new ArrayList<String>();
		menuList.addAll(Arrays.asList(menyItems));

		listAdapter = new ArrayAdapter<String>(this, R.layout.listitem,
				menuList);

		listAdapter.add("Jesus");

		mainListView.setAdapter(listAdapter);
	}

}
