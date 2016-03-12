/**
 * Created by Michelle Mendoza on 2016-01-28.
 * Copyright (c) 2016 Nudge Rewards
 */
package com.mendozamiche.modtrack;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

public class ModsFormView extends LinearLayout {
    public ModsFormView(Context context) {
        super(context);
        this.init();
    }

    private void init() {
        View.inflate(this.getContext(), R.layout.mods_form, this);
    }
}
