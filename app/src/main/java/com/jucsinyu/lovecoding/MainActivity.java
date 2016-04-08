package com.jucsinyu.lovecoding;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView titleView;
    private RecyclerView recyclerView_one;
    private RecyclerView.Adapter mAdapter;//适配器
    private LinearLayoutManager mLayoutManager; //布局管理器


    //这个是主页，主要放ListView 实例的列表。
    //需要增加一个list 条目的话，在此处修改，并且增加自己的Activity,并在配置文件添加。
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleView = (TextView) findViewById(R.id.list_item);
        recyclerView_one = (RecyclerView) findViewById(R.id.recyclerView_one);

        //布局管理器
        mLayoutManager = new LinearLayoutManager(this);
        //设置方向
        mLayoutManager.setOrientation(OrientationHelper.VERTICAL);
        recyclerView_one.setLayoutManager(mLayoutManager);
        //设置适配器
        mAdapter = new MainActivty_RecyclerAdapter(this, R.layout.layout_cardview);
        recyclerView_one.setAdapter(mAdapter);

    }
}
