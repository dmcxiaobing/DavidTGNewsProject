package davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import davidtgnewsproject.qq986945193.com.davidtgnewsproject.R;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.adapter.FourAdapter;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.app.MyApplication;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.bean.TopListBean;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.callback.OkHttpStopCallback;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.constants.Urls;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.OkHttpUtils;
import dmax.dialog.SpotsDialog;
import okhttp3.Request;
import okhttp3.Response;


/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */
public class FourFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView recycle_news;
    private FourAdapter newsListAdapter;
    private Context context;
    private LinearLayoutManager layoutManager;
    private View view;

    private OkHttpUtils okHttpUtils = MyApplication.getApp().getOkHttpUtils();
    //页数
    int pageIndex = 1;

    private ArrayList<TopListBean.TngouBean> lists = new ArrayList<>();
    private AlertDialog githubDialog;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_four, null);
        initView(view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getData();


    }

    private void getData() {

        String url = Urls.TOP_LIST + "?id=1" + "&page=" + pageIndex + "&rows=" + "20";
        if (isAdded()) {
//            githubDialog.show();
            okHttpUtils.get(url, null, new OkHttpStopCallback<TopListBean>() {

                @Override
                public void onSuccess(Response response, TopListBean topListBean) {
                    hiddenGithubLoading();
//                    sr_refresh.setRefreshing(false);
                    if (topListBean != null) {
                        if (topListBean.getTngou() != null) {
                            lists.addAll(topListBean.getTngou());
                            newsListAdapter.setData(lists);
//                            newsListAdapter.notifyDataSetChanged();
                            if (topListBean.getTngou().size() <= 0) {
                                newsListAdapter.isShowFooter(false);
                            }
                        }
                    }


                }

                @Override
                public void onFailure(Request request, Exception e) {
                    super.onFailure(request, e);
                    hiddenGithubLoading();
//                    sr_refresh.setRefreshing(false);
                }
            });
        }

    }

    private RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() {
        private int lastVisibleItem;

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            lastVisibleItem = layoutManager.findLastVisibleItemPosition();
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            //SCROLL_STATE_IDLE
            //The RecyclerView is not currently scrolling.
            if (newState == RecyclerView.SCROLL_STATE_IDLE
                    && lastVisibleItem + 1 == newsListAdapter.getItemCount()
                    && newsListAdapter.isShowFooter()) {
                //加载更多新闻
                pageIndex += 1;
                getData();
            }

        }
    };


    private FourAdapter.OnItemClickListener onItemClickListener = new FourAdapter.OnItemClickListener() {
        @Override
        public void onItemClick(View view, int position) {
//            Intent intent = new Intent();
//            intent.setClass(getActivity(), NewsActivity.class);
//            intent.putExtra("url", newsList.get(position).getUrl());
//
//            startActivity(intent);
        }
    };


    private void initView(View view) {
        recycle_news = (RecyclerView) view.findViewById(R.id.recycle_news);
//        sr_refresh = (SwipeRefreshLayout) view.findViewById(R.id.sr_refresh);
        context = getContext();
        layoutManager = new LinearLayoutManager(context);
        newsListAdapter = new FourAdapter(context);

        newsListAdapter.setOnItemClickListener(onItemClickListener);
        recycle_news.setLayoutManager(layoutManager);
        recycle_news.setAdapter(newsListAdapter);

//        sr_refresh.setColorSchemeResources(android.R.color.holo_blue_bright,
//                android.R.color.holo_green_light, android.R.color.holo_orange_light,
//                android.R.color.holo_red_light);
//        sr_refresh.setOnRefreshListener(this);

        recycle_news.addOnScrollListener(onScrollListener);
        githubDialog = new SpotsDialog(context);

    }


    @Override
    public void onRefresh() {
        //刷新置pageIndex为0获取最新数据
//        pageIndex = 1;
//        lists.clear();
//        getData();
    }


    /**
     * 隐藏正在加载
     */
    private void hiddenGithubLoading() {
        if (githubDialog != null && githubDialog.isShowing()) {
            githubDialog.dismiss();
        }
    }


/*    <?xml version="1.0" encoding="utf-8"?>
    <android.support.v4.widget.SwipeRefreshLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/sr_refresh"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:clickable="true"
    android:orientation="vertical">

    <android.support.v7.widget.RecyclerView
    android:id="@+id/recycle_news"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:paddingTop="5dp"
    android:scrollbars="vertical"
            >

    </android.support.v7.widget.RecyclerView>


    </android.support.v4.widget.SwipeRefreshLayout>*/
}

