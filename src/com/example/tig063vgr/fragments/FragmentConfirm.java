package com.example.tig063vgr.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tig063vgr.R;

public class FragmentConfirm extends Fragment {

	public FragmentConfirm() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_confirm, container,
				false);

		return rootView;
	}
}