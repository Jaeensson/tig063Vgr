package com.example.tig063vgr.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tig063vgr.R;

public class FragmentFel extends Fragment {

	public FragmentFel() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_felrapport,
				container, false);
		
//		Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spinner2);
//		List<String> list = new ArrayList<String>();
//		list.add("list 3");
//		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(
//				getActivity(), android.R.layout.simple_spinner_item, list);
//		dataAdapter
//				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		spinner2.setAdapter(dataAdapter);
		return rootView;

	}

}