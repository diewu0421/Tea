package com.qianfeng.rxandroiddemo1;

/**
 * Created by jackiechan on 16/6/15.
 */
public class Test {
    public static void main(String[] args) {
//        System.out.print("sadas");
        BeiGuanChaZhe beiGuanChaZhe = new BeiGuanChaZhe();
        G1 g1 = new G1();
        G2 g2 = new G2();
        G3 g3 = new G3();
        beiGuanChaZhe.add(g1);
        beiGuanChaZhe.add(g2);
        beiGuanChaZhe.add(g3);
        beiGuanChaZhe.onChanged();


        beiGuanChaZhe.remove(g3);
        beiGuanChaZhe.onChanged();
    }
}
