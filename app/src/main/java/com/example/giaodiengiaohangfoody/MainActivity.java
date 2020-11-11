package com.example.giaodiengiaohangfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter_khuyenmai.ItemClickListener  {


    ListView lv1;
    GanToiListViewBaseAdapter listViewBaseAdapterGanToi;
    ArrayList<GanToiListViewBean> arrayListGanToi;
    private MyRecyclerViewAdapter_khuyenmai adapter_KHUYENMAI;
    List<RecyclerViewBean> recyclerViewBeanList, recyclerViewBeanList_1 ;
    private MyRecyclerViewAdapter_monan adapter_MONAN;
    private AdapterFragment adapterFragment;
    ViewPager viewPager;
    TabLayout tabLayout;
    ArrayList<String> arrayList, arrayList_1;
    Spinner spinnerChiNhanh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitView();
        viewPagerAndTablayout();
        dataSpinner();
        khuyenMAi();
        monAn();
        AdapterFragment adapterViewPagerTrangChu = new AdapterFragment(getSupportFragmentManager());


    }
    private void innitView(){
        spinnerChiNhanh = (Spinner)findViewById(R.id.spChiNhanh);
        viewPager = (ViewPager)findViewById(R.id.viewpagerMonAn);
        tabLayout = (TabLayout)findViewById(R.id.tablayoutMonAn);

    }
    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter_KHUYENMAI.getItem(position) + " on item position " + position, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "You clicked " + adapter_MONAN.getItem(position) + " on item position " + position, Toast.LENGTH_SHORT).show();
    }

    private void dataSpinner(){
        arrayList = new ArrayList<String>();
        arrayList.add("Đà Nẵng");
        arrayList.add("HCM");
        arrayList.add("Hà Nội");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayList);
        spinnerChiNhanh.setAdapter(arrayAdapter);
    }

    private void viewPagerAndTablayout(){
        adapterFragment = new AdapterFragment(getSupportFragmentManager());
        viewPager.setAdapter(adapterFragment);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void GanToi(){

    }

    private void khuyenMAi(){
        recyclerViewBeanList = new ArrayList<>();
        recyclerViewBeanList.add(new RecyclerViewBean(R.drawable.sieusale_2,""));
        recyclerViewBeanList.add(new RecyclerViewBean(R.drawable.sieusale,""));
        recyclerViewBeanList.add(new RecyclerViewBean(R.drawable.sieusale_2,""));
        recyclerViewBeanList.add(new RecyclerViewBean(R.drawable.sieusale,""));
        recyclerViewBeanList.add(new RecyclerViewBean(R.drawable.sieusale_2,""));
        recyclerViewBeanList.add(new RecyclerViewBean(R.drawable.sieusale,""));
        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvKhuyenMai);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        adapter_KHUYENMAI = new MyRecyclerViewAdapter_khuyenmai(this, recyclerViewBeanList);
        adapter_KHUYENMAI.setClickListener(this);
        recyclerView.setAdapter(adapter_KHUYENMAI);
    }

    private void monAn(){
        recyclerViewBeanList_1 = new ArrayList<>();
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.pho,"Phở"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.lau,"Lẩu"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.comhop,"Cơm hộp"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.sup,"Súp"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.sushi,"Sushi"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.pho,"Phở"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.lau,"Lẩu"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.comhop,"Cơm hộp"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.sup,"Súp"));
        recyclerViewBeanList_1.add(new RecyclerViewBean(R.drawable.sushi,"Sushi"));
        // set up the RecyclerView
        RecyclerView recyclerView_1 = findViewById(R.id.rvMonAn);
        recyclerView_1.setHasFixedSize(true);
        LinearLayoutManager horizontalLayoutManager_1
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_1.setLayoutManager(horizontalLayoutManager_1);
        adapter_MONAN = new MyRecyclerViewAdapter_monan(this, recyclerViewBeanList_1);
        adapter_MONAN.setClickListener(this);
        recyclerView_1.setAdapter(adapter_MONAN);
    }
}
