package com.example.tig063vgr.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import com.example.tig063vgr.Equipment;
import com.example.tig063vgr.R;
import com.example.tig063vgr.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

@SuppressLint("ValidFragment")
public class FragmentMaskin extends Fragment {
    private Equipment equipment;
    private Button btnNextMaskin;

    public FragmentMaskin(Equipment e) {
        equipment = e;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_maskin, container,
                false);

        Random r = new Random();
        // Init Vy and header
        ListView rapportList = (ListView) rootView
                .findViewById(R.id.listRapport);
        View header = inflater.inflate(R.layout.rapport_listheader, null);
        rapportList.addHeaderView(header);

        // Populate hashmap
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> item = new HashMap<String, String>();
        item.put("large", "Utrustning ID");
        item.put("small", equipment.getId());
        list.add(item);

        item = new HashMap<String, String>();
        item.put("large", "Namn");
        item.put("small", equipment.getName());
        list.add(item);

        item = new HashMap<String, String>();
        item.put("large", "Tillverkare");
        String[] menyItems = {"GE Med.", "Scan OD", "Medicine Radio",
                "Hospital Radiology Medicine"};

        item.put("small", menyItems[r.nextInt(menyItems.length)]);
        list.add(item);

        item = new HashMap<String, String>();
        item.put("large", "Plats");
        item.put("small", equipment.getLocationId());
        list.add(item);

        // TODO: Hämta riktig status
        item = new HashMap<String, String>();
        item.put("large", "Status");
        item.put("small", "Påbörjad");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("large", "Modality Group");
        item.put("small", equipment.getModalityGroupId());
        list.add(item);

        ListViewAdapter adapter = new ListViewAdapter(getActivity(), list);
        rapportList.setAdapter(adapter);

        return rootView;
    }
}