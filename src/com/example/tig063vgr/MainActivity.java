package com.example.tig063vgr;

import android.util.Log;
import android.view.View;
import org.json.JSONArray;

import com.example.tig063vgr.httprules.Modality;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import org.json.JSONException;

import java.util.concurrent.ExecutionException;

public class MainActivity extends Activity {

	TextView v;
	public static JSONArray JSONResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		v = (TextView) findViewById(R.id.textView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    public void btnDebugClick(View v) {
        Modality m = new Modality(this);
        try {
            JSONArray ar = m.GetOrganizations().get();
            for (int i = 0; i<ar.length(); i++) {
                Log.d("",ar.getJSONObject(i).get("Name").toString());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
