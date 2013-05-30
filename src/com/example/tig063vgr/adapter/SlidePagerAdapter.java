package com.example.tig063vgr.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tig063vgr.fragments.FragmentConfirm;
import com.example.tig063vgr.fragments.FragmentFel;
import com.example.tig063vgr.fragments.FragmentMaskin;

public class SlidePagerAdapter extends FragmentPagerAdapter {

	public SlidePagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {

		switch (position) {
		case 0:
			return new FragmentMaskin();
		case 1:
			return new FragmentFel();
		case 2:
			return new FragmentConfirm();
		}
		return null;
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
