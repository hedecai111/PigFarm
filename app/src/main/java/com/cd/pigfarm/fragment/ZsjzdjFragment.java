package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.SpUtil;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 14:59
 * @Description: 猪舍建筑单价设置
 */
public class ZsjzdjFragment extends BaseFragment {


    @NotEmpty
    private EditText hbmzs_d;
    @NotEmpty
    private EditText gzjpzrcmzs_d;
    @NotEmpty
    private EditText rcmzs_d;
    @NotEmpty
    private EditText fws_d;
    @NotEmpty
    private EditText bys_d;
    @NotEmpty
    private EditText szyfs_d;
    @NotEmpty
    private EditText bzgls_d;
    @NotEmpty
    private EditText zqc_d;
    @NotEmpty
    private EditText zyc_d;
    @NotEmpty
    private EditText fzwjzmj_d;
    @NotEmpty
    private EditText slkf_d;
    @NotEmpty
    private EditText bgdqtjz_d;
    @NotEmpty
    private EditText yzgls_d;


    private Button next_But;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zsjzdj,null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {



        hbmzs_d = (EditText) view.findViewById(R.id.hbmzs_d);
        hbmzs_d.setOnFocusChangeListener(focusListener);
        if (Constant.hbmzs_d != 0)
            hbmzs_d.setText(Constant.hbmzs_d+"");

        gzjpzrcmzs_d = (EditText) view.findViewById(R.id.gzjpzrcmzs_d);
        gzjpzrcmzs_d.setOnFocusChangeListener(focusListener);
        if (Constant.gzjpzrcmzs_d != 0)
            gzjpzrcmzs_d.setText(Constant.gzjpzrcmzs_d+"");

        rcmzs_d = (EditText) view.findViewById(R.id.rcmzs_d);
        rcmzs_d.setOnFocusChangeListener(focusListener);
        if (Constant.rcmzs_d != 0)
            rcmzs_d.setText(Constant.rcmzs_d+"");

        fws_d = (EditText) view.findViewById(R.id.fws_d);
        fws_d.setOnFocusChangeListener(focusListener);
        if (Constant.fws_d != 0)
            fws_d.setText(Constant.fws_d+"");

        bys_d = (EditText) view.findViewById(R.id.bys_d);
        bys_d.setOnFocusChangeListener(focusListener);
        if (Constant.bys_d != 0)
            bys_d.setText(Constant.bys_d+"");

        szyfs_d = (EditText) view.findViewById(R.id.szyfs_d);
        szyfs_d.setOnFocusChangeListener(focusListener);
        if (Constant.szyfs_d != 0)
            szyfs_d.setText(Constant.szyfs_d+"");

        bzgls_d = (EditText) view.findViewById(R.id.bzgls_d);
        bzgls_d.setOnFocusChangeListener(focusListener);
        if (Constant.bzgls_d != 0)
            bzgls_d.setText(Constant.bzgls_d+"");

        yzgls_d = (EditText) view.findViewById(R.id.yzgls_d);
        yzgls_d.setOnFocusChangeListener(focusListener);
        if (Constant.yzgls_d != 0)
            yzgls_d.setText(Constant.yzgls_d+"");

        zqc_d = (EditText) view.findViewById(R.id.zqc_d);
        zqc_d.setOnFocusChangeListener(focusListener);
        if (Constant.zqc_d != 0)
            zqc_d.setText(Constant.zqc_d+"");

        zyc_d = (EditText) view.findViewById(R.id.zyc_d);
        zyc_d.setOnFocusChangeListener(focusListener);
        if (Constant.zyc_d != 0)
            zyc_d.setText(Constant.zyc_d+"");

        fzwjzmj_d = (EditText) view.findViewById(R.id.fzwjzmj_d);
        fzwjzmj_d.setOnFocusChangeListener(focusListener);

        fzwjzmj_d.setText(Constant.fzwjzmj_d+"");

        slkf_d = (EditText) view.findViewById(R.id.slkf_d);
        slkf_d.setOnFocusChangeListener(focusListener);
        if (Constant.slkf_d != 0)
            slkf_d.setText(Constant.slkf_d+"");

        bgdqtjz_d = (EditText) view.findViewById(R.id.bgdqtjz_d);
        bgdqtjz_d.setOnFocusChangeListener(focusListener);
        if (Constant.bgdqtjz_d != 0)
            bgdqtjz_d.setText(Constant.bgdqtjz_d+"");
    }

    @Override
    public void saveData(EditText view, String text) {
        double  textdouble = Double.parseDouble(text);
        if (view == hbmzs_d){
            Constant.hbmzs_d = textdouble;
            SpUtil.saveSP(getContext(),"hbmzs_d",Constant.hbmzs_d);
        }else if (view == gzjpzrcmzs_d){
            Constant.gzjpzrcmzs_d = textdouble;
            SpUtil.saveSP(getContext(),"gzjpzrcmzs_d",Constant.gzjpzrcmzs_d);
        }else if (view == rcmzs_d){
            Constant.rcmzs_d = textdouble;
            SpUtil.saveSP(getContext(),"rcmzs_d",Constant.rcmzs_d);
        }else if (view == fws_d){
            Constant.fws_d = textdouble;
            SpUtil.saveSP(getContext(),"fws_d",Constant.fws_d);
        }else if (view == bys_d){
            Constant.bys_d = textdouble;
            SpUtil.saveSP(getContext(),"bys_d",Constant.bys_d);
        }else if (view == szyfs_d){
            Constant.szyfs_d = textdouble;
            SpUtil.saveSP(getContext(),"szyfs_d",Constant.szyfs_d);
        }else if (view == bzgls_d){
            Constant.bzgls_d = textdouble;
            SpUtil.saveSP(getContext(),"bzgls_d",Constant.bzgls_d);
        }else if (view == yzgls_d){
            Constant.yzgls_d = textdouble;
            SpUtil.saveSP(getContext(),"yzgls_d",Constant.yzgls_d);
        }else if (view == zqc_d){
            Constant.zqc_d = textdouble;
            SpUtil.saveSP(getContext(),"zqc_d",Constant.zqc_d);
        }else if (view == zyc_d){
            Constant.zyc_d = textdouble;
            SpUtil.saveSP(getContext(),"zyc_d",Constant.zyc_d);
        }else if (view == fzwjzmj_d){
            Constant.fzwjzmj_d = textdouble;
            SpUtil.saveSP(getContext(),"fzwjzmj_d",Constant.fzwjzmj_d);
        }else if (view == slkf_d){
            Constant.slkf_d = textdouble;
            SpUtil.saveSP(getContext(),"slkf_d",Constant.slkf_d);
        }else if (view == bgdqtjz_d){
            Constant.bgdqtjz_d = textdouble;
            SpUtil.saveSP(getContext(),"bgdqtjz_d",Constant.bgdqtjz_d);
        }
    }
}
