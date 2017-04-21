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
 * @Description: 猪舍建筑单价设置
 */
public class ZsjzdjyfcFragment extends BaseFragment {



    @NotEmpty
    private EditText szyfs_d;
    @NotEmpty
    private EditText zqc_d;
    @NotEmpty
    private EditText zyc_d;
    @NotEmpty
    private EditText fzwjzmj_d;
    @NotEmpty
    private EditText slkf_d;
    @NotEmpty
    private EditText bgdqtjz_d;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zsjzdj_yfc,null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {



        szyfs_d = (EditText) view.findViewById(R.id.szyfs_d);
        szyfs_d.setOnFocusChangeListener(focusListener);
        if (Constant.szyfs_d != 0)
            szyfs_d.setText(Constant.szyfs_d+"");


        zqc_d = (EditText) view.findViewById(R.id.zqc_d);
        zqc_d.setOnFocusChangeListener(focusListener);
        if (Constant.zqc_d != 0)
            zqc_d.setText(Constant.zqc_d+"");

        zyc_d = (EditText) view.findViewById(R.id.zyc_d);
        zyc_d.setOnFocusChangeListener(focusListener);
        if (Constant.zyc_d != 0)
            zyc_d.setText(Constant.zyc_d+"");

        fzwjzmj_d = (EditText) view.findViewById(R.id.fzwjzmj_d);
        fzwjzmj_d.setOnFocusChangeListener(focusListener);
            fzwjzmj_d.setText(Constant.fzwjzmj_d+"");

        slkf_d = (EditText) view.findViewById(R.id.slkf_d);
        slkf_d.setOnFocusChangeListener(focusListener);
        if (Constant.slkf_d != 0)
            slkf_d.setText(Constant.slkf_d+"");

        bgdqtjz_d = (EditText) view.findViewById(R.id.bgdqtjz_d);
        bgdqtjz_d.setOnFocusChangeListener(focusListener);
        if (Constant.bgdqtjz_d != 0)
            bgdqtjz_d.setText(Constant.bgdqtjz_d+"");
    }

    @Override
    public void saveData(EditText view, String text) {
        double  textdouble = Double.parseDouble(text);
        if (view == szyfs_d){
            Constant.szyfs_d = textdouble;
            SpUtil.saveSP(getContext(),"szyfs_d",Constant.szyfs_d);
        }else if (view == zqc_d){
            Constant.zqc_d = textdouble;
            SpUtil.saveSP(getContext(),"zqc_d",Constant.zqc_d);
        }else if (view == zyc_d){
            Constant.zyc_d = textdouble;
            SpUtil.saveSP(getContext(),"zyc_d",Constant.zyc_d);
        }else if (view == fzwjzmj_d){
            Constant.fzwjzmj_d = textdouble;
            SpUtil.saveSP(getContext(),"fzwjzmj_d",Constant.fzwjzmj_d);
        }else if (view == slkf_d){
            Constant.slkf_d = textdouble;
            SpUtil.saveSP(getContext(),"slkf_d",Constant.slkf_d);
        }else if (view == bgdqtjz_d){
            Constant.bgdqtjz_d = textdouble;
            SpUtil.saveSP(getContext(),"bgdqtjz_d",Constant.bgdqtjz_d);
        }
    }
}
