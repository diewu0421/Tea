package com.gshl.tea.utils;

/**
 * Created by ZengLingWen on 2017/3/9.
 */

public class UserInfo {
    private static UserInfo instance = null;

    private boolean isLogin;


    private UserInfo() {

    }
    public static UserInfo getInstance() {
        if (instance == null) {
            synchronized (UserInfo.class) {
                if (instance == null) {
                    instance = new UserInfo();
                }
            }
        }
        return instance;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

}
