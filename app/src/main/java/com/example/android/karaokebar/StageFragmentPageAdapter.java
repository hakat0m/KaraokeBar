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
        switch (position) {
            case 0:
                return new NowOnStageFragment();
            case 1:
                return new ChooseSongFragment();
            case 2:
                return new ProfilesFragment();
        }
        return null;
    }

    @Override
    //Set number of displayed tabs
    public int getCount() {return 3;}
}
