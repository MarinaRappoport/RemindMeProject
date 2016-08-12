package com.marina.remindme.fragment;

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
public class ExampleFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example;

    private View view;

    public static ExampleFragment getInstance(){
        ExampleFragment fragment = new ExampleFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
