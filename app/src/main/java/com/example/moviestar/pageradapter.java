package com.example.moviestar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class pageradapter extends FragmentPagerAdapter {

    private int numOfTabs;

    pageradapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new MemoryFragment();
            case 2:
                return new PicturequizzFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {


            case 0:
                return "Home";
            case 1:
                return "Memory";
            case 2:
                return "Picturepuzzle";
            default:
                return null;
        }
    }
}