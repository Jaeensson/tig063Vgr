package com.example.tig063vgr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class NetworkTasks extends AsyncTask<String, Void, JSONArray> {
	static InputStream is = null;
	static JSONArray jObj = null;
	static String json = "";

	private ProgressDialog dialog;
	private Context context;
	private APIType en;

	public NetworkTasks(Context ctx, APIType enu) {
		context = ctx;
		dialog = new ProgressDialog(context);
		en = enu;
	}

	public NetworkTasks(APIType enu) {
		en = enu;
	}

	@Override
	protected void onPreExecute() {
		dialog.setMessage("Laddar...");
		dialog.show();
	}

	@Override
	protected JSONArray doInBackground(final String... params) {

		String content = "";

		try {
			URL url = new URL(
					"http://leia.skip.chalmers.se/jaeensson/JSON-API/" + en
							+ ".php?action=" + params[0]);
			URLConnection conn = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));

			String line = "";
			while ((line = reader.readLine()) != null) {
				content += line;
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {

		} catch (Exception e) {
			Log.e("BufferFel", "Error" + e.toString());
		}

		try {
			jObj = new JSONArray(content);
		} catch (JSONException e) {
			Log.e("JSONParser", "Error" + e.toString());
		}

		return jObj;
	}

	@Override
	protected void onPostExecute(final JSONArray result) {

        MainActivity act = (MainActivity) context;
        act.setData(result);
        if (dialog.isShowing()) {
			dialog.dismiss();
		}
	}

	@Override
	protected void onCancelled() {
		if (dialog.isShowing()) {
			dialog.dismiss();
		}
	}
} // AsyncTask

