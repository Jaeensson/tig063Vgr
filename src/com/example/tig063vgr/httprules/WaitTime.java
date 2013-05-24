package com.example.tig063vgr.httprules;

import org.json.JSONArray;

import android.content.Context;
import android.os.AsyncTask;

import com.example.tig063vgr.APIType;
import com.example.tig063vgr.NetworkTasks;

public class WaitTime extends NetworkTasks {

	public WaitTime(Context ctx) {
		super(ctx, APIType.Modality);
	}

	public AsyncTask<String, Void, JSONArray> GetOrganizations() {
		return execute("GetOrganizations");
	}

	public AsyncTask<String, Void, JSONArray> GetOrgnizationalUnits() {
		return execute("GetOrgnizationalUnits");
	}

	public AsyncTask<String, Void, JSONArray> GetStudyTypes() {
		return execute("GetStudyTypes");
	}

	public AsyncTask<String, Void, JSONArray> GetStudies() {
		return execute("GetStudies");
	}

	public AsyncTask<String, Void, JSONArray> NearLatitudeLongitudeByStudy(
			String studyId, String latitude, String longitude,
			String radiusInMetres) {
		return execute("NearLatitudeLongitudeByStudy&param1=" + studyId
				+ " &param2=" + latitude + "&param3=" + longitude + "&param4="
				+ radiusInMetres);
	}

}
