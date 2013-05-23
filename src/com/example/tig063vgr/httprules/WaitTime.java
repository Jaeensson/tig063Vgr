package com.example.tig063vgr.httprules;

import org.json.JSONObject;

import com.example.tig063vgr.JSONParse;

public class WaitTime extends JSONParse {

	public WaitTime() {
	}

	public JSONObject GetOrganizations() {
		return getJSONFromUrl("GetOrganizations");
	}

	public JSONObject GetOrgnizationalUnits() {
		return getJSONFromUrl("GetOrgnizationalUnits");
	}

	public JSONObject GetStudyTypes() {
		return getJSONFromUrl("GetStudyTypes");
	}

	public JSONObject GetStudies() {
		return getJSONFromUrl("GetStudies");
	}

	public JSONObject NearLatitudeLongitudeByStudy(String studyId,
			String latitude, String longitude, String radiusInMetres) {
		return getJSONFromUrl("NearLatitudeLongitudeByStudy&param1=" + studyId
				+ " &param2=" + latitude + "&param3=" + longitude + "&param4="
				+ radiusInMetres);
	}

}
