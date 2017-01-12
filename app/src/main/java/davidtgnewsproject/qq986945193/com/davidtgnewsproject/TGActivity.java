package davidtgnewsproject.qq986945193.com.davidtgnewsproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

import davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment.AboutDavidFragment;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment.AppleFragment;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment.SportsFragment;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.fragment.TechFragment;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * <p/>
 * 项目名称：小冰新闻
 */
public class TGActivity extends FragmentActivity {
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
        stringList.add("体育热线");
        stringList.add("科技创新");
        stringList.add("果粉新闻");
        stringList.add("关于作者");

        fragmentList.add(new SportsFragment());
        fragmentList.add(new TechFragment());
        fragmentList.add(new AppleFragment());
        fragmentList.add(new AboutDavidFragment());

        /**
         * viewpager
         */
        myAdapter = new MyAdapter(getSupportFragmentManager());
        mviewPager.setAdapter(myAdapter);
        //设置预加载
        mviewPager.setOffscreenPageLimit(3);
        //绑定ViewPager
        mTabLayout.setupWithViewPager(mviewPager);

        //TabLayout绑定adapter
        mTabLayout.setTabsFromPagerAdapter(myAdapter);
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

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mviewPager = (ViewPager) findViewById(R.id.mViewPager);
    }



}
