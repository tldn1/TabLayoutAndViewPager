package com.tldn1.tablayoutandviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.tldn1.tablayoutandviewpager.adapters.ViewPagerAdapter;
import com.tldn1.tablayoutandviewpager.fragments.HomeFragment;
import com.tldn1.tablayoutandviewpager.fragments.ListFragment;
import com.tldn1.tablayoutandviewpager.fragments.SearchFragment;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addTab(new HomeFragment(),"Home");
        adapter.addTab(new ListFragment(),"List");
        adapter.addTab(new SearchFragment(),"Search");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
