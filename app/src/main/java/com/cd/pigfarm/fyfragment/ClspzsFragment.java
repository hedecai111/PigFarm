package com.cd.pigfarm.fyfragment;

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
 * @desc    输入存栏商品猪数
 */
public class ClspzsFragment extends BaseFragment {
    @NotEmpty
    private EditText clspzs_Edi;

    public ClspzsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_clspz, container, false);
        clspzs_Edi = (EditText) view.findViewById(R.id.clspz_Edi);
        Constant.clspzs= SpUtil.getSpLong(getContext(),"clspzs",200);
        if (Constant.clspzs != 0)
        clspzs_Edi.setText( Constant.clspzs+"");
        bindButton();
        return  view;
    }

    @Override
    public void saveData(EditText view, String text) {
        //验证是否合法
        if (!Utils.isNumeric(text)){
            Toast.makeText(getContext(),"请输入正确的存栏母猪数",Toast.LENGTH_LONG).show();
            return;
        }
        //输入合法,给存栏母猪数赋值
        Constant.clspzs = Long.parseLong(text);
        SpUtil.saveSP(getContext(),"clspzs", Constant.clspzs);
    }
    @Override
    public void onClick(View v) {
        saveData(clspzs_Edi,clspzs_Edi.getText().toString());
        super.onClick(v);

    }
}
