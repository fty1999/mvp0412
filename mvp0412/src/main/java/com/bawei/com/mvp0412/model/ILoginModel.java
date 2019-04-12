package com.bawei.com.mvp0412.model;

/**
 * @Auther: 樊腾亚
 * @Date: 2019/4/12 15:03:06
 * @Description:
 */
public interface ILoginModel {
    void  login(CallBack callBack);
    interface CallBack{
        void  onSuccess(String names);
        void  onFail();

    }
}
