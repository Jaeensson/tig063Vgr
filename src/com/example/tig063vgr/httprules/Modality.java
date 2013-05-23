package com.example.tig063vgr.httprules;

import org.json.JSONObject;

import com.example.tig063vgr.JSONParse;

public class Modality extends JSONParse {

	public Modality() {
	}

	public JSONObject GetOrganizations() {
		return getJSONFromUrl("GetOrganizations");
	}

	public JSONObject GetOragnizationalUnits() {
		return getJSONFromUrl("GetOragnizationalUnits");
	}

	public JSONObject GetLocations() {
		return getJSONFromUrl("GetLocations");
	}

	public JSONObject GetModalities() {
		return getJSONFromUrl("GetModalities");
	}

	public JSONObject GetModalityGroups() {
		return getJSONFromUrl("GetModalityGroups");
	}

	public JSONObject GetEquipments() {
		return getJSONFromUrl("GetEquipments");
	}

	public JSONObject GetMaintenanceProviders() {
		return getJSONFromUrl("GetMaintenanceProviders");
	}

	public JSONObject GetMaintenanceContracts() {
		return getJSONFromUrl("GetMaintenanceContracts");
	}

	public JSONObject GetTimelineByModalityGroup(String modGroupId) {
		return getJSONFromUrl("GetTimelineByModalityGroup&param1=" + modGroupId);
	}

	public JSONObject GetTimelineByEquipment(String equipmentId) {
		return getJSONFromUrl("GetTimelineByEquipment&param1=" + equipmentId);
	}

}
