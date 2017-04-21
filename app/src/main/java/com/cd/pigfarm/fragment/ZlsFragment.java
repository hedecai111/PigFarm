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
 * @Description: 猪栏数界面
 */
public class ZlsFragment extends BaseFragment {
    @NotEmpty
    private EditText gyypzrcdys;
    private EditText pzrjdys;
    private EditText rcmzdys;
    private EditText fwsdys;
    private EditText bysdys;
    private EditText szyfzdys;
    private EditText zfzyc_gzlzrjp_gyy;
    private EditText zfzyc_gzlzrjp_gye;
    private EditText zfzyc_gzlzrgsj_gyy;
    private EditText zfzyc_gzlzrgsj_gye;
    private EditText zfzyc_hbmzl_gyy;
    private EditText zfzyc_hbmzl_gye;
    private EditText zfzyc_pzrjmzl_gyy;
    private EditText zfzyc_pzrjmzl_gye;
    private EditText zfzyc_rcmzl_gyy;
    private EditText zfzyc_rcmzl_gye;
    private EditText zfzyc_fwl_gyy;
    private EditText zfzyc_fwl_gye;
    private EditText zfzyc_byl_gyy;
    private EditText zfzyc_byl_gye;
    private EditText zfzyc_szyfl_gyy;
    private EditText zfzyc_szyfl_gye;
    private EditText zfzyc_bzgll_gyy;
    private EditText zfzyc_bzgll_gye;
    private EditText zfzyc_yzgll_gyy;
    private EditText zfzyc_yzgll_gye;
    private EditText zzfzccz_gzlzrjp_gyy;
    private EditText zzfzccz_gzlzrjp_gye;
    private EditText zzfzccz_gzlzrgsj_gyy;
    private EditText zzfzccz_gzlzrgsj_gye;
    private EditText zzfzccz_hbmzl_gyy;
    private EditText zzfzccz_hbmzl_gye;
    private EditText zzfzccz_pzrjmzl_gyy;
    private EditText zzfzccz_pzrjmzl_gye;
    private EditText zzfzccz_rcmzl_gyy;
    private EditText zzfzccz_rcmzl_gye;
    private EditText zzfzccz_fwl_gyy;
    private EditText zzfzccz_fwl_gye;
    private EditText zzfzccz_fwsdys_gyy;
    private EditText zzfzccz_fwsdys_gye;
    private EditText zzfzccz_bzgll_gyy;
    private EditText zzfzccz_bzgll_gye;
    private EditText zzfzccz_yzgll_gyy;
    private EditText zzfzccz_yzgll_gye;
    private EditText zzfzcby_gzlzrjp_gyy;
    private EditText zzfzcby_gzlzrjp_gye;
    private EditText zzfzcby_gzlzrgsj_gyy;
    private EditText zzfzcby_gzlzrgsj_gye;
    private EditText zzfzcby_hbmzl_gyy;
    private EditText zzfzcby_hbmzl_gye;
    private EditText zzfzcby_pzrjmzl_gyy;
    private EditText zzfzcby_pzrjmzl_gye;
    private EditText zzfzcby_rcmzl_gyy;
    private EditText zzfzcby_rcmzl_gye;
    private EditText zzfzcby_fwl_gyy;
    private EditText zzfzcby_fwl_gye;
    private EditText zzfzcby_byl_gyy;
    private EditText zzfzcby_byl_gye;
    private EditText zzfzcby_fwsdys_gyy;
    private EditText zzfzcby_fwsdys_gye;
    private EditText zzfzcby_bysdys_gyy;
    private EditText zzfzcby_bysdys_gye;
    private EditText zzfzcby_bzgll_gyy;
    private EditText zzfzcby_bzgll_gye;
    private EditText zzfzcby_yzgll_gyy;
    private EditText zzfzcby_yzgll_gye;
    private Button next_But;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zls, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        gyypzrcdys = (EditText) view.findViewById(R.id.gyypzrcdys);
        pzrjdys = (EditText) view.findViewById(R.id.pzrjdys);
        rcmzdys = (EditText) view.findViewById(R.id.rcmzdys);
        fwsdys = (EditText) view.findViewById(R.id.fwsdys);
        bysdys = (EditText) view.findViewById(R.id.bysdys);
        szyfzdys = (EditText) view.findViewById(R.id.szyfzdys);
        zfzyc_gzlzrjp_gyy = (EditText) view.findViewById(R.id.zfzyc_gzlzrjp_gyy);
        zfzyc_gzlzrjp_gye = (EditText) view.findViewById(R.id.zfzyc_gzlzrjp_gye);
        zfzyc_gzlzrgsj_gyy = (EditText) view.findViewById(R.id.zfzyc_gzlzrgsj_gyy);
        zfzyc_gzlzrgsj_gye = (EditText) view.findViewById(R.id.zfzyc_gzlzrgsj_gye);
        zfzyc_hbmzl_gyy = (EditText) view.findViewById(R.id.zfzyc_hbmzl_gyy);
        zfzyc_hbmzl_gye = (EditText) view.findViewById(R.id.zfzyc_hbmzl_gye);
        zfzyc_pzrjmzl_gyy = (EditText) view.findViewById(R.id.zfzyc_pzrjmzl_gyy);
        zfzyc_pzrjmzl_gye = (EditText) view.findViewById(R.id.zfzyc_pzrjmzl_gye);
        zfzyc_rcmzl_gyy = (EditText) view.findViewById(R.id.zfzyc_rcmzl_gyy);
        zfzyc_rcmzl_gye = (EditText) view.findViewById(R.id.zfzyc_rcmzl_gye);
        zfzyc_fwl_gyy = (EditText) view.findViewById(R.id.zfzyc_fwl_gyy);
        zfzyc_fwl_gye = (EditText) view.findViewById(R.id.zfzyc_fwl_gye);
        zfzyc_byl_gyy = (EditText) view.findViewById(R.id.zfzyc_byl_gyy);
        zfzyc_byl_gye = (EditText) view.findViewById(R.id.zfzyc_byl_gye);
        zfzyc_szyfl_gyy = (EditText) view.findViewById(R.id.zfzyc_szyfl_gyy);
        zfzyc_szyfl_gye = (EditText) view.findViewById(R.id.zfzyc_szyfl_gye);
        zfzyc_bzgll_gyy = (EditText) view.findViewById(R.id.zfzyc_bzgll_gyy);
        zfzyc_bzgll_gye = (EditText) view.findViewById(R.id.zfzyc_bzgll_gye);
        zfzyc_yzgll_gyy = (EditText) view.findViewById(R.id.zfzyc_yzgll_gyy);
        zfzyc_yzgll_gye = (EditText) view.findViewById(R.id.zfzyc_yzgll_gye);
        zzfzccz_gzlzrjp_gyy = (EditText) view.findViewById(R.id.zzfzccz_gzlzrjp_gyy);
        zzfzccz_gzlzrjp_gye = (EditText) view.findViewById(R.id.zzfzccz_gzlzrjp_gye);
        zzfzccz_gzlzrgsj_gyy = (EditText) view.findViewById(R.id.zzfzccz_gzlzrgsj_gyy);
        zzfzccz_gzlzrgsj_gye = (EditText) view.findViewById(R.id.zzfzccz_gzlzrgsj_gye);
        zzfzccz_hbmzl_gyy = (EditText) view.findViewById(R.id.zzfzccz_hbmzl_gyy);
        zzfzccz_hbmzl_gye = (EditText) view.findViewById(R.id.zzfzccz_hbmzl_gye);
        zzfzccz_pzrjmzl_gyy = (EditText) view.findViewById(R.id.zzfzccz_pzrjmzl_gyy);
        zzfzccz_pzrjmzl_gye = (EditText) view.findViewById(R.id.zzfzccz_pzrjmzl_gye);
        zzfzccz_rcmzl_gyy = (EditText) view.findViewById(R.id.zzfzccz_rcmzl_gyy);
        zzfzccz_rcmzl_gye = (EditText) view.findViewById(R.id.zzfzccz_rcmzl_gye);
        zzfzccz_fwl_gyy = (EditText) view.findViewById(R.id.zzfzccz_fwl_gyy);
        zzfzccz_fwl_gye = (EditText) view.findViewById(R.id.zzfzccz_fwl_gye);
        zzfzccz_fwsdys_gyy = (EditText) view.findViewById(R.id.zzfzccz_fwsdys_gyy);
        zzfzccz_fwsdys_gye = (EditText) view.findViewById(R.id.zzfzccz_fwsdys_gye);
        zzfzccz_bzgll_gyy = (EditText) view.findViewById(R.id.zzfzccz_bzgll_gyy);
        zzfzccz_bzgll_gye = (EditText) view.findViewById(R.id.zzfzccz_bzgll_gye);
        zzfzccz_yzgll_gyy = (EditText) view.findViewById(R.id.zzfzccz_yzgll_gyy);
        zzfzccz_yzgll_gye = (EditText) view.findViewById(R.id.zzfzccz_yzgll_gye);
        zzfzcby_gzlzrjp_gyy = (EditText) view.findViewById(R.id.zzfzcby_gzlzrjp_gyy);
        zzfzcby_gzlzrjp_gye = (EditText) view.findViewById(R.id.zzfzcby_gzlzrjp_gye);
        zzfzcby_gzlzrgsj_gyy = (EditText) view.findViewById(R.id.zzfzcby_gzlzrgsj_gyy);
        zzfzcby_gzlzrgsj_gye = (EditText) view.findViewById(R.id.zzfzcby_gzlzrgsj_gye);
        zzfzcby_hbmzl_gyy = (EditText) view.findViewById(R.id.zzfzcby_hbmzl_gyy);
        zzfzcby_hbmzl_gye = (EditText) view.findViewById(R.id.zzfzcby_hbmzl_gye);
        zzfzcby_pzrjmzl_gyy = (EditText) view.findViewById(R.id.zzfzcby_pzrjmzl_gyy);
        zzfzcby_pzrjmzl_gye = (EditText) view.findViewById(R.id.zzfzcby_pzrjmzl_gye);
        zzfzcby_rcmzl_gyy = (EditText) view.findViewById(R.id.zzfzcby_rcmzl_gyy);
        zzfzcby_rcmzl_gye = (EditText) view.findViewById(R.id.zzfzcby_rcmzl_gye);
        zzfzcby_fwl_gyy = (EditText) view.findViewById(R.id.zzfzcby_fwl_gyy);
        zzfzcby_fwl_gye = (EditText) view.findViewById(R.id.zzfzcby_fwl_gye);
        zzfzcby_byl_gyy = (EditText) view.findViewById(R.id.zzfzcby_byl_gyy);
        zzfzcby_byl_gye = (EditText) view.findViewById(R.id.zzfzcby_byl_gye);
        zzfzcby_fwsdys_gyy = (EditText) view.findViewById(R.id.zzfzcby_fwsdys_gyy);
        zzfzcby_fwsdys_gye = (EditText) view.findViewById(R.id.zzfzcby_fwsdys_gye);
        zzfzcby_bysdys_gyy = (EditText) view.findViewById(R.id.zzfzcby_bysdys_gyy);
        zzfzcby_bysdys_gye = (EditText) view.findViewById(R.id.zzfzcby_bysdys_gye);
        zzfzcby_bzgll_gyy = (EditText) view.findViewById(R.id.zzfzcby_bzgll_gyy);
        zzfzcby_bzgll_gye = (EditText) view.findViewById(R.id.zzfzcby_bzgll_gye);
        zzfzcby_yzgll_gyy = (EditText) view.findViewById(R.id.zzfzcby_yzgll_gyy);
        zzfzcby_yzgll_gye = (EditText) view.findViewById(R.id.zzfzcby_yzgll_gye);
    }

    /**
     * 计算数据
     */
    @Override
    public void jsDatas() {
        try {


            Constant.gyypzrcdys = Utils.keep2Wdouble((Constant.gyy_pzrc_zysj + 7.0) / 7.0 + 0.5, 0);

            Constant.pzrjdys = Utils.keep2Wdouble((Constant.gye_dnzrc_zysj + 7) / 7 + 0.5, 0);

            Constant.rcmzdys = Utils.keep2Wdouble((Constant.gye_rcq_zysj + 7) / 7 + 0.5, 0);

            Constant.fwsdys = Utils.keep2Wdouble((Constant.gyy_dnrl_zysj + Constant.zlkzxdts) / Constant.fyjl + 0.5, 0);
            //Toast.makeText(getContext(),Constant.gyy_dnrl_zysj+"---"+Constant.zlkzxdts+"--"+Constant.fyjl,Toast.LENGTH_LONG).show();

            Constant.bysdys = Utils.keep2Wdouble((Constant.gyy_zzby_zysj + Constant.zlkzxdts) / Constant.fyjl + 0.5, 0);

            Constant.szyfzdys = Utils.keep2Wdouble((Constant.gyy_szyf_zysj + Constant.zlkzxdts) / Constant.fyjl + 0.5, 0);

            Constant.zfzyc_gzlzrjp_gye = Constant.clmzz * Constant.zrjpbl;

            Constant.zfzyc_gzlzrjp_gyy = Constant.zfzyc_gzlzrjp_gye;

            Constant.zfzyc_gzlzrgsj_gye = Constant.clmzz * Constant.zrgsj;

            Constant.zfzyc_gzlzrgsj_gyy = Constant.zfzyc_gzlzrgsj_gye;

            Constant.zfzyc_hbmzl_gye = Constant.clmzz * Constant.zznttgxl / Constant.hbzpypc / 4;

            Constant.zfzyc_hbmzl_gyy = Constant.zfzyc_hbmzl_gye;

            Constant.zfzyc_pzrjmzl_gye = Math.round(Constant.pzrjdys * Constant.mzcpmzs / 4);

            Constant.zfzyc_pzrjmzl_gyy = Constant.gyypzrcdys * Constant.mzcpmzs;

            Constant.zfzyc_rcmzl_gye = Constant.rcmzdys * Constant.mzcpmzs;

            Constant.zfzyc_rcmzl_gyy = Constant.zfzyc_pzrjmzl_gyy;

            Constant.zfzyc_fwl_gye = Constant.fwsdys * Constant.mzczmzs;

            Constant.zfzyc_fwl_gyy = Constant.zfzyc_fwl_gye;

            Constant.zfzyc_byl_gye = Constant.bysdys * Constant.mzbyws;

            Constant.zfzyc_byl_gyy = Constant.zfzyc_byl_gye;

            Constant.zfzyc_szyfl_gye = Constant.szyfzdys * Constant.mzyfws;

            Constant.zfzyc_szyfl_gyy = Constant.zfzyc_szyfl_gye;


            Constant.zfzyc_bzgll_gyy = Math.round(Constant.clmzz * 0.1);

            Constant.zfzyc_bzgll_gye = Constant.zfzyc_bzgll_gyy;

            Constant.zfzyc_yzgll_gyy = Math.round(Constant.clmzz * 0.05);

            Constant.zfzyc_yzgll_gye = Constant.zfzyc_yzgll_gyy;

            //仔猪繁殖场（仅在产仔部分）
            Constant.zzfzccz_gzlzrjp_gyy = Constant.zfzyc_gzlzrjp_gyy;

            Constant.zzfzccz_gzlzrjp_gye = Constant.zfzyc_gzlzrjp_gye;

            Constant.zzfzccz_gzlzrgsj_gyy = Constant.zfzyc_gzlzrgsj_gyy;

            Constant.zzfzccz_gzlzrgsj_gye = Constant.zfzyc_gzlzrgsj_gye;

            Constant.zzfzccz_hbmzl_gyy = Constant.zfzyc_hbmzl_gyy;

            Constant.zzfzccz_hbmzl_gye = Constant.zfzyc_hbmzl_gye;

            Constant.zzfzccz_pzrjmzl_gyy = Constant.zfzyc_pzrjmzl_gyy;

            Constant.zzfzccz_pzrjmzl_gye = Constant.zfzyc_pzrjmzl_gye;

            Constant.zzfzccz_rcmzl_gyy = Constant.zfzyc_rcmzl_gyy;

            Constant.zzfzccz_rcmzl_gye = Constant.zfzyc_rcmzl_gye;

            Constant.zzfzccz_fwl_gyy = Constant.zfzyc_fwl_gyy;

            Constant.zzfzccz_fwl_gye = Constant.zfzyc_fwl_gye;

            Constant.zzfzccz_fwsdys_gyy = Constant.fwsdys;



            Constant.zzfzccz_bzgll_gyy = Constant.zfzyc_bzgll_gyy;

            Constant.zzfzccz_bzgll_gye = Constant.zfzyc_bzgll_gye;

            Constant.zzfzccz_yzgll_gyy = Constant.zfzyc_yzgll_gyy;

            Constant.zzfzccz_yzgll_gye = Constant.zfzyc_yzgll_gye;

            //仔猪繁殖场（含仔猪保育部分）
            Constant.zzfzcby_gzlzrjp_gyy = Constant.zfzyc_gzlzrjp_gyy;

            Constant.zzfzcby_gzlzrjp_gye = Constant.zfzyc_gzlzrjp_gye;

            Constant.zzfzcby_gzlzrgsj_gyy = Constant.zfzyc_gzlzrgsj_gyy;

            Constant.zzfzcby_gzlzrgsj_gye = Constant.zfzyc_gzlzrgsj_gye;

            Constant.zzfzcby_hbmzl_gyy = Constant.zfzyc_hbmzl_gyy;

            Constant.zzfzcby_hbmzl_gye = Constant.zfzyc_hbmzl_gye;

            Constant.zzfzcby_pzrjmzl_gyy = Constant.zfzyc_pzrjmzl_gyy;

            Constant.zzfzcby_pzrjmzl_gye = Constant.zfzyc_pzrjmzl_gye;

            Constant.zzfzcby_rcmzl_gyy = Constant.zfzyc_rcmzl_gyy;

            Constant.zzfzcby_rcmzl_gye = Constant.zfzyc_rcmzl_gye;

            Constant.zzfzcby_fwl_gyy = Constant.zfzyc_fwl_gyy;

            Constant.zzfzcby_fwl_gye = Constant.zfzyc_fwl_gye;

            Constant.zzfzcby_byl_gyy = Constant.zfzyc_byl_gyy;

            Constant.zzfzcby_byl_gye = Constant.zfzyc_byl_gye;


            Constant.zzfzcby_fwsdys_gyy = Constant.fwsdys;

            Constant.zzfzcby_fwsdys_gye = Constant.fwsdys;

            Constant.zzfzcby_bysdys_gyy = Constant.bysdys;

            Constant.zzfzcby_bysdys_gye = Constant.bysdys;

            Constant.zzfzcby_bzgll_gyy = Constant.zfzyc_bzgll_gyy;

            Constant.zzfzcby_bzgll_gye = Constant.zfzyc_bzgll_gye;

            Constant.zzfzcby_yzgll_gyy = Constant.zfzyc_yzgll_gyy;

            Constant.zzfzcby_yzgll_gye = Constant.zfzyc_yzgll_gye;
        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }

    }

    @Override
    public void refreshViews() {
        zzfzccz_fwsdys_gye.setText("无");
        if (Constant.gyy_pzrc_scrl == 0){
            Toast.makeText(getContext(),"请先设置基本参数",Toast.LENGTH_LONG).show();
            return;
        }

        gyypzrcdys.setText(String.valueOf(Constant.gyypzrcdys));

        pzrjdys.setText(Constant.pzrjdys + "");

        rcmzdys.setText(Constant.rcmzdys + "");

        fwsdys.setText(Constant.fwsdys + "");
        //Toast.makeText(getContext(),Constant.gyy_dnrl_zysj+"---"+Constant.zlkzxdts+"--"+Constant.fyjl,Toast.LENGTH_LONG).show();

        bysdys.setText(Constant.bysdys + "");

        szyfzdys.setText(Constant.szyfzdys + "");

        zfzyc_gzlzrjp_gye.setText(Constant.zfzyc_gzlzrjp_gye + "");

        zfzyc_gzlzrjp_gyy.setText(Constant.zfzyc_gzlzrjp_gyy + "");

        zfzyc_gzlzrgsj_gye.setText(Constant.zfzyc_gzlzrgsj_gye + "");

        zfzyc_gzlzrgsj_gyy.setText(Constant.zfzyc_gzlzrgsj_gyy + "");

        zfzyc_hbmzl_gye.setText(Constant.zfzyc_hbmzl_gye + "");

        zfzyc_hbmzl_gyy.setText(Constant.zfzyc_hbmzl_gyy + "");

        zfzyc_pzrjmzl_gye.setText(Constant.zfzyc_pzrjmzl_gye + "");

        zfzyc_pzrjmzl_gyy.setText(Constant.zfzyc_pzrjmzl_gyy + "");

        zfzyc_rcmzl_gye.setText(Constant.zfzyc_rcmzl_gye + "");

        zfzyc_rcmzl_gyy.setText(Constant.zfzyc_rcmzl_gyy + "");

        zfzyc_fwl_gye.setText(Constant.zfzyc_fwl_gye + "");

        zfzyc_fwl_gyy.setText(Constant.zfzyc_fwl_gyy + "");

        zfzyc_byl_gye.setText(Constant.zfzyc_byl_gye + "");

        zfzyc_byl_gyy.setText(Constant.zfzyc_byl_gyy + "");

        zfzyc_szyfl_gye.setText(Constant.zfzyc_szyfl_gye + "");

        zfzyc_szyfl_gyy.setText(Constant.zfzyc_szyfl_gyy + "");

        zfzyc_bzgll_gyy.setText(Constant.zfzyc_bzgll_gyy + "");

        zfzyc_bzgll_gye.setText(Constant.zfzyc_bzgll_gye + "");

        zfzyc_yzgll_gyy.setText(Constant.zfzyc_yzgll_gyy + "");

        zfzyc_yzgll_gye.setText(Constant.zfzyc_yzgll_gye + "");

        //仔猪繁殖场（仅在产仔部分）
        zzfzccz_gzlzrjp_gyy.setText(Constant.zzfzccz_gzlzrjp_gyy + "");

        zzfzccz_gzlzrjp_gye.setText(Constant.zzfzccz_gzlzrjp_gye + "");

        zzfzccz_gzlzrgsj_gyy.setText(Constant.zzfzccz_gzlzrgsj_gyy + "");

        zzfzccz_gzlzrgsj_gye.setText(Constant.zzfzccz_gzlzrgsj_gye + "");

        zzfzccz_hbmzl_gyy.setText(Constant.zzfzccz_hbmzl_gyy + "");

        zzfzccz_hbmzl_gye.setText(Constant.zzfzccz_hbmzl_gye + "");

        zzfzccz_pzrjmzl_gyy.setText(Constant.zzfzccz_pzrjmzl_gyy + "");

        zzfzccz_pzrjmzl_gye.setText(Constant.zzfzccz_pzrjmzl_gye + "");

        zzfzccz_rcmzl_gyy.setText(Constant.zzfzccz_rcmzl_gyy + "");

        zzfzccz_rcmzl_gye.setText(Constant.zzfzccz_rcmzl_gye + "");

        zzfzccz_fwl_gyy.setText(Constant.zzfzccz_fwl_gyy + "");

        zzfzccz_fwl_gye.setText(Constant.zzfzccz_fwl_gye + "");

        zzfzccz_fwsdys_gyy.setText(Constant.zzfzccz_fwsdys_gyy + "");

        zzfzccz_fwsdys_gye.setText("无");

        zzfzccz_bzgll_gyy.setText(Constant.zzfzccz_bzgll_gyy + "");

        zzfzccz_bzgll_gye.setText(Constant.zzfzccz_bzgll_gye + "");

        zzfzccz_yzgll_gyy.setText(Constant.zzfzccz_yzgll_gyy + "");

        zzfzccz_yzgll_gye.setText(Constant.zzfzccz_yzgll_gye + "");

        //仔猪繁殖场（含仔猪保育部分）
        zzfzcby_gzlzrjp_gyy.setText(Constant.zzfzcby_gzlzrjp_gyy + "");

        zzfzcby_gzlzrjp_gye.setText(Constant.zzfzcby_gzlzrjp_gye + "");

        zzfzcby_gzlzrgsj_gyy.setText(Constant.zzfzcby_gzlzrgsj_gyy + "");

        zzfzcby_gzlzrgsj_gye.setText(Constant.zzfzcby_gzlzrgsj_gye + "");

        zzfzcby_hbmzl_gyy.setText(Constant.zzfzcby_hbmzl_gyy + "");

        zzfzcby_hbmzl_gye.setText(Constant.zzfzcby_hbmzl_gye + "");

        zzfzcby_pzrjmzl_gyy.setText(Constant.zzfzcby_pzrjmzl_gyy + "");

        zzfzcby_pzrjmzl_gye.setText(Constant.zzfzcby_pzrjmzl_gye + "");

        zzfzcby_rcmzl_gyy.setText(Constant.zzfzcby_rcmzl_gyy + "");

        zzfzcby_rcmzl_gye.setText(Constant.zzfzcby_rcmzl_gye + "");

        zzfzcby_fwl_gyy.setText(Constant.zzfzcby_fwl_gyy + "");

        zzfzcby_fwl_gye.setText(Constant.zzfzcby_fwl_gye + "");

        zzfzcby_byl_gyy.setText(Constant.zzfzcby_byl_gyy + "");

        zzfzcby_byl_gye.setText(Constant.zzfzcby_byl_gye + "");

        zzfzcby_fwsdys_gyy.setText(Constant.zzfzcby_fwsdys_gyy + "");

        zzfzcby_fwsdys_gye.setText(Constant.zzfzcby_fwsdys_gye + "");

        zzfzcby_bysdys_gyy.setText(Constant.zzfzcby_bysdys_gyy + "");

        zzfzcby_bysdys_gyy.setText(Constant.zzfzcby_bysdys_gyy + "");

        zzfzcby_bzgll_gyy.setText(Constant.zzfzcby_bzgll_gyy + "");

        zzfzcby_bzgll_gye.setText(Constant.zzfzcby_bzgll_gye + "");

        zzfzcby_yzgll_gyy.setText(Constant.zzfzcby_yzgll_gyy + "");

        zzfzcby_yzgll_gye.setText(Constant.zzfzcby_yzgll_gye + "");


    }
}
