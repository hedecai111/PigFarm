package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.SpUtil;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 14:59
 * @Description: 农作物施氮量设置
 */
public class NzwsdlFragment extends BaseFragment {
    @NotEmpty
    private EditText sd;
    @NotEmpty
    private EditText xm;
    @NotEmpty
    private EditText ym;
    @NotEmpty
    private EditText yc;
    @NotEmpty
    private EditText gs;
    @NotEmpty
    private EditText mls;
    @NotEmpty
    private EditText qglsc;
    @NotEmpty
    private EditText glsc;
    @NotEmpty
    private EditText yclsc;
    @NotEmpty
    private EditText gclsc;
    @NotEmpty
    private EditText dlsc;
    @NotEmpty
    private EditText cslsc;
    @NotEmpty
    private EditText lygs;
    @NotEmpty
    private EditText clgs;
    @NotEmpty
    private EditText cy;
    @NotEmpty
    private EditText mc;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_nzwsdl,null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        sd = (EditText) view.findViewById(R.id.sd);
        sd.setOnFocusChangeListener(focusListener);
        if (Constant.sd != 0)
            sd.setText(Constant.sd+"");

        xm = (EditText) view.findViewById(R.id.xm);
        xm.setOnFocusChangeListener(focusListener);
        if (Constant.xm != 0)
            xm.setText(Constant.xm+"");

        ym = (EditText) view.findViewById(R.id.ym);
        ym.setOnFocusChangeListener(focusListener);
        if (Constant.ym != 0)
            ym.setText(Constant.ym+"");

        yc = (EditText) view.findViewById(R.id.yc);
        yc.setOnFocusChangeListener(focusListener);
        if (Constant.yc != 0)
            yc.setText(Constant.yc+"");

        gs = (EditText) view.findViewById(R.id.gs);
        gs.setOnFocusChangeListener(focusListener);
        if (Constant.gs != 0)
            gs.setText(Constant.gs+"");

        mls = (EditText) view.findViewById(R.id.mls);
        mls.setOnFocusChangeListener(focusListener);
        if (Constant.mls != 0)
            mls.setText(Constant.mls+"");

        qglsc = (EditText) view.findViewById(R.id.qglsc);
        qglsc.setOnFocusChangeListener(focusListener);
        if (Constant.qglsc != 0)
            qglsc.setText(Constant.qglsc+"");

        glsc = (EditText) view.findViewById(R.id.glsc);
        glsc.setOnFocusChangeListener(focusListener);
        if (Constant.glsc != 0)
            glsc.setText(Constant.glsc+"");

        yclsc = (EditText) view.findViewById(R.id.yclsc);
        yclsc.setOnFocusChangeListener(focusListener);
        if (Constant.yclsc != 0)
            yclsc.setText(Constant.yclsc+"");

        gclsc = (EditText) view.findViewById(R.id.gclsc);
        gclsc.setOnFocusChangeListener(focusListener);
        if (Constant.gclsc != 0)
            gclsc.setText(Constant.gclsc+"");

        dlsc = (EditText) view.findViewById(R.id.dlsc);
        dlsc.setOnFocusChangeListener(focusListener);
        if (Constant.dlsc != 0)
            dlsc.setText(Constant.dlsc+"");

        cslsc = (EditText) view.findViewById(R.id.cslsc);
        cslsc.setOnFocusChangeListener(focusListener);
        if (Constant.cslsc != 0)
            cslsc.setText(Constant.cslsc+"");

        lygs = (EditText) view.findViewById(R.id.lygs);
        lygs.setOnFocusChangeListener(focusListener);
        if (Constant.lygs != 0)
            lygs.setText(Constant.lygs+"");

        clgs = (EditText) view.findViewById(R.id.clgs);
        clgs.setOnFocusChangeListener(focusListener);
        if (Constant.clgs != 0)
            clgs.setText(Constant.clgs+"");

        cy = (EditText) view.findViewById(R.id.cy);
        cy.setOnFocusChangeListener(focusListener);
        if (Constant.cy != 0)
            cy.setText(Constant.cy+"");

        mc = (EditText) view.findViewById(R.id.mc);
        mc.setOnFocusChangeListener(focusListener);
        if (Constant.mc != 0)
            mc.setText(Constant.mc+"");
    }

    @Override
    public void saveData(EditText view, String text) {
        double  textdouble = Double.parseDouble(text);
        if (view == sd){
            Constant.sd = textdouble;
            SpUtil.saveSP(getContext(),"sd",Constant.sd);
        }else if (view == xm){
            Constant.xm = textdouble;
            SpUtil.saveSP(getContext(),"xm",Constant.xm);
        }else if (view == ym){
            Constant.ym = textdouble;
            SpUtil.saveSP(getContext(),"ym",Constant.ym);
        }else if (view == yc){
            Constant.yc = textdouble;
            SpUtil.saveSP(getContext(),"yc",Constant.yc);
        }else if (view == gs){
            Constant.gs = textdouble;
            SpUtil.saveSP(getContext(),"gs",Constant.gs);
        }else if (view == mls){
            Constant.mls = textdouble;
            SpUtil.saveSP(getContext(),"mls",Constant.mls);
        }else if (view == qglsc){
            Constant.qglsc = textdouble;
            SpUtil.saveSP(getContext(),"qglsc",Constant.qglsc);
        }else if (view == glsc){
            Constant.glsc = textdouble;
            SpUtil.saveSP(getContext(),"glsc",Constant.glsc);
        }else if (view == yclsc){
            Constant.yclsc = textdouble;
            SpUtil.saveSP(getContext(),"yclsc",Constant.yclsc);
        }else if (view == gclsc){
            Constant.gclsc = textdouble;
            SpUtil.saveSP(getContext(),"gclsc",Constant.gclsc);
        }else if (view == dlsc){
            Constant.dlsc = textdouble;
            SpUtil.saveSP(getContext(),"dlsc",Constant.dlsc);
        }else if (view == cslsc){
            Constant.cslsc = textdouble;
            SpUtil.saveSP(getContext(),"cslsc",Constant.cslsc);
        }else if (view == lygs){
            Constant.lygs = textdouble;
            SpUtil.saveSP(getContext(),"lygs",Constant.lygs);
        }else if (view == clgs){
            Constant.clgs = textdouble;
            SpUtil.saveSP(getContext(),"clgs",Constant.clgs);
        }else if (view == cy){
            Constant.cy = textdouble;
            SpUtil.saveSP(getContext(),"cy",Constant.cy);
        }else if (view == mc){
            Constant.mc = textdouble;
            SpUtil.saveSP(getContext(),"mc",Constant.mc);
        }
    }
}
