package com.gshl.tea.constant;

/**
 * Created by ZengLingWen on 2017/3/9.
 */

public interface RequestUrl {
    //基础 前缀地址
    String BASE_URL = "http://192.168.3.103:8080/Chayueke";

    //登录
    String LOGIN_URL = "/api/user/login";

    //注册
    String REGISTER_URL = "/api/user/register";

    //查询收货地址
    String RECEIVING_ADDRESS = "/api/user/findAddress";

    //    查询分类列表
    //    请求Url  /api/cmdyClass/findCmdyClass
    //    接口描述 1、查询第一级只需传入levelId 2、查询第二级需传入parentId 和 levelId
    String GOOD_CATEGORY = "/api/cmdyClass/findCmdyClass";



}
