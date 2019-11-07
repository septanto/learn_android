package com.doku.coolapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ProfileAdapter extends FragmentPagerAdapter {

    private final String[] CONTENT = new String[] {"Favorit", "Promo"};

    public ProfileAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch
    }

    @Override
    public int getCount() {
        return 0;
    }
}
