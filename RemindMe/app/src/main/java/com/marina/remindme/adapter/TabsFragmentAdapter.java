package com.marina.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.marina.remindme.fragment.AbstractTabFragment;
import com.marina.remindme.fragment.BirthdaysFragment;
import com.marina.remindme.fragment.HistoryFragment;
import com.marina.remindme.fragment.IdeasFragment;
import com.marina.remindme.fragment.TodoFragment;

import java.util.ArrayList;

/**
 * Created by Marina on 12.08.2016.
 */
public class TabsFragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        tabs = new ArrayList<>();
        initTabs(context);
    }

    private void initTabs(Context context) {
        tabs.add(HistoryFragment.getInstance(context));
        tabs.add(IdeasFragment.getInstance(context));
        tabs.add(TodoFragment.getInstance(context));
        tabs.add(BirthdaysFragment.getInstance(context));
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
