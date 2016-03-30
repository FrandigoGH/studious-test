package com.example.paco.diffviewpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SampleAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;
    public SampleAdapter(FragmentManager mgr) {
        super(mgr);
    }

    @Override
    public int getCount() {
        return (NUM_ITEMS);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return EditorFragment.newInstance(position);
        } else if (position == 1) {
            return EditorFragment.newInstance(position);
        } else
            return SwitchFragment.newInstance(position);

    }
}
