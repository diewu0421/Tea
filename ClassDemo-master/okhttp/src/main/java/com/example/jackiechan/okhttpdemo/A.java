package com.example.jackiechan.okhttpdemo;

import java.util.List;

/**
 * Created by jackiechan on 16/1/28.
 */
public class A {


    /**
     * code : 1
     * msg : 成功
     * faxian_list : [{"type":"4","title":"全国都喜欢的商品","tag":"点击最多","goods_info":{"id":"852","title":"【包邮】松桂坊 湘西后腿腊肉","image":"http://site.meishij.net/shop/uploadfile/20151208/20151208092731_904.jpg","price":"28.8","market_price":"29.8","guige":"230g","sale_num":"8","total_store":"50","store":"42"}},{"type":"1","title":"全国最爱收藏的菜谱","tag":"收藏最多","recipe_info":{"id":"606453","title":"红烧排骨","titlepic":"http://site.meishij.net/r/107/214/2116107/a2116107_89389.jpg","gongyi":"烧","kouwei":"家常味","make_time":"<60分钟","step":"14","rate":4,"is_video":"0","do_type":""}},{"type":"1","title":"北京市都在评论这道菜，不知道你就OUT了","tag":"评论最高","recipe_info":{"id":"1662443","title":"#香雪面粉# 小桃酥","titlepic":"http://site.meishij.net/r/235/148/3349735/a3349735_145372129958570.jpg","gongyi":"烘焙","kouwei":"甜味","make_time":"<15分钟","step":"8","rate":"3","is_video":"0","do_type":""}},{"type":"1","title":"昨日全国最高评论","tag":"评论最高","recipe_info":{"id":"611677","title":"薯饼","titlepic":"http://site.meishij.net/r/44/71/1830294/a1830294_69207.jpg","gongyi":"煎","kouwei":"家常味","make_time":"<5分钟","step":"5","rate":3,"is_video":"0","do_type":""}},{"type":"2","title":"昨日全国最受欢迎食材","tag":"点击最高","shicai_info":{"id":"304","title":"芹菜","image":"http://images.meishij.net/p/20111202/34763d6a8ffe64e203acc9f1a54be083_180x180.jpg","heat_level":"1","heat_word":"较低热量","gongxiao":["平肝降压","镇静安神","防癌抗癌","养血补虚","缓解皮肤之疾"]}},{"title":"今年新春，年货自己做","type":"9","tag":"点击最多","zt_info":{"id":"7478715","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=59","photo":"http://images.meishij.net/p/20160126/474e4f27e556c4ed582858a744330293.jpg","descr":"","user_info":{"user_id":"4865043","user_name":"刘蕊","avatar":"http://site.meishij.net/user/43/210/st4865043_144100680693843.jpg"},"create_time":"2016-01-08","zan_num":"50","fav_num":"181"}},{"type":"3","title":"大家都在参加这次活动，快来吧","tag":"活动","huodong":{"img":{"small":"http://images.meishij.net/p/20160122/0d4a80c26952158b318a78cb31830d41.jpg","width":"640","height":"320"},"huodong_type":4,"huodong_id":"97"}},{"type":"1","title":"北京市现在最关注的菜谱","tag":"点击最多","recipe_info":{"id":"594800","title":"橙香鱼块","titlepic":"http://images.meishij.net/p/20130710/f5b18cd3783210ee24be13902ce7f5fe_150x150.jpg","gongyi":"炸","kouwei":"果味","make_time":"<15分钟","step":"13","rate":5,"is_video":"0","do_type":""}},{"type":"1","title":"昨日全国最爱搜索:鱼","tag":"搜索最多","recipe_info":{"id":"1655333","title":"蚝油焖海甘鱼","titlepic":"http://site.meishij.net/r/172/227/5119422/a5119422_144826247208397.jpeg","gongyi":"焖","kouwei":"鱼香味","make_time":"<30分钟","step":"6","rate":4,"is_video":"0","do_type":""}},{"type":"6","title":"昨日北京市最爱工艺:熏","tag":"点击最多","gongyi_info":{"gongyi":"熏","recipes":[{"id":"607610","title":"老上海熏鱼","titlepic":"http://images.meishij.net/p/20140605/562daed790b600fdc0a15295da886a65_150x150.jpg"},{"id":"601147","title":"老口味香肠","titlepic":"http://images.meishij.net/p/20140124/1d8e7a571737bf202bb8e0781d75362e_150x150.jpg"},{"id":"600766","title":"自制烟熏腊肉","titlepic":"http://images.meishij.net/p/20140110/3728900effd600e47d048b19d83f3cba_150x150.jpg"}]}},{"type":"1","title":"昨日北京市最爱菜谱","tag":"点击最多","recipe_info":{"id":"1651123","title":"贵妃鸡翅","titlepic":"http://site.meishij.net/r/24/169/4479774/a4479774_144592580916883.jpg","gongyi":"煮","kouwei":"家常味","make_time":"<30分钟","step":"5","rate":4,"is_video":"0","do_type":""}},{"type":"1","title":"全国议论最多的菜谱","tag":"评论最高","recipe_info":{"id":"1648930","title":"南瓜小米粥","titlepic":"http://site.meishij.net/r/52/75/2268802/a2268802_144369583394187.jpg","gongyi":"煮","kouwei":"家常味","make_time":"<15分钟","step":"6","rate":3,"is_video":"0","do_type":""}},{"type":"1","title":"昨日北京市最爱搜索:鸡蛋","tag":"搜索最多","recipe_info":{"id":"1652456","title":"韭菜鸡蛋饼","titlepic":"http://site.meishij.net/r/155/107/4401905/a4401905_144629694258404.jpg","gongyi":"煎","kouwei":"咸鲜味","make_time":"<15分钟","step":"11","rate":3,"is_video":"0","do_type":""}},{"type":"1","title":"昨日全国最爱菜谱","tag":"点击最多","recipe_info":{"id":"612874","title":"水煮肉片","titlepic":"http://site.meishij.net/r/208/36/1259208/a1259208_44389.jpg","gongyi":"煮","kouwei":"香辣味","make_time":"<30分钟","step":"14","rate":4,"is_video":"0","do_type":""}},{"type":"6","title":"全国做饭用的最多的工艺是？","tag":"点击最多","gongyi_info":{"gongyi":"蒸","recipes":[{"id":"1660085","title":"琥珀蛋","titlepic":"http://site.meishij.net/r/173/41/5135423/a5135423_145222233419061.jpg"},{"id":"1660084","title":"开屏武昌鱼","titlepic":"http://site.meishij.net/r/173/41/5135423/a5135423_145222155255564.jpg"},{"id":"1659178","title":"味噌包菜肉卷","titlepic":"http://images.meishij.net/p/20160106/5f6adc2408d1833aafd585d75f7f0dbe_150x150.jpg"}]}},{"type":"6","title":"昨日全国最爱工艺:炸","tag":"点击最多","gongyi_info":{"gongyi":"炸","recipes":[{"id":"1660132","title":"意大利佛卡恰","titlepic":"http://site.meishij.net/r/131/18/5254631/a5254631_145223680969534.jpg"},{"id":"1660079","title":"黄金锤子","titlepic":"http://site.meishij.net/r/173/41/5135423/a5135423_145221921555084.jpg"},{"id":"1657796","title":"糖油果子","titlepic":"http://site.meishij.net/r/131/18/5254631/a5254631_145033198354241.jpg"}]}},{"type":"1","title":"北京市最爱收藏的菜谱","tag":"收藏最多","recipe_info":{"id":"1661755","title":"熊掌豆腐","titlepic":"http://site.meishij.net/r/184/180/4420184/a4420184_145327930480232.jpg","gongyi":"烧","kouwei":"家常味","make_time":"<15分钟","step":"14","rate":3,"is_video":"0","do_type":""}},{"type":"1","title":"昨日北京市最高评论","tag":"评论最高","recipe_info":{"id":"1662522","title":"#香雪面粉#油条","titlepic":"http://site.meishij.net/r/143/162/2728143/a2728143_145379153678198.jpg","gongyi":"炸","kouwei":"家常味","make_time":"<10分钟","step":"10","rate":"3","is_video":"0","do_type":""}},{"type":"2","title":"买菜犯愁？看看北京市都在吃什么","tag":"点击最高","shicai_info":{"id":"26174","title":"红烧肉","image":"http://images.meishij.net/p/20130725/f005ccf19467ad1b6e157954cdfda19d_180x180.jpg","heat_level":"1","heat_word":"较低热量","gongxiao":["补血","养血","增强体质"]}},{"type":"1","title":"全国现在最关注的菜谱","tag":"点击最多","recipe_info":{"id":"58957","title":"鱼香肉丝","titlepic":"http://images.meishij.net/p/20121116/0a4425cc91a718d8f75fabf66360388c_150x150.jpg","gongyi":"炒","kouwei":"鱼香味","make_time":"<15分钟","step":"8","rate":4,"is_video":"0","do_type":""}},{"id":1,"title":"这个帖子就这么红了...","type":"11","tag":"评论最多","topic_info":{"user_info":{"user_id":"5119422","user_name":"刺泡鱼(来自腾讯.)","avatar":"http://site.meishij.net/user/172/227/t5119422_145198191608273.jpg"},"gid":"20","tid":"924402","comment_num":24,"is_ding":"0","ding_num":"19","time":"08:58发布","summary":"孩子一个星期的早餐","img_num":4,"zhiding":"","imgs":[{"small":"http://site.meishij.net/msq/172/227/5119422/s1625119422_145394268478420.jpg","big":"http://site.meishij.net/msq/172/227/5119422/s6405119422_145394268478420.jpg","width":"162","height":"162"},{"small":"http://site.meishij.net/msq/172/227/5119422/s1625119422_145394268392855.jpg","big":"http://site.meishij.net/msq/172/227/5119422/s6405119422_145394268392855.jpg","width":"162","height":"162"},{"small":"http://site.meishij.net/msq/172/227/5119422/s1625119422_145394268968106.jpg","big":"http://site.meishij.net/msq/172/227/5119422/s6405119422_145394268968106.jpg","width":"162","height":"162"},{"small":"http://site.meishij.net/msq/172/227/5119422/s1625119422_145394268749022.jpg","big":"http://site.meishij.net/msq/172/227/5119422/s6405119422_145394268749022.jpg","width":"162","height":"162"}],"recipes":[],"sourceType":"0"}},{"type":"7","title":"在北京市，这个菜单被抢疯了","tag":"收藏最多","caidan_info":{"id":"2673418","caidan_name":"家常","photos":["http://site.meishij.net/r/238/143/1348488/a1348488_142787188130463.jpg","http://site.meishij.net/r/205/142/2410705/a2410705_99081.jpg","http://images.meishij.net/p/20140902/d535d4e050096708215e39fd9902332a_150x150.jpg","http://images.meishij.net/p/20121029/5446206716a0e6c212b3c5d8c959256a_150x150.jpg"]}},{"type":"1","title":"北京市最爱搜白萝卜","tag":"搜索最多","recipe_info":{"id":"1649221","title":"酸辣白萝卜丝","titlepic":"http://site.meishij.net/r/169/79/1269919/a1269919_144411407558877.jpg","gongyi":"炒","kouwei":"酸辣味","make_time":"<15分钟","step":"9","rate":3,"is_video":"0","do_type":""}},{"type":"1","title":"昨日全国收藏最高","tag":"收藏最多","recipe_info":{"id":"1621862","title":"白菜鲜味卷","titlepic":"http://site.meishij.net/r/20/89/1272270/a1272270_142421809839827.jpg","gongyi":"蒸","kouwei":"咸鲜味","make_time":"<15分钟","step":"8","rate":4,"is_video":"0","do_type":""}},{"type":"2","title":"昨日北京市最受欢迎食材","tag":"点击最高","shicai_info":{"id":"693","title":"猪小排","image":"http://images.meishij.net/p/20130415/de0be83bd4a94a93c64ccefc96015586_180x180.jpg","heat_level":"3","heat_word":"较高热量","gongxiao":["补肾养血","滋阴润燥"]}},{"type":"7","title":"昨日北京市最爱收藏的菜单","tag":"收藏最多","caidan_info":{"id":"6457008","caidan_name":"早餐","photos":["http://site.meishij.net/r/185/123/1655935/a1655935_78163.jpg","http://site.meishij.net/r/39/70/2705039/a2705039_54485.jpg","http://images.meishij.net/p/20100521/7e25c4343041f125f0d5850650efc0c9_150x150.jpg","http://images.meishij.net/p/20130123/c580e1813027f4ca64534db5f53c9f3f_150x150.jpg"]}},{"type":"1","title":"全国最爱搜鸡","tag":"搜索最多","recipe_info":{"id":"1648691","title":"上海口味街霸鸡柳","titlepic":"http://site.meishij.net/r/163/221/5055413/a5055413_144349314613279.jpg","gongyi":"炸","kouwei":"咸鲜味","make_time":"<5分钟","step":"11","rate":3,"is_video":"0","do_type":""}},{"type":"2","title":"买菜犯愁？看看全国都在吃什么","tag":"点击最高","shicai_info":{"id":"953","title":"鲫鱼","image":"http://images.meishij.net/p/20140331/4da435c5b7b482e337a31ee75de02060_180x180.jpg","heat_level":"2","heat_word":"中等热量","gongxiao":["增强抗病能力","通乳汁","明目益智","美容抗皱"]}},{"type":"1","title":"昨日北京市收藏最高","tag":"收藏最多","recipe_info":{"id":"185161","title":"糖蒸酥酪","titlepic":"http://images.meishij.net/p/20100716/433bbc33e8918ba3412cb0453723cf5d_150x150.jpg","gongyi":"蒸","kouwei":"甜味","make_time":"","step":"5","rate":3,"is_video":"0","do_type":""}},{"type":"5","title":"阅读人数这么多，其中必有文章","tag":"阅读最多","article_info":{"id":"1639954","title":"哪款最好吃 八款方便米饭横评","titlepic":"http://static.meishij.net/images/get3/app_faxian_wz3.png","smalltext":"如今，随着人们生活、工作节奏的加快，方便面、方便粉丝、方便米..."}},{"type":"4","title":"北京市今日最受欢迎商品","tag":"点击最多","goods_info":{"id":"735","title":"【包邮】北欧欧慕nathome手持式搅拌器","image":"http://site.meishij.net/shop/uploadfile/20151127/20151127111846_377.jpg","price":"169","market_price":"869","guige":"1个","sale_num":"26","total_store":"50","store":"24"}},{"type":"6","title":"北京市人做饭偏爱卤","tag":"点击最多","gongyi_info":{"gongyi":"卤","recipes":[{"id":"1650988","title":"香卤鸡","titlepic":"http://images.meishij.net/p/20151210/2e369976837ac4cc20499f7a0808d8ff_150x150.jpg"},{"id":"1650106","title":"自制麻辣卤豆干","titlepic":"http://site.meishij.net/r/15/151/1537765/a1537765_144497934803497.jpg"},{"id":"1648409","title":"五香卤蛋","titlepic":"http://site.meishij.net/r/158/87/4021908/a4021908_144316710081863.jpg"}]}}]
     */

    private String code;
    private String msg;
    /**
     * type : 4
     * title : 全国都喜欢的商品
     * tag : 点击最多
     * goods_info : {"id":"852","title":"【包邮】松桂坊 湘西后腿腊肉","image":"http://site.meishij.net/shop/uploadfile/20151208/20151208092731_904.jpg","price":"28.8","market_price":"29.8","guige":"230g","sale_num":"8","total_store":"50","store":"42"}
     */

    private List<FaxianListEntity> faxian_list;

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setFaxian_list(List<FaxianListEntity> faxian_list) {
        this.faxian_list = faxian_list;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public List<FaxianListEntity> getFaxian_list() {
        return faxian_list;
    }

    public static class FaxianListEntity {
        private String type;
        private String title;
        private String tag;
        /**
         * id : 852
         * title : 【包邮】松桂坊 湘西后腿腊肉
         * image : http://site.meishij.net/shop/uploadfile/20151208/20151208092731_904.jpg
         * price : 28.8
         * market_price : 29.8
         * guige : 230g
         * sale_num : 8
         * total_store : 50
         * store : 42
         */

        private GoodsInfoEntity goods_info;

        public void setType(String type) {
            this.type = type;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public void setGoods_info(GoodsInfoEntity goods_info) {
            this.goods_info = goods_info;
        }

        public String getType() {
            return type;
        }

        public String getTitle() {
            return title;
        }

        public String getTag() {
            return tag;
        }

        public GoodsInfoEntity getGoods_info() {
            return goods_info;
        }

        public static class GoodsInfoEntity {
            private String id;
            private String title;
            private String image;
            private String price;
            private String market_price;
            private String guige;
            private String sale_num;
            private String total_store;
            private String store;

            public void setId(String id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public void setMarket_price(String market_price) {
                this.market_price = market_price;
            }

            public void setGuige(String guige) {
                this.guige = guige;
            }

            public void setSale_num(String sale_num) {
                this.sale_num = sale_num;
            }

            public void setTotal_store(String total_store) {
                this.total_store = total_store;
            }

            public void setStore(String store) {
                this.store = store;
            }

            public String getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getImage() {
                return image;
            }

            public String getPrice() {
                return price;
            }

            public String getMarket_price() {
                return market_price;
            }

            public String getGuige() {
                return guige;
            }

            public String getSale_num() {
                return sale_num;
            }

            public String getTotal_store() {
                return total_store;
            }

            public String getStore() {
                return store;
            }
        }
    }
}
