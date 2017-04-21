package com.cd.pigfarm.fyfragment;

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
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 14:59
 * @Description: 尿氮含量设置
 */
public class Ldhl_yfcFragment extends BaseFragment {

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
        view = View.inflate(getContext(), R.layout.fragment_ldhl_yfc,null);
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
        if (view == ycz_f_gwz){
            Constant.ycz_f_gwz = textdouble/100;
            SpUtil.saveSP(getContext(),"ycz_f_gwz",Constant.ycz_f_gwz);
            ycz_f_gwz.setText(text+"%");
        }else if (view == ycz_f_gwzhdl){
            Constant.ycz_f_gwzhdl = textdouble/100;
            SpUtil.saveSP(getContext(),"ycz_f_gwzhdl",Constant.ycz_f_gwzhdl);
            ycz_f_gwzhdl.setText(text+"%");
        }else if (view == ycz_l_gwz){
            Constant.ycz_l_gwz = textdouble/100;
            SpUtil.saveSP(getContext(),"ycz_l_gwz",Constant.ycz_l_gwz);
            ycz_l_gwz.setText(text+"%");
        }else if (view == ycz_l_ld){
            Constant.ycz_l_ld = textdouble;
            SpUtil.saveSP(getContext(),"ycz_l_ld",Constant.ycz_l_ld);
        }
    }

    private void bindViews() {

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
