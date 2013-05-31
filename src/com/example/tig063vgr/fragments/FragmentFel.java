package com.example.tig063vgr.fragments;

import java.io.IOException;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.tig063vgr.R;
import com.example.tig063vgr.SoundRecorder;

public class FragmentFel extends Fragment {
	SoundRecorder record;

	public FragmentFel() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_felrapport,
				container, false);

		ImageButton micBtn = (ImageButton) rootView
				.findViewById(R.id.buttonMic);

		micBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				record = new SoundRecorder(getActivity()
						.getApplicationContext());

				try {
					record.startRecording();
				} catch (IOException e) {
					e.printStackTrace();
				}
				ProgressDialog p = ProgressDialog.show(getActivity(), "VGR",
						"Spelar in", true, true,
						new DialogInterface.OnCancelListener() {

							@Override
							public void onCancel(DialogInterface dialogInterface) {
								record.stopRecording();
								dialogInterface.dismiss();
							}
						});
			}
		});
		// Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spinner2);
		// List<String> list = new ArrayList<String>();
		// list.add("list 3");
		// ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(
		// getActivity(), android.R.layout.simple_spinner_item, list);
		// dataAdapter
		// .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// spinner2.setAdapter(dataAdapter);
		return rootView;

	}

	public void btnCameraClick(View v) {
		Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		this.startActivityForResult(camera, 1337);
	}

	public void btnMicClick(View v) {

	}
}