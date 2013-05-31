package com.example.tig063vgr;

import java.io.File;
import java.io.IOException;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;

public class SoundRecorder {
	MediaRecorder recorder;
	File audiofile = null;
	private static final String TAG = "SoundRecordingActivity";
	Context context;

	public SoundRecorder(Context ctx) {
		context = ctx;
	}

	public void startRecording() throws IOException {

		File sampleDir = Environment.getExternalStorageDirectory();
		try {
			audiofile = File.createTempFile("sound", ".3gp", sampleDir);
		} catch (IOException e) {
			Log.e(TAG, "sdcard access error");
			return;
		}
		recorder = new MediaRecorder();
		recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
		recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
		recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
		recorder.setOutputFile(audiofile.getAbsolutePath());
		recorder.prepare();
		recorder.start();
	}

	public void stopRecording() {
		recorder.stop();
		recorder.release();
		addRecordingToMediaLibrary();
	}

	protected void addRecordingToMediaLibrary() {
		ContentValues values = new ContentValues(4);
		long current = System.currentTimeMillis();
		values.put(MediaStore.Audio.Media.TITLE, "audio" + audiofile.getName());
		values.put(MediaStore.Audio.Media.DATE_ADDED, (int) (current / 1000));
		values.put(MediaStore.Audio.Media.MIME_TYPE, "audio/3gpp");
		values.put(MediaStore.Audio.Media.DATA, audiofile.getAbsolutePath());
		ContentResolver contentResolver = context.getContentResolver();

		Uri base = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
		Uri newUri = contentResolver.insert(base, values);

		context.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
				newUri));
	}
}
