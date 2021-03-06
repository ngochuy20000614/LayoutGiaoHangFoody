package com.itschool.checongbinh.foody.View.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.itschool.checongbinh.foody.Controller.OdauController;
import com.itschool.checongbinh.foody.Model.QuanAnModel;
import com.itschool.checongbinh.foody.R;

import java.util.List;

/**
 * Created by Binh on 4/13/17.
 */

public class OdauFragment extends Fragment {
    OdauController odauController;
    RecyclerView recyclerOdau;
    ProgressBar progressBar;
    SharedPreferences sharedPreferences;
    NestedScrollView nestedScrollView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_odau,container,false);
        recyclerOdau = (RecyclerView) view.findViewById(R.id.recyclerOdau);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBarODau);
        nestedScrollView = (NestedScrollView) view.findViewById(R.id.nestScrollViewODau);

        sharedPreferences = getContext().getSharedPreferences("toado", Context.MODE_PRIVATE);
        Location vitrihientai = new Location("");
        vitrihientai.setLatitude(Double.parseDouble(sharedPreferences.getString("latitude","0")));
        vitrihientai.setLongitude(Double.parseDouble(sharedPreferences.getString("longitude","0")));

        odauController = new OdauController(getContext());


        odauController.getDanhSachQuanAnController(getContext(),nestedScrollView,recyclerOdau,progressBar,vitrihientai);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();


    }
}
