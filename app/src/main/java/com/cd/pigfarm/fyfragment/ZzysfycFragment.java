package com.cd.pigfarm.fyfragment;

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
public class ZzysfycFragment extends BaseFragment {


    @NotEmpty
    private EditText zzys_szyfz_zx_Edi;
    @NotEmpty
    private EditText zzys_szyfz_zd_Edi;
    @NotEmpty
    private EditText zzgs_szyfz_Edi;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zzys_yfc,null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {
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
       if (view == zzys_szyfz_zx_Edi){
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
