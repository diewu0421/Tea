package com.qianfeng.zhibomvpdemo.presenter;

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

import com.qianfeng.zhibomvpdemo.model.MainAcModel;
import com.qianfeng.zhibomvpdemo.model.MainModel2;
import com.qianfeng.zhibomvpdemo.model.MvpModel;
import com.qianfeng.zhibomvpdemo.view.iview.MvpView;

import java.util.List;

/**
 * 用于协调View 和 Model 的中间类,这个是针对Main
 * Created by jackiechan on 16/8/7.
 */
public class MainAcPresenter extends BasePresenter<MvpView> {
    //private MvpView mvpView;//获得数据后需要更新视图的 view
    private MvpModel mvpModel;// 用于获取数据的 model

//    public MainAcPresenter(MvpView mvpView) {
//        this.mvpView = mvpView;
//        mvpModel = new MainAcModel();
//    }


    public MainAcPresenter() {
        mvpModel = new MainAcModel();
    }

    //    public MainAcPresenter setModel(MvpModel model) {
//        this.mvpModel = model;
//        return this;
//    }
    public MainAcPresenter setModel(int model) {
        switch (model) {
            case 0:
                mvpModel = new MainAcModel();
                break;

            case 1:
                mvpModel = new MainModel2();
                break;
        }
        return this;
    }

    /**
     * 加载数据,内部通过 model去加载
     */
    public void load() {
        mvpModel.getData(new MvpModel.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(List<String> list) {
                //model 加载完成后数据会传递到这里来
                getView().showView(list);
            }
        });
    }
}
