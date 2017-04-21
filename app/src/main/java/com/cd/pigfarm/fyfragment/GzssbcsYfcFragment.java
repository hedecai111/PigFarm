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
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/23 21:49
 * @Description: 各猪舍设备参数界面
 */
public class GzssbcsYfcFragment extends BaseFragment{
    @NotEmpty
    private EditText yfc_xqjl_sl;
    private EditText yfc_xqjl_dj;
    private EditText yfc_xqjl_tz;
    private EditText yfc_ltlx_sl;
    private EditText yfc_ltlx_dj;
    private EditText yfc_ltlx_tz;
    private EditText yfc_sl_sl;
    private EditText yfc_sl_dj;
    private EditText yfc_sl_tz;
    private EditText yfc_fyfj_sl;
    private EditText yfc_fyfj_dj;
    private EditText yfc_fyfj_tz;
    private EditText yfc_znhjkzq_sl;
    private EditText yfc_znhjkzq_dj;
    private EditText yfc_znhjkzq_tz;
    private EditText yfc_lfdb_sl;
    private EditText yfc_lfdb_dj;
    private EditText yfc_lfdb_tz;
    private EditText yfc_ysq_sl;
    private EditText yfc_ysq_dj;
    private EditText yfc_ysq_tz;
    private EditText yfc_tzze;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_gzssbcs_yfc,null);
        bindViews();
        bindButton();
        return view;
    }

    private void bindViews() {

        yfc_xqjl_sl = (EditText) view.findViewById(R.id.yfc_xqjl_sl);
        yfc_xqjl_dj = (EditText) view.findViewById(R.id.yfc_xqjl_dj);
        yfc_xqjl_tz = (EditText) view.findViewById(R.id.yfc_xqjl_tz);
        yfc_ltlx_sl = (EditText) view.findViewById(R.id.yfc_ltlx_sl);
        yfc_ltlx_dj = (EditText) view.findViewById(R.id.yfc_ltlx_dj);
        yfc_ltlx_tz = (EditText) view.findViewById(R.id.yfc_ltlx_tz);
        yfc_sl_sl = (EditText) view.findViewById(R.id.yfc_sl_sl);
        yfc_sl_dj = (EditText) view.findViewById(R.id.yfc_sl_dj);
        yfc_sl_tz = (EditText) view.findViewById(R.id.yfc_sl_tz);
        yfc_fyfj_sl = (EditText) view.findViewById(R.id.yfc_fyfj_sl);
        yfc_fyfj_dj = (EditText) view.findViewById(R.id.yfc_fyfj_dj);
        yfc_fyfj_tz = (EditText) view.findViewById(R.id.yfc_fyfj_tz);
        yfc_znhjkzq_sl = (EditText) view.findViewById(R.id.yfc_znhjkzq_sl);
        yfc_znhjkzq_dj = (EditText) view.findViewById(R.id.yfc_znhjkzq_dj);
        yfc_znhjkzq_tz = (EditText) view.findViewById(R.id.yfc_znhjkzq_tz);
        yfc_lfdb_sl = (EditText) view.findViewById(R.id.yfc_lfdb_sl);
        yfc_lfdb_dj = (EditText) view.findViewById(R.id.yfc_lfdb_dj);
        yfc_lfdb_tz = (EditText) view.findViewById(R.id.yfc_lfdb_tz);
        yfc_ysq_sl = (EditText) view.findViewById(R.id.yfc_ysq_sl);
        yfc_ysq_dj = (EditText) view.findViewById(R.id.yfc_ysq_dj);
        yfc_ysq_tz = (EditText) view.findViewById(R.id.yfc_ysq_tz);
        yfc_tzze = (EditText) view.findViewById(R.id.yfc_tzze);
    }


    @Override
    public void jsDatas() {
        try {
        //后备母猪舍
        Constant.yfc_xqjl_sl = Utils.keep2Wdouble( Constant.spzyfl,2);

        Constant.yfc_xqjl_dj =Utils.keep2Wdouble( Constant.gzjxqsyj_dj,2);

        Constant.yfc_xqjl_tz =Utils.keep2Wdouble( (Constant.yfc_xqjl_sl*Constant.yfc_xqjl_dj)/10000,2);

        Constant.yfc_ltlx_sl =Utils.keep2Wdouble( Constant.spzyfl,2);

        Constant.yfc_ltlx_dj = 800;

        Constant.yfc_ltlx_tz =Utils.keep2Wdouble( (Constant.yfc_ltlx_sl*Constant.yfc_ltlx_dj)/10000,2);

        Constant.yfc_sl_sl =Utils.keep2Wdouble( Constant.yfc_szyfs_mj*3/65,2);

        Constant.yfc_sl_dj = 320;

        Constant.yfc_sl_tz =Utils.keep2Wdouble( (Constant.yfc_sl_sl*Constant.yfc_sl_dj)/10000,2);

        Constant.yfc_fyfj_sl =Utils.keep2Wdouble( Math.round(Constant.yfc_sl_sl/2+0.5),2);

        Constant.yfc_fyfj_dj = 2800;

        Constant.yfc_fyfj_tz =Utils.keep2Wdouble( (Constant.yfc_fyfj_sl*Constant.yfc_fyfj_dj)/10000,2);

        Constant.yfc_znhjkzq_sl =Utils.keep2Wdouble( Math.round(Constant.yfc_fyfj_sl/4+0.5),2);

        Constant.yfc_znhjkzq_dj = 20000;

        Constant.yfc_znhjkzq_tz =Utils.keep2Wdouble( (Constant.yfc_znhjkzq_sl*Constant.yfc_znhjkzq_dj)/10000,2);

        Constant.yfc_lfdb_sl =Utils.keep2Wdouble( Constant.zfzyc_hbmzl_gyy/5,2);

        Constant.yfc_lfdb_dj = 160;

        Constant.yfc_lfdb_tz =Utils.keep2Wdouble( (Constant.yfc_lfdb_sl*Constant.yfc_lfdb_dj)/10000,2);

        Constant.yfc_ysq_sl =Utils.keep2Wdouble( Constant.zfzyc_hbmzl_gyy*2,2);

        Constant.yfc_ysq_dj = 60;

        Constant.yfc_ysq_tz =Utils.keep2Wdouble( (Constant.yfc_ysq_sl*Constant.yfc_ysq_dj)/10000,2);

        Constant.yfc_tzze =Utils.keep2Wdouble( Constant.yfc_xqjl_tz+Constant.yfc_ltlx_tz+Constant.yfc_sl_tz+Constant.yfc_fyfj_tz
                +Constant.yfc_znhjkzq_tz+Constant.yfc_lfdb_tz+Constant.yfc_ysq_tz,2);

        }catch (Exception e){
            LogUtil.e(e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        //后备母猪舍
        if (Constant.yfc_xqjl_sl == 0){
            Toast.makeText(getContext(),"请先设置存栏商品猪数和猪场设计参数",Toast.LENGTH_SHORT).show();
            return;
        }
        yfc_xqjl_sl.setText(Constant.yfc_xqjl_sl+"");

        yfc_xqjl_dj.setText(Constant.yfc_xqjl_dj+"");

        yfc_xqjl_tz.setText(Constant.yfc_xqjl_tz+"");

        yfc_ltlx_sl.setText(Constant.yfc_ltlx_sl+"");

        yfc_ltlx_dj.setText(Constant.yfc_ltlx_dj+"");

        yfc_ltlx_tz.setText(Constant.yfc_ltlx_tz+"");

        yfc_sl_sl.setText(Constant.yfc_sl_sl+"");

        yfc_sl_dj.setText(Constant.yfc_sl_dj+"");

        yfc_sl_tz.setText(Constant.yfc_sl_tz+"");


        yfc_fyfj_sl.setText(Constant.yfc_fyfj_sl+"");

        yfc_fyfj_dj.setText(Constant.yfc_fyfj_dj+"");

        yfc_fyfj_tz.setText(Constant.yfc_fyfj_tz+"");

        yfc_znhjkzq_sl.setText(Constant.yfc_znhjkzq_sl+"");

        yfc_znhjkzq_dj.setText(Constant.yfc_znhjkzq_dj+"");

        yfc_znhjkzq_tz.setText(Constant.yfc_znhjkzq_tz+"");

        yfc_lfdb_sl.setText(Constant.yfc_lfdb_sl+"");

        yfc_lfdb_dj.setText(Constant.yfc_lfdb_dj+"");

        yfc_lfdb_tz.setText(Constant.yfc_lfdb_tz+"");

        yfc_ysq_sl.setText(Constant.yfc_ysq_sl+"");

        yfc_ysq_dj.setText(Constant.yfc_ysq_dj+"");

        yfc_ysq_tz.setText(Constant.yfc_ysq_tz+"");

        yfc_tzze.setText(Constant.yfc_tzze+"");
    }
}
