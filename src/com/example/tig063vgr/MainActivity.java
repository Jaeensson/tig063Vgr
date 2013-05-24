package com.example.tig063vgr;

import java.util.concurrent.ExecutionException;

import android.os.AsyncTask;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.example.tig063vgr.httprules.Modality;

public class MainActivity extends Activity {

	TextView sd;
	public static JSONArray JSONResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void btnDebugClick(View v) {
		Modality m = new Modality(this);
		sd = (TextView) findViewById(R.id.response);
		sd.setText("");
		try {
			AsyncTask<String, Void, JSONArray> lolz = m.GetOrganizations();
            //lolz.wait();
            JSONArray ar = lolz.get();
            for (int i = 0; i < ar.length(); i++) {
				String stringJson = ar.getJSONObject(i).get("Name").toString();
				sd.setText(sd.getText() + stringJson + "\n");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} 	}
}
