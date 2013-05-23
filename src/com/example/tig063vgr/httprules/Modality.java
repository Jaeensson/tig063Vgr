package com.example.tig063vgr.httprules;

import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;

import com.example.tig063vgr.APIType;
import com.example.tig063vgr.NetworkTasks;

public class Modality extends NetworkTasks {

	public Modality(Context ctx) {
		super(ctx, APIType.Modality);
	}

	public AsyncTask<String, Void, JSONObject> GetOrganizations() {
		return execute("GetOrganizations");
	}

	public AsyncTask<String, Void, JSONObject> GetOragnizationalUnits() {
		return execute("GetOragnizationalUnits");
	}

	public AsyncTask<String, Void, JSONObject> GetLocations() {
		return execute("GetLocations");
	}

	public AsyncTask<String, Void, JSONObject> GetModalities() {
		return execute("GetModalities");
	}

	public AsyncTask<String, Void, JSONObject> GetModalityGroups() {
		return execute("GetModalityGroups");
	}

	public AsyncTask<String, Void, JSONObject> GetEquipments() {
		return execute("GetEquipments");
	}

	public AsyncTask<String, Void, JSONObject> GetMaintenanceProviders() {
		return execute("GetMaintenanceProviders");
	}

	public AsyncTask<String, Void, JSONObject> GetMaintenanceContracts() {
		return execute("GetMaintenanceContracts");
	}

	public AsyncTask<String, Void, JSONObject> GetTimelineByModalityGroup(
			String modGroupId) {
		return execute("GetTimelineByModalityGroup&param1=" + modGroupId);
	}

	public AsyncTask<String, Void, JSONObject> GetTimelineByEquipment(
			String equipmentId) {
		return execute("GetTimelineByEquipment&param1=" + equipmentId);
	}

}
