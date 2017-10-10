package com.fskj.customview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.fskj.customview.view.RCRelativeLayout;
import com.fskj.customview.view.TimeLineLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<CharSequence> data = new ArrayList<>();
        data.add("拍摄时间：2017-9-10至2017-11-20");
        data.add("拍摄周期：1");
        data.add("拍摄地址：北京");
        data.add("出品方：某某传媒");
        data.add("报名截止日期：2017-09-30");

        TimeLineLayout timeLineLayout = (TimeLineLayout) findViewById(R.id.timeLineLayout);
        timeLineLayout.setData(data);
    }

    public void btn2RC(View view) {
        startActivity(new Intent(MainActivity.this, RCRelativeActivity.class));
    }
}
