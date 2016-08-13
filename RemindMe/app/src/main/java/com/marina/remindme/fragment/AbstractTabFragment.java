package com.marina.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Marina on 13.08.2016.
 */
public abstract class AbstractTabFragment extends Fragment {
    protected View view;

    private Context context;
    private String title;


    public void setContext(Context context) {
        this.context = context;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
