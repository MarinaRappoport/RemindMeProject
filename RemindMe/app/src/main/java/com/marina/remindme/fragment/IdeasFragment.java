package com.marina.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marina.remindme.R;

/**
 * Created by Marina on 12.08.2016.
 */
public class IdeasFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static IdeasFragment getInstance(Context context){
        IdeasFragment fragment = new IdeasFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_ideas));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
