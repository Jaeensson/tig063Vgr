package com.example.tig063vgr.httprules;

import org.json.JSONArray;

import android.content.Context;
import android.os.AsyncTask;

import com.example.tig063vgr.APIType;
import com.example.tig063vgr.NetworkTasks;

public class Modality extends NetworkTasks {

	public Modality(Context ctx) {
		super(ctx, APIType.Modality);
	}

	public AsyncTask<String, Void, JSONArray> GetOrganizations() {
		return execute("GetOrganizations");
	}

	public AsyncTask<String, Void, JSONArray> GetOragnizationalUnits() {
		return execute("GetOragnizationalUnits");
	}

	public AsyncTask<String, Void, JSONArray> GetLocations() {
		return execute("GetLocations");
	}

	public AsyncTask<String, Void, JSONArray> GetModalities() {
		return execute("GetModalities");
	}

	public AsyncTask<String, Void, JSONArray> GetModalityGroups() {
		return execute("GetModalityGroups");
	}

	public AsyncTask<String, Void, JSONArray> GetEquipments() {
		return execute("GetEquipments");
	}

	public AsyncTask<String, Void, JSONArray> GetMaintenanceProviders() {
		return execute("GetMaintenanceProviders");
	}

	public AsyncTask<String, Void, JSONArray> GetMaintenanceContracts() {
		return execute("GetMaintenanceContracts");
	}

	public AsyncTask<String, Void, JSONArray> GetTimelineByModalityGroup(
			String modGroupId) {
		return execute("GetTimelineByModalityGroup&param1=" + modGroupId);
	}

	public AsyncTask<String, Void, JSONArray> GetTimelineByEquipment(
			String equipmentId) {
		return execute("GetTimelineByEquipment&param1=" + equipmentId);
	}

}
