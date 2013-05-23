package com.example.tig063vgr.httprules;

import org.json.JSONObject;

import com.example.tig063vgr.JSONParse;

public class Statistics extends JSONParse {

	public Statistics() {
	}

	public JSONObject GetOrganizations() {
		return getJSONFromUrl("GetOrganizations");
	}

	public JSONObject GetOrgnizationalUnits() {
		return getJSONFromUrl("GetOrgnizationalUnits");
	}

	public JSONObject GetDataPointsByHsaIdentitiesAndDateInterval(String hsaId,
			String startDate, String endDate) {
		return getJSONFromUrl("GetDataPointsByHsaIdentitiesAndDateInterval&param1="
				+ hsaId + "&param2=" + startDate + "&param3=" + endDate);
	}

	public JSONObject GetDataPointsByHsaIdentities(String hsaId) {
		return getJSONFromUrl("GetDataPointsByHsaIdentities&param1=" + hsaId);
	}
}
