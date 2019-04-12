package com.bawei.com.mvp0412.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bawei.com.mvp0412.R;
import com.bawei.com.mvp0412.presenter.LoginPresenter;
import com.bawei.com.mvp0412.view.interfaces.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private EditText editText1;
    private EditText editText2;
    private Button button;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        loginPresenter = new LoginPresenter();
        loginPresenter.attch(this);
    }

    private void init() {
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
    }

    @Override
    public void getPresenter(String name) {

    }
}
