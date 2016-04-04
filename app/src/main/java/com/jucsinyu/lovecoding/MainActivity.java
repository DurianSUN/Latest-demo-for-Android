package com.jucsinyu.lovecoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //这个是主页，主要放ListView 实例的列表。
    //需要增加一个list 条目的话，在此处修改，并且增加自己的Activity,并在配置文件添加。
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
