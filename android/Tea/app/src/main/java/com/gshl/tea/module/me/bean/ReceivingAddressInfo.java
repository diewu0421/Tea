package com.gshl.tea.module.me.bean;

import java.util.List;

/**
 * Created by ZengLingWen on 2017/3/9.
 */

public class ReceivingAddressInfo {

    private int code;
    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        private List<AddressListBean> addressList;

        public List<AddressListBean> getAddressList() {
            return addressList;
        }

        public void setAddressList(List<AddressListBean> addressList) {
            this.addressList = addressList;
        }

        public static class AddressListBean {
            /**
             * address : 测试内容v65m
             * areaName : 测试内容9vb3
             * cityName : 测试内容95y1
             * state : 86058
             * area : 1613
             * city : 1609
             * contacts : 陆仁贾
             * customerId : 1
             * id : 1
             * phone : 13815264859
             * province : 1594
             * provinceName : 广东省
             */

            private String address;
            private String areaName;
            private String cityName;
            private int state;
            private int area;
            private int city;
            private String contacts;
            private int customerId;
            private int id;
            private String phone;
            private int province;
            private String provinceName;

            public String getAddress() {
                return address;
            }

            @Override
            public String toString() {
                return "AddressListBean{" +
                        "address='" + address + '\'' +
                        ", areaName='" + areaName + '\'' +
                        ", cityName='" + cityName + '\'' +
                        ", state=" + state +
                        ", area=" + area +
                        ", city=" + city +
                        ", contacts='" + contacts + '\'' +
                        ", customerId=" + customerId +
                        ", id=" + id +
                        ", phone='" + phone + '\'' +
                        ", province=" + province +
                        ", provinceName='" + provinceName + '\'' +
                        '}';
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getAreaName() {
                return areaName;
            }

            public void setAreaName(String areaName) {
                this.areaName = areaName;
            }

            public String getCityName() {
                return cityName;
            }

            public void setCityName(String cityName) {
                this.cityName = cityName;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getArea() {
                return area;
            }

            public void setArea(int area) {
                this.area = area;
            }

            public int getCity() {
                return city;
            }

            public void setCity(int city) {
                this.city = city;
            }

            public String getContacts() {
                return contacts;
            }

            public void setContacts(String contacts) {
                this.contacts = contacts;
            }

            public int getCustomerId() {
                return customerId;
            }

            public void setCustomerId(int customerId) {
                this.customerId = customerId;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getProvince() {
                return province;
            }

            public void setProvince(int province) {
                this.province = province;
            }

            public String getProvinceName() {
                return provinceName;
            }

            public void setProvinceName(String provinceName) {
                this.provinceName = provinceName;
            }
        }
    }
}
