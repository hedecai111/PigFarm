package com.cd.pigfarm.fyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
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
public class FsclyfcFragment extends BaseFragment {


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
        view = View.inflate(getContext(), R.layout.fragment_fscl_yfc, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {
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
            //生长育肥猪
           // Constant.szyfz_f_gwz = Utils.keep2Wdouble(Constant.szyfz_f_xf * Constant.ycz_f_gwz, 2);
            //Constant.szyfz_l_gwz = Utils.keep2Wdouble(Constant.szyfz_l_l * Constant.ycz_l_gwz, 2);
           // Constant.szyfz_flhj = Utils.keep2Wdouble(Constant.szyfz_f_gwz * Constant.ycz_f_gwzhdl + Constant.szyfz_l_l * Constant.ycz_l_ld / 1000 / 1000, 3);
            //Constant.szyfz_gwz = Utils.keep2Wdouble(Constant.szyfz_f_gwz + Constant.ycz_l_gwz, 2);
        } catch (Exception e) {
            Log.e("error", e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        //生长育肥猪
        szyfz_f_gwz.setText(Constant.szyfz_f_gwz + "");
        szyfz_l_gwz.setText(Constant.szyfz_l_gwz + "");
        szyfz_flhj.setText(Constant.szyfz_flhj + "");
        szyfz_gwz.setText(Constant.szyfz_gwz + "");
    }

    @Override
    public void saveData(EditText view, String text) {
        double textdouble = Double.parseDouble(text);
        if (view == szyfz_f_xf) {
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
