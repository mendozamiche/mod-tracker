/**
 * Created by Michelle Mendoza on 2016-01-28.
 * Copyright (c) 2016 Nudge Rewards
 */
package com.mendozamiche.modtrack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class StatusFragment extends Fragment {
    private static final int ITEMS_COUNT = 3;
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.status_fragment_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.initRecyclerView();
    }

    private void initRecyclerView() {
        this.recyclerView = (RecyclerView) this.getView().findViewById(R.id.recycler_view);
        this.recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        this.recyclerView.setLayoutManager(layoutManager);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Check oil");
        for (int i = 0; i < ITEMS_COUNT; i++) {
            arrayList.add("Status Item " + (i + 1));
        }

        adapter = new RecyclerAdapter(arrayList);
        this.recyclerView.setAdapter(adapter);
    }

    private class RecyclerAdapter extends RecyclerView.Adapter<StatusViewHolder> {
        ArrayList<String> mItems = new ArrayList<>();

        public RecyclerAdapter(ArrayList<String> mItems) {
            this.mItems = mItems;
        }

        @Override
        public StatusViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new StatusViewHolder(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        }

        @Override
        public void onBindViewHolder(StatusViewHolder viewHolder, int i) {
            viewHolder.statusItem.setText(mItems.get(i));
        }

        @Override
        public int getItemCount() {
            return mItems.size();
        }

        public ArrayList<String> getItems() {
            return this.mItems;
        }
    }

    private class StatusViewHolder extends RecyclerView.ViewHolder {

        private TextView statusItem;

        public StatusViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.status_item, parent, false));
            statusItem = (TextView) itemView.findViewById(R.id.status_item_textview);
        }
    }

    public void addStatus(String status) {
        ArrayList<String> items = this.adapter.getItems();
        items.add(status);
        this.adapter.notifyItemInserted(items.size() - 1);
    }
}
