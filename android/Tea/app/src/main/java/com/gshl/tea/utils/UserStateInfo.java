package com.gshl.tea.utils;

/**
 * Created by ZengLingWen on 2017/3/9.
 */

public class UserStateInfo {
    private static UserStateInfo instance = null;

    private boolean isLogin;

    private String userPhone;

    private boolean isAutoLogin;

    public boolean isAutoLogin() {
        return isAutoLogin;
    }

    public void setAutoLogin(boolean autoLogin) {
        isAutoLogin = autoLogin;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    private UserStateInfo() {

    }
    public static UserStateInfo getInstance() {
        if (instance == null) {
            synchronized (UserStateInfo.class) {
                if (instance == null) {
                    instance = new UserStateInfo();
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
