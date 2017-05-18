package com.cd.pigfarm.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
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
import com.mobsandgeeks.saripaar.annotation.Order;

import java.util.List;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/23 21:49
 * @Description: 基本参数设置
 */
public class JbcsFragment extends BaseFragment implements View.OnClickListener {

    @NotEmpty
    private EditText mDnzpzjg_Edi;
    @NotEmpty
    private EditText mRcjc_Edi;
    @NotEmpty
    private EditText mMzrczq_Edi;
    @NotEmpty
    private EditText mMzhpl_Edi;
    @NotEmpty
    private EditText mMzfwl_Edi;
    @NotEmpty
    private EditText mMzstfwl_Edi;
    @NotEmpty
    private EditText mDnrl_Edi;
    @NotEmpty
    private EditText mMzncws_Edi;
    @NotEmpty
    private EditText mByq_Edi;
    @NotEmpty
    private EditText mSzyfq_Edi;
    @NotEmpty
    private EditText mMzwczs_Edi;
    @NotEmpty
    private EditText mPrqchl_Edi;
    @NotEmpty
    private EditText mByqchl_Edi;
    @NotEmpty
    private EditText mSzbyqchl_Edi;
    @NotEmpty
    private EditText mNtgczzs_Edi;
    @NotEmpty
    private EditText mNtgspzs_Edi;
    @NotEmpty
    private EditText mNzzttl_Edi;
    @NotEmpty
    private EditText mZrjpbl_Edi;
    @NotEmpty
    private EditText mZrgsj_Edi;
    @NotEmpty
    private EditText mHbzpypc_Edi;

    private Spinner mFzjl_Spi;
    @NotEmpty
    private EditText mMzncts_edi;
    @NotEmpty
    private EditText mMzcpmzs_edi;
    @NotEmpty
    private EditText mMzrcmzs_edi;
    @NotEmpty
    private EditText mMzczmzs_edi;
    @NotEmpty
    private EditText mMzbyws_edi;
    @NotEmpty
    private EditText mMzyfws_edi;
    @NotEmpty
    private EditText mZlkzxdts_edi;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = View.inflate(getContext(), R.layout.fragment_jbcs, null);
        bindViews();
        bindButton();
        return view;
    }



    private void bindViews() {

        mDnzpzjg_Edi = (EditText) view.findViewById(R.id.dnzpzjg_Edi);
        mDnzpzjg_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.dnzpzjg != 0)
            mDnzpzjg_Edi.setText(Constant.dnzpzjg + "");

        mRcjc_Edi = (EditText) view.findViewById(R.id.rcjc_Edi);
        mRcjc_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.rcjc != 0)
            mRcjc_Edi.setText(Constant.rcjc + "");

        mMzrczq_Edi = (EditText) view.findViewById(R.id.mzrczq_Edi);
        mMzrczq_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzrcq != 0)
            mMzrczq_Edi.setText(Constant.mzrcq + "");

        mMzhpl_Edi = (EditText) view.findViewById(R.id.mzhpl_Edi);
        mMzhpl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzphl != 0)
            mMzhpl_Edi.setText(Constant.mzphl * 100 + "%");

        mMzfwl_Edi = (EditText) view.findViewById(R.id.mzfwl_Edi);
        mMzfwl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.rcmzfwl != 0)
            mMzfwl_Edi.setText(Constant.rcmzfwl * 100 + "%");

        mMzstfwl_Edi = (EditText) view.findViewById(R.id.mzstfwl_Edi);
        mMzstfwl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzstfwl != 0)
            mMzstfwl_Edi.setText(Constant.mzstfwl * 100 + "%");

        mDnrl_Edi = (EditText) view.findViewById(R.id.dnrl_Edi);
        mDnrl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.dnrl != 0)
            mDnrl_Edi.setText(Constant.dnrl + "");

        mMzncws_Edi = (EditText) view.findViewById(R.id.mzncws_Edi);
        mMzncws_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzncws != 0)
            mMzncws_Edi.setText(Constant.mzncws + "");

        mByq_Edi = (EditText) view.findViewById(R.id.byq_Edi);
        mByq_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.byq != 0)
            mByq_Edi.setText(Constant.byq + "");

        mSzyfq_Edi = (EditText) view.findViewById(R.id.szyfq_Edi);
        mSzyfq_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.szyfq != 0)
            mSzyfq_Edi.setText(Constant.szyfq + "");

        mMzwczs_Edi = (EditText) view.findViewById(R.id.mzwczs_Edi);
        mMzwczs_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzwchzs != 0)
            mMzwczs_Edi.setText(Constant.mzwchzs + "");

        mPrqchl_Edi = (EditText) view.findViewById(R.id.prqchl_Edi);
        mPrqchl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.prqchl != 0)
            mPrqchl_Edi.setText(Constant.prqchl * 100 + "%");

        mByqchl_Edi = (EditText) view.findViewById(R.id.byqchl_Edi);
        mByqchl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.byqchl != 0)
            mByqchl_Edi.setText(Constant.byqchl * 100 + "%");

        mSzbyqchl_Edi = (EditText) view.findViewById(R.id.szbyqchl_Edi);
        mSzbyqchl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.szyfqchl != 0)
            mSzbyqchl_Edi.setText(Constant.szyfqchl * 100 + "%");

        mNtgczzs_Edi = (EditText) view.findViewById(R.id.ntgczzs_Edi);
        mNtgczzs_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.ntgyczzs != 0)
            mNtgczzs_Edi.setText(Constant.ntgyczzs + "");

        mNtgspzs_Edi = (EditText) view.findViewById(R.id.ntgspzs_Edi);
        mNtgspzs_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.ntgspzs != 0)
            mNtgspzs_Edi.setText(Constant.ntgspzs + "");

        mNzzttl_Edi = (EditText) view.findViewById(R.id.nzzttl_Edi);
        mNzzttl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zznttgxl != 0)
            mNzzttl_Edi.setText(Constant.zznttgxl * 100 + "%");

        mZrjpbl_Edi = (EditText) view.findViewById(R.id.zrjpbl_Edi);
        mZrjpbl_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zrjpbl != 0)
            mZrjpbl_Edi.setText(Constant.zrjpbl + "");

        mZrgsj_Edi = (EditText) view.findViewById(R.id.zrgsj_Edi);
        mZrgsj_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zrgsj != 0)
            mZrgsj_Edi.setText(Constant.zrgsj + "");

        mHbzpypc_Edi = (EditText) view.findViewById(R.id.hbzpypc_Edi);
        mHbzpypc_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.hbzpypc != 0)
            mHbzpypc_Edi.setText(Constant.hbzpypc + "");


        mFzjl_Spi = (Spinner) view.findViewById(R.id.fzjl_Spi);
        mFzjl_Spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Constant.fyjl = 7;
                } else if (position == 1) {
                    Constant.fyjl = 14;
                } else if (position == 2) {
                    Constant.fyjl = 21;
                }
                SpUtil.saveSP(getContext(), "fyjl", Constant.fyjl);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mMzncts_edi = (EditText) view.findViewById(R.id.mzncts_edi);
        mMzncts_edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzncts != 0)
            mMzncts_edi.setText(Constant.mzncts + "");

        mMzcpmzs_edi = (EditText) view.findViewById(R.id.mzcpmzs_edi);
        mMzcpmzs_edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzcpmzs != 0)
            mMzcpmzs_edi.setText(Constant.mzcpmzs + "");

        mMzrcmzs_edi = (EditText) view.findViewById(R.id.mzrcmzs_edi);
        mMzrcmzs_edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzrcmzs != 0)
            mMzrcmzs_edi.setText(Constant.mzrcmzs + "");

        mMzczmzs_edi = (EditText) view.findViewById(R.id.mzczmzs_edi);
        mMzczmzs_edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzczmzs != 0)
            mMzczmzs_edi.setText(Constant.mzczmzs + "");

        mMzbyws_edi = (EditText) view.findViewById(R.id.mzbyws_edi);
        mMzbyws_edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzbyws != 0)
            mMzbyws_edi.setText(Constant.mzbyws + "");

        mMzyfws_edi = (EditText) view.findViewById(R.id.mzyfws_edi);
        mMzyfws_edi.setOnFocusChangeListener(focusListener);
        if (Constant.mzyfws != 0)
            mMzyfws_edi.setText(Constant.mzyfws + "");

        mZlkzxdts_edi = (EditText) view.findViewById(R.id.zlkzxdts_edi);
        mZlkzxdts_edi.setOnFocusChangeListener(focusListener);
        if (Constant.zlkzxdts != 0)
            mZlkzxdts_edi.setText(Constant.zlkzxdts + "");


    }

    @Override
    public void saveData(EditText view, String text) {
        if (text.endsWith("%")) {
            text = text.substring(0, text.length() - 1);
        }

        if (view == mDnzpzjg_Edi) {
            String dnzpzjg = text;
            Constant.dnzpzjg = Double.parseDouble(dnzpzjg);
            SpUtil.saveSP(getContext(), "dnzpzjg", Constant.dnzpzjg);
        }

        //妊辰检查
        if (view == mRcjc_Edi) {
            String rcjc = text;
            Constant.rcjc = Double.parseDouble(rcjc);
            SpUtil.saveSP(getContext(), "rcjc", Constant.rcjc);
        }

        //母猪壬辰期
        if (view == mMzrczq_Edi) {
            String mzrcq = text;
            Constant.mzrcq = Double.parseDouble(mzrcq);
            SpUtil.saveSP(getContext(), "mzrcq", Constant.mzrcq);
        }

        //母猪配怀率
        if (view == mMzhpl_Edi) {
            String mzphl = text;
            Constant.mzphl = Double.parseDouble(mzphl) / 100;
            SpUtil.saveSP(getContext(), "mzphl", Constant.mzphl);
            mMzhpl_Edi.setText(mzphl + "%");
        }

        if (view == mMzfwl_Edi) {
            //壬辰母猪分娩率
            String rcmzfwl = text;
            Constant.rcmzfwl = Double.parseDouble(rcmzfwl) / 100;
            SpUtil.saveSP(getContext(), "rcmzfwl", Constant.rcmzfwl);
            mMzfwl_Edi.setText(rcmzfwl + "%");
        }

        if (view == mDnrl_Edi) {
            //断奶日龄
            String dnrl = text;
            Constant.dnrl = Double.parseDouble(dnrl);
            SpUtil.saveSP(getContext(), "dnrl", Constant.dnrl);
        }

        if (view == mMzncws_Edi) {
            //母猪年产窝数
            String mzncws = text;
            Constant.mzncws = Utils.keep2Wdouble(Double.parseDouble(mzncws), 2);
            SpUtil.saveSP(getContext(), "mzncws", Constant.mzncws);
        }

        if (view == mByq_Edi) {
            //保育期
            String byq = text;
            Constant.byq = Double.parseDouble(byq);
            SpUtil.saveSP(getContext(), "byq", Constant.byq);
        }

        if (view == mSzyfq_Edi) {
            //生长育肥期
            String szyfq = text;
            Constant.szyfq = Double.parseDouble(szyfq);
            SpUtil.saveSP(getContext(), "szyfq", Constant.szyfq);
        }

        if (view == mMzwczs_Edi) {
            //母猪窝产活仔数（头）
            String mzwchzs = text;
            Constant.mzwchzs = Double.parseDouble(mzwchzs);
            SpUtil.saveSP(getContext(), "mzwchzs", Constant.mzwchzs);
        }

        if (view == mPrqchl_Edi) {
            //哺乳期存活率（％）
            String prqchl = text;
            Constant.prqchl = Double.parseDouble(prqchl) / 100;
            SpUtil.saveSP(getContext(), "prqchl", Constant.prqchl);
            mPrqchl_Edi.setText(prqchl + "%");
        }

        if (view == mByqchl_Edi) {
            //保育期存活率（％）
            String byqchl = text;
            Constant.byqchl = Double.parseDouble(byqchl) / 100;
            SpUtil.saveSP(getContext(), "byqchl", Constant.byqchl);
            mByqchl_Edi.setText(byqchl + "%");
        }

        if (view == mSzbyqchl_Edi) {
            //生长育肥期存活率（％）
            String szyfqchl = text;
            Constant.szyfqchl = Double.parseDouble(szyfqchl) / 100;
            SpUtil.saveSP(getContext(), "szyfqchl", Constant.szyfqchl);
            mSzbyqchl_Edi.setText(szyfqchl + "%");
        }

        if (view == mNtgczzs_Edi) {
            //年提供育成仔猪数（头）
            String ntgyczzs = text;
            Constant.ntgyczzs = Double.parseDouble(ntgyczzs);
            SpUtil.saveSP(getContext(), "ntgyczzs", Constant.ntgyczzs);
        }

        if (view == mNtgspzs_Edi) {
            //年提供商品猪数（头）
            String ntgspzs = text;
            Constant.ntgspzs = Double.parseDouble(ntgspzs);
            SpUtil.saveSP(getContext(), "ntgspzs", Constant.ntgspzs);
        }

        if (view == mNzzttl_Edi) {
            //种猪年淘汰更新率（％）
            String zznttgxl = text;
            Constant.zznttgxl = Double.parseDouble(zznttgxl) / 100;
            SpUtil.saveSP(getContext(), "zznttgxl", Constant.zznttgxl);
            mNzzttl_Edi.setText(zznttgxl + "%");
        }

        if (view == mHbzpypc_Edi) {
            //后备猪培育批次（次/年
            String hbzpypc = text;
            Constant.hbzpypc = Double.parseDouble(hbzpypc);
            SpUtil.saveSP(getContext(), "hbzpypc", Constant.hbzpypc);
        }
    }

    /**
     * 给那些是计算出来的EditText赋值
     */
    @Override
    public void jsDatas() {
        try {

            if (Constant.clmzz == 0){
                Toast.makeText(getContext(),"请先设置存栏母猪数",Toast.LENGTH_SHORT).show();
            }

            Constant.mzstfwl = Constant.mzphl * Constant.rcmzfwl;
           // SpUtil.saveSP(getContext(), "mzstfwl", Constant.mzstfwl);

            if (Constant.dnzpzjg != 0 && Constant.mzrcq != 0 && Constant.dnrl != 0) {
                Constant.mzncws = Utils.keep2Wdouble((365 / (Constant.dnzpzjg + Constant.mzrcq + Constant.dnrl) * Constant.mzstfwl), 2);
               // SpUtil.saveSP(getContext(), "mzncws", Constant.mzncws);
            }

            Constant.byq = 70 - Constant.dnrl;
            //SpUtil.saveSP(getContext(), "byq", Constant.byq);

            Constant.ntgyczzs = Utils.keep2Wdouble(Constant.mzncws * Constant.mzwchzs * Constant.prqchl * Constant.byqchl, 1);
           // SpUtil.saveSP(getContext(), "ntgyczzs", Constant.ntgyczzs);


            Constant.ntgspzs = Utils.keep2Wdouble(Constant.ntgyczzs * Constant.szyfqchl, 1);
            //SpUtil.saveSP(getContext(), "ntgspzs", Constant.ntgspzs);

            Constant.zrjpbl = Utils.keep2Wdouble(0.04, 2);
            //SpUtil.saveSP(getContext(), "zrjpbl", Constant.zrjpbl);
            Constant.zrgsj = Utils.keep2Wdouble(0.005, 3);
           // SpUtil.saveSP(getContext(), "zrgsj", Constant.zrgsj);

            //SpUtil.saveSP(getContext(), "zrjpbl", Constant.zrjpbl);
           // SpUtil.saveSP(getContext(), "zrgsj", Constant.zrgsj);

            Constant.mzncts = Utils.keep2Wdouble(Constant.mnts / 145, 1);
            //SpUtil.saveSP(getContext(), "mzncts", Constant.mzncts);

            Constant.mzcpmzs = Math.round(Constant.clmzz * Constant.mzncts / Constant.mnzs + Constant.mzrcmzs * (1 - Constant.mzphl) + Constant.mzczmzs * (1 - Constant.rcmzfwl));
            //SpUtil.saveSP(getContext(), "mzcpmzs", Constant.mzcpmzs);

            Constant.mzrcmzs = Math.round(Constant.clmzz * Constant.mzncts * Constant.mzphl / Constant.mnzs);
           // SpUtil.saveSP(getContext(), "mzrcmzs", Constant.mzrcmzs);
            // Toast.makeText(getContext(),Constant.clmzz+"--"+Constant.mzncws+"--"+Constant.mzphl+"--"+Constant.mnzs,Toast.LENGTH_SHORT).show();

            Constant.mzczmzs = Math.round(Constant.mzrcmzs * Constant.rcmzfwl);
           // SpUtil.saveSP(getContext(), "mzczmzs", Constant.mzczmzs);
           // Toast.makeText(getContext(),Constant.mzczmzs+"",Toast.LENGTH_LONG).show();
            Constant.mzbyws = Constant.mzczmzs;
            //SpUtil.saveSP(getContext(), "mzbyws", Constant.mzbyws);

            Constant.mzyfws = Constant.mzbyws;
            //SpUtil.saveSP(getContext(), "mzyfws", Constant.mzyfws);
        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        mMzstfwl_Edi.setText(Constant.mzstfwl * 100 + "%");

        mMzncws_Edi.setText(Constant.mzncws + "");

        mByq_Edi.setText(Constant.byq + "");

        mNtgczzs_Edi.setText(Constant.ntgyczzs + "");


        mNtgspzs_Edi.setText(Constant.ntgspzs + "");

        mZrjpbl_Edi.setText(Constant.zrjpbl + "");
        mZrgsj_Edi.setText(Constant.zrgsj + "");

        mZrjpbl_Edi.setText(Constant.zrjpbl + "");
        mZrgsj_Edi.setText(Constant.zrgsj + "");

        mMzncts_edi.setText(Constant.mzncts + "");

        mMzcpmzs_edi.setText(Constant.mzcpmzs + "");

        mMzrcmzs_edi.setText(Constant.mzrcmzs + "");
        // Toast.makeText(getContext(),Constant.clmzz+"--"+Constant.mzncws+"--"+Constant.mzphl+"--"+Constant.mnzs,Toast.LENGTH_SHORT).show();

        mMzczmzs_edi.setText(Constant.mzczmzs + "");

        mMzbyws_edi.setText(Constant.mzbyws + "");

        mMzyfws_edi.setText(Constant.mzyfws + "");
    }
}
