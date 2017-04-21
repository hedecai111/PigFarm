package com.cd.pigfarm.fyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.LogUtil;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/4/14 14:03
 * @Description: 专业育肥场建筑单位面积页面
 */
public class ZsjzmjyfcFragment extends BaseFragment {
    @NotEmpty
    private EditText yfc_szyfs_mj;
    private EditText yfc_slkf_mj;
    private EditText yfc_bgdqijz_mj;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_zsjzmj_yfc, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        yfc_szyfs_mj = (EditText) view.findViewById(R.id.yfc_szyfs_mj);
        yfc_slkf_mj = (EditText) view.findViewById(R.id.yfc_slkf_mj);
        yfc_bgdqijz_mj = (EditText) view.findViewById(R.id.yfc_bgdqijz_mj);
    }

    @Override
    public void jsDatas() {
        try {
            Constant.yfc_szyfs_mj = Constant.spzyfl * Constant.szyfl_mj;

            Constant.yfc_slkf_mj = Constant.clspzs * 0.1f;

            Constant.yfc_bgdqijz_mj = Constant.clspzs * 0.18f;
        } catch (Exception e) {
            LogUtil.e(e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        if (Constant.yfc_szyfs_mj == 0){
            Toast.makeText(getContext(),"请先设置存栏商品猪数和猪场设计参数",Toast.LENGTH_SHORT).show();
            return;
        }
        yfc_szyfs_mj.setText(Constant.yfc_szyfs_mj + "");

        yfc_slkf_mj.setText(Constant.yfc_slkf_mj + "");

        yfc_bgdqijz_mj.setText(Constant.yfc_bgdqijz_mj + "");
    }
}
