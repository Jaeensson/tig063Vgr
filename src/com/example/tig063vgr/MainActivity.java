package com.example.tig063vgr;

import java.util.Random;
import java.util.concurrent.ExecutionException;

import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.tig063vgr.adapter.SlidePagerAdapter;
import com.example.tig063vgr.animations.ZoomOutPageTransformer;
import com.example.tig063vgr.httprules.Modality;

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
		mViewPager.setPageTransformer(true, new ZoomOutPageTransformer());

		Modality modality = new Modality(this);

		Equipment e = null;
		try {
			Random r = new Random();
			JSONArray result = modality.GetEquipments().get();
			e = new Equipment(result.getJSONObject(r.nextInt(result.length())));
			mSectionsPagerAdapter.setEquipment(e);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		} catch (JSONException e1) {
			e1.printStackTrace();
		}

		mViewPager.setAdapter(mSectionsPagerAdapter);

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
