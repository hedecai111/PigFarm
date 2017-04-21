package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.LogUtil;
import com.cd.pigfarm.util.SpUtil;
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.List;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 14:59
 * @Description: 粪尿产生量
 */
public class FsclFragment extends BaseFragment {
    @NotEmpty
    private EditText qnjcngz_f_xf;
    @NotEmpty
    private EditText qnjcngz_f_gwz;
    @NotEmpty
    private EditText qnjcngz_l_l;
    @NotEmpty
    private EditText qnjcngz_l_gwz;
    @NotEmpty
    private EditText qnjcngz_flhj;
    @NotEmpty
    private EditText qnjcngz_gwz;
    @NotEmpty
    private EditText hbmz_f_xf;
    @NotEmpty
    private EditText hbmz_f_gwz;
    @NotEmpty
    private EditText hbmz_l_l;
    @NotEmpty
    private EditText hbmz_l_gwz;
    @NotEmpty
    private EditText hbmz_flhj;
    @NotEmpty
    private EditText hbmz_gwz;
    @NotEmpty
    private EditText pzrjmz_f_xf;
    @NotEmpty
    private EditText pzrjmz_f_gwz;

    @NotEmpty
    private EditText pzrjmz_l_l;
    @NotEmpty
    private EditText pzrjmz_l_gwz;
    @NotEmpty
    private EditText pzrjmz_flhj;
    @NotEmpty
    private EditText pzrjmz_gwz;
    @NotEmpty
    private EditText rcmz_f_cf;
    @NotEmpty
    private EditText rcmz_f_gwz;
    @NotEmpty
    private EditText rcmz_l_l;
    @NotEmpty
    private EditText rcmz_l_gwz;
    @NotEmpty
    private EditText rcmz_flhj;
    @NotEmpty
    private EditText rcmz_gwz;
    @NotEmpty
    private EditText prmz_f_xf;
    @NotEmpty
    private EditText prmz_f_gwz;
    @NotEmpty
    private EditText prmz_l_l;
    @NotEmpty
    private EditText prmz_l_gwz;
    @NotEmpty
    private EditText prmz_flhj;
    @NotEmpty
    private EditText prmz_gwz;
    @NotEmpty
    private EditText przz_f_xf;
    @NotEmpty
    private EditText przz_f_gwz;

    @NotEmpty
    private EditText przz_l_l;
    @NotEmpty
    private EditText przz_l_gwz;
    @NotEmpty
    private EditText przz_flhj;
    @NotEmpty
    private EditText przz_gwz;
    @NotEmpty
    private EditText byzz_f_xf;
    @NotEmpty
    private EditText byzz_f_gwz;
    @NotEmpty
    private EditText byzz_l_l;
    @NotEmpty
    private EditText byzz_l_gwz;
    @NotEmpty
    private EditText byzz_flhj;
    @NotEmpty
    private EditText byzz_gwz;
    @NotEmpty
    private EditText szyfz_f_xf;
    @NotEmpty
    private EditText szyfz_f_gwz;
    @NotEmpty
    private EditText szyfz_l_l;
    @NotEmpty
    private EditText szyfz_l_gwz;
    @NotEmpty
    private EditText szyfz_flhj;
    @NotEmpty
    private EditText szyfz_gwz;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_fscl, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {
        qnjcngz_f_xf = (EditText) view.findViewById(R.id.qnjcngz_f_xf);
        qnjcngz_f_xf.setOnFocusChangeListener(focusListener);
        if (Constant.qnjcngz_f_xf != 0)
            qnjcngz_f_xf.setText(Constant.qnjcngz_f_xf + "");

        qnjcngz_f_gwz = (EditText) view.findViewById(R.id.qnjcngz_f_gwz);
        qnjcngz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.qnjcngz_f_gwz != 0)
            qnjcngz_f_gwz.setText(Constant.qnjcngz_f_gwz + "");

        qnjcngz_l_l = (EditText) view.findViewById(R.id.qnjcngz_l_l);
        qnjcngz_l_l.setOnFocusChangeListener(focusListener);
        if (Constant.qnjcngz_l_l != 0)
            qnjcngz_l_l.setText(Constant.qnjcngz_l_l + "");

        qnjcngz_l_gwz = (EditText) view.findViewById(R.id.qnjcngz_l_gwz);
        qnjcngz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.qnjcngz_l_gwz != 0)
            qnjcngz_l_gwz.setText(Constant.qnjcngz_l_gwz + "");

        qnjcngz_flhj = (EditText) view.findViewById(R.id.qnjcngz_flhj);
        qnjcngz_flhj.setOnFocusChangeListener(focusListener);
        if (Constant.qnjcngz_flhj != 0)
            qnjcngz_flhj.setText(Constant.qnjcngz_flhj + "");

        qnjcngz_gwz = (EditText) view.findViewById(R.id.qnjcngz_gwz);
        qnjcngz_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.qnjcngz_gwz != 0)
            qnjcngz_gwz.setText(Constant.qnjcngz_gwz + "");

        hbmz_f_xf = (EditText) view.findViewById(R.id.hbmz_f_xf);
        hbmz_f_xf.setOnFocusChangeListener(focusListener);
        if (Constant.hbmz_f_xf != 0)
            hbmz_f_xf.setText(Constant.hbmz_f_xf + "");

        hbmz_f_gwz = (EditText) view.findViewById(R.id.hbmz_f_gwz);
        hbmz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.hbmz_f_gwz != 0)
            hbmz_f_gwz.setText(Constant.hbmz_f_gwz + "");

        hbmz_l_l = (EditText) view.findViewById(R.id.hbmz_l_l);
        hbmz_l_l.setOnFocusChangeListener(focusListener);
        if (Constant.hbmz_l_l != 0)
            hbmz_l_l.setText(Constant.hbmz_l_l + "");

        hbmz_l_gwz = (EditText) view.findViewById(R.id.hbmz_l_gwz);
        hbmz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.hbmz_l_gwz != 0)
            hbmz_l_gwz.setText(Constant.hbmz_l_gwz + "");

        hbmz_flhj = (EditText) view.findViewById(R.id.hbmz_flhj);
        hbmz_flhj.setOnFocusChangeListener(focusListener);
        if (Constant.hbmz_flhj != 0)
            hbmz_flhj.setText(Constant.hbmz_flhj + "");

        hbmz_gwz = (EditText) view.findViewById(R.id.hbmz_gwz);
        hbmz_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.hbmz_gwz != 0)
            hbmz_gwz.setText(Constant.hbmz_gwz + "");

        pzrjmz_f_xf = (EditText) view.findViewById(R.id.pzrjmz_f_xf);
        pzrjmz_f_xf.setOnFocusChangeListener(focusListener);
        if (Constant.pzrjmz_f_xf != 0)
            pzrjmz_f_xf.setText(Constant.pzrjmz_f_xf + "");

        pzrjmz_f_gwz = (EditText) view.findViewById(R.id.pzrjmz_f_gwz);
        pzrjmz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.pzrjmz_f_gwz != 0)
            pzrjmz_f_gwz.setText(Constant.pzrjmz_f_gwz + "");

        pzrjmz_l_l = (EditText) view.findViewById(R.id.pzrjmz_l_l);
        pzrjmz_l_l.setOnFocusChangeListener(focusListener);
        if (Constant.pzrjmz_l_l != 0)
            pzrjmz_l_l.setText(Constant.pzrjmz_l_l + "");

        pzrjmz_l_gwz = (EditText) view.findViewById(R.id.pzrjmz_l_gwz);
        pzrjmz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.pzrjmz_l_gwz != 0)
            pzrjmz_l_gwz.setText(Constant.pzrjmz_l_gwz + "");

        pzrjmz_flhj = (EditText) view.findViewById(R.id.pzrjmz_flhj);
        pzrjmz_flhj.setOnFocusChangeListener(focusListener);
        if (Constant.pzrjmz_flhj != 0)
            pzrjmz_flhj.setText(Constant.pzrjmz_flhj + "");

        pzrjmz_gwz = (EditText) view.findViewById(R.id.pzrjmz_gwz);
        pzrjmz_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.pzrjmz_gwz != 0)
            pzrjmz_gwz.setText(Constant.pzrjmz_gwz + "");

        rcmz_f_cf = (EditText) view.findViewById(R.id.rcmz_f_cf);
        rcmz_f_cf.setOnFocusChangeListener(focusListener);
        if (Constant.rcmz_f_xf != 0)
            rcmz_f_cf.setText(Constant.rcmz_f_xf + "");

        rcmz_f_gwz = (EditText) view.findViewById(R.id.rcmz_f_gwz);
        rcmz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.rcmz_f_gwz != 0)
            rcmz_f_gwz.setText(Constant.rcmz_f_gwz + "");

        rcmz_l_l = (EditText) view.findViewById(R.id.rcmz_l_l);
        rcmz_l_l.setOnFocusChangeListener(focusListener);
        if (Constant.rcmz_l_l != 0)
            rcmz_l_l.setText(Constant.rcmz_l_l + "");

        rcmz_l_gwz = (EditText) view.findViewById(R.id.rcmz_l_gwz);
        rcmz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.rcmz_l_gwz != 0)
            rcmz_l_gwz.setText(Constant.rcmz_l_gwz + "");

        rcmz_flhj = (EditText) view.findViewById(R.id.rcmz_flhj);
        rcmz_flhj.setOnFocusChangeListener(focusListener);
        if (Constant.rcmz_flhj != 0)
            rcmz_flhj.setText(Constant.rcmz_flhj + "");

        rcmz_gwz = (EditText) view.findViewById(R.id.rcmz_gwz);
        rcmz_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.rcmz_gwz != 0)
            rcmz_gwz.setText(Constant.rcmz_gwz + "");

        prmz_f_xf = (EditText) view.findViewById(R.id.prmz_f_xf);
        prmz_f_xf.setOnFocusChangeListener(focusListener);
        if (Constant.prmz_f_xf != 0)
            prmz_f_xf.setText(Constant.prmz_f_xf + "");

        prmz_f_gwz = (EditText) view.findViewById(R.id.prmz_f_gwz);
        prmz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.prmz_f_gwz != 0)
            prmz_f_gwz.setText(Constant.prmz_f_gwz + "");

        prmz_l_l = (EditText) view.findViewById(R.id.prmz_l_l);
        prmz_l_l.setOnFocusChangeListener(focusListener);
        if (Constant.prmz_l_l != 0)
            prmz_l_l.setText(Constant.prmz_l_l + "");

        prmz_l_gwz = (EditText) view.findViewById(R.id.prmz_l_gwz);
        prmz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.prmz_l_gwz != 0)
            prmz_l_gwz.setText(Constant.prmz_l_gwz + "");

        prmz_flhj = (EditText) view.findViewById(R.id.prmz_flhj);
        prmz_flhj.setOnFocusChangeListener(focusListener);
        if (Constant.prmz_flhj != 0)
            prmz_flhj.setText(Constant.prmz_flhj + "");

        prmz_gwz = (EditText) view.findViewById(R.id.prmz_gwz);
        prmz_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.prmz_gwz != 0)
            prmz_gwz.setText(Constant.prmz_gwz + "");

        przz_f_xf = (EditText) view.findViewById(R.id.przz_f_xf);
        przz_f_xf.setOnFocusChangeListener(focusListener);
        if (Constant.przz_f_xf != 0)
            przz_f_xf.setText(Constant.przz_f_xf + "");

        przz_f_gwz = (EditText) view.findViewById(R.id.przz_f_gwz);
        przz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.przz_f_gwz != 0)
            przz_f_gwz.setText(Constant.przz_f_gwz + "");

        przz_l_l = (EditText) view.findViewById(R.id.przz_l_l);
        przz_l_l.setOnFocusChangeListener(focusListener);
        if (Constant.przz_l_l != 0)
            przz_l_l.setText(Constant.przz_l_l + "");

        przz_l_gwz = (EditText) view.findViewById(R.id.przz_l_gwz);
        przz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.przz_l_gwz != 0)
            przz_l_gwz.setText(Constant.przz_l_gwz + "");

        przz_flhj = (EditText) view.findViewById(R.id.przz_flhj);
        przz_flhj.setOnFocusChangeListener(focusListener);
        if (Constant.przz_flhj != 0)
            przz_flhj.setText(Constant.przz_flhj + "");

        przz_gwz = (EditText) view.findViewById(R.id.przz_gwz);
        przz_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.przz_gwz != 0)
            przz_gwz.setText(Constant.przz_gwz + "");

        byzz_f_xf = (EditText) view.findViewById(R.id.byzz_f_xf);
        byzz_f_xf.setOnFocusChangeListener(focusListener);
        if (Constant.byzz_f_xf != 0)
            byzz_f_xf.setText(Constant.byzz_f_xf + "");

        byzz_f_gwz = (EditText) view.findViewById(R.id.byzz_f_gwz);
        byzz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.byzz_f_gwz != 0)
            byzz_f_gwz.setText(Constant.byzz_f_gwz + "");

        byzz_l_l = (EditText) view.findViewById(R.id.byzz_l_l);
        byzz_l_l.setOnFocusChangeListener(focusListener);
        if (Constant.byzz_l_l != 0)
            byzz_l_l.setText(Constant.byzz_l_l + "");

        byzz_l_gwz = (EditText) view.findViewById(R.id.byzz_l_gwz);
        byzz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.byzz_l_gwz != 0)
            byzz_l_gwz.setText(Constant.byzz_l_gwz + "");

        byzz_flhj = (EditText) view.findViewById(R.id.byzz_flhj);
        byzz_flhj.setOnFocusChangeListener(focusListener);
        if (Constant.byzz_flhj != 0)
            byzz_flhj.setText(Constant.byzz_flhj + "");

        byzz_gwz = (EditText) view.findViewById(R.id.byzz_gwz);
        byzz_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.byzz_gwz != 0)
            byzz_gwz.setText(Constant.byzz_gwz + "");

        szyfz_f_xf = (EditText) view.findViewById(R.id.szyfz_f_xf);
        szyfz_f_xf.setOnFocusChangeListener(focusListener);
        if (Constant.szyfz_f_xf != 0)
            szyfz_f_xf.setText(Constant.szyfz_f_xf + "");

        szyfz_f_gwz = (EditText) view.findViewById(R.id.szyfz_f_gwz);
        szyfz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.szyfz_f_gwz != 0)
            szyfz_f_gwz.setText(Constant.szyfz_f_gwz + "");

        szyfz_l_l = (EditText) view.findViewById(R.id.szyfz_l_l);
        szyfz_l_l.setOnFocusChangeListener(focusListener);
        if (Constant.szyfz_l_l != 0)
            szyfz_l_l.setText(Constant.szyfz_l_l + "");

        szyfz_l_gwz = (EditText) view.findViewById(R.id.szyfz_l_gwz);
        szyfz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.szyfz_l_gwz != 0)
            szyfz_l_gwz.setText(Constant.szyfz_l_gwz + "");

        szyfz_flhj = (EditText) view.findViewById(R.id.szyfz_flhj);
        szyfz_flhj.setOnFocusChangeListener(focusListener);
        if (Constant.szyfz_flhj != 0)
            szyfz_flhj.setText(Constant.szyfz_flhj + "");

        szyfz_gwz = (EditText) view.findViewById(R.id.szyfz_gwz);
        szyfz_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.szyfz_gwz != 0)
            szyfz_gwz.setText(Constant.szyfz_gwz + "");


    }

    /**
     * 得出经过计算得出的值
     */
    @Override
    public void jsDatas() {
        try {
            //青年及成年公猪
            Constant.qnjcngz_f_gwz = Utils.keep2Wdouble(Constant.qnjcngz_f_xf * Constant.fymz_f_gwz, 2);
            Constant.qnjcngz_l_gwz = Utils.keep2Wdouble(Constant.qnjcngz_l_l * Constant.fymz_l_gwz, 2);
            Constant.qnjcngz_flhj = Utils.keep2Wdouble(Constant.qnjcngz_f_gwz * Constant.fymz_f_gwzhdl + Constant.qnjcngz_l_l * Constant.fymz_l_ld / 1000 / 1000, 3);
            Constant.qnjcngz_gwz = Utils.keep2Wdouble(Constant.qnjcngz_f_gwz + Constant.qnjcngz_l_gwz, 2);

            //后备母猪
            Constant.hbmz_f_gwz = Utils.keep2Wdouble(Constant.hbmz_f_xf * Constant.fymz_f_gwz, 2);
            Constant.hbmz_l_gwz = Utils.keep2Wdouble(Constant.hbmz_l_l * Constant.fymz_l_gwz, 2);
            Constant.hbmz_flhj = Utils.keep2Wdouble(Constant.hbmz_f_gwz * Constant.fymz_f_gwzhdl + Constant.hbmz_l_l * Constant.fymz_l_ld / 1000 / 1000, 3);
            Constant.hbmz_gwz = Utils.keep2Wdouble(Constant.hbmz_f_gwz + Constant.hbmz_l_gwz, 2);

            //配种壬检母猪
            Constant.pzrjmz_f_gwz = Utils.keep2Wdouble(Constant.pzrjmz_f_xf * Constant.fymz_f_gwz, 2);
            Constant.pzrjmz_l_gwz = Utils.keep2Wdouble(Constant.pzrjmz_l_l * Constant.fymz_l_gwz, 2);
            Constant.pzrjmz_flhj = Utils.keep2Wdouble(Constant.pzrjmz_f_gwz * Constant.fymz_f_gwzhdl + Constant.pzrjmz_l_l * Constant.fymz_l_ld / 1000 / 1000, 3);
            Constant.pzrjmz_gwz = Utils.keep2Wdouble(Constant.pzrjmz_f_gwz + Constant.pzrjmz_l_gwz, 2);

            //妊娠母猪
            Constant.rcmz_f_gwz = Utils.keep2Wdouble(Constant.rcmz_f_xf * Constant.fymz_f_gwz, 2);
            Constant.rcmz_l_gwz = Utils.keep2Wdouble(Constant.rcmz_l_l * Constant.fymz_l_gwz, 2);
            Constant.rcmz_flhj = Utils.keep2Wdouble(Constant.rcmz_f_gwz * Constant.fymz_f_gwzhdl + Constant.rcmz_l_l * Constant.fymz_l_ld / 1000 / 1000, 3);
            Constant.rcmz_gwz = Utils.keep2Wdouble(Constant.rcmz_f_gwz + Constant.rcmz_l_gwz, 2);

            //哺乳母猪
            Constant.prmz_f_gwz = Utils.keep2Wdouble(Constant.prmz_f_xf * Constant.fymz_f_gwz, 2);
            Constant.prmz_l_gwz = Utils.keep2Wdouble(Constant.prmz_l_l * Constant.fymz_l_gwz, 2);
            Constant.prmz_flhj = Utils.keep2Wdouble(Constant.prmz_f_gwz * Constant.fymz_f_gwzhdl + Constant.prmz_l_l * Constant.fymz_l_ld / 1000 / 1000, 3);
            Constant.prmz_gwz = Utils.keep2Wdouble(Constant.prmz_f_gwz + Constant.prmz_l_gwz, 2);

            //哺乳宰猪
            Constant.przz_f_gwz = Utils.keep2Wdouble(Constant.przz_f_xf * Constant.fymz_f_gwz, 2);
            Constant.przz_l_gwz = Utils.keep2Wdouble(Constant.przz_l_l * Constant.fymz_l_gwz, 2);
            Constant.przz_flhj = Utils.keep2Wdouble(Constant.przz_f_gwz * Constant.fymz_f_gwzhdl + Constant.przz_l_l * Constant.fymz_l_ld / 1000 / 1000, 3);
            Constant.przz_gwz = Utils.keep2Wdouble(Constant.przz_f_gwz + Constant.przz_l_gwz, 2);

            //保育崽猪
            Constant.byzz_f_gwz = Utils.keep2Wdouble(Constant.byzz_f_xf * Constant.byz_f_gwz, 2);
            Constant.byzz_l_gwz = Utils.keep2Wdouble(Constant.byzz_l_l * Constant.byz_l_gwz, 2);
            Constant.byzz_flhj = Utils.keep2Wdouble(Constant.byzz_f_gwz * Constant.byz_f_gwzhdl + Constant.byzz_l_l * Constant.byz_l_ld / 1000 / 1000, 3);
            Constant.byzz_gwz = Constant.byzz_f_gwz + Constant.byzz_l_gwz;

            //生长育肥猪
            Constant.szyfz_f_gwz = Utils.keep2Wdouble(Constant.szyfz_f_xf * Constant.ycz_f_gwz, 2);
            Constant.szyfz_l_gwz = Utils.keep2Wdouble(Constant.szyfz_l_l * Constant.ycz_l_gwz, 2);
            Constant.szyfz_flhj = Utils.keep2Wdouble(Constant.szyfz_f_gwz * Constant.ycz_f_gwzhdl + Constant.szyfz_l_l * Constant.ycz_l_ld / 1000 / 1000, 3);
            Constant.szyfz_gwz = Utils.keep2Wdouble(Constant.szyfz_f_gwz + Constant.szyfz_l_gwz, 2);
        } catch (Exception e) {
            LogUtil.e(e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        //青年及成年公猪
        if (Constant.fymz_f_gwz == 0){
            Toast.makeText(getContext(),"请先设置粪氮含量",Toast.LENGTH_SHORT).show();
        }
        qnjcngz_f_gwz.setText(Constant.qnjcngz_f_gwz + "");
        qnjcngz_l_gwz.setText(Constant.qnjcngz_l_gwz + "");
        qnjcngz_flhj.setText(Constant.qnjcngz_flhj + "");
        qnjcngz_gwz.setText(Constant.qnjcngz_gwz + "");

        //后备母猪
        hbmz_f_gwz.setText(Constant.hbmz_f_gwz + "");
        hbmz_l_gwz.setText(Constant.hbmz_l_gwz + "");
        hbmz_flhj.setText(Constant.hbmz_flhj + "");
        hbmz_gwz.setText(Constant.hbmz_gwz + "");

        //配种壬检母猪
        pzrjmz_f_gwz.setText(Constant.pzrjmz_f_gwz + "");
        pzrjmz_l_gwz.setText(Constant.pzrjmz_l_gwz + "");
        pzrjmz_flhj.setText(Constant.pzrjmz_flhj + "");
        pzrjmz_gwz.setText(Constant.pzrjmz_gwz + "");

        //妊娠母猪
        rcmz_f_gwz.setText(Constant.rcmz_f_gwz + "");
        rcmz_l_gwz.setText(Constant.rcmz_l_gwz + "");
        rcmz_flhj.setText(Constant.rcmz_flhj + "");
        rcmz_gwz.setText(Constant.rcmz_gwz + "");

        //哺乳母猪
        prmz_f_gwz.setText(Constant.prmz_f_gwz + "");
        prmz_l_gwz.setText(Constant.prmz_l_gwz + "");
        prmz_flhj.setText(Constant.prmz_flhj + "");
        prmz_gwz.setText(Constant.prmz_gwz + "");

        //哺乳宰猪
        przz_f_gwz.setText(Constant.przz_f_gwz + "");
        przz_l_gwz.setText(Constant.przz_l_gwz + "");
        przz_flhj.setText(Constant.przz_flhj + "");
        przz_gwz.setText(Constant.przz_gwz + "");

        //保育崽猪
        byzz_f_gwz.setText(Constant.byzz_f_gwz + "");
        byzz_l_gwz.setText(Constant.byzz_l_gwz + "");
        byzz_flhj.setText(Constant.byzz_flhj + "");
        byzz_gwz.setText(Constant.byzz_gwz + "");

        //生长育肥猪
        szyfz_f_gwz.setText(Constant.szyfz_f_gwz + "");
        szyfz_l_gwz.setText(Constant.szyfz_l_gwz + "");
        szyfz_flhj.setText(Constant.szyfz_flhj + "");
        szyfz_gwz.setText(Constant.szyfz_gwz + "");
    }

    @Override
    public void saveData(EditText view, String text) {
        double textdouble = Double.parseDouble(text);
        if (view == qnjcngz_f_xf) { //鲜粪
            Constant.qnjcngz_f_xf = textdouble;
            SpUtil.saveSP(getContext(), "qnjcngz_f_xf", Constant.qnjcngz_f_xf);

            Constant.qnjcngz_f_gwz = Constant.qnjcngz_f_xf * Constant.fymz_f_gwz;
            SpUtil.saveSP(getContext(), "qnjcngz_f_gwz", Constant.qnjcngz_f_gwz);
            qnjcngz_f_gwz.setText(Constant.qnjcngz_f_gwz + "");
        } else if (view == qnjcngz_f_gwz) {
            Constant.qnjcngz_f_gwz = textdouble;
            SpUtil.saveSP(getContext(), "qnjcngz_f_gwz", Constant.qnjcngz_f_gwz);
        } else if (view == qnjcngz_l_l) {
            Constant.qnjcngz_l_l = textdouble;
            SpUtil.saveSP(getContext(), "qnjcngz_l_l", Constant.qnjcngz_l_l);

            Constant.qnjcngz_l_gwz = Constant.qnjcngz_l_l * Constant.fymz_l_gwz;
            SpUtil.saveSP(getContext(), "qnjcngz_l_gwz", Constant.qnjcngz_l_gwz);
            qnjcngz_l_gwz.setText(Constant.qnjcngz_l_gwz + "");
        } else if (view == qnjcngz_l_gwz) {
            Constant.qnjcngz_l_gwz = textdouble;
            SpUtil.saveSP(getContext(), "qnjcngz_l_gwz", Constant.qnjcngz_l_gwz);
        } else if (view == qnjcngz_flhj) {
            Constant.zzys_qnjcngz_zd = textdouble;
            SpUtil.saveSP(getContext(), "qnjcngz_flhj", Constant.qnjcngz_flhj);
        } else if (view == qnjcngz_gwz) {
            Constant.qnjcngz_gwz = textdouble;
            SpUtil.saveSP(getContext(), "qnjcngz_gwz", Constant.qnjcngz_gwz);
        } else if (view == hbmz_f_xf) {
            Constant.hbmz_f_xf = textdouble;
            SpUtil.saveSP(getContext(), "hbmz_f_xf", Constant.hbmz_f_xf);
        } else if (view == hbmz_f_gwz) {
            Constant.hbmz_f_gwz = textdouble;
            SpUtil.saveSP(getContext(), "hbmz_f_gwz", Constant.hbmz_f_gwz);
        } else if (view == hbmz_l_l) {
            Constant.hbmz_l_l = textdouble;
            SpUtil.saveSP(getContext(), "hbmz_l_l", Constant.hbmz_l_l);
        } else if (view == hbmz_l_gwz) {
            Constant.hbmz_l_gwz = textdouble;
            SpUtil.saveSP(getContext(), "hbmz_l_gwz", Constant.hbmz_l_gwz);
        } else if (view == hbmz_flhj) {
            Constant.hbmz_flhj = textdouble;
            SpUtil.saveSP(getContext(), "hbmz_flhj", Constant.hbmz_flhj);
        } else if (view == hbmz_gwz) {
            Constant.hbmz_gwz = textdouble;
            SpUtil.saveSP(getContext(), "hbmz_gwz", Constant.hbmz_gwz);
        } else if (view == pzrjmz_f_xf) {
            Constant.pzrjmz_f_xf = textdouble;
            SpUtil.saveSP(getContext(), "pzrjmz_f_xf", Constant.pzrjmz_f_xf);
        } else if (view == pzrjmz_f_gwz) {
            Constant.pzrjmz_f_gwz = textdouble;
            SpUtil.saveSP(getContext(), "pzrjmz_f_gwz", Constant.pzrjmz_f_gwz);
        } else if (view == pzrjmz_l_l) {
            Constant.pzrjmz_l_l = textdouble;
            SpUtil.saveSP(getContext(), "pzrjmz_l_l", Constant.pzrjmz_l_l);
        } else if (view == pzrjmz_l_gwz) {
            Constant.pzrjmz_l_gwz = textdouble;
            SpUtil.saveSP(getContext(), "pzrjmz_l_gwz", Constant.pzrjmz_l_gwz);
        } else if (view == pzrjmz_flhj) {
            Constant.pzrjmz_flhj = textdouble;
            SpUtil.saveSP(getContext(), "pzrjmz_flhj", Constant.pzrjmz_flhj);
        } else if (view == pzrjmz_gwz) {
            Constant.pzrjmz_gwz = textdouble;
            SpUtil.saveSP(getContext(), "pzrjmz_gwz", Constant.pzrjmz_gwz);
        } else if (view == rcmz_f_cf) {
            Constant.rcmz_f_xf = textdouble;
            SpUtil.saveSP(getContext(), "rcmz_f_xf", Constant.rcmz_f_xf);
        } else if (view == rcmz_f_gwz) {
            Constant.rcmz_f_gwz = textdouble;
            SpUtil.saveSP(getContext(), "rcmz_f_gwz", Constant.rcmz_f_gwz);
        } else if (view == rcmz_l_l) {
            Constant.rcmz_l_l = textdouble;
            SpUtil.saveSP(getContext(), "rcmz_l_l", Constant.rcmz_l_l);
        } else if (view == rcmz_l_gwz) {
            Constant.rcmz_l_gwz = textdouble;
            SpUtil.saveSP(getContext(), "rcmz_l_gwz", Constant.rcmz_l_gwz);
        } else if (view == rcmz_flhj) {
            Constant.rcmz_flhj = textdouble;
            SpUtil.saveSP(getContext(), "rcmz_flhj", Constant.rcmz_flhj);
        } else if (view == rcmz_gwz) {
            Constant.rcmz_gwz = textdouble;
            SpUtil.saveSP(getContext(), "rcmz_gwz", Constant.rcmz_gwz);
        } else if (view == prmz_f_xf) {
            Constant.prmz_f_xf = textdouble;
            SpUtil.saveSP(getContext(), "prmz_f_xf", Constant.prmz_f_xf);
        } else if (view == prmz_f_gwz) {
            Constant.prmz_f_gwz = textdouble;
            SpUtil.saveSP(getContext(), "prmz_f_gwz", Constant.prmz_f_gwz);
        } else if (view == prmz_l_l) {
            Constant.prmz_l_l = textdouble;
            SpUtil.saveSP(getContext(), "prmz_l_l", Constant.prmz_l_l);
        } else if (view == prmz_l_gwz) {
            Constant.prmz_l_gwz = textdouble;
            SpUtil.saveSP(getContext(), "prmz_l_gwz", Constant.prmz_l_gwz);
        } else if (view == prmz_flhj) {
            Constant.prmz_flhj = textdouble;
            SpUtil.saveSP(getContext(), "prmz_flhj", Constant.prmz_flhj);
        } else if (view == prmz_gwz) {
            Constant.prmz_gwz = textdouble;
            SpUtil.saveSP(getContext(), "prmz_gwz", Constant.prmz_gwz);
        } else if (view == przz_f_xf) {
            Constant.przz_f_xf = textdouble;
            SpUtil.saveSP(getContext(), "przz_f_xf", Constant.przz_f_xf);
        } else if (view == przz_f_gwz) {
            Constant.przz_f_gwz = textdouble;
            SpUtil.saveSP(getContext(), "przz_f_gwz", Constant.przz_f_gwz);
        } else if (view == przz_l_l) {
            Constant.przz_l_l = textdouble;
            SpUtil.saveSP(getContext(), "przz_l_l", Constant.przz_l_l);
        } else if (view == przz_l_gwz) {
            Constant.przz_l_gwz = textdouble;
            SpUtil.saveSP(getContext(), "przz_l_gwz", Constant.przz_l_gwz);
        } else if (view == przz_flhj) {
            Constant.przz_flhj = textdouble;
            SpUtil.saveSP(getContext(), "przz_flhj", Constant.przz_flhj);
        } else if (view == przz_gwz) {
            Constant.przz_gwz = textdouble;
            SpUtil.saveSP(getContext(), "przz_gwz", Constant.przz_gwz);
        } else if (view == byzz_f_xf) {
            Constant.byzz_f_xf = textdouble;
            SpUtil.saveSP(getContext(), "byzz_f_xf", Constant.byzz_f_xf);
        } else if (view == byzz_f_gwz) {
            Constant.byzz_f_gwz = textdouble;
            SpUtil.saveSP(getContext(), "byzz_f_gwz", Constant.byzz_f_gwz);
        } else if (view == byzz_l_l) {
            Constant.byzz_l_l = textdouble;
            SpUtil.saveSP(getContext(), "byzz_l_l", Constant.byzz_l_l);
        } else if (view == byzz_l_gwz) {
            Constant.byzz_l_gwz = textdouble;
            SpUtil.saveSP(getContext(), "byzz_l_gwz", Constant.byzz_l_gwz);
        } else if (view == byzz_flhj) {
            Constant.byzz_flhj = textdouble;
            SpUtil.saveSP(getContext(), "byzz_flhj", Constant.byzz_flhj);
        } else if (view == byzz_gwz) {
            Constant.przz_gwz = textdouble;
            SpUtil.saveSP(getContext(), "byzz_gwz", Constant.byzz_gwz);
        } else if (view == szyfz_f_xf) {
            Constant.szyfz_f_xf = textdouble;
            SpUtil.saveSP(getContext(), "szyfz_f_xf", Constant.szyfz_f_xf);
        } else if (view == szyfz_f_gwz) {
            Constant.szyfz_f_gwz = textdouble;
            SpUtil.saveSP(getContext(), "szyfz_f_gwz", Constant.szyfz_f_gwz);
        } else if (view == szyfz_l_l) {
            Constant.szyfz_l_l = textdouble;
            SpUtil.saveSP(getContext(), "szyfz_l_l", Constant.szyfz_l_l);
        } else if (view == szyfz_l_gwz) {
            Constant.szyfz_l_gwz = textdouble;
            SpUtil.saveSP(getContext(), "szyfz_l_gwz", Constant.szyfz_l_gwz);
        } else if (view == szyfz_flhj) {
            Constant.szyfz_flhj = textdouble;
            SpUtil.saveSP(getContext(), "szyfz_flhj", Constant.szyfz_flhj);
        } else if (view == szyfz_gwz) {
            Constant.szyfz_gwz = textdouble;
            SpUtil.saveSP(getContext(), "szyfz_gwz", Constant.szyfz_gwz);
        }
    }
}
