package com.qianfeng.retrofit_rxandroid_mvp_demo.model;

//                            _ooOoo_  
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖镇楼                  BUG辟易  
//          佛曰:  
//                  写字楼里写字间，写字间里程序员；  
//                  程序人员写程序，又拿程序换酒钱。  
//                  酒醒只在网上坐，酒醉还来网下眠；  
//                  酒醉酒醒日复日，网上网下年复年。  
//                  但愿老死电脑间，不愿鞠躬老板前；  
//                  奔驰宝马贵者趣，公交自行程序员。  
//                  别人笑我忒疯癫，我笑自己命太贱；  
//                  不见满街漂亮妹，哪个归得程序员？  

import com.qianfeng.retrofit_rxandroid_mvp_demo.api.MyService;
import com.qianfeng.retrofit_rxandroid_mvp_demo.api.Server;
import com.qianfeng.retrofit_rxandroid_mvp_demo.bean.Tngou;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by jackiechan on 16/8/7.
 */
public class MainAcModel implements MyModel<Tngou> {
    @Override
    public void loadData(Action1<Tngou> action1) {
        //请求数据
        Observable<Tngou> dataObs = MyService.getApi(Server.class).getDataObs(1, 1, 20);

       dataObs .observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread()).subscribe(action1);
    }
}
