package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gongkai on 2017/1/15.
 */

public class TourFragmentPageAdapter extends FragmentPagerAdapter {

    private String tabTitles[];

    public TourFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setTabTitles(String []titles){
        tabTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new OrientalPearlFragment();
        else if (position == 1)
            return new JinjiangParkFragment();
        else if (position == 2)
            return new ShanghaiStadiumFragment();
        else if (position == 3)
            return new DisneyFragment();
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
