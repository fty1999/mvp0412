package com.bawei.com.mvp0412.presenter;

import android.util.Log;

import com.bawei.com.mvp0412.model.LoginModel;
import com.bawei.com.mvp0412.model.ILoginModel;
import com.bawei.com.mvp0412.view.interfaces.ILoginView;

/**
 * @Auther: 樊腾亚
 * @Date: 2019/4/12 15:00:37
 * @Description:
 */
public class LoginPresenter implements ILoginPresenter{
    public static final String TAG="LoginPreSenter";
    private LoginModel loginModel;
    private ILoginView view;

    //获取model
    @Override
    public void getModel() {

    }

    @Override
    public void attch(final ILoginView view) {
        loginModel = new LoginModel();
        this.view=view;
        loginModel.login( new ILoginModel.CallBack() {
            @Override
            public void onSuccess(String names) {
                view.getPresenter(names);
                Log.i(TAG, "onSuccess: "+names);
            }

            @Override
            public void onFail() {

            }
        });
    }

    @Override
    public void detch() {

    }
}
