package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

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
 * @Description: 沼气池容量
 */
public class ZqcrlFragment extends BaseFragment {
    @NotEmpty
    private EditText gwzcql;
    @NotEmpty
    private EditText zqccrcql;
    @NotEmpty
    private EditText zqcrl;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zqcrl,null);
        bindButton();
        bindViews();
        return view;
    }
    private void bindViews() {

        gwzcql = (EditText) view.findViewById(R.id.gwzcql);
        gwzcql.setOnFocusChangeListener(focusListener);
        if (Constant.gwzcql != 0)
            gwzcql.setText(Constant.gwzcql+"");
        zqccrcql = (EditText) view.findViewById(R.id.zqccrcql);
        zqccrcql.setOnFocusChangeListener(focusListener);
        if (Constant.zqccrcql != 0)
            zqccrcql.setText(Constant.zqccrcql+"");

        zqcrl = (EditText) view.findViewById(R.id.zqcrl);
    }

    @Override
    public void saveData(EditText view, String text) {
        if (view == gwzcql) {
            Constant.gwzcql = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "gwzcql", Constant.gwzcql);
        }
        else if (view == zqccrcql) {
            Constant.zqccrcql = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "zqccrcql", Constant.zqccrcql);
        }
    }

    @Override
    public void jsDatas() {
        try {
        if (Constant.zqccrcql != 0)
           Constant.zqcrl = Utils.keep2Wdouble((Constant.qnjcngz_f_gwz+Constant.qnjcngz_l_gwz)*Constant.gwzcql/Constant.zqccrcql,3);
        }catch (Exception e){
            LogUtil.e(e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        if (zqcrl != null)
            zqcrl.setText(Constant.zqcrl+"");
    }
}
