package davidtgnewsproject.qq986945193.com.davidtgnewsproject.bean;

import java.util.List;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * <p/>
 * 项目名称：小冰新闻
 */
public class TopClassifyBean {

    /**
     * status : true
     * tngou : [{"description":"天狗实时事件:民生热点事件，民生热词排行 做最好的民生热点、热词提取；推送最新的民生实时事件，挖掘最新的民生热词。","id":1,"keywords":"民生热点事件 民生热词排行 天狗实时事件","name":"民生热点","seq":1,"title":"民生热点事件_民生热词排行-天狗实时事件"},{"description":"天狗实时事件:娱乐热点事件，娱乐热词排行 做最好的娱乐热点、热词提取；推送最新的娱乐实时事件，挖掘最新的娱乐热词。","id":2,"keywords":"娱乐热点事件 娱乐热词排行 天狗实时事件","name":"娱乐热点","seq":2,"title":"娱乐热点事件_娱乐热词排行-天狗实时事件"},{"description":"天狗实时事件:财经热点事件，财经热词排行 做最好的财经热点、热词提取；推送最新的财经实时事件，挖掘最新的财经热词。","id":3,"keywords":"财经热点事件 财经热词排行 天狗实时事件","name":"财经热点","seq":3,"title":"财经热点事件_财经热词排行-天狗实时事件"},{"description":"天狗实时事件:体育热点事件，体育热词排行 做最好的体育热点、热词提取；推送最新的体育实时事件，挖掘最新的体育热词。","id":4,"keywords":"体育热点事件 体育热词排行 天狗实时事件","name":"体育热点","seq":4,"title":"体育热点事件_体育热词排行-天狗实时事件"},{"description":"天狗实时事件:教育热点事件，教育热词排行 做最好的教育热点、热词提取；推送最新的教育实时事件，挖掘最新的教育热词。","id":5,"keywords":"教育热点事件 教育热词排行 天狗实时事件","name":"教育热点","seq":5,"title":"教育热点事件_教育热词排行-天狗实时事件"},{"description":"天狗实时事件:社会热点事件，社会热词排行 做最好的社会热点、热词提取；推送最新的社会实时事件，挖掘最新的社会热词。","id":6,"keywords":"社会热点事件 社会热词排行 天狗实时事件","name":"社会热点","seq":6,"title":"社会热点事件_社会热词排行-天狗实时事件"}]
     */

    private boolean status;
    /**
     * description : 天狗实时事件:民生热点事件，民生热词排行 做最好的民生热点、热词提取；推送最新的民生实时事件，挖掘最新的民生热词。
     * id : 1
     * keywords : 民生热点事件 民生热词排行 天狗实时事件
     * name : 民生热点
     * seq : 1
     * title : 民生热点事件_民生热词排行-天狗实时事件
     */

    private List<TngouBean> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<TngouBean> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouBean> tngou) {
        this.tngou = tngou;
    }

    public static class TngouBean {
        private String description;
        private int id;
        private String keywords;
        private String name;
        private int seq;
        private String title;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSeq() {
            return seq;
        }

        public void setSeq(int seq) {
            this.seq = seq;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
