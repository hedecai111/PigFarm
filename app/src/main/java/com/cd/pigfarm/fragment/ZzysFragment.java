package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.SpUtil;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.List;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 14:59
 * @Description: 猪只饮水参数设置
 */
public class ZzysFragment extends BaseFragment {


    @NotEmpty
    private EditText zzys_qnjcngz_zx_Edi;
    @NotEmpty
    private EditText zzys_qnjcngz_zd_Edi;
    @NotEmpty
    private EditText zzgs_qnjcngz_Edi;
    @NotEmpty
    private EditText zzys_hbmz_zx_Edi;
    @NotEmpty
    private EditText zzys_hbmz_zd_Edi;
    @NotEmpty
    private EditText zzgs_hbmz_Edi;
    @NotEmpty
    private EditText zzys_pzrjz_zx_Edi;
    @NotEmpty
    private EditText zzys_pzrjz_zd_Edi;
    @NotEmpty
    private EditText zzgs_pzrjz_Edi;
    @NotEmpty
    private EditText zzys_rcmz_zx_Edi;
    @NotEmpty
    private EditText zzys_rcmz_zd_Edi;
    @NotEmpty
    private EditText zzgs_rcmz_Edi;
    @NotEmpty
    private EditText zzys_prmz_zx_Edi;
    @NotEmpty
    private EditText zzys_prmz_zd_Edi;
    @NotEmpty
    private EditText zzgs_prmz_Edi;
    @NotEmpty
    private EditText zzys_przz_zx_Edi;
    @NotEmpty
    private EditText zzys_przz_zd_Edi;
    @NotEmpty
    private EditText zzgs_przz_Edi;
    @NotEmpty
    private EditText zzys_byzz_zx_Edi;
    @NotEmpty
    private EditText zzys_byzz_zd_Edi;
    @NotEmpty
    private EditText zzgs_byzz_Edi;
    @NotEmpty
    private EditText zzys_szyfz_zx_Edi;
    @NotEmpty
    private EditText zzys_szyfz_zd_Edi;
    @NotEmpty
    private EditText zzgs_szyfz_Edi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zzys,null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {
        zzys_qnjcngz_zx_Edi = (EditText) view.findViewById(R.id.zzys_qnjcngz_zx_Edi);
        zzys_qnjcngz_zx_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_qnjcngz_zx != 0)
            zzys_qnjcngz_zx_Edi.setText(Constant.zzys_qnjcngz_zx+"");

        zzys_qnjcngz_zd_Edi = (EditText) view.findViewById(R.id.zzys_qnjcngz_zd_Edi);
        zzys_qnjcngz_zd_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_qnjcngz_zd != 0)
            zzys_qnjcngz_zd_Edi.setText(Constant.zzys_qnjcngz_zd+"");

        zzgs_qnjcngz_Edi = (EditText) view.findViewById(R.id.zzgs_qnjcngz_Edi);
        zzgs_qnjcngz_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzgs_qnjcngz != 0)
            zzgs_qnjcngz_Edi.setText(Constant.zzgs_qnjcngz+"");

        zzys_hbmz_zx_Edi = (EditText) view.findViewById(R.id.zzys_hbmz_zx_Edi);
        zzys_hbmz_zx_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_hbmz_zx != 0)
            zzys_hbmz_zx_Edi.setText(Constant.zzys_hbmz_zx+"");

        zzys_hbmz_zd_Edi = (EditText) view.findViewById(R.id.zzys_hbmz_zd_Edi);
        zzys_hbmz_zd_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_hbmz_zd != 0)
            zzys_hbmz_zd_Edi.setText(Constant.zzys_hbmz_zd+"");

        zzgs_hbmz_Edi = (EditText) view.findViewById(R.id.zzgs_hbmz_Edi);
        zzgs_hbmz_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzgs_hbmz != 0)
            zzgs_hbmz_Edi.setText(Constant.zzgs_hbmz+"");

        zzys_pzrjz_zx_Edi = (EditText) view.findViewById(R.id.zzys_pzrjz_zx_Edi);
        zzys_pzrjz_zx_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_pzrjmz_zx != 0)
            zzys_pzrjz_zx_Edi.setText(Constant.zzys_pzrjmz_zx+"");

        zzys_pzrjz_zd_Edi = (EditText) view.findViewById(R.id.zzys_pzrjz_zd_Edi);
        zzys_pzrjz_zd_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_pzrjmz_zd != 0)
            zzys_pzrjz_zd_Edi.setText(Constant.zzys_pzrjmz_zd+"");

        zzgs_pzrjz_Edi = (EditText) view.findViewById(R.id.zzgs_pzrjz_Edi);
        zzgs_pzrjz_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzgs_pzrjmz != 0)
            zzgs_pzrjz_Edi.setText(Constant.zzgs_pzrjmz+"");

        zzys_rcmz_zx_Edi = (EditText) view.findViewById(R.id.zzys_rcmz_zx_Edi);
        zzys_rcmz_zx_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_rcmz_zx != 0)
            zzys_rcmz_zx_Edi.setText(Constant.zzys_rcmz_zx+"");

        zzys_rcmz_zd_Edi = (EditText) view.findViewById(R.id.zzys_rcmz_zd_Edi);
        zzys_rcmz_zd_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_rcmz_zd != 0)
            zzys_rcmz_zd_Edi.setText(Constant.zzys_rcmz_zd+"");

        zzgs_rcmz_Edi = (EditText) view.findViewById(R.id.zzgs_rcmz_Edi);
        zzgs_rcmz_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzgs_rcmz != 0)
            zzgs_rcmz_Edi.setText(Constant.zzgs_rcmz+"");

        zzys_prmz_zx_Edi = (EditText) view.findViewById(R.id.zzys_prmz_zx_Edi);
        zzys_prmz_zx_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_prmz_zx != 0)
            zzys_prmz_zx_Edi.setText(Constant.zzys_prmz_zx+"");

        zzys_prmz_zd_Edi = (EditText) view.findViewById(R.id.zzys_prmz_zd_Edi);
        zzys_prmz_zd_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_prmz_zd != 0)
            zzys_prmz_zd_Edi.setText(Constant.zzys_prmz_zd+"");

        zzgs_prmz_Edi = (EditText) view.findViewById(R.id.zzgs_prmz_Edi);
        zzgs_prmz_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzgs_prmz != 0)
            zzgs_prmz_Edi.setText(Constant.zzgs_prmz+"");

        zzys_przz_zx_Edi = (EditText) view.findViewById(R.id.zzys_przz_zx_Edi);
        zzys_przz_zx_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_przz_zx != 0)
            zzys_przz_zx_Edi.setText(Constant.zzys_przz_zx+"");

        zzys_przz_zd_Edi = (EditText) view.findViewById(R.id.zzys_przz_zd_Edi);
        zzys_przz_zd_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_przz_zd != 0)
            zzys_przz_zd_Edi.setText(Constant.zzys_przz_zd+"");

        zzgs_przz_Edi = (EditText) view.findViewById(R.id.zzgs_przz_Edi);
        zzgs_przz_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzgs_przz != 0)
            zzgs_przz_Edi.setText(Constant.zzgs_przz+"");

        zzys_byzz_zx_Edi = (EditText) view.findViewById(R.id.zzys_byzz_zx_Edi);
        zzys_byzz_zx_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_byzz_zx != 0)
            zzys_byzz_zx_Edi.setText(Constant.zzys_byzz_zx+"");

        zzys_byzz_zd_Edi = (EditText) view.findViewById(R.id.zzys_byzz_zd_Edi);
        zzys_byzz_zd_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_byzz_zd != 0)
            zzys_byzz_zd_Edi.setText(Constant.zzys_byzz_zd+"");

        zzgs_byzz_Edi = (EditText) view.findViewById(R.id.zzgs_byzz_Edi);
        zzgs_byzz_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzgs_byzz != 0)
            zzgs_byzz_Edi.setText(Constant.zzgs_byzz+"");

        zzys_szyfz_zx_Edi = (EditText) view.findViewById(R.id.zzys_szyfz_zx_Edi);
        zzys_szyfz_zx_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_szyfz_zx != 0)
            zzys_szyfz_zx_Edi.setText(Constant.zzys_szyfz_zx+"");

        zzys_szyfz_zd_Edi = (EditText) view.findViewById(R.id.zzys_szyfz_zd_Edi);
        zzys_szyfz_zd_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzys_szyfz_zd != 0)
            zzys_szyfz_zd_Edi.setText(Constant.zzys_szyfz_zd+"");

        zzgs_szyfz_Edi = (EditText) view.findViewById(R.id.zzgs_szyfz_Edi);
        zzgs_szyfz_Edi.setOnFocusChangeListener(focusListener);
        if (Constant.zzgs_szyfz != 0)
            zzgs_szyfz_Edi.setText(Constant.zzgs_szyfz+"");


    }

    /**
     * 保存数据
     */
    @Override
    public void saveData(EditText view,String text){
        double  textdouble = Double.parseDouble(text);
        if (view == zzys_qnjcngz_zx_Edi){
            Constant.zzys_qnjcngz_zx = textdouble;
            SpUtil.saveSP(getContext(),"zzys_qnjcngz_zx",Constant.zzys_qnjcngz_zx);
        }else if (view == zzys_qnjcngz_zd_Edi){
            Constant.zzys_qnjcngz_zd = textdouble;
            SpUtil.saveSP(getContext(),"zzys_qnjcngz_zd",Constant.zzys_qnjcngz_zd);
        }else if (view == zzgs_qnjcngz_Edi){
            Constant.zzgs_qnjcngz = textdouble;
            SpUtil.saveSP(getContext(),"zzgs_qnjcngz",Constant.zzgs_qnjcngz);
        }else if (view == zzys_hbmz_zx_Edi){
            Constant.zzys_hbmz_zx = textdouble;
            SpUtil.saveSP(getContext(),"zzys_hbmz_zx",Constant.zzys_hbmz_zx);
        }else if (view == zzys_hbmz_zd_Edi){
            Constant.zzys_hbmz_zd = textdouble;
            SpUtil.saveSP(getContext(),"zzys_hbmz_zd",Constant.zzys_hbmz_zd);
        } else if (view == zzgs_hbmz_Edi){
            Constant.zzgs_hbmz = textdouble;
            SpUtil.saveSP(getContext(),"zzgs_hbmz",Constant.zzgs_hbmz);
        } else if (view == zzys_pzrjz_zx_Edi){
            Constant.zzys_pzrjmz_zx = textdouble;
            SpUtil.saveSP(getContext(),"zzys_pzrjmz_zx",Constant.zzys_pzrjmz_zx);
        } else if (view == zzys_pzrjz_zd_Edi){
            Constant.zzys_pzrjmz_zd = textdouble;
            SpUtil.saveSP(getContext(),"zzys_pzrjmz_zd",Constant.zzys_pzrjmz_zd);
        }else if (view == zzgs_pzrjz_Edi){
            Constant.zzgs_pzrjmz = textdouble;
            SpUtil.saveSP(getContext(),"zzgs_pzrjmz",Constant.zzgs_pzrjmz);
        }else if (view == zzys_rcmz_zx_Edi){
            Constant.zzys_rcmz_zx = textdouble;
            SpUtil.saveSP(getContext(),"zzys_rcmz_zx",Constant.zzys_rcmz_zx);
        } else if (view == zzys_rcmz_zd_Edi){
            Constant.zzys_rcmz_zd = textdouble;
            SpUtil.saveSP(getContext(),"zzys_rcmz_zd",Constant.zzys_rcmz_zd);
        } else if (view == zzgs_rcmz_Edi){
            Constant.zzgs_rcmz = textdouble;
            SpUtil.saveSP(getContext(),"zzgs_rcmz",Constant.zzgs_rcmz);
        }else if (view == zzys_prmz_zx_Edi){
            Constant.zzys_prmz_zx = textdouble;
            SpUtil.saveSP(getContext(),"zzys_prmz_zx",Constant.zzys_prmz_zx);
        }else if (view == zzys_prmz_zd_Edi){
            Constant.zzys_prmz_zd = textdouble;
            SpUtil.saveSP(getContext(),"zzys_prmz_zd",Constant.zzys_prmz_zd);
        } else if (view == zzgs_prmz_Edi){
            Constant.zzgs_prmz = textdouble;
            SpUtil.saveSP(getContext(),"zzgs_prmz",Constant.zzgs_prmz);
        } else if (view == zzys_przz_zx_Edi){
            Constant.zzys_przz_zx = textdouble;
            SpUtil.saveSP(getContext(),"zzys_przz_zx",Constant.zzys_przz_zx);
        } else if (view == zzys_przz_zd_Edi){
            Constant.zzys_przz_zd = textdouble;
            SpUtil.saveSP(getContext(),"zzys_przz_zd",Constant.zzys_przz_zd);
        } else if (view == zzgs_przz_Edi){
            Constant.zzgs_przz = textdouble;
            SpUtil.saveSP(getContext(),"zzgs_przz",Constant.zzgs_przz);
        } else if (view == zzys_byzz_zx_Edi){
            Constant.zzys_byzz_zx = textdouble;
            SpUtil.saveSP(getContext(),"zzys_byzz_zx",Constant.zzys_byzz_zx);
        } else if (view == zzys_byzz_zd_Edi){
            Constant.zzys_byzz_zd = textdouble;
            SpUtil.saveSP(getContext(),"zzys_byzz_zd",Constant.zzys_byzz_zd);
        } else if (view == zzgs_byzz_Edi){
            Constant.zzgs_byzz = textdouble;
            SpUtil.saveSP(getContext(),"zzgs_byzz",Constant.zzgs_byzz);
        } else if (view == zzys_szyfz_zx_Edi){
            Constant.zzys_szyfz_zx = textdouble;
            SpUtil.saveSP(getContext(),"zzys_szyfz_zx",Constant.zzys_szyfz_zx);
        } else if (view == zzys_szyfz_zd_Edi){
            Constant.zzys_szyfz_zd = textdouble;
            SpUtil.saveSP(getContext(),"zzys_szyfz_zd",Constant.zzys_szyfz_zd);
        }
        else if (view == zzgs_szyfz_Edi){
            Constant.zzgs_szyfz = textdouble;
            SpUtil.saveSP(getContext(),"zzgs_szyfz",Constant.zzgs_szyfz);
        }
    }
}
