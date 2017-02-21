package com.qianfeng.rxandroiddemo1;

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

import java.util.List;

/**
 * Created by jackiechan on 16/6/19.
 */
public class MeiTianBean  extends MyBaseJson{


    /**
     * status : 0
     * result : [{"image":[{"url":"http://cdn.yuezhixing.cn/o_1afbuursvdjevc0gj71l68tl27.jpg-banner.jpeg","type":4},{"url":"http://cdn.yuezhixing.cn/o_1aff4sr1s14ik1skk8i7ppu183v7.jpg-top.jpeg","type":3},{"url":"http://cdn.yuezhixing.cn/o_1aff4vhi07iotbje1h1aqtpeph.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aff4vhi07iotbje1h1aqtpeph.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1aff4uav11ta51denbus1qke1s4sc.jpg-focus.jpeg","type":1},{"url":"http://cdn.yuezhixing.cn/o_1afbuursvdjevc0gj71l68tl27.jpg-list.jpeg","type":0}],"author":{"authorId":"cd451b05-4975-4c56-9305-63d413924e9a","name":"郑小黑","avatar":"http://cdn.yuezhixing.cn/o_1afgd0i08igo18u32kq1lppmem7.jpg","image":"http://cdn.yuezhixing.cn/o_1afgdbgr71ci11j4movc1btg1vsac.jpg","logo":null,"introduction":"时尚网娱乐编辑。Waiting for a feeling to come and close your eyes.That will shine your mind.","contactType":1,"contactId":"18801490622","gender":1,"contract":0,"serviceType":0,"serviceParam":null,"entityStats":{"read":19231193,"like":0,"dislike":0,"comment":0,"favorite":5,"share":0}},"featuredArticle":{"publishTime":1459699200000,"priority":31881600},"category":{"categoryId":56,"name":"音乐","englishName":"music","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":6,"name":"文艺","englishName":"Literature","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png","color":"#ACC580","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png"}},"priority":31881600,"article":{"articleId":"68588ac6-7096-4ad5-b489-cfe07582f9fa","title":"美好的你今天不听 CNBLUE ，就会错过 16 年最棒的乐队！","summary":"和最懂生活的\"郑小黑\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1afbuursvdjevc0gj71l68tl27.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/68588ac6-7096-4ad5-b489-cfe07582f9fa","weblink":"http://www.meitianapp.com/wap/article/68588ac6-7096-4ad5-b489-cfe07582f9fa","publishTime":1459727700000,"createdTime":1459616552000,"modifiedTime":1459731764000,"articleStats":{"read":63402,"like":37,"dislike":0,"comment":1,"favorite":25,"share":13},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1af2obr2qgq41fakrhqdng1ltu10.jpg-banner.jpeg","type":4},{"url":"http://cdn.yuezhixing.cn/o_1af53lcn61s9i4ik1ogr12hpsu77.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1af53lcn61s9i4ik1ogr12hpsu77.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1af53nlnm173r1g6t9od1b4j1otjc.jpg-focus.jpeg","type":1},{"url":"http://cdn.yuezhixing.cn/o_1af2obr2qgq41fakrhqdng1ltu10.jpg-list.jpeg","type":0}],"author":{"authorId":"160d549c-e643-40e7-9dc7-13dbc5885de3","name":"PureWow","avatar":"http://cdn.yuezhixing.cn/o_1acllukbh1l6a12qeut9174hfve7.jpg","image":"","logo":"http://cdn.yuezhixing.cn/trends/author/logo/purewow.jpg","introduction":"","contactType":0,"contactId":"","gender":0,"contract":0,"serviceType":0,"serviceParam":null,"entityStats":{"read":28656351,"like":0,"dislike":0,"comment":0,"favorite":7,"share":0}},"featuredArticle":{"publishTime":1459353600000,"priority":31536010},"category":{"categoryId":86,"name":"热点","englishName":"hot","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":6,"name":"文艺","englishName":"Literature","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png","color":"#ACC580","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png"}},"priority":31536010,"article":{"articleId":"406afdf8-c916-4117-b72e-356f6b967912","title":"个子高的人才懂得 29 个痛","summary":"和最懂生活的\"PureWow\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1af2obr2qgq41fakrhqdng1ltu10.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/406afdf8-c916-4117-b72e-356f6b967912","weblink":"http://www.meitianapp.com/wap/article/406afdf8-c916-4117-b72e-356f6b967912","publishTime":1459307880000,"createdTime":1459307974000,"modifiedTime":1459387170000,"articleStats":{"read":102766,"like":29,"dislike":0,"comment":7,"favorite":7,"share":17},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1af3h5mne1l0i15510ni18sejl51a.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1af3h5mne1l0i15510ni18sejl51a.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1af3gti3uhubpjevnq6r5tub10.jpg-list.jpeg","type":0}],"author":{"authorId":"2b9cdebb-444d-3b2f-a838-0860104f0573","name":"蓝风童","avatar":"http://cdn.yuezhixing.cn/o_1a62cn84r57410kt4pl1olk1r8d7.jpeg","image":"http://cdn.yuezhixing.cn/o_1a6kjrpsr1uqcd4319rd1ja74nv7.jpeg","logo":null,"introduction":"时常猫在家里，画画，读书。","contactType":1,"contactId":"保密","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":82885,"like":0,"dislike":0,"comment":0,"favorite":0,"share":0}},"featuredArticle":{"publishTime":1459353600000,"priority":31536005},"category":{"categoryId":50,"name":"文艺","englishName":"literature","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":6,"name":"文艺","englishName":"Literature","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png","color":"#ACC580","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png"}},"priority":31536005,"article":{"articleId":"2c866d8c-effe-475b-b953-65fb1ca34cf5","title":"也许你需要植物静默而治愈感的陪伴","summary":"和最懂生活的\"蓝风童\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1af3gti3uhubpjevnq6r5tub10.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/2c866d8c-effe-475b-b953-65fb1ca34cf5","weblink":"http://www.meitianapp.com/wap/article/2c866d8c-effe-475b-b953-65fb1ca34cf5","publishTime":1459353600000,"createdTime":1459333836000,"modifiedTime":1459334015000,"articleStats":{"read":53975,"like":37,"dislike":0,"comment":1,"favorite":40,"share":24},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1af2rginm177o1d461tcls0p6s07.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1af2rginm177o1d461tcls0p6s07.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/Fg06hir8JRI7Fk8rD0CSjCqgNRO_-list.jpeg","type":0}],"author":{"authorId":"41d788a3-dfd4-3f14-a219-418ec8c3e3ba","name":"黎贝卡的异想世界","avatar":"http://cdn.yuezhixing.cn/FhYlZlJhuh4W3MUrbO7mNeB6rhht","image":"http://cdn.yuezhixing.cn/o_19m5970paot9u571osrjub2eo7.jpg","logo":null,"introduction":"让时尚更有趣.","contactType":1,"contactId":"Miss_shopping_li","gender":1,"contract":0,"serviceType":0,"serviceParam":null,"entityStats":{"read":853306,"like":0,"dislike":0,"comment":0,"favorite":31,"share":0}},"featuredArticle":{"publishTime":1459353600000,"priority":31536000},"category":{"categoryId":89,"name":"购物","englishName":"shopping","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":1,"name":"风尚","englishName":"Fashion","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_large@2x.png","color":"#F83648","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_bg@2x.png"}},"priority":31536000,"article":{"articleId":"7033aa12-bea1-34ac-be97-7987ab57cfbb","title":"时间有限，更要买得稳、准、狠","summary":"和最懂生活的\"黎贝卡的异想世界\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/Fg06hir8JRI7Fk8rD0CSjCqgNRO_","renderType":0,"url":"http://www.meitianapp.com/app/article/7033aa12-bea1-34ac-be97-7987ab57cfbb","weblink":"http://www.meitianapp.com/wap/article/7033aa12-bea1-34ac-be97-7987ab57cfbb","publishTime":1459267200000,"createdTime":1459265657000,"modifiedTime":1459323457000,"articleStats":{"read":53358,"like":25,"dislike":0,"comment":3,"favorite":29,"share":4},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/FquGiLHYe5-t5IXHhRjKttptRydx-banner.jpeg","type":4},{"url":"http://cdn.yuezhixing.cn/o_1af12qppar6dle415se1g8sk4v7.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1af12qppar6dle415se1g8sk4v7.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/FquGiLHYe5-t5IXHhRjKttptRydx-list.jpeg","type":0}],"author":{"authorId":"160d549c-e643-40e7-9dc7-13dbc5885de3","name":"PureWow","avatar":"http://cdn.yuezhixing.cn/o_1acllukbh1l6a12qeut9174hfve7.jpg","image":"","logo":"http://cdn.yuezhixing.cn/trends/author/logo/purewow.jpg","introduction":"","contactType":0,"contactId":"","gender":0,"contract":0,"serviceType":0,"serviceParam":null,"entityStats":{"read":28656351,"like":0,"dislike":0,"comment":0,"favorite":7,"share":0}},"featuredArticle":{"publishTime":1459267200000,"priority":31449600},"category":{"categoryId":16,"name":"家居","englishName":"household appliances","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/household_appliances@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":3,"name":"家居","englishName":"House","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/house@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/house_large@2x.png","color":"#00DEBD","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/house_bg@2x.png"}},"priority":31449600,"article":{"articleId":"b251986f-6ef9-378c-a7be-2f4303869179","title":"这样装扮花园绝对是今年最幸福的事之一","summary":"和最懂生活的\"PureWow\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/FquGiLHYe5-t5IXHhRjKttptRydx","renderType":0,"url":"http://www.meitianapp.com/app/article/b251986f-6ef9-378c-a7be-2f4303869179","weblink":"http://www.meitianapp.com/wap/article/b251986f-6ef9-378c-a7be-2f4303869179","publishTime":1459161780000,"createdTime":1459160871000,"modifiedTime":1459313431000,"articleStats":{"read":65107,"like":47,"dislike":0,"comment":1,"favorite":49,"share":31},"tags":["花园改造","装修","家居","春季改造","装修趋势"]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1aetutn941d3i1q1v1mqfsa11sv37.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aetutn941d3i1q1v1mqfsa11sv37.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1aett7n7bdhn11p81bg21sra1a7310.jpg-list.jpeg","type":0}],"author":{"authorId":"335a5cbd-9395-378f-b55b-4d75b22507ae","name":"加心","avatar":"http://cdn.yuezhixing.cn/FpCuoGFk-KgTLT2l95yMoy3nRh8C","image":"http://cdn.yuezhixing.cn/o_1a8nnkta811vdpa7milaj3ob47.jpg","logo":null,"introduction":"加心小姐的沙龙实验室,给美丽加料,对生活用心.","contactType":1,"contactId":"jx_lab","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":52529,"like":0,"dislike":0,"comment":0,"favorite":1,"share":0}},"featuredArticle":{"publishTime":1459180800000,"priority":31363200},"category":{"categoryId":50,"name":"文艺","englishName":"literature","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":6,"name":"文艺","englishName":"Literature","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png","color":"#ACC580","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png"}},"priority":31363200,"article":{"articleId":"b07c5a9a-b06f-4ac1-8501-a2795d73ec28","title":"闺蜜，要这样同框才最甜蜜","summary":"和最懂生活的\"加心\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1aett7n7bdhn11p81bg21sra1a7310.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/b07c5a9a-b06f-4ac1-8501-a2795d73ec28","weblink":"http://www.meitianapp.com/wap/article/b07c5a9a-b06f-4ac1-8501-a2795d73ec28","publishTime":1459116000000,"createdTime":1459144722000,"modifiedTime":1459146909000,"articleStats":{"read":80582,"like":83,"dislike":0,"comment":2,"favorite":108,"share":134},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1aeh8hd4k1ilc1r7166hif01is17.jpg-banner.jpeg","type":4},{"url":"http://cdn.yuezhixing.cn/o_1aeh9f0n2u3mcfl1rcr1a9f1637.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aeh9f0n2u3mcfl1rcr1a9f1637.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1aeh8hd4k1ilc1r7166hif01is17.jpg-list.jpeg","type":0}],"author":{"authorId":"48e1477c-3b16-35b9-b036-238b7273286e","name":"i烘焙","avatar":"http://cdn.yuezhixing.cn/Fsx0CMvGY7MPrXWvwNNytvYzZrYM","image":"http://cdn.yuezhixing.cn/o_19r7hfcku1o2tkvn8ia3n6l227.jpg","logo":null,"introduction":"全面解决配方、教程、原料、工具的一站式烘焙平台.","contactType":1,"contactId":"bakingstyle","gender":0,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":361923,"like":0,"dislike":0,"comment":0,"favorite":18,"share":0}},"featuredArticle":{"publishTime":1459094400000,"priority":31276800},"category":{"categoryId":8,"name":"美食","englishName":"tea","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/tea@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":2,"name":"美食","englishName":"Delicacy","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy_large@2x.png","color":"#FFC000","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy_bg@2x.png"}},"priority":31276800,"article":{"articleId":"f3d93254-1188-33ea-986e-9490c2563a51","title":"零食拿来做甜点，居然很好吃！","summary":"和最懂生活的\"i烘焙\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1aeh8hd4k1ilc1r7166hif01is17.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/f3d93254-1188-33ea-986e-9490c2563a51","weblink":"http://www.meitianapp.com/wap/article/f3d93254-1188-33ea-986e-9490c2563a51","publishTime":1460584800000,"createdTime":1459094400000,"modifiedTime":1460601319000,"articleStats":{"read":70451,"like":44,"dislike":0,"comment":0,"favorite":73,"share":26},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1aeh78i6bllb1o6mjulg4j1ainc.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aeh78i6bllb1o6mjulg4j1ainc.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/Frjv6mFTa0Psadr0MgIX9fb4Be5Y-list.jpeg","type":0}],"author":{"authorId":"48125b70-63e2-345b-bbb7-027f708eba24","name":"于小戈","avatar":"http://cdn.yuezhixing.cn/Fl5JHyT2W8Mb9WSMxj25Qx-RVX4A","image":"http://cdn.yuezhixing.cn/o_19rhmvh03je61c4ng27e8n1osg7.jpg","logo":null,"introduction":"有关任性痞女的一切 倔脾气 零容忍 不怕来战","contactType":1,"contactId":"yuxiaoge1014","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":230962,"like":0,"dislike":0,"comment":0,"favorite":5,"share":0}},"featuredArticle":{"publishTime":1459008000000,"priority":31190400},"category":{"categoryId":43,"name":"彩妆","englishName":"cosmetics","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/cosmetics@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":1,"name":"风尚","englishName":"Fashion","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_large@2x.png","color":"#F83648","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_bg@2x.png"}},"priority":31190400,"article":{"articleId":"232133df-9ab2-3911-a695-c8273c06540c","title":"好货也能很平价，问题是你会选吗？","summary":"和最懂生活的\"于小戈\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/Frjv6mFTa0Psadr0MgIX9fb4Be5Y","renderType":0,"url":"http://www.meitianapp.com/app/article/232133df-9ab2-3911-a695-c8273c06540c","weblink":"http://www.meitianapp.com/wap/article/232133df-9ab2-3911-a695-c8273c06540c","publishTime":1459159200000,"createdTime":1458719452000,"modifiedTime":1458719452000,"articleStats":{"read":105237,"like":87,"dislike":0,"comment":12,"favorite":133,"share":17},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1aemours2hab101i7nq8ml12p81f.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aemours2hab101i7nq8ml12p81f.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1aempa2b41l6211aof51qbc4jk7.jpg-list.jpeg","type":0}],"author":{"authorId":"2b9cdebb-444d-3b2f-a838-0860104f0573","name":"蓝风童","avatar":"http://cdn.yuezhixing.cn/o_1a62cn84r57410kt4pl1olk1r8d7.jpeg","image":"http://cdn.yuezhixing.cn/o_1a6kjrpsr1uqcd4319rd1ja74nv7.jpeg","logo":null,"introduction":"时常猫在家里，画画，读书。","contactType":1,"contactId":"保密","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":82885,"like":0,"dislike":0,"comment":0,"favorite":0,"share":0}},"featuredArticle":{"publishTime":1458921600000,"priority":31104000},"category":{"categoryId":25,"name":"目的地","englishName":"tourist destination","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/tourist_destination@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":4,"name":"旅游","englishName":"Tourism","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/tourism@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/tourism_large@2x.png","color":"#0BC2F5","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/tourism_bg@2x.png"}},"priority":31104000,"article":{"articleId":"7ca6e5c1-510a-499a-be79-d8dbcf6ece32","title":"乐游奈良公园，生于1880年的春色","summary":"和最懂生活的\"蓝风童\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1aempa2b41l6211aof51qbc4jk7.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/7ca6e5c1-510a-499a-be79-d8dbcf6ece32","weblink":"http://www.meitianapp.com/wap/article/7ca6e5c1-510a-499a-be79-d8dbcf6ece32","publishTime":1460109600000,"createdTime":1458921600000,"modifiedTime":1458906985000,"articleStats":{"read":66177,"like":31,"dislike":0,"comment":1,"favorite":29,"share":16},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1aejpevee4h6168th7h14q374o7.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aejpevee4h6168th7h14q374o7.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1aejp7i6m1cqnqrsfkf3a415m81p.jpg-list.jpeg","type":0}],"author":{"authorId":"910e8da8-f703-377d-ba4a-382e270f19ce","name":"左加菲","avatar":"http://cdn.yuezhixing.cn/Ftl0GVkPpoAhEZIcfwkMFP7Q78rX","image":"http://cdn.yuezhixing.cn/o_19um9eb5413ju1ptbt5c1c0i1cukc.jpg","logo":null,"introduction":"美是难的。自然是最伟大的设计师。\r\n","contactType":1,"contactId":"zuojiafei_salon","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":22025,"like":0,"dislike":0,"comment":0,"favorite":1,"share":0}},"featuredArticle":{"publishTime":1458835200000,"priority":31017600},"category":{"categoryId":5,"name":"配饰","englishName":"accessory","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/accessory@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":1,"name":"风尚","englishName":"Fashion","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_large@2x.png","color":"#F83648","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_bg@2x.png"}},"priority":31017600,"article":{"articleId":"34c79a63-4946-4b81-9971-384832794af0","title":"全宇宙最起范儿的宽边帽","summary":"和最懂生活的\"左加菲\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1aejp7i6m1cqnqrsfkf3a415m81p.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/34c79a63-4946-4b81-9971-384832794af0","weblink":"http://www.meitianapp.com/wap/article/34c79a63-4946-4b81-9971-384832794af0","publishTime":1459418400000,"createdTime":1458805080000,"modifiedTime":1458899477000,"articleStats":{"read":89827,"like":36,"dislike":0,"comment":3,"favorite":41,"share":21},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1ae75mlh0bp91j63h38ur91tis31.jpg-banner.jpeg","type":4},{"url":"http://cdn.yuezhixing.cn/o_1ae764gfc125dogh1kguvice0i36.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1ae764gfc125dogh1kguvice0i36.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1ae75mlh0bp91j63h38ur91tis31.jpg-list.jpeg","type":0}],"author":{"authorId":"0eb06fb6-341f-3ff1-b32d-363421f3f3ed","name":"焦糖若即","avatar":"http://cdn.yuezhixing.cn/o_1a8atpuef19aorjk18e21shc12em7.jpeg","image":"http://cdn.yuezhixing.cn/o_1a8au3ahb1bq1k9r2mr1hd9rg8c.jpg","logo":null,"introduction":"欢乐总是乍现就凋零，让我们记录下最好的时光。","contactType":1,"contactId":"cheshie2177","gender":1,"contract":10,"serviceType":0,"serviceParam":null,"entityStats":{"read":15080,"like":0,"dislike":0,"comment":0,"favorite":0,"share":0}},"featuredArticle":{"publishTime":1458748800000,"priority":30931200},"category":{"categoryId":74,"name":"情感","englishName":"emotion","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":6,"name":"文艺","englishName":"Literature","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png","color":"#ACC580","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png"}},"priority":30931200,"article":{"articleId":"912d3b2a-e1c0-4a78-a7c7-afe073a51489","title":"\u201c离过婚\u201d也可以是人生赢家","summary":"和最懂生活的\"焦糖若即\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1ae75mlh0bp91j63h38ur91tis31.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/912d3b2a-e1c0-4a78-a7c7-afe073a51489","weblink":"http://www.meitianapp.com/wap/article/912d3b2a-e1c0-4a78-a7c7-afe073a51489","publishTime":1462096800000,"createdTime":1458382930000,"modifiedTime":1458382930000,"articleStats":{"read":102272,"like":70,"dislike":0,"comment":0,"favorite":45,"share":38},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1aec99ok31norl1v2ej1rme1n147.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aec99ok31norl1v2ej1rme1n147.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1aec7n02d19js1iae4d414l236mr.jpg-list.jpeg","type":0}],"author":{"authorId":"763d72b2-633c-3592-9860-e766c7da2588","name":"我看起来很好吃","avatar":"http://cdn.yuezhixing.cn/FnQGroSSinjP8RPlCoK1iUAFZ34r","image":"http://cdn.yuezhixing.cn/o_1a6agbr421gj914b0cpa180a1l6c7.jpg","logo":null,"introduction":"寻找简单有趣的料理方法，喜欢好玩的事物，在你疲惫的时候，暖心暖胃。","contactType":1,"contactId":"welovecooking2015 ","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":83526,"like":0,"dislike":0,"comment":0,"favorite":0,"share":0}},"featuredArticle":{"publishTime":1458662400000,"priority":30844800},"category":{"categoryId":15,"name":"零食","englishName":"snack","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/snack@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":2,"name":"美食","englishName":"Delicacy","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy_large@2x.png","color":"#FFC000","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy_bg@2x.png"}},"priority":30844800,"article":{"articleId":"425d04c6-8c4b-49e9-bc42-ba3587a98fa2","title":"食樱最风雅","summary":"和最懂生活的\"我看起来很好吃\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1aec7n02d19js1iae4d414l236mr.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/425d04c6-8c4b-49e9-bc42-ba3587a98fa2","weblink":"http://www.meitianapp.com/wap/article/425d04c6-8c4b-49e9-bc42-ba3587a98fa2","publishTime":1429891200000,"createdTime":1458554156000,"modifiedTime":1458554156000,"articleStats":{"read":81694,"like":54,"dislike":0,"comment":3,"favorite":58,"share":42},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1aec6iqun18vg1jbgu7ubr4oh7.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aec6iqun18vg1jbgu7ubr4oh7.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/Fiyd3yWVDjXvhPORoVttW8jsvuaw-list.jpeg","type":0}],"author":{"authorId":"41d788a3-dfd4-3f14-a219-418ec8c3e3ba","name":"黎贝卡的异想世界","avatar":"http://cdn.yuezhixing.cn/FhYlZlJhuh4W3MUrbO7mNeB6rhht","image":"http://cdn.yuezhixing.cn/o_19m5970paot9u571osrjub2eo7.jpg","logo":null,"introduction":"让时尚更有趣.","contactType":1,"contactId":"Miss_shopping_li","gender":1,"contract":0,"serviceType":0,"serviceParam":null,"entityStats":{"read":853306,"like":0,"dislike":0,"comment":0,"favorite":31,"share":0}},"featuredArticle":{"publishTime":1458576000000,"priority":30758400},"category":{"categoryId":1,"name":"风尚","englishName":"cosmetics","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/cosmetics@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":1,"name":"风尚","englishName":"Fashion","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_large@2x.png","color":"#F83648","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_bg@2x.png"}},"priority":30758400,"article":{"articleId":"e9c0e946-6f16-32a4-9390-98f4cae988d3","title":"教科书式的白富美人生是什么样子？","summary":"和最懂生活的\"黎贝卡的异想世界\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/Fiyd3yWVDjXvhPORoVttW8jsvuaw","renderType":0,"url":"http://www.meitianapp.com/app/article/e9c0e946-6f16-32a4-9390-98f4cae988d3","weblink":"http://www.meitianapp.com/wap/article/e9c0e946-6f16-32a4-9390-98f4cae988d3","publishTime":1461189600000,"createdTime":1458550960000,"modifiedTime":1458550960000,"articleStats":{"read":131568,"like":86,"dislike":0,"comment":7,"favorite":84,"share":41},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1advfui0rdta1p83o537upfuk1f.jpg-banner.jpeg","type":4},{"url":"http://cdn.yuezhixing.cn/o_1advhdvk21oil1137lakpk4gkv7.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1advhdvk21oil1137lakpk4gkv7.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1advfui0rdta1p83o537upfuk1f.jpg-list.jpeg","type":0}],"author":{"authorId":"93fa1325-e4df-38a4-b1de-3a25ec00a702","name":"香水那些事儿","avatar":"http://cdn.yuezhixing.cn/FiqLlpUtctVo3hFtj6uN2rarn7vO","image":"http://cdn.yuezhixing.cn/o_1a6ah2kt9ho6hss1hnv15diut97.jpg","logo":null,"introduction":"专供聊香水,副职说穿搭、侃八卦.","contactType":1,"contactId":"perfume_story","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":127149,"like":0,"dislike":0,"comment":0,"favorite":9,"share":0}},"featuredArticle":{"publishTime":1458489600000,"priority":30672000},"category":{"categoryId":7,"name":"香水","englishName":"perfume","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/perfume@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":1,"name":"风尚","englishName":"Fashion","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_large@2x.png","color":"#F83648","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_bg@2x.png"}},"priority":30672000,"article":{"articleId":"64d3456e-8f31-41a3-b053-a096c51d5593","title":"这些香水，不吃土也能买！","summary":"和最懂生活的\"香水那些事儿\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1advfui0rdta1p83o537upfuk1f.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/64d3456e-8f31-41a3-b053-a096c51d5593","weblink":"http://www.meitianapp.com/wap/article/64d3456e-8f31-41a3-b053-a096c51d5593","publishTime":1459807200000,"createdTime":1458489600000,"modifiedTime":1458126133000,"articleStats":{"read":116380,"like":102,"dislike":0,"comment":3,"favorite":197,"share":27},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1ae6o0fc31o9tdvcp14q3ehs17.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1ae6o0fc31o9tdvcp14q3ehs17.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/Fr9YUUhoBjLmTV62ONiyq7jsvaWV-list.jpeg","type":0}],"author":{"authorId":"48125b70-63e2-345b-bbb7-027f708eba24","name":"于小戈","avatar":"http://cdn.yuezhixing.cn/Fl5JHyT2W8Mb9WSMxj25Qx-RVX4A","image":"http://cdn.yuezhixing.cn/o_19rhmvh03je61c4ng27e8n1osg7.jpg","logo":null,"introduction":"有关任性痞女的一切 倔脾气 零容忍 不怕来战","contactType":1,"contactId":"yuxiaoge1014","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":230962,"like":0,"dislike":0,"comment":0,"favorite":5,"share":0}},"featuredArticle":{"publishTime":1458403200000,"priority":30585600},"category":{"categoryId":3,"name":"时装","englishName":"costume","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/costume@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":1,"name":"风尚","englishName":"Fashion","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_large@2x.png","color":"#F83648","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_bg@2x.png"}},"priority":30585600,"article":{"articleId":"92c131e4-94b9-3f70-a914-4be25644f303","title":"这些小众爆款，你怎能叫不出名字？","summary":"和最懂生活的\"于小戈\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/Fr9YUUhoBjLmTV62ONiyq7jsvaWV","renderType":0,"url":"http://www.meitianapp.com/app/article/92c131e4-94b9-3f70-a914-4be25644f303","weblink":"http://www.meitianapp.com/wap/article/92c131e4-94b9-3f70-a914-4be25644f303","publishTime":1459137600000,"createdTime":1458367986000,"modifiedTime":1458367986000,"articleStats":{"read":138422,"like":47,"dislike":0,"comment":3,"favorite":72,"share":16},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1ae528lcv10to1lvh2f1tec1fmv28.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1ae528lcv10to1lvh2f1tec1fmv28.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1ae4vh51i1kk18g31a9j1tdi1crl10.jpg-list.jpeg","type":0}],"author":{"authorId":"b9393d4f-8757-376e-a48d-4fca33dcdafa","name":"藏木Qinni","avatar":"http://cdn.yuezhixing.cn/FlI-OB0W-EMGIaXYJsewXFBn3wWj","image":"http://cdn.yuezhixing.cn/o_1a2hkf46tbl87lf5g81bv07lt7.jpg","logo":null,"introduction":"在自己渺小而微不足道的人生里去努力做一枚人生体验者。","contactType":1,"contactId":"zangmu_bazi","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":22775,"like":0,"dislike":0,"comment":0,"favorite":2,"share":0}},"featuredArticle":{"publishTime":1458316800000,"priority":30499200},"category":{"categoryId":27,"name":"格物","englishName":"office goods","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/office_goods@2x.png","image":null,"priority":3,"categoryGroup":{"categoryGroupId":5,"name":"格物","englishName":"Goods","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png","color":"#B574C3","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png"}},"priority":30499200,"article":{"articleId":"33b6a89c-0594-44b5-8bf8-c8cd2f575a71","title":"一片叶子的自然笔记","summary":"和最懂生活的\"藏木Qinni\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1ae4vh51i1kk18g31a9j1tdi1crl10.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/33b6a89c-0594-44b5-8bf8-c8cd2f575a71","weblink":"http://www.meitianapp.com/wap/article/33b6a89c-0594-44b5-8bf8-c8cd2f575a71","publishTime":1460844000000,"createdTime":1458316800000,"modifiedTime":1458311963000,"articleStats":{"read":101843,"like":105,"dislike":0,"comment":4,"favorite":120,"share":50},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1adunivteq8r127g1bjj1s2cnok7.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1adunivteq8r127g1bjj1s2cnok7.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1adulu8e11irb16v51qcejlph1815.png-list.jpeg","type":0}],"author":{"authorId":"3770facc-3caf-398e-a859-8b5ae44e1d42","name":"陈秋妤","avatar":"http://cdn.yuezhixing.cn/FvtYkFlmtYS1IxqJ3Uatelj9zXTK","image":"http://cdn.yuezhixing.cn/o_19nis2abk2an1pvkpb9127e1hac.jpg","logo":null,"introduction":"味蕾有脚，带你找到为你下厨那人的好。","contactType":1,"contactId":"Ann673512852","gender":0,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":13013,"like":0,"dislike":0,"comment":0,"favorite":0,"share":0}},"featuredArticle":{"publishTime":1458230400000,"priority":30412800},"category":{"categoryId":8,"name":"美食","englishName":"tea","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/tea@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":2,"name":"美食","englishName":"Delicacy","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy_large@2x.png","color":"#FFC000","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/delicacy_bg@2x.png"}},"priority":30412800,"article":{"articleId":"773981e7-f3f0-444c-abe1-eb2a37c4285e","title":"想起马齿苋","summary":"和最懂生活的\"陈秋妤\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1adulu8e11irb16v51qcejlph1815.png","renderType":0,"url":"http://www.meitianapp.com/app/article/773981e7-f3f0-444c-abe1-eb2a37c4285e","weblink":"http://www.meitianapp.com/wap/article/773981e7-f3f0-444c-abe1-eb2a37c4285e","publishTime":1460066400000,"createdTime":1458230400000,"modifiedTime":1458111435000,"articleStats":{"read":86677,"like":48,"dislike":0,"comment":7,"favorite":36,"share":35},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/FnYvSdD1hVSfNmKcvCfeyPANKI5I-banner.jpeg","type":4},{"url":"http://cdn.yuezhixing.cn/o_1adv9lvanup610fmqcplov1dvq7.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1adv9lvanup610fmqcplov1dvq7.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/FnYvSdD1hVSfNmKcvCfeyPANKI5I-list.jpeg","type":0}],"author":{"authorId":"4e2af50a-25da-3653-9722-4a0fbcb5a5c4","name":"时尚芭莎","avatar":"http://cdn.yuezhixing.cn/Fq8doO6rB0Q1Vyv10bWICxziqlWK","image":null,"logo":null,"introduction":"《时尚芭莎》杂志社有限公司","contactType":1,"contactId":"bazaar-china","gender":0,"contract":0,"serviceType":0,"serviceParam":null,"entityStats":{"read":1571393,"like":0,"dislike":0,"comment":0,"favorite":30,"share":0}},"featuredArticle":{"publishTime":1458144000000,"priority":30326400},"category":{"categoryId":45,"name":"美体","englishName":"body","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/body@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":1,"name":"风尚","englishName":"Fashion","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_large@2x.png","color":"#F83648","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_bg@2x.png"}},"priority":30326400,"article":{"articleId":"151bb546-9171-394f-b146-9a76e2a4f014","title":"快来Get比马甲线更狠的\u201cA4腰\u201d！","summary":"和最懂生活的\"时尚芭莎\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/FnYvSdD1hVSfNmKcvCfeyPANKI5I","renderType":0,"url":"http://www.meitianapp.com/app/article/151bb546-9171-394f-b146-9a76e2a4f014","weblink":"http://www.meitianapp.com/wap/article/151bb546-9171-394f-b146-9a76e2a4f014","publishTime":1458144000000,"createdTime":1458144000000,"modifiedTime":1458118011000,"articleStats":{"read":143863,"like":105,"dislike":0,"comment":3,"favorite":151,"share":98},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1adsrmdsd1r081ar11nrfnta11gv7.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1adsrmdsd1r081ar11nrfnta11gv7.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1adsqjvf4pdsgp519bu5rf1e9pc.jpg-list.jpeg","type":0}],"author":{"authorId":"6dc577ff-1f8c-3770-86b2-3732cd10ee31","name":"厨花君","avatar":"http://cdn.yuezhixing.cn/FoAwCtBykc9ICW2EnYKL_h2FWQoa","image":"http://cdn.yuezhixing.cn/o_19nit83uejh0u212il1f0015t0c.jpg","logo":null,"introduction":"有地，有情怀，有身材，有胃口的四有新农民，提倡食赏兼具的园艺生活方式。","contactType":1,"contactId":"厨房花园","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":42624,"like":0,"dislike":0,"comment":0,"favorite":2,"share":0}},"featuredArticle":{"publishTime":1458057600000,"priority":30240000},"category":{"categoryId":23,"name":"植物","englishName":"aroma","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/aroma@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":3,"name":"家居","englishName":"House","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/house@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/house_large@2x.png","color":"#00DEBD","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/house_bg@2x.png"}},"priority":30240000,"article":{"articleId":"95741105-e1b3-4f51-83b5-d20177a1bb26","title":"初春插花，要插\u201c开花的大树枝\u201d","summary":"和最懂生活的\"厨花君\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1adsqjvf4pdsgp519bu5rf1e9pc.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/95741105-e1b3-4f51-83b5-d20177a1bb26","weblink":"http://www.meitianapp.com/wap/article/95741105-e1b3-4f51-83b5-d20177a1bb26","publishTime":1429891200000,"createdTime":1458057600000,"modifiedTime":1458036315000,"articleStats":{"read":94045,"like":79,"dislike":0,"comment":7,"favorite":59,"share":63},"tags":[]}},{"image":[{"url":"http://cdn.yuezhixing.cn/o_1adajgf452331ca51ack1lvnt047.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1adajgf452331ca51ack1lvnt047.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1adagte7r2c1rtueu611l41ttr15.jpg-list.jpeg","type":0}],"author":{"authorId":"d9310f3b-ea1b-391b-8da1-e214a5ed9bdd","name":"Sophia王","avatar":"http://cdn.yuezhixing.cn/o_1acm2orjsn8l1bct5f41ne5297.jpg","image":"http://cdn.yuezhixing.cn/o_1acm2p1i2191a12un5ipmfdnj9c.jpg","logo":null,"introduction":"头可断，发型不可乱！","contactType":1,"contactId":"保密","gender":1,"contract":1,"serviceType":0,"serviceParam":null,"entityStats":{"read":38912,"like":0,"dislike":0,"comment":0,"favorite":0,"share":0}},"featuredArticle":{"publishTime":1457971200000,"priority":30153600},"category":{"categoryId":47,"name":"美发","englishName":"hairdressing","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":1,"name":"风尚","englishName":"Fashion","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_large@2x.png","color":"#F83648","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/fashion_bg@2x.png"}},"priority":30153600,"article":{"articleId":"38b6b439-e926-47a3-b472-1acd815fb110","title":"梳个半扎式，让自己美得理直气壮","summary":"和最懂生活的\"Sophia王\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1adagte7r2c1rtueu611l41ttr15.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/38b6b439-e926-47a3-b472-1acd815fb110","weblink":"http://www.meitianapp.com/wap/article/38b6b439-e926-47a3-b472-1acd815fb110","publishTime":1458381600000,"createdTime":1457971200000,"modifiedTime":1458011679000,"articleStats":{"read":133381,"like":74,"dislike":0,"comment":14,"favorite":107,"share":76},"tags":[]}}]
     * next : 30067200
     */

    private int status;
    private int next;
    /**
     * image : [{"url":"http://cdn.yuezhixing.cn/o_1afbuursvdjevc0gj71l68tl27.jpg-banner.jpeg","type":4},{"url":"http://cdn.yuezhixing.cn/o_1aff4sr1s14ik1skk8i7ppu183v7.jpg-top.jpeg","type":3},{"url":"http://cdn.yuezhixing.cn/o_1aff4vhi07iotbje1h1aqtpeph.jpg-homepage.jpeg","type":2},{"type":6,"url":"http://cdn.yuezhixing.cn/o_1aff4vhi07iotbje1h1aqtpeph.jpg-hp.thumbnail.jpeg"},{"url":"http://cdn.yuezhixing.cn/o_1aff4uav11ta51denbus1qke1s4sc.jpg-focus.jpeg","type":1},{"url":"http://cdn.yuezhixing.cn/o_1afbuursvdjevc0gj71l68tl27.jpg-list.jpeg","type":0}]
     * author : {"authorId":"cd451b05-4975-4c56-9305-63d413924e9a","name":"郑小黑","avatar":"http://cdn.yuezhixing.cn/o_1afgd0i08igo18u32kq1lppmem7.jpg","image":"http://cdn.yuezhixing.cn/o_1afgdbgr71ci11j4movc1btg1vsac.jpg","logo":null,"introduction":"时尚网娱乐编辑。Waiting for a feeling to come and close your eyes.That will shine your mind.","contactType":1,"contactId":"18801490622","gender":1,"contract":0,"serviceType":0,"serviceParam":null,"entityStats":{"read":19231193,"like":0,"dislike":0,"comment":0,"favorite":5,"share":0}}
     * featuredArticle : {"publishTime":1459699200000,"priority":31881600}
     * category : {"categoryId":56,"name":"音乐","englishName":"music","icon":"http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png","image":null,"priority":0,"categoryGroup":{"categoryGroupId":6,"name":"文艺","englishName":"Literature","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png","color":"#ACC580","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png"}}
     * priority : 31881600
     * article : {"articleId":"68588ac6-7096-4ad5-b489-cfe07582f9fa","title":"美好的你今天不听 CNBLUE ，就会错过 16 年最棒的乐队！","summary":"和最懂生活的\"郑小黑\"一起，「每天」遇见更好的自己。","thumbnail":"http://cdn.yuezhixing.cn/o_1afbuursvdjevc0gj71l68tl27.jpg","renderType":0,"url":"http://www.meitianapp.com/app/article/68588ac6-7096-4ad5-b489-cfe07582f9fa","weblink":"http://www.meitianapp.com/wap/article/68588ac6-7096-4ad5-b489-cfe07582f9fa","publishTime":1459727700000,"createdTime":1459616552000,"modifiedTime":1459731764000,"articleStats":{"read":63402,"like":37,"dislike":0,"comment":1,"favorite":25,"share":13},"tags":[]}
     */

    private List<ResultBean> result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * authorId : cd451b05-4975-4c56-9305-63d413924e9a
         * name : 郑小黑
         * avatar : http://cdn.yuezhixing.cn/o_1afgd0i08igo18u32kq1lppmem7.jpg
         * image : http://cdn.yuezhixing.cn/o_1afgdbgr71ci11j4movc1btg1vsac.jpg
         * logo : null
         * introduction : 时尚网娱乐编辑。Waiting for a feeling to come and close your eyes.That will shine your mind.
         * contactType : 1
         * contactId : 18801490622
         * gender : 1
         * contract : 0
         * serviceType : 0
         * serviceParam : null
         * entityStats : {"read":19231193,"like":0,"dislike":0,"comment":0,"favorite":5,"share":0}
         */

        private AuthorBean author;
        /**
         * publishTime : 1459699200000
         * priority : 31881600
         */

        private FeaturedArticleBean featuredArticle;
        /**
         * categoryId : 56
         * name : 音乐
         * englishName : music
         * icon : http://7xizes.com1.z0.glb.clouddn.com/@/v1/icon/i/category/hairdressing@2x.png
         * image : null
         * priority : 0
         * categoryGroup : {"categoryGroupId":6,"name":"文艺","englishName":"Literature","icon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png","largeIcon":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png","color":"#ACC580","image":"http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png"}
         */

        private CategoryBean category;
        private int priority;
        /**
         * articleId : 68588ac6-7096-4ad5-b489-cfe07582f9fa
         * title : 美好的你今天不听 CNBLUE ，就会错过 16 年最棒的乐队！
         * summary : 和最懂生活的"郑小黑"一起，「每天」遇见更好的自己。
         * thumbnail : http://cdn.yuezhixing.cn/o_1afbuursvdjevc0gj71l68tl27.jpg
         * renderType : 0
         * url : http://www.meitianapp.com/app/article/68588ac6-7096-4ad5-b489-cfe07582f9fa
         * weblink : http://www.meitianapp.com/wap/article/68588ac6-7096-4ad5-b489-cfe07582f9fa
         * publishTime : 1459727700000
         * createdTime : 1459616552000
         * modifiedTime : 1459731764000
         * articleStats : {"read":63402,"like":37,"dislike":0,"comment":1,"favorite":25,"share":13}
         * tags : []
         */

        private ArticleBean article;
        /**
         * url : http://cdn.yuezhixing.cn/o_1afbuursvdjevc0gj71l68tl27.jpg-banner.jpeg
         * type : 4
         */

        private List<ImageBean> image;

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public FeaturedArticleBean getFeaturedArticle() {
            return featuredArticle;
        }

        public void setFeaturedArticle(FeaturedArticleBean featuredArticle) {
            this.featuredArticle = featuredArticle;
        }

        public CategoryBean getCategory() {
            return category;
        }

        public void setCategory(CategoryBean category) {
            this.category = category;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public ArticleBean getArticle() {
            return article;
        }

        public void setArticle(ArticleBean article) {
            this.article = article;
        }

        public List<ImageBean> getImage() {
            return image;
        }

        public void setImage(List<ImageBean> image) {
            this.image = image;
        }

        public static class AuthorBean {
            private String authorId;
            private String name;
            private String avatar;
            private String image;
            private Object logo;
            private String introduction;
            private int contactType;
            private String contactId;
            private int gender;
            private int contract;
            private int serviceType;
            private Object serviceParam;
            /**
             * read : 19231193
             * like : 0
             * dislike : 0
             * comment : 0
             * favorite : 5
             * share : 0
             */

            private EntityStatsBean entityStats;

            public String getAuthorId() {
                return authorId;
            }

            public void setAuthorId(String authorId) {
                this.authorId = authorId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public Object getLogo() {
                return logo;
            }

            public void setLogo(Object logo) {
                this.logo = logo;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public int getContactType() {
                return contactType;
            }

            public void setContactType(int contactType) {
                this.contactType = contactType;
            }

            public String getContactId() {
                return contactId;
            }

            public void setContactId(String contactId) {
                this.contactId = contactId;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public int getContract() {
                return contract;
            }

            public void setContract(int contract) {
                this.contract = contract;
            }

            public int getServiceType() {
                return serviceType;
            }

            public void setServiceType(int serviceType) {
                this.serviceType = serviceType;
            }

            public Object getServiceParam() {
                return serviceParam;
            }

            public void setServiceParam(Object serviceParam) {
                this.serviceParam = serviceParam;
            }

            public EntityStatsBean getEntityStats() {
                return entityStats;
            }

            public void setEntityStats(EntityStatsBean entityStats) {
                this.entityStats = entityStats;
            }

            public static class EntityStatsBean {
                private int read;
                private int like;
                private int dislike;
                private int comment;
                private int favorite;
                private int share;

                public int getRead() {
                    return read;
                }

                public void setRead(int read) {
                    this.read = read;
                }

                public int getLike() {
                    return like;
                }

                public void setLike(int like) {
                    this.like = like;
                }

                public int getDislike() {
                    return dislike;
                }

                public void setDislike(int dislike) {
                    this.dislike = dislike;
                }

                public int getComment() {
                    return comment;
                }

                public void setComment(int comment) {
                    this.comment = comment;
                }

                public int getFavorite() {
                    return favorite;
                }

                public void setFavorite(int favorite) {
                    this.favorite = favorite;
                }

                public int getShare() {
                    return share;
                }

                public void setShare(int share) {
                    this.share = share;
                }
            }
        }

        public static class FeaturedArticleBean {
            private long publishTime;
            private int priority;

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }
        }

        public static class CategoryBean {
            private int categoryId;
            private String name;
            private String englishName;
            private String icon;
            private Object image;
            private int priority;
            /**
             * categoryGroupId : 6
             * name : 文艺
             * englishName : Literature
             * icon : http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods@2x.png
             * largeIcon : http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_large@2x.png
             * color : #ACC580
             * image : http://7xizes.com2.z0.glb.qiniucdn.com/@/v1/icon/i/categoryGroup/goods_bg@2x.png
             */

            private CategoryGroupBean categoryGroup;

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEnglishName() {
                return englishName;
            }

            public void setEnglishName(String englishName) {
                this.englishName = englishName;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Object getImage() {
                return image;
            }

            public void setImage(Object image) {
                this.image = image;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }

            public CategoryGroupBean getCategoryGroup() {
                return categoryGroup;
            }

            public void setCategoryGroup(CategoryGroupBean categoryGroup) {
                this.categoryGroup = categoryGroup;
            }

            public static class CategoryGroupBean {
                private int categoryGroupId;
                private String name;
                private String englishName;
                private String icon;
                private String largeIcon;
                private String color;
                private String image;

                public int getCategoryGroupId() {
                    return categoryGroupId;
                }

                public void setCategoryGroupId(int categoryGroupId) {
                    this.categoryGroupId = categoryGroupId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEnglishName() {
                    return englishName;
                }

                public void setEnglishName(String englishName) {
                    this.englishName = englishName;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getLargeIcon() {
                    return largeIcon;
                }

                public void setLargeIcon(String largeIcon) {
                    this.largeIcon = largeIcon;
                }

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }
            }
        }

        public static class ArticleBean {
            private String articleId;
            private String title;
            private String summary;
            private String thumbnail;
            private int renderType;
            private String url;
            private String weblink;
            private long publishTime;
            private long createdTime;
            private long modifiedTime;
            /**
             * read : 63402
             * like : 37
             * dislike : 0
             * comment : 1
             * favorite : 25
             * share : 13
             */

            private ArticleStatsBean articleStats;
            private List<?> tags;

            public String getArticleId() {
                return articleId;
            }

            public void setArticleId(String articleId) {
                this.articleId = articleId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public int getRenderType() {
                return renderType;
            }

            public void setRenderType(int renderType) {
                this.renderType = renderType;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getWeblink() {
                return weblink;
            }

            public void setWeblink(String weblink) {
                this.weblink = weblink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public long getCreatedTime() {
                return createdTime;
            }

            public void setCreatedTime(long createdTime) {
                this.createdTime = createdTime;
            }

            public long getModifiedTime() {
                return modifiedTime;
            }

            public void setModifiedTime(long modifiedTime) {
                this.modifiedTime = modifiedTime;
            }

            public ArticleStatsBean getArticleStats() {
                return articleStats;
            }

            public void setArticleStats(ArticleStatsBean articleStats) {
                this.articleStats = articleStats;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }

            public static class ArticleStatsBean {
                private int read;
                private int like;
                private int dislike;
                private int comment;
                private int favorite;
                private int share;

                public int getRead() {
                    return read;
                }

                public void setRead(int read) {
                    this.read = read;
                }

                public int getLike() {
                    return like;
                }

                public void setLike(int like) {
                    this.like = like;
                }

                public int getDislike() {
                    return dislike;
                }

                public void setDislike(int dislike) {
                    this.dislike = dislike;
                }

                public int getComment() {
                    return comment;
                }

                public void setComment(int comment) {
                    this.comment = comment;
                }

                public int getFavorite() {
                    return favorite;
                }

                public void setFavorite(int favorite) {
                    this.favorite = favorite;
                }

                public int getShare() {
                    return share;
                }

                public void setShare(int share) {
                    this.share = share;
                }
            }
        }

        public static class ImageBean {
            private String url;
            private int type;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
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
