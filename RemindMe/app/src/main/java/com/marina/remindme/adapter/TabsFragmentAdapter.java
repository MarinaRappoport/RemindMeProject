package com.marina.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.marina.remindme.dto.RemindDTO;
import com.marina.remindme.fragment.AbstractTabFragment;
import com.marina.remindme.fragment.BirthdaysFragment;
import com.marina.remindme.fragment.HistoryFragment;
import com.marina.remindme.fragment.IdeasFragment;
import com.marina.remindme.fragment.TodoFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marina on 12.08.2016.
 */
public class TabsFragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<AbstractTabFragment> tabs;
    private Context context;
    private List<RemindDTO> data;
    private HistoryFragment historyFragment;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        data = new ArrayList<>();
        tabs = new ArrayList<>();
        initTabs(context);
    }

    private void initTabs(Context context) {
        historyFragment = HistoryFragment.getInstance(context, data);
        tabs.add(historyFragment);
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

    public void setData(List<RemindDTO> data) {
        this.data = data;
        historyFragment.refreshData(data);
    }
}
