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
public class ZsjzFragment extends BaseFragment {
    @NotEmpty
    private EditText mGzjxqsyj_c_Edi;
    @NotEmpty
    private EditText mGzjxqsyj_k_Edi;
    @NotEmpty
    private EditText mGzjxqsyj_gdk_Edi;
    @NotEmpty
    private EditText mGzjxqsyj_mj_Edi;
    @NotEmpty
    private EditText mGzjxqsyj_dj_Edi;
    @NotEmpty
    private EditText mRcl_c_Edi;
    @NotEmpty
    private EditText mRcl_k_Edi;
    @NotEmpty
    private EditText mRcl_gdk_Edi;
    @NotEmpty
    private EditText mRcl_mj_Edi;
    @NotEmpty
    private EditText mRcl_dj_Edi;
    @NotEmpty
    private EditText mFwl_c_Edi;
    @NotEmpty
    private EditText mFwl_k_Edi;
    @NotEmpty
    private EditText mFwl_gdk_Edi;
    @NotEmpty
    private EditText mFwl_mj_Edi;
    @NotEmpty
    private EditText mFwl_dj_Edi;
    @NotEmpty
    private EditText mByl_c_Edi;
    @NotEmpty
    private EditText mByl_k_Edi;
    @NotEmpty
    private EditText mByl_gdk_Edi;
    @NotEmpty
    private EditText mByl_mj_Edi;
    @NotEmpty
    private EditText mByl_dj_Edi;
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

    private Button mZsjzmj_next_But;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zsjz, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {
        mGzjxqsyj_c_Edi = (EditText) view.findViewById(R.id.gzjxqsyj_c_Edi);
        mGzjxqsyj_c_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.gzjxqsyj_c != 0)
            mGzjxqsyj_c_Edi.setText(Constant.gzjxqsyj_c + "");

        mGzjxqsyj_k_Edi = (EditText) view.findViewById(R.id.gzjxqsyj_k_Edi);
        mGzjxqsyj_k_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.gzjxqsyj_k != 0)
            mGzjxqsyj_k_Edi.setText(Constant.gzjxqsyj_k + "");

        mGzjxqsyj_gdk_Edi = (EditText) view.findViewById(R.id.gzjxqsyj_gdk_Edi);
        mGzjxqsyj_gdk_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.gzjxqsyj_gdk != 0)
            mGzjxqsyj_gdk_Edi.setText(Constant.gzjxqsyj_gdk + "");

        mGzjxqsyj_mj_Edi = (EditText) view.findViewById(R.id.gzjxqsyj_mj_Edi);
        mGzjxqsyj_mj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.gzjxqsyj_mj != 0)
            mGzjxqsyj_mj_Edi.setText(Constant.gzjxqsyj_mj + "");

        mGzjxqsyj_dj_Edi = (EditText) view.findViewById(R.id.gzjxqsyj_dj_Edi);
        mGzjxqsyj_dj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.gzjxqsyj_dj != 0)
            mGzjxqsyj_dj_Edi.setText(Constant.gzjxqsyj_dj + "");

        mRcl_c_Edi = (EditText) view.findViewById(R.id.rcl_c_Edi);
        mRcl_c_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.rcl_c != 0)
            mRcl_c_Edi.setText(Constant.rcl_c + "");

        mRcl_k_Edi = (EditText) view.findViewById(R.id.rcl_k_Edi);
        mRcl_k_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.rcl_k != 0)
            mRcl_k_Edi.setText(Constant.rcl_k + "");

        mRcl_gdk_Edi = (EditText) view.findViewById(R.id.rcl_gdk_Edi);
        mRcl_gdk_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.rcl_gdk != 0)
            mRcl_gdk_Edi.setText(Constant.rcl_gdk + "");

        mRcl_mj_Edi = (EditText) view.findViewById(R.id.rcl_mj_Edi);
        mRcl_mj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.rcl_mj != 0)
            mRcl_mj_Edi.setText(Constant.rcl_mj + "");

        mRcl_dj_Edi = (EditText) view.findViewById(R.id.rcl_dj_Edi);
        mRcl_dj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.rcl_dj != 0)
            mRcl_dj_Edi.setText(Constant.rcl_dj + "");

        mFwl_c_Edi = (EditText) view.findViewById(R.id.fwl_c_Edi);
        mFwl_c_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.fwl_c != 0)
            mFwl_c_Edi.setText(Constant.fwl_c + "");

        mFwl_k_Edi = (EditText) view.findViewById(R.id.fwl_k_Edi);
        mFwl_k_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.fwl_k != 0)
            mFwl_k_Edi.setText(Constant.fwl_k + "");

        mFwl_gdk_Edi = (EditText) view.findViewById(R.id.fwl_gdk_Edi);
        mFwl_gdk_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.fwl_gdk != 0)
            mFwl_gdk_Edi.setText(Constant.fwl_gdk + "");

        mFwl_mj_Edi = (EditText) view.findViewById(R.id.fwl_mj_Edi);
        mFwl_mj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.fwl_mj != 0)
            mFwl_mj_Edi.setText(Constant.fwl_mj + "");

        mFwl_dj_Edi = (EditText) view.findViewById(R.id.fwl_dj_Edi);
        mFwl_dj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.fwl_dj != 0)
            mFwl_dj_Edi.setText(Constant.fwl_dj + "");

        mByl_c_Edi = (EditText) view.findViewById(R.id.byl_c_Edi);
        mByl_c_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.byl_c != 0)
            mByl_c_Edi.setText(Constant.byl_c + "");

        mByl_k_Edi = (EditText) view.findViewById(R.id.byl_k_Edi);
        mByl_k_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.byl_k != 0)
            mByl_k_Edi.setText(Constant.byl_k + "");

        mByl_gdk_Edi = (EditText) view.findViewById(R.id.byl_gdk_Edi);
        mByl_gdk_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.byl_gdk != 0)
            mByl_gdk_Edi.setText(Constant.byl_gdk + "");

        mByl_mj_Edi = (EditText) view.findViewById(R.id.byl_mj_Edi);
        mByl_mj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.byl_mj != 0)
            mByl_mj_Edi.setText(Constant.byl_mj + "");

        mByl_dj_Edi = (EditText) view.findViewById(R.id.byl_dj_Edi);
        mByl_dj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.byl_dj != 0)
            mByl_dj_Edi.setText(Constant.byl_dj + "");

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
    public void saveData(EditText view, String text) {
        if (view == mGzjxqsyj_c_Edi) {
            Constant.gzjxqsyj_c = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "gzjxqsyj_c", Constant.gzjxqsyj_c);
        }


        if (view == mGzjxqsyj_k_Edi) {
            Constant.gzjxqsyj_k = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "gzjxqsyj_k", Constant.gzjxqsyj_k);
        }


        if (view == mGzjxqsyj_gdk_Edi) {
            Constant.gzjxqsyj_gdk = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "gzjxqsyj_gdk", Constant.gzjxqsyj_gdk);
        }


        if (view == mGzjxqsyj_mj_Edi) {
            Constant.gzjxqsyj_mj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "gzjxqsyj_mj", Constant.gzjxqsyj_mj);
        }

        if (view == mGzjxqsyj_dj_Edi) {
            Constant.gzjxqsyj_dj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "gzjxqsyj_dj", Constant.gzjxqsyj_dj);
            mGzjxqsyj_dj_Edi.setText(text + "");
        }

        if (view == mRcl_c_Edi) {
            Constant.rcl_c = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "rcl_c", Constant.rcl_c);
        }

        if (view == mRcl_k_Edi) {
            Constant.rcl_k = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "rcl_k", Constant.rcl_k);
        }

        if (view == mRcl_gdk_Edi) {
            Constant.rcl_gdk = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "rcl_gdk", Constant.rcl_gdk);
        }

        if (view == mRcl_mj_Edi) {
            Constant.rcl_mj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "rcl_mj", Constant.rcl_mj);
        }

        if (view == mRcl_dj_Edi) {
            Constant.rcl_dj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "rcl_dj", Constant.rcl_dj);
        }

        if (view == mFwl_c_Edi) {
            Constant.fwl_c = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "fwl_c", Constant.fwl_c);
        }

        if (view == mFwl_k_Edi) {
            Constant.fwl_k = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "fwl_k", Constant.fwl_k);
        }

        if (view == mFwl_gdk_Edi) {
            Constant.fwl_gdk = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "fwl_gdk", Constant.fwl_gdk);
        }

        if (view == mFwl_mj_Edi) {

            Constant.fwl_mj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "fwl_mj", Constant.fwl_mj);
        }

        if (view == mFwl_dj_Edi) {
            Constant.fwl_dj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "fwl_dj", Constant.fwl_dj);
        }

        if (view == mByl_c_Edi) {
            Constant.byl_c = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "byl_c", Constant.byl_c);
        }
        if (view == mByl_k_Edi) {
            Constant.byl_k = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "byl_k", Constant.byl_k);
        }
        if (view == mByl_gdk_Edi) {
            Constant.byl_gdk = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "byl_gdk", Constant.byl_gdk);
        }
        if (view == mByl_mj_Edi) {
            Constant.byl_mj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "byl_mj", Constant.byl_mj);
        }
        if (view == mByl_dj_Edi) {
            Constant.byl_dj = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "byl_dj", Constant.byl_dj);
        }
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


            Constant.gzjxqsyj_mj = Utils.keep2Wdouble((Constant.gzjxqsyj_c + Constant.gzjxqsyj_gdk / 2) * Constant.gzjxqsyj_k, 2);

            Constant.fwl_mj = Utils.keep2Wdouble((Constant.fwl_c + Constant.fwl_gdk) * Constant.fwl_k, 2);

            Constant.rcl_mj = Utils.keep2Wdouble((Constant.rcl_c + Constant.rcl_gdk) * Constant.rcl_k, 2);

            Constant.byl_mj = Utils.keep2Wdouble((Constant.byl_c + Constant.byl_gdk / 2) * Constant.byl_k, 2);

            Constant.szyfl_mj = Utils.keep2Wdouble((Constant.szyfl_c + Constant.szyfl_gdk / 2) * Constant.szyfl_k, 2);
        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        mGzjxqsyj_mj_Edi.setText(Constant.gzjxqsyj_mj + "");

        mFwl_mj_Edi.setText(Constant.fwl_mj + "");

        mRcl_mj_Edi.setText(Constant.rcl_mj + "");

        mByl_mj_Edi.setText(Constant.byl_mj + "");

        mSzyfl_mj_Edi.setText(Constant.szyfl_mj + "");
    }
}
