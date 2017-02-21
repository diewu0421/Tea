package com.qianfeng.rxandroiddemo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackiechan on 16/6/15.
 */
public class BeiGuanChaZhe {
    private List<GuanChaZhe> mGuanChaZhes = new ArrayList<>();

    //数据发生变化了
    public void onChanged() {
//        G1 g1 = new G1();
//        g1.change();
//        G2 g2 = new G2();
//        g2.change2();
//        G3 g3 = new G3();
//        g3.change3();
        for (GuanChaZhe mGuanChaZhe : mGuanChaZhes) {
            mGuanChaZhe.onChange();
        }
    }

    public void add(GuanChaZhe guanChaZhe) {
        mGuanChaZhes.add(guanChaZhe);
    }
    public void remove(GuanChaZhe guanChaZhe) {
        mGuanChaZhes.remove(guanChaZhe);
    }
}
