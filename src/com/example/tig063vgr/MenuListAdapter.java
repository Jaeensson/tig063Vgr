package com.example.tig063vgr;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuListAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<MenuListItem> data;
    private static LayoutInflater inflater = null;

    public MenuListAdapter(Activity a, ArrayList<MenuListItem> d) {
        super();
        activity = a;
        data = d;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    public MenuListItem getItem(int position) {
        return data.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.listitem_menu, null);

        TextView txt = (TextView) vi.findViewById(R.id.menuText);
        ImageView img = (ImageView) vi.findViewById(R.id.menuImage);
        View asdasd = parent.findViewById(R.id.menuText);
        MenuListItem i = data.get(position);
        txt.setText(i.getText());
        img.setImageResource(i.getResId());
        return vi;
    }
}
