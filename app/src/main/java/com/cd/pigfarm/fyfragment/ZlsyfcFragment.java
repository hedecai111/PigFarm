package com.cd.pigfarm.fyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.LogUtil;
import com.cd.pigfarm.util.SpUtil;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/4/14 13:16
 * @Description: 专业育肥场
 */
public class ZlsyfcFragment extends BaseFragment {
    @NotEmpty
    private EditText mlsyspzs;
    private EditText spzyfl;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zls_yfc, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        mlsyspzs = (EditText) view.findViewById(R.id.mlsyspzs);
        mlsyspzs.setOnFocusChangeListener(focusListener);
        if (Constant.mlsyspzs != 0) {
            mlsyspzs.setText(Constant.mlsyspzs + "");
        }
        spzyfl = (EditText) view.findViewById(R.id.spzyfl);
    }

    @Override
    public void saveData(EditText view, String text) {
        if (view == mlsyspzs) {
            Constant.mlsyspzs = Double.parseDouble(text);
            SpUtil.saveSP(getContext(), "mlsyspzs", Constant.mlsyspzs);
            //Toast.makeText(getContext(),Constant.spzyfl+"",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void jsDatas() {
        try {

            if (Constant.mlsyspzs != 0) {
                Constant.spzyfl = Constant.clspzs / Constant.mlsyspzs;
                // Toast.makeText(getContext(),Constant.spzyfl+"",Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            LogUtil.e(e.getMessage());
        }
    }

    @Override
    public void refreshViews() {

        if (Constant.spzyfl == 0){
            return;
        }
        spzyfl.setText(Constant.spzyfl + "");
    }
}
