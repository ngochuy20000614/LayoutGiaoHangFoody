package com.example.giaodiengiaohangfoody;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentRecycleView extends Fragment {
    private View view;
    RecyclerView recyclerView;
    private AdapterRecyclerView ganToiListViewBaseAdapter;
    ArrayList<GanToiListViewBean> ganToiListViewBeans;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recycleview,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rc_gantoi);
        ganToiListViewBeans = new ArrayList<>();
        ganToiListViewBeans.add(new GanToiListViewBean(R.drawable.sieusale_2,"123","123","123",""));
        ganToiListViewBeans.add(new GanToiListViewBean(R.drawable.sieusale_2,"123","123","123",""));
        ganToiListViewBeans.add(new GanToiListViewBean(R.drawable.sieusale_2,"","","",""));
        ganToiListViewBeans.add(new GanToiListViewBean(R.drawable.sieusale_2,"","","",""));
        ganToiListViewBeans.add(new GanToiListViewBean(R.drawable.sieusale_2,"","","",""));
        ganToiListViewBeans.add(new GanToiListViewBean(R.drawable.sieusale_2,"","","",""));
        ganToiListViewBeans.add(new GanToiListViewBean(R.drawable.sieusale_2,"","","",""));
        ganToiListViewBeans.add(new GanToiListViewBean(R.drawable.sieusale_2,"","","",""));
        recyclerView.setHasFixedSize(true);
        // set up the RecyclerView
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        ganToiListViewBaseAdapter = new AdapterRecyclerView(getActivity(),ganToiListViewBeans);
        recyclerView.setAdapter(ganToiListViewBaseAdapter);
        return view;
    }
}
