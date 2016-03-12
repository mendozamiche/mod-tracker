/**
 * Created by Michelle Mendoza on 2016-01-28.
 * Copyright (c) 2016 Nudge Rewards
 */
package com.mendozamiche.modtrack;

import android.content.Context;
import android.content.SharedPreferences;

public class UserPrefs {
    private static final String PREFS_FILENAME = "UserPrefs";
    public static final String NUM_STATUS_ITEMS = "NUM_STATUS_ITEMS";
    public static final String STATUS_ITEM_KEY = "STATUS_ITEM";
    private final SharedPreferences userPrefs;

    public UserPrefs(Context context) {
        this.userPrefs = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE);
    }

    public UserPrefs(SharedPreferences userPrefs) {
        this.userPrefs = userPrefs;
    }

    public boolean deletePrefs() {
        SharedPreferences.Editor editor = this.userPrefs.edit();
        editor.clear();
        return editor.commit();
    }

    private boolean remove(String key) {
        SharedPreferences.Editor editor = this.userPrefs.edit();
        editor.remove(key);
        return editor.commit();
    }

    private boolean delete(String key) {
        SharedPreferences.Editor editor = this.userPrefs.edit();
        editor.remove(key);
        return editor.commit();
    }

    public boolean set(String key, String value) {
        SharedPreferences.Editor editor = this.userPrefs.edit();
        editor.putString(key, value);
        return editor.commit();
    }

    public boolean set(String key, int value) {
        SharedPreferences.Editor editor = this.userPrefs.edit();
        editor.putInt(key, value);
        return editor.commit();
    }

    private boolean set(String key, long value) {
        SharedPreferences.Editor editor = this.userPrefs.edit();
        editor.putLong(key, value);
        return editor.commit();
    }

    private boolean set(String key, boolean value) {
        SharedPreferences.Editor editor = this.userPrefs.edit();
        editor.putBoolean(key, value);
        return editor.commit();
    }

    public int getNumItems(){
        return this.userPrefs.getInt(NUM_STATUS_ITEMS, 0);
    }

    public String getStatusItemForKey(int i) {
        String key = STATUS_ITEM_KEY + i;
        return this.userPrefs.getString(key, "");
    }
}
