package com.example.tig063vgr.httprules;

import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;

import com.example.tig063vgr.APIType;
import com.example.tig063vgr.NetworkTasks;

public class Statistics extends NetworkTasks {
	private NetworkTasks mMyNetworkTask = null;

	public Statistics(Context ctx) {
		super(ctx, APIType.Modality);
		if (mMyNetworkTask != null) {
			return;
		}
		mMyNetworkTask = new NetworkTasks(ctx, APIType.Modality);
	}

	public AsyncTask<String, Void, JSONObject> GetOrganizations() {
		return execute("GetOrganizations");
	}

	public AsyncTask<String,Void,JSONObject> GetOrgnizationalUnits() {
		return execute("GetOrgnizationalUnits");
	}

	public AsyncTask<String,Void,JSONObject> GetDataPointsByHsaIdentitiesAndDateInterval(String hsaId,
			String startDate, String endDate) {
		return execute("GetDataPointsByHsaIdentitiesAndDateInterval&param1="
				+ hsaId + "&param2=" + startDate + "&param3=" + endDate);
	}

	public AsyncTask<String, Void, JSONObject> GetDataPointsByHsaIdentities(String hsaId) {
		return execute("GetDataPointsByHsaIdentities&param1=" + hsaId);
	}
}
