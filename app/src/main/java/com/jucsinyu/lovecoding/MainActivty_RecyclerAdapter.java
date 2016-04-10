package com.jucsinyu.lovecoding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jucsinsun on 2016/4/8.
 */
public class MainActivty_RecyclerAdapter extends RecyclerView.Adapter<MainActivty_RecyclerAdapter.MyViewHolder> {


    private int layoutId = 0;
    private LayoutInflater mInflater;
    private String[] mTitles = null;
    private int[] mCardImage = null;


    public MainActivty_RecyclerAdapter(Context context, int i) {
        //获取到传来的布局Id
        this.layoutId = i;
        this.mInflater = LayoutInflater.from(context);
        //设置card的描述
        this.mTitles = new String[]{"Volley框架", "Material Design 之 CardView", "Material Design 之 recyclerview", "Android开源组件", "云后端"};
        //设置card插图的ID
        this.mCardImage = new int[]{R.mipmap.logo, R.mipmap.cat,
                R.mipmap.logo, R.mipmap.card_bg_taohua, R.mipmap.logo};
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        MyViewHolder holder = new MyViewHolder(this.mInflater.inflate(layoutId, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(mTitles[position]);
        holder.imageView.setImageResource(mCardImage[position]);
    }

    @Override
    public int getItemCount() {
        return mTitles.length;
    }

    public static class MyViewHolder extends ViewHolder {

        TextView tv;
        ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            tv = (TextView) view.findViewById(R.id.list_item);
            imageView = (ImageView) view.findViewById(R.id.img);

        }
    }

}
