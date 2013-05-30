package com.example.tig063vgr.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tig063vgr.MenuListItemCusomClass;
import com.example.tig063vgr.R;

public class MenuListAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<MenuListItemCusomClass> data;
    private static LayoutInflater inflater = null;

    public MenuListAdapter(Activity a, ArrayList<MenuListItemCusomClass> d) {
        super();
        activity = a;
        data = d;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    public MenuListItemCusomClass getItem(int position) {
        return data.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.sliding_menu_item, null);

        TextView txt = (TextView) vi.findViewById(R.id.menuText);
        ImageView img = (ImageView) vi.findViewById(R.id.menuImage);
        MenuListItemCusomClass i = data.get(position);
        txt.setText(i.getText());
        img.setImageResource(i.getResId());
        return vi;
    }
}
