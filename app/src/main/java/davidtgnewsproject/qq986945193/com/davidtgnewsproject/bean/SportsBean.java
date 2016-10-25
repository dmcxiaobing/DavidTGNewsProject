package davidtgnewsproject.qq986945193.com.davidtgnewsproject.bean;

import java.util.List;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */
public class SportsBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-04-08 20:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y3.ifengimg.com/cmpp/2016/04/08/72030b9663bb84fad799b3f8338b025d_size317_w500_h350.jpg","title":"大马赛-王仪涵横扫马林进4强 田卿赵云蕾止步8强","url":"http://sports.ifeng.com/a/20160408/48396914_0.shtml"},{"ctime":"2016-04-08 20:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y0.ifengimg.com/a/2016_15/d94a1018a2168e7_size192_w550_h482.jpg","title":"宁泽涛：呕吐+发烧不得不退赛 让大家担心了","url":"http://sports.ifeng.com/a/20160408/48396972_0.shtml"},{"ctime":"2016-04-08 18:50","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y0.ifengimg.com/haina/2016_15/ead00804193ec43_w375_h500.jpg","title":"大马赛林丹惨败次局仅得4分 王仪涵胜世界第一","url":"http://sports.ifeng.com/a/20160408/48397009_0.shtml"},{"ctime":"2016-04-08 18:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y0.ifengimg.com/a/2016_15/d94a1018a2168e7_size192_w550_h482.jpg","title":"李子君晒伤腿照 网友心疼：运动员真的不容易(图)","url":"http://sports.ifeng.com/a/20160408/48396681_0.shtml"},{"ctime":"2016-04-08 16:42","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y0.ifengimg.com/haina/2016_15/ead00804193ec43_w375_h500.jpg","title":"日羽参赌二人垂泪谢罪 承认赌60余次输千万(图)","url":"http://sports.ifeng.com/a/20160408/48396696_0.shtml"},{"ctime":"2016-04-08 16:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y3.ifengimg.com/cmpp/2016/04/08/72030b9663bb84fad799b3f8338b025d_size317_w500_h350.jpg","title":"余贺新进步快因认识一人 胸口爱的文身专属于她","url":"http://sports.ifeng.com/a/20160408/48395833_0.shtml"},{"ctime":"2016-04-08 14:17","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y0.ifengimg.com/a/2016_15/d94a1018a2168e7_size192_w550_h482.jpg","title":"日本女排公布奥运资格赛20人名单 木村纱织领衔","url":"http://sports.ifeng.com/a/20160408/48395872_0.shtml"},{"ctime":"2016-04-08 12:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y3.ifengimg.com/a/2016_15/968684c2b1a963f_size71_w550_h550.jpg","title":"小德开启红土赛季 儿子现身训练场父子亲密互动","url":"http://sports.ifeng.com/a/20160408/48393432_0.shtml"},{"ctime":"2016-04-08 12:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y3.ifengimg.com/cmpp/2016/04/08/5591d86db42572b3e4a4cbd8765fbc11_size380_w500_h400.jpg","title":"福原爱曾因一句话与王励勤传绯闻 事后当面道歉","url":"http://sports.ifeng.com/a/20160408/48393603_0.shtml"},{"ctime":"2016-04-08 11:14","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/y3.ifengimg.com/a/2016_15/78980ca898c6a78_size25_w570_h366.jpg","title":"花滑最新世界排名：隋文静/韩聪第三 金博洋第13","url":"http://sports.ifeng.com/a/20160408/48394196_0.shtml"}]
     */

    private int code;
    private String msg;
    /**
     * ctime : 2016-04-08 20:00
     * description : 凤凰体育
     * picUrl : http://d.ifengimg.com/w145_h103/y3.ifengimg.com/cmpp/2016/04/08/72030b9663bb84fad799b3f8338b025d_size317_w500_h350.jpg
     * title : 大马赛-王仪涵横扫马林进4强 田卿赵云蕾止步8强
     * url : http://sports.ifeng.com/a/20160408/48396914_0.shtml
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
