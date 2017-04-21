package com.cd.pigfarm.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.InterActivity;
import com.cd.pigfarm.fragment.NzwsdlFragment;
import com.cd.pigfarm.fragment.ZqcrlFragment;
import com.cd.pigfarm.fyfragment.ClspzsFragment;
import com.cd.pigfarm.fyfragment.FsclyfcFragment;
import com.cd.pigfarm.fyfragment.GsyyscwlyfcFragment;
import com.cd.pigfarm.fyfragment.GzssbcsYfcFragment;
import com.cd.pigfarm.fyfragment.Ldhl_yfcFragment;
import com.cd.pigfarm.fyfragment.TzgsYfcFragment;
import com.cd.pigfarm.fyfragment.XnmjYfcFragment;
import com.cd.pigfarm.fyfragment.ZlsyfcFragment;
import com.cd.pigfarm.fyfragment.ZqcrlyfcFragment;
import com.cd.pigfarm.fyfragment.ZsjzdjyfcFragment;
import com.cd.pigfarm.fyfragment.ZsjzmjyfcFragment;
import com.cd.pigfarm.fyfragment.ZsjzyflFragment;
import com.cd.pigfarm.fyfragment.ZzysfycFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  hedecai
 * @time    2017/3/22 20:45
 * @desc    专业育肥场Activity
 */
public class YfcActivity extends InterActivity {

    private ViewPager viewPager;
    /**
     * ViewPager里面加载的Fragment集合
     */
    private List<Fragment> fragmentList;

    private Adapter adapter;

    private int cuPosition;

    @Override
    public int initLayoutResID() {
        return R.layout.activity_yfc;
    }

    @Override
    public void initView() {
        viewPager = (ViewPager) findViewById(R.id.content_Vp);
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
        ClspzsFragment clspzsFragment = new ClspzsFragment();
        fragmentList.add(clspzsFragment);
        ZsjzyflFragment zsjzyflFragment = new ZsjzyflFragment();
        fragmentList.add(zsjzyflFragment);
        ZzysfycFragment zzysfycFragment = new ZzysfycFragment();
        Ldhl_yfcFragment ldhl_yfcFragment = new Ldhl_yfcFragment();
        fragmentList.add(ldhl_yfcFragment);
        fragmentList.add(zzysfycFragment);
        FsclyfcFragment fsclyfcFragment = new FsclyfcFragment();
        fragmentList.add(fsclyfcFragment);
        ZqcrlFragment zqcrlyfcFragment = new ZqcrlFragment();
        fragmentList.add(zqcrlyfcFragment);
        NzwsdlFragment nzwsdlFragment = new NzwsdlFragment();
        fragmentList.add(nzwsdlFragment);
        ZsjzdjyfcFragment zsjzdjyfcFragment = new ZsjzdjyfcFragment();
        fragmentList.add(zsjzdjyfcFragment);
        ZlsyfcFragment zlsyfcFragment = new ZlsyfcFragment();
        fragmentList.add(zlsyfcFragment);
        ZsjzmjyfcFragment zsjzmjyfcFragment = new ZsjzmjyfcFragment();
        fragmentList.add(zsjzmjyfcFragment);
        GsyyscwlyfcFragment gsyyscwlyfcFragment = new GsyyscwlyfcFragment();
        fragmentList.add(gsyyscwlyfcFragment);
        XnmjYfcFragment xnmjYfcFragment = new XnmjYfcFragment();
        fragmentList.add(xnmjYfcFragment);
        GzssbcsYfcFragment gzssbcsYfcFragment = new GzssbcsYfcFragment();
        fragmentList.add(gzssbcsYfcFragment);
        TzgsYfcFragment tzgsYfcFragment = new TzgsYfcFragment();
        fragmentList.add(tzgsYfcFragment);
    }


    /**
     * @author  hedecai
     * @time    2017/3/22 21:30
     * @desc    在Viewpager里面装Fragment必须继承FragmentPagerAdapter
     */
    class Adapter extends FragmentPagerAdapter {

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
