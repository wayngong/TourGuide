package com.example.android.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // ViewPagerAdapter
        TourFragmentPageAdapter tourAdapter = new TourFragmentPageAdapter(getSupportFragmentManager());
        String[] tabTitles = new String[]{
                this.getString(R.string.tab_title_1),
                this.getString(R.string.tab_title_3),
                this.getString(R.string.tab_title_2),
                this.getString(R.string.tab_title_4),
        };
        tourAdapter.setTabTitles(tabTitles);

        viewPager.setAdapter(tourAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
