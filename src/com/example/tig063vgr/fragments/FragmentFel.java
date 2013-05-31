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
					new Runnable() {
                        @Override
                        public void run() {
                            record.startRecording();
                        }
                    }.run();

				ProgressDialog p = new ProgressDialog(getActivity());
                p.setTitle("VGR");
                p.setMessage("Spelar in");
                p.setCancelable(true);
                p.setButton(DialogInterface.BUTTON_NEGATIVE, "Stopp", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        record.stopRecording();
                        dialogInterface.dismiss();
                    }
                });
                p.show();
			}
		});

		return rootView;

	}

	public void btnCameraClick(View v) {
		Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		this.startActivityForResult(camera, 1337);
	}
}