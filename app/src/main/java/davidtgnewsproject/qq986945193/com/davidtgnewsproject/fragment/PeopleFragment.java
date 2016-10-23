package davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import davidtgnewsproject.qq986945193.com.davidtgnewsproject.R;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.app.MyAdapter_CommonAdapter;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.app.MyApplication;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.app.ViewHolder;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.bean.TopListBean;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.callback.OkHttpStopCallback;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.constants.Urls;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.LogUtil;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.OkHttpUtils;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.PicassoWithImageUtils;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.XListviewAndTimeUtils;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.view.AutoLoadMoreListView;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.view.XListView;
import okhttp3.Response;


/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */
public class PeopleFragment extends Fragment implements AutoLoadMoreListView.OnLoadMoreListener {
    private String id;

    public PeopleFragment(String id) {
        this.id = id;
    }

    private XListView xlv_people;
    private View rootView;
    private int page = 1;
    private List<TopListBean.TngouBean> mLists = new ArrayList<>();
    private OkHttpUtils okHttpUtils = MyApplication.getApp().getOkHttpUtils();
    private MyAdapter myAdapter;

    private AutoLoadMoreListView auto_listview;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        myAdapter = new MyAdapter(getActivity(), mLists);

        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_people, container, false);

        return rootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        auto_listview = (AutoLoadMoreListView) rootView.findViewById(R.id.auto_listview);
        xlv_people = (XListView) rootView.findViewById(R.id.xlv_people);   // 支持下拉刷新
        xlv_people.setPullRefreshEnable(true);
        // 支持滚动加载
        xlv_people.setPullLoadEnable(true);
        // 自动加载
        xlv_people.setAutoLoadEnable(true);
        // IXListViewListener:监听用户两个操作 1.下拉：重新获取首页 2.滚动底部:获取下一页
        // mListView.setXListViewListener(this);
        xlv_people.setRefreshTime(XListviewAndTimeUtils.getTime());

        XListView.IXListViewListener listener = new MyIXListViewListener();
        xlv_people.setXListViewListener(listener);

        isInit = true;
//        xlv_people.setAdapter(myAdapter);
        auto_listview.setAdapter(myAdapter);
        auto_listview.setOnLoadMoreListener(this);
    }

    private boolean isEnd = true;

    /**
     * 加载更过的监听方法
     */
    @Override
    public void onLoadMore() {

        if (isEnd) {
            page++;
            getData();
        } else {
            auto_listview.showLoadComplete();
        }
    }

    class MyIXListViewListener implements XListView.IXListViewListener {
        // 下拉 返回顶部
        @Override
        public void onRefresh() {
            page = 1;
            mLists.clear();
            getData();
        }


        // 滚动 加载更多
        @Override
        public void onLoadMore() {
            page++;
            getData();

        }
    }

    private void getData() {
        String url = Urls.TOP_LIST + "?id=" + id + "&page=" + page + "&rows=" + "20";
        okHttpUtils.get(url, null, new OkHttpStopCallback<TopListBean>() {

            @Override
            public void onSuccess(Response response, TopListBean topListBean) {
                if (topListBean != null) {
                    if (topListBean.getTngou() != null) {
                        mLists.addAll(topListBean.getTngou());
                        LogUtil.E("size" + mLists.size());
                        myAdapter.notifyDataSetChanged();
                        auto_listview.onLoadMoreComplete();

                        if (page == 1) {
                            if (mLists.size() < 20) {
                                isEnd = false;
                                auto_listview.showLoadComplete();
                            }

                        } else {
                            if (topListBean.getTngou().size() < 20) {
                                isEnd = false;
                                auto_listview.showLoadComplete();
                            }
                        }

                    } else {
                        isEnd = false;
                        auto_listview.showLoadComplete();
                    }
                }

//                XListviewAndTimeUtils.stopWait(xlv_people);
            }
        });
    }


    private boolean isInit; // 是否可以开始加载数据


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        // 每次切换fragment时调用的方法
        // 相当于Fragment的onResume
        if (isVisibleToUser) {
            LogUtil.E("setUserVisibleHint22");
            showData();
        }
    }

    private void showData() {
        if (isInit) {
            isInit = false;// 加载数据完成
            page = 1;
            mLists.clear();
            getData();


        }
    }


    @Override
    public void onResume() {
        super.onResume();
        LogUtil.E("onresume");

        // 判断当前fragment是否显示
        if (getUserVisibleHint()) {
            isInit = true;
            LogUtil.E("onresume222");
            showData();
        }
    }

    private class MyAdapter extends MyAdapter_CommonAdapter<TopListBean.TngouBean> {

        public MyAdapter(Context context, List<TopListBean.TngouBean> datas) {
            super(context, datas);
            LogUtil.E("adapter" + datas.size());
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = ViewHolder.getHolder(mContext, convertView, parent,
                    R.layout.item_listview_introduce, position);
            TopListBean.TngouBean bean = mDatas.get(position);

            TextView tv_introduce_name;
            ImageView iv_introduce_img;

            tv_introduce_name = holder.getView(R.id.tv_introduce_name);
            iv_introduce_img = holder.getView(R.id.iv_introduce_img);


            tv_introduce_name.setText(bean.getTitle());
            PicassoWithImageUtils.withImageView(mContext, Urls.BASE_URL + bean.getImg(), iv_introduce_img);

            return holder.getmConvertView();
        }
    }


}
