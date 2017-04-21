package com.cd.pigfarm.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * @author 陶建兵
 * @version 1.0
 * @date 2017/1/17 13:58
 * @desc Activity 实现类
 */
public abstract class InterActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayoutResID());
        //设置透明状态栏
        initBundle(savedInstanceState);
        initView();
        bindEvent();
        initDatas();


        doAfterCreated();
    }

    /**
     * @param savedInstanceState 初始数据
     */
    public void initBundle(Bundle savedInstanceState) {
    }

    /**
     * @return 视图资源
     */
    public abstract int initLayoutResID();

    /**
     * 初始化控件
     */
    public void initView() {
    }

    /**
     * 注册事件
     */
    public void bindEvent() {
    }

    /**
     * 初始化数据
     */
    public void initDatas() {

    }

    /**
     * 执行初始化完成之后的操作
     */
    protected  void doAfterCreated(){};

}
