package com.bawei.com.mvp0412.model;

/**
 * @Auther: 樊腾亚
 * @Date: 2019/4/12 15:03:46
 * @Description:
 */
public class LoginModel implements ILoginModel {
    @Override
    public void login(CallBack callBack) {
        String  names="樊腾亚";
        callBack.onSuccess(names);
    }
}
