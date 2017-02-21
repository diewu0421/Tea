package com.qianfeng.rxandroiddemo1;

/**
 * Created by jackiechan on 16/6/15.
 */
public class G1 implements GuanChaZhe {
//    public void change(){
//        System.out.println("G1知道了");
//    }

    @Override
    public void onChange() {
        System.out.println("G1知道了");
    }
}
