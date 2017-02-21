package com.example.jackiechan.listviewquestionsdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 在activity 中 通过使用getSupportFragmentManager();和getFragmentManager(); 来管理自己内部的  一层  fragment
 * 在 fragment 中如果嵌套了 fragment, 不管怎么嵌套的,用 viewpager 也好,要管理这些内部的嵌套 一层 fragment 要用   getchildfragmentmanager()
 * 在fragment还有一种  就是getFragmentManager(); 这个获取的是  谁管理的我, 我获取到的就是谁的 manager,一般用于 同级操作
 */
public class MainActivity extends AppCompatActivity {
    private Fragment1 fragment1;
    private Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
    }

    public void onClick(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.bt1:
                fragmentTransaction.replace(R.id.container, fragment1).commit();

                break;

            case R.id.bt2:
                fragmentTransaction.replace(R.id.container, fragment2).commit();
                break;
        }
    }
}
