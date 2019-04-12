package com.bawei.com.mvp0412.presenter;

import com.bawei.com.mvp0412.view.interfaces.ILoginView;

/**
 * @Auther: 樊腾亚
 * @Date: 2019/4/12 15:01:10
 * @Description:
 */
public interface ILoginPresenter {
    void  getModel();
    //绑定
    void  attch(ILoginView view);
    //解绑
    void  detch();
}
