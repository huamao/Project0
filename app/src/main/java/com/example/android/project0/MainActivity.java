package com.example.android.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {
        Toast.makeText(getApplicationContext(),"这是\"热门电影\"！",Toast.LENGTH_SHORT).show();
    }

    public void clickButton2(View view) {
        Toast.makeText(getApplicationContext(),"我点击了\"股票雄鹰\"！",Toast.LENGTH_SHORT).show();
    }

    public void clickButton3(View view) {
        Toast.makeText(getApplicationContext(),"这是我的\"XYZ阅读器\"！",Toast.LENGTH_SHORT).show();
    }

    public void clickButton4(View view) {
        Toast.makeText(getApplicationContext(),"Oh，\"最新闻\"真好看！",Toast.LENGTH_SHORT).show();
    }

    public void clickButton5(View view) {
        Toast.makeText(getApplicationContext(),"哇塞！终于完成\"毕业设计\"啦！",Toast.LENGTH_SHORT).show();
    }
}
