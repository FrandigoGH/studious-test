package com.example.paco.diffviewpage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class DiffViewPageActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diff_view_page);

        ViewPager pager=(ViewPager)findViewById(R.id.pager);
        pager.setAdapter(new SampleAdapter(getSupportFragmentManager()));
    }
}
