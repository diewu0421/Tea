package com.gshl.tea.bean;

/**
 * Created by ZengLingWen on 2017/3/9.
 */

public class LoginInfo {

    /**
     * code : 45251
     * data : {"user":{"createTime":1,"departmentId":1,"headImg":1,"id":2,"nickname":1,"password":"测试内容2353","phone":"测试内容cxtz","roleId":1,"state":1,"tagType":1,"targetId":1,"type":1}}
     * msg : 测试内容7i86
     */

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

    @Override
    public String toString() {
        return "LoginInfo{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }

    public static class DataBean {
        /**
         * user : {"createTime":1,"departmentId":1,"headImg":1,"id":2,"nickname":1,"password":"测试内容2353","phone":"测试内容cxtz","roleId":1,"state":1,"tagType":1,"targetId":1,"type":1}
         */

        private UserBean user;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * createTime : 1
             * departmentId : 1
             * headImg : 1
             * id : 2
             * nickname : 1
             * password : 测试内容2353
             * phone : 测试内容cxtz
             * roleId : 1
             * state : 1
             * tagType : 1
             * targetId : 1
             * type : 1
             */

            private int createTime;
            private int departmentId;
            private int headImg;
            private int id;
            private int nickname;
            private String password;
            private String phone;
            private int roleId;
            private int state;
            private int tagType;
            private int targetId;
            private int type;

            public int getCreateTime() {
                return createTime;
            }

            public void setCreateTime(int createTime) {
                this.createTime = createTime;
            }

            public int getDepartmentId() {
                return departmentId;
            }

            public void setDepartmentId(int departmentId) {
                this.departmentId = departmentId;
            }

            public int getHeadImg() {
                return headImg;
            }

            public void setHeadImg(int headImg) {
                this.headImg = headImg;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getNickname() {
                return nickname;
            }

            public void setNickname(int nickname) {
                this.nickname = nickname;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getRoleId() {
                return roleId;
            }

            public void setRoleId(int roleId) {
                this.roleId = roleId;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getTagType() {
                return tagType;
            }

            public void setTagType(int tagType) {
                this.tagType = tagType;
            }

            @Override
            public String toString() {
                return "UserBean{" +
                        "createTime=" + createTime +
                        ", departmentId=" + departmentId +
                        ", headImg=" + headImg +
                        ", id=" + id +
                        ", nickname=" + nickname +
                        ", password='" + password + '\'' +
                        ", phone='" + phone + '\'' +
                        ", roleId=" + roleId +
                        ", state=" + state +
                        ", tagType=" + tagType +
                        ", targetId=" + targetId +
                        ", type=" + type +
                        '}';
            }

            public int getTargetId() {
                return targetId;
            }

            public void setTargetId(int targetId) {
                this.targetId = targetId;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
