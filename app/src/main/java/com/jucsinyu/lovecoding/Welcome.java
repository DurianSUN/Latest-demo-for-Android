package com.jucsinyu.lovecoding;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class Welcome extends AppCompatActivity {

    int runCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Toast.makeText(getApplicationContext(), "欢迎来到 Love Coding,么么哒", Toast.LENGTH_SHORT).show();


        final Handler handler = new Handler();
        runCount = 0;// 全局变量，用于判断是否是第一次执行
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                if (runCount == 1) {
                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), MainActivity.class);

                    startActivity(intent);
                    handler.removeCallbacks(this);
                }
                handler.postDelayed(this, 1000);
                runCount++;
            }

        };
        handler.postDelayed(runnable, 2000);// 打开定时器，执行操作


    }
}
