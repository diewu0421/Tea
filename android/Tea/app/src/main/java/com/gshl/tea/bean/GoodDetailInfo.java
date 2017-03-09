package com.gshl.tea.bean;

import java.util.List;

/**
 * Created by ZengLingWen on 2017/3/8.
 */

public class GoodDetailInfo {
    private String name;

    private String title;

    private List<String> imgs;

    private String price;

    private String marketPrice;

    private String store;

    private List<String> produceImgs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public List<String> getProduceImgs() {
        return produceImgs;
    }

    public void setProduceImgs(List<String> produceImgs) {
        this.produceImgs = produceImgs;
    }
}
