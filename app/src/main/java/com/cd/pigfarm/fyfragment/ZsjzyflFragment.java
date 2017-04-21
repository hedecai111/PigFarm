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
 * @date 2017/3/30 13:37
 * @Description: 猪舍建筑参数设置界面
 */
public class ZsjzyflFragment extends BaseFragment implements View.OnClickListener {

    @NotEmpty
    private EditText mSzyfl_c_Edi;
    @NotEmpty
    private EditText mSzyfl_k_Edi;
    @NotEmpty
    private EditText mSzyfl_gdk_Edi;
    @NotEmpty
    private EditText mSzyfl_mj_Edi;
    @NotEmpty
    private EditText mSzyfl_dj_Edi;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zsjz_yfc, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {


        mSzyfl_c_Edi = (EditText) view.findViewById(R.id.szyfl_c_Edi);
        mSzyfl_c_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.szyfl_c != 0)
            mSzyfl_c_Edi.setText(Constant.szyfl_c + "");

        mSzyfl_k_Edi = (EditText) view.findViewById(R.id.szyfl_k_Edi);
        mSzyfl_k_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.szyfl_k != 0)
            mSzyfl_k_Edi.setText(Constant.szyfl_k + "");

        mSzyfl_gdk_Edi = (EditText) view.findViewById(R.id.szyfl_gdk_Edi);
        mSzyfl_gdk_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.szyfl_gdk != 0)
            mSzyfl_gdk_Edi.setText(Constant.szyfl_gdk + "");

        mSzyfl_mj_Edi = (EditText) view.findViewById(R.id.szyfl_mj_Edi);
        mSzyfl_mj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.szyfl_mj != 0)
            mSzyfl_mj_Edi.setText(Constant.szyfl_mj + "");

        mSzyfl_dj_Edi = (EditText) view.findViewById(R.id.szyfl_dj_Edi);
        mSzyfl_dj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.szyfl_dj != 0)
            mSzyfl_dj_Edi.setText(Constant.szyfl_dj + "");


    }

    @Override
    public void onClick(View v) {
        validator.validate();
    }

    @Override
    public void saveData(EditText view, String text) {

        if (view == mSzyfl_c_Edi) {
            Constant.szyfl_c = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "szyfl_c", Constant.szyfl_c);
        }
        if (view == mSzyfl_k_Edi) {
            Constant.szyfl_k = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "szyfl_k", Constant.szyfl_k);
        }
        if (view == mSzyfl_gdk_Edi) {
            Constant.szyfl_gdk = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "szyfl_gdk", Constant.szyfl_gdk);
        }
        if (view == mSzyfl_mj_Edi) {
            Constant.szyfl_mj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "szyfl_mj", Constant.szyfl_mj);
        }
        if (view == mSzyfl_dj_Edi) {
            Constant.szyfl_dj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "szyfl_dj", Constant.szyfl_dj);
        }
    }

    @Override
    public void jsDatas() {
        try {

            Constant.szyfl_mj = Utils.keep2Wdouble((Constant.szyfl_c + Constant.szyfl_gdk / 2) * Constant.szyfl_k, 2);
        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        if (Constant.szyfl_mj == 0){
            Toast.makeText(getContext(),"请先设置存栏商品猪数和猪场设计参数",Toast.LENGTH_SHORT).show();
            return;
        }
        mSzyfl_mj_Edi.setText(Constant.szyfl_mj + "");
    }
}
