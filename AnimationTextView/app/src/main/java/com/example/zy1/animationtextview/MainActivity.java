package com.example.zy1.animationtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout mActivity_main;
    private com.example.zy1.animationtextview.NumberAnimTextView mTest1;
    private com.example.zy1.animationtextview.NumberAnimTextView mTest2;
    private com.example.zy1.animationtextview.NumberAnimTextView mTest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        // 设置前缀
        mTest1.setPrefixString("¥");
        // 设置后缀
        mTest1.setPostfixString("%");
        // 设置动画时长
        mTest1.setDuration(2000);
        // 设置数字增加范围
        mTest1.setNumberString("19.75", "99.75");
        // 设置最终值，开始动画
        mTest1.setNumberString("98765432.75");
    }
    private void bindViews() {

        mActivity_main = (RelativeLayout) findViewById(R.id.activity_main);
        mTest1 = (com.example.zy1.animationtextview.NumberAnimTextView) findViewById(R.id.test1);
        mTest2 = (com.example.zy1.animationtextview.NumberAnimTextView) findViewById(R.id.test2);
        mTest3 = (com.example.zy1.animationtextview.NumberAnimTextView) findViewById(R.id.test3);
    }

}
