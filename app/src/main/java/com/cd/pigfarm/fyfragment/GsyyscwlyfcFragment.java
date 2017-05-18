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
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/4/14 13:42
 * @Description: 专业育肥场供水与饮水产污量
 */
public class GsyyscwlyfcFragment extends BaseFragment {
    @NotEmpty
    private EditText yfc_gsl;
    private EditText yfc_ysl;
    private EditText yfc_f;
    private EditText yfc_l;
    private EditText yfc_zqlqfl;
    private EditText yfc_gqfbl;
    private EditText yfc_gqfzqcrl;
    private EditText yfc_zyc;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_gslyyscwl_yfc, null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        yfc_gsl = (EditText) view.findViewById(R.id.yfc_gsl);
        yfc_ysl = (EditText) view.findViewById(R.id.yfc_ysl);
        yfc_f = (EditText) view.findViewById(R.id.yfc_f);
        yfc_l = (EditText) view.findViewById(R.id.yfc_l);
        yfc_zqlqfl = (EditText) view.findViewById(R.id.yfc_zqlqfl);
        yfc_gqfbl = (EditText) view.findViewById(R.id.yfc_gqfbl);
        yfc_gqfzqcrl = (EditText) view.findViewById(R.id.yfc_gqfzqcrl);
        yfc_zyc = (EditText) view.findViewById(R.id.yfc_zyc);
    }

    @Override
    public void jsDatas() {
        try {


            Constant.yfc_gsl = Utils.keep2Wdouble(Constant.clspzs * Constant.zzgs_szyfz / 1000, 0);

            Constant.yfc_ysl = Utils.keep2Wdouble(Constant.clspzs * Constant.zzys_szyfz_zd / 1000, 1);

            Constant.yfc_f = Utils.keep2Wdouble(Constant.clspzs * Constant.szyfz_f_xf, 0);

            Constant.yfc_l = Utils.keep2Wdouble(Constant.clspzs * Constant.szyfz_l_l, 0);

            Constant.yfc_zqlqfl = Utils.keep2Wdouble(Constant.clspzs * Constant.szyfz_gwz * Constant.gwzcql / Constant.zqccrcql, 0);

            Constant.yfc_gqfbl = 0.7;

            Constant.yfc_gqfzqcrl = Utils.keep2Wdouble(Constant.yfc_zqlqfl * (1 - Constant.yfc_gqfbl), 0);

            Constant.yfc_zyc = Utils.keep2Wdouble(Constant.yfc_gsl * 3 * 31, 0);

        } catch (Exception e) {
            LogUtil.e(e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        if (Constant.yfc_gsl == 0){
            Toast.makeText(getContext(),"请先设置存栏商品猪数和猪场设计参数",Toast.LENGTH_SHORT).show();
            return;
        }
        yfc_gsl.setText(Constant.yfc_gsl + "");

        yfc_ysl.setText(Constant.yfc_ysl + "");

        yfc_f.setText(Constant.yfc_f + "");

        yfc_l.setText(Constant.yfc_l + "");

        yfc_zqlqfl.setText(Constant.yfc_zqlqfl + "");

        yfc_gqfbl.setText(Utils.keep2Wdouble(Constant.yfc_gqfbl * 100, 0) + "%");

        yfc_gqfzqcrl.setText(Constant.yfc_gqfzqcrl + "");

        yfc_zyc.setText(Constant.yfc_zyc + "");
    }
}
