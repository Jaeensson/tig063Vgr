package com.example.tig063vgr.httprules;

import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;

import com.example.tig063vgr.APIType;
import com.example.tig063vgr.NetworkTasks;

public class WaitTime extends NetworkTasks {

	public WaitTime(Context ctx) {
		super(ctx, APIType.Modality);
	}

	public AsyncTask<String, Void, JSONObject> GetOrganizations() {
		return execute("GetOrganizations");
	}

	public AsyncTask<String, Void, JSONObject> GetOrgnizationalUnits() {
		return execute("GetOrgnizationalUnits");
	}

	public AsyncTask<String, Void, JSONObject> GetStudyTypes() {
		return execute("GetStudyTypes");
	}

	public AsyncTask<String, Void, JSONObject> GetStudies() {
		return execute("GetStudies");
	}

	public AsyncTask<String, Void, JSONObject> NearLatitudeLongitudeByStudy(
			String studyId, String latitude, String longitude,
			String radiusInMetres) {
		return execute("NearLatitudeLongitudeByStudy&param1=" + studyId
				+ " &param2=" + latitude + "&param3=" + longitude + "&param4="
				+ radiusInMetres);
	}

}
