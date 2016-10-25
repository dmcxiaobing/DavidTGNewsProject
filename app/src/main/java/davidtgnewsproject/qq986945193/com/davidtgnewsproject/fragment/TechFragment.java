package davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment;

import android.os.Bundle;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import davidtgnewsproject.qq986945193.com.davidtgnewsproject.R;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.bean.SportsBean;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.bean.TechBean;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.callback.OkHttpStopCallback;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.constants.Urls;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.pullRecycleView.BaseViewHolder;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.pullRecycleView.PullRecycler;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.pullRecycleView.base.BaseListFragment;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.pullRecycleView.layoutmanager.ILayoutManager;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.pullRecycleView.layoutmanager.MyGridLayoutManager;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.pullRecycleView.layoutmanager.MyLinearLayoutManager;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.pullRecycleView.layoutmanager.MyStaggeredGridLayoutManager;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.PicassoWithImageUtils;
import okhttp3.Request;
import okhttp3.Response;


/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */

/**
 * 科技创新fragment
 */
public class TechFragment extends BaseListFragment<TechBean.NewslistBean> {
    //页数
    int pageIndex = 1;
    private int random;

    @Override
    protected BaseViewHolder getViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listview_introduce, parent, false);
        return new SportsViewHolder(view);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycler.setRefreshing();
    }

    @Override
    protected ILayoutManager getLayoutManager() {

        /**
         * 这里利用的0 1 2的随机数进行设置item的列数的。
         *
         * random = 0 则表示为一列， 2则是两列。为3则是3列。我这里直接写成1列
         *
         * https://github.com/QQ986945193
         */
//        random = new Random().nextInt(3);
        random = new Random().nextInt(1);
        switch (random) {
            case 0:
                return new MyLinearLayoutManager(getContext());
            case 1:
                return new MyGridLayoutManager(getContext(), 2);
            case 2:
                return new MyStaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        }
        return super.getLayoutManager();
    }


    @Override
    public void onRefresh(final int action) {
        if (mDataList == null) {
            mDataList = new ArrayList<TechBean.NewslistBean>();
        }

        if (action == PullRecycler.ACTION_PULL_TO_REFRESH) {
            pageIndex = 1;
        } else if (action == PullRecycler.ACTION_LOAD_MORE_REFRESH) {
            pageIndex++;

        }
        String url = Urls.TECH + "?num=15" + "&page=" + pageIndex;
        if (isAdded()) {
            okHttpUtils.get(url, null, new OkHttpStopCallback<TechBean>() {

                @Override
                public void onSuccess(Response response, TechBean mTechBean) {
                    if (mTechBean != null) {
                        if (mTechBean.getNewslist() != null) {
                            if (action == PullRecycler.ACTION_PULL_TO_REFRESH) {
                                mDataList.clear();
                            }
                            recycler.enableLoadMore(true);
                            mDataList.addAll(mTechBean.getNewslist());
                            adapter.notifyDataSetChanged();


                        } else {
                            recycler.enableLoadMore(false);

                        }
                    }

                    recycler.onRefreshCompleted();


                }

                @Override
                public void onFailure(Request request, Exception e) {
                    super.onFailure(request, e);
                    recycler.onRefreshCompleted();

                }
            });
        }

    }

    class SportsViewHolder extends BaseViewHolder {

        ImageView mSampleListItemImg;
        TextView mSampleListItemLabel;
        TextView tv_desc;

        public SportsViewHolder(View itemView) {
            super(itemView);
            mSampleListItemLabel = (TextView) itemView.findViewById(R.id.tv_introduce_name);
            tv_desc = (TextView) itemView.findViewById(R.id.tv_desc);
            mSampleListItemImg = (ImageView) itemView.findViewById(R.id.iv_introduce_img);
        }

        @Override
        public void onBindViewHolder(int position) {
            mSampleListItemLabel.setText(mDataList.get(position).getTitle());
            tv_desc.setText(mDataList.get(position).getDescription());
            PicassoWithImageUtils.withImageView(mSampleListItemImg.getContext(), mDataList.get(position).getPicUrl(), mSampleListItemImg);
        }

        @Override
        public void onItemClick(View view, int position) {

        }

    }
}
