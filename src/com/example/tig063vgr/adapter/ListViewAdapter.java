package com.example.tig063vgr.adapter;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tig063vgr.R;

//Adapterklass för listan på rapportsidan
public class ListViewAdapter extends BaseAdapter {

	private Activity activity;
	private ArrayList<HashMap<String, String>> data;
	private static LayoutInflater inflater;

    //Konstruktor som initierar adaptern
	public ListViewAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
        super();
		activity = a;
		data = d;
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

    //Ärvd funktion från superklassen
	public int getCount() {
		return data.size();
	}
    //Ärvd funktion från superklassen
    //Fuskar genom att returnera positionen eftersom dessa metoder kommer att vara oanvända
	public Object getItem(int position) {
		return position;
	}
    //Ärvd funktion från superklassen,
    //Fuskar genom att returnera positionen eftersom dessa metoder kommer att vara oanvända
	public long getItemId(int position) {
		return position;
	}


	public View getView(int position, View convertView, ViewGroup parent) {
		View vi = convertView;
        //Väljer den layout vi gjort för varjer rad i listan
		if (convertView == null)
			vi = inflater.inflate(R.layout.rapport_menu_item, null);

		TextView large = (TextView) vi.findViewById(R.id.txtLarge);
		TextView small = (TextView) vi.findViewById(R.id.txtSmall);

		HashMap<String, String> song = new HashMap<String, String>();
		song = data.get(position);

        //Ge texterna rätt värden.
		large.setText(song.get("large"));
		small.setText(song.get("small"));
		return vi;
	}
}
