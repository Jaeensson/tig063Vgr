package com.example.tig063vgr;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MainActivity extends UiInit {

	SlidePagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	private static final int PICTURE_RESULT = 1337;

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
}
