package com.example.giaodiengiaohangfoody;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter_monan extends RecyclerView.Adapter<MyRecyclerViewAdapter_monan.ViewHolder> {

    private List<RecyclerViewBean> recyclerViewBeans;
    private LayoutInflater mInflater;
    private MyRecyclerViewAdapter_khuyenmai.ItemClickListener mClickListener;

    // data is passed into the constructor
    MyRecyclerViewAdapter_monan(Activity context, List<RecyclerViewBean> colors) {
        this.mInflater = LayoutInflater.from(context);
        this.recyclerViewBeans = colors;
    }

    // inflates the row layout from xml when needed
    @Override
    @NonNull
    public MyRecyclerViewAdapter_monan.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_monan,parent,false);
        return new MyRecyclerViewAdapter_monan.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerViewBean recyclerViewBean = recyclerViewBeans.get(position);
        holder.myView.setImageResource(recyclerViewBean.getImage());
        holder.myTextView.setText(recyclerViewBean.getCourse());
    }


    // total number of rows
    @Override
    public int getItemCount() {
        return recyclerViewBeans.size();
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView myView;
        TextView myTextView;
        ViewHolder(View itemView) {
            super(itemView);
            myView =(ImageView)itemView.findViewById(R.id.imgMonAn);
            myTextView = (TextView)itemView.findViewById(R.id.tvMonAn);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    public String getItem(int id) {
        return null;
    }

    // allows clicks events to be caught
    public void setClickListener(MyRecyclerViewAdapter_khuyenmai.ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
