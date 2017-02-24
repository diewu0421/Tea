package com.gshl.tea.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gshl.tea.R;
import com.gshl.tea.utils.StatusBarCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        StatusBarCompat.compat(this,getResources().getColor(R.color.bg_login_color));
        startActivity(new Intent(this,RegisterActivity.class));
        finish();
    }
}
