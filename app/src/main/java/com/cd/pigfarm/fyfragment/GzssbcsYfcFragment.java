package com.cd.pigfarm.fyfragment;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.app.App;
import com.cd.pigfarm.base.BaseFragment;
import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.entities.SbEntity;
import com.cd.pigfarm.util.LogUtil;
import com.cd.pigfarm.util.SpUtil;
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.List;

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

    private void addTz(SbEntity sbEntity){
        Constant.yfc_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
    }

    private LinearLayout yfc_Lin;
    private void initSqlAdd(){
        List<SbEntity> sbEntities = App.sqlOpenHelper.querySbByLx(10);
        if (sbEntities != null && sbEntities.size() >0){
            for (SbEntity sbEntity : sbEntities){
                addViewByType(yfc_Lin,sbEntity);
            }
        }

    }
    private void addViewByType(LinearLayout lin, SbEntity sbEntity){
        final SbEntity sbEntity1 = sbEntity;
        TextView textView = (TextView) View.inflate(getContext(),R.layout.lin_textview,null);
        lin.addView(textView,new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,1));
        LinearLayout linearLayout = (LinearLayout) View.inflate(getContext(),R.layout.sb_item,null);
        TextView textView1 = (TextView) linearLayout.findViewById(R.id.name);
        textView1.setText(sbEntity.getSbmc());
        EditText textView2 = (EditText) linearLayout.findViewById(R.id.gmxh);
        textView2.setText(sbEntity.getSbxh()+"");
        EditText textView3 = (EditText) linearLayout.findViewById(R.id.dw);
        textView3.setText(sbEntity.getDw());
        final EditText editText3 = (EditText) linearLayout.findViewById(R.id.tz);
        editText3.setText(sbEntity.getDj()*sbEntity.getSl()/10000+"");
        final EditText textView4 = (EditText) linearLayout.findViewById(R.id.sl);
        textView4.setText(sbEntity.getSl()+"");
        textView4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                try {
                    //Toast.makeText(getContext(),"---",Toast.LENGTH_SHORT).show();
                    int temp= Integer.parseInt(s.toString());
                    sbEntity1.setSl(temp);
                    App.sqlOpenHelper.updateSb(sbEntity1);
                    jsDatas();
                    refreshViews();
                    editText3.setText(sbEntity1.getDj()*sbEntity1.getSl()/10000+"");
                }catch (Exception e){
                    LogUtil.e("--------------->"+e.getMessage());
                }

            }
        });
        final EditText editText2 = (EditText) linearLayout.findViewById(R.id.dj);
        editText2.setText(sbEntity.getDj()+"");
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                double temp= Double.parseDouble(s.toString());
                sbEntity1.setDj(temp);
                App.sqlOpenHelper.updateSb(sbEntity1);
                jsDatas();
                refreshViews();
                editText3.setText(sbEntity1.getDj()*sbEntity1.getSl()/10000+"");

            }
        });

        lin.addView(linearLayout,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, Utils.dip2px(getContext(),50f)));
    }

    private Button addButton;

    private AlertDialog alertDialog;

    private View alertView;

    private EditText sbmc,gmxh,dw,sl,dj;

    private  Spinner spinner;


    private void bindViews() {

        yfc_Lin = (LinearLayout) view.findViewById(R.id.yfc_Lin);

        addButton = (Button) view.findViewById(R.id.add_But);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertView = View.inflate(getContext(),R.layout.add_sbcs_yfc,null);
                sbmc = (EditText) alertView.findViewById(R.id.sbmc);
                gmxh = (EditText) alertView.findViewById(R.id.sbxh);
                dw = (EditText) alertView.findViewById(R.id.dw);
                sl = (EditText) alertView.findViewById(R.id.sl);
                dj = (EditText) alertView.findViewById(R.id.dj);
                (alertView.findViewById(R.id.cancel_But)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                (alertView.findViewById(R.id.save_But)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String sbmcString = sbmc.getText().toString().trim();
                        String gmxhString = gmxh.getText().toString().trim();
                        String dwString = dw.getText().toString().trim();
                        String slString = sl.getText().toString().trim();
                        String djString = dj.getText().toString().trim();
                        if (sbmcString.equals("")){
                            Toast.makeText(getContext(),"请输入设备名称",Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if (gmxhString.equals("")){
                            Toast.makeText(getContext(),"请输入设备型号",Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if (dwString.equals("")){
                            Toast.makeText(getContext(),"请输入设备单位",Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if (slString.equals("")){
                            Toast.makeText(getContext(),"请输入设备设备数量",Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if (djString.equals("")){
                            Toast.makeText(getContext(),"请输入设备单价",Toast.LENGTH_SHORT).show();
                            return;
                        }
                        long id = App.sqlOpenHelper.addSb(10,sbmcString,gmxhString,dwString,Integer.parseInt(slString),Double.parseDouble(djString));
                        if (id > 0){
                            Toast.makeText(getContext(),"添加成功",Toast.LENGTH_SHORT).show();
                            SbEntity sb = new SbEntity(10,sbmcString,gmxhString,dwString,Integer.parseInt(slString),Double.parseDouble(djString));
                            addViewByType(yfc_Lin,sb);
                            addTz(sb);
                            refreshViews();
                            alertDialog.dismiss();
                        }else if(id == 0) {
                            Toast.makeText(getContext(),"该设备已添加过",Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(getContext(),"添加失败",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                alertDialog =new AlertDialog.Builder(getContext()).setView(alertView).show();

            }
        });

        yfc_xqjl_sl = (EditText) view.findViewById(R.id.yfc_xqjl_sl);
        yfc_xqjl_sl.setOnFocusChangeListener(focusListener);
        yfc_xqjl_dj = (EditText) view.findViewById(R.id.yfc_xqjl_dj);
        yfc_xqjl_dj.setOnFocusChangeListener(focusListener);
        yfc_xqjl_tz = (EditText) view.findViewById(R.id.yfc_xqjl_tz);
        yfc_xqjl_tz.setOnFocusChangeListener(focusListener);
        yfc_ltlx_sl = (EditText) view.findViewById(R.id.yfc_ltlx_sl);
        yfc_ltlx_sl.setOnFocusChangeListener(focusListener);
        yfc_ltlx_dj = (EditText) view.findViewById(R.id.yfc_ltlx_dj);
        yfc_ltlx_dj.setOnFocusChangeListener(focusListener);
        yfc_ltlx_tz = (EditText) view.findViewById(R.id.yfc_ltlx_tz);
        yfc_ltlx_tz.setOnFocusChangeListener(focusListener);
        yfc_sl_sl = (EditText) view.findViewById(R.id.yfc_sl_sl);
        yfc_sl_sl.setOnFocusChangeListener(focusListener);
        yfc_sl_dj = (EditText) view.findViewById(R.id.yfc_sl_dj);
        yfc_sl_dj.setOnFocusChangeListener(focusListener);
        yfc_sl_tz = (EditText) view.findViewById(R.id.yfc_sl_tz);
        yfc_sl_tz.setOnFocusChangeListener(focusListener);
        yfc_fyfj_sl = (EditText) view.findViewById(R.id.yfc_fyfj_sl);
        yfc_fyfj_sl.setOnFocusChangeListener(focusListener);
        yfc_fyfj_dj = (EditText) view.findViewById(R.id.yfc_fyfj_dj);
        yfc_fyfj_dj.setOnFocusChangeListener(focusListener);
        yfc_fyfj_tz = (EditText) view.findViewById(R.id.yfc_fyfj_tz);
        yfc_fyfj_tz.setOnFocusChangeListener(focusListener);
        yfc_znhjkzq_sl = (EditText) view.findViewById(R.id.yfc_znhjkzq_sl);
        yfc_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        yfc_znhjkzq_dj = (EditText) view.findViewById(R.id.yfc_znhjkzq_dj);
        yfc_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        yfc_znhjkzq_tz = (EditText) view.findViewById(R.id.yfc_znhjkzq_tz);
        yfc_znhjkzq_tz.setOnFocusChangeListener(focusListener);
        yfc_lfdb_sl = (EditText) view.findViewById(R.id.yfc_lfdb_sl);
        yfc_lfdb_sl.setOnFocusChangeListener(focusListener);
        yfc_lfdb_dj = (EditText) view.findViewById(R.id.yfc_lfdb_dj);
        yfc_lfdb_dj.setOnFocusChangeListener(focusListener);
        yfc_lfdb_tz = (EditText) view.findViewById(R.id.yfc_lfdb_tz);
        yfc_lfdb_tz.setOnFocusChangeListener(focusListener);
        yfc_ysq_sl = (EditText) view.findViewById(R.id.yfc_ysq_sl);
        yfc_ysq_sl.setOnFocusChangeListener(focusListener);
        yfc_ysq_dj = (EditText) view.findViewById(R.id.yfc_ysq_dj);
        yfc_ysq_dj.setOnFocusChangeListener(focusListener);
        yfc_ysq_tz = (EditText) view.findViewById(R.id.yfc_ysq_tz);
        yfc_ysq_tz.setOnFocusChangeListener(focusListener);
        yfc_tzze = (EditText) view.findViewById(R.id.yfc_tzze);

        initSqlAdd();
    }


    @Override
    public void saveData(EditText view, String text) {

        double d = Double.parseDouble(text);

         if (view == yfc_xqjl_sl){
            //SpUtil.saveSP(App.context,"yfc_xqjl_sl",d);

        }else if (view == yfc_xqjl_dj){
            SpUtil.saveSP(App.context,"yfc_xqjl_dj",d);

        }else if (view == yfc_ltlx_sl){
            //SpUtil.saveSP(App.context,"yfc_ltlx_sl",d);

        }else if (view == yfc_ltlx_dj){
            SpUtil.saveSP(App.context,"yfc_ltlx_dj",d);

        }else if (view == yfc_sl_sl){
           // SpUtil.saveSP(App.context,"yfc_sl_sl",d);

        }else if (view == yfc_sl_dj){
            SpUtil.saveSP(App.context,"yfc_sl_dj",d);

        }else if (view == yfc_fyfj_sl){
           // SpUtil.saveSP(App.context,"yfc_fyfj_sl",d);

        }else if (view == yfc_fyfj_dj){
            SpUtil.saveSP(App.context,"yfc_fyfj_dj",d);

        }else if (view == yfc_znhjkzq_sl){
           // SpUtil.saveSP(App.context,"yfc_znhjkzq_sl",d);

        }else if (view == yfc_znhjkzq_dj){
            SpUtil.saveSP(App.context,"yfc_znhjkzq_dj",d);

        }else if (view == yfc_lfdb_sl){
           // SpUtil.saveSP(App.context,"yfc_lfdb_sl",d);

        }else if (view == yfc_lfdb_dj){
            SpUtil.saveSP(App.context,"yfc_lfdb_dj",d);

        }else if (view == yfc_ysq_sl){
            //SpUtil.saveSP(App.context,"yfc_ysq_sl",d);

        }else if (view == yfc_ysq_dj){
            SpUtil.saveSP(App.context,"yfc_ysq_dj",d);

        }
    }

    @Override
    public void jsDatas() {
        try {

            Constant.yfc_tzze = 0;
        //后备母猪舍
        Constant.yfc_xqjl_sl = Utils.keep2Wdouble( Constant.spzyfl,2);


        Constant.yfc_xqjl_dj =Utils.keep2Wdouble( Constant.gzjxqsyj_dj,2);
            if (SpUtil.getSpDouble(App.context,"yfc_xqjl_dj",0) != 0)
                Constant.yfc_xqjl_dj = SpUtil.getSpDouble(App.context,"yfc_xqjl_dj",0);

        Constant.yfc_xqjl_tz =Utils.keep2Wdouble( (Constant.yfc_xqjl_sl*Constant.yfc_xqjl_dj)/10000,2);


        Constant.yfc_ltlx_sl =Utils.keep2Wdouble( Constant.spzyfl,2);

        Constant.yfc_ltlx_dj = 800;
            if (SpUtil.getSpDouble(App.context,"yfc_ltlx_dj",0) != 0)
                Constant.yfc_ltlx_dj = SpUtil.getSpDouble(App.context,"yfc_ltlx_dj",0);

        Constant.yfc_ltlx_tz =Utils.keep2Wdouble( (Constant.yfc_ltlx_sl*Constant.yfc_ltlx_dj)/10000,2);
            if (SpUtil.getSpDouble(App.context,"yfc_ltlx_tz",0) != 0)
                Constant.yfc_ltlx_tz = SpUtil.getSpDouble(App.context,"yfc_ltlx_tz",0);

        Constant.yfc_sl_sl =Utils.keep2Wdouble( Constant.yfc_szyfs_mj*3/65,2);


        Constant.yfc_sl_dj = 320;
            if (SpUtil.getSpDouble(App.context,"yfc_sl_dj",0) != 0)
                Constant.yfc_sl_dj = SpUtil.getSpDouble(App.context,"yfc_sl_dj",0);

        Constant.yfc_sl_tz =Utils.keep2Wdouble( (Constant.yfc_sl_sl*Constant.yfc_sl_dj)/10000,2);


        Constant.yfc_fyfj_sl =Utils.keep2Wdouble( Math.round(Constant.yfc_sl_sl/2+0.5),2);


        Constant.yfc_fyfj_dj = 2800;
            if (SpUtil.getSpDouble(App.context,"yfc_fyfj_dj",0) != 0)
                Constant.yfc_fyfj_dj = SpUtil.getSpDouble(App.context,"yfc_fyfj_dj",0);

        Constant.yfc_fyfj_tz =Utils.keep2Wdouble( (Constant.yfc_fyfj_sl*Constant.yfc_fyfj_dj)/10000,2);
            if (SpUtil.getSpDouble(App.context,"yfc_znhjkzq_sl",0) != 0)
                Constant.yfc_znhjkzq_sl = SpUtil.getSpDouble(App.context,"yfc_znhjkzq_sl",0);

        Constant.yfc_znhjkzq_sl =Utils.keep2Wdouble( Math.round(Constant.yfc_fyfj_sl/4-0.5),2);


        Constant.yfc_znhjkzq_dj = 20000;
            if (SpUtil.getSpDouble(App.context,"yfc_znhjkzq_dj",0) != 0)
                Constant.yfc_znhjkzq_dj = SpUtil.getSpDouble(App.context,"yfc_znhjkzq_dj",0);

        Constant.yfc_znhjkzq_tz =Utils.keep2Wdouble( (Constant.yfc_znhjkzq_sl*Constant.yfc_znhjkzq_dj)/10000,2);


        Constant.yfc_lfdb_sl =Utils.keep2Wdouble( Constant.yfc_szyfs_mj/5,0);


        Constant.yfc_lfdb_dj = 160;
            if (SpUtil.getSpDouble(App.context,"yfc_lfdb_dj",0) != 0)
                Constant.yfc_lfdb_dj = SpUtil.getSpDouble(App.context,"yfc_lfdb_dj",0);

        Constant.yfc_lfdb_tz =Utils.keep2Wdouble( (Constant.yfc_lfdb_sl*Constant.yfc_lfdb_dj)/10000,2);


        Constant.yfc_ysq_sl =Utils.keep2Wdouble( Constant.spzyfl*2,2);


        Constant.yfc_ysq_dj = 60;
            if (SpUtil.getSpDouble(App.context,"yfc_ysq_dj",0) != 0)
                Constant.yfc_ysq_dj = SpUtil.getSpDouble(App.context,"yfc_ysq_dj",0);

        Constant.yfc_ysq_tz =Utils.keep2Wdouble( (Constant.yfc_ysq_sl*Constant.yfc_ysq_dj)/10000,2);


        Constant.yfc_tzze =Utils.keep2Wdouble( Constant.yfc_xqjl_tz+Constant.yfc_ltlx_tz+Constant.yfc_sl_tz+Constant.yfc_fyfj_tz
                +Constant.yfc_znhjkzq_tz+Constant.yfc_lfdb_tz+Constant.yfc_ysq_tz,2);

            initTz();

        }catch (Exception e){
            LogUtil.e(e.getMessage());
        }
    }

    private void initTz(){
        List<SbEntity> sbEntities = App.sqlOpenHelper.querySbByLx(10);
        if (sbEntities != null && sbEntities.size() >0){
            for (SbEntity sbEntity : sbEntities){
                addTz(sbEntity);
            }
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
