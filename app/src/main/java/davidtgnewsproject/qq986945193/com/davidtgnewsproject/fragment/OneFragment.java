package davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import davidtgnewsproject.qq986945193.com.davidtgnewsproject.R;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.LogUtil;


/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */
public class OneFragment extends Fragment {
    private List<String> stringList = new ArrayList<>();
    private List<Fragment> fragmentList = new ArrayList<>();
    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    private MyAdapter myAdapter;
    private View rootView;

    private Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        stringList.add("民生热点");
        stringList.add("娱乐热点");
        stringList.add("财经热点");
        stringList.add("体育热点");
        fragmentList.add(new MainFragment("个性推荐"));
        fragmentList.add(new MainFragment("歌单"));
        fragmentList.add(new MainFragment("主播电台"));
        fragmentList.add(new MainFragment("排行榜"));
        LogUtil.E("create");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_one, container, false);

        if (getActivity() != null) {
            mContext = getActivity();
        }
        LogUtil.E("createview");

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView(rootView);
        myAdapter = new MyAdapter(getActivity().getSupportFragmentManager());

        mviewPager.setAdapter(myAdapter);

        mTabLayout.setupWithViewPager(mviewPager);
        LogUtil.E("onActivityCreated");


        mTabLayout.setTabsFromPagerAdapter(myAdapter);
    }


    private void initView(View rootView) {
        mTabLayout = (TabLayout) rootView.findViewById(R.id.mTabLayout);
        mviewPager = (ViewPager) rootView.findViewById(R.id.mViewPager);
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return stringList.get(position);
        }
    }

    private boolean isInit; // 是否可以开始加载数据

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        // 每次切换fragment时调用的方法
        // 相当于Fragment的onResume
        LogUtil.E("setUserVisibleHint");
        if (isVisibleToUser) {
            showData();
        }
    }

    private void showData() {
        if (isInit) {
            isInit = false;// 加载数据完成
//            page = 1;
//            mLists.clear();
//            getData();


        }
    }


    @Override
    public void onResume() {
        super.onResume();
        LogUtil.E("onResume");

        // 判断当前fragment是否显示
        if (getUserVisibleHint()) {
            isInit = true;
            showData();
        }
    }



}
