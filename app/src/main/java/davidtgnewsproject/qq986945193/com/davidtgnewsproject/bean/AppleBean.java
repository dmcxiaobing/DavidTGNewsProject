package davidtgnewsproject.qq986945193.com.davidtgnewsproject.bean;

import java.util.List;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */
public class AppleBean {

    /**
     * code : 200
     * msg : ok
     * newslist : [{"ctime":"2015-09-14 18:50","description":"\u200b据经济之声《天下财经》报道，记者调查：\u201c兵马未动，粮草先行\u201d，iPhone6s尚未上市骗术骗局已落定。兵马未动，粮草先行今天是9月14号，距离25号苹果新款手机上市，还有12天。按照苹果中国官网报价，16GB、64GB、128BG版本iP","picUrl":"http://img.25pp.com//ppnews/zixun_img/66a/7c5/1442223727264760.jpg","title":"果粉太心急 购买iPhone6s为快人一步误入陷阱","url":"http://www.25pp.com/news/news_77627.html"},{"ctime":"2015-09-14 18:32","description":"9月13日消息，苹果iPhone6s/6s Plus如期和我们见面了，其外观让不少手持iPhone6的用户感到有些失望，不少网友还表示已经不对这一代iPhone抱有什么想法了，还是等明年的iPhone7吧。其实有这个想法的人不再少数，这不，","picUrl":"http://img.25pp.com//ppnews/zixun_img/b36/765/1442226795586876.jpg","title":"苹果iPhone7概念图曝光 艳俗的配色外加安卓金刚键","url":"http://www.25pp.com/news/news_77634.html"},{"ctime":"2015-09-14 18:10","description":"虽然苹果iPhone6s一问世，三星Galaxy S6就遭到嫌弃，而Galaxy Note5就更惨，上市信息都被抛到脑后啦！但这完全不影响三星花钱打广告讽刺苹果iPhone6s的心情。","picUrl":"http://img.25pp.com//ppnews/zixun_img/66a/7c5/1442223248414061.jpg","title":"讽刺苹果iPhone6s三星永远不迟到 这次秀无线充电","url":"http://www.25pp.com/news/news_77626.html"},{"ctime":"2015-09-14 16:51","description":"据悉，iOS9.1提升了性能表现，为开发者新增了iPhone6s中的3D Touch和Live Photos API，新增对Smart Keyboard和Apple Pencil的支持，同时，iOS9.1已经支持Unicode8，新增一系列","picUrl":"http://img.25pp.com//ppnews/zixun_img/66a/7c5/1442220744478420.jpg","title":"iOS9.1 Beta1已知Bug汇总 微信算是跪了！","url":"http://www.25pp.com/news/news_77622.html"},{"ctime":"2015-09-14 16:50","description":"科技网站Wired今日刊文称，在用上Apple Pencil之前，我一直认为这就是只手写笔而已。看着高大上的介绍视频，听Jony Ive讲着这支笔如何像只笔但又不同于任何一种笔。我在心里默念，不就是只手写笔吗？","picUrl":"http://img.25pp.com//ppnews/zixun_img/ef1/1fa/1442220284232430.jpg","title":"苹果触控笔Apple Pencil使用体验：如丝般顺滑","url":"http://www.25pp.com/news/news_77621.html"}]
     */

    private int code;
    private String msg;
    /**
     * ctime : 2015-09-14 18:50
     * description : ​据经济之声《天下财经》报道，记者调查：“兵马未动，粮草先行”，iPhone6s尚未上市骗术骗局已落定。兵马未动，粮草先行今天是9月14号，距离25号苹果新款手机上市，还有12天。按照苹果中国官网报价，16GB、64GB、128BG版本iP
     * picUrl : http://img.25pp.com//ppnews/zixun_img/66a/7c5/1442223727264760.jpg
     * title : 果粉太心急 购买iPhone6s为快人一步误入陷阱
     * url : http://www.25pp.com/news/news_77627.html
     */

    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        private String ctime;
        private String description;
        private String picUrl;
        private String title;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
