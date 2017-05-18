package com.cd.pigfarm.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.adapter.ListAdapter;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.base.InterActivity;
import com.cd.pigfarm.fragment.AboutFragment;
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
import com.cd.pigfarm.view.PopMenus;
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

    private boolean isExit = false;

    private LinearLayout menu_Lin;

    private PopMenus popMenus1,popMenus2;

    private AboutFragment aboutFragment;


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
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
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

        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                isExit = false;
                handler.removeCallbacksAndMessages(null);
            }
        };

        addMenu();
        initPop();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){
            if (!isExit){
                isExit = true;
                Toast.makeText(getApplicationContext(),"再按一次返回键回到桌面",Toast.LENGTH_SHORT).show();
                handler.sendEmptyMessageDelayed(1,1500);
            }else {
                System.exit(-1);
            }
        }
        return true;
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

        menu_Lin = (LinearLayout) findViewById(R.id.layout_custommenu);

        //左侧菜单的控件
        titleTex = (TextView) findViewById(R.id.title);
        listView = (ListView) findViewById(R.id.menu_Lis);

        //展示内容控件
        contentFra = (FrameLayout) findViewById(R.id.content_Fra);

    }

    private LinearLayout layout1,layout2,layout3,layout4;

    private void addMenu(){

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f);
        layout1 = (LinearLayout) ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_custommenu, null);
        layout1.setLayoutParams(lp);
        TextView tv_custommenu_name1 = (TextView) layout1.findViewById(R.id.tv_custommenu_name);
        tv_custommenu_name1.setText("参数设置");
        tv_custommenu_name1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up_black, 0);
        layout1.setOnClickListener(this);
        menu_Lin.addView(layout1);

        layout2 = (LinearLayout) ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_custommenu, null);
        layout2.setLayoutParams(lp);
        TextView tv_custommenu_name2 = (TextView) layout2.findViewById(R.id.tv_custommenu_name);
        tv_custommenu_name2.setText("结果查询");
        tv_custommenu_name2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up_black, 0);
        layout2.setOnClickListener(this);
        menu_Lin.addView(layout2);

        layout3 = (LinearLayout) ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_custommenu, null);
        layout3.setLayoutParams(lp);
        TextView tv_custommenu_name3 = (TextView) layout3.findViewById(R.id.tv_custommenu_name);
        tv_custommenu_name3.setText("相关信息");
        layout3.setOnClickListener(this);
        menu_Lin.addView(layout3);

        layout4 = (LinearLayout) ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_custommenu, null);
        layout4.setLayoutParams(lp);
        TextView tv_custommenu_name4 = (TextView) layout4.findViewById(R.id.tv_custommenu_name);
        tv_custommenu_name4.setText("关于我们");
        layout4.setOnClickListener(this);
        menu_Lin.addView(layout4);
        
        
        
    }


    private String[] zzc_csszList = new String[]{"存栏母猪","基本参数","猪舍建筑面积设计参数","猪只饮水","粪氮含量","粪尿产生量","沼气池容量",
            "农作物施氮量","猪舍建筑单价","各猪舍设备参数"};
    private String[] yfc_csszList=new String[]{"存栏商品猪","猪舍建筑面积参数","粪氮含量","猪只饮水","粪尿产生量","沼气池容量","农作物施氮量","猪舍建筑单价"
            ,"各猪舍设备参数"};

    private String[] zzc_jgcxList=new String[]{"工艺","猪群结构","猪栏数","猪舍建筑面积","供水量与饮水产污量","消纳面积","投资估算"};
    private String[] yfc_jgcxList=new String[]{"猪栏数","猪舍建筑面积","供水量与饮水产污量","消纳面积","投资估算"};


    PopMenus.OnItemClickListener popMenus1LItem = new PopMenus.OnItemClickListener() {
        @Override
        public void onItemClick(View v, int position) {
            //Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_LONG).show();
            setFragment(position);
        }
    };
    PopMenus.OnItemClickListener popMenus2LItem = new PopMenus.OnItemClickListener() {
        @Override
        public void onItemClick(View v, int position) {
            //Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_LONG).show();
            if (flag == 0){
                setFragment(position+10);
            }else if (flag == 1){
                setFragment(position+9);
            }

        }
    };

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

        aboutFragment = new AboutFragment();
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
        GzssbcsFragment gzssbcsFragment = new GzssbcsFragment();
        zzcFragmentList.add(gzssbcsFragment);

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
        GzssbcsYfcFragment gzssbcsYfcFragment = new GzssbcsYfcFragment();
        yfcFragment.add(gzssbcsYfcFragment);
        ZlsyfcFragment zlsyfcFragment = new ZlsyfcFragment();
        yfcFragment.add(zlsyfcFragment);
        ZsjzmjyfcFragment zsjzmjyfcFragment = new ZsjzmjyfcFragment();
        yfcFragment.add(zsjzmjyfcFragment);
        GsyyscwlyfcFragment gsyyscwlyfcFragment = new GsyyscwlyfcFragment();
        yfcFragment.add(gsyyscwlyfcFragment);
        XnmjYfcFragment xnmjYfcFragment = new XnmjYfcFragment();
        yfcFragment.add(xnmjYfcFragment);
        TzgsYfcFragment tzgsYfcFragment = new TzgsYfcFragment();
        yfcFragment.add(tzgsYfcFragment); 
        
    }


    private void initPop(){
        popMenus1 = new PopMenus(MainActivity.this,zzc_csszList,getWindowManager().getDefaultDisplay().getWidth()/4+10,0);
        popMenus2 = new PopMenus(MainActivity.this,zzc_jgcxList,getWindowManager().getDefaultDisplay().getWidth()/4+10,0);
        popMenus1.setItemClickListener(popMenus1LItem);
        popMenus2.setItemClickListener(popMenus2LItem);
    }

    @Override
    public void onClick(View v) {
        if (v == menu_Img){
            showMenu();
        }else if(v == layout1){
            if (flag == 0){
                popMenus1.setDataList(zzc_csszList);
                popMenus1.showAtLocation(v);
            }else {
                popMenus1.setDataList(yfc_csszList);
                popMenus1.showAtLocation(v);
            }
        }else if(v == layout2){
            if (flag == 0){
               popMenus2.setDataList(zzc_jgcxList);
                popMenus2.showAtLocation(v);
            }else {
                popMenus2.setDataList(yfc_jgcxList);
                popMenus2.showAtLocation(v);
            }
        }else if(v == layout3){
           Toast.makeText(getApplicationContext(),"相关信息功能模块开发中...",Toast.LENGTH_SHORT).show();
        }else if(v == layout4){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_Fra,aboutFragment).commit();
        }



        else
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }
}
