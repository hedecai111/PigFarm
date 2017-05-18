package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.LogUtil;
import com.cd.pigfarm.util.SpUtil;
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 14:59
 * @Description: 供水量与饮水产污量界面
 */
public class GslyyscwlFragment extends BaseFragment {

    @NotEmpty
    private EditText zfzyc_gsl;
    private EditText zfzyc_ysl;
    private EditText zfzyc_f;
    private EditText zfzyc_l;
    private EditText zfzyc_cqcqfl;
    private Spinner zfzyc_gqfbl;
    private EditText zfzyc_gqfzqcrl;
    private EditText zfzyc_zyc;
    private EditText zzfzc_gsl;
    private EditText zzfzc_ysl;
    private EditText zzfzc_f;
    private EditText zzfzc_l;
    private EditText zzfzc_zqcqfl;
    private Spinner zzfzc_gqfbl;
    private EditText zzfzc_gqfzqcrl;
    private EditText zzfzc_zyc;
    private EditText dnzzfzc_gsl;
    private EditText dnzzfzc_ysl;
    private EditText dnzzfzc_f;
    private EditText dnzzfzc_l;
    private EditText dnzzfzc_zqcqfl;
    private Spinner dnzzfzc_gqfbl;
    private EditText dnzzfzc_gqfzqcrl;
    private EditText dnzzfzc_zyc;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_gslyyscwl, null);
        bindViews();
        bindButton();
        return view;
    }


    private void bindViews() {

        zfzyc_gsl = (EditText) view.findViewById(R.id.zfzyc_gsl);
        zfzyc_ysl = (EditText) view.findViewById(R.id.zfzyc_ysl);
        zfzyc_f = (EditText) view.findViewById(R.id.zfzyc_f);
        zfzyc_l = (EditText) view.findViewById(R.id.zfzyc_l);
        zfzyc_cqcqfl = (EditText) view.findViewById(R.id.zfzyc_cqcqfl);
        zfzyc_gqfbl = (Spinner) view.findViewById(R.id.zfzyc_gqfbl);
        zfzyc_gqfbl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    Constant.zfzyc_gqfbl = 0.2;
                } else if (position == 1) {
                    Constant.zfzyc_gqfbl = 0.3;
                } else if (position == 2) {
                    Constant.zfzyc_gqfbl = 0.4;
                }
                else if (position == 3) {
                    Constant.zfzyc_gqfbl = 0.5;
                } else if (position == 4) {
                    Constant.zfzyc_gqfbl = 0.6;
                }
                else if (position == 5) {
                    Constant.zfzyc_gqfbl = 0.7;
                } else if (position == 6) {
                    Constant.zfzyc_gqfbl = 0.8;
                }
                else if (position == 7) {
                    Constant.zfzyc_gqfbl = 0.9;
                }
                SpUtil.saveSP(getContext(), "zfzyc_gqfbl", Constant.zfzyc_gqfbl);
                jsDatas();
                refreshViews();

              //  Toast.makeText(getContext(),position+"---"+Constant.zfzyc_gqfbl,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        zfzyc_gqfzqcrl = (EditText) view.findViewById(R.id.zfzyc_gqfzqcrl);
        zfzyc_zyc = (EditText) view.findViewById(R.id.zfzyc_zyc);
        zzfzc_gsl = (EditText) view.findViewById(R.id.zzfzc_gsl);
        zzfzc_ysl = (EditText) view.findViewById(R.id.zzfzc_ysl);
        zzfzc_f = (EditText) view.findViewById(R.id.zzfzc_f);
        zzfzc_l = (EditText) view.findViewById(R.id.zzfzc_l);
        zzfzc_zqcqfl = (EditText) view.findViewById(R.id.zzfzc_zqcqfl);
        zzfzc_gqfbl = (Spinner) view.findViewById(R.id.zzfzc_gqfbl);
        zzfzc_gqfbl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Constant.zzfzc_gqfbl = 0.2;
                } else if (position == 1) {
                    Constant.zzfzc_gqfbl = 0.3;
                } else if (position == 2) {
                    Constant.zzfzc_gqfbl = 0.4;
                }
                else if (position == 3) {
                    Constant.zzfzc_gqfbl = 0.5;
                } else if (position == 4) {
                    Constant.zzfzc_gqfbl = 0.6;
                }
                else if (position == 5) {
                    Constant.zzfzc_gqfbl = 0.7;
                } else if (position == 6) {
                    Constant.zzfzc_gqfbl = 0.8;
                }
                else if (position == 7) {
                    Constant.zzfzc_gqfbl = 0.9;
                }
                SpUtil.saveSP(getContext(), "zzfzc_gqfbl", Constant.zzfzc_gqfbl);
                jsDatas();
                refreshViews();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        zzfzc_gqfzqcrl = (EditText) view.findViewById(R.id.zzfzc_gqfzqcrl);
        zzfzc_zyc = (EditText) view.findViewById(R.id.zzfzc_zyc);
        dnzzfzc_gsl = (EditText) view.findViewById(R.id.dnzzfzc_gsl);
        dnzzfzc_ysl = (EditText) view.findViewById(R.id.dnzzfzc_ysl);
        dnzzfzc_f = (EditText) view.findViewById(R.id.dnzzfzc_f);
        dnzzfzc_l = (EditText) view.findViewById(R.id.dnzzfzc_l);
        dnzzfzc_zqcqfl = (EditText) view.findViewById(R.id.dnzzfzc_zqcqfl);
        dnzzfzc_gqfbl = (Spinner) view.findViewById(R.id.dnzzfzc_gqfbl);
        dnzzfzc_gqfbl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Constant.dnzzfzc_gqfbl = 0.2;
                } else if (position == 1) {
                    Constant.dnzzfzc_gqfbl = 0.3;
                } else if (position == 2) {
                    Constant.dnzzfzc_gqfbl = 0.4;
                }
                else if (position == 3) {
                    Constant.dnzzfzc_gqfbl = 0.5;
                } else if (position == 4) {
                    Constant.dnzzfzc_gqfbl = 0.6;
                }
                else if (position == 5) {
                    Constant.dnzzfzc_gqfbl = 0.7;
                } else if (position == 6) {
                    Constant.dnzzfzc_gqfbl = 0.8;
                }
                else if (position == 7) {
                    Constant.dnzzfzc_gqfbl = 0.9;
                }
                SpUtil.saveSP(getContext(), "dnzzfzc_gqfbl", Constant.dnzzfzc_gqfbl);
                jsDatas();
                refreshViews();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        dnzzfzc_gqfzqcrl = (EditText) view.findViewById(R.id.dnzzfzc_gqfzqcrl);
        dnzzfzc_zyc = (EditText) view.findViewById(R.id.dnzzfzc_zyc);
    }

    @Override
    public void jsDatas() {
        try {


            //自繁自养场
            Constant.zfzyc_gsl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.zzgs_qnjcngz + Constant.zfzyc_hbmz_gye * Constant.zzgs_hbmz +
                    Constant.zfzyc_pzrcmz_gye * Constant.zzgs_pzrjmz + Constant.zfzyc_rcmz_gye * Constant.zzgs_rcmz + Constant.zfzyc_przz_gye * Constant.zzgs_przz +
                    Constant.zfzyc_byzz_gye * Constant.zzgs_byzz + Constant.zfzyc_szyfz_gye * Constant.zzgs_szyfz) / 1000, 0);

            Constant.zfzyc_ysl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.zzys_qnjcngz_zd + Constant.zfzyc_hbmz_gye * Constant.zzys_hbmz_zd +
                    Constant.zfzyc_pzrcmz_gye * Constant.zzys_pzrjmz_zd + Constant.zfzyc_rcmz_gye * Constant.zzys_rcmz_zd + Constant.zfzyc_przz_gye * Constant.zzys_przz_zd +
                    Constant.zfzyc_byzz_gye * Constant.zzys_byzz_zd + Constant.zfzyc_szyfz_gye * Constant.zzys_szyfz_zd) / 1000, 0);

            Constant.zfzyc_f = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_f_xf + Constant.zfzyc_hbmz_gye * Constant.hbmz_f_xf +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_f_xf + Constant.zfzyc_rcmz_gye * Constant.rcmz_f_xf +
                    Constant.zfzyc_prmz_gye * Constant.przz_f_xf + Constant.zfzyc_byzz_gye * Constant.byzz_f_xf + Constant.zfzyc_szyfz_gye * Constant.szyfz_f_xf, 0);

            Constant.zfzyc_l = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_l_l + Constant.zfzyc_hbmz_gye * Constant.hbmz_l_l +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_l_l + Constant.zfzyc_rcmz_gye * Constant.rcmz_l_l +
                    Constant.zfzyc_prmz_gye * Constant.prmz_l_l + Constant.zfzyc_byzz_gye * Constant.byzz_l_l + Constant.zfzyc_szyfz_gye * Constant.szyfz_l_l, 0);

            Constant.zfzyc_cqcqfl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_gwz + Constant.zfzyc_hbmz_gye * Constant.hbmz_gwz + Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_gwz +
                    Constant.zfzyc_rcmz_gye * Constant.rcmz_gwz + Constant.zfzyc_prmz_gye * Constant.prmz_gwz + Constant.zfzyc_byzz_gye * Constant.byzz_gwz +
                    Constant.zfzyc_szyfz_gye * Constant.szyfz_gwz)*Constant.gwzcql/Constant.zqccrcql, 0);
           // Constant.zfzyc_gqfbl = 0.7;

            Constant.zfzyc_gqfzqcrl = Utils.keep2Wdouble(Constant.zfzyc_cqcqfl * (1 - Constant.zfzyc_gqfbl), 0);

            Constant.zfzyc_zyc = Utils.keep2Wdouble(Constant.zfzyc_gsl * 31 * 3, 0);

            //崽猪繁殖场
            Constant.zzfzc_gsl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.zzys_qnjcngz_zd + Constant.zfzyc_hbmz_gye * Constant.zzys_hbmz_zd + Constant.zfzyc_pzrcmz_gye * Constant.zzys_pzrjmz_zd +
                    Constant.zfzyc_rcmz_gye * Constant.zzys_rcmz_zd + Constant.zfzyc_przz_gye * Constant.zzys_przz_zd + Constant.zfzyc_byzz_gye * Constant.zzys_byzz_zd) / 1000, 0);


            Constant.zzfzc_ysl = Utils.keep2Wdouble((Constant.zzfzc_by_gzslzrjp_gye * Constant.zzys_qnjcngz_zd + Constant.zzfzc_by_hbmz_gye * Constant.zzys_hbmz_zd + Constant.zzfzc_by_pzrjmz_gye * Constant.zzys_pzrjmz_zd +
                    Constant.zzfzc_by_rcmz_gye * Constant.zzys_rcmz_zd + Constant.zzfzc_by_prmz_gye * Constant.zzys_prmz_zd
                    + Constant.zzfzc_by_przz_gye * Constant.zzys_przz_zd+ Constant.zzfzc_by_byzz_gye * Constant.zzys_byzz_zd) / 1000, 0);
            Constant.zzfzc_f = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_f_xf + Constant.zfzyc_hbmz_gye * Constant.hbmz_f_xf +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_f_xf + Constant.zfzyc_rcmz_gye * Constant.rcmz_f_xf +
                    Constant.zfzyc_prmz_gye * Constant.przz_f_xf+ Constant.zfzyc_byzz_gye * Constant.byzz_f_xf, 0);

            Constant.zzfzc_l = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_l_l + Constant.zfzyc_hbmz_gye * Constant.hbmz_l_l +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_l_l + Constant.zfzyc_rcmz_gye * Constant.rcmz_l_l +
                    Constant.zfzyc_prmz_gye * Constant.prmz_l_l + Constant.zfzyc_byzz_gye * Constant.byzz_l_l, 0);

            Constant.zzfzc_zqcqfl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_gwz + Constant.zfzyc_hbmz_gye * Constant.hbmz_gwz + Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_gwz +
                    Constant.zfzyc_rcmz_gye * Constant.rcmz_gwz + Constant.zfzyc_prmz_gye * Constant.prmz_gwz+ Constant.zfzyc_byzz_gye * Constant.byzz_gwz )*Constant.gwzcql/Constant.zqccrcql, 0);

            //Constant.zzfzc_gqfbl = 0.7;

            Constant.zzfzc_gqfzqcrl = Utils.keep2Wdouble(Constant.zzfzc_zqcqfl * (1 - Constant.zzfzc_gqfbl), 0);

            Constant.zzfzc_zyc = Utils.keep2Wdouble(Constant.zzfzc_gsl * 31 * 3, 0);

            //断奶仔猪繁殖场
            Constant.dnzzfzc_gsl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.zzys_qnjcngz_zd + Constant.zfzyc_hbmz_gye * Constant.zzys_hbmz_zd + Constant.zfzyc_pzrcmz_gye * Constant.zzys_pzrjmz_zd +
                    Constant.zfzyc_rcmz_gye * Constant.zzys_rcmz_zd + Constant.zfzyc_przz_gye * Constant.zzys_przz_zd) / 1000, 0);

            Constant.dnzzfzc_ysl = Utils.keep2Wdouble(Constant.zzfzc_ysl - (Constant.zzfzc_by_byzz_gye * Constant.zzys_byzz_zd) / 1000, 0);
            Constant.dnzzfzc_f = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_f_xf + Constant.zfzyc_hbmz_gye * Constant.hbmz_f_xf +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_f_xf + Constant.zfzyc_rcmz_gye * Constant.rcmz_f_xf +
                    Constant.zfzyc_prmz_gye * Constant.przz_f_xf, 0);

            Constant.dnzzfzc_l = Utils.keep2Wdouble(Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_l_l + Constant.zfzyc_hbmz_gye * Constant.hbmz_l_l +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_l_l + Constant.zfzyc_rcmz_gye * Constant.rcmz_l_l +
                    Constant.zfzyc_prmz_gye * Constant.prmz_l_l, 0);

            Constant.dnzzfzc_zqcqfl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_gwz + Constant.zfzyc_hbmz_gye * Constant.hbmz_gwz + Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_gwz +
                    Constant.zfzyc_rcmz_gye * Constant.rcmz_gwz + Constant.zfzyc_prmz_gye * Constant.prmz_gwz )*Constant.gwzcql/Constant.zqccrcql, 0);

           // Constant.dnzzfzc_gqfbl = 0.7;

            Constant.dnzzfzc_gqfzqcrl = Utils.keep2Wdouble(Constant.dnzzfzc_zqcqfl * (1 - Constant.dnzzfzc_gqfbl), 0);

            Constant.dnzzfzc_zyc = Utils.keep2Wdouble(Constant.dnzzfzc_gsl * 31 * 3, 0);
        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }

    }

    @Override
    public void refreshViews() {
        if (Constant.zfzyc_gsl == 0){
            Toast.makeText(getContext(),"请先设置基本参数和猪只饮水参数",Toast.LENGTH_LONG).show();
            return;
        }
        if (Constant.zfzyc_f == 0){
            Toast.makeText(getContext(),"请先设置粪尿产量",Toast.LENGTH_LONG).show();
        }
        //自繁自养场
        zfzyc_gsl.setText(Constant.zfzyc_gsl + "");

        zfzyc_ysl.setText(Constant.zfzyc_ysl + "");

        zfzyc_f.setText(Constant.zfzyc_f + "");

        zfzyc_l.setText(Constant.zfzyc_l + "");

        zfzyc_cqcqfl.setText(Constant.zfzyc_cqcqfl + "");

        //zfzyc_gqfbl.setText(Constant.zfzyc_gqfbl * 100 + "%");
        if (Constant.zfzyc_gqfbl == 0.2){
            zfzyc_gqfbl.setSelection(0);
        }else if (Constant.zfzyc_gqfbl == 0.3){
            zfzyc_gqfbl.setSelection(1);
        }else if (Constant.zfzyc_gqfbl == 0.4){
            zfzyc_gqfbl.setSelection(2);
        }else if (Constant.zfzyc_gqfbl == 0.5){
            zfzyc_gqfbl.setSelection(3);
        }else if (Constant.zfzyc_gqfbl == 0.6){
            zfzyc_gqfbl.setSelection(4);
        }else if (Constant.zfzyc_gqfbl == 0.7){
            zfzyc_gqfbl.setSelection(5);
        }else if (Constant.zfzyc_gqfbl == 0.8){
            zfzyc_gqfbl.setSelection(6);
        }else if (Constant.zfzyc_gqfbl == 0.9){
            zfzyc_gqfbl.setSelection(7);
        }



        zfzyc_gqfzqcrl.setText(Constant.zfzyc_gqfzqcrl + "");

        zfzyc_zyc.setText(Constant.zfzyc_zyc + "");

        //崽猪繁殖场
        zzfzc_gsl.setText(Constant.zzfzc_gsl + "");

        zzfzc_ysl.setText(Constant.zzfzc_ysl + "");

        zzfzc_f.setText(Constant.zzfzc_f + "");

        zzfzc_l.setText(Constant.zzfzc_l + "");

        zzfzc_zqcqfl.setText(Constant.zzfzc_zqcqfl + "");

       // zzfzc_gqfbl.setText(Constant.zzfzc_gqfbl * 100 + "%");
        if (Constant.zzfzc_gqfbl == 0.2){
            zzfzc_gqfbl.setSelection(0);
        }else if (Constant.zzfzc_gqfbl == 0.3){
            zzfzc_gqfbl.setSelection(1);
        }else if (Constant.zzfzc_gqfbl == 0.4){
            zzfzc_gqfbl.setSelection(2);
        }else if (Constant.zzfzc_gqfbl == 0.5){
            zzfzc_gqfbl.setSelection(3);
        }else if (Constant.zzfzc_gqfbl == 0.6){
            zzfzc_gqfbl.setSelection(4);
        }else if (Constant.zzfzc_gqfbl == 0.7){
            zzfzc_gqfbl.setSelection(5);
        }else if (Constant.zzfzc_gqfbl == 0.8){
            zzfzc_gqfbl.setSelection(6);
        }else if (Constant.zzfzc_gqfbl == 0.9){
            zzfzc_gqfbl.setSelection(7);
        }

        zzfzc_gqfzqcrl.setText(Constant.zzfzc_gqfzqcrl + "");

        zzfzc_zyc.setText(Constant.zzfzc_zyc + "");

        dnzzfzc_gsl.setText(Constant.dnzzfzc_gsl + "");

        dnzzfzc_ysl.setText(Constant.dnzzfzc_ysl + "");

        dnzzfzc_f.setText(Constant.dnzzfzc_f + "");

        dnzzfzc_l.setText(Constant.dnzzfzc_l + "");

        dnzzfzc_zqcqfl.setText(Constant.dnzzfzc_zqcqfl + "");

       // dnzzfzc_gqfbl.setText(Constant.dnzzfzc_gqfbl * 100 + "%");
        if (Constant.dnzzfzc_gqfbl == 0.2){
            dnzzfzc_gqfbl.setSelection(0);
        }else if (Constant.dnzzfzc_gqfbl == 0.3){
            dnzzfzc_gqfbl.setSelection(1);
        }else if (Constant.dnzzfzc_gqfbl == 0.4){
            dnzzfzc_gqfbl.setSelection(2);
        }else if (Constant.dnzzfzc_gqfbl == 0.5){
            dnzzfzc_gqfbl.setSelection(3);
        }else if (Constant.dnzzfzc_gqfbl == 0.6){
            dnzzfzc_gqfbl.setSelection(4);
        }else if (Constant.dnzzfzc_gqfbl == 0.7){
            dnzzfzc_gqfbl.setSelection(5);
        }else if (Constant.dnzzfzc_gqfbl == 0.8){
            dnzzfzc_gqfbl.setSelection(6);
        }else if (Constant.dnzzfzc_gqfbl == 0.9){
            dnzzfzc_gqfbl.setSelection(7);
        }
        dnzzfzc_gqfzqcrl.setText(Constant.dnzzfzc_gqfzqcrl + "");

        dnzzfzc_zyc.setText(Constant.dnzzfzc_zyc + "");
    }
}
