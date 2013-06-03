package com.example.tig063vgr;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import com.example.tig063vgr.adapter.SlidePagerAdapter;
import com.example.tig063vgr.animations.ZoomOutPageTransformer;
import com.example.tig063vgr.httprules.Modality;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.Random;

public class MainActivity extends UiInit {

    public SlidePagerAdapter mSectionsPagerAdapter;
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
        modality.GetEquipments();
    }

    public void btnScanNewClick(View v) {
        Intent m = new Intent(this, ScanNfc.class);
        m.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(m);
        finish();
    }

    public void btnSendClick(View v) {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage("Skickar rapport");
        pd.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                pd.dismiss();
                mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1, true);
            }
        }, 3000);
    }

    public void btnNextClick(View v) {
        mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1, true);
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
