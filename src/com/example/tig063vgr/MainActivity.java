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

        Modality modality = new Modality(this);


        //DEN HÄR
        modality.GetEquipments();
        //DEN HÄR


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

    public void setData(JSONArray result) {

        Random r = new Random();
        Equipment e = null;
        try {
            e = new Equipment(result.getJSONObject(r.nextInt(result
                    .length())));
        } catch (JSONException e1) {
            e1.printStackTrace();
        }
        mSectionsPagerAdapter.setEquipment(e);

        mViewPager.setAdapter(mSectionsPagerAdapter);

    }
}
