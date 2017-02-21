package com.example.myindexbardemo;

/**
 * Created by jackiechan on 16/1/12.
 */
public class Friend implements Comparable<Friend> {
    private String name;
    private String pinyin;



    public Friend(String name) {
        this.name = name;
        pinyin = PinYinUtils.GetPinyin(name);
    }

    public String getName() {
        return name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Friend another) {
     //   return PinYinUtils.GetPinyin(name).compareTo(PinYinUtils.GetPinyin(another.getName()));
        return pinyin.compareTo(another.getPinyin());
    }
}
