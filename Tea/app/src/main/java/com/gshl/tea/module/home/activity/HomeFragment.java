package com.gshl.tea.module.home.activity;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.google.gson.Gson;
import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseFragment;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.HomeLayoutBinding;
import com.gshl.tea.module.home.bean.Area;
import com.gshl.tea.module.home.bean.HotSellerGood;
import com.gshl.tea.module.home.utils.DBUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class HomeFragment extends BaseFragment {


    private HomeLayoutBinding bind;
    private List<HotSellerGood> mDataList;

    @Override
    protected void init() {
        bind = (HomeLayoutBinding) this.binding;

        mDataList = new ArrayList<>();
        //模拟网络数据
        getData();
        //给RecyclerView设置布局管理器 这是设置为线性的布局管理器
        bind.setHotSellerLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        //给RecyclerView设置适配器
        bind.setHotSellerAdapter(new CommonRVAdapter<HotSellerGood>(mDataList, R.layout.hot_seller_item_layout, BR.hotSeller));

    }

    private void getData() {
        for (int i = 0; i < 10; i++) {
            HotSellerGood hotSellerGood = new HotSellerGood();
            hotSellerGood.setGoodImgUrl("http://avatar.csdn.net/4/9/8/1_a10615.jpg");
            hotSellerGood.setPrice("￥33.00" + i);
            hotSellerGood.setPosition(mDataList.size());
            hotSellerGood.setTitle("百草味  草莓干200g 蜜饯水果干\n果脯  干吃的零食" + i);
            mDataList.add(hotSellerGood);

        }
    }

    @Override
    protected void loadData() {
//        46bc1a1faabe4f189cf66710228c39db  32416

        //OkHttp 请求网络实例
        OkHttpUtils
                .get()
                .url("http://route.showapi.com/9-9")
                .addParams("showapi_sign", "46bc1a1faabe4f189cf66710228c39db")
                .addParams("showapi_appid", 32417+"")
                .addParams("area", "深圳")
                .build()
                .execute(new Callback<Area>() {
                    @Override
                    public Area parseNetworkResponse(Response response, int id) throws Exception {
                        String result = response.body().string();
                        Area area = new Gson().fromJson(result, Area.class);
                        return area;
                    }

                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("result", "error");
                    }

                    @Override
                    public void onResponse(Area response, int id) {
                        Log.e("result", response.toString());
                    }
                });
    }

    @Override
    protected void fillData() {
        bind.setMarquee("通知跑马灯通知跑马灯通知跑马灯通知跑马灯通知跑马灯通知跑马灯通知跑马灯通知跑马灯通知跑马灯通知跑马灯通知跑马灯通知跑马灯");
        bind.setDbUtils(new DBUtils());
    }

    private void setData(Area result) {
        //TODO 请求网络得到结果

    }

    @Override
    protected int getLayoutId() {
        return R.layout.home_layout;
    }
}
