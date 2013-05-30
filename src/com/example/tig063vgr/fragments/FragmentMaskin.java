package com.example.tig063vgr.fragments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tig063vgr.R;
import com.example.tig063vgr.adapter.ListViewAdapter;
import com.example.tig063vgr.httprules.Modality;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FragmentMaskin extends Fragment {

	public FragmentMaskin() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_maskin, container,
				false);
        Modality modality = new Modality(getActivity());
        JSONObject equipment = null;
        try {
            JSONArray result = modality.GetEquipments().get();
            Random r = new Random();
            equipment  = result.getJSONObject(r.nextInt(result.length()));


            // Init Vy and header
            ListView rapportList = (ListView) rootView
                    .findViewById(R.id.listRapport);
            View header = inflater.inflate(R.layout.rapport_listheader, null);
            rapportList.addHeaderView(header);

            // Populate hashmap
            ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
            HashMap<String, String> item = new HashMap<String, String>();
            item.put("large", "Utrustning ID");
            item.put("small", equipment.getString("Id"));
            list.add(item);

            item = new HashMap<String, String>();
            item.put("large", "Namn");
            item.put("small", equipment.getString("Name"));
            list.add(item);

            item = new HashMap<String, String>();
            item.put("large", "Tillverkare");
            String[] menyItems = { " Simens", "Nokia", "Volvo", "SAAB", "Intel",
                    "AMD", "Nvidia", "LG", "Apple", "Dell", "Microsoft", "Google",
                    "NASA" };

            item.put("small", menyItems[r.nextInt(menyItems.length)]);
            list.add(item);

            item = new HashMap<String, String>();
            item.put("large", "Plats");
            item.put("small", equipment.getString("LocationId"));
            list.add(item);


            //TODO: Hämta riktig status
            item = new HashMap<String, String>();
            item.put("large", "Status");
            item.put("small", "Påbörjad");
            list.add(item);

            item = new HashMap<String, String>();
            item.put("large", "Modality Group");
            item.put("small", equipment.getString("ModalityGroupId"));
            list.add(item);

            ListViewAdapter adapter = new ListViewAdapter(getActivity(), list);
            rapportList.setAdapter(adapter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
		return rootView;
	}
}