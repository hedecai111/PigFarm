package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.SpUtil;
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 14:59
 * @Description: 尿氮含量设置
 */
public class LdhlFragment extends BaseFragment {
    @NotEmpty
    private EditText fymz_f_gwz;
    @NotEmpty
    private EditText fymz_f_gwzhdl;
    @NotEmpty
    private EditText fymz_l_gwz;
    @NotEmpty
    private EditText fymz_l_ld;
    @NotEmpty
    private EditText byz_f_gwz;
    @NotEmpty
    private EditText byz_f_gwzhdl;
    @NotEmpty
    private EditText byz_l_gwz;
    @NotEmpty
    private EditText byz_l_ld;
    @NotEmpty
    private EditText ycz_f_gwz;
    @NotEmpty
    private EditText ycz_f_gwzhdl;
    @NotEmpty
    private EditText ycz_l_gwz;
    @NotEmpty
    private EditText ycz_l_ld;
    private Button next_But;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_ldhl,null);
        bindViews();
        bindButton();
        return view;
    }

    @Override
    public void saveData(EditText view, String text) {
        if (text.endsWith("%")){
            text = text.substring(0,text.length()-1);
        }
        double  textdouble = Double.parseDouble(text);
        if (view == fymz_f_gwz){
            Constant.fymz_f_gwz = Utils.keep2Wdouble(textdouble/100,4);
            SpUtil.saveSP(getContext(),"fymz_f_gwz",Constant.fymz_f_gwz);
            fymz_f_gwz.setText(textdouble+"%");
        }else if (view == fymz_f_gwzhdl){
            Constant.fymz_f_gwzhdl = Utils.keep2Wdouble(textdouble/100,4);
            SpUtil.saveSP(getContext(),"fymz_f_gwzhdl",Constant.fymz_f_gwzhdl);
            fymz_f_gwzhdl.setText(textdouble+"%");
        }else if (view == fymz_l_gwz){
            Constant.fymz_l_gwz = Utils.keep2Wdouble(textdouble/100,4);
            SpUtil.saveSP(getContext(),"fymz_l_gwz",Constant.fymz_l_gwz);
            fymz_l_gwz.setText(textdouble+"%");
        }else if (view == fymz_l_ld){
            Constant.fymz_l_ld =Utils.keep2Wdouble( textdouble,4);
            SpUtil.saveSP(getContext(),"fymz_l_ld",Constant.fymz_l_ld);
        }
        else if (view == byz_f_gwz){
            Constant.byz_f_gwz = Utils.keep2Wdouble(textdouble/100,4);
            SpUtil.saveSP(getContext(),"byz_f_gwz",Constant.byz_f_gwz);
            byz_f_gwz.setText(textdouble+"%");
        }else if (view == byz_f_gwzhdl){
            Constant.byz_f_gwzhdl = Utils.keep2Wdouble(textdouble/100,3);
            SpUtil.saveSP(getContext(),"byz_f_gwzhdl",Constant.byz_f_gwzhdl);
            byz_f_gwzhdl.setText(textdouble+"%");
        }else if (view == byz_l_gwz){
            Constant.byz_l_gwz = Utils.keep2Wdouble(textdouble/100,4);
            SpUtil.saveSP(getContext(),"byz_l_gwz",Constant.byz_l_gwz);
            byz_l_gwz.setText(textdouble+"%");
        }else if (view == byz_l_ld){
            Constant.byz_l_ld = textdouble;
            SpUtil.saveSP(getContext(),"byz_l_ld",Constant.byz_l_ld);
        }else if (view == ycz_f_gwz){
            Constant.ycz_f_gwz = Utils.keep2Wdouble(textdouble/100,4);
            SpUtil.saveSP(getContext(),"ycz_f_gwz",Constant.ycz_f_gwz);
            ycz_f_gwz.setText(textdouble+"%");
        }else if (view == ycz_f_gwzhdl){
            Constant.ycz_f_gwzhdl = Utils.keep2Wdouble(textdouble/100,4);
            SpUtil.saveSP(getContext(),"ycz_f_gwzhdl",Constant.ycz_f_gwzhdl);
            ycz_f_gwzhdl.setText(textdouble+"%");
        }else if (view == ycz_l_gwz){
            Constant.ycz_l_gwz = Utils.keep2Wdouble(textdouble/100,4);
            SpUtil.saveSP(getContext(),"ycz_l_gwz",Constant.ycz_l_gwz);
            ycz_l_gwz.setText(textdouble+"%");
        }else if (view == ycz_l_ld){
            Constant.ycz_l_ld = textdouble;
            SpUtil.saveSP(getContext(),"ycz_l_ld",Constant.ycz_l_ld);
        }
    }

    private void bindViews() {

        fymz_f_gwz = (EditText) view.findViewById(R.id.fymz_f_gwz);
        fymz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.fymz_f_gwz != 0)
            fymz_f_gwz.setText(Constant.fymz_f_gwz*100+"%");

        fymz_f_gwzhdl = (EditText) view.findViewById(R.id.fymz_f_gwzhdl);
        fymz_f_gwzhdl.setOnFocusChangeListener(focusListener);
        if (Constant.fymz_f_gwzhdl != 0)
            fymz_f_gwzhdl.setText(Constant.fymz_f_gwzhdl*100+"%");

        fymz_l_gwz = (EditText) view.findViewById(R.id.fymz_l_gwz);
        fymz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.fymz_l_gwz != 0)
            fymz_l_gwz.setText(Constant.fymz_l_gwz*100+"%");

        fymz_l_ld = (EditText) view.findViewById(R.id.fymz_l_ld);
        fymz_l_ld.setOnFocusChangeListener(focusListener);
        if (Constant.fymz_l_ld != 0)
            fymz_l_ld.setText(Constant.fymz_l_ld+"");

        byz_f_gwz = (EditText) view.findViewById(R.id.byz_f_gwz);
        byz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.byz_f_gwz != 0)
            byz_f_gwz.setText(Constant.byz_f_gwz*100+"%");

        byz_f_gwzhdl = (EditText) view.findViewById(R.id.byz_f_gwzhdl);
        byz_f_gwzhdl.setOnFocusChangeListener(focusListener);
        if (Constant.byz_f_gwzhdl != 0)
            byz_f_gwzhdl.setText(Utils.keep2Wdouble(Constant.byz_f_gwzhdl*100,3)+"%");

        byz_l_gwz = (EditText) view.findViewById(R.id.byz_l_gwz);
        byz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.byz_l_gwz != 0)
            byz_l_gwz.setText(Constant.byz_l_gwz*100+"%");

        byz_l_ld = (EditText) view.findViewById(R.id.byz_l_ld);
        byz_l_ld.setOnFocusChangeListener(focusListener);
        if (Constant.byz_l_ld != 0)
            byz_l_ld.setText(Constant.byz_l_ld+"");

        ycz_f_gwz = (EditText) view.findViewById(R.id.ycz_f_gwz);
        ycz_f_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.ycz_f_gwz != 0)
            ycz_f_gwz.setText(Constant.ycz_f_gwz*100+"%");

        ycz_f_gwzhdl = (EditText) view.findViewById(R.id.ycz_f_gwzhdl);
        ycz_f_gwzhdl.setOnFocusChangeListener(focusListener);
        if (Constant.ycz_f_gwzhdl != 0)
            ycz_f_gwzhdl.setText(Constant.ycz_f_gwzhdl*100+"%");

        ycz_l_gwz = (EditText) view.findViewById(R.id.ycz_l_gwz);
        ycz_l_gwz.setOnFocusChangeListener(focusListener);
        if (Constant.ycz_l_gwz != 0)
            ycz_l_gwz.setText(Constant.ycz_l_gwz*100+"%");

        ycz_l_ld = (EditText) view.findViewById(R.id.ycz_l_ld);
        ycz_l_ld.setOnFocusChangeListener(focusListener);
        if (Constant.ycz_l_ld != 0)
            ycz_l_ld.setText(Constant.ycz_l_ld+"");

    }

}
