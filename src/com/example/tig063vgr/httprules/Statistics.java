package com.example.tig063vgr.httprules;

import org.json.JSONArray;

import android.content.Context;
import android.os.AsyncTask;

import com.example.tig063vgr.APIType;

public class Statistics extends NetworkTasks {

	public Statistics(Context ctx) {
		super(ctx, APIType.Modality);
	}

	public AsyncTask<String, Void, JSONArray> GetOrganizations() {
		return execute("GetOrganizations");
	}

	public AsyncTask<String, Void, JSONArray> GetOrgnizationalUnits() {
		return execute("GetOrgnizationalUnits");
	}

	public AsyncTask<String, Void, JSONArray> GetDataPointsByHsaIdentitiesAndDateInterval(
			String hsaId, String startDate, String endDate) {
		return execute("GetDataPointsByHsaIdentitiesAndDateInterval&param1="
				+ hsaId + "&param2=" + startDate + "&param3=" + endDate);
	}

	public AsyncTask<String, Void, JSONArray> GetDataPointsByHsaIdentities(
			String hsaId) {
		return execute("GetDataPointsByHsaIdentities&param1=" + hsaId);
	}
}
