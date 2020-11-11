package com.example.giaodiengiaohangfoody;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentBanChay extends Fragment {
    private  View mRootView;
    ListView listViewGanToi;
    GanToiListViewBaseAdapter listViewBaseAdapterGanToi;
    ArrayList<GanToiListViewBean> arrayListGanToi;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_banchay,container,false);
        listViewGanToi = (ListView)mRootView.findViewById(R.id.lvBanChay);
        arrayListGanToi = new ArrayList<>();
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.trasua, "Trà sữa Money", "15.000đ", "10km", "15'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.dabao, "Đá bào sôcôla", "20.000đ", "1km", "15'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.gantoi_lau, "Lẩu thịt bò", "180.000đ", "7.5km", "20'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.cua, "Cua hấp", "40.000đ", "3.67km", "10'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.bap, "Bắp rang", "10.000đ", "5km", "5'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.trasua, "Trà sữa Money", "15.000đ", "10km", "15'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.dabao, "Đá bào sôcôla", "20.000đ", "1km", "15'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.gantoi_lau, "Lẩu thịt bò", "180.000đ", "7.5km", "20'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.cua, "Cua hấp", "40.000đ", "3.67km", "10'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.bap, "Bắp rang", "10.000đ", "5km", "5'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.dabao, "Đá bào sôcôla", "20.000đ", "1km", "15'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.gantoi_lau, "Lẩu thịt bò", "180.000đ", "7.5km", "20'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.cua, "Cua hấp", "40.000đ", "3.67km", "10'"));
        arrayListGanToi.add(new GanToiListViewBean(R.drawable.bap, "Bắp rang", "10.000đ", "5km", "5'"));
        listViewBaseAdapterGanToi = new GanToiListViewBaseAdapter(arrayListGanToi,getActivity());
        listViewGanToi.setAdapter(listViewBaseAdapterGanToi);
        return mRootView;
    }
}
