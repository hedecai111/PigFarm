package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.LogUtil;
import com.cd.pigfarm.util.SpUtil;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import static com.cd.pigfarm.constant.Constant.gye_dnrl_zysj;
import static com.cd.pigfarm.constant.Constant.gye_fzzq;
import static com.cd.pigfarm.constant.Constant.gye_szyf_scrl;
import static com.cd.pigfarm.constant.Constant.gye_szyf_zysj;
import static com.cd.pigfarm.constant.Constant.gye_zzby_scrl;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/26 21:22
 * @Description: 工艺选择Frament
 */
public class GyFragment extends BaseFragment {
    @NotEmpty
    private TextView mGyy_pzrc_scrl;
    private TextView mGyy_pzrc_zysj;
    private TextView mGyy_dnrl_scrl;
    private TextView mGyy_dnrl_zysj;
    private TextView mGyy_zzby_scrl;
    private TextView mGyy_zzby_zysj;
    private TextView mGyy_szyf_scrl;
    private TextView mGyy_szyf_zysj;
    private TextView mGyy_fzzq;

    private TextView mGye_dnzrc_scrl;
    private TextView mGye_dnzrc_zysj;
    private TextView mGye_rcq_scrl;
    private TextView mGye_rcq_zysj;
    private TextView mGye_dnrl_scrl;
    private TextView mGye_dnrl_zysj;
    private TextView mGye_zzby_scrl;
    private TextView mGye_zzby_zysj;
    private TextView mGye_szyf_scrl;
    private TextView mGye_szyf_zysj;
    private TextView mGye_fzzq;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.fragment_gy, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        mGyy_pzrc_scrl = (TextView) view.findViewById(R.id.gyy_pzrc_scrl);
        mGyy_pzrc_zysj = (TextView) view.findViewById(R.id.gyy_pzrc_zysj);
        mGyy_dnrl_scrl = (TextView) view.findViewById(R.id.gyy_dnrl_scrl);
        mGyy_dnrl_zysj = (TextView) view.findViewById(R.id.gyy_dnrl_zysj);
        mGyy_zzby_scrl = (TextView) view.findViewById(R.id.gyy_zzby_scrl);
        mGyy_zzby_zysj = (TextView) view.findViewById(R.id.gyy_zzby_zysj);
        mGyy_szyf_scrl = (TextView) view.findViewById(R.id.gyy_szyf_scrl);
        mGyy_szyf_zysj = (TextView) view.findViewById(R.id.gyy_szyf_zysj);
        mGyy_fzzq = (TextView) view.findViewById(R.id.gyy_fzzq);

        mGye_dnzrc_scrl = (TextView) view.findViewById(R.id.gye_dnzrc_scrl);
        mGye_dnzrc_zysj = (TextView) view.findViewById(R.id.gye_dnzrc_zysj);
        mGye_rcq_scrl = (TextView) view.findViewById(R.id.gye_rcq_scrl);
        mGye_rcq_zysj = (TextView) view.findViewById(R.id.gye_rcq_zysj);
        mGye_dnrl_scrl = (TextView) view.findViewById(R.id.gye_dnrl_scrl);
        mGye_dnrl_zysj = (TextView) view.findViewById(R.id.gye_dnrl_zysj);
        mGye_zzby_scrl = (TextView) view.findViewById(R.id.gye_zzby_scrl);
        mGye_zzby_zysj = (TextView) view.findViewById(R.id.gye_zzby_zysj);
        mGye_szyf_scrl = (TextView) view.findViewById(R.id.gye_szyf_scrl);
        mGye_szyf_zysj = (TextView) view.findViewById(R.id.gye_szyf_zysj);
        mGye_fzzq = (TextView) view.findViewById(R.id.gye_fzzq);

    }

    @Override
    public void refreshViews() {
        /**
         * 工艺一
         */

        if (Constant.gyy_pzrc_scrl == 0){
            Toast.makeText(getContext(),"请先设置基本参数",Toast.LENGTH_LONG).show();
            return;

        }
        mGyy_pzrc_scrl.setText(Constant.gyy_pzrc_scrl + "");

        mGyy_pzrc_zysj.setText(Constant.gyy_pzrc_zysj + "");

        mGyy_dnrl_scrl.setText(Constant.gyy_dnrl_scrl + "");

        mGyy_dnrl_zysj.setText(Constant.gyy_dnrl_zysj + "");

        mGyy_zzby_scrl.setText(Constant.gyy_zzby_scrl + "");

        mGyy_zzby_zysj.setText(Constant.gyy_zzby_zysj + "");

        mGyy_szyf_scrl.setText(Constant.gyy_szyf_scrl + "");

        mGyy_szyf_zysj.setText(Constant.gyy_szyf_zysj + "");

        mGyy_fzzq.setText(Constant.gyy_fzzq + "");

        /**
         * 工艺二
         */

        mGye_dnzrc_scrl.setText(Constant.gyy_pzrc_scrl + "");

        mGye_dnzrc_zysj.setText(Constant.gyy_pzrc_scrl + "");

        mGye_rcq_scrl.setText(Constant.gye_rcq_scrl + "");

        mGye_rcq_zysj.setText(Constant.gye_rcq_zysj + "");

        mGye_dnrl_scrl.setText(Constant.gye_dnrl_scrl + "");

        mGye_dnrl_zysj.setText(Constant.gye_dnrl_zysj + "");

        mGye_zzby_scrl.setText(Constant.gye_zzby_scrl + "");

        mGye_zzby_zysj.setText(Constant.gye_zzby_zysj + "");

        mGye_szyf_scrl.setText(Constant.gye_zzby_zysj + "");

        mGye_szyf_zysj.setText(gye_szyf_zysj + "");

        mGye_fzzq.setText(gye_fzzq + "");

    }

    @Override
    public void jsDatas() {
        try {

            /**
             * 工艺一
             */
            if (Constant.dnzpzjg != 0 && Constant.mzrcq != 0) {
                Constant.gyy_pzrc_scrl = Constant.dnzpzjg + Constant.mzrcq;
                //SpUtil.saveSP(getContext(), "gyy_pzrc_scrl", Constant.gyy_pzrc_scrl);
            }
            if (Constant.gyy_pzrc_scrl != 0) {
                Constant.gyy_pzrc_zysj = Constant.gyy_pzrc_scrl - 7;
               // SpUtil.saveSP(getContext(), "gyy_pzrc_zysj", Constant.gyy_pzrc_zysj);
                //mGyy_pzrc_zysj.setText(Constant.gyy_pzrc_zysj + "");
            }
            if (Constant.dnrl != 0) {
                Constant.gyy_dnrl_scrl = Constant.dnrl;
                //SpUtil.saveSP(getContext(), "gyy_dnrl_scrl", Constant.gyy_dnrl_scrl);
            }
            if (Constant.gyy_dnrl_scrl != 0) {
                Constant.gyy_dnrl_zysj = Constant.gyy_dnrl_scrl + 7;
                //SpUtil.saveSP(getContext(), "gyy_dnrl_zysj", Constant.gyy_dnrl_zysj);
            }
            if (Constant.byq != 0) {
                Constant.gyy_zzby_scrl = Constant.byq;
                //SpUtil.saveSP(getContext(), "gyy_zzby_scrl", Constant.gyy_zzby_scrl);
            }
            if (Constant.gyy_zzby_scrl != 0) {
                Constant.gyy_zzby_zysj = Constant.gyy_zzby_scrl;
                //SpUtil.saveSP(getContext(), "gyy_zzby_zysj", Constant.gyy_zzby_zysj);
            }
            if (Constant.szyfq != 0) {
                Constant.gyy_szyf_scrl = Constant.szyfq;
                //SpUtil.saveSP(getContext(), "gyy_szyf_scrl", Constant.gyy_szyf_scrl);
            }
            if (Constant.gyy_szyf_scrl != 0) {
                Constant.gyy_szyf_zysj = Constant.gyy_szyf_scrl;
               // SpUtil.saveSP(getContext(), "gyy_szyf_zysj", Constant.gyy_szyf_zysj);
            }
            if (Constant.gyy_pzrc_scrl != 0 && Constant.gyy_dnrl_scrl != 0) {
                Constant.gyy_fzzq = Constant.gyy_pzrc_scrl + Constant.gyy_dnrl_scrl;
                //SpUtil.saveSP(getContext(), "gyy_fzzq", Constant.gyy_fzzq);
            }
            /**
             * 工艺二
             */
            if (Constant.dnzpzjg != 0 && Constant.rcjc != 0) {
                Constant.gye_dnzrc_scrl = Constant.dnzpzjg + Constant.rcjc;
                //SpUtil.saveSP(getContext(), "gye_dnzrc_scrl", Constant.gyy_pzrc_scrl);
            }
            if (Constant.dnzpzjg != 0 && Constant.rcjc != 0) {
                Constant.gye_dnzrc_zysj = Constant.dnzpzjg + Constant.rcjc;
                //SpUtil.saveSP(getContext(), "gye_dnzrc_zysj", Constant.gye_dnzrc_zysj);
            }
            if (Constant.mzrcq != 0 && Constant.rcjc != 0) {
                Constant.gye_rcq_scrl = Constant.mzrcq - Constant.rcjc;
               // SpUtil.saveSP(getContext(), "gye_rcq_scrl", Constant.gye_rcq_scrl);
            }
            if (Constant.mzrcq != 0 && Constant.rcjc != 0) {
                Constant.gye_rcq_zysj = Constant.mzrcq - Constant.rcjc - 7;
               // SpUtil.saveSP(getContext(), "gye_rcq_zysj", Constant.gye_rcq_zysj);
            }
            if (Constant.dnrl != 0) {
                Constant.gye_dnrl_scrl = Constant.dnrl;
                //SpUtil.saveSP(getContext(), "gye_dnrl_scrl", Constant.gye_dnrl_scrl);
            }
            if (Constant.dnrl != 0) {
                gye_dnrl_zysj = Constant.dnrl + 7;
               // SpUtil.saveSP(getContext(), "gye_dnrl_zysj", Constant.gye_dnrl_zysj);
            }
            if (Constant.byq != 0) {
                gye_zzby_scrl = Constant.byq;
                //SpUtil.saveSP(getContext(), "gye_zzby_scrl", Constant.gye_zzby_scrl);
            }
            if (Constant.byq != 0) {
                Constant.gye_zzby_zysj = Constant.byq;
               // SpUtil.saveSP(getContext(), "gye_zzby_zysj", Constant.gye_zzby_zysj);
            }
            if (Constant.szyfq != 0) {
                Constant.gye_szyf_scrl = Constant.szyfq;
               // SpUtil.saveSP(getContext(), "gye_szyf_scrl", gye_szyf_scrl);
            }
            if (Constant.szyfq != 0) {
                gye_szyf_zysj = Constant.szyfq;
                //SpUtil.saveSP(getContext(), "gye_szyf_zysj", gye_szyf_zysj);
            }
            if (Constant.gye_dnzrc_scrl != 0 && Constant.gye_rcq_scrl != 0 && Constant.gye_dnrl_scrl != 0) {
                gye_fzzq = Constant.gye_dnzrc_scrl + Constant.gye_rcq_scrl + Constant.gye_dnrl_scrl;
               // SpUtil.saveSP(getContext(), "gye_fzzq", gye_fzzq);
            }
        } catch (Exception e) {
            LogUtil.e(e.getMessage());
        }
    }
}

