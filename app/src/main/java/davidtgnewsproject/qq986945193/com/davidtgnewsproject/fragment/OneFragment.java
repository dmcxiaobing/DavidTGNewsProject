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

    private Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        stringList.add("个性推荐");
        stringList.add("歌单");
        stringList.add("主播电台");
        stringList.add("排行榜");
        fragmentList.add(new MainFragment("个性推荐"));
        fragmentList.add(new MainFragment("歌单"));
        fragmentList.add(new MainFragment("主播电台"));
        fragmentList.add(new MainFragment("排行榜"));
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        if (getActivity() != null) {
            mContext = getActivity();
        }
        initView(rootView);

        myAdapter = new MyAdapter(getActivity().getSupportFragmentManager());

        mviewPager.setAdapter(myAdapter);

        mTabLayout.setupWithViewPager(mviewPager);

        mTabLayout.setTabsFromPagerAdapter(myAdapter);
        return rootView;
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
}
