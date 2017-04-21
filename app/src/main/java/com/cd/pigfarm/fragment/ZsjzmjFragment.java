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
 * @Description: 猪舍建筑面积界面
 */
public class ZsjzmjFragment extends BaseFragment {
    @NotEmpty
    private EditText zfzyc_hbmzs_gyy;
    private EditText zfzyc_hbmzs_gye;
    private EditText zfzyc_gzjpzrjmzs_gyy;
    private EditText zfzyc_gzjpzrjmzs_gye;
    private EditText zfzyc_rcmzs_gyy;
    private EditText zfzyc_rcmzs_gye;
    private EditText zfzyc_fws_gyy;
    private EditText zfzyc_fws_gye;
    private EditText zfzyc_bys_gyy;
    private EditText zfzyc_bys_gye;
    private EditText zfzyc_szyfs_gyy;
    private EditText zfzyc_szyfs_gye;
    private EditText zfzyc_bzgls_gyy;
    private EditText zfzyc_bzgls_gye;
    private EditText zfzyc_yzgls_gyy;
    private EditText zfzyc_yzgls_gye;
    private EditText zfzyc_fzjzmj_gyy;
    private EditText zfzyc_fzjzmj_gye;
    private EditText zfzyc_slkf_gyy;
    private EditText zfzyc_slkf_gye;
    private EditText zfzyc_bgdqtjz_gyy;
    private EditText zfzyc_bgdqtjz_gye;
    private EditText dnzzfzc_hbmzs_gyy;
    private EditText dnzzfzc_hbmzs_gye;
    private EditText dnzzfzc_pzrjmzs_gyy;
    private EditText dnzzfzc_pzrjmzs_gye;
    private EditText dnzzfzc_rcmzs_gyy;
    private EditText dnzzfzc_rcmzs_gye;
    private EditText dnzzfzc_fws_gyy;
    private EditText dnzzfzc_fws_gye;
    private EditText dnzzfzc_bzgls_gyy;
    private EditText dnzzfzc_bzgls_gye;
    private EditText dnzzfzc_yzgls_gyy;
    private EditText dnzzfzc_yzgls_gye;
    private EditText dnzzfzc_fzwjzmj_gyy;
    private EditText dnzzfzc_fzwjzmj_gye;
    private EditText dnzzfzc_slkf_gyy;
    private EditText dnzzfzc_slkf_gye;
    private EditText dnzzfzc_bgdqtjz_gyy;
    private EditText dnzzfzc_bgdqtjz_gye;
    private EditText byzzfzc_hbmzs_gyy;
    private EditText byzzfzc_hbmzs_gye;
    private EditText byzzfzc_pzrjmzs_gyy;
    private EditText byzzfzc_pzrjmzs_gye;
    private EditText byzzfzc_rcmzs_gyy;
    private EditText byzzfzc_rcmzs_gye;
    private EditText byzzfzc_fws_gyy;
    private EditText byzzfzc_fws_gye;
    private EditText byzzfzc_bys_gyy;
    private EditText byzzfzc_bys_gye;
    private EditText byzzfzc_bzgls_gyy;
    private EditText byzzfzc_bzgls_gye;
    private EditText byzzfzc_yzgls_gyy;
    private EditText byzzfzc_yzgls_gye;
    private EditText byzzfzc_fzwjzmj_gyy;
    private EditText byzzfzc_fzwjzmj_gye;
    private EditText byzzfzc_slkf_gyy;
    private EditText byzzfzc_slkf_gye;
    private EditText byzzfzc_bgdqtjz_gyy;
    private EditText byzzfzc_bgdqtjz_gye;
    private Button next_But;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zsjzmj, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        zfzyc_hbmzs_gyy = (EditText) view.findViewById(R.id.zfzyc_hbmzs_gyy);
        zfzyc_hbmzs_gye = (EditText) view.findViewById(R.id.zfzyc_hbmzs_gye);
        zfzyc_gzjpzrjmzs_gyy = (EditText) view.findViewById(R.id.zfzyc_gzjpzrjmzs_gyy);
        zfzyc_gzjpzrjmzs_gye = (EditText) view.findViewById(R.id.zfzyc_gzjpzrjmzs_gye);
        zfzyc_rcmzs_gyy = (EditText) view.findViewById(R.id.zfzyc_rcmzs_gyy);
        zfzyc_rcmzs_gye = (EditText) view.findViewById(R.id.zfzyc_rcmzs_gye);
        zfzyc_fws_gyy = (EditText) view.findViewById(R.id.zfzyc_fws_gyy);
        zfzyc_fws_gye = (EditText) view.findViewById(R.id.zfzyc_fws_gye);
        zfzyc_bys_gyy = (EditText) view.findViewById(R.id.zfzyc_bys_gyy);
        zfzyc_bys_gye = (EditText) view.findViewById(R.id.zfzyc_bys_gye);
        zfzyc_szyfs_gyy = (EditText) view.findViewById(R.id.zfzyc_szyfs_gyy);
        zfzyc_szyfs_gye = (EditText) view.findViewById(R.id.zfzyc_szyfs_gye);
        zfzyc_bzgls_gyy = (EditText) view.findViewById(R.id.zfzyc_bzgls_gyy);
        zfzyc_bzgls_gye = (EditText) view.findViewById(R.id.zfzyc_bzgls_gye);
        zfzyc_yzgls_gyy = (EditText) view.findViewById(R.id.zfzyc_yzgls_gyy);
        zfzyc_yzgls_gye = (EditText) view.findViewById(R.id.zfzyc_yzgls_gye);
        zfzyc_fzjzmj_gyy = (EditText) view.findViewById(R.id.zfzyc_fzjzmj_gyy);
        zfzyc_fzjzmj_gye = (EditText) view.findViewById(R.id.zfzyc_fzjzmj_gye);
        zfzyc_slkf_gyy = (EditText) view.findViewById(R.id.zfzyc_slkf_gyy);
        zfzyc_slkf_gye = (EditText) view.findViewById(R.id.zfzyc_slkf_gye);
        zfzyc_bgdqtjz_gyy = (EditText) view.findViewById(R.id.zfzyc_bgdqtjz_gyy);
        zfzyc_bgdqtjz_gye = (EditText) view.findViewById(R.id.zfzyc_bgdqtjz_gye);
        dnzzfzc_hbmzs_gyy = (EditText) view.findViewById(R.id.dnzzfzc_hbmzs_gyy);
        dnzzfzc_hbmzs_gye = (EditText) view.findViewById(R.id.dnzzfzc_hbmzs_gye);
        dnzzfzc_pzrjmzs_gyy = (EditText) view.findViewById(R.id.dnzzfzc_pzrjmzs_gyy);
        dnzzfzc_pzrjmzs_gye = (EditText) view.findViewById(R.id.dnzzfzc_pzrjmzs_gye);
        dnzzfzc_rcmzs_gyy = (EditText) view.findViewById(R.id.dnzzfzc_rcmzs_gyy);
        dnzzfzc_rcmzs_gye = (EditText) view.findViewById(R.id.dnzzfzc_rcmzs_gye);
        dnzzfzc_fws_gyy = (EditText) view.findViewById(R.id.dnzzfzc_fws_gyy);
        dnzzfzc_fws_gye = (EditText) view.findViewById(R.id.dnzzfzc_fws_gye);
        dnzzfzc_bzgls_gyy = (EditText) view.findViewById(R.id.dnzzfzc_bzgls_gyy);
        dnzzfzc_bzgls_gye = (EditText) view.findViewById(R.id.dnzzfzc_bzgls_gye);
        dnzzfzc_yzgls_gyy = (EditText) view.findViewById(R.id.dnzzfzc_yzgls_gyy);
        dnzzfzc_yzgls_gye = (EditText) view.findViewById(R.id.dnzzfzc_yzgls_gye);
        dnzzfzc_fzwjzmj_gyy = (EditText) view.findViewById(R.id.dnzzfzc_fzwjzmj_gyy);
        dnzzfzc_fzwjzmj_gye = (EditText) view.findViewById(R.id.dnzzfzc_fzwjzmj_gye);
        dnzzfzc_slkf_gyy = (EditText) view.findViewById(R.id.dnzzfzc_slkf_gyy);
        dnzzfzc_slkf_gye = (EditText) view.findViewById(R.id.dnzzfzc_slkf_gye);
        dnzzfzc_bgdqtjz_gyy = (EditText) view.findViewById(R.id.dnzzfzc_bgdqtjz_gyy);
        dnzzfzc_bgdqtjz_gye = (EditText) view.findViewById(R.id.dnzzfzc_bgdqtjz_gye);
        byzzfzc_hbmzs_gyy = (EditText) view.findViewById(R.id.byzzfzc_hbmzs_gyy);
        byzzfzc_hbmzs_gye = (EditText) view.findViewById(R.id.byzzfzc_hbmzs_gye);
        byzzfzc_pzrjmzs_gyy = (EditText) view.findViewById(R.id.byzzfzc_pzrjmzs_gyy);
        byzzfzc_pzrjmzs_gye = (EditText) view.findViewById(R.id.byzzfzc_pzrjmzs_gye);
        byzzfzc_rcmzs_gyy = (EditText) view.findViewById(R.id.byzzfzc_rcmzs_gyy);
        byzzfzc_rcmzs_gye = (EditText) view.findViewById(R.id.byzzfzc_rcmzs_gye);
        byzzfzc_fws_gyy = (EditText) view.findViewById(R.id.byzzfzc_fws_gyy);
        byzzfzc_fws_gye = (EditText) view.findViewById(R.id.byzzfzc_fws_gye);
        byzzfzc_bys_gyy = (EditText) view.findViewById(R.id.byzzfzc_bys_gyy);
        byzzfzc_bys_gye = (EditText) view.findViewById(R.id.byzzfzc_bys_gye);
        byzzfzc_bzgls_gyy = (EditText) view.findViewById(R.id.byzzfzc_bzgls_gyy);
        byzzfzc_bzgls_gye = (EditText) view.findViewById(R.id.byzzfzc_bzgls_gye);
        byzzfzc_yzgls_gyy = (EditText) view.findViewById(R.id.byzzfzc_yzgls_gyy);
        byzzfzc_yzgls_gye = (EditText) view.findViewById(R.id.byzzfzc_yzgls_gye);
        byzzfzc_fzwjzmj_gyy = (EditText) view.findViewById(R.id.byzzfzc_fzwjzmj_gyy);
        byzzfzc_fzwjzmj_gye = (EditText) view.findViewById(R.id.byzzfzc_fzwjzmj_gye);
        byzzfzc_slkf_gyy = (EditText) view.findViewById(R.id.byzzfzc_slkf_gyy);
        byzzfzc_slkf_gye = (EditText) view.findViewById(R.id.byzzfzc_slkf_gye);
        byzzfzc_bgdqtjz_gyy = (EditText) view.findViewById(R.id.byzzfzc_bgdqtjz_gyy);
        byzzfzc_bgdqtjz_gye = (EditText) view.findViewById(R.id.byzzfzc_bgdqtjz_gye);
    }

    /**
     * 计算数据
     */
    @Override
    public void jsDatas() {
        try {
            Constant.zfzyc_hbmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmzl_gye * Constant.gzjxqsyj_mj, 0);

            Constant.zfzyc_hbmzs_gyy = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_gye, 0);

            Constant.zfzyc_gzjpzrjmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_pzrjmzl_gye * Constant.gzjxqsyj_mj, 0);

            Constant.zfzyc_gzjpzrjmzs_gyy = Utils.keep2Wdouble((Constant.zfzyc_gzlzrgsj_gyy + Constant.zfzyc_pzrjmzl_gyy) * Constant.fwl_mj, 0);

            Constant.zfzyc_rcmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_rcmzl_gye * Constant.rcl_mj, 0);

            Constant.zfzyc_rcmzs_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gyy, 0);

            Constant.zfzyc_fws_gye = Utils.keep2Wdouble(Constant.zfzyc_fwl_gye * Constant.fwl_mj, 0);

            Constant.zfzyc_fws_gyy = Utils.keep2Wdouble(Constant.zfzyc_fws_gye, 0);

            Constant.zfzyc_bys_gye = Utils.keep2Wdouble(Constant.zfzyc_byl_gye * Constant.byl_mj, 0);

            Constant.zfzyc_bys_gyy = Utils.keep2Wdouble(Constant.zfzyc_bys_gye, 0);

            Constant.zfzyc_szyfs_gye = Utils.keep2Wdouble(Constant.zfzyc_szyfl_gye * Constant.szyfl_mj, 0);

            Constant.zfzyc_szyfs_gyy = Utils.keep2Wdouble(Constant.zfzyc_szyfs_gye, 0);

            Constant.zfzyc_bzgls_gye = Utils.keep2Wdouble(Constant.zfzyc_bzgll_gye * Constant.szyfl_mj, 0);

            Constant.zfzyc_bzgls_gyy = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gye, 0);

            Constant.zfzyc_yzgls_gye = Utils.keep2Wdouble(Constant.zfzyc_yzgll_gye * Constant.szyfl_mj, 0);

            Constant.zfzyc_yzgls_gyy = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gye, 0);


            Constant.zfzyc_slkf_gye = Utils.keep2Wdouble(Constant.clmzz * 2, 0);

            Constant.zfzyc_slkf_gyy = Utils.keep2Wdouble(Constant.zfzyc_slkf_gye, 0);

            Constant.zfzyc_bgdqtjz_gye = Utils.keep2Wdouble((Constant.clmzz * 1.7), 0);

            Constant.zfzyc_bgdqtjz_gyy = Utils.keep2Wdouble(Constant.zfzyc_bgdqtjz_gye, 0);

            //断奶仔猪繁殖场
            Constant.dnzzfzc_hbmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_gye, 0);

            Constant.dnzzfzc_hbmzs_gyy = Utils.keep2Wdouble(Constant.dnzzfzc_hbmzs_gye, 0);

            Constant.dnzzfzc_pzrjmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gye, 0);

            Constant.dnzzfzc_pzrjmzs_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gye, 0);

            Constant.dnzzfzc_hbmzs_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gyy, 0);

            Constant.dnzzfzc_rcmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_gye, 0);

            Constant.dnzzfzc_rcmzs_gyy = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_gyy, 0);

            Constant.dnzzfzc_fws_gye = Utils.keep2Wdouble(Constant.zfzyc_fws_gye, 0);

            Constant.dnzzfzc_fws_gyy = Utils.keep2Wdouble(Constant.zfzyc_fws_gyy, 0);

            Constant.dnzzfzc_bzgls_gye = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gye, 0);

            Constant.dnzzfzc_bzgls_gyy = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gyy, 0);

            Constant.dnzzfzc_yzgls_gye = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gye, 0);

            Constant.dnzzfzc_yzgls_gyy = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gyy, 0);

            Constant.dnzzfzc_slkf_gye = Utils.keep2Wdouble(Constant.zfzyc_slkf_gye, 0);

            Constant.dnzzfzc_slkf_gyy = Utils.keep2Wdouble(Constant.zfzyc_slkf_gyy, 0);

            Constant.dnzzfzc_bgdqtjz_gye = Utils.keep2Wdouble(Constant.zfzyc_bgdqtjz_gye, 0);

            Constant.dnzzfzc_bgdqtjz_gyy = Utils.keep2Wdouble(Constant.zfzyc_bgdqtjz_gyy, 0);


            //保育仔猪繁殖场
            Constant.byzzfzc_hbmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_gye, 0);

            Constant.byzzfzc_hbmzs_gyy = Utils.keep2Wdouble(Constant.byzzfzc_hbmzs_gye, 0);

            Constant.byzzfzc_pzrjmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gye, 0);

            Constant.byzzfzc_pzrjmzs_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gye, 0);

            Constant.byzzfzc_hbmzs_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gyy, 0);

            Constant.byzzfzc_rcmzs_gye = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_gye, 0);

            Constant.byzzfzc_rcmzs_gyy = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_gyy, 0);

            Constant.byzzfzc_fws_gye = Utils.keep2Wdouble(Constant.zfzyc_fws_gye, 0);

            Constant.byzzfzc_fws_gyy = Utils.keep2Wdouble(Constant.zfzyc_fws_gyy, 0);

            Constant.byzzfzc_bys_gye = Utils.keep2Wdouble(Constant.zfzyc_bys_gye, 0);

            Constant.byzzfzc_bys_gyy = Utils.keep2Wdouble(Constant.zfzyc_bys_gyy, 0);

            Constant.byzzfzc_bzgls_gye = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gye, 0);

            Constant.byzzfzc_bzgls_gyy = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gyy, 0);

            Constant.byzzfzc_yzgls_gye = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gye, 0);

            Constant.byzzfzc_yzgls_gyy = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gyy, 0);

            Constant.byzzfzc_slkf_gye = Utils.keep2Wdouble(Constant.zfzyc_slkf_gye, 0);

            Constant.byzzfzc_slkf_gyy = Utils.keep2Wdouble(Constant.zfzyc_slkf_gyy, 0);

            Constant.byzzfzc_bgdqtjz_gye = Utils.keep2Wdouble(Constant.zfzyc_bgdqtjz_gye, 0);

            Constant.byzzfzc_bgdqtjz_gyy = Utils.keep2Wdouble(Constant.zfzyc_bgdqtjz_gyy, 0);
        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }
    }

    @Override
    public void refreshViews() {

        if (Constant.zfzyc_hbmzs_gye == 0){
            Toast.makeText(getContext(),"请先设置基本参数和猪舍建筑面积设计参数",Toast.LENGTH_LONG).show();
            return;
        }

        zfzyc_hbmzs_gye.setText(Constant.zfzyc_hbmzs_gye + "");

        zfzyc_hbmzs_gyy.setText(Constant.zfzyc_hbmzs_gyy + "");

        zfzyc_gzjpzrjmzs_gye.setText(Constant.zfzyc_gzjpzrjmzs_gye + "");

        zfzyc_gzjpzrjmzs_gyy.setText(Constant.zfzyc_gzjpzrjmzs_gyy + "");

        zfzyc_rcmzs_gye.setText(Constant.zfzyc_rcmzs_gye + "");

        zfzyc_fws_gyy.setText(Constant.zfzyc_fws_gyy + "");

        zfzyc_fws_gye.setText(Constant.zfzyc_fws_gye + "");

        zfzyc_fws_gyy.setText(Constant.zfzyc_fws_gyy + "");

        zfzyc_bys_gye.setText(Constant.zfzyc_bys_gye + "");

        zfzyc_bys_gyy.setText(Constant.zfzyc_bys_gyy + "");

        zfzyc_szyfs_gye.setText(Constant.zfzyc_szyfs_gye + "");

        zfzyc_szyfs_gyy.setText(Constant.zfzyc_szyfs_gyy + "");

        zfzyc_bzgls_gye.setText(Constant.zfzyc_bzgls_gye + "");

        zfzyc_bzgls_gyy.setText(Constant.zfzyc_bzgls_gyy + "");

        zfzyc_yzgls_gye.setText(Constant.zfzyc_yzgls_gye + "");

        zfzyc_yzgls_gyy.setText(Constant.zfzyc_yzgls_gyy + "");

        zfzyc_fzjzmj_gye.setText("--");
        zfzyc_fzjzmj_gyy.setText("--");

        zfzyc_slkf_gye.setText(Constant.zfzyc_slkf_gye + "");

        zfzyc_slkf_gyy.setText(Constant.zfzyc_slkf_gyy + "");

        zfzyc_bgdqtjz_gye.setText(Constant.zfzyc_bgdqtjz_gye + "");

        zfzyc_bgdqtjz_gyy.setText(Constant.zfzyc_bgdqtjz_gyy + "");

        //断奶仔猪繁殖场
        dnzzfzc_hbmzs_gye.setText(Constant.dnzzfzc_hbmzs_gye + "");

        dnzzfzc_hbmzs_gyy.setText(Constant.dnzzfzc_hbmzs_gyy + "");

        dnzzfzc_pzrjmzs_gye.setText(Constant.dnzzfzc_pzrjmzs_gye + "");

        dnzzfzc_pzrjmzs_gyy.setText(Constant.dnzzfzc_pzrjmzs_gyy + "");

        dnzzfzc_hbmzs_gyy.setText(Constant.dnzzfzc_hbmzs_gyy + "");

        dnzzfzc_rcmzs_gye.setText(Constant.dnzzfzc_rcmzs_gye + "");

        dnzzfzc_rcmzs_gyy.setText(Constant.dnzzfzc_rcmzs_gyy + "");

        dnzzfzc_fws_gye.setText(Constant.dnzzfzc_fws_gye + "");

        dnzzfzc_fws_gyy.setText(Constant.dnzzfzc_fws_gyy + "");

        dnzzfzc_bzgls_gye.setText(Constant.dnzzfzc_bzgls_gye + "");

        dnzzfzc_bzgls_gyy.setText(Constant.dnzzfzc_bzgls_gyy + "");

        dnzzfzc_yzgls_gye.setText(Constant.dnzzfzc_yzgls_gye + "");

        dnzzfzc_yzgls_gyy.setText(Constant.dnzzfzc_yzgls_gyy + "");

        dnzzfzc_slkf_gye.setText(Constant.dnzzfzc_slkf_gye + "");

        dnzzfzc_slkf_gyy.setText(Constant.dnzzfzc_slkf_gyy + "");

        dnzzfzc_bgdqtjz_gye.setText(Constant.dnzzfzc_bgdqtjz_gye + "");

        dnzzfzc_bgdqtjz_gyy.setText(Constant.dnzzfzc_bgdqtjz_gyy + "");

        //保育仔猪繁殖场
        byzzfzc_hbmzs_gye.setText(Constant.byzzfzc_hbmzs_gye + "");

        byzzfzc_hbmzs_gyy.setText(Constant.byzzfzc_hbmzs_gyy + "");

        byzzfzc_pzrjmzs_gye.setText(Constant.byzzfzc_pzrjmzs_gye + "");

        byzzfzc_pzrjmzs_gyy.setText(Constant.byzzfzc_pzrjmzs_gyy + "");

        byzzfzc_hbmzs_gyy.setText(Constant.byzzfzc_hbmzs_gyy + "");

        byzzfzc_rcmzs_gye.setText(Constant.byzzfzc_rcmzs_gye + "");

        byzzfzc_rcmzs_gyy.setText(Constant.byzzfzc_rcmzs_gyy + "");

        byzzfzc_fws_gye.setText(Constant.byzzfzc_fws_gye + "");

        byzzfzc_fws_gyy.setText(Constant.byzzfzc_fws_gyy + "");

        byzzfzc_bys_gye.setText(Constant.byzzfzc_bys_gye + "");

        byzzfzc_bys_gyy.setText(Constant.byzzfzc_bys_gyy + "");

        byzzfzc_bzgls_gye.setText(Constant.byzzfzc_bzgls_gye + "");

        byzzfzc_bzgls_gyy.setText(Constant.byzzfzc_bzgls_gyy + "");

        byzzfzc_yzgls_gye.setText(Constant.byzzfzc_yzgls_gye + "");

        byzzfzc_yzgls_gyy.setText(Constant.byzzfzc_yzgls_gyy + "");

        byzzfzc_slkf_gye.setText(Constant.byzzfzc_slkf_gye + "");

        byzzfzc_slkf_gyy.setText(Constant.byzzfzc_slkf_gyy + "");

        byzzfzc_bgdqtjz_gye.setText(Constant.byzzfzc_bgdqtjz_gye + "");

        byzzfzc_bgdqtjz_gyy.setText(Constant.byzzfzc_bgdqtjz_gyy + "");
    }
}
