package com.example.android.oldcitytour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Old City", "Liberty Bell", "Elfreth's Alley","President's House" };

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OldCityFragment();
        } else if (position == 1){
            return new LibertyFragment();
        } else if(position == 2 ){
            return new ElfretAlleyFragment();
        }else {
            return new PresidentsHouseFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
