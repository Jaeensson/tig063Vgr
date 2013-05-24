package com.example.tig063vgr;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {
	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle saveInstances) {
		super.onCreate(saveInstances);
		addPreferencesFromResource(R.xml.settings);
	}

}
