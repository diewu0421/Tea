package com.example.administrator.teaapplication.view.activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseActivity<V extends MVPView ,T extends BasePresenter<V>> extends AppCompatActivity {
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=createPresenter();
        presenter.attch((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.deAttch();
    }

    public abstract T createPresenter();
}
