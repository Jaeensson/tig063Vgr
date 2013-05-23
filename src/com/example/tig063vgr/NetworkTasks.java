package com.example.tig063vgr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class NetworkTasks extends AsyncTask<String, Void, JSONObject> {
	static InputStream is = null;
	static JSONObject jObj = null;
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
	protected JSONObject doInBackground(final String... params) {

		try {
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost httpPost = new HttpPost(
					"http://leia.skip.chalmers.se/jaeensson/JSON-API/" + en
							+ ".php?action=" + params[0]);

			HttpResponse httpResponse = httpClient.execute(httpPost);
			HttpEntity httpEntity = httpResponse.getEntity();
			is = httpEntity.getContent();

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "utf-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			json = sb.toString();
		} catch (Exception e) {
			Log.e("BufferFel", "Error" + e.toString());
		}

		try {
			jObj = new JSONObject(json);
		} catch (JSONException e) {
			Log.e("JSONParser", "Error" + e.toString());
		}

		// return JSON String
		return jObj;
	}

	@Override
	protected void onPostExecute(final JSONObject result) {
		if (dialog.isShowing()) {
			dialog.dismiss();
		}
		if (result != null) {

		}
	}

	@Override
	protected void onCancelled() {
		if (dialog.isShowing()) {
			dialog.dismiss();
		}
	}
} // AsyncTask

