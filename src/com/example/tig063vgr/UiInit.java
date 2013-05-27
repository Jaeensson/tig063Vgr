package com.example.tig063vgr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class UiInit extends Activity {
	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;
	private SlidingMenu menu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		initSliding();
		// populateListMenu();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			menu.toggle();
			return true;
		case R.id.action_logout:
			SessionManager session = new SessionManager(getApplicationContext());
			session.logoutUser();
			Intent logOut = new Intent(this, LoginActivity.class);
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


	 public void populatelistmenu() {

       /*
       mainlistview = (ListView) findviewbyid(R.id.menulist);
       String[] menyitems = new String[] { "adam", "rasmus", "jonathan","patrik", "david", "john", "linnea", "gud" };
       ArrayList<String> menulist = new ArrayList<String>();
       menulist.addAll(Arrays.aslist(menyitems));
       listadapter = new ArrayAdapter<String>(this, R.layout.listitem_ui, menulist);
       listadapter.add("jesus");
       mainlistview.setadapter(listadapter);
        */
     }


}
