package com.example.tig063vgr;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import java.util.ArrayList;

public class UiInit extends Activity {
	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;
	private SlidingMenu menu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		initSliding();
		populateListMenu();
		mainListView
				.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView,
                                            View view, int i, long l) {

                        MenuListItem item = (MenuListItem) mainListView.getItemAtPosition(i);
                        String number = "tel:" + item.getPhone();
                        Intent callIntent = new Intent(Intent.ACTION_CALL, Uri
                                .parse(number));

                        startActivity(callIntent);
                    }
                });
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

	public void populateListMenu() {

		mainListView = (ListView) findViewById(R.id.menuList);
		ArrayList<MenuListItem> list = new ArrayList<MenuListItem>();
		list.add(new MenuListItem("Rasmus", R.drawable.telephone_icon, "0767772025"));
        list.add(new MenuListItem("Adam", R.drawable.telephone_icon, "0737747780"));
        list.add(new MenuListItem("Anna", R.drawable.telephone_icon, "0735864505"));
		MenuListAdapter a = new MenuListAdapter(this, list);
		View header = getLayoutInflater().inflate(R.layout.sliding_menu_header,
				null);
		mainListView.addHeaderView(header);
		mainListView.setAdapter(a);
	}
}