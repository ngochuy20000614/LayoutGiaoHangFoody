package com.example.giaodiengiaohangfoody;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class AdapterFragment extends FragmentStatePagerAdapter {
    String list[] ={"Gần tới","Bán chạy","Đánh giá","Giao nhanh"};
    FragmentGanToi fragmentGanToi;
    FragmentBanChay fragmentBanChay;
    FragmentDanhGia fragmentDanhGia;
    FragmentGiaoNhanh fragmentGiaoNhanh;
    public AdapterFragment(@NonNull FragmentManager fm) {
        super(fm);
        fragmentGanToi = new FragmentGanToi();
        fragmentBanChay = new FragmentBanChay();
        fragmentDanhGia = new FragmentDanhGia();
        fragmentGiaoNhanh = new FragmentGiaoNhanh();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return fragmentGanToi;
        }else if(position == 1){
            return fragmentBanChay;
        }else if(position == 2){
            return fragmentDanhGia;
        }else if(position == 3){
            return fragmentGiaoNhanh;
        }else{
        }
        return null;
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list[position];
    }
}
