package com.example.youngstack.supervocabulary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by youg stack on 2018/3/17.
 */

public class MViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments;
    private List<String> mTitles;

    public MViewPagerAdapter(FragmentManager supportFragmentManager, List<Fragment> fragments, List<String> titles) {
        super(supportFragmentManager);
        mFragments=fragments;
        mTitles=titles;
    }

    @Override
    public Fragment getItem(int position){
        return mFragments.get(position);
    }
    @Override
    public int getCount(){
        return mFragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position){
        return mTitles.get(position);
    }
}
