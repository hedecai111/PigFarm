package com.cd.pigfarm.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.cd.pigfarm.R;
import com.cd.pigfarm.adapter.ListAdapter;
import com.cd.pigfarm.base.BaseFragment;
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
import com.cd.pigfarm.fyfragment.ClspzsFragment;
import com.cd.pigfarm.fyfragment.FsclyfcFragment;
import com.cd.pigfarm.fyfragment.GsyyscwlyfcFragment;
import com.cd.pigfarm.fyfragment.GzssbcsYfcFragment;
import com.cd.pigfarm.fyfragment.Ldhl_yfcFragment;
import com.cd.pigfarm.fyfragment.TzgsYfcFragment;
import com.cd.pigfarm.fyfragment.XnmjYfcFragment;
import com.cd.pigfarm.fyfragment.ZlsyfcFragment;
import com.cd.pigfarm.fyfragment.ZsjzdjyfcFragment;
import com.cd.pigfarm.fyfragment.ZsjzmjyfcFragment;
import com.cd.pigfarm.fyfragment.ZsjzyflFragment;
import com.cd.pigfarm.fyfragment.ZzysfycFragment;
import com.cd.pigfarm.util.Utils;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  hedecai
 * @time    2017/3/20 19:50
 * @desc    App的主界面
 */
public class MainActivity extends SlidingFragmentActivity implements View.OnClickListener{

    /**
     * 选择种猪场和育肥场的两个按钮
     */
    private Button zzcBut,yfcBut;

    private TextView zzc_Tex,yfc_Tex;

    private ImageView menu_Img;


    //左侧菜单控件
    private TextView titleTex;

    private ListView listView;

    private ListAdapter adapter;

    private FrameLayout contentFra;

    //菜单数据
    private List<String> zzcDataList,yfcDataList;
    /**
     * 展示的内容切换，0，种猪场   1育肥场
     */
    private int flag = 0;

    private int zzcPosition = 0,yfcPosition = 0;

    private List<BaseFragment> zzcFragmentList,yfcFragment;
    private static int FRAGMENT_ID = 100;
    SlidingMenu slidingMenu;

    private Handler handler;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        setContentView(R.layout.activity_main);
        setBehindContentView(R.layout.left_menu);
        slidingMenu = getSlidingMenu();
        //设置显示模式
        slidingMenu.setMode(SlidingMenu.LEFT);
        //设置滑动模式，滑动边缘，全屏滑动，不可以滑动
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        //设置主页页面宽度
        slidingMenu.setBehindOffset(Utils.dip2px(this,150));
        initView();
        bindEvent();
        //初始化数据
        initDatas();
        //初始化Fragment
        initFragment();

        adapter = new ListAdapter(zzcDataList,this);
        listView.setAdapter(adapter);
        setFragment(0);
        listView.setSelection(0);

        handler = new Handler();
    }

    @Override
    protected void onResume() {
        super.onResume();
        jsDatas();
    }

    public void initView() {
        //zzcBut = (Button) findViewById(R.id.zzc_But);
       // yfcBut = (Button) findViewById(R.id.yfc_But);
        zzc_Tex = (TextView) findViewById(R.id.zzc_Tex);
        yfc_Tex = (TextView) findViewById(R.id.yfc_Tex);
        menu_Img = (ImageView) findViewById(R.id.menu);


        //左侧菜单的控件
        titleTex = (TextView) findViewById(R.id.title);
        listView = (ListView) findViewById(R.id.menu_Lis);

        //展示内容控件
        contentFra = (FrameLayout) findViewById(R.id.content_Fra);

    }

    /**
     * 计算数据，提供给Fragment调用
     */
    public void jsDatas(){
        for (BaseFragment fragment : zzcFragmentList){
            fragment.jsDatas();
        }
        for (BaseFragment fragment : yfcFragment){
            fragment.jsDatas();
        }
    }

    public void bindEvent() {
       //// zzcBut.setOnClickListener(this);
       // yfcBut.setOnClickListener(this);
        zzc_Tex.setOnClickListener(this);
        yfc_Tex.setOnClickListener(this);
        menu_Img.setOnClickListener(this);
        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setFragment(position);
                adapter.setSelectPosition(position);
                if (flag == 0){
                    zzcPosition = position;
                }else if(flag == 1){
                    yfcPosition = position;
                }
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showContent();
                    }
                },200);
            }
        });


    }

    private void setLeftTitle(int flag){
        if (flag == 0){
            titleTex.setText("种猪场");
        }else if (flag == 1){
            titleTex.setText("育肥场");
        }
    }

    /**
     * 根据选中的菜单项切换内容
     */
    private void setFragment(int position){

        Fragment fragment = null;
        if (flag == 0){
            if (position <= zzcFragmentList.size())
                fragment = zzcFragmentList.get(position);
        }
        else if (flag == 1){
            if (position <= yfcFragment.size())
                fragment = yfcFragment.get(position);
        }

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.content_Fra,fragment).commit();

    }

    private void initFragment(){
        //种猪场
        zzcFragmentList = new ArrayList<>();
        ClmzFragment clmzFragment = new ClmzFragment();
        zzcFragmentList.add(clmzFragment);
        JbcsFragment jbcsFragment = new JbcsFragment();
        zzcFragmentList.add(jbcsFragment);
        ZsjzFragment zsjzFragment = new ZsjzFragment();
        zzcFragmentList.add(zsjzFragment);
        ZzysFragment zzysFragment = new ZzysFragment();
        zzcFragmentList.add(zzysFragment);
        LdhlFragment ldhlFragment = new LdhlFragment();
        zzcFragmentList.add(ldhlFragment);
        FsclFragment fsclFragment = new FsclFragment();
        zzcFragmentList.add(fsclFragment);
        ZqcrlFragment zqcrlFragment = new ZqcrlFragment();
        zzcFragmentList.add(zqcrlFragment);
        NzwsdlFragment nzwsdlFragment = new NzwsdlFragment();
        zzcFragmentList.add(nzwsdlFragment);
        ZsjzdjFragment zsjzdjFragment = new ZsjzdjFragment();
        zzcFragmentList.add(zsjzdjFragment);

        GyFragment gyFragment = new GyFragment();
        zzcFragmentList.add(gyFragment);
        ZqjgFragment zqjgFragment = new ZqjgFragment();
        zzcFragmentList.add(zqjgFragment);
        ZlsFragment zlsFragment = new ZlsFragment();
        zzcFragmentList.add(zlsFragment);
        ZsjzmjFragment zsjzmjFragment = new ZsjzmjFragment();
        zzcFragmentList.add(zsjzmjFragment);
        GslyyscwlFragment gslyyscwlFragment = new GslyyscwlFragment();
        zzcFragmentList.add(gslyyscwlFragment);
        XnmjFragment xnmjFragment = new XnmjFragment();
        zzcFragmentList.add(xnmjFragment);
        GzssbcsFragment gzssbcsFragment = new GzssbcsFragment();
        zzcFragmentList.add(gzssbcsFragment);
        TzgsFragment tzgsFragment = new TzgsFragment();
        zzcFragmentList.add(tzgsFragment);
        //育肥场
        yfcFragment = new ArrayList<>();
        ClspzsFragment clspzsFragment = new ClspzsFragment();
        yfcFragment.add(clspzsFragment);
        ZsjzyflFragment zsjzyflFragment = new ZsjzyflFragment();
        yfcFragment.add(zsjzyflFragment);
        ZzysfycFragment zzysfycFragment = new ZzysfycFragment();
        Ldhl_yfcFragment ldhl_yfcFragment = new Ldhl_yfcFragment();
        yfcFragment.add(ldhl_yfcFragment);
        yfcFragment.add(zzysfycFragment);
        FsclyfcFragment fsclyfcFragment = new FsclyfcFragment();
        yfcFragment.add(fsclyfcFragment);
        ZqcrlFragment zqcrlyfcFragment = new ZqcrlFragment();
        yfcFragment.add(zqcrlyfcFragment);
       // NzwsdlFragment nzwsdlFragment = new NzwsdlFragment();
        yfcFragment.add(nzwsdlFragment);
        ZsjzdjyfcFragment zsjzdjyfcFragment = new ZsjzdjyfcFragment();
        yfcFragment.add(zsjzdjyfcFragment);
        ZlsyfcFragment zlsyfcFragment = new ZlsyfcFragment();
        yfcFragment.add(zlsyfcFragment);
        ZsjzmjyfcFragment zsjzmjyfcFragment = new ZsjzmjyfcFragment();
        yfcFragment.add(zsjzmjyfcFragment);
        GsyyscwlyfcFragment gsyyscwlyfcFragment = new GsyyscwlyfcFragment();
        yfcFragment.add(gsyyscwlyfcFragment);
        XnmjYfcFragment xnmjYfcFragment = new XnmjYfcFragment();
        yfcFragment.add(xnmjYfcFragment);
        GzssbcsYfcFragment gzssbcsYfcFragment = new GzssbcsYfcFragment();
        yfcFragment.add(gzssbcsYfcFragment);
        TzgsYfcFragment tzgsYfcFragment = new TzgsYfcFragment();
        yfcFragment.add(tzgsYfcFragment); 
        
    }


    @Override
    public void onClick(View v) {
        if (v == menu_Img){
            showMenu();
        }else
            setSelect(v);
    }

    private void setSelect(View v){
        if (v == zzc_Tex){
            zzc_Tex.setTextColor(getResources().getColor(R.color.titlebar_bg_color4));
            zzc_Tex.setBackgroundResource(R.drawable.left_oncheck_shap);
            yfc_Tex.setTextColor(getResources().getColor(R.color.text_white));
            yfc_Tex.setBackgroundResource(R.drawable.right_nomal_shap);
            flag = 0;
            adapter.setDatas(zzcDataList);
            setLeftTitle(flag);
            adapter.setSelectPosition(zzcPosition);
            setFragment(zzcPosition);
        }else if(v == yfc_Tex){
            zzc_Tex.setTextColor(getResources().getColor(R.color.text_white));
            zzc_Tex.setBackgroundResource(R.drawable.left_nomal_shap);
            yfc_Tex.setTextColor(getResources().getColor(R.color.titlebar_bg_color4));
            yfc_Tex.setBackgroundResource(R.drawable.right_oncheck_shap);
            flag = 1;
            adapter.setDatas(yfcDataList);
            setLeftTitle(flag);
            adapter.setSelectPosition(yfcPosition);
            setFragment(yfcPosition);

        }
    }

    private void initDatas(){
        zzcDataList = new ArrayList<>();
        zzcDataList.add("存栏母猪数");
        zzcDataList.add("猪场设计参数\n\t\t\t\t基本参数");
        zzcDataList.add("猪场设计参数\n\t\t\t\t猪舍建筑面积设计参数");
        zzcDataList.add("猪场设计参数\n\t\t\t\t猪只饮水参数");
        zzcDataList.add("猪场设计参数\n\t\t\t\t粪氮含量");
        zzcDataList.add("猪场设计参数\n\t\t\t\t粪尿产生量");
        zzcDataList.add("猪场设计参数\n\t\t\t\t沼气池容量");
        zzcDataList.add("猪场设计参数\n\t\t\t\t农作物施氮量");
        zzcDataList.add("猪场设计参数\n\t\t\t\t猪舍建筑单价");
        zzcDataList.add("工艺");
        zzcDataList.add("猪群结构");
        zzcDataList.add("猪栏数");
        zzcDataList.add("猪舍建筑面积");
        zzcDataList.add("供水量与饮水产污量");
        zzcDataList.add("消纳面积");
        zzcDataList.add("各猪舍设备参数");
        zzcDataList.add("投资估算");

        yfcDataList = new ArrayList<>();
        yfcDataList.add("存栏商品猪数");
        yfcDataList.add("猪场设计参数\n\t\t\t\t猪舍建筑面积参数");
        yfcDataList.add("猪场设计参数\n\t\t\t\t氮养含量");
        yfcDataList.add("猪场设计参数\n\t\t\t\t猪只饮水参数");
        yfcDataList.add("猪场设计参数\n\t\t\t\t粪尿产生量");
        yfcDataList.add("猪场设计参数\n\t\t\t\t沼气池容量");
        yfcDataList.add("猪场设计参数\n\t\t\t\t农作物施氮量");
        yfcDataList.add("猪场设计参数\n\t\t\t\t猪舍建筑单价");
        yfcDataList.add("猪栏数");
        yfcDataList.add("猪舍建筑面积");
        yfcDataList.add("供水量与饮水产污量");
        yfcDataList.add("消纳面积");
        yfcDataList.add("各猪舍设备参数");
        yfcDataList.add("投资估算");




    }



}
