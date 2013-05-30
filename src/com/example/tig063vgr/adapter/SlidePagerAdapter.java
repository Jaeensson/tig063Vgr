package com.example.tig063vgr.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tig063vgr.fragments.FragmentConfirm;
import com.example.tig063vgr.fragments.FragmentFel;
import com.example.tig063vgr.fragments.FragmentMaskin;

public class SlidePagerAdapter extends FragmentPagerAdapter {
	Fragment fragment = null;

	public SlidePagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {

		// TODO: Sortera ange vilken xml som skall inflates i En fragmentklass.
		// Skicka
		// med position och gör en switch baserat på position
		switch (position) {
		case 0:
			return new FragmentMaskin();
		case 1:
			return new FragmentFel();
		case 2:
			return new FragmentConfirm();
		}
		return fragment;
	}

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return "MASKININFO";
		case 1:
			return "FELRAPPORT";
		case 2:
			return "BEKRÄFTA";
		}
		return null;
	}

}
