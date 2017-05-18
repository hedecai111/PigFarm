package com.cd.pigfarm.fyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.LogUtil;
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/30 13:37
 * @Description: 投资估算界面
 */
public class TzgsYfcFragment extends BaseFragment {

    @NotEmpty
    private EditText yfc_szyfs_tj;
    private EditText yfc_szyfs_sb;
    private EditText yfc_zqc_tj;
    private EditText yfc_zqc_sb;
    private EditText yfc_zyc_tj;
    private EditText yfc_zyc_sb;
    private EditText yfc_fzwjzmj_tj;
    private EditText yfc_fzwjzmj_sb;
    private EditText yfc_slkf_tj;
    private EditText yfc_slkf_sb;
    private EditText yfc_bgdqtjz_tj;
    private EditText yfc_bgdqtjz_sb;
    private EditText yfc_xj_tj;
    private EditText yfc_xj_sb;
    private EditText yfc_hj;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_tzgs_yfc, null);
        bindViews();
        bindButton();
        return view;
    }


    @Override
    public void jsDatas() {

        try {


            Constant.yfc_szyfs_tj = Utils.keep2Wdouble(Constant.yfc_szyfs_mj * Constant.szyfs_d / 10000, 2);

            Constant.yfc_szyfs_sb = Constant.yfc_tzze;

            Constant.yfc_zqc_tj = Utils.keep2Wdouble(Constant.yfc_gqfzqcrl * Constant.zqc_d / 10000, 2);

            Constant.yfc_zyc_tj = Utils.keep2Wdouble(Constant.yfc_zyc * Constant.zyc_d / 10000, 2);

            Constant.yfc_slkf_tj = Utils.keep2Wdouble(Constant.yfc_slkf_mj * Constant.slkf_d / 10000, 2);

            Constant.yfc_bgdqtjz_tj = Utils.keep2Wdouble(Constant.yfc_bgdqijz_mj * Constant.bgdqtjz_d / 10000, 2);

            Constant.yfc_xj_tj = Utils.keep2Wdouble(Constant.yfc_szyfs_tj + Constant.yfc_zqc_tj + Constant.yfc_zyc_tj + Constant.yfc_slkf_tj + Constant.yfc_bgdqtjz_tj, 2);

            Constant.yfc_xj_sb = Constant.yfc_szyfs_sb;

            Constant.yfc_hj = Utils.keep2Wdouble(Constant.yfc_xj_tj + Constant.yfc_xj_sb, 0);

        } catch (Exception e) {
            LogUtil.e(e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        if (Constant.yfc_szyfs_tj == 0){
            Toast.makeText(getContext(),"请先设置存栏商品猪数和猪场设计参数",Toast.LENGTH_SHORT).show();
            return;
        }
        yfc_szyfs_tj.setText(Constant.yfc_szyfs_tj + "");

        yfc_szyfs_sb.setText(Constant.yfc_szyfs_sb + "");

        yfc_zqc_tj.setText(Constant.yfc_zqc_tj + "");

        yfc_zyc_tj.setText(Constant.yfc_zyc_tj + "");

        yfc_slkf_tj.setText(Constant.yfc_slkf_tj + "");

        yfc_bgdqtjz_tj.setText(Constant.yfc_bgdqtjz_tj + "");

        yfc_xj_tj.setText(Constant.yfc_xj_tj + "");

        yfc_xj_sb.setText(Constant.yfc_xj_sb + "");

        yfc_hj.setText(Constant.yfc_hj + "");
    }

    private void bindViews() {

        yfc_szyfs_tj = (EditText) view.findViewById(R.id.yfc_szyfs_tj);
        yfc_szyfs_sb = (EditText) view.findViewById(R.id.yfc_szyfs_sb);
        yfc_zqc_tj = (EditText) view.findViewById(R.id.yfc_zqc_tj);
        yfc_zqc_sb = (EditText) view.findViewById(R.id.yfc_zqc_sb);
        yfc_zyc_tj = (EditText) view.findViewById(R.id.yfc_zyc_tj);
        yfc_zyc_sb = (EditText) view.findViewById(R.id.yfc_zyc_sb);
        yfc_fzwjzmj_tj = (EditText) view.findViewById(R.id.yfc_fzwjzmj_tj);
        yfc_fzwjzmj_sb = (EditText) view.findViewById(R.id.yfc_fzwjzmj_sb);
        yfc_slkf_tj = (EditText) view.findViewById(R.id.yfc_slkf_tj);
        yfc_slkf_sb = (EditText) view.findViewById(R.id.yfc_slkf_sb);
        yfc_bgdqtjz_tj = (EditText) view.findViewById(R.id.yfc_bgdqtjz_tj);
        yfc_bgdqtjz_sb = (EditText) view.findViewById(R.id.yfc_bgdqtjz_sb);
        yfc_xj_tj = (EditText) view.findViewById(R.id.yfc_xj_tj);
        yfc_xj_sb = (EditText) view.findViewById(R.id.yfc_xj_sb);
        yfc_hj = (EditText) view.findViewById(R.id.yfc_hj);
    }
}
