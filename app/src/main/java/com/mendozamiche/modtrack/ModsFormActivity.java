/**
 * Created by Michelle Mendoza on 2016-01-28.
 * Copyright (c) 2016 Nudge Rewards
 */
package com.mendozamiche.modtrack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ModsFormActivity extends AppCompatActivity {
    private ModsFormView modsFormView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.modsFormView = new ModsFormView(this);
        this.setContentView(this.modsFormView);
    }
}
