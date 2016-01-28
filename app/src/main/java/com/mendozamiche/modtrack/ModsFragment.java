/**
 * Created by Michelle Mendoza on 2016-01-28.
 * Copyright (c) 2016 Nudge Rewards
 */
package com.mendozamiche.modtrack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ModsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mods_list, container, false);
    }
}
