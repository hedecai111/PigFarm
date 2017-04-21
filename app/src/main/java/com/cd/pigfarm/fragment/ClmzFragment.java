package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.activity.ZzcActivity;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.SpUtil;
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author  hedecai
 * @time    2017/3/22 21:08
 * @desc    输入存栏么母猪数
 */
public class ClmzFragment extends BaseFragment {
    @NotEmpty
    private EditText clmzs_Edi;


    public ClmzFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view =  inflater.inflate(R.layout.fragment_clmz, container, false);
        clmzs_Edi = (EditText) view.findViewById(R.id.clmzs_Edi);
        long l = SpUtil.getSpLong(getContext(),"clmzz",0);
        if (l != 0)
            clmzs_Edi.setText(l+"");
        bindButton();
        return  view;
    }



    @Override
    public void saveData(EditText view, String text) {
        if (view == clmzs_Edi){
            if (!Utils.isNumeric(text)){
                Toast.makeText(getContext(),"请输入正确的存栏母猪数",Toast.LENGTH_LONG).show();
                return;
            }
            Constant.clmzz = Long.parseLong(text);
            SpUtil.saveSP(getContext(),"clmzz",Constant.clmzz);
           // Toast.makeText(getContext(),"----",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {
        saveData(clmzs_Edi,clmzs_Edi.getText().toString());
        super.onClick(v);
    }
}
