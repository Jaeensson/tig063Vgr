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
import android.widget.ImageButton;

import com.example.tig063vgr.adapter.SlidePagerAdapter;
import com.example.tig063vgr.animations.ZoomOutPageTransformer;
import com.example.tig063vgr.httprules.Modality;

public class MainActivity extends UiInit {

	SlidePagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	private static final int PICTURE_RESULT = 1337;
	SoundRecorder record;

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

		try {
			Modality modality = new Modality(this);
			Random r = new Random();
			JSONArray result = null;

			//DEN HÄR
			result = modality.GetEquipments().get();
			//DEN HÄR
			
			
			Equipment e = new Equipment(result.getJSONObject(r.nextInt(result
					.length())));
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
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == PICTURE_RESULT) {
			if (resultCode == Activity.RESULT_OK) {
				Bundle b = data.getExtras();
				Bitmap bmp = (Bitmap) b.get("data");
				if (bmp != null) {
					ImageButton cameraBtn = (ImageButton) findViewById(R.id.buttonCamera);
					cameraBtn.setImageResource(R.drawable.cameraselected);
					cameraBtn.setEnabled(false);

				}
			}
		}

	}

}
