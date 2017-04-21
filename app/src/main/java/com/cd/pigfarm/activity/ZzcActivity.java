package com.cd.pigfarm.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.InterActivity;
import com.cd.pigfarm.fragment.ClmzFragment;
import com.cd.pigfarm.fragment.FsclFragment;
import com.cd.pigfarm.fragment.GslyyscwlFragment;
import com.cd.pigfarm.fragment.GyFragment;
import com.cd.pigfarm.fragment.GzssbcsFragment;
import com.cd.pigfarm.fragment.JbcsFragment;
import com.cd.pigfarm.fragment.LdhlFragment;
import com.cd.pigfarm.fragment.NzwsdlFragment;
import com.cd.pigfarm.fragment.TzgsFragment;
import com.cd.pigfarm.fragment.XnmjFragment;
import com.cd.pigfarm.fragment.ZlsFragment;
import com.cd.pigfarm.fragment.ZqcrlFragment;
import com.cd.pigfarm.fragment.ZqjgFragment;
import com.cd.pigfarm.fragment.ZsjzFragment;
import com.cd.pigfarm.fragment.ZsjzdjFragment;
import com.cd.pigfarm.fragment.ZsjzmjFragment;
import com.cd.pigfarm.fragment.ZzysFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  hedecai
 * @time    2017/3/22 20:43
 * @desc    种猪场部分
 */
public class ZzcActivity extends InterActivity {

    private ViewPager viewPager;
    /**
     * ViewPager里面加载的Fragment集合
     */
    private List<Fragment> fragmentList;

    private Adapter adapter;

    @Override
    public int initLayoutResID() {
        return R.layout.activity_zzc;
    }

    @Override
    public void initView() {
        viewPager = (ViewPager) findViewById(R.id.content_Vp);
        viewPager.setOffscreenPageLimit(0);
    }

    @Override
    public void initDatas() {
        initFragments();
        adapter = new Adapter();

        viewPager.setAdapter(adapter);
    }

    public void nextPage(){
        viewPager.arrowScroll(66);
    }
    public void beforePage(){
        viewPager.arrowScroll(17);
    }

    private void initFragments() {
        fragmentList = new ArrayList<>();
        ClmzFragment clmzFragment = new ClmzFragment();
        fragmentList.add(clmzFragment);
        JbcsFragment jbcsFragment = new JbcsFragment();
        fragmentList.add(jbcsFragment);
        GyFragment gyFragment = new GyFragment();
        fragmentList.add(gyFragment);
        ZsjzFragment zsjzFragment = new ZsjzFragment();
        fragmentList.add(zsjzFragment);
        ZzysFragment zzysFragment = new ZzysFragment();
        fragmentList.add(zzysFragment);
        LdhlFragment ldhlFragment = new LdhlFragment();
        fragmentList.add(ldhlFragment);
        FsclFragment fsclFragment = new FsclFragment();
        fragmentList.add(fsclFragment);
        ZqcrlFragment zqcrlFragment = new ZqcrlFragment();
        fragmentList.add(zqcrlFragment);
        NzwsdlFragment nzwsdlFragment = new NzwsdlFragment();
        fragmentList.add(nzwsdlFragment);
        ZsjzdjFragment zsjzdjFragment = new ZsjzdjFragment();
        fragmentList.add(zsjzdjFragment);
        ZqjgFragment zqjgFragment = new ZqjgFragment();
        fragmentList.add(zqjgFragment);
        ZlsFragment zlsFragment = new ZlsFragment();
        fragmentList.add(zlsFragment);
        ZsjzmjFragment zsjzmjFragment = new ZsjzmjFragment();
        fragmentList.add(zsjzmjFragment);
        GslyyscwlFragment gslyyscwlFragment = new GslyyscwlFragment();
        fragmentList.add(gslyyscwlFragment);
        XnmjFragment xnmjFragment = new XnmjFragment();
        fragmentList.add(xnmjFragment);
        GzssbcsFragment gzssbcsFragment = new GzssbcsFragment();
        fragmentList.add(gzssbcsFragment);
        TzgsFragment tzgsFragment = new TzgsFragment();
        fragmentList.add(tzgsFragment);
    }


    /**
     * @author  hedecai
     * @time    2017/3/22 21:30
     * @desc    在Viewpager里面装Fragment必须继承FragmentPagerAdapter
     */
    class Adapter extends FragmentPagerAdapter{

        public Adapter(){
            super(getSupportFragmentManager());
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }
}
