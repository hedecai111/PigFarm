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
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 13:37
 * @Description: 猪群结构界面
 */
public class ZqjgFragment extends BaseFragment {

    @NotEmpty
    private EditText zfzyc_gzslzrjp_gyy;
    @NotEmpty
    private EditText zfzyc_gzslzrjp_gye;
    @NotEmpty
    private EditText zfzyc_gzslzrgsj_gyy;
    @NotEmpty
    private EditText zfzyc_gzslzrgsj_gye;
    @NotEmpty
    private EditText zfzyc_hbmz_gyy;
    @NotEmpty
    private EditText zfzyc_hbmz_gye;
    @NotEmpty
    private EditText zfzyc_pzrcmz_gyy;
    @NotEmpty
    private EditText zfzyc_pzrcmz_gye;
    @NotEmpty
    private EditText zfzyc_rcmz_gyy;
    @NotEmpty
    private EditText zfzyc_rcmz_gye;
    @NotEmpty
    private EditText zfzyc_prmz_gyy;
    @NotEmpty
    private EditText zfzyc_prmz_gye;
    @NotEmpty
    private EditText zfzyc_przz_gyy;
    @NotEmpty
    private EditText zfzyc_przz_gye;
    @NotEmpty
    private EditText zfzyc_byzz_gyy;

    @NotEmpty
    private EditText zfzyc_byzz_gye;
    @NotEmpty
    private EditText zfzyc_szyfz_gyy;
    @NotEmpty
    private EditText zfzyc_szyfz_gye;
    @NotEmpty
    private EditText zfzyc_nclspz_gyy;
    @NotEmpty
    private EditText zfzyc_nclspz_gye;
    @NotEmpty
    private EditText zzfzc_cz_gzslzrjp_gyy;
    @NotEmpty
    private EditText zzfzc_cz_gzslzrjp_gye;
    @NotEmpty
    private EditText zzfzc_cz_gzslzrgsj_gyy;
    @NotEmpty
    private EditText zzfzc_cz_gzslzrgsj_gye;
    @NotEmpty
    private EditText zzfzc_cz_hbmz_gyy;
    @NotEmpty
    private EditText zzfzc_cz_hbmz_gye;
    @NotEmpty
    private EditText zzfzc_cz_pzrjmz_gyy;
    @NotEmpty
    private EditText zzfzc_cz_pzrjmz_gye;
    @NotEmpty
    private EditText zzfzc_cz_rcmz_gyy;
    @NotEmpty
    private EditText zzfzc_cz_rcmz_gye;
    @NotEmpty
    private EditText zzfzc_cz_prmz_gyy;
    @NotEmpty
    private EditText zzfzc_cz_prmz_gye;
    @NotEmpty
    private EditText zzfzc_cz_przz_gyy;
    @NotEmpty
    private EditText zzfzc_cz_przz_gye;
    @NotEmpty
    private EditText zzfzc_cz_ngdnzz_gyy;
    @NotEmpty
    private EditText zzfzc_cz_ngdnzz_gye;
    @NotEmpty
    private EditText zzfzc_by_gzslzrjp_gyy;
    @NotEmpty
    private EditText zzfzc_by_gzslzrjp_gye;
    @NotEmpty
    private EditText zzfzc_by_gzslzrgsj_gyy;
    @NotEmpty
    private EditText zzfzc_by_gzslzrgsj_gye;
    @NotEmpty
    private EditText zzfzc_by_hbmz_gyy;
    @NotEmpty
    private EditText zzfzc_by_hbmz_gye;
    @NotEmpty
    private EditText zzfzc_by_pzrjmz_gyy;
    @NotEmpty
    private EditText zzfzc_by_pzrjmz_gye;
    @NotEmpty
    private EditText zzfzc_by_rcmz_gyy;
    @NotEmpty
    private EditText zzfzc_by_rcmz_gye;
    @NotEmpty
    private EditText zzfzc_by_prmz_gyy;
    @NotEmpty
    private EditText zzfzc_by_prmz_gye;
    @NotEmpty
    private EditText zzfzc_by_przz_gyy;
    @NotEmpty
    private EditText zzfzc_by_przz_gye;
    @NotEmpty
    private EditText zzfzc_by_byzz_gyy;
    @NotEmpty
    private EditText zzfzc_by_byzz_gye;
    @NotEmpty
    private EditText zzfzc_by_ngbyzz_gyy;
    @NotEmpty
    private EditText zzfzc_by_ngbyzz_gye;
    private Button next_But;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zqjg, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        zfzyc_gzslzrjp_gyy = (EditText) view.findViewById(R.id.zfzyc_gzslzrjp_gyy);
        zfzyc_gzslzrjp_gye = (EditText) view.findViewById(R.id.zfzyc_gzslzrjp_gye);
        zfzyc_gzslzrgsj_gyy = (EditText) view.findViewById(R.id.zfzyc_gzslzrgsj_gyy);
        zfzyc_gzslzrgsj_gye = (EditText) view.findViewById(R.id.zfzyc_gzslzrgsj_gye);
        zfzyc_hbmz_gyy = (EditText) view.findViewById(R.id.zfzyc_hbmz_gyy);
        zfzyc_hbmz_gye = (EditText) view.findViewById(R.id.zfzyc_hbmz_gye);
        zfzyc_pzrcmz_gyy = (EditText) view.findViewById(R.id.zfzyc_pzrcmz_gyy);
        zfzyc_pzrcmz_gye = (EditText) view.findViewById(R.id.zfzyc_pzrcmz_gye);
        zfzyc_rcmz_gyy = (EditText) view.findViewById(R.id.zfzyc_rcmz_gyy);
        zfzyc_rcmz_gye = (EditText) view.findViewById(R.id.zfzyc_rcmz_gye);
        zfzyc_prmz_gyy = (EditText) view.findViewById(R.id.zfzyc_prmz_gyy);
        zfzyc_prmz_gye = (EditText) view.findViewById(R.id.zfzyc_prmz_gye);
        zfzyc_przz_gyy = (EditText) view.findViewById(R.id.zfzyc_przz_gyy);
        zfzyc_przz_gye = (EditText) view.findViewById(R.id.zfzyc_przz_gye);
        zfzyc_byzz_gyy = (EditText) view.findViewById(R.id.zfzyc_byzz_gyy);
        zfzyc_byzz_gye = (EditText) view.findViewById(R.id.zfzyc_byzz_gye);
        zfzyc_szyfz_gyy = (EditText) view.findViewById(R.id.zfzyc_szyfz_gyy);
        zfzyc_szyfz_gye = (EditText) view.findViewById(R.id.zfzyc_szyfz_gye);
        zfzyc_nclspz_gyy = (EditText) view.findViewById(R.id.zfzyc_nclspz_gyy);
        zfzyc_nclspz_gye = (EditText) view.findViewById(R.id.zfzyc_nclspz_gye);
        zzfzc_cz_gzslzrjp_gyy = (EditText) view.findViewById(R.id.zzfzc_cz_gzslzrjp_gyy);
        zzfzc_cz_gzslzrjp_gye = (EditText) view.findViewById(R.id.zzfzc_cz_gzslzrjp_gye);
        zzfzc_cz_gzslzrgsj_gyy = (EditText) view.findViewById(R.id.zzfzc_cz_gzslzrgsj_gyy);
        zzfzc_cz_gzslzrgsj_gye = (EditText) view.findViewById(R.id.zzfzc_cz_gzslzrgsj_gye);
        zzfzc_cz_hbmz_gyy = (EditText) view.findViewById(R.id.zzfzc_cz_hbmz_gyy);
        zzfzc_cz_hbmz_gye = (EditText) view.findViewById(R.id.zzfzc_cz_hbmz_gye);
        zzfzc_cz_pzrjmz_gyy = (EditText) view.findViewById(R.id.zzfzc_cz_pzrjmz_gyy);
        zzfzc_cz_pzrjmz_gye = (EditText) view.findViewById(R.id.zzfzc_cz_pzrjmz_gye);
        zzfzc_cz_rcmz_gyy = (EditText) view.findViewById(R.id.zzfzc_cz_rcmz_gyy);
        zzfzc_cz_rcmz_gye = (EditText) view.findViewById(R.id.zzfzc_cz_rcmz_gye);
        zzfzc_cz_prmz_gyy = (EditText) view.findViewById(R.id.zzfzc_cz_prmz_gyy);
        zzfzc_cz_prmz_gye = (EditText) view.findViewById(R.id.zzfzc_cz_prmz_gye);
        zzfzc_cz_przz_gyy = (EditText) view.findViewById(R.id.zzfzc_cz_przz_gyy);
        zzfzc_cz_przz_gye = (EditText) view.findViewById(R.id.zzfzc_cz_przz_gye);
        zzfzc_cz_ngdnzz_gyy = (EditText) view.findViewById(R.id.zzfzc_cz_ngdnzz_gyy);
        zzfzc_cz_ngdnzz_gye = (EditText) view.findViewById(R.id.zzfzc_cz_ngdnzz_gye);
        zzfzc_by_gzslzrjp_gyy = (EditText) view.findViewById(R.id.zzfzc_by_gzslzrjp_gyy);
        zzfzc_by_gzslzrjp_gye = (EditText) view.findViewById(R.id.zzfzc_by_gzslzrjp_gye);
        zzfzc_by_gzslzrgsj_gyy = (EditText) view.findViewById(R.id.zzfzc_by_gzslzrgsj_gyy);
        zzfzc_by_gzslzrgsj_gye = (EditText) view.findViewById(R.id.zzfzc_by_gzslzrgsj_gye);
        zzfzc_by_hbmz_gyy = (EditText) view.findViewById(R.id.zzfzc_by_hbmz_gyy);
        zzfzc_by_hbmz_gye = (EditText) view.findViewById(R.id.zzfzc_by_hbmz_gye);
        zzfzc_by_pzrjmz_gyy = (EditText) view.findViewById(R.id.zzfzc_by_pzrjmz_gyy);
        zzfzc_by_pzrjmz_gye = (EditText) view.findViewById(R.id.zzfzc_by_pzrjmz_gye);
        zzfzc_by_rcmz_gyy = (EditText) view.findViewById(R.id.zzfzc_by_rcmz_gyy);
        zzfzc_by_rcmz_gye = (EditText) view.findViewById(R.id.zzfzc_by_rcmz_gye);
        zzfzc_by_prmz_gyy = (EditText) view.findViewById(R.id.zzfzc_by_prmz_gyy);
        zzfzc_by_prmz_gye = (EditText) view.findViewById(R.id.zzfzc_by_prmz_gye);
        zzfzc_by_przz_gyy = (EditText) view.findViewById(R.id.zzfzc_by_przz_gyy);
        zzfzc_by_przz_gye = (EditText) view.findViewById(R.id.zzfzc_by_przz_gye);
        zzfzc_by_byzz_gyy = (EditText) view.findViewById(R.id.zzfzc_by_byzz_gyy);
        zzfzc_by_byzz_gye = (EditText) view.findViewById(R.id.zzfzc_by_byzz_gye);
        zzfzc_by_ngbyzz_gyy = (EditText) view.findViewById(R.id.zzfzc_by_ngbyzz_gyy);
        zzfzc_by_ngbyzz_gye = (EditText) view.findViewById(R.id.zzfzc_by_ngbyzz_gye);
    }

    /**
     * 初始化需要计算的数据
     */
    @Override
    public void jsDatas() {
        try {


            Constant.zfzyc_gzslzrjp_gye = Utils.keep2Wdouble(Constant.clmzz * Constant.zrjpbl, 0);

            Constant.zfzyc_gzslzrjp_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye, 0);

            Constant.zfzyc_gzslzrgsj_gye = Utils.keep2Wdouble(Constant.clmzz * Constant.zrgsj, 0);

            Constant.zfzyc_gzslzrgsj_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzslzrgsj_gye, 0);
            if (Constant.hbzpypc != 0) {
                Constant.zfzyc_hbmz_gye = Utils.keep2Wdouble(Constant.clmzz * Constant.zznttgxl / Constant.hbzpypc, 0);

            }
            Constant.zfzyc_hbmz_gyy = Utils.keep2Wdouble(Constant.zfzyc_hbmz_gye, 0);

           // Toast.makeText(getContext(),Constant.gyy_fzzq+"",Toast.LENGTH_SHORT).show();
            if (Constant.gyy_fzzq != 0) {
                Constant.zfzyc_pzrcmz_gye = Utils.keep2Wdouble(Constant.clmzz * (Constant.gye_dnzrc_scrl + Constant.gye_dnzrc_zysj * (1 - Constant.mzphl) + Constant.gye_dnrl_scrl * (1 - Constant.rcmzfwl)) / Constant.gye_fzzq, 0);
            }
            if (Constant.gyy_fzzq != 0) {
                Constant.zfzyc_pzrcmz_gyy = Utils.keep2Wdouble(Constant.clmzz * (Constant.gyy_pzrc_scrl + Constant.gyy_pzrc_zysj * (1 - Constant.rcmzfwl)) / Constant.gyy_fzzq, 0);
            }
            if (Constant.gyy_fzzq != 0) {
                Constant.zfzyc_rcmz_gye = Utils.keep2Wdouble(Constant.clmzz * Constant.gye_rcq_scrl * Constant.mzphl / Constant.gye_fzzq, 0);
            }
            if (Constant.gyy_fzzq != 0) {
                Constant.zfzyc_rcmz_gyy = Utils.keep2Wdouble(Constant.clmzz * (Constant.gyy_pzrc_scrl + Constant.gyy_pzrc_zysj * (1 - Constant.rcmzfwl)) / Constant.gyy_fzzq, 0);
            }
            if (Constant.gyy_fzzq != 0) {
                Constant.zfzyc_prmz_gye = Utils.keep2Wdouble(Constant.clmzz * Constant.gye_dnrl_scrl * Constant.rcmzfwl / Constant.gye_fzzq, 0);
            }
            Constant.zfzyc_prmz_gyy = Utils.keep2Wdouble(Constant.zfzyc_prmz_gye, 0);

            Constant.zfzyc_przz_gye = Utils.keep2Wdouble(Constant.mzwchzs * Constant.zfzyc_prmz_gye, 0);

            Constant.zfzyc_przz_gyy = Utils.keep2Wdouble(Constant.zfzyc_przz_gye, 0);

            Constant.zfzyc_byzz_gye = Utils.keep2Wdouble(Constant.zfzyc_przz_gye * Constant.prqchl, 0);

            Constant.zfzyc_byzz_gyy = Utils.keep2Wdouble(Constant.zfzyc_byzz_gye, 0);

            Constant.zfzyc_szyfz_gye = Utils.keep2Wdouble(Constant.zfzyc_byzz_gye * Constant.byqchl, 0);

            Constant.zfzyc_szyfz_gyy = Utils.keep2Wdouble(Constant.zfzyc_szyfz_gye, 0);

            if (Constant.gyy_fzzq != 0) {
                Constant.zfzyc_nclspz_gye = Utils.keep2Wdouble(Constant.clmzz * Constant.mnts / Constant.gye_fzzq * Constant.mzphl * Constant.rcmzfwl * Constant.mzwchzs * Constant.prqchl * Constant.byqchl * Constant.szyfqchl, 0);
            }
            Constant.zfzyc_nclspz_gyy = Utils.keep2Wdouble(Constant.zfzyc_nclspz_gye, 0);

            Constant.zzfzc_cz_gzslzrjp_gye = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye, 0);

            Constant.zzfzc_cz_gzslzrjp_gyy = Utils.keep2Wdouble(Constant.zzfzc_cz_gzslzrjp_gye, 0);

            Constant.zzfzc_cz_gzslzrgsj_gye = Utils.keep2Wdouble(Constant.zfzyc_gzslzrgsj_gye, 0);

            Constant.zzfzc_cz_gzslzrgsj_gyy = Utils.keep2Wdouble(Constant.zzfzc_cz_gzslzrgsj_gye, 0);

            Constant.zzfzc_cz_hbmz_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmz_gye, 0);

            Constant.zzfzc_cz_hbmz_gyy = Utils.keep2Wdouble(Constant.zzfzc_cz_hbmz_gye, 0);

            Constant.zzfzc_cz_pzrjmz_gye = Utils.keep2Wdouble(Constant.zfzyc_pzrcmz_gye, 0);

            Constant.zzfzc_cz_pzrjmz_gyy = Utils.keep2Wdouble(Constant.zfzyc_pzrcmz_gyy, 0);

            Constant.zzfzc_cz_rcmz_gye = Utils.keep2Wdouble(Constant.zfzyc_rcmz_gye, 0);

            Constant.zzfzc_cz_rcmz_gyy = Utils.keep2Wdouble(Constant.zfzyc_rcmz_gye, 0);

            Constant.zzfzc_cz_prmz_gye = Utils.keep2Wdouble(Constant.zfzyc_prmz_gye, 0);

            Constant.zzfzc_cz_prmz_gyy = Utils.keep2Wdouble(Constant.zfzyc_prmz_gyy, 0);

            Constant.zzfzc_cz_przz_gye = Utils.keep2Wdouble(Constant.zfzyc_przz_gye, 0);

            Constant.zzfzc_cz_przz_gyy = Utils.keep2Wdouble(Constant.zzfzc_cz_przz_gye, 0);

            if (Constant.gyy_fzzq != 0) {
                Constant.zzfzc_cz_ngdnzz_gyy = Utils.keep2Wdouble(Constant.clmzz * Constant.mnts / Constant.gyy_fzzq * Constant.mzphl * Constant.rcmzfwl * Constant.mzwchzs * Constant.prqchl, 0);
            }
            Constant.zzfzc_cz_ngdnzz_gye = Utils.keep2Wdouble(Constant.zzfzc_cz_ngdnzz_gyy, 0);


            Constant.zzfzc_by_gzslzrjp_gye = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye, 0);

            Constant.zzfzc_by_gzslzrjp_gyy = Utils.keep2Wdouble(Constant.zzfzc_by_gzslzrjp_gye, 0);

            Constant.zzfzc_by_gzslzrgsj_gye = Utils.keep2Wdouble(Constant.zfzyc_gzslzrgsj_gye, 0);

            Constant.zzfzc_by_gzslzrgsj_gyy = Utils.keep2Wdouble(Constant.zzfzc_by_gzslzrgsj_gye, 0);

            Constant.zzfzc_by_hbmz_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmz_gye, 0);

            Constant.zzfzc_by_hbmz_gyy = Utils.keep2Wdouble(Constant.zzfzc_by_hbmz_gye, 0);

            Constant.zzfzc_by_pzrjmz_gye = Utils.keep2Wdouble(Constant.zfzyc_pzrcmz_gye, 0);

            Constant.zzfzc_by_pzrjmz_gyy = Utils.keep2Wdouble(Constant.zfzyc_pzrcmz_gyy, 0);

            Constant.zzfzc_by_rcmz_gye = Utils.keep2Wdouble(Constant.zfzyc_rcmz_gye, 0);

            Constant.zzfzc_by_rcmz_gyy = Utils.keep2Wdouble(Constant.zfzyc_rcmz_gye, 0);

            Constant.zzfzc_by_prmz_gye = Constant.zfzyc_prmz_gye;

            Constant.zzfzc_by_prmz_gyy = Utils.keep2Wdouble(Constant.zfzyc_prmz_gyy, 0);

            Constant.zzfzc_by_przz_gye = Utils.keep2Wdouble(Constant.zfzyc_przz_gye, 0);

            Constant.zzfzc_by_przz_gyy = Utils.keep2Wdouble(Constant.zzfzc_by_przz_gye, 0);

            Constant.zzfzc_by_byzz_gye = Utils.keep2Wdouble(Constant.zfzyc_przz_gye, 0);

            Constant.zzfzc_by_byzz_gyy = Utils.keep2Wdouble(Constant.zzfzc_by_przz_gye, 0);


            Constant.zzfzc_by_ngbyzz_gyy = Utils.keep2Wdouble(Constant.zfzyc_przz_gyy * Constant.byqchl, 0);

            Constant.zzfzc_by_ngbyzz_gye = Utils.keep2Wdouble(Constant.zzfzc_by_ngbyzz_gyy, 0);

        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        if (Constant.gyy_pzrc_scrl == 0){
            Toast.makeText(getContext(),"请先设置基本参数",Toast.LENGTH_LONG).show();
            return;
        }

        zfzyc_gzslzrjp_gye.setText(Constant.zfzyc_gzslzrjp_gye + "");


        zfzyc_gzslzrjp_gyy.setText(Constant.zfzyc_gzslzrjp_gyy + "");

        zfzyc_gzslzrgsj_gye.setText(Constant.zfzyc_gzslzrgsj_gye + "");


        zfzyc_gzslzrgsj_gyy.setText(Constant.zfzyc_gzslzrgsj_gyy + "");

        zfzyc_hbmz_gye.setText(Constant.zfzyc_hbmz_gye + "");

        zfzyc_hbmz_gyy.setText(Constant.zfzyc_hbmz_gyy + "");

        zfzyc_pzrcmz_gye.setText(Constant.zfzyc_pzrcmz_gye + "");

        zfzyc_pzrcmz_gyy.setText(Constant.zfzyc_pzrcmz_gyy + "");

        zfzyc_rcmz_gye.setText(Constant.zfzyc_rcmz_gye + "");

        zfzyc_rcmz_gyy.setText(Constant.zfzyc_rcmz_gyy + "");

        zfzyc_prmz_gye.setText(Constant.zfzyc_prmz_gye + "");

        zfzyc_prmz_gyy.setText(Constant.zfzyc_prmz_gyy + "");

        zfzyc_przz_gye.setText(Constant.zfzyc_przz_gye + "");

        zfzyc_byzz_gye.setText(Constant.zfzyc_byzz_gye + "");

        zfzyc_byzz_gyy.setText(Constant.zfzyc_byzz_gyy + "");

        zfzyc_szyfz_gye.setText(Constant.zfzyc_szyfz_gye + "");

        zfzyc_szyfz_gyy.setText(Constant.zfzyc_szyfz_gyy + "");


        zfzyc_nclspz_gye.setText(Constant.zfzyc_nclspz_gye + "");

        zfzyc_nclspz_gyy.setText(Constant.zfzyc_nclspz_gyy + "");

        zzfzc_cz_gzslzrjp_gye.setText(Constant.zzfzc_cz_gzslzrjp_gye + "");

        zzfzc_cz_gzslzrjp_gyy.setText(Constant.zzfzc_cz_gzslzrjp_gyy + "");


        zzfzc_cz_gzslzrgsj_gye.setText(Constant.zzfzc_cz_gzslzrgsj_gye + "");


        zzfzc_cz_gzslzrgsj_gyy.setText(Constant.zzfzc_cz_gzslzrgsj_gyy + "");

        zzfzc_cz_hbmz_gye.setText(Constant.zzfzc_cz_hbmz_gye + "");

        zzfzc_cz_hbmz_gyy.setText(Constant.zzfzc_cz_hbmz_gyy + "");

        zzfzc_cz_pzrjmz_gye.setText(Constant.zzfzc_cz_pzrjmz_gye + "");

        zzfzc_cz_pzrjmz_gyy.setText(Constant.zzfzc_cz_pzrjmz_gyy + "");

        zzfzc_cz_rcmz_gye.setText(Constant.zzfzc_cz_rcmz_gye + "");

        zzfzc_cz_rcmz_gyy.setText(Constant.zzfzc_cz_rcmz_gyy + "");

        zzfzc_cz_prmz_gye.setText(Constant.zzfzc_cz_prmz_gye + "");

        zzfzc_cz_prmz_gyy.setText(Constant.zzfzc_cz_prmz_gyy + "");

        zzfzc_cz_przz_gye.setText(Constant.zzfzc_cz_przz_gye + "");

        zzfzc_cz_przz_gyy.setText(Constant.zzfzc_cz_przz_gyy + "");

        zzfzc_cz_ngdnzz_gyy.setText(Constant.zzfzc_cz_ngdnzz_gyy + "");

        zzfzc_cz_ngdnzz_gye.setText(Constant.zzfzc_cz_ngdnzz_gye + "");

        zzfzc_by_gzslzrjp_gye.setText(Constant.zzfzc_by_gzslzrjp_gye + "");

        zzfzc_by_gzslzrjp_gyy.setText(Constant.zzfzc_by_gzslzrjp_gyy + "");

        zzfzc_by_gzslzrgsj_gye.setText(Constant.zzfzc_by_gzslzrgsj_gye + "");

        zzfzc_by_gzslzrgsj_gyy.setText(Constant.zzfzc_by_gzslzrgsj_gyy + "");

        zzfzc_by_hbmz_gye.setText(Constant.zzfzc_by_hbmz_gye + "");

        zzfzc_by_hbmz_gyy.setText(Constant.zzfzc_by_hbmz_gyy + "");

        zzfzc_by_pzrjmz_gye.setText(Constant.zzfzc_by_pzrjmz_gye + "");

        zzfzc_by_pzrjmz_gyy.setText(Constant.zzfzc_by_pzrjmz_gyy + "");

        zzfzc_by_rcmz_gye.setText(Constant.zzfzc_by_rcmz_gye + "");

        zzfzc_by_rcmz_gyy.setText(Constant.zzfzc_by_rcmz_gyy + "");

        zzfzc_by_prmz_gye.setText(Constant.zzfzc_by_prmz_gye + "");

        zzfzc_by_prmz_gyy.setText(Constant.zzfzc_by_prmz_gyy + "");

        zzfzc_by_przz_gye.setText(Constant.zzfzc_by_przz_gye + "");

        zzfzc_by_przz_gyy.setText(Constant.zzfzc_by_przz_gyy + "");

        zzfzc_by_byzz_gye.setText(Constant.zzfzc_by_byzz_gye + "");

        zzfzc_by_byzz_gyy.setText(Constant.zzfzc_by_byzz_gyy + "");

        zzfzc_by_ngbyzz_gyy.setText(Constant.zzfzc_by_ngbyzz_gyy + "");

        zzfzc_by_ngbyzz_gye.setText(Constant.zzfzc_by_ngbyzz_gye + "");
    }
}
