package com.example.tig063vgr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MainActivity extends UiInit {

	SlidePagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.viewpagertop);
		super.onCreate(savedInstanceState);
		// TODO: Får följande INFO debug Bitmap too large to be uploaded into a
		// texture (2362x556, max=2048x2048)
		
		mSectionsPagerAdapter = new SlidePagerAdapter(
				getSupportFragmentManager());
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

	}

	public void buttonEmulate(View v) {
		Intent logOut = new Intent(this, Rapport.class);
		startActivity(logOut);
	}
}
