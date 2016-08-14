package com.marina.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marina.remindme.R;
import com.marina.remindme.adapter.RemindListAdapter;
import com.marina.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marina on 12.08.2016.
 */
public class HistoryFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;

    private List<RemindDTO> data;
    private RemindListAdapter adapter;

    public static HistoryFragment getInstance(Context context, List<RemindDTO> data){
        HistoryFragment fragment = new HistoryFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        fragment.setData(data);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        adapter = new RemindListAdapter(data);
        recyclerView.setAdapter(adapter);


        return view;
    }

//    private List<RemindDTO> createMockData() {
//        List<RemindDTO> data = new ArrayList<>();
//        data.add(new RemindDTO("Item1"));
//        data.add(new RemindDTO("Item2"));
//        data.add(new RemindDTO("Item3"));
//        data.add(new RemindDTO("Item4"));
//        data.add(new RemindDTO("Item5"));
//        data.add(new RemindDTO("Item6"));
//
//        return data;
//    }

    public void setData(List<RemindDTO> data) {
        this.data = data;
    }

    public void refreshData(List<RemindDTO> data){
        adapter.setData(data);
        adapter.notifyDataSetChanged();
    }
}
