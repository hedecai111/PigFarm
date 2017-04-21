package com.cd.pigfarm.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.InterActivity;


/**
 * @author  hedecai
 * @time    2017/3/8 10:34
 * @desc    启动页
 */
public class GuideActivity extends InterActivity implements View.OnClickListener{

    private static final int TIME = 1;
    private static final long ONE_S = 1000;
    /**
     * 跳过按钮
     */
    private Button experienceButton;

    private Handler handler;
    //5秒后自动进入
    private int time = 5;

    private TextView timeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
    }

    @Override
    public int initLayoutResID() {
        return R.layout.activity_guide;
    }

    @Override
    public void initView() {
        experienceButton = (Button) findViewById(R.id.experience_Button);
        //experienceButton.setVisibility(View.GONE);
        timeTextView = (TextView) findViewById(R.id.time_TextView);
        timeTextView.setText(time+"");
    }

    @Override
    public void initDatas() {
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                handler.removeCallbacksAndMessages(null);
                time -= 1;
                timeTextView.setText(time+"");
                if(time == 0){
                    gotoMainActivity();
                }else {
                    handler.sendEmptyMessageDelayed(TIME,ONE_S);
                }

            }
        };
        handler.sendEmptyMessageDelayed(TIME,ONE_S);
    }

    @Override
    public void bindEvent() {
        experienceButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == experienceButton){
            gotoMainActivity();
        }
    }
    private void gotoMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        handler.removeCallbacksAndMessages(null);
        finish();
    }
}
