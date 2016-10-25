package davidtgnewsproject.qq986945193.com.davidtgnewsproject.bean;

import java.util.List;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */
public class TechBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-04-13 12:02","description":"腾讯科技","picUrl":"http://mat1.gtimg.com/tech/00Jamesdu/2014/index/remark/2.png","title":"《连线》杂志：看扎克伯格将如何统治世界？","url":"http://tech.qq.com/a/20160413/034253.htm"},{"ctime":"2016-04-13 13:49","description":"腾讯科技","picUrl":"http://img1.gtimg.com/tech/pics/hv1/201/229/2051/133424871.jpg","title":"盘点PayPal创始人彼得&#183;泰尔崛起之路","url":"http://tech.qq.com/a/20160413/039137.htm"},{"ctime":"2016-04-13 11:54","description":"腾讯科技","picUrl":"http://img1.gtimg.com/tech/pics/hv1/207/219/2051/133422327.png","title":"滴滴的\u201c大脑\u201d将由这位人工智能科学家来掌控","url":"http://tech.qq.com/a/20160413/033541.htm"},{"ctime":"2016-04-13 11:02","description":"腾讯科技","picUrl":"http://img1.gtimg.com/tech/pics/hv1/169/209/2051/133419739.jpg","title":"这才是真相：职业黑客卖漏洞给FBI破解iPhone","url":"http://tech.qq.com/a/20160413/029243.htm"},{"ctime":"2016-04-13 11:18","description":"腾讯科技","picUrl":"http://mat1.gtimg.com/tech/00Jamesdu/2014/index/remark/2.png","title":"消费者怒了：零部件短缺Oculus或延迟数月交货","url":"http://tech.qq.com/a/20160413/030702.htm"},{"ctime":"2016-04-13 11:18","description":"腾讯科技","picUrl":"http://img1.gtimg.com/tech/pics/hv1/217/214/2051/133421062.jpg","title":"去哪儿又惹航空公司不开心 新品上线一天遭下线","url":"http://tech.qq.com/a/20160413/030709.htm"},{"ctime":"2016-04-13 10:12","description":"腾讯科技","picUrl":"http://mat1.gtimg.com/tech/00Jamesdu/2014/index/remark/2.png","title":"调查称苹果设备称霸美青少年市场 市场份额高","url":"http://tech.qq.com/a/20160413/024588.htm"},{"ctime":"2016-04-13 10:25","description":"腾讯科技","picUrl":"http://img1.gtimg.com/tech/pics/hv1/8/197/2051/133416518.jpg","title":"Messenger和WhatsApp日处理信息量是短信三倍","url":"http://tech.qq.com/a/20160413/025917.htm"},{"ctime":"2016-04-13 10:28","description":"腾讯科技","picUrl":"http://mat1.gtimg.com/tech/00Jamesdu/2014/index/remark/2.png","title":"Snapchat以惊人速度抢夺Instagram青少年用户","url":"http://tech.qq.com/a/20160413/026247.htm"},{"ctime":"2016-04-13 10:29","description":"腾讯科技","picUrl":"http://img1.gtimg.com/tech/pics/hv1/89/203/2051/133418129.jpg","title":"贝索斯：私营太空领域将重现互联网般创业热潮","url":"http://tech.qq.com/a/20160413/026382.htm"}]
     */

    private int code;
    private String msg;
    /**
     * ctime : 2016-04-13 12:02
     * description : 腾讯科技
     * picUrl : http://mat1.gtimg.com/tech/00Jamesdu/2014/index/remark/2.png
     * title : 《连线》杂志：看扎克伯格将如何统治世界？
     * url : http://tech.qq.com/a/20160413/034253.htm
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
