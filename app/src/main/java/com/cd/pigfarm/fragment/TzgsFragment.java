package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
 * @Description: 投资估算界面
 */
public class TzgsFragment extends BaseFragment {

    @NotEmpty
    private EditText zfzyc_hbmzs_tj_gyy;
    private EditText zfzyc_hbmzs_sb_gyy;
    private EditText zfzyc_hbmzs_tj_gye;
    private EditText zfzyc_hbmzs_sb_gye;
    private EditText zfzyc_gzjpzrjmzs_tj_gyy;
    private EditText zfzyc_gzjpzrjmzs_sb_gyy;
    private EditText zfzyc_gzjpzrjmzs_tj_gye;
    private EditText zfzyc_gzjpzrjmzs_sb_gye;
    private EditText zfzyc_rcmzs_tj_gyy;
    private EditText zfzyc_rcmzs_sb_gyy;
    private EditText zfzyc_rcmzs_tj_gye;
    private EditText zfzyc_rcmzs_sb_gye;
    private EditText zfzyc_fws_tj_gyy;
    private EditText zfzyc_fws_sb_gyy;
    private EditText zfzyc_fws_tj_gye;
    private EditText zfzyc_fws_sb_gye;
    private EditText zfzyc_bys_tj_gyy;
    private EditText zfzyc_bys_sb_gyy;
    private EditText zfzyc_bys_tj_gye;
    private EditText zfzyc_bys_sb_gye;
    private EditText zfzyc_szyfs_tj_gyy;
    private EditText zfzyc_szyfs_sb_gyy;
    private EditText zfzyc_szyfs_tj_gye;
    private EditText zfzyc_szyfs_sb_gye;
    private EditText zfzyc_bzgls_tj_gyy;
    private EditText zfzyc_bzgls_sb_gyy;
    private EditText zfzyc_bzgls_tj_gye;
    private EditText zfzyc_bzgls_sb_gye;
    private EditText zfzyc_yzgls_tj_gyy;
    private EditText zfzyc_yzgls_sb_gyy;
    private EditText zfzyc_yzgls_tj_gye;
    private EditText zfzyc_yzgls_sb_gye;
    private EditText zfzyc_zqc_tj_gyy;
    private EditText zfzyc_zqc_sb_gyy;
    private EditText zfzyc_zqc_tj_gye;
    private EditText zfzyc_zqc_sb_gye;
    private EditText zfzyc_zyc_tj_gyy;
    private EditText zfzyc_zyc_sb_gyy;
    private EditText zfzyc_zyc_tj_gye;
    private EditText zfzyc_zyc_sb_gye;
    private EditText zfzyc_fzwjzmj_tj_gyy;
    private EditText zfzyc_fzwjzmj_sb_gyy;
    private EditText zfzyc_fzwjzmj_tj_gye;
    private EditText zfzyc_fzwjzmj_sb_gye;
    private EditText zfzyc_slkf_tj_gyy;
    private EditText zfzyc_slkf_sb_gyy;
    private EditText zfzyc_slkf_tj_gye;
    private EditText zfzyc_slkf_sb_gye;
    private EditText zfzyc_bgdqtjz_tj_gyy;
    private EditText zfzyc_bgdqtjz_sb_gyy;
    private EditText zfzyc_bgdqtjz_tj_gye;
    private EditText zfzyc_bgdqtjz_sb_gye;
    private EditText zfzyc_xj_tj_gyy;
    private EditText zfzyc_xj_sb_gyy;
    private EditText zfzyc_xj_tj_gye;
    private EditText zfzyc_xj_sb_gye;
    private EditText zfzyc_hj_gyy;
    private EditText zfzyc_hj_gye;
    private EditText dnzzfzccz_hbmzs_tj_gyy;
    private EditText dnzzfzccz_hbmzs_sb_gyy;
    private EditText dnzzfzccz_hbmzs_tj_gye;
    private EditText dnzzfzccz_hbmzs_sb_gye;
    private EditText dnzzfzccz_pzrjmzs_tj_gyy;
    private EditText dnzzfzccz_pzrjmzs_sb_gyy;
    private EditText dnzzfzccz_pzrjmzs_tj_gye;
    private EditText dnzzfzccz_pzrjmzs_sb_gye;
    private EditText dnzzfzccz_rcmzs_tj_gyy;
    private EditText dnzzfzccz_rcmzs_sb_gyy;
    private EditText dnzzfzccz_rcmzs_tj_gye;
    private EditText dnzzfzccz_rcmzs_sb_gye;
    private EditText dnzzfzccz_fws_tj_gyy;
    private EditText dnzzfzccz_fws_sb_gyy;
    private EditText dnzzfzccz_fws_tj_gye;
    private EditText dnzzfzccz_fws_sb_gye;
    private EditText dnzzfzccz_bzgls_tj_gyy;
    private EditText dnzzfzccz_bzgls_sb_gyy;
    private EditText dnzzfzccz_bzgls_tj_gye;
    private EditText dnzzfzccz_bzgls_sb_gye;
    private EditText dnzzfzccz_yzgls_tj_gyy;
    private EditText dnzzfzccz_yzgls_sb_gyy;
    private EditText dnzzfzccz_yzgls_tj_gye;
    private EditText dnzzfzccz_yzgls_sb_gye;
    private EditText dnzzfzccz_zqc_tj_gyy;
    private EditText dnzzfzccz_zqc_sb_gyy;
    private EditText dnzzfzccz_zqc_tj_gye;
    private EditText dnzzfzccz_zqc_sb_gye;
    private EditText dnzzfzccz_zyc_tj_gyy;
    private EditText dnzzfzccz_zyc_sb_gyy;
    private EditText dnzzfzccz_zyc_tj_gye;
    private EditText dnzzfzccz_zyc_sb_gye;
    private EditText dnzzfzccz_fwzjzmj_tj_gyy;
    private EditText dnzzfzccz_fwzjzmj_sb_gyy;
    private EditText dnzzfzccz_fwzjzmj_tj_gye;
    private EditText dnzzfzccz_fwzjzmj_sb_gye;
    private EditText dnzzfzccz_slkf_tj_gyy;
    private EditText dnzzfzccz_slkf_sb_gyy;
    private EditText dnzzfzccz_slkf_tj_gye;
    private EditText dnzzfzccz_slkf_sb_gye;
    private EditText dnzzfzccz_bgdqtjz_tj_gyy;
    private EditText dnzzfzccz_bgdqtjz_sb_gyy;
    private EditText dnzzfzccz_bgdqtjz_tj_gye;
    private EditText dnzzfzccz_bgdqtjz_sb_gye;
    private EditText dnzzfzccz_xj_tj_gyy;
    private EditText dnzzfzccz_xj_sb_gyy;
    private EditText dnzzfzccz_xj_tj_gye;
    private EditText dnzzfzccz_xj_sb_gye;
    private EditText dnzzfzccz_hj_gyy;
    private EditText dnzzfzccz_hj_gye;
    private EditText dnzzfzcby_hbmzs_tj_gyy;
    private EditText dnzzfzcby_hbmzs_sb_gyy;
    private EditText dnzzfzcby_hbmzs_tj_gye;
    private EditText dnzzfzcby_hbmzs_sb_gye;
    private EditText dnzzfzcby_pzrjmzs_tj_gyy;
    private EditText dnzzfzcby_pzrjmzs_sb_gyy;
    private EditText dnzzfzcby_pzrjmzs_tj_gye;
    private EditText dnzzfzcby_pzrjmzs_sb_gye;
    private EditText dnzzfzcby_rcmzs_tj_gyy;
    private EditText dnzzfzcby_rcmzs_sb_gyy;
    private EditText dnzzfzcby_rcmzs_tj_gye;
    private EditText dnzzfzcby_rcmzs_sb_gye;
    private EditText dnzzfzcby_fws_tj_gyy;
    private EditText dnzzfzcby_fws_sb_gyy;
    private EditText dnzzfzcby_fws_tj_gye;
    private EditText dnzzfzcby_fws_sb_gye;
    private EditText dnzzfzcby_byq_tj_gyy;
    private EditText dnzzfzcby_byq_sb_gyy;
    private EditText dnzzfzcby_byq_tj_gye;
    private EditText dnzzfzcby_byq_sb_gye;
    private EditText dnzzfzcby_bzgls_tj_gyy;
    private EditText dnzzfzcby_bzgls_sb_gyy;
    private EditText dnzzfzcby_bzgls_tj_gye;
    private EditText dnzzfzcby_bzgls_sb_gye;
    private EditText dnzzfzcby_yzgls_tj_gyy;
    private EditText dnzzfzcby_yzgls_sb_gyy;
    private EditText dnzzfzcby_yzgls_tj_gye;
    private EditText dnzzfzcby_yzgls_sb_gye;
    private EditText dnzzfzcby_zqc_tj_gyy;
    private EditText dnzzfzcby_zqc_sb_gyy;
    private EditText dnzzfzcby_zqc_tj_gye;
    private EditText dnzzfzcby_zqc_sb_gye;
    private EditText dnzzfzcby_zyc_tj_gyy;
    private EditText dnzzfzcby_zyc_sb_gyy;
    private EditText dnzzfzcby_zyc_tj_gye;
    private EditText dnzzfzcby_zyc_sb_gye;
    private EditText dnzzfzcby_fzwjzmj_tj_gyy;
    private EditText dnzzfzcby_fzwjzmj_sb_gyy;
    private EditText dnzzfzcby_fzwjzmj_tj_gye;
    private EditText dnzzfzcby_fzwjzmj_sb_gye;
    private EditText dnzzfzcby_slkf_tj_gyy;
    private EditText dnzzfzcby_slkf_sb_gyy;
    private EditText dnzzfzcby_slkf_tj_gye;
    private EditText dnzzfzcby_slkf_sb_gye;
    private EditText dnzzfzcby_bgdqtjz_tj_gyy;
    private EditText dnzzfzcby_bgdqtjz_sb_gyy;
    private EditText dnzzfzcby_bgdqtjz_tj_gye;
    private EditText dnzzfzcby_bgdqtjz_sb_gye;
    private EditText dnzzfzcby_xj_tj_gyy;
    private EditText dnzzfzcby_xj_sb_gyy;
    private EditText dnzzfzcby_xj_tj_gye;
    private EditText dnzzfzcby_xj_sb_gye;
    private EditText dnzzfzcby_hj_gyy;
    private EditText dnzzfzcby_hj_gye;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_tzgs, null);
        bindViews();
        bindButton();
        return view;
    }


    @Override
    public void jsDatas() {
        try {


            //自繁自养场
            Constant.zfzyc_hbmzs_tj_gyy = Utils.keep2Wdouble((Constant.zfzyc_hbmzs_gyy * Constant.hbmzs_d) / 10000, 2);
            Constant.zfzyc_hbmzs_sb_gyy = Utils.keep2Wdouble(Constant.hbmzs_tzze, 2);
            Constant.zfzyc_hbmzs_tj_gye = Utils.keep2Wdouble((Constant.zfzyc_hbmzs_gye * Constant.hbmzs_d) / 10000, 2);
            Constant.zfzyc_hbmzs_sb_gye = Utils.keep2Wdouble(Constant.hbmzs_tzze, 2);

            Constant.zfzyc_gzjpzrjmzs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gyy * Constant.gzjpzrcmzs_d / 10000, 2);
            Constant.zfzyc_gzjpzrjmzs_sb_gyy = Utils.keep2Wdouble(Constant.gzjpzrjmzs_tzze, 2);
            Constant.zfzyc_gzjpzrjmzs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gye * Constant.gzjpzrcmzs_d / 10000, 2);
            Constant.zfzyc_gzjpzrjmzs_sb_gye = Utils.keep2Wdouble(Constant.gzjpzrjmzs_tzze, 2);

            Constant.zfzyc_rcmzs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_gyy * Constant.rcmzs_d / 10000, 2);
            Constant.zfzyc_rcmzs_sb_gyy = Utils.keep2Wdouble(Constant.rcmzs_tzze, 2);
            Constant.zfzyc_rcmzs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_gye * Constant.rcmzs_d / 10000, 2);
            Constant.zfzyc_rcmzs_sb_gye = Utils.keep2Wdouble(Constant.rcmzs_tzze, 2);

            Constant.zfzyc_fws_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_fws_gyy * Constant.fws_d / 10000, 2);
            Constant.zfzyc_fws_sb_gyy = Utils.keep2Wdouble(Constant.fws_tzze, 2);
            LogUtil.e(Constant.fws_tzze+"");
            Constant.zfzyc_fws_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_fws_gye * Constant.fws_d / 10000, 2);
            Constant.zfzyc_fws_sb_gye = Utils.keep2Wdouble(Constant.fws_tzze, 2);

            Constant.zfzyc_bys_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_bys_gyy * Constant.bys_d / 10000, 2);
            Constant.zfzyc_bys_sb_gyy = Utils.keep2Wdouble(Constant.bys_tzze, 2);
            Constant.zfzyc_bys_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_bys_gye * Constant.bys_d / 10000, 2);
            Constant.zfzyc_bys_sb_gye = Utils.keep2Wdouble(Constant.bys_tzze, 2);

            Constant.zfzyc_szyfs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_szyfs_gyy * Constant.szyfs_d / 10000, 2);
            Constant.zfzyc_szyfs_sb_gyy = Utils.keep2Wdouble(Constant.szyfs_tzze, 2);
            Constant.zfzyc_szyfs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_szyfs_gye * Constant.szyfs_d / 10000, 2);
            Constant.zfzyc_szyfs_sb_gye = Utils.keep2Wdouble(Constant.szyfs_tzze, 2);

            Constant.zfzyc_bzgls_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gyy * Constant.bzgls_d / 10000, 2);
            Constant.zfzyc_bzgls_sb_gyy = Utils.keep2Wdouble(Constant.bzgls_tzze, 2);
            Constant.zfzyc_bzgls_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gye * Constant.bzgls_d / 10000, 2);
            Constant.zfzyc_bzgls_sb_gye = Utils.keep2Wdouble(Constant.bzgls_tzze, 2);

            Constant.zfzyc_yzgls_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gyy * Constant.yzgls_d / 10000, 2);
            Constant.zfzyc_yzgls_sb_gyy = Utils.keep2Wdouble(Constant.yzgls_tzze, 2);
            Constant.zfzyc_yzgls_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gye * Constant.yzgls_d / 10000, 2);
            Constant.zfzyc_yzgls_sb_gye = Utils.keep2Wdouble(Constant.yzgls_tzze, 2);

            Constant.zfzyc_zqc_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_gqfzqcrl * Constant.zqc_d / 10000, 2);

            Constant.zfzyc_zqc_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_gqfzqcrl * Constant.zqc_d / 10000, 2);

            Constant.zfzyc_zyc_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_zyc * Constant.zyc_d / 10000, 2);

            Constant.zfzyc_zyc_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_zyc * Constant.zyc_d / 10000, 2);

            Constant.zfzyc_slkf_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_slkf_gyy * Constant.slkf_d / 10000, 2);
            Constant.zfzyc_slkf_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_slkf_gye * Constant.slkf_d / 10000, 2);

            Constant.zfzyc_bgdqtjz_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_bgdqtjz_gyy * Constant.bgdqtjz_d / 10000, 2);
            Constant.zfzyc_bgdqtjz_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_bgdqtjz_gye * Constant.bgdqtjz_d / 10000, 2);


            Constant.zfzyc_xj_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_tj_gyy  + Constant.zfzyc_rcmzs_tj_gyy
                    + Constant.zfzyc_fws_tj_gyy + Constant.zfzyc_bys_tj_gyy + Constant.zfzyc_szyfs_tj_gyy + Constant.zfzyc_bzgls_tj_gyy
                    + Constant.zfzyc_yzgls_tj_gyy + Constant.zfzyc_zqc_tj_gyy + Constant.zfzyc_zyc_tj_gyy + Constant.zfzyc_slkf_tj_gyy
                    + Constant.zfzyc_bgdqtjz_tj_gyy, 2);
            Constant.zfzyc_xj_sb_gyy = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_sb_gyy + Constant.zfzyc_gzjpzrjmzs_sb_gyy + Constant.zfzyc_rcmzs_sb_gyy
                    + Constant.zfzyc_fws_sb_gyy + Constant.zfzyc_bys_sb_gyy + Constant.zfzyc_szyfs_sb_gyy + Constant.zfzyc_bzgls_sb_gyy
                    + Constant.zfzyc_yzgls_sb_gyy + Constant.zfzyc_zqc_sb_gyy + Constant.zfzyc_zyc_sb_gyy + Constant.zfzyc_slkf_sb_gyy
                    + Constant.zfzyc_bgdqtjz_sb_gyy, 2);
            Constant.zfzyc_xj_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_tj_gye + Constant.zfzyc_gzjpzrjmzs_tj_gye + Constant.zfzyc_rcmzs_tj_gye
                    + Constant.zfzyc_fws_tj_gye + Constant.zfzyc_bys_tj_gye + Constant.zfzyc_szyfs_tj_gye + Constant.zfzyc_bzgls_tj_gye
                    + Constant.zfzyc_yzgls_tj_gye + Constant.zfzyc_zqc_tj_gye + Constant.zfzyc_zyc_tj_gye + Constant.zfzyc_slkf_tj_gye
                    + Constant.zfzyc_bgdqtjz_tj_gye, 2);
            Constant.zfzyc_xj_sb_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_sb_gye + Constant.zfzyc_gzjpzrjmzs_sb_gye + Constant.zfzyc_rcmzs_sb_gye
                    + Constant.zfzyc_fws_sb_gye + Constant.zfzyc_bys_sb_gye + Constant.zfzyc_szyfs_sb_gye + Constant.zfzyc_bzgls_sb_gye
                    + Constant.zfzyc_yzgls_sb_gye + Constant.zfzyc_zqc_sb_gye + Constant.zfzyc_zyc_sb_gye + Constant.zfzyc_slkf_sb_gye
                    + Constant.zfzyc_bgdqtjz_sb_gye, 2);

            Constant.zfzyc_hj_gyy = Utils.keep2Wdouble(Constant.zfzyc_xj_tj_gyy + Constant.zfzyc_xj_sb_gyy, 0);
            Constant.zfzyc_hj_gye = Utils.keep2Wdouble(Constant.zfzyc_xj_tj_gye + Constant.zfzyc_xj_sb_gye, 0);
            //断奶仔猪繁殖场（仅在产仔部分）
            Constant.dnzzfzccz_hbmzs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_tj_gyy, 2);
            Constant.dnzzfzccz_hbmzs_sb_gyy = Utils.keep2Wdouble(Constant.hbmzs_tzze, 2);
            Constant.dnzzfzccz_hbmzs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_tj_gye, 2);
            Constant.dnzzfzccz_hbmzs_sb_gye = Utils.keep2Wdouble(Constant.hbmzs_tzze, 2);

            Constant.dnzzfzccz_pzrjmzs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_tj_gyy, 2);
            Constant.dnzzfzccz_pzrjmzs_sb_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_sb_gyy, 2);
            Constant.dnzzfzccz_pzrjmzs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_tj_gye, 2);
            Constant.dnzzfzccz_pzrjmzs_sb_gye = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_sb_gye, 2);

            Constant.dnzzfzccz_rcmzs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_tj_gyy, 2);
            Constant.dnzzfzccz_rcmzs_sb_gyy = Utils.keep2Wdouble(Constant.rcmzs_tzze, 2);
            Constant.dnzzfzccz_rcmzs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_tj_gye, 2);
            Constant.dnzzfzccz_rcmzs_sb_gye = Utils.keep2Wdouble(Constant.rcmzs_tzze, 2);

            Constant.dnzzfzccz_fws_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_fws_tj_gyy, 2);
            Constant.dnzzfzccz_fws_sb_gyy = Utils.keep2Wdouble(Constant.fws_tzze, 2);
            Constant.dnzzfzccz_fws_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_fws_tj_gye, 2);
            Constant.dnzzfzccz_fws_sb_gye = Utils.keep2Wdouble(Constant.fws_tzze, 2);

            Constant.dnzzfzccz_bzgls_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gyy * Constant.bzgls_d / 10000, 2);
            Constant.dnzzfzccz_bzgls_sb_gyy = Utils.keep2Wdouble(Constant.bzgls_tzze, 2);
            Constant.dnzzfzccz_bzgls_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gye * Constant.bzgls_d / 10000, 2);
            Constant.dnzzfzccz_bzgls_sb_gye = Utils.keep2Wdouble(Constant.bzgls_tzze, 2);

            Constant.dnzzfzccz_yzgls_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gyy * Constant.yzgls_d / 10000, 2);
            Constant.dnzzfzccz_yzgls_sb_gyy = Utils.keep2Wdouble(Constant.yzgls_tzze, 2);
            Constant.dnzzfzccz_yzgls_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gye * Constant.yzgls_d / 10000, 2);
            Constant.dnzzfzccz_yzgls_sb_gye = Utils.keep2Wdouble(Constant.yzgls_tzze, 2);

            Constant.dnzzfzccz_zqc_tj_gyy = Utils.keep2Wdouble(Constant.dnzzfzc_gqfzqcrl * Constant.zqc_d / 10000, 2);

            Constant.dnzzfzccz_zqc_tj_gye = Utils.keep2Wdouble(Constant.dnzzfzc_gqfzqcrl * Constant.zqc_d / 10000, 2);

            Constant.dnzzfzccz_zyc_tj_gyy = Utils.keep2Wdouble(Constant.dnzzfzc_zyc * Constant.zyc_d / 10000, 2);

            Constant.dnzzfzccz_zyc_tj_gye = Utils.keep2Wdouble(Constant.dnzzfzc_zyc * Constant.zyc_d / 10000, 2);

            Constant.dnzzfzccz_slkf_tj_gyy = Utils.keep2Wdouble(Constant.dnzzfzc_slkf_gyy * Constant.slkf_d / 10000, 2);
            Constant.dnzzfzccz_slkf_tj_gye = Utils.keep2Wdouble(Constant.dnzzfzc_slkf_gye * Constant.slkf_d / 10000, 2);

            Constant.dnzzfzccz_bgdqtjz_tj_gyy = Utils.keep2Wdouble(Constant.dnzzfzc_bgdqtjz_gyy * Constant.bgdqtjz_d / 10000, 2);
            Constant.dnzzfzccz_bgdqtjz_tj_gye = Utils.keep2Wdouble(Constant.dnzzfzc_bgdqtjz_gye * Constant.bgdqtjz_d / 10000, 2);


            Constant.dnzzfzccz_xj_tj_gyy = Utils.keep2Wdouble(Constant.dnzzfzccz_hbmzs_tj_gyy  + Constant.dnzzfzccz_rcmzs_tj_gyy
                    + Constant.dnzzfzccz_fws_tj_gyy + Constant.dnzzfzccz_bzgls_tj_gyy + Constant.dnzzfzccz_yzgls_tj_gyy + Constant.dnzzfzccz_zqc_tj_gyy + Constant.dnzzfzccz_zyc_tj_gyy + Constant.dnzzfzccz_slkf_tj_gyy
                    + Constant.dnzzfzccz_bgdqtjz_tj_gyy, 2);
            Constant.dnzzfzccz_xj_sb_gyy = Utils.keep2Wdouble(Constant.dnzzfzccz_hbmzs_sb_gyy + Constant.dnzzfzccz_pzrjmzs_sb_gyy + Constant.dnzzfzccz_rcmzs_sb_gyy
                    + Constant.dnzzfzccz_fws_sb_gyy + Constant.dnzzfzccz_bzgls_sb_gyy
                    + Constant.dnzzfzccz_yzgls_sb_gyy + Constant.dnzzfzccz_zqc_sb_gyy + Constant.dnzzfzccz_zyc_sb_gyy + Constant.dnzzfzccz_slkf_sb_gyy
                    + Constant.dnzzfzccz_bgdqtjz_sb_gyy, 2);
            Constant.dnzzfzccz_xj_tj_gye = Utils.keep2Wdouble(Constant.dnzzfzccz_hbmzs_tj_gye + Constant.dnzzfzccz_pzrjmzs_tj_gye + Constant.dnzzfzccz_rcmzs_tj_gye
                    + Constant.dnzzfzccz_fws_tj_gye + Constant.dnzzfzccz_bzgls_tj_gye
                    + Constant.dnzzfzccz_yzgls_tj_gye + Constant.dnzzfzccz_zqc_tj_gye + Constant.dnzzfzccz_zyc_tj_gye + Constant.dnzzfzccz_slkf_tj_gye
                    + Constant.dnzzfzccz_bgdqtjz_tj_gye, 2);
            Constant.dnzzfzccz_xj_sb_gye = Utils.keep2Wdouble(Constant.dnzzfzccz_hbmzs_sb_gye + Constant.dnzzfzccz_pzrjmzs_sb_gye + Constant.dnzzfzccz_rcmzs_sb_gye
                    + Constant.dnzzfzccz_fws_sb_gye + Constant.dnzzfzccz_bzgls_sb_gye
                    + Constant.dnzzfzccz_yzgls_sb_gye + Constant.dnzzfzccz_zqc_sb_gye + Constant.dnzzfzccz_zyc_sb_gye + Constant.dnzzfzccz_slkf_sb_gye
                    + Constant.dnzzfzccz_bgdqtjz_sb_gye, 2);

            Constant.dnzzfzccz_hj_gyy = Utils.keep2Wdouble(Constant.dnzzfzccz_xj_tj_gyy + Constant.dnzzfzccz_xj_sb_gyy, 0);
            Constant.dnzzfzccz_hj_gye = Utils.keep2Wdouble(Constant.dnzzfzccz_xj_tj_gye + Constant.dnzzfzccz_xj_sb_gye, 0);

            //断奶仔猪繁殖场（仅在产仔部分）
            Constant.dnzzfzcby_hbmzs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_tj_gyy, 2);
            Constant.dnzzfzcby_hbmzs_sb_gyy = Utils.keep2Wdouble(Constant.hbmzs_tzze, 2);
            Constant.dnzzfzcby_hbmzs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_tj_gye, 2);
            Constant.dnzzfzcby_hbmzs_sb_gye = Utils.keep2Wdouble(Constant.hbmzs_tzze, 2);

            Constant.dnzzfzcby_pzrjmzs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_tj_gyy, 2);
            Constant.dnzzfzcby_pzrjmzs_sb_gyy = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_sb_gyy, 2);
            Constant.dnzzfzcby_pzrjmzs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_tj_gye, 2);
            Constant.dnzzfzcby_pzrjmzs_sb_gye = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_sb_gye, 2);

            Constant.dnzzfzcby_rcmzs_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_tj_gyy, 2);
            Constant.dnzzfzcby_rcmzs_sb_gyy = Utils.keep2Wdouble(Constant.rcmzs_tzze, 2);
            Constant.dnzzfzcby_rcmzs_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_tj_gye, 2);
            Constant.dnzzfzcby_rcmzs_sb_gye = Utils.keep2Wdouble(Constant.rcmzs_tzze, 2);

            Constant.dnzzfzcby_fws_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_fws_tj_gyy, 2);
            Constant.dnzzfzcby_fws_sb_gyy = Utils.keep2Wdouble(Constant.fws_tzze, 2);
            Constant.dnzzfzcby_fws_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_fws_tj_gye, 2);
            Constant.dnzzfzcby_fws_sb_gye = Utils.keep2Wdouble(Constant.fws_tzze, 2);
            
            Constant.dnzzfzcby_byq_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_bys_tj_gyy, 2);
            Constant.dnzzfzcby_byq_sb_gyy = Utils.keep2Wdouble(Constant.bys_tzze, 2);
            Constant.dnzzfzcby_byq_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_bys_tj_gye, 2);
            Constant.dnzzfzcby_byq_sb_gye = Utils.keep2Wdouble(Constant.bys_tzze, 2);

            Constant.dnzzfzcby_bzgls_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gyy * Constant.bzgls_d / 10000, 2);
            Constant.dnzzfzcby_bzgls_sb_gyy = Utils.keep2Wdouble(Constant.bzgls_tzze, 2);
            Constant.dnzzfzcby_bzgls_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gye * Constant.bzgls_d / 10000, 2);
            Constant.dnzzfzcby_bzgls_sb_gye = Utils.keep2Wdouble(Constant.bzgls_tzze, 2);

            Constant.dnzzfzcby_yzgls_tj_gyy = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gyy * Constant.yzgls_d / 10000, 2);
            Constant.dnzzfzcby_yzgls_sb_gyy = Utils.keep2Wdouble(Constant.yzgls_tzze, 2);
            Constant.dnzzfzcby_yzgls_tj_gye = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gye * Constant.yzgls_d / 10000, 2);
            Constant.dnzzfzcby_yzgls_sb_gye = Utils.keep2Wdouble(Constant.yzgls_tzze, 2);

            Constant.dnzzfzcby_zqc_tj_gyy = Utils.keep2Wdouble(Constant.zzfzc_gqfzqcrl * Constant.zqc_d / 10000, 2);

            Constant.dnzzfzcby_zqc_tj_gye = Utils.keep2Wdouble(Constant.zzfzc_gqfzqcrl * Constant.zqc_d / 10000, 2);

            Constant.dnzzfzcby_zyc_tj_gyy = Utils.keep2Wdouble(Constant.zzfzc_zyc * Constant.zyc_d / 10000, 2);

            Constant.dnzzfzcby_zyc_tj_gye = Utils.keep2Wdouble(Constant.zzfzc_zyc * Constant.zyc_d / 10000, 2);

            Constant.dnzzfzcby_slkf_tj_gyy = Utils.keep2Wdouble(Constant.dnzzfzc_slkf_gyy * Constant.slkf_d / 10000, 2);
            Constant.dnzzfzcby_slkf_tj_gye = Utils.keep2Wdouble(Constant.dnzzfzc_slkf_gye * Constant.slkf_d / 10000, 2);

            Constant.dnzzfzcby_bgdqtjz_tj_gyy = Utils.keep2Wdouble(Constant.dnzzfzc_bgdqtjz_gyy * Constant.bgdqtjz_d / 10000, 2);
            Constant.dnzzfzcby_bgdqtjz_tj_gye = Utils.keep2Wdouble(Constant.dnzzfzc_bgdqtjz_gye * Constant.bgdqtjz_d / 10000, 2);


            Constant.dnzzfzcby_xj_tj_gyy = Utils.keep2Wdouble(Constant.dnzzfzcby_byq_tj_gyy  +Constant.dnzzfzcby_hbmzs_tj_gyy  + Constant.dnzzfzcby_rcmzs_tj_gyy
                    + Constant.dnzzfzcby_fws_tj_gyy + Constant.dnzzfzcby_bzgls_tj_gyy + Constant.dnzzfzcby_yzgls_tj_gyy + Constant.dnzzfzcby_zqc_tj_gyy + Constant.dnzzfzcby_zyc_tj_gyy + Constant.dnzzfzcby_slkf_tj_gyy
                    + Constant.dnzzfzcby_bgdqtjz_tj_gyy, 2);
            Constant.dnzzfzcby_xj_sb_gyy = Utils.keep2Wdouble(Constant.dnzzfzcby_byq_sb_gyy  +Constant.dnzzfzcby_hbmzs_sb_gyy + Constant.dnzzfzcby_pzrjmzs_sb_gyy + Constant.dnzzfzcby_rcmzs_sb_gyy
                    + Constant.dnzzfzcby_fws_sb_gyy + Constant.dnzzfzcby_bzgls_sb_gyy
                    + Constant.dnzzfzcby_yzgls_sb_gyy + Constant.dnzzfzcby_zqc_sb_gyy + Constant.dnzzfzcby_zyc_sb_gyy + Constant.dnzzfzcby_slkf_sb_gyy
                    + Constant.dnzzfzcby_bgdqtjz_sb_gyy, 2);
            Constant.dnzzfzcby_xj_tj_gye = Utils.keep2Wdouble(Constant.dnzzfzcby_byq_tj_gye  +Constant.dnzzfzcby_hbmzs_tj_gye + Constant.dnzzfzcby_pzrjmzs_tj_gye + Constant.dnzzfzcby_rcmzs_tj_gye
                    + Constant.dnzzfzcby_fws_tj_gye + Constant.dnzzfzcby_bzgls_tj_gye
                    + Constant.dnzzfzcby_yzgls_tj_gye + Constant.dnzzfzcby_zqc_tj_gye + Constant.dnzzfzcby_zyc_tj_gye + Constant.dnzzfzcby_slkf_tj_gye
                    + Constant.dnzzfzcby_bgdqtjz_tj_gye, 2);
            Constant.dnzzfzcby_xj_sb_gye = Utils.keep2Wdouble(Constant.dnzzfzcby_byq_sb_gye  +Constant.dnzzfzcby_hbmzs_sb_gye + Constant.dnzzfzcby_pzrjmzs_sb_gye + Constant.dnzzfzcby_rcmzs_sb_gye
                    + Constant.dnzzfzcby_fws_sb_gye + Constant.dnzzfzcby_bzgls_sb_gye
                    + Constant.dnzzfzcby_yzgls_sb_gye + Constant.dnzzfzcby_zqc_sb_gye + Constant.dnzzfzcby_zyc_sb_gye + Constant.dnzzfzcby_slkf_sb_gye
                    + Constant.dnzzfzcby_bgdqtjz_sb_gye, 2);

            Constant.dnzzfzcby_hj_gyy = Utils.keep2Wdouble(Constant.dnzzfzcby_xj_tj_gyy + Constant.dnzzfzcby_xj_sb_gyy, 0);
            Constant.dnzzfzcby_hj_gye = Utils.keep2Wdouble(Constant.dnzzfzcby_xj_tj_gye + Constant.dnzzfzcby_xj_sb_gye, 0);
        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }

    }

    @Override
    public void refreshViews() {
        //自繁自养场
        if (Constant.zfzyc_hbmzs_tj_gyy == 0){
            Toast.makeText(getContext(),"请先设置所有猪场设计参数",Toast.LENGTH_LONG).show();
            return;
        }
        zfzyc_hbmzs_tj_gyy.setText(Constant.zfzyc_hbmzs_tj_gyy + "");
        zfzyc_hbmzs_sb_gyy.setText(Constant.zfzyc_hbmzs_sb_gyy + "");
        zfzyc_hbmzs_tj_gye.setText(Constant.zfzyc_hbmzs_tj_gye + "");
        zfzyc_hbmzs_sb_gye.setText(Constant.zfzyc_hbmzs_sb_gye + "");

        zfzyc_gzjpzrjmzs_tj_gyy.setText("↓");
        zfzyc_gzjpzrjmzs_sb_gyy.setText(Constant.zfzyc_gzjpzrjmzs_sb_gyy + "");
        zfzyc_gzjpzrjmzs_tj_gye.setText(Constant.zfzyc_gzjpzrjmzs_tj_gye + "");
        zfzyc_gzjpzrjmzs_sb_gye.setText(Constant.zfzyc_gzjpzrjmzs_sb_gye + "");

        zfzyc_rcmzs_tj_gyy.setText(Constant.zfzyc_rcmzs_tj_gyy + "");
        zfzyc_rcmzs_sb_gyy.setText(Constant.zfzyc_rcmzs_sb_gyy + "");
        zfzyc_rcmzs_tj_gye.setText(Constant.zfzyc_rcmzs_tj_gye + "");
        zfzyc_rcmzs_sb_gye.setText(Constant.zfzyc_rcmzs_sb_gye + "");

        zfzyc_fws_tj_gyy.setText(Constant.zfzyc_fws_tj_gyy + "");
        zfzyc_fws_sb_gyy.setText(Constant.zfzyc_fws_sb_gyy + "");
        zfzyc_fws_tj_gye.setText(Constant.zfzyc_fws_tj_gye + "");
        zfzyc_fws_sb_gye.setText(Constant.zfzyc_fws_sb_gye + "");

        zfzyc_bys_tj_gyy.setText(Constant.zfzyc_bys_tj_gyy + "");
        zfzyc_bys_sb_gyy.setText(Constant.zfzyc_bys_sb_gyy + "");
        zfzyc_bys_tj_gye.setText(Constant.zfzyc_bys_tj_gye + "");
        zfzyc_bys_sb_gye.setText(Constant.zfzyc_bys_sb_gye + "");

        zfzyc_szyfs_tj_gyy.setText(Constant.zfzyc_szyfs_tj_gyy + "");
        zfzyc_szyfs_sb_gyy.setText(Constant.zfzyc_szyfs_sb_gyy + "");
        zfzyc_szyfs_tj_gye.setText(Constant.zfzyc_szyfs_tj_gye + "");
        zfzyc_szyfs_sb_gye.setText(Constant.zfzyc_szyfs_sb_gye + "");

        zfzyc_bzgls_tj_gyy.setText(Constant.zfzyc_bzgls_tj_gyy + "");
        zfzyc_bzgls_sb_gyy.setText(Constant.zfzyc_bzgls_sb_gyy + "");
        zfzyc_bzgls_tj_gye.setText(Constant.zfzyc_bzgls_tj_gye + "");
        zfzyc_bzgls_sb_gye.setText(Constant.zfzyc_bzgls_sb_gye + "");

        zfzyc_yzgls_tj_gyy.setText(Constant.zfzyc_yzgls_tj_gyy + "");
        zfzyc_yzgls_sb_gyy.setText(Constant.zfzyc_yzgls_sb_gyy + "");
        zfzyc_yzgls_tj_gye.setText(Constant.zfzyc_yzgls_tj_gye + "");
        zfzyc_yzgls_sb_gye.setText(Constant.zfzyc_yzgls_sb_gye + "");

        zfzyc_zqc_tj_gyy.setText(Constant.zfzyc_zqc_tj_gyy + "");

        zfzyc_zqc_tj_gye.setText(Constant.zfzyc_zqc_tj_gye + "");

        zfzyc_zyc_tj_gyy.setText(Constant.zfzyc_zyc_tj_gyy + "");

        zfzyc_zyc_tj_gye.setText(Constant.zfzyc_zyc_tj_gye + "");

        zfzyc_slkf_tj_gyy.setText(Constant.zfzyc_slkf_tj_gyy + "");
        zfzyc_slkf_tj_gye.setText(Constant.zfzyc_slkf_tj_gye + "");

        zfzyc_bgdqtjz_tj_gyy.setText(Constant.zfzyc_bgdqtjz_tj_gyy + "");
        zfzyc_bgdqtjz_tj_gye.setText(Constant.zfzyc_bgdqtjz_tj_gye + "");


        zfzyc_xj_tj_gyy.setText(Constant.zfzyc_xj_tj_gyy + "");
        zfzyc_xj_sb_gyy.setText(Constant.zfzyc_xj_sb_gyy + "");
        zfzyc_xj_tj_gye.setText(Constant.zfzyc_xj_tj_gye + "");
        zfzyc_xj_sb_gye.setText(Constant.zfzyc_xj_sb_gye + "");

        zfzyc_hj_gyy.setText(Constant.zfzyc_hj_gyy + "");
        zfzyc_hj_gye.setText(Constant.zfzyc_hj_gye + "");
        //断奶仔猪繁殖场（仅在产仔部分）
        dnzzfzccz_hbmzs_tj_gyy.setText(Constant.dnzzfzccz_hbmzs_tj_gyy + "");
        dnzzfzccz_hbmzs_sb_gyy.setText(Constant.dnzzfzccz_hbmzs_sb_gyy + "");
        dnzzfzccz_hbmzs_tj_gye.setText(Constant.dnzzfzccz_hbmzs_tj_gye + "");
        dnzzfzccz_hbmzs_sb_gye.setText(Constant.dnzzfzccz_hbmzs_sb_gye + "");

        dnzzfzccz_pzrjmzs_tj_gyy.setText("↓");
        dnzzfzccz_pzrjmzs_sb_gyy.setText(Constant.dnzzfzccz_pzrjmzs_sb_gyy + "");
        dnzzfzccz_pzrjmzs_tj_gye.setText(Constant.dnzzfzccz_pzrjmzs_tj_gye + "");
        dnzzfzccz_pzrjmzs_sb_gye.setText(Constant.dnzzfzccz_pzrjmzs_sb_gye + "");

        dnzzfzccz_rcmzs_tj_gyy.setText(Constant.dnzzfzccz_rcmzs_tj_gyy + "");
        dnzzfzccz_rcmzs_sb_gyy.setText(Constant.dnzzfzccz_rcmzs_sb_gyy + "");
        dnzzfzccz_rcmzs_tj_gye.setText(Constant.dnzzfzccz_rcmzs_tj_gye + "");
        dnzzfzccz_rcmzs_sb_gye.setText(Constant.dnzzfzccz_rcmzs_sb_gye + "");

        dnzzfzccz_fws_tj_gyy.setText(Constant.dnzzfzccz_fws_tj_gyy + "");
        dnzzfzccz_fws_sb_gyy.setText(Constant.dnzzfzccz_fws_sb_gyy + "");
        dnzzfzccz_fws_tj_gye.setText(Constant.dnzzfzccz_fws_tj_gye + "");
        dnzzfzccz_fws_sb_gye.setText(Constant.dnzzfzccz_fws_sb_gye + "");

        dnzzfzccz_bzgls_tj_gyy.setText(Constant.dnzzfzccz_bzgls_tj_gyy + "");
        dnzzfzccz_bzgls_sb_gyy.setText(Constant.dnzzfzccz_bzgls_sb_gyy + "");
        dnzzfzccz_bzgls_tj_gye.setText(Constant.dnzzfzccz_bzgls_tj_gye + "");
        dnzzfzccz_bzgls_sb_gye.setText(Constant.dnzzfzccz_bzgls_sb_gye + "");

        dnzzfzccz_yzgls_tj_gyy.setText(Constant.dnzzfzccz_yzgls_tj_gyy + "");
        dnzzfzccz_yzgls_sb_gyy.setText(Constant.dnzzfzccz_yzgls_sb_gyy + "");
        dnzzfzccz_yzgls_tj_gye.setText(Constant.dnzzfzccz_yzgls_tj_gye + "");
        dnzzfzccz_yzgls_sb_gye.setText(Constant.dnzzfzccz_yzgls_sb_gye + "");

        dnzzfzccz_zqc_tj_gyy.setText(Constant.dnzzfzccz_zqc_tj_gyy + "");

        dnzzfzccz_zqc_tj_gye.setText(Constant.dnzzfzccz_zqc_tj_gye + "");

        dnzzfzccz_zyc_tj_gyy.setText(Constant.dnzzfzccz_zyc_tj_gyy + "");

        dnzzfzccz_zyc_tj_gye.setText(Constant.dnzzfzccz_zyc_tj_gye + "");

        dnzzfzccz_slkf_tj_gyy.setText(Constant.dnzzfzccz_slkf_tj_gyy + "");
        dnzzfzccz_slkf_tj_gye.setText(Constant.dnzzfzccz_slkf_tj_gye + "");

        dnzzfzccz_bgdqtjz_tj_gyy.setText(Constant.dnzzfzccz_bgdqtjz_tj_gyy + "");
        dnzzfzccz_bgdqtjz_tj_gye.setText(Constant.dnzzfzccz_bgdqtjz_tj_gye + "");


        dnzzfzccz_xj_tj_gyy.setText(Constant.dnzzfzccz_xj_tj_gyy + "");
        dnzzfzccz_xj_sb_gyy.setText(Constant.dnzzfzccz_xj_sb_gyy + "");
        dnzzfzccz_xj_tj_gye.setText(Constant.dnzzfzccz_xj_tj_gye + "");
        dnzzfzccz_xj_sb_gye.setText(Constant.dnzzfzccz_xj_sb_gye + "");

        dnzzfzccz_hj_gyy.setText(Constant.dnzzfzccz_hj_gyy + "");
        dnzzfzccz_hj_gye.setText(Constant.dnzzfzccz_hj_gye + "");

        //断奶仔猪繁殖场（仅在产仔部分）
        dnzzfzcby_hbmzs_tj_gyy.setText(Constant.dnzzfzcby_hbmzs_tj_gyy + "");
        dnzzfzcby_hbmzs_sb_gyy.setText(Constant.dnzzfzcby_hbmzs_sb_gyy + "");
        dnzzfzcby_hbmzs_tj_gye.setText(Constant.dnzzfzcby_hbmzs_tj_gye + "");
        dnzzfzcby_hbmzs_sb_gye.setText(Constant.dnzzfzcby_hbmzs_sb_gye + "");

        dnzzfzcby_pzrjmzs_tj_gyy.setText("↓");
        dnzzfzcby_pzrjmzs_sb_gyy.setText(Constant.dnzzfzcby_pzrjmzs_sb_gyy + "");
        dnzzfzcby_pzrjmzs_tj_gye.setText(Constant.dnzzfzcby_pzrjmzs_tj_gye + "");
        dnzzfzcby_pzrjmzs_sb_gye.setText(Constant.dnzzfzcby_pzrjmzs_sb_gye + "");

        dnzzfzcby_rcmzs_tj_gyy.setText(Constant.dnzzfzcby_rcmzs_tj_gyy + "");
        dnzzfzcby_rcmzs_sb_gyy.setText(Constant.dnzzfzcby_rcmzs_sb_gyy + "");
        dnzzfzcby_rcmzs_tj_gye.setText(Constant.dnzzfzcby_rcmzs_tj_gye + "");
        dnzzfzcby_rcmzs_sb_gye.setText(Constant.dnzzfzcby_rcmzs_sb_gye + "");

        dnzzfzcby_fws_tj_gyy.setText(Constant.dnzzfzcby_fws_tj_gyy + "");
        dnzzfzcby_fws_sb_gyy.setText(Constant.dnzzfzcby_fws_sb_gyy + "");
        dnzzfzcby_fws_tj_gye.setText(Constant.dnzzfzcby_fws_tj_gye + "");
        dnzzfzcby_fws_sb_gye.setText(Constant.dnzzfzcby_fws_sb_gye + "");

        dnzzfzcby_byq_tj_gyy.setText(Constant.dnzzfzcby_byq_tj_gyy + "");
        dnzzfzcby_byq_sb_gyy.setText(Constant.dnzzfzcby_byq_sb_gyy + "");
        dnzzfzcby_byq_tj_gye.setText(Constant.dnzzfzcby_byq_tj_gye + "");
        dnzzfzcby_byq_sb_gye.setText(Constant.dnzzfzcby_byq_sb_gye + "");

        dnzzfzcby_bzgls_tj_gyy.setText(Constant.dnzzfzcby_bzgls_tj_gyy + "");
        dnzzfzcby_bzgls_sb_gyy.setText(Constant.dnzzfzcby_bzgls_sb_gyy + "");
        dnzzfzcby_bzgls_tj_gye.setText(Constant.dnzzfzcby_bzgls_tj_gye + "");
        dnzzfzcby_bzgls_sb_gye.setText(Constant.dnzzfzcby_bzgls_sb_gye + "");

        dnzzfzcby_yzgls_tj_gyy.setText(Constant.dnzzfzcby_yzgls_tj_gyy + "");
        dnzzfzcby_yzgls_sb_gyy.setText(Constant.dnzzfzcby_yzgls_sb_gyy + "");
        dnzzfzcby_yzgls_tj_gye.setText(Constant.dnzzfzcby_yzgls_tj_gye + "");
        dnzzfzcby_yzgls_sb_gye.setText(Constant.dnzzfzcby_yzgls_sb_gye + "");

        dnzzfzcby_zqc_tj_gyy.setText(Constant.dnzzfzcby_zqc_tj_gyy + "");

        dnzzfzcby_zqc_tj_gye.setText(Constant.dnzzfzcby_zqc_tj_gye + "");

        dnzzfzcby_zyc_tj_gyy.setText(Constant.dnzzfzcby_zyc_tj_gyy + "");

        dnzzfzcby_zyc_tj_gye.setText(Constant.dnzzfzcby_zyc_tj_gye + "");

        dnzzfzcby_slkf_tj_gyy.setText(Constant.dnzzfzcby_slkf_tj_gyy + "");
        dnzzfzcby_slkf_tj_gye.setText(Constant.dnzzfzcby_slkf_tj_gye + "");

        dnzzfzcby_bgdqtjz_tj_gyy.setText(Constant.dnzzfzcby_bgdqtjz_tj_gyy + "");
        dnzzfzcby_bgdqtjz_tj_gye.setText(Constant.dnzzfzcby_bgdqtjz_tj_gye + "");


        dnzzfzcby_xj_tj_gyy.setText(Constant.dnzzfzcby_xj_tj_gyy + "");
        dnzzfzcby_xj_sb_gyy.setText(Constant.dnzzfzcby_xj_sb_gyy + "");
        dnzzfzcby_xj_tj_gye.setText(Constant.dnzzfzcby_xj_tj_gye + "");
        dnzzfzcby_xj_sb_gye.setText(Constant.dnzzfzcby_xj_sb_gye + "");

        dnzzfzcby_hj_gyy.setText(Constant.dnzzfzcby_hj_gyy + "");
        dnzzfzcby_hj_gye.setText(Constant.dnzzfzcby_hj_gye + "");

    }

    private void bindViews() {

        zfzyc_hbmzs_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_hbmzs_tj_gyy);
        zfzyc_hbmzs_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_hbmzs_sb_gyy);
        zfzyc_hbmzs_tj_gye = (EditText) view.findViewById(R.id.zfzyc_hbmzs_tj_gye);
        zfzyc_hbmzs_sb_gye = (EditText) view.findViewById(R.id.zfzyc_hbmzs_sb_gye);
        zfzyc_gzjpzrjmzs_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_gzjpzrjmzs_tj_gyy);
        zfzyc_gzjpzrjmzs_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_gzjpzrjmzs_sb_gyy);
        zfzyc_gzjpzrjmzs_tj_gye = (EditText) view.findViewById(R.id.zfzyc_gzjpzrjmzs_tj_gye);
        zfzyc_gzjpzrjmzs_sb_gye = (EditText) view.findViewById(R.id.zfzyc_gzjpzrjmzs_sb_gye);
        zfzyc_rcmzs_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_rcmzs_tj_gyy);
        zfzyc_rcmzs_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_rcmzs_sb_gyy);
        zfzyc_rcmzs_tj_gye = (EditText) view.findViewById(R.id.zfzyc_rcmzs_tj_gye);
        zfzyc_rcmzs_sb_gye = (EditText) view.findViewById(R.id.zfzyc_rcmzs_sb_gye);
        zfzyc_fws_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_fws_tj_gyy);
        zfzyc_fws_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_fws_sb_gyy);
        zfzyc_fws_tj_gye = (EditText) view.findViewById(R.id.zfzyc_fws_tj_gye);
        zfzyc_fws_sb_gye = (EditText) view.findViewById(R.id.zfzyc_fws_sb_gye);
        zfzyc_bys_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_bys_tj_gyy);
        zfzyc_bys_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_bys_sb_gyy);
        zfzyc_bys_tj_gye = (EditText) view.findViewById(R.id.zfzyc_bys_tj_gye);
        zfzyc_bys_sb_gye = (EditText) view.findViewById(R.id.zfzyc_bys_sb_gye);
        zfzyc_szyfs_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_szyfs_tj_gyy);
        zfzyc_szyfs_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_szyfs_sb_gyy);
        zfzyc_szyfs_tj_gye = (EditText) view.findViewById(R.id.zfzyc_szyfs_tj_gye);
        zfzyc_szyfs_sb_gye = (EditText) view.findViewById(R.id.zfzyc_szyfs_sb_gye);
        zfzyc_bzgls_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_bzgls_tj_gyy);
        zfzyc_bzgls_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_bzgls_sb_gyy);
        zfzyc_bzgls_tj_gye = (EditText) view.findViewById(R.id.zfzyc_bzgls_tj_gye);
        zfzyc_bzgls_sb_gye = (EditText) view.findViewById(R.id.zfzyc_bzgls_sb_gye);
        zfzyc_yzgls_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_yzgls_tj_gyy);
        zfzyc_yzgls_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_yzgls_sb_gyy);
        zfzyc_yzgls_tj_gye = (EditText) view.findViewById(R.id.zfzyc_yzgls_tj_gye);
        zfzyc_yzgls_sb_gye = (EditText) view.findViewById(R.id.zfzyc_yzgls_sb_gye);
        zfzyc_zqc_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_zqc_tj_gyy);
        zfzyc_zqc_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_zqc_sb_gyy);
        zfzyc_zqc_tj_gye = (EditText) view.findViewById(R.id.zfzyc_zqc_tj_gye);
        zfzyc_zqc_sb_gye = (EditText) view.findViewById(R.id.zfzyc_zqc_sb_gye);
        zfzyc_zyc_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_zyc_tj_gyy);
        zfzyc_zyc_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_zyc_sb_gyy);
        zfzyc_zyc_tj_gye = (EditText) view.findViewById(R.id.zfzyc_zyc_tj_gye);
        zfzyc_zyc_sb_gye = (EditText) view.findViewById(R.id.zfzyc_zyc_sb_gye);
        zfzyc_fzwjzmj_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_fzwjzmj_tj_gyy);
        zfzyc_fzwjzmj_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_fzwjzmj_sb_gyy);
        zfzyc_fzwjzmj_tj_gye = (EditText) view.findViewById(R.id.zfzyc_fzwjzmj_tj_gye);
        zfzyc_fzwjzmj_sb_gye = (EditText) view.findViewById(R.id.zfzyc_fzwjzmj_sb_gye);
        zfzyc_slkf_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_slkf_tj_gyy);
        zfzyc_slkf_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_slkf_sb_gyy);
        zfzyc_slkf_tj_gye = (EditText) view.findViewById(R.id.zfzyc_slkf_tj_gye);
        zfzyc_slkf_sb_gye = (EditText) view.findViewById(R.id.zfzyc_slkf_sb_gye);
        zfzyc_bgdqtjz_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_bgdqtjz_tj_gyy);
        zfzyc_bgdqtjz_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_bgdqtjz_sb_gyy);
        zfzyc_bgdqtjz_tj_gye = (EditText) view.findViewById(R.id.zfzyc_bgdqtjz_tj_gye);
        zfzyc_bgdqtjz_sb_gye = (EditText) view.findViewById(R.id.zfzyc_bgdqtjz_sb_gye);
        zfzyc_xj_tj_gyy = (EditText) view.findViewById(R.id.zfzyc_xj_tj_gyy);
        zfzyc_xj_sb_gyy = (EditText) view.findViewById(R.id.zfzyc_xj_sb_gyy);
        zfzyc_xj_tj_gye = (EditText) view.findViewById(R.id.zfzyc_xj_tj_gye);
        zfzyc_xj_sb_gye = (EditText) view.findViewById(R.id.zfzyc_xj_sb_gye);
        zfzyc_hj_gyy = (EditText) view.findViewById(R.id.zfzyc_hj_gyy);
        zfzyc_hj_gye = (EditText) view.findViewById(R.id.zfzyc_hj_gye);
        dnzzfzccz_hbmzs_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_hbmzs_tj_gyy);
        dnzzfzccz_hbmzs_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_hbmzs_sb_gyy);
        dnzzfzccz_hbmzs_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_hbmzs_tj_gye);
        dnzzfzccz_hbmzs_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_hbmzs_sb_gye);
        dnzzfzccz_pzrjmzs_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_pzrjmzs_tj_gyy);
        dnzzfzccz_pzrjmzs_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_pzrjmzs_sb_gyy);
        dnzzfzccz_pzrjmzs_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_pzrjmzs_tj_gye);
        dnzzfzccz_pzrjmzs_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_pzrjmzs_sb_gye);
        dnzzfzccz_rcmzs_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_rcmzs_tj_gyy);
        dnzzfzccz_rcmzs_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_rcmzs_sb_gyy);
        dnzzfzccz_rcmzs_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_rcmzs_tj_gye);
        dnzzfzccz_rcmzs_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_rcmzs_sb_gye);
        dnzzfzccz_fws_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_fws_tj_gyy);
        dnzzfzccz_fws_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_fws_sb_gyy);
        dnzzfzccz_fws_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_fws_tj_gye);
        dnzzfzccz_fws_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_fws_sb_gye);
        dnzzfzccz_bzgls_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_bzgls_tj_gyy);
        dnzzfzccz_bzgls_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_bzgls_sb_gyy);
        dnzzfzccz_bzgls_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_bzgls_tj_gye);
        dnzzfzccz_bzgls_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_bzgls_sb_gye);
        dnzzfzccz_yzgls_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_yzgls_tj_gyy);
        dnzzfzccz_yzgls_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_yzgls_sb_gyy);
        dnzzfzccz_yzgls_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_yzgls_tj_gye);
        dnzzfzccz_yzgls_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_yzgls_sb_gye);
        dnzzfzccz_zqc_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_zqc_tj_gyy);
        dnzzfzccz_zqc_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_zqc_sb_gyy);
        dnzzfzccz_zqc_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_zqc_tj_gye);
        dnzzfzccz_zqc_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_zqc_sb_gye);
        dnzzfzccz_zyc_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_zyc_tj_gyy);
        dnzzfzccz_zyc_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_zyc_sb_gyy);
        dnzzfzccz_zyc_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_zyc_tj_gye);
        dnzzfzccz_zyc_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_zyc_sb_gye);
        dnzzfzccz_fwzjzmj_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_fwzjzmj_tj_gyy);
        dnzzfzccz_fwzjzmj_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_fwzjzmj_sb_gyy);
        dnzzfzccz_fwzjzmj_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_fwzjzmj_tj_gye);
        dnzzfzccz_fwzjzmj_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_fwzjzmj_sb_gye);
        dnzzfzccz_slkf_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_slkf_tj_gyy);
        dnzzfzccz_slkf_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_slkf_sb_gyy);
        dnzzfzccz_slkf_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_slkf_tj_gye);
        dnzzfzccz_slkf_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_slkf_sb_gye);
        dnzzfzccz_bgdqtjz_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_bgdqtjz_tj_gyy);
        dnzzfzccz_bgdqtjz_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_bgdqtjz_sb_gyy);
        dnzzfzccz_bgdqtjz_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_bgdqtjz_tj_gye);
        dnzzfzccz_bgdqtjz_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_bgdqtjz_sb_gye);
        dnzzfzccz_xj_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_xj_tj_gyy);
        dnzzfzccz_xj_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_xj_sb_gyy);
        dnzzfzccz_xj_tj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_xj_tj_gye);
        dnzzfzccz_xj_sb_gye = (EditText) view.findViewById(R.id.dnzzfzccz_xj_sb_gye);
        dnzzfzccz_hj_gyy = (EditText) view.findViewById(R.id.dnzzfzccz_hj_gyy);
        dnzzfzccz_hj_gye = (EditText) view.findViewById(R.id.dnzzfzccz_hj_gye);
        dnzzfzcby_hbmzs_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_hbmzs_tj_gyy);
        dnzzfzcby_hbmzs_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_hbmzs_sb_gyy);
        dnzzfzcby_hbmzs_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_hbmzs_tj_gye);
        dnzzfzcby_hbmzs_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_hbmzs_sb_gye);
        dnzzfzcby_pzrjmzs_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_pzrjmzs_tj_gyy);
        dnzzfzcby_pzrjmzs_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_pzrjmzs_sb_gyy);
        dnzzfzcby_pzrjmzs_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_pzrjmzs_tj_gye);
        dnzzfzcby_pzrjmzs_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_pzrjmzs_sb_gye);
        dnzzfzcby_rcmzs_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_rcmzs_tj_gyy);
        dnzzfzcby_rcmzs_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_rcmzs_sb_gyy);
        dnzzfzcby_rcmzs_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_rcmzs_tj_gye);
        dnzzfzcby_rcmzs_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_rcmzs_sb_gye);
        dnzzfzcby_fws_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_fws_tj_gyy);
        dnzzfzcby_fws_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_fws_sb_gyy);
        dnzzfzcby_fws_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_fws_tj_gye);
        dnzzfzcby_fws_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_fws_sb_gye);
        dnzzfzcby_byq_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_byq_tj_gyy);
        dnzzfzcby_byq_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_byq_sb_gyy);
        dnzzfzcby_byq_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_byq_tj_gye);
        dnzzfzcby_byq_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_byq_sb_gye);
        dnzzfzcby_bzgls_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_bzgls_tj_gyy);
        dnzzfzcby_bzgls_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_bzgls_sb_gyy);
        dnzzfzcby_bzgls_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_bzgls_tj_gye);
        dnzzfzcby_bzgls_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_bzgls_sb_gye);
        dnzzfzcby_yzgls_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_yzgls_tj_gyy);
        dnzzfzcby_yzgls_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_yzgls_sb_gyy);
        dnzzfzcby_yzgls_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_yzgls_tj_gye);
        dnzzfzcby_yzgls_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_yzgls_sb_gye);
        dnzzfzcby_zqc_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_zqc_tj_gyy);
        dnzzfzcby_zqc_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_zqc_sb_gyy);
        dnzzfzcby_zqc_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_zqc_tj_gye);
        dnzzfzcby_zqc_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_zqc_sb_gye);
        dnzzfzcby_zyc_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_zyc_tj_gyy);
        dnzzfzcby_zyc_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_zyc_sb_gyy);
        dnzzfzcby_zyc_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_zyc_tj_gye);
        dnzzfzcby_zyc_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_zyc_sb_gye);
        dnzzfzcby_fzwjzmj_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_fzwjzmj_tj_gyy);
        dnzzfzcby_fzwjzmj_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_fzwjzmj_sb_gyy);
        dnzzfzcby_fzwjzmj_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_fzwjzmj_tj_gye);
        dnzzfzcby_fzwjzmj_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_fzwjzmj_sb_gye);
        dnzzfzcby_slkf_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_slkf_tj_gyy);
        dnzzfzcby_slkf_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_slkf_sb_gyy);
        dnzzfzcby_slkf_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_slkf_tj_gye);
        dnzzfzcby_slkf_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_slkf_sb_gye);
        dnzzfzcby_bgdqtjz_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_bgdqtjz_tj_gyy);
        dnzzfzcby_bgdqtjz_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_bgdqtjz_sb_gyy);
        dnzzfzcby_bgdqtjz_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_bgdqtjz_tj_gye);
        dnzzfzcby_bgdqtjz_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_bgdqtjz_sb_gye);
        dnzzfzcby_xj_tj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_xj_tj_gyy);
        dnzzfzcby_xj_sb_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_xj_sb_gyy);
        dnzzfzcby_xj_tj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_xj_tj_gye);
        dnzzfzcby_xj_sb_gye = (EditText) view.findViewById(R.id.dnzzfzcby_xj_sb_gye);
        dnzzfzcby_hj_gyy = (EditText) view.findViewById(R.id.dnzzfzcby_hj_gyy);
        dnzzfzcby_hj_gye = (EditText) view.findViewById(R.id.dnzzfzcby_hj_gye);
    }
}
