package com.example.android.karaokebar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class StageFragmentPageAdapter extends FragmentPagerAdapter {

    public StageFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NowOnStageFragment();

        } else if (position == 1) {
            return new ChooseSongFragment();

        } else if (position == 2) {
            return new ProfilesFragment();

        } else return new NowOnStageFragment();
    }

    @Override
    //Set number of displayed tabs
    public int getCount() {return 3;}
}
