package com.example.listviewwithbuttondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    private Aaaaaaaaaaaaa aaaaaaaaaaaaa;
    private int postion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    private void dianZan(){
        //请求网络   网络成功后
        if (aaaaaaaaaaaaa != null) {
            aaaaaaaaaaaaa.onChange("iv"+postion);
        }
    }
}
