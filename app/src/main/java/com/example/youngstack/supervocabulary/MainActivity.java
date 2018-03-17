package com.example.youngstack.supervocabulary;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public TabLayout tabLayout;
    public ViewPager viewPager;
    public ActivitiesFragment activitiesFragment;
    public HistoryFragment historyFragment;
    public MessagesFragment messagesFragment;
    public MybooksFragement mybooksFragement;
    public SquareFragment squareFragment;
    public List<Fragment> fragments;
    public MViewPagerAdapter mViewPagerAdapter;
    public List<String> titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        tabLayout= findViewById(R.id.tab_layout);
        viewPager= findViewById(R.id.view_pager);
        activitiesFragment =new ActivitiesFragment();
        historyFragment =new HistoryFragment();
        messagesFragment=new MessagesFragment();
        mybooksFragement =new MybooksFragement();
        squareFragment=new SquareFragment();
        fragments=new ArrayList<>();
        fragments.add(activitiesFragment);
        fragments.add(historyFragment);
        fragments.add(messagesFragment);
        fragments.add(mybooksFragement);
        fragments.add(squareFragment);
        titles=new ArrayList<>();
        titles.add("Activities");
        titles.add("Square");
        titles.add("MyBooks");
        titles.add("History");
        titles.add("Messages");
        tabLayout.addTab(tabLayout.newTab().setText("Activities"));
        tabLayout.addTab(tabLayout.newTab().setText("Square"));
        tabLayout.addTab(tabLayout.newTab().setText("MyBooks"));
        tabLayout.addTab(tabLayout.newTab().setText("History"));
        tabLayout.addTab(tabLayout.newTab().setText("Messages"));
        mViewPagerAdapter=new MViewPagerAdapter(getSupportFragmentManager(),fragments,titles);
        viewPager.setAdapter(mViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(mViewPagerAdapter);
    }
}
