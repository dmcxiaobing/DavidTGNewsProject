package davidtgnewsproject.qq986945193.com.davidtgnewsproject;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment.MainFragment;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment.PeopleFragment;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.LogUtil;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * <p/>
 * 项目名称：小冰新闻
 */
public class TGActivity extends FragmentActivity{
    private List<String> stringList = new ArrayList<>();
    private List<Fragment> fragmentList = new ArrayList<>();
    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tg);
        initView();
        stringList.add("民生热点");
        stringList.add("娱乐热点");
        stringList.add("财经热点");
        stringList.add("体育热点");

        fragmentList.add(new PeopleFragment("1"));
        fragmentList.add(new MainFragment("2"));
        fragmentList.add(new MainFragment("3"));
        fragmentList.add(new MainFragment("4"));
        myAdapter = new MyAdapter(getSupportFragmentManager());

        mviewPager.setAdapter(myAdapter);


        mTabLayout.setupWithViewPager(mviewPager);


        mTabLayout.setTabsFromPagerAdapter(myAdapter);
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mviewPager = (ViewPager) findViewById(R.id.mViewPager);
    }


    class MyAdapter extends FragmentStatePagerAdapter {

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
