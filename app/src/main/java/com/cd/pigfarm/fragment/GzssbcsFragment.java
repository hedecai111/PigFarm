package com.cd.pigfarm.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
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
import com.cd.pigfarm.sql.SqlOpenHelper;
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
public class GzssbcsFragment extends BaseFragment {
    @NotEmpty
    private EditText hbmzs_xqjl_sl;
    private EditText hbmzs_xqjl_dj;
    private EditText hbmzs_xqjl_tz;
    private EditText hbmzs_ltlx_sl;
    private EditText hbmzs_ltlx_dj;
    private EditText hbmzs_ltlx_tz;
    private EditText hbmzs_sl_sl;
    private EditText hbmzs_sl_dj;
    private EditText hbmzs_sl_tz;
    private EditText hbmzs_fyfj_sl;
    private EditText hbmzs_fyfj_dj;
    private EditText hbmzs_fyfj_tz;
    private EditText hbmzs_znhjkzq_sl;
    private EditText hbmzs_znhjkzq_dj;
    private EditText hbmzs_znhjkzq_tz;
    private EditText hbmzs_lfdb_sl;
    private EditText hbmzs_lfdb_dj;
    private EditText hbmzs_lfdb_tz;
    private EditText hbmzs_ysq_sl;
    private EditText hbmzs_ysq_dj;
    private EditText hbmzs_ysq_tz;
    private EditText hbmzs_tzze;

    private EditText gzjpzrjmzs_bzj_sl;
    private EditText gzjpzrjmzs_bzj_dj;
    private EditText gzjpzrjmzs_bzj_tz;
    private EditText gzjpzrjmzs_jyzlzdfxy_sl;
    private EditText gzjpzrjmzs_jyzlzdfxy_dj;
    private EditText gzjpzrjmzs_jyzlzdfxy_tz;
    private EditText gzjpzrjmzs_szsj_sl;
    private EditText gzjpzrjmzs_szsj_dj;
    private EditText gzjpzrjmzs_szsj_tz;
    private EditText gzjpzrjmzs_szysjybzdgzj_sl;
    private EditText gzjpzrjmzs_szysjybzdgzj_dj;
    private EditText gzjpzrjmzs_szysjybzdgzj_tz;
    private EditText gzjpzrjmzs_xqjl_sl;
    private EditText gzjpzrjmzs_xqjl_dj;
    private EditText gzjpzrjmzs_xqjl_tz;
    private EditText gzjpzrjmzs_ltxx_sl;
    private EditText gzjpzrjmzs_ltxx_dj;
    private EditText gzjpzrjmzs_ltxx_tz;
    private EditText gzjpzrjmzs_sl_sl;
    private EditText gzjpzrjmzs_sl_dj;
    private EditText gzjpzrjmzs_sl_tz;
    private EditText gzjpzrjmzs_fyfj_sl;
    private EditText gzjpzrjmzs_fyfj_dj;
    private EditText gzjpzrjmzs_fyfj_tz;
    private EditText gzjpzrjmzs_znhjkzq_sl;
    private EditText gzjpzrjmzs_znhjkzq_dj;
    private EditText gzjpzrjmzs_znhjkzq_tz;
    private EditText gzjpzrjmzs_lfdb_sl;
    private EditText gzjpzrjmzs_lfdb_dj;
    private EditText gzjpzrjmzs_lfdb_tz;
    private EditText gzjpzrjmzs_ysq_sl;
    private EditText gzjpzrjmzs_ysq_dj;
    private EditText gzjpzrjmzs_ysq_tz;
    private EditText gzjpzrjmzs_rcvczdy_sl;
    private EditText gzjpzrjmzs_rcvczdy_dj;
    private EditText gzjpzrjmzs_rcvczdy_tz;
    private EditText gzjpzrjmzs_tzze;


    private EditText rcmzs_xwl_sl;
    private EditText rcmzs_xwl_dj;
    private EditText rcmzs_xwl_tz;
    private EditText rcmzs_ltlx_sl;
    private EditText rcmzs_ltlx_dj;
    private EditText rcmzs_ltlx_tz;
    private EditText rcmzs_sl_sl;
    private EditText rcmzs_sl_dj;
    private EditText rcmzs_sl_tz;
    private EditText rcmzs_fyfj_sl;
    private EditText rcmzs_fyfj_dj;
    private EditText rcmzs_fyfj_tz;
    private EditText rcmzs_znhjkzq_sl;
    private EditText rcmzs_znhjkzq_dj;
    private EditText rcmzs_znhjkzq_tz;
    private EditText rcmzs_lfdb_sl;
    private EditText rcmzs_lfdb_dj;
    private EditText rcmzs_lfdb_tz;
    private EditText rcmzs_ysq_sl;
    private EditText rcmzs_ysq_dj;
    private EditText rcmzs_ysq_tz;
    private EditText rcmzs_tzze;


    private EditText fws_fwl_sl;
    private EditText fws_fwl_dj;
    private EditText fws_fwl_tz;
    private EditText fws_ltlx_sl;
    private EditText fws_ltlx_dj;
    private EditText fws_ltlx_tz;
    private EditText fws_sl_sl;
    private EditText fws_sl_dj;
    private EditText fws_sl_tz;
    private EditText fws_flsj_sl;
    private EditText fws_flsj_dj;
    private EditText fws_flsj_tz;
    private EditText fws_znhjkzq_sl;
    private EditText fws_znhjkzq_dj;
    private EditText fws_znhjkzq_tz;
    private EditText fws_ysq_sl;
    private EditText fws_ysq_dj;
    private EditText fws_ysq_tz;
    private EditText fws_znbwx_sl;
    private EditText fws_znbwx_dj;
    private EditText fws_znbwx_tz;
    private EditText fws_dhjbysb_sl;
    private EditText fws_dhjbysb_dj;
    private EditText fws_dhjbysb_tz;
    private EditText fws_tzze;


    private EditText bys_byl_sl;
    private EditText bys_byl_dj;
    private EditText bys_byl_tz;
    private EditText bys_ltlx_sl;
    private EditText bys_ltlx_dj;
    private EditText bys_ltlx_tz;
    private EditText bys_sl_sl;
    private EditText bys_sl_dj;
    private EditText bys_sl_tz;
    private EditText bys_fyfj_sl;
    private EditText bys_fyfj_dj;
    private EditText bys_fyfj_tz;
    private EditText bys_znhjkzq_sl;
    private EditText bys_znhjkzq_dj;
    private EditText bys_znhjkzq_tz;
    private EditText bys_ysq_sl;
    private EditText bys_ysq_dj;
    private EditText bys_ysq_tz;
    private EditText bys_dhjbwsb_sl;
    private EditText bys_dhjbwsb_dj;
    private EditText bys_dhjbwsb_tz;
    private EditText bys_tzze;


    private EditText szyfs_xqjl_sl;
    private EditText szyfs_xqjl_dj;
    private EditText szyfs_xqjl_tz;
    private EditText szyfs_ltlx_sl;
    private EditText szyfs_ltlx_dj;
    private EditText szyfs_ltlx_tz;
    private EditText szyfs_sl_sl;
    private EditText szyfs_sl_dj;
    private EditText szyfs_sl_tz;
    private EditText szyfs_fyfj_sl;
    private EditText szyfs_fyfj_dj;
    private EditText szyfs_fyfj_tz;
    private EditText szyfs_znhjkzq_sl;
    private EditText szyfs_znhjkzq_dj;
    private EditText szyfs_znhjkzq_tz;
    private EditText szyfs_lfdb_sl;
    private EditText szyfs_lfdb_dj;
    private EditText szyfs_lfdb_tz;
    private EditText szyfs_ysq_sl;
    private EditText szyfs_ysq_dj;
    private EditText szyfs_ysq_tz;
    private EditText szyfs_tzze;


    private EditText bzgls_xqjl_sl;
    private EditText bzgls_xqjl_dj;
    private EditText bzgls_xqjl_tz;
    private EditText bzgls_ltlx_sl;
    private EditText bzgls_ltlx_dj;
    private EditText bzgls_ltlx_tz;
    private EditText bzgls_sl_sl;
    private EditText bzgls_sl_dj;
    private EditText bzgls_sl_tz;
    private EditText bzgls_fyfj_sl;
    private EditText bzgls_fyfj_dj;
    private EditText bzgls_fyfj_tz;
    private EditText bzgls_znhjkzq_sl;
    private EditText bzgls_znhjkzq_dj;
    private EditText bzgls_znhjkzq_tz;
    private EditText bzgls_lfdb_sl;
    private EditText bzgls_lfdb_dj;
    private EditText bzgls_lfdb_tz;
    private EditText bzgls_ysq_sl;
    private EditText bzgls_ysq_dj;
    private EditText bzgls_ysq_tz;
    private EditText bzgls_tzze;


    private EditText yzgls_xqjl_sl;
    private EditText yzgls_xqjl_dj;
    private EditText yzgls_xqjl_tz;
    private EditText yzgls_ltlx_sl;
    private EditText yzgls_ltlx_dj;
    private EditText yzgls_ltlx_tz;
    private EditText yzgls_sl_sl;
    private EditText yzgls_sl_dj;
    private EditText yzgls_sl_tz;
    private EditText yzgls_fyfj_sl;
    private EditText yzgls_fyfj_dj;
    private EditText yzgls_fyfj_tz;
    private EditText yzgls_znhjkzq_sl;
    private EditText yzgls_znhjkzq_dj;
    private EditText yzgls_znhjkzq_tz;
    private EditText yzgls_lfdb_sl;
    private EditText yzgls_lfdb_dj;
    private EditText yzgls_lfdb_tz;
    private EditText yzgls_ysq_sl;
    private EditText yzgls_ysq_dj;
    private EditText yzgls_ysq_tz;
    private EditText yzgls_tzze;
    private Button next_But;

    private Button addButton;

    private View alertView;

    private EditText sbmc,gmxh,dw,sl,dj;

    private Spinner spinner;

    private int zslx;

    AlertDialog alertDialog;


    private LinearLayout hbmzs_Lin,gzjpzrjmzs_Lin,rcmzs_Lin,fws_Lin,bys_Lin,szyfs_Lin,bzgls_Lin,yzgls_Lin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_gzssbcs, null);
        findViews();
        bindButton();
        return view;
    }

    private void findViews() {

        hbmzs_Lin = (LinearLayout) view.findViewById(R.id.hbmzs_Lin);
        gzjpzrjmzs_Lin = (LinearLayout) view.findViewById(R.id.gzjpzrjmzs_Lin);
        rcmzs_Lin = (LinearLayout) view.findViewById(R.id.rcmzs_Lin);
        fws_Lin = (LinearLayout) view.findViewById(R.id.fws_Lin);
        bys_Lin = (LinearLayout) view.findViewById(R.id.bys_Lin);
        szyfs_Lin = (LinearLayout) view.findViewById(R.id.szyfs_Lin);
        bzgls_Lin = (LinearLayout) view.findViewById(R.id.bzgls_Lin);
        yzgls_Lin = (LinearLayout) view.findViewById(R.id.yzgls_Lin);

        addButton = (Button) view.findViewById(R.id.add_But);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertView = View.inflate(getContext(),R.layout.add_sbcs,null);
                sbmc = (EditText) alertView.findViewById(R.id.sbmc);
                gmxh = (EditText) alertView.findViewById(R.id.sbxh);
                dw = (EditText) alertView.findViewById(R.id.dw);
                sl = (EditText) alertView.findViewById(R.id.sl);
                dj = (EditText) alertView.findViewById(R.id.dj);
                spinner = (Spinner) alertView.findViewById(R.id.zslx);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        zslx = position;
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
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
                        long id = App.sqlOpenHelper.addSb(zslx,sbmcString,gmxhString,dwString,Integer.parseInt(slString),Double.parseDouble(djString));
                        if (id > 0){
                            Toast.makeText(getContext(),"添加成功",Toast.LENGTH_SHORT).show();
                            SbEntity sb = new SbEntity(zslx,sbmcString,gmxhString,dwString,Integer.parseInt(slString),Double.parseDouble(djString));
                            addView(sb);
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

        hbmzs_xqjl_sl = (EditText) view.findViewById(R.id.hbmzs_xqjl_sl);
        hbmzs_xqjl_sl.setOnFocusChangeListener(focusListener);
        hbmzs_xqjl_dj = (EditText) view.findViewById(R.id.hbmzs_xqjl_dj);
        hbmzs_xqjl_dj.setOnFocusChangeListener(focusListener);
        hbmzs_xqjl_tz = (EditText) view.findViewById(R.id.hbmzs_xqjl_tz);
        hbmzs_xqjl_tz.setOnFocusChangeListener(focusListener);
        hbmzs_ltlx_sl = (EditText) view.findViewById(R.id.hbmzs_ltlx_sl);
        hbmzs_ltlx_sl.setOnFocusChangeListener(focusListener);
        hbmzs_ltlx_dj = (EditText) view.findViewById(R.id.hbmzs_ltlx_dj);
        hbmzs_ltlx_dj.setOnFocusChangeListener(focusListener);
        hbmzs_ltlx_tz = (EditText) view.findViewById(R.id.hbmzs_ltlx_tz);
        hbmzs_ltlx_tz.setOnFocusChangeListener(focusListener);
        hbmzs_sl_sl = (EditText) view.findViewById(R.id.hbmzs_sl_sl);
        hbmzs_sl_sl.setOnFocusChangeListener(focusListener);
        hbmzs_sl_dj = (EditText) view.findViewById(R.id.hbmzs_sl_dj);
        hbmzs_sl_dj.setOnFocusChangeListener(focusListener);
        hbmzs_sl_tz = (EditText) view.findViewById(R.id.hbmzs_sl_tz);
        hbmzs_sl_tz.setOnFocusChangeListener(focusListener);
        hbmzs_fyfj_sl = (EditText) view.findViewById(R.id.hbmzs_fyfj_sl);
        hbmzs_fyfj_sl.setOnFocusChangeListener(focusListener);
        hbmzs_fyfj_dj = (EditText) view.findViewById(R.id.hbmzs_fyfj_dj);
        hbmzs_fyfj_dj.setOnFocusChangeListener(focusListener);
        hbmzs_fyfj_tz = (EditText) view.findViewById(R.id.hbmzs_fyfj_tz);
        hbmzs_fyfj_tz.setOnFocusChangeListener(focusListener);
        hbmzs_znhjkzq_sl = (EditText) view.findViewById(R.id.hbmzs_znhjkzq_sl);
        hbmzs_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        hbmzs_znhjkzq_dj = (EditText) view.findViewById(R.id.hbmzs_znhjkzq_dj);
        hbmzs_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        hbmzs_znhjkzq_tz = (EditText) view.findViewById(R.id.hbmzs_znhjkzq_tz);
        hbmzs_znhjkzq_tz.setOnFocusChangeListener(focusListener);
        hbmzs_lfdb_sl = (EditText) view.findViewById(R.id.hbmzs_lfdb_sl);
        hbmzs_lfdb_sl.setOnFocusChangeListener(focusListener);
        hbmzs_lfdb_dj = (EditText) view.findViewById(R.id.hbmzs_lfdb_dj);
        hbmzs_lfdb_dj.setOnFocusChangeListener(focusListener);
        hbmzs_lfdb_tz = (EditText) view.findViewById(R.id.hbmzs_lfdb_tz);
        hbmzs_lfdb_tz.setOnFocusChangeListener(focusListener);
        hbmzs_ysq_sl = (EditText) view.findViewById(R.id.hbmzs_ysq_sl);
        hbmzs_ysq_sl.setOnFocusChangeListener(focusListener);
        hbmzs_ysq_dj = (EditText) view.findViewById(R.id.hbmzs_ysq_dj);
        hbmzs_ysq_dj.setOnFocusChangeListener(focusListener);
        hbmzs_ysq_tz = (EditText) view.findViewById(R.id.hbmzs_ysq_tz);
        hbmzs_ysq_tz.setOnFocusChangeListener(focusListener);
        hbmzs_tzze = (EditText) view.findViewById(R.id.hbmzs_tzze);
        hbmzs_tzze.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_bzj_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_bzj_sl);
        gzjpzrjmzs_bzj_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_bzj_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_bzj_dj);
        gzjpzrjmzs_bzj_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_bzj_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_bzj_tz);
        gzjpzrjmzs_bzj_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_jyzlzdfxy_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_jyzlzdfxy_sl);
        gzjpzrjmzs_jyzlzdfxy_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_jyzlzdfxy_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_jyzlzdfxy_dj);
        gzjpzrjmzs_jyzlzdfxy_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_jyzlzdfxy_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_jyzlzdfxy_tz);
        gzjpzrjmzs_jyzlzdfxy_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_szsj_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_szsj_sl);
        gzjpzrjmzs_szsj_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_szsj_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_szsj_dj);
        gzjpzrjmzs_szsj_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_szsj_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_szsj_tz);
        gzjpzrjmzs_szsj_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_szysjybzdgzj_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_szysjybzdgzj_sl);
        gzjpzrjmzs_szysjybzdgzj_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_szysjybzdgzj_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_szysjybzdgzj_dj);
        gzjpzrjmzs_szysjybzdgzj_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_szysjybzdgzj_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_szysjybzdgzj_tz);
        gzjpzrjmzs_szysjybzdgzj_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_xqjl_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_xqjl_sl);
        gzjpzrjmzs_xqjl_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_xqjl_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_xqjl_dj);
        gzjpzrjmzs_xqjl_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_xqjl_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_xqjl_tz);
        gzjpzrjmzs_xqjl_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_ltxx_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_ltxx_sl);
        gzjpzrjmzs_ltxx_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_ltxx_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_ltxx_dj);
        gzjpzrjmzs_ltxx_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_ltxx_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_ltxx_tz);
        gzjpzrjmzs_ltxx_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_sl_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_sl_sl);
        gzjpzrjmzs_sl_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_sl_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_sl_dj);
        gzjpzrjmzs_sl_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_sl_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_sl_tz);
        gzjpzrjmzs_sl_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_fyfj_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_fyfj_sl);
        gzjpzrjmzs_fyfj_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_fyfj_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_fyfj_dj);
        gzjpzrjmzs_fyfj_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_fyfj_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_fyfj_tz);
        gzjpzrjmzs_fyfj_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_znhjkzq_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_znhjkzq_sl);
        gzjpzrjmzs_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_znhjkzq_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_znhjkzq_dj);
        gzjpzrjmzs_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_znhjkzq_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_znhjkzq_tz);
        gzjpzrjmzs_znhjkzq_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_lfdb_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_lfdb_sl);
        gzjpzrjmzs_lfdb_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_lfdb_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_lfdb_dj);
        gzjpzrjmzs_lfdb_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_lfdb_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_lfdb_tz);
        gzjpzrjmzs_lfdb_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_ysq_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_ysq_sl);
        gzjpzrjmzs_ysq_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_ysq_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_ysq_dj);
        gzjpzrjmzs_ysq_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_ysq_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_ysq_tz);
        gzjpzrjmzs_ysq_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_rcvczdy_sl = (EditText) view.findViewById(R.id.gzjpzrjmzs_rcvczdy_sl);
        gzjpzrjmzs_rcvczdy_sl.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_rcvczdy_dj = (EditText) view.findViewById(R.id.gzjpzrjmzs_rcvczdy_dj);
        gzjpzrjmzs_rcvczdy_dj.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_rcvczdy_tz = (EditText) view.findViewById(R.id.gzjpzrjmzs_rcvczdy_tz);
        gzjpzrjmzs_rcvczdy_tz.setOnFocusChangeListener(focusListener);
        gzjpzrjmzs_tzze = (EditText) view.findViewById(R.id.gzjpzrjmzs_tzze);
        gzjpzrjmzs_tzze.setOnFocusChangeListener(focusListener);
        rcmzs_xwl_sl = (EditText) view.findViewById(R.id.rcmzs_xwl_sl);
        rcmzs_xwl_sl.setOnFocusChangeListener(focusListener);
        rcmzs_xwl_dj = (EditText) view.findViewById(R.id.rcmzs_xwl_dj);
        rcmzs_xwl_dj.setOnFocusChangeListener(focusListener);
        rcmzs_xwl_tz = (EditText) view.findViewById(R.id.rcmzs_xwl_tz);
        rcmzs_xwl_tz.setOnFocusChangeListener(focusListener);
        rcmzs_ltlx_sl = (EditText) view.findViewById(R.id.rcmzs_ltlx_sl);
        rcmzs_ltlx_sl.setOnFocusChangeListener(focusListener);
        rcmzs_ltlx_dj = (EditText) view.findViewById(R.id.rcmzs_ltlx_dj);
        rcmzs_ltlx_dj.setOnFocusChangeListener(focusListener);
        rcmzs_ltlx_tz = (EditText) view.findViewById(R.id.rcmzs_ltlx_tz);
        rcmzs_ltlx_tz.setOnFocusChangeListener(focusListener);
        rcmzs_sl_sl = (EditText) view.findViewById(R.id.rcmzs_sl_sl);
        rcmzs_sl_sl.setOnFocusChangeListener(focusListener);
        rcmzs_sl_dj = (EditText) view.findViewById(R.id.rcmzs_sl_dj);
        rcmzs_sl_dj.setOnFocusChangeListener(focusListener);
        rcmzs_sl_tz = (EditText) view.findViewById(R.id.rcmzs_sl_tz);
        rcmzs_sl_tz.setOnFocusChangeListener(focusListener);
        rcmzs_fyfj_sl = (EditText) view.findViewById(R.id.rcmzs_fyfj_sl);
        rcmzs_fyfj_sl.setOnFocusChangeListener(focusListener);
        rcmzs_fyfj_dj = (EditText) view.findViewById(R.id.rcmzs_fyfj_dj);
        rcmzs_fyfj_dj.setOnFocusChangeListener(focusListener);
        rcmzs_fyfj_tz = (EditText) view.findViewById(R.id.rcmzs_fyfj_tz);
        rcmzs_fyfj_tz.setOnFocusChangeListener(focusListener);
        rcmzs_znhjkzq_sl = (EditText) view.findViewById(R.id.rcmzs_znhjkzq_sl);
        rcmzs_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        rcmzs_znhjkzq_dj = (EditText) view.findViewById(R.id.rcmzs_znhjkzq_dj);
        rcmzs_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        rcmzs_znhjkzq_tz = (EditText) view.findViewById(R.id.rcmzs_znhjkzq_tz);
        rcmzs_znhjkzq_tz.setOnFocusChangeListener(focusListener);
        rcmzs_lfdb_sl = (EditText) view.findViewById(R.id.rcmzs_lfdb_sl);
        rcmzs_lfdb_sl.setOnFocusChangeListener(focusListener);
        rcmzs_lfdb_dj = (EditText) view.findViewById(R.id.rcmzs_lfdb_dj);
        rcmzs_lfdb_dj.setOnFocusChangeListener(focusListener);
        rcmzs_lfdb_tz = (EditText) view.findViewById(R.id.rcmzs_lfdb_tz);
        rcmzs_lfdb_tz.setOnFocusChangeListener(focusListener);
        rcmzs_ysq_sl = (EditText) view.findViewById(R.id.rcmzs_ysq_sl);
        rcmzs_ysq_sl.setOnFocusChangeListener(focusListener);
        rcmzs_ysq_dj = (EditText) view.findViewById(R.id.rcmzs_ysq_dj);
        rcmzs_ysq_dj.setOnFocusChangeListener(focusListener);
        rcmzs_ysq_tz = (EditText) view.findViewById(R.id.rcmzs_ysq_tz);
        rcmzs_ysq_tz.setOnFocusChangeListener(focusListener);
        rcmzs_tzze = (EditText) view.findViewById(R.id.rcmzs_tzze);
        rcmzs_tzze.setOnFocusChangeListener(focusListener);
        fws_fwl_sl = (EditText) view.findViewById(R.id.fws_fwl_sl);
        fws_fwl_sl.setOnFocusChangeListener(focusListener);
        fws_fwl_dj = (EditText) view.findViewById(R.id.fws_fwl_dj);
        fws_fwl_dj.setOnFocusChangeListener(focusListener);
        fws_fwl_tz = (EditText) view.findViewById(R.id.fws_fwl_tz);
        fws_fwl_tz.setOnFocusChangeListener(focusListener);
        fws_ltlx_sl = (EditText) view.findViewById(R.id.fws_ltlx_sl);
        fws_ltlx_sl.setOnFocusChangeListener(focusListener);
        fws_ltlx_dj = (EditText) view.findViewById(R.id.fws_ltlx_dj);
        fws_ltlx_dj.setOnFocusChangeListener(focusListener);
        fws_ltlx_tz = (EditText) view.findViewById(R.id.fws_ltlx_tz);
        fws_ltlx_tz.setOnFocusChangeListener(focusListener);
        fws_sl_sl = (EditText) view.findViewById(R.id.fws_sl_sl);
        fws_sl_sl.setOnFocusChangeListener(focusListener);
        fws_sl_dj = (EditText) view.findViewById(R.id.fws_sl_dj);
        fws_sl_dj.setOnFocusChangeListener(focusListener);
        fws_sl_tz = (EditText) view.findViewById(R.id.fws_sl_tz);
        fws_sl_tz.setOnFocusChangeListener(focusListener);
        fws_flsj_sl = (EditText) view.findViewById(R.id.fws_flsj_sl);
        fws_flsj_sl.setOnFocusChangeListener(focusListener);
        fws_flsj_dj = (EditText) view.findViewById(R.id.fws_flsj_dj);
        fws_flsj_dj.setOnFocusChangeListener(focusListener);
        fws_flsj_tz = (EditText) view.findViewById(R.id.fws_flsj_tz);
        fws_flsj_tz.setOnFocusChangeListener(focusListener);
        fws_znhjkzq_sl = (EditText) view.findViewById(R.id.fws_znhjkzq_sl);
        fws_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        fws_znhjkzq_dj = (EditText) view.findViewById(R.id.fws_znhjkzq_dj);
        fws_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        fws_znhjkzq_tz = (EditText) view.findViewById(R.id.fws_znhjkzq_tz);
        fws_znhjkzq_tz.setOnFocusChangeListener(focusListener);
        fws_ysq_sl = (EditText) view.findViewById(R.id.fws_ysq_sl);
        fws_ysq_sl.setOnFocusChangeListener(focusListener);
        fws_ysq_dj = (EditText) view.findViewById(R.id.fws_ysq_dj);
        fws_ysq_dj.setOnFocusChangeListener(focusListener);
        fws_ysq_tz = (EditText) view.findViewById(R.id.fws_ysq_tz);
        fws_ysq_tz.setOnFocusChangeListener(focusListener);
        fws_znbwx_sl = (EditText) view.findViewById(R.id.fws_znbwx_sl);
        fws_znbwx_sl.setOnFocusChangeListener(focusListener);
        fws_znbwx_dj = (EditText) view.findViewById(R.id.fws_znbwx_dj);
        fws_znbwx_dj.setOnFocusChangeListener(focusListener);
        fws_znbwx_tz = (EditText) view.findViewById(R.id.fws_znbwx_tz);
        fws_znbwx_tz.setOnFocusChangeListener(focusListener);
        fws_dhjbysb_sl = (EditText) view.findViewById(R.id.fws_dhjbysb_sl);
        fws_dhjbysb_sl.setOnFocusChangeListener(focusListener);
        fws_dhjbysb_dj = (EditText) view.findViewById(R.id.fws_dhjbysb_dj);
        fws_dhjbysb_dj.setOnFocusChangeListener(focusListener);
        fws_dhjbysb_tz = (EditText) view.findViewById(R.id.fws_dhjbysb_tz);
        fws_dhjbysb_tz.setOnFocusChangeListener(focusListener);
        fws_tzze = (EditText) view.findViewById(R.id.fws_tzze);
        fws_tzze.setOnFocusChangeListener(focusListener);
        bys_byl_sl = (EditText) view.findViewById(R.id.bys_byl_sl);
        bys_byl_sl.setOnFocusChangeListener(focusListener);
        bys_byl_dj = (EditText) view.findViewById(R.id.bys_byl_dj);
        bys_byl_dj.setOnFocusChangeListener(focusListener);
        bys_byl_tz = (EditText) view.findViewById(R.id.bys_byl_tz);
        bys_byl_tz.setOnFocusChangeListener(focusListener);
        bys_ltlx_sl = (EditText) view.findViewById(R.id.bys_ltlx_sl);
        bys_ltlx_sl.setOnFocusChangeListener(focusListener);
        bys_ltlx_dj = (EditText) view.findViewById(R.id.bys_ltlx_dj);
        bys_ltlx_dj.setOnFocusChangeListener(focusListener);
        bys_ltlx_tz = (EditText) view.findViewById(R.id.bys_ltlx_tz);
        bys_ltlx_tz.setOnFocusChangeListener(focusListener);
        bys_sl_sl = (EditText) view.findViewById(R.id.bys_sl_sl);
        bys_sl_sl.setOnFocusChangeListener(focusListener);
        bys_sl_dj = (EditText) view.findViewById(R.id.bys_sl_dj);
        bys_sl_dj.setOnFocusChangeListener(focusListener);
        bys_sl_tz = (EditText) view.findViewById(R.id.bys_sl_tz);
        bys_sl_tz.setOnFocusChangeListener(focusListener);
        bys_fyfj_sl = (EditText) view.findViewById(R.id.bys_fyfj_sl);
        bys_fyfj_sl.setOnFocusChangeListener(focusListener);
        bys_fyfj_dj = (EditText) view.findViewById(R.id.bys_fyfj_dj);
        bys_fyfj_dj.setOnFocusChangeListener(focusListener);
        bys_fyfj_tz = (EditText) view.findViewById(R.id.bys_fyfj_tz);
        bys_fyfj_tz.setOnFocusChangeListener(focusListener);
        bys_znhjkzq_sl = (EditText) view.findViewById(R.id.bys_znhjkzq_sl);
        bys_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        bys_znhjkzq_dj = (EditText) view.findViewById(R.id.bys_znhjkzq_dj);
        bys_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        bys_znhjkzq_tz = (EditText) view.findViewById(R.id.bys_znhjkzq_tz);
        bys_znhjkzq_tz.setOnFocusChangeListener(focusListener);
        bys_ysq_sl = (EditText) view.findViewById(R.id.bys_ysq_sl);
        bys_ysq_sl.setOnFocusChangeListener(focusListener);
        bys_ysq_dj = (EditText) view.findViewById(R.id.bys_ysq_dj);
        bys_ysq_dj.setOnFocusChangeListener(focusListener);
        bys_ysq_tz = (EditText) view.findViewById(R.id.bys_ysq_tz);
        bys_ysq_tz.setOnFocusChangeListener(focusListener);
        bys_dhjbwsb_sl = (EditText) view.findViewById(R.id.bys_dhjbwsb_sl);
        bys_dhjbwsb_sl.setOnFocusChangeListener(focusListener);
        bys_dhjbwsb_dj = (EditText) view.findViewById(R.id.bys_dhjbwsb_dj);
        bys_dhjbwsb_dj.setOnFocusChangeListener(focusListener);
        bys_dhjbwsb_tz = (EditText) view.findViewById(R.id.bys_dhjbwsb_tz);
        bys_dhjbwsb_tz.setOnFocusChangeListener(focusListener);
        bys_tzze = (EditText) view.findViewById(R.id.bys_tzze);
        bys_tzze.setOnFocusChangeListener(focusListener);
        szyfs_xqjl_sl = (EditText) view.findViewById(R.id.szyfs_xqjl_sl);
        szyfs_xqjl_sl.setOnFocusChangeListener(focusListener);
        szyfs_xqjl_dj = (EditText) view.findViewById(R.id.szyfs_xqjl_dj);
        szyfs_xqjl_dj.setOnFocusChangeListener(focusListener);
        szyfs_xqjl_tz = (EditText) view.findViewById(R.id.szyfs_xqjl_tz);
        szyfs_xqjl_tz.setOnFocusChangeListener(focusListener);
        szyfs_ltlx_sl = (EditText) view.findViewById(R.id.szyfs_ltlx_sl);
        szyfs_ltlx_sl.setOnFocusChangeListener(focusListener);
        szyfs_ltlx_dj = (EditText) view.findViewById(R.id.szyfs_ltlx_dj);
        szyfs_ltlx_dj.setOnFocusChangeListener(focusListener);
        szyfs_ltlx_tz = (EditText) view.findViewById(R.id.szyfs_ltlx_tz);
        szyfs_ltlx_tz.setOnFocusChangeListener(focusListener);
        szyfs_sl_sl = (EditText) view.findViewById(R.id.szyfs_sl_sl);
        szyfs_sl_sl.setOnFocusChangeListener(focusListener);
        szyfs_sl_dj = (EditText) view.findViewById(R.id.szyfs_sl_dj);
        szyfs_sl_dj.setOnFocusChangeListener(focusListener);
        szyfs_sl_tz = (EditText) view.findViewById(R.id.szyfs_sl_tz);
        szyfs_sl_tz.setOnFocusChangeListener(focusListener);
        szyfs_fyfj_sl = (EditText) view.findViewById(R.id.szyfs_fyfj_sl);
        szyfs_fyfj_sl.setOnFocusChangeListener(focusListener);
        szyfs_fyfj_dj = (EditText) view.findViewById(R.id.szyfs_fyfj_dj);
        szyfs_fyfj_dj.setOnFocusChangeListener(focusListener);
        szyfs_fyfj_tz = (EditText) view.findViewById(R.id.szyfs_fyfj_tz);
        szyfs_fyfj_tz.setOnFocusChangeListener(focusListener);
        szyfs_znhjkzq_sl = (EditText) view.findViewById(R.id.szyfs_znhjkzq_sl);
        szyfs_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        szyfs_znhjkzq_dj = (EditText) view.findViewById(R.id.szyfs_znhjkzq_dj);
        szyfs_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        szyfs_znhjkzq_tz = (EditText) view.findViewById(R.id.szyfs_znhjkzq_tz);
        szyfs_lfdb_sl = (EditText) view.findViewById(R.id.szyfs_lfdb_sl);
        szyfs_lfdb_sl.setOnFocusChangeListener(focusListener);
        szyfs_lfdb_dj = (EditText) view.findViewById(R.id.szyfs_lfdb_dj);
        szyfs_lfdb_dj.setOnFocusChangeListener(focusListener);
        szyfs_lfdb_tz = (EditText) view.findViewById(R.id.szyfs_lfdb_tz);
        szyfs_ysq_sl = (EditText) view.findViewById(R.id.szyfs_ysq_sl);
        szyfs_ysq_sl.setOnFocusChangeListener(focusListener);
        szyfs_ysq_dj = (EditText) view.findViewById(R.id.szyfs_ysq_dj);
        szyfs_ysq_dj.setOnFocusChangeListener(focusListener);
        szyfs_ysq_tz = (EditText) view.findViewById(R.id.szyfs_ysq_tz);
        szyfs_ysq_tz.setOnFocusChangeListener(focusListener);
        szyfs_tzze = (EditText) view.findViewById(R.id.szyfs_tzze);
        bzgls_xqjl_sl = (EditText) view.findViewById(R.id.bzgls_xqjl_sl);
        bzgls_xqjl_sl.setOnFocusChangeListener(focusListener);
        bzgls_xqjl_dj = (EditText) view.findViewById(R.id.bzgls_xqjl_dj);
        bzgls_xqjl_dj.setOnFocusChangeListener(focusListener);
        bzgls_xqjl_tz = (EditText) view.findViewById(R.id.bzgls_xqjl_tz);
        bzgls_xqjl_tz.setOnFocusChangeListener(focusListener);
        bzgls_ltlx_sl = (EditText) view.findViewById(R.id.bzgls_ltlx_sl);
        bzgls_ltlx_sl.setOnFocusChangeListener(focusListener);
        bzgls_ltlx_dj = (EditText) view.findViewById(R.id.bzgls_ltlx_dj);
        bzgls_ltlx_dj.setOnFocusChangeListener(focusListener);
        bzgls_ltlx_tz = (EditText) view.findViewById(R.id.bzgls_ltlx_tz);
        bzgls_sl_sl = (EditText) view.findViewById(R.id.bzgls_sl_sl);
        bzgls_sl_sl.setOnFocusChangeListener(focusListener);
        bzgls_sl_dj = (EditText) view.findViewById(R.id.bzgls_sl_dj);
        bzgls_sl_dj.setOnFocusChangeListener(focusListener);
        bzgls_sl_tz = (EditText) view.findViewById(R.id.bzgls_sl_tz);
        bzgls_fyfj_sl = (EditText) view.findViewById(R.id.bzgls_fyfj_sl);
        bzgls_fyfj_sl.setOnFocusChangeListener(focusListener);
        bzgls_fyfj_dj = (EditText) view.findViewById(R.id.bzgls_fyfj_dj);
        bzgls_fyfj_dj.setOnFocusChangeListener(focusListener);
        bzgls_fyfj_tz = (EditText) view.findViewById(R.id.bzgls_fyfj_tz);
        bzgls_znhjkzq_sl = (EditText) view.findViewById(R.id.bzgls_znhjkzq_sl);
        bzgls_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        bzgls_znhjkzq_dj = (EditText) view.findViewById(R.id.bzgls_znhjkzq_dj);
        bzgls_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        bzgls_znhjkzq_tz = (EditText) view.findViewById(R.id.bzgls_znhjkzq_tz);
        bzgls_lfdb_sl = (EditText) view.findViewById(R.id.bzgls_lfdb_sl);
        bzgls_lfdb_sl.setOnFocusChangeListener(focusListener);
        bzgls_lfdb_dj = (EditText) view.findViewById(R.id.bzgls_lfdb_dj);
        bzgls_lfdb_dj.setOnFocusChangeListener(focusListener);
        bzgls_lfdb_tz = (EditText) view.findViewById(R.id.bzgls_lfdb_tz);
        bzgls_ysq_sl = (EditText) view.findViewById(R.id.bzgls_ysq_sl);
        bzgls_ysq_sl.setOnFocusChangeListener(focusListener);
        bzgls_ysq_dj = (EditText) view.findViewById(R.id.bzgls_ysq_dj);
        bzgls_ysq_dj.setOnFocusChangeListener(focusListener);
        bzgls_ysq_tz = (EditText) view.findViewById(R.id.bzgls_ysq_tz);
        bzgls_tzze = (EditText) view.findViewById(R.id.bzgls_tzze);
        yzgls_xqjl_sl = (EditText) view.findViewById(R.id.yzgls_xqjl_sl);
        yzgls_xqjl_sl.setOnFocusChangeListener(focusListener);
        yzgls_xqjl_dj = (EditText) view.findViewById(R.id.yzgls_xqjl_dj);
        yzgls_xqjl_dj.setOnFocusChangeListener(focusListener);
        yzgls_xqjl_tz = (EditText) view.findViewById(R.id.yzgls_xqjl_tz);
        yzgls_ltlx_sl = (EditText) view.findViewById(R.id.yzgls_ltlx_sl);
        yzgls_ltlx_sl.setOnFocusChangeListener(focusListener);
        yzgls_ltlx_dj = (EditText) view.findViewById(R.id.yzgls_ltlx_dj);
        yzgls_ltlx_dj.setOnFocusChangeListener(focusListener);
        yzgls_ltlx_tz = (EditText) view.findViewById(R.id.yzgls_ltlx_tz);
        yzgls_sl_sl = (EditText) view.findViewById(R.id.yzgls_sl_sl);
        yzgls_sl_sl.setOnFocusChangeListener(focusListener);
        yzgls_sl_dj = (EditText) view.findViewById(R.id.yzgls_sl_dj);
        yzgls_sl_dj.setOnFocusChangeListener(focusListener);
        yzgls_sl_tz = (EditText) view.findViewById(R.id.yzgls_sl_tz);
        yzgls_fyfj_sl = (EditText) view.findViewById(R.id.yzgls_fyfj_sl);
        yzgls_fyfj_sl.setOnFocusChangeListener(focusListener);
        yzgls_fyfj_dj = (EditText) view.findViewById(R.id.yzgls_fyfj_dj);
        yzgls_fyfj_dj.setOnFocusChangeListener(focusListener);
        yzgls_fyfj_tz = (EditText) view.findViewById(R.id.yzgls_fyfj_tz);
        yzgls_znhjkzq_sl = (EditText) view.findViewById(R.id.yzgls_znhjkzq_sl);
        yzgls_znhjkzq_sl.setOnFocusChangeListener(focusListener);
        yzgls_znhjkzq_dj = (EditText) view.findViewById(R.id.yzgls_znhjkzq_dj);
        yzgls_znhjkzq_dj.setOnFocusChangeListener(focusListener);
        yzgls_znhjkzq_tz = (EditText) view.findViewById(R.id.yzgls_znhjkzq_tz);
        yzgls_lfdb_sl = (EditText) view.findViewById(R.id.yzgls_lfdb_sl);
        yzgls_lfdb_sl.setOnFocusChangeListener(focusListener);
        yzgls_lfdb_dj = (EditText) view.findViewById(R.id.yzgls_lfdb_dj);
        yzgls_lfdb_dj.setOnFocusChangeListener(focusListener);
        yzgls_lfdb_tz = (EditText) view.findViewById(R.id.yzgls_lfdb_tz);
        yzgls_ysq_sl = (EditText) view.findViewById(R.id.yzgls_ysq_sl);
        yzgls_ysq_sl.setOnFocusChangeListener(focusListener);
        yzgls_ysq_dj = (EditText) view.findViewById(R.id.yzgls_ysq_dj);
        yzgls_ysq_dj.setOnFocusChangeListener(focusListener);
        yzgls_ysq_tz = (EditText) view.findViewById(R.id.yzgls_ysq_tz);
        yzgls_tzze = (EditText) view.findViewById(R.id.yzgls_tzze);

        initSqlAdd();
    }

    private void initTz(){
        List<SbEntity> sbEntities = App.sqlOpenHelper.queryAllSb();
        if (sbEntities != null && sbEntities.size() >0){
            for (SbEntity sbEntity : sbEntities){
                addTz(sbEntity);
            }
        }
    }


    private void addTz(SbEntity sbEntity){
        if(sbEntity.getSblx() == 0){
            //后备母猪舍
            Constant.hbmzs_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
        }
        else if(sbEntity.getSblx() == 1){
            //公猪及配种壬检母猪舍
            Constant.gzjpzrjmzs_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
        }
        else if(sbEntity.getSblx() == 2){
            //壬辰母猪舍
            Constant.rcmzs_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
        }
        else if(sbEntity.getSblx() == 3){
            //分娩舍
            Constant.fws_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
        }
        else if(sbEntity.getSblx() == 4){
            //保育舍
            Constant.bys_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
        }
        else if(sbEntity.getSblx() == 5){
            //生长育肥舍
            Constant.szyfs_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
        }
        else if(sbEntity.getSblx() == 6){
            //病猪隔离舍
            Constant.bzgls_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
        }
        else if(sbEntity.getSblx() == 7){
            //引种隔离舍
            Constant.yzgls_tzze += sbEntity.getDj()*sbEntity.getSl()/10000;
        }
    }

    private void initSqlAdd(){
        List<SbEntity> sbEntities = App.sqlOpenHelper.queryAllSb();
        if (sbEntities != null && sbEntities.size() >0){
            for (SbEntity sbEntity : sbEntities){
                addView(sbEntity);
            }
        }

    }

    private void addView(SbEntity sbEntity){
        if(sbEntity.getSblx() == 0){
            //后备母猪舍
            addViewByType(hbmzs_Lin,sbEntity);
        }
        else if(sbEntity.getSblx() == 1){
            //公猪及配种壬检母猪舍
            addViewByType(gzjpzrjmzs_Lin,sbEntity);
        }
        else if(sbEntity.getSblx() == 2){
            //壬辰母猪舍
            addViewByType(rcmzs_Lin,sbEntity);
        }
        else if(sbEntity.getSblx() == 3){
            //分娩舍
            addViewByType(fws_Lin,sbEntity);
        }
        else if(sbEntity.getSblx() == 4){
            //保育舍
            addViewByType(bys_Lin,sbEntity);
        }
        else if(sbEntity.getSblx() == 5){
            //生长育肥舍
            addViewByType(szyfs_Lin,sbEntity);
        }
        else if(sbEntity.getSblx() == 6){
            //病猪隔离舍
            addViewByType(bzgls_Lin,sbEntity);
        }
        else if(sbEntity.getSblx() == 7){
            //引种隔离舍
            addViewByType(yzgls_Lin,sbEntity);
        }
    }

    private void addViewByType(LinearLayout lin,SbEntity sbEntity){
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

    @Override
    public void saveData(EditText view, String text) {
        double d = Double.parseDouble(text);
        if (view == hbmzs_xqjl_sl){
            SpUtil.saveSP(getContext(),"hbmzs_xqjl_sl",d);

        }
        else if (view == hbmzs_xqjl_dj){
            SpUtil.saveSP(getContext(),"hbmzs_xqjl_dj",d);

        }
        else if (view == hbmzs_ltlx_sl){
            SpUtil.saveSP(getContext(),"hbmzs_ltlx_sl",d);

        }
        else if (view == hbmzs_ltlx_dj){
            SpUtil.saveSP(getContext(),"hbmzs_ltlx_dj",d);

        }
        else if (view == hbmzs_sl_sl){
            SpUtil.saveSP(getContext(),"hbmzs_sl_sl",d);

        }
        else if (view == hbmzs_sl_dj){
            SpUtil.saveSP(getContext(),"hbmzs_sl_dj",d);

        }
        else if (view == hbmzs_fyfj_sl){
            SpUtil.saveSP(getContext(),"hbmzs_fyfj_sl",d);

        }
        else if (view == hbmzs_fyfj_dj){
            SpUtil.saveSP(getContext(),"hbmzs_fyfj_dj",d);

        }
        else if (view == hbmzs_znhjkzq_sl){
            SpUtil.saveSP(getContext(),"hbmzs_znhjkzq_sl",d);

        }
        else if (view == hbmzs_znhjkzq_dj){
            SpUtil.saveSP(getContext(),"hbmzs_znhjkzq_dj",d);

        }
        else if (view == hbmzs_lfdb_sl){
            SpUtil.saveSP(getContext(),"hbmzs_lfdb_sl",d);

        }else if (view == hbmzs_lfdb_dj){
            SpUtil.saveSP(getContext(),"hbmzs_lfdb_dj",d);

        }
        else if (view == hbmzs_ysq_sl){
            SpUtil.saveSP(getContext(),"hbmzs_ysq_sl",d);

        }else if (view == hbmzs_ysq_dj){
            SpUtil.saveSP(getContext(),"hbmzs_ysq_dj",d);

        }
        else if (view == gzjpzrjmzs_bzj_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_bzj_sl",d);

        }else if (view == gzjpzrjmzs_bzj_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_bzj_dj",d);

        }else if (view == gzjpzrjmzs_jyzlzdfxy_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_jyzlzdfxy_sl",d);

        }else if (view == gzjpzrjmzs_jyzlzdfxy_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_jyzlzdfxy_dj",d);

        }
        else if (view == gzjpzrjmzs_szsj_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_szsj_sl",d);

        }
        else if (view == gzjpzrjmzs_szsj_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_szsj_dj",d);

        }
        else if (view == gzjpzrjmzs_szysjybzdgzj_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_szysjybzdgzj_sl",d);

        }else if (view == gzjpzrjmzs_szysjybzdgzj_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_szysjybzdgzj_dj",d);

        }else if (view == gzjpzrjmzs_xqjl_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_xqjl_sl",d);

        }else if (view == gzjpzrjmzs_xqjl_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_xqjl_dj",d);

        }else if (view == gzjpzrjmzs_ltxx_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_ltxx_sl",d);

        }else if (view == gzjpzrjmzs_ltxx_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_ltxx_dj",d);

        }else if (view == gzjpzrjmzs_sl_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_sl_sl",d);

        }else if (view == gzjpzrjmzs_sl_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_sl_dj",d);

        }else if (view == gzjpzrjmzs_fyfj_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_fyfj_sl",d);

        }
        else if (view == gzjpzrjmzs_fyfj_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_fyfj_dj",d);

        }else if (view == gzjpzrjmzs_znhjkzq_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_znhjkzq_sl",d);

        }else if (view == gzjpzrjmzs_znhjkzq_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_znhjkzq_dj",d);

        }else if (view == gzjpzrjmzs_lfdb_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_lfdb_sl",d);

        }else if (view == gzjpzrjmzs_lfdb_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_lfdb_dj",d);

        }else if (view == gzjpzrjmzs_ysq_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_ysq_sl",d);

        }else if (view == gzjpzrjmzs_ysq_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_ysq_dj",d);

        }else if (view == gzjpzrjmzs_rcvczdy_sl){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_rcvczdy_sl",d);

        }else if (view == gzjpzrjmzs_rcvczdy_dj){
            SpUtil.saveSP(getContext(),"gzjpzrjmzs_rcvczdy_dj",d);

        }
        else if (view == rcmzs_xwl_sl){
            SpUtil.saveSP(getContext(),"rcmzs_xwl_sl",d);

        }else if (view == rcmzs_xwl_dj){
            SpUtil.saveSP(getContext(),"rcmzs_xwl_dj",d);

        }else if (view == rcmzs_ltlx_sl){
            SpUtil.saveSP(getContext(),"rcmzs_ltlx_sl",d);

        }else if (view == rcmzs_ltlx_dj){
            SpUtil.saveSP(getContext(),"rcmzs_ltlx_dj",d);

        }else if (view == rcmzs_sl_sl){
            SpUtil.saveSP(getContext(),"rcmzs_sl_sl",d);

        }else if (view == rcmzs_sl_dj){
            SpUtil.saveSP(getContext(),"rcmzs_sl_dj",d);

        }else if (view == rcmzs_fyfj_sl){
            SpUtil.saveSP(getContext(),"rcmzs_fyfj_sl",d);

        }else if (view == rcmzs_fyfj_dj){
            SpUtil.saveSP(getContext(),"rcmzs_fyfj_dj",d);

        }else if (view == rcmzs_znhjkzq_sl){
            SpUtil.saveSP(getContext(),"rcmzs_znhjkzq_sl",d);

        }else if (view == rcmzs_znhjkzq_dj){
            SpUtil.saveSP(getContext(),"rcmzs_znhjkzq_dj",d);

        }else if (view == rcmzs_lfdb_sl){
            SpUtil.saveSP(getContext(),"rcmzs_lfdb_sl",d);

        }else if (view == rcmzs_lfdb_dj){
            SpUtil.saveSP(getContext(),"rcmzs_lfdb_dj",d);

        }else if (view == rcmzs_ysq_sl){
            SpUtil.saveSP(getContext(),"rcmzs_ysq_sl",d);

        }else if (view == rcmzs_ysq_dj){
            SpUtil.saveSP(getContext(),"rcmzs_ysq_dj",d);

        }else if (view == fws_fwl_sl){
            SpUtil.saveSP(getContext(),"fws_fwl_sl",d);

        }else if (view == fws_fwl_dj){
            SpUtil.saveSP(getContext(),"fws_fwl_dj",d);

        }else if (view == fws_ltlx_sl){
            SpUtil.saveSP(getContext(),"fws_ltlx_sl",d);

        }else if (view == fws_ltlx_dj){
            SpUtil.saveSP(getContext(),"fws_ltlx_dj",d);

        }else if (view == fws_sl_sl){
            SpUtil.saveSP(getContext(),"fws_sl_sl",d);

        }else if (view == fws_sl_dj){
            SpUtil.saveSP(getContext(),"fws_sl_dj",d);

        }else if (view == fws_flsj_sl){
            SpUtil.saveSP(getContext(),"fws_flsj_sl",d);

        }else if (view == fws_flsj_dj){
            SpUtil.saveSP(getContext(),"fws_flsj_dj",d);

        }else if (view == fws_znhjkzq_sl){
            SpUtil.saveSP(getContext(),"fws_znhjkzq_sl",d);

        }else if (view == fws_znhjkzq_dj){
            SpUtil.saveSP(getContext(),"fws_znhjkzq_dj",d);

        }else if (view == fws_ysq_sl){
            SpUtil.saveSP(getContext(),"fws_ysq_sl",d);

        }else if (view == fws_ysq_dj){
            SpUtil.saveSP(getContext(),"fws_ysq_dj",d);

        }else if (view == fws_znbwx_sl){
            SpUtil.saveSP(getContext(),"fws_znbwx_sl",d);

        }else if (view == fws_znbwx_dj){
            SpUtil.saveSP(getContext(),"fws_znbwx_dj",d);

        }else if (view == fws_dhjbysb_sl){
            SpUtil.saveSP(getContext(),"fws_dhjbysb_sl",d);

        }else if (view == fws_dhjbysb_dj){
            SpUtil.saveSP(getContext(),"fws_dhjbysb_dj",d);

        }else if (view == bys_byl_sl){
            SpUtil.saveSP(getContext(),"bys_byl_sl",d);

        }else if (view == bys_byl_dj){
            SpUtil.saveSP(getContext(),"bys_byl_dj",d);

        }else if (view == bys_ltlx_sl){
            SpUtil.saveSP(getContext(),"bys_ltlx_sl",d);

        }else if (view == bys_ltlx_dj){
            SpUtil.saveSP(getContext(),"bys_ltlx_dj",d);

        }else if (view == bys_sl_sl){
            SpUtil.saveSP(getContext(),"bys_sl_sl",d);

        }else if (view == bys_sl_dj){
            SpUtil.saveSP(getContext(),"bys_sl_dj",d);

        }else if (view == bys_fyfj_sl){
            SpUtil.saveSP(getContext(),"bys_fyfj_sl",d);

        }else if (view == bys_fyfj_dj){
            SpUtil.saveSP(getContext(),"bys_fyfj_dj",d);

        }else if (view == bys_znhjkzq_sl){
            SpUtil.saveSP(getContext(),"bys_znhjkzq_sl",d);

        }else if (view == bys_znhjkzq_dj){
            SpUtil.saveSP(getContext(),"bys_znhjkzq_dj",d);

        }else if (view == bys_ysq_sl){
            SpUtil.saveSP(getContext(),"bys_ysq_sl",d);

        }else if (view == bys_ysq_dj){
            SpUtil.saveSP(getContext(),"bys_ysq_dj",d);

        }else if (view == bys_dhjbwsb_sl){
            SpUtil.saveSP(getContext(),"bys_dhjbwsb_sl",d);

        }else if (view == bys_dhjbwsb_dj){
            SpUtil.saveSP(getContext(),"bys_dhjbwsb_dj",d);

        }else if (view == szyfs_xqjl_sl){
            SpUtil.saveSP(getContext(),"szyfs_xqjl_sl",d);

        }else if (view == szyfs_xqjl_dj){
            SpUtil.saveSP(getContext(),"szyfs_xqjl_dj",d);

        }else if (view == szyfs_ltlx_sl){
            SpUtil.saveSP(getContext(),"szyfs_ltlx_sl",d);

        }else if (view == szyfs_ltlx_dj){
            SpUtil.saveSP(getContext(),"szyfs_ltlx_dj",d);

        }else if (view == szyfs_sl_sl){
            SpUtil.saveSP(getContext(),"szyfs_sl_sl",d);

        }else if (view == szyfs_sl_dj){
            SpUtil.saveSP(getContext(),"szyfs_sl_dj",d);

        }else if (view == szyfs_fyfj_sl){
            SpUtil.saveSP(getContext(),"szyfs_fyfj_sl",d);

        }else if (view == szyfs_fyfj_dj){
            SpUtil.saveSP(getContext(),"szyfs_fyfj_dj",d);

        }else if (view == szyfs_znhjkzq_sl){
            SpUtil.saveSP(getContext(),"szyfs_znhjkzq_sl",d);

        }else if (view == szyfs_znhjkzq_dj){
            SpUtil.saveSP(getContext(),"szyfs_znhjkzq_dj",d);

        }else if (view == szyfs_lfdb_sl){
            SpUtil.saveSP(getContext(),"szyfs_lfdb_sl",d);

        }else if (view == szyfs_lfdb_dj){
            SpUtil.saveSP(getContext(),"szyfs_lfdb_dj",d);

        }else if (view == szyfs_ysq_sl){
            SpUtil.saveSP(getContext(),"szyfs_ysq_sl",d);

        }else if (view == szyfs_ysq_dj){
            SpUtil.saveSP(getContext(),"szyfs_ysq_dj",d);

        }else if (view == bzgls_xqjl_sl){
            SpUtil.saveSP(getContext(),"bzgls_xqjl_sl",d);

        }else if (view == bzgls_xqjl_dj){
            SpUtil.saveSP(getContext(),"bzgls_xqjl_dj",d);

        }else if (view == bzgls_ltlx_sl){
            SpUtil.saveSP(getContext(),"bzgls_ltlx_sl",d);

        }else if (view == bzgls_ltlx_dj){
            SpUtil.saveSP(getContext(),"bzgls_ltlx_dj",d);

        }else if (view == bzgls_sl_sl){
            SpUtil.saveSP(getContext(),"bzgls_sl_sl",d);

        }else if (view == bzgls_sl_dj){
            SpUtil.saveSP(getContext(),"bzgls_sl_dj",d);

        }else if (view == bzgls_fyfj_sl){
            SpUtil.saveSP(getContext(),"bzgls_fyfj_sl",d);

        }else if (view == bzgls_fyfj_dj){
            SpUtil.saveSP(getContext(),"bzgls_fyfj_dj",d);

        }else if (view == bzgls_znhjkzq_sl){
            SpUtil.saveSP(getContext(),"bzgls_znhjkzq_sl",d);

        }else if (view == bzgls_znhjkzq_dj){
            SpUtil.saveSP(getContext(),"bzgls_znhjkzq_dj",d);

        }else if (view == bzgls_lfdb_sl){
            SpUtil.saveSP(getContext(),"bzgls_lfdb_sl",d);

        }else if (view == bzgls_lfdb_dj){
            SpUtil.saveSP(getContext(),"bzgls_lfdb_dj",d);

        }else if (view == bzgls_ysq_sl){
            SpUtil.saveSP(getContext(),"bzgls_ysq_sl",d);

        }else if (view == bzgls_ysq_dj){
            SpUtil.saveSP(getContext(),"bzgls_ysq_dj",d);

        }
        else if (view == yzgls_xqjl_sl){
            SpUtil.saveSP(getContext(),"yzgls_xqjl_sl",d);

        }else if (view == yzgls_xqjl_dj){
            SpUtil.saveSP(getContext(),"yzgls_xqjl_dj",d);

        }else if (view == yzgls_ltlx_sl){
            SpUtil.saveSP(getContext(),"yzgls_ltlx_sl",d);

        }else if (view == yzgls_ltlx_dj){
            SpUtil.saveSP(getContext(),"yzgls_ltlx_dj",d);

        }else if (view == yzgls_sl_sl){
            SpUtil.saveSP(getContext(),"yzgls_sl_sl",d);

        }else if (view == yzgls_sl_dj){
            SpUtil.saveSP(getContext(),"yzgls_sl_dj",d);

        }else if (view == yzgls_fyfj_sl){
            SpUtil.saveSP(getContext(),"yzgls_fyfj_sl",d);

        }else if (view == yzgls_fyfj_dj){
            SpUtil.saveSP(getContext(),"yzgls_fyfj_dj",d);

        }else if (view == yzgls_znhjkzq_sl){
            SpUtil.saveSP(getContext(),"yzgls_znhjkzq_sl",d);

        }else if (view == yzgls_znhjkzq_dj){
            SpUtil.saveSP(getContext(),"yzgls_znhjkzq_dj",d);

        }else if (view == yzgls_lfdb_sl){
            SpUtil.saveSP(getContext(),"yzgls_lfdb_sl",d);

        }else if (view == yzgls_lfdb_dj){
            SpUtil.saveSP(getContext(),"yzgls_lfdb_dj",d);

        }else if (view == yzgls_ysq_sl){
            SpUtil.saveSP(getContext(),"yzgls_ysq_sl",d);

        }else if (view == yzgls_ysq_dj){
            SpUtil.saveSP(getContext(),"yzgls_ysq_dj",d);

        }
    }

    @Override
    public void jsDatas() {
        try {


            //先归零
            Constant.hbmzs_tzze = 0;
            Constant.gzjpzrjmzs_tzze = 0;
            Constant.rcmzs_tzze = 0;
            Constant.fws_tzze = 0;
            Constant.bys_tzze = 0;
            Constant.szyfs_tzze = 0;
            Constant.bzgls_tzze = 0;
            Constant.yzgls_tzze = 0;
            //后备母猪舍

            Constant.hbmzs_xqjl_sl = Utils.keep2Wdouble(Constant.zfzyc_hbmzl_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_xqjl_sl",0) != 0)
                Constant.hbmzs_xqjl_sl = SpUtil.getSpDouble(getContext(),"hbmzs_xqjl_sl",0);

            Constant.hbmzs_xqjl_dj = Utils.keep2Wdouble(Constant.gzjxqsyj_dj, 2);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_xqjl_dj",0) != 0)
                Constant.hbmzs_xqjl_dj = SpUtil.getSpDouble(getContext(),"hbmzs_xqjl_dj",0);

            Constant.hbmzs_xqjl_tz = Utils.keep2Wdouble((Constant.hbmzs_xqjl_sl * Constant.hbmzs_xqjl_dj) / 10000, 2);

            Constant.hbmzs_ltlx_sl = Utils.keep2Wdouble(Constant.zfzyc_hbmzl_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_ltlx_sl",0) != 0)
                Constant.hbmzs_ltlx_sl = SpUtil.getSpDouble(getContext(),"hbmzs_ltlx_sl",0);

            Constant.hbmzs_ltlx_dj = Utils.keep2Wdouble(800, 2);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_ltlx_dj",0) != 0)
                Constant.hbmzs_ltlx_dj = SpUtil.getSpDouble(getContext(),"hbmzs_ltlx_dj",0);

            Constant.hbmzs_ltlx_tz = Utils.keep2Wdouble((Constant.hbmzs_ltlx_sl * Constant.hbmzs_ltlx_dj) / 10000, 2);

            Constant.hbmzs_sl_sl = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_gyy * 3 / 65, 0);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_sl_sl",0) != 0)
                Constant.hbmzs_sl_sl = SpUtil.getSpDouble(getContext(),"hbmzs_sl_sl",0);

            Constant.hbmzs_sl_dj = 320;
            if (SpUtil.getSpDouble(getContext(),"hbmzs_sl_dj",0) != 0)
                Constant.hbmzs_sl_dj = SpUtil.getSpDouble(getContext(),"hbmzs_sl_dj",0);

            Constant.hbmzs_sl_tz = Utils.keep2Wdouble((Constant.hbmzs_sl_sl * Constant.hbmzs_sl_dj) / 10000, 2);


            Constant.hbmzs_fyfj_sl = Utils.keep2Wdouble(Math.round(Constant.hbmzs_sl_sl / 2 + 0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_fyfj_sl",0) != 0)
                Constant.hbmzs_fyfj_sl = SpUtil.getSpDouble(getContext(),"hbmzs_fyfj_sl",0);

            Constant.hbmzs_fyfj_dj = 2800;
            if (SpUtil.getSpDouble(getContext(),"hbmzs_fyfj_dj",0) != 0)
                Constant.hbmzs_fyfj_dj = SpUtil.getSpDouble(getContext(),"hbmzs_fyfj_dj",0);

            Constant.hbmzs_fyfj_tz = Utils.keep2Wdouble((Constant.hbmzs_fyfj_sl * Constant.hbmzs_fyfj_dj) / 10000, 2);

            Constant.hbmzs_znhjkzq_sl = Utils.keep2Wdouble(Math.round(Constant.hbmzs_fyfj_sl / 4 ), 0);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_znhjkzq_sl",0) != 0)
                Constant.hbmzs_znhjkzq_sl = SpUtil.getSpDouble(getContext(),"hbmzs_znhjkzq_sl",0);

            Constant.hbmzs_znhjkzq_dj = 20000;
            if (SpUtil.getSpDouble(getContext(),"hbmzs_znhjkzq_dj",0) != 0)
                Constant.hbmzs_znhjkzq_dj = SpUtil.getSpDouble(getContext(),"hbmzs_znhjkzq_dj",0);

            Constant.hbmzs_znhjkzq_tz = Utils.keep2Wdouble((Constant.hbmzs_znhjkzq_sl * Constant.hbmzs_znhjkzq_dj) / 10000, 2);

            Constant.hbmzs_lfdb_sl = Utils.keep2Wdouble(Constant.zfzyc_hbmzs_gyy / 5, 0);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_lfdb_sl",0) != 0)
                Constant.hbmzs_lfdb_sl = SpUtil.getSpDouble(getContext(),"hbmzs_lfdb_sl",0);

            Constant.hbmzs_lfdb_dj = 160;
            if (SpUtil.getSpDouble(getContext(),"hbmzs_lfdb_dj",0) != 0)
                Constant.hbmzs_lfdb_dj = SpUtil.getSpDouble(getContext(),"hbmzs_lfdb_dj",0);

            Constant.hbmzs_lfdb_tz = Utils.keep2Wdouble((Constant.hbmzs_lfdb_sl * Constant.hbmzs_lfdb_dj) / 10000, 2);

            Constant.hbmzs_ysq_sl = Utils.keep2Wdouble(Constant.zfzyc_hbmzl_gyy * 2, 0);
            if (SpUtil.getSpDouble(getContext(),"hbmzs_ysq_sl",0) != 0)
                Constant.hbmzs_ysq_sl = SpUtil.getSpDouble(getContext(),"hbmzs_ysq_sl",0);

            Constant.hbmzs_ysq_dj = 60;
            if (SpUtil.getSpDouble(getContext(),"hbmzs_ysq_dj",0) != 0)
                Constant.hbmzs_ysq_dj = SpUtil.getSpDouble(getContext(),"hbmzs_ysq_dj",0);

            Constant.hbmzs_ysq_tz = Utils.keep2Wdouble((Constant.hbmzs_ysq_sl * Constant.hbmzs_ysq_dj) / 10000, 2);

            Constant.hbmzs_tzze = Utils.keep2Wdouble(Constant.hbmzs_xqjl_tz + Constant.hbmzs_ltlx_tz + Constant.hbmzs_sl_tz + Constant.hbmzs_fyfj_tz
                    + Constant.hbmzs_znhjkzq_tz + Constant.hbmzs_lfdb_tz + Constant.hbmzs_ysq_tz, 2);

            //公猪及配种壬检母猪舍
            Constant.gzjpzrjmzs_bzj_sl = Utils.keep2Wdouble(Math.round(Constant.clmzz / 200), 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_bzj_sl",0) != 0)
                Constant.gzjpzrjmzs_bzj_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_bzj_sl",0);
            Constant.gzjpzrjmzs_bzj_dj = 800;
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_bzj_dj",0) != 0)
                Constant.gzjpzrjmzs_bzj_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_bzj_dj",0);
            Constant.gzjpzrjmzs_bzj_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_bzj_sl * Constant.gzjpzrjmzs_bzj_dj) / 10000, 2);

            Constant.gzjpzrjmzs_jyzlzdfxy_sl = 1;
            if (SpUtil.getSpDouble(getContext(),"hbmzs_xqjl_sl",0) != 0)
                Constant.hbmzs_xqjl_sl = SpUtil.getSpDouble(getContext(),"hbmzs_xqjl_sl",0);
            Constant.gzjpzrjmzs_jyzlzdfxy_dj = 30000;
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_jyzlzdfxy_dj",0) != 0)
                Constant.gzjpzrjmzs_jyzlzdfxy_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_jyzlzdfxy_dj",0);
            Constant.gzjpzrjmzs_jyzlzdfxy_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_jyzlzdfxy_sl * Constant.gzjpzrjmzs_jyzlzdfxy_dj) / 10000, 2);

            Constant.gzjpzrjmzs_szsj_sl = 1;
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_szsj_sl",0) != 0)
                Constant.gzjpzrjmzs_szsj_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_szsj_sl",0);
            Constant.gzjpzrjmzs_szsj_dj = 5000;
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_szsj_dj",0) != 0)
                Constant.gzjpzrjmzs_szsj_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_szsj_dj",0);
            Constant.gzjpzrjmzs_szsj_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_szsj_sl * Constant.gzjpzrjmzs_szsj_dj) / 10000, 2);

            Constant.gzjpzrjmzs_szysjybzdgzj_sl = 1;
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_szysjybzdgzj_sl",0) != 0)
                Constant.gzjpzrjmzs_szysjybzdgzj_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_szysjybzdgzj_sl",0);
            Constant.gzjpzrjmzs_szysjybzdgzj_dj = 5000;
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_szysjybzdgzj_dj",0) != 0)
                Constant.gzjpzrjmzs_szysjybzdgzj_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_szysjybzdgzj_dj",0);
            Constant.gzjpzrjmzs_szysjybzdgzj_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_szysjybzdgzj_sl * Constant.gzjpzrjmzs_szysjybzdgzj_dj) / 10000, 2);

            Constant.gzjpzrjmzs_xqjl_sl = Utils.keep2Wdouble(Constant.zfzyc_pzrjmzl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_xqjl_sl",0) != 0)
                Constant.gzjpzrjmzs_xqjl_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_xqjl_sl",0);
            Constant.gzjpzrjmzs_xqjl_dj = Utils.keep2Wdouble(Constant.gzjxqsyj_dj, 2);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_xqjl_dj",0) != 0)
                Constant.gzjpzrjmzs_xqjl_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_xqjl_dj",0);
            Constant.gzjpzrjmzs_xqjl_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_xqjl_sl * Constant.gzjpzrjmzs_xqjl_dj) / 10000, 2);

            Constant.gzjpzrjmzs_ltxx_sl = Utils.keep2Wdouble(Constant.zfzyc_pzrjmzl_gye * 4, 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_ltxx_sl",0) != 0)
                Constant.gzjpzrjmzs_ltxx_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_ltxx_sl",0);
            Constant.gzjpzrjmzs_ltxx_dj = Utils.keep2Wdouble(800, 2);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_ltxx_dj",0) != 0)
                Constant.gzjpzrjmzs_ltxx_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_ltxx_dj",0);
            Constant.gzjpzrjmzs_ltxx_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_ltxx_sl * Constant.gzjpzrjmzs_ltxx_dj) / 10000, 2);

            Constant.gzjpzrjmzs_sl_sl = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gye * 3 / 65, 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_sl_sl",0) != 0)
                Constant.gzjpzrjmzs_sl_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_sl_sl",0);
            Constant.gzjpzrjmzs_sl_dj = Utils.keep2Wdouble(320, 2);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_sl_dj",0) != 0)
                Constant.gzjpzrjmzs_sl_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_sl_dj",0);
            Constant.gzjpzrjmzs_sl_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_sl_sl * Constant.gzjpzrjmzs_sl_dj) / 10000, 2);

            Constant.gzjpzrjmzs_fyfj_sl = Utils.keep2Wdouble(Math.round(Constant.gzjpzrjmzs_sl_sl / 2 ), 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_fyfj_sl",0) != 0)
                Constant.gzjpzrjmzs_fyfj_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_fyfj_sl",0);
            Constant.gzjpzrjmzs_fyfj_dj = Utils.keep2Wdouble(2800, 2);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_fyfj_dj",0) != 0)
                Constant.gzjpzrjmzs_fyfj_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_fyfj_dj",0);
            Constant.gzjpzrjmzs_fyfj_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_fyfj_sl * Constant.gzjpzrjmzs_fyfj_dj) / 10000, 2);

            Constant.gzjpzrjmzs_znhjkzq_sl = Utils.keep2Wdouble(Math.round(Constant.gzjpzrjmzs_fyfj_sl / 4 -0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_znhjkzq_sl",0) != 0)
                Constant.gzjpzrjmzs_znhjkzq_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_znhjkzq_sl",0);
            Constant.gzjpzrjmzs_znhjkzq_dj = Utils.keep2Wdouble(20000, 2);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_znhjkzq_dj",0) != 0)
                Constant.gzjpzrjmzs_znhjkzq_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_znhjkzq_dj",0);
            Constant.gzjpzrjmzs_znhjkzq_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_znhjkzq_sl * Constant.gzjpzrjmzs_znhjkzq_dj) / 10000, 2);


            Constant.gzjpzrjmzs_lfdb_sl = Utils.keep2Wdouble(Constant.zfzyc_gzjpzrjmzs_gye / 5, 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_lfdb_sl",0) != 0)
                Constant.gzjpzrjmzs_lfdb_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_lfdb_sl",0);
            Constant.gzjpzrjmzs_lfdb_dj = Utils.keep2Wdouble(160, 2);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_lfdb_dj",0) != 0)
                Constant.gzjpzrjmzs_lfdb_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_lfdb_dj",0);
            Constant.gzjpzrjmzs_lfdb_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_lfdb_sl * Constant.gzjpzrjmzs_lfdb_dj) / 10000, 2);

            Constant.gzjpzrjmzs_ysq_sl = Utils.keep2Wdouble(Constant.zfzyc_pzrjmzl_gye * 2, 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_ysq_sl",0) != 0)
                Constant.gzjpzrjmzs_ysq_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_ysq_sl",0);
            Constant.gzjpzrjmzs_ysq_dj = Utils.keep2Wdouble(60, 2);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_ysq_dj",0) != 0)
                Constant.gzjpzrjmzs_ysq_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_ysq_dj",0);
            Constant.gzjpzrjmzs_ysq_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_ysq_sl * Constant.gzjpzrjmzs_ysq_dj) / 10000, 2);


            Constant.gzjpzrjmzs_rcvczdy_sl = Utils.keep2Wdouble(1, 0);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_rcvczdy_sl",0) != 0)
                Constant.gzjpzrjmzs_rcvczdy_sl = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_rcvczdy_sl",0);
            Constant.gzjpzrjmzs_rcvczdy_dj = Utils.keep2Wdouble(12000, 2);
            if (SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_rcvczdy_dj",0) != 0)
                Constant.gzjpzrjmzs_rcvczdy_dj = SpUtil.getSpDouble(getContext(),"gzjpzrjmzs_rcvczdy_dj",0);
            Constant.gzjpzrjmzs_rcvczdy_tz = Utils.keep2Wdouble((Constant.gzjpzrjmzs_rcvczdy_sl * Constant.gzjpzrjmzs_rcvczdy_dj) / 10000, 2);

            Constant.gzjpzrjmzs_tzze = Utils.keep2Wdouble(Constant.gzjpzrjmzs_xqjl_tz + Constant.gzjpzrjmzs_ltxx_tz + Constant.gzjpzrjmzs_sl_tz + Constant.gzjpzrjmzs_fyfj_tz
                    + Constant.gzjpzrjmzs_znhjkzq_tz + Constant.gzjpzrjmzs_lfdb_tz + Constant.gzjpzrjmzs_ysq_tz + Constant.gzjpzrjmzs_bzj_tz +
                    Constant.gzjpzrjmzs_jyzlzdfxy_tz + Constant.gzjpzrjmzs_szsj_tz + Constant.gzjpzrjmzs_szysjybzdgzj_tz + Constant.gzjpzrjmzs_rcvczdy_tz, 2);


            //妊娠母猪舍
            Constant.rcmzs_xwl_sl = Utils.keep2Wdouble(Constant.zfzyc_rcmzl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_xwl_sl",0) != 0)
                Constant.rcmzs_xwl_sl = SpUtil.getSpDouble(getContext(),"rcmzs_xwl_sl",0);
            Constant.rcmzs_xwl_dj = Utils.keep2Wdouble(680, 2);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_xwl_dj",0) != 0)
                Constant.rcmzs_xwl_dj = SpUtil.getSpDouble(getContext(),"rcmzs_xwl_dj",0);
            Constant.rcmzs_xwl_tz = Utils.keep2Wdouble((Constant.rcmzs_xwl_sl * Constant.rcmzs_xwl_dj) / 10000, 2);

            Constant.rcmzs_ltlx_sl = Utils.keep2Wdouble(Constant.zfzyc_rcmzl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_ltlx_sl",0) != 0)
                Constant.rcmzs_ltlx_sl = SpUtil.getSpDouble(getContext(),"rcmzs_ltlx_sl",0);
            Constant.rcmzs_ltlx_dj = Utils.keep2Wdouble(800, 2);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_ltlx_dj",0) != 0)
                Constant.rcmzs_ltlx_dj = SpUtil.getSpDouble(getContext(),"rcmzs_ltlx_dj",0);
            Constant.rcmzs_ltlx_tz = Utils.keep2Wdouble((Constant.rcmzs_ltlx_sl * Constant.rcmzs_ltlx_dj) / 10000, 2);

            Constant.rcmzs_sl_sl = Utils.keep2Wdouble(Constant.zfzyc_rcmzs_gye * 3 / 65, 0);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_sl_sl",0) != 0)
                Constant.rcmzs_sl_sl = SpUtil.getSpDouble(getContext(),"rcmzs_sl_sl",0);
            Constant.rcmzs_sl_dj = Utils.keep2Wdouble(320, 2);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_sl_dj",0) != 0)
                Constant.rcmzs_sl_dj = SpUtil.getSpDouble(getContext(),"rcmzs_sl_dj",0);
            Constant.rcmzs_sl_tz = Utils.keep2Wdouble((Constant.rcmzs_sl_sl * Constant.rcmzs_sl_dj) / 10000, 2);

            Constant.rcmzs_fyfj_sl = Utils.keep2Wdouble(Math.round(Constant.rcmzs_sl_sl / 2 ), 0);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_fyfj_sl",0) != 0)
                Constant.rcmzs_fyfj_sl = SpUtil.getSpDouble(getContext(),"rcmzs_fyfj_sl",0);
            Constant.rcmzs_fyfj_dj = Utils.keep2Wdouble(2800, 2);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_fyfj_dj",0) != 0)
                Constant.rcmzs_fyfj_dj = SpUtil.getSpDouble(getContext(),"rcmzs_fyfj_dj",0);
            Constant.rcmzs_fyfj_tz = Utils.keep2Wdouble((Constant.rcmzs_fyfj_sl * Constant.rcmzs_fyfj_dj) / 10000, 2);

            Constant.rcmzs_znhjkzq_sl = Utils.keep2Wdouble(Math.round(Constant.rcmzs_fyfj_sl / 4 -0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_znhjkzq_sl",0) != 0)
                Constant.rcmzs_znhjkzq_sl = SpUtil.getSpDouble(getContext(),"rcmzs_znhjkzq_sl",0);
            Constant.rcmzs_znhjkzq_dj = Utils.keep2Wdouble(20000, 2);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_znhjkzq_dj",0) != 0)
                Constant.rcmzs_znhjkzq_dj = SpUtil.getSpDouble(getContext(),"rcmzs_znhjkzq_dj",0);
            Constant.rcmzs_znhjkzq_tz = Utils.keep2Wdouble((Constant.rcmzs_znhjkzq_sl * Constant.rcmzs_znhjkzq_dj) / 10000, 2);

            Constant.rcmzs_lfdb_sl = Utils.keep2Wdouble(Constant.zfzyc_fws_gye / 3, 0);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_lfdb_sl",0) != 0)
                Constant.rcmzs_lfdb_sl = SpUtil.getSpDouble(getContext(),"rcmzs_lfdb_sl",0);
            Constant.rcmzs_lfdb_dj = Utils.keep2Wdouble(160, 2);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_lfdb_dj",0) != 0)
                Constant.rcmzs_lfdb_dj = SpUtil.getSpDouble(getContext(),"rcmzs_lfdb_dj",0);
            Constant.rcmzs_lfdb_tz = Utils.keep2Wdouble((Constant.rcmzs_lfdb_sl * Constant.rcmzs_lfdb_dj) / 10000, 2);

            Constant.rcmzs_ysq_sl = Utils.keep2Wdouble(Constant.zfzyc_rcmzl_gye , 0);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_ysq_sl",0) != 0)
                Constant.rcmzs_ysq_sl = SpUtil.getSpDouble(getContext(),"rcmzs_ysq_sl",0);
            Constant.rcmzs_ysq_dj = Utils.keep2Wdouble(60, 2);
            if (SpUtil.getSpDouble(getContext(),"rcmzs_ysq_dj",0) != 0)
                Constant.rcmzs_ysq_dj = SpUtil.getSpDouble(getContext(),"rcmzs_ysq_dj",0);
            Constant.rcmzs_ysq_tz = Utils.keep2Wdouble((Constant.rcmzs_ysq_sl * Constant.rcmzs_ysq_dj) / 10000, 2);

            Constant.rcmzs_tzze = Utils.keep2Wdouble(Constant.rcmzs_xwl_tz + Constant.rcmzs_ltlx_tz + Constant.rcmzs_sl_tz + Constant.rcmzs_fyfj_tz
                    + Constant.rcmzs_znhjkzq_tz + Constant.rcmzs_lfdb_tz + Constant.rcmzs_ysq_tz, 2);

            //分娩栏舍
            Constant.fws_fwl_sl = Utils.keep2Wdouble(Constant.zfzyc_fwl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"fws_fwl_sl",0) != 0)
                Constant.fws_fwl_sl = SpUtil.getSpDouble(getContext(),"fws_fwl_sl",0);
            Constant.fws_fwl_dj = Utils.keep2Wdouble(3200, 2);
            if (SpUtil.getSpDouble(getContext(),"fws_fwl_dj",0) != 0)
                Constant.fws_fwl_dj = SpUtil.getSpDouble(getContext(),"fws_fwl_dj",0);
            Constant.fws_fwl_tz = Utils.keep2Wdouble((Constant.fws_fwl_sl * Constant.fws_fwl_dj) / 10000, 2);


            Constant.fws_ltlx_sl = Utils.keep2Wdouble(Constant.zfzyc_fwl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"fws_ltlx_sl",0) != 0)
                Constant.fws_ltlx_sl = SpUtil.getSpDouble(getContext(),"fws_ltlx_sl",0);
            Constant.fws_ltlx_dj = Utils.keep2Wdouble(800, 2);
            if (SpUtil.getSpDouble(getContext(),"fws_ltlx_dj",0) != 0)
                Constant.fws_ltlx_dj = SpUtil.getSpDouble(getContext(),"fws_ltlx_dj",0);
            Constant.fws_ltlx_tz = Utils.keep2Wdouble((Constant.fws_ltlx_sl * Constant.fws_ltlx_dj) / 10000, 2);
           // LogUtil.e(Constant.fws_ltlx_sl+"---"+Constant.fws_ltlx_dj);


            Constant.fws_sl_sl = Utils.keep2Wdouble(Constant.zfzyc_fws_gyy * 3 / 65, 0);
            if (SpUtil.getSpDouble(getContext(),"fws_sl_sl",0) != 0)
                Constant.fws_sl_sl = SpUtil.getSpDouble(getContext(),"fws_sl_sl",0);
            Constant.fws_sl_dj = Utils.keep2Wdouble(320, 2);
            if (SpUtil.getSpDouble(getContext(),"fws_sl_dj",0) != 0)
                Constant.fws_sl_dj = SpUtil.getSpDouble(getContext(),"fws_sl_dj",0);
            Constant.fws_sl_tz = Utils.keep2Wdouble((Constant.fws_sl_sl * Constant.fws_sl_dj) / 10000, 2);

            Constant.fws_flsj_sl = Utils.keep2Wdouble(Math.round(Constant.fws_sl_sl / 2 ), 0);
            if (SpUtil.getSpDouble(getContext(),"fws_flsj_sl",0) != 0)
                Constant.fws_flsj_sl = SpUtil.getSpDouble(getContext(),"fws_flsj_sl",0);
            Constant.fws_flsj_dj = Utils.keep2Wdouble(2800, 2);
            if (SpUtil.getSpDouble(getContext(),"fws_flsj_dj",0) != 0)
                Constant.fws_flsj_dj = SpUtil.getSpDouble(getContext(),"fws_flsj_dj",0);
            Constant.fws_flsj_tz = Utils.keep2Wdouble((Constant.fws_flsj_sl * Constant.fws_flsj_dj) / 10000, 2);

            Constant.fws_znhjkzq_sl = Utils.keep2Wdouble(Math.round(Constant.fws_flsj_sl / 4 - 0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"fws_znhjkzq_sl",0) != 0)
                Constant.fws_znhjkzq_sl = SpUtil.getSpDouble(getContext(),"fws_znhjkzq_sl",0);
            Constant.fws_znhjkzq_dj = Utils.keep2Wdouble(20000, 2);
            if (SpUtil.getSpDouble(getContext(),"fws_znhjkzq_dj",0) != 0)
                Constant.fws_znhjkzq_dj = SpUtil.getSpDouble(getContext(),"fws_znhjkzq_dj",0);
            Constant.fws_znhjkzq_tz = Utils.keep2Wdouble((Constant.fws_znhjkzq_sl * Constant.fws_znhjkzq_dj) / 10000, 2);

            LogUtil.e(Constant.fws_znhjkzq_sl+"-----"+Constant.fws_znhjkzq_dj+"---"+Constant.fws_znhjkzq_tz);

            Constant.fws_ysq_sl = Utils.keep2Wdouble(Constant.zfzyc_fwl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"fws_ysq_sl",0) != 0)
                Constant.fws_ysq_sl = SpUtil.getSpDouble(getContext(),"fws_ysq_sl",0);
            Constant.fws_ysq_dj = Utils.keep2Wdouble(60, 2);
            if (SpUtil.getSpDouble(getContext(),"fws_ysq_dj",0) != 0)
                Constant.fws_ysq_dj = SpUtil.getSpDouble(getContext(),"fws_ysq_dj",0);
            Constant.fws_ysq_tz = Utils.keep2Wdouble((Constant.fws_ysq_sl * Constant.fws_ysq_dj) / 10000, 2);


            Constant.fws_znbwx_sl = Utils.keep2Wdouble(Constant.zfzyc_fwl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"fws_znbwx_sl",0) != 0)
                Constant.fws_znbwx_sl = SpUtil.getSpDouble(getContext(),"fws_znbwx_sl",0);
            Constant.fws_znbwx_dj = Utils.keep2Wdouble(1500, 2);
            if (SpUtil.getSpDouble(getContext(),"fws_znbwx_dj",0) != 0)
                Constant.fws_znbwx_dj = SpUtil.getSpDouble(getContext(),"fws_znbwx_dj",0);
            Constant.fws_znbwx_tz = Utils.keep2Wdouble((Constant.fws_znbwx_sl * Constant.fws_znbwx_dj) / 10000, 2);


            Constant.fws_dhjbysb_sl = Utils.keep2Wdouble(Constant.zfzyc_fws_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"fws_dhjbysb_sl",0) != 0)
                Constant.fws_dhjbysb_sl = SpUtil.getSpDouble(getContext(),"fws_dhjbysb_sl",0);
            Constant.fws_dhjbysb_dj = Utils.keep2Wdouble(150, 2);
            if (SpUtil.getSpDouble(getContext(),"fws_dhjbysb_dj",0) != 0)
                Constant.fws_dhjbysb_dj = SpUtil.getSpDouble(getContext(),"fws_dhjbysb_dj",0);
            Constant.fws_dhjbysb_tz = Utils.keep2Wdouble((Constant.fws_dhjbysb_sl * Constant.fws_dhjbysb_dj) / 10000, 2);

            Constant.fws_tzze = Utils.keep2Wdouble(Constant.fws_fwl_tz + Constant.fws_ltlx_tz + Constant.fws_sl_tz
                    + Constant.fws_znhjkzq_tz + Constant.fws_znbwx_tz + Constant.fws_ysq_tz + Constant.fws_dhjbysb_tz+Constant.fws_flsj_tz, 2);

            LogUtil.e(Constant.fws_fwl_tz +"---"+ Constant.fws_ltlx_tz +"---"+  Constant.fws_sl_tz
                    +"---"+  Constant.fws_znhjkzq_tz +"---"+  Constant.fws_znbwx_tz+"---"+  Constant.fws_ysq_tz +"---"+  Constant.fws_dhjbysb_tz+"---"+ Constant.fws_flsj_tz);
            //保育舍
            Constant.bys_byl_sl = Utils.keep2Wdouble(Constant.zfzyc_byl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"bys_byl_sl",0) != 0)
                Constant.bys_byl_sl = SpUtil.getSpDouble(getContext(),"bys_byl_sl",0);
            Constant.bys_byl_dj = Utils.keep2Wdouble(1950, 2);
            if (SpUtil.getSpDouble(getContext(),"bys_byl_dj",0) != 0)
                Constant.bys_byl_dj = SpUtil.getSpDouble(getContext(),"bys_byl_dj",0);
            Constant.bys_byl_tz = Utils.keep2Wdouble((Constant.bys_byl_sl * Constant.bys_byl_dj) / 10000, 2);

            Constant.bys_ltlx_sl = Utils.keep2Wdouble(Constant.zfzyc_byl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"bys_ltlx_sl",0) != 0)
                Constant.bys_ltlx_sl = SpUtil.getSpDouble(getContext(),"bys_ltlx_sl",0);
            Constant.bys_ltlx_dj = Utils.keep2Wdouble(800, 2);
            if (SpUtil.getSpDouble(getContext(),"bys_ltlx_dj",0) != 0)
                Constant.bys_ltlx_dj = SpUtil.getSpDouble(getContext(),"bys_ltlx_dj",0);
            Constant.bys_ltlx_tz = Utils.keep2Wdouble((Constant.bys_ltlx_sl * Constant.bys_ltlx_dj) / 10000, 2);
            LogUtil.e(Constant.bys_ltlx_sl+"---"+Constant.bys_ltlx_dj);
            Constant.bys_sl_sl = Utils.keep2Wdouble(Constant.zfzyc_bys_gyy * 3 / 65 +0.5, 0);
            if (SpUtil.getSpDouble(getContext(),"bys_sl_sl",0) != 0)
                Constant.bys_sl_sl = SpUtil.getSpDouble(getContext(),"bys_sl_sl",0);
            Constant.bys_sl_dj = Utils.keep2Wdouble(320, 2);
            if (SpUtil.getSpDouble(getContext(),"bys_sl_dj",0) != 0)
                Constant.bys_sl_dj = SpUtil.getSpDouble(getContext(),"bys_sl_dj",0);
            Constant.bys_sl_tz = Utils.keep2Wdouble((Constant.bys_sl_sl * Constant.bys_sl_dj) / 10000, 2);

            Constant.bys_fyfj_sl = Utils.keep2Wdouble(Constant.bys_sl_sl / 2 , 0);
            if (SpUtil.getSpDouble(getContext(),"bys_fyfj_sl",0) != 0)
                Constant.bys_fyfj_sl = SpUtil.getSpDouble(getContext(),"bys_fyfj_sl",0);
            Constant.bys_fyfj_dj = Utils.keep2Wdouble(2800, 2);
            if (SpUtil.getSpDouble(getContext(),"bys_fyfj_dj",0) != 0)
                Constant.bys_fyfj_dj = SpUtil.getSpDouble(getContext(),"bys_fyfj_dj",0);
            Constant.bys_fyfj_tz = Utils.keep2Wdouble((Constant.bys_fyfj_sl * Constant.bys_fyfj_dj) / 10000, 2);

            Constant.bys_znhjkzq_sl = Utils.keep2Wdouble(Math.round(Constant.bys_fyfj_sl / 4 - 0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"bys_znhjkzq_sl",0) != 0)
                Constant.bys_znhjkzq_sl = SpUtil.getSpDouble(getContext(),"bys_znhjkzq_sl",0);
            Constant.bys_znhjkzq_dj = Utils.keep2Wdouble(20000, 2);
            if (SpUtil.getSpDouble(getContext(),"bys_znhjkzq_dj",0) != 0)
                Constant.bys_znhjkzq_dj = SpUtil.getSpDouble(getContext(),"bys_znhjkzq_dj",0);
            Constant.bys_znhjkzq_tz = Utils.keep2Wdouble((Constant.bys_znhjkzq_sl * Constant.bys_znhjkzq_dj) / 10000, 2);

            Constant.bys_ysq_sl = Utils.keep2Wdouble(Constant.zfzyc_byl_gye, 0);
            if (SpUtil.getSpDouble(getContext(),"bys_ysq_sl",0) != 0)
                Constant.bys_ysq_sl = SpUtil.getSpDouble(getContext(),"bys_ysq_sl",0);
            Constant.bys_ysq_dj = Utils.keep2Wdouble(60, 2);
            if (SpUtil.getSpDouble(getContext(),"bys_ysq_dj",0) != 0)
                Constant.bys_ysq_dj = SpUtil.getSpDouble(getContext(),"bys_ysq_dj",0);
            Constant.bys_ysq_tz = Utils.keep2Wdouble((Constant.bys_ysq_sl * Constant.bys_ysq_dj) / 10000, 2);

            Constant.bys_dhjbwsb_sl = Utils.keep2Wdouble(Constant.zfzyc_bys_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"bys_dhjbwsb_sl",0) != 0)
                Constant.bys_dhjbwsb_sl = SpUtil.getSpDouble(getContext(),"bys_dhjbwsb_sl",0);
            Constant.bys_dhjbwsb_dj = Utils.keep2Wdouble(150, 2);
            if (SpUtil.getSpDouble(getContext(),"bys_dhjbwsb_dj",0) != 0)
                Constant.bys_dhjbwsb_dj = SpUtil.getSpDouble(getContext(),"bys_dhjbwsb_dj",0);
            Constant.bys_dhjbwsb_tz = Utils.keep2Wdouble((Constant.bys_dhjbwsb_sl * Constant.bys_dhjbwsb_dj) / 10000, 2);

            Constant.bys_tzze = Utils.keep2Wdouble(Constant.bys_byl_tz + Constant.bys_fyfj_tz + Constant.bys_sl_tz + Constant.bys_ltlx_tz
                    + Constant.bys_znhjkzq_tz + Constant.bys_ysq_tz + Constant.bys_dhjbwsb_tz, 2);


            //生长育肥舍
            Constant.szyfs_xqjl_sl = Utils.keep2Wdouble(Constant.zfzyc_szyfl_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"szyfs_xqjl_sl",0) != 0)
                Constant.szyfs_xqjl_sl = SpUtil.getSpDouble(getContext(),"szyfs_xqjl_sl",0);
            Constant.szyfs_xqjl_dj = Utils.keep2Wdouble(Constant.gzjxqsyj_dj, 2);
            if (SpUtil.getSpDouble(getContext(),"szyfs_xqjl_dj",0) != 0)
                Constant.szyfs_xqjl_dj = SpUtil.getSpDouble(getContext(),"szyfs_xqjl_dj",0);
            Constant.szyfs_xqjl_tz = Utils.keep2Wdouble((Constant.szyfs_xqjl_sl * Constant.szyfs_xqjl_dj) / 10000, 2);

            Constant.szyfs_ltlx_sl = Utils.keep2Wdouble(Constant.zfzyc_szyfl_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"szyfs_ltlx_sl",0) != 0)
                Constant.szyfs_ltlx_sl = SpUtil.getSpDouble(getContext(),"szyfs_ltlx_sl",0);
            Constant.szyfs_ltlx_dj = Utils.keep2Wdouble(800, 2);
            if (SpUtil.getSpDouble(getContext(),"szyfs_ltlx_dj",0) != 0)
                Constant.szyfs_ltlx_dj = SpUtil.getSpDouble(getContext(),"szyfs_ltlx_dj",0);
            Constant.szyfs_ltlx_tz = Utils.keep2Wdouble((Constant.szyfs_ltlx_sl * Constant.szyfs_ltlx_dj) / 10000, 2);

            Constant.szyfs_sl_sl = Utils.keep2Wdouble(Constant.zfzyc_szyfs_gyy * 3 / 65, 0);
            if (SpUtil.getSpDouble(getContext(),"szyfs_sl_sl",0) != 0)
                Constant.szyfs_sl_sl = SpUtil.getSpDouble(getContext(),"szyfs_sl_sl",0);
            Constant.szyfs_sl_dj = Utils.keep2Wdouble(320, 2);
            if (SpUtil.getSpDouble(getContext(),"szyfs_sl_dj",0) != 0)
                Constant.szyfs_sl_dj = SpUtil.getSpDouble(getContext(),"szyfs_sl_dj",0);
            Constant.szyfs_sl_tz = Utils.keep2Wdouble((Constant.szyfs_sl_sl * Constant.szyfs_sl_dj) / 10000, 2);


            Constant.szyfs_fyfj_sl = Utils.keep2Wdouble(Math.round(Constant.szyfs_sl_sl / 2 + 0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"szyfs_fyfj_sl",0) != 0)
                Constant.szyfs_fyfj_sl = SpUtil.getSpDouble(getContext(),"szyfs_fyfj_sl",0);
            Constant.szyfs_fyfj_dj = Utils.keep2Wdouble(2800, 2);
            if (SpUtil.getSpDouble(getContext(),"szyfs_fyfj_dj",0) != 0)
                Constant.szyfs_fyfj_dj = SpUtil.getSpDouble(getContext(),"szyfs_fyfj_dj",0);
            Constant.szyfs_fyfj_tz = Utils.keep2Wdouble((Constant.szyfs_fyfj_sl * Constant.szyfs_fyfj_dj) / 10000, 2);

            Constant.szyfs_znhjkzq_sl = Utils.keep2Wdouble(Math.round(Constant.szyfs_fyfj_sl / 4 - 0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"szyfs_znhjkzq_sl",0) != 0)
                Constant.szyfs_znhjkzq_sl = SpUtil.getSpDouble(getContext(),"szyfs_znhjkzq_sl",0);
            Constant.szyfs_znhjkzq_dj = Utils.keep2Wdouble(20000, 2);
            if (SpUtil.getSpDouble(getContext(),"szyfs_znhjkzq_dj",0) != 0)
                Constant.szyfs_znhjkzq_dj = SpUtil.getSpDouble(getContext(),"szyfs_znhjkzq_dj",0);
            Constant.szyfs_znhjkzq_tz = Utils.keep2Wdouble((Constant.szyfs_znhjkzq_sl * Constant.szyfs_znhjkzq_dj) / 10000, 2);

            Constant.szyfs_lfdb_sl = Utils.keep2Wdouble(Constant.zfzyc_szyfs_gyy / 5, 0);
            if (SpUtil.getSpDouble(getContext(),"szyfs_lfdb_sl",0) != 0)
                Constant.szyfs_lfdb_sl = SpUtil.getSpDouble(getContext(),"szyfs_lfdb_sl",0);
            Constant.szyfs_lfdb_dj = Utils.keep2Wdouble(160, 2);
            if (SpUtil.getSpDouble(getContext(),"szyfs_lfdb_dj",0) != 0)
                Constant.szyfs_lfdb_dj = SpUtil.getSpDouble(getContext(),"szyfs_lfdb_dj",0);
            Constant.szyfs_lfdb_tz = Utils.keep2Wdouble((Constant.szyfs_lfdb_sl * Constant.szyfs_lfdb_dj) / 10000, 2);

            Constant.szyfs_ysq_sl = Utils.keep2Wdouble(Constant.zfzyc_szyfl_gyy * 2, 0);
            if (SpUtil.getSpDouble(getContext(),"szyfs_ysq_sl",0) != 0)
                Constant.szyfs_ysq_sl = SpUtil.getSpDouble(getContext(),"szyfs_ysq_sl",0);
            Constant.szyfs_ysq_dj = Utils.keep2Wdouble(60, 2);
            if (SpUtil.getSpDouble(getContext(),"szyfs_ysq_dj",0) != 0)
                Constant.szyfs_ysq_dj = SpUtil.getSpDouble(getContext(),"szyfs_ysq_dj",0);
            Constant.szyfs_ysq_tz = Utils.keep2Wdouble((Constant.szyfs_ysq_sl * Constant.szyfs_ysq_dj) / 10000, 2);

            Constant.szyfs_tzze = Utils.keep2Wdouble(Constant.szyfs_xqjl_tz + Constant.szyfs_ltlx_tz + Constant.szyfs_sl_tz + Constant.szyfs_fyfj_tz
                    + Constant.szyfs_znhjkzq_tz + Constant.szyfs_lfdb_tz + Constant.szyfs_ysq_tz, 2);

            //病猪隔离舍
            Constant.bzgls_xqjl_sl = Utils.keep2Wdouble(Constant.zfzyc_bzgll_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"bzgls_xqjl_sl",0) != 0)
                Constant.bzgls_xqjl_sl = SpUtil.getSpDouble(getContext(),"bzgls_xqjl_sl",0);
            Constant.bzgls_xqjl_dj = Utils.keep2Wdouble(1950, 2);
            if (SpUtil.getSpDouble(getContext(),"bzgls_xqjl_dj",0) != 0)
                Constant.bzgls_xqjl_dj = SpUtil.getSpDouble(getContext(),"bzgls_xqjl_dj",0);
            Constant.bzgls_xqjl_tz = Utils.keep2Wdouble((Constant.bzgls_xqjl_sl * Constant.bzgls_xqjl_dj) / 10000, 2);

            Constant.bzgls_ltlx_sl = Utils.keep2Wdouble(Constant.zfzyc_bzgll_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"bzgls_ltlx_sl",0) != 0)
                Constant.bzgls_ltlx_sl = SpUtil.getSpDouble(getContext(),"bzgls_ltlx_sl",0);
            Constant.bzgls_ltlx_dj = Utils.keep2Wdouble(800, 2);
            if (SpUtil.getSpDouble(getContext(),"bzgls_ltlx_dj",0) != 0)
                Constant.bzgls_ltlx_dj = SpUtil.getSpDouble(getContext(),"bzgls_ltlx_dj",0);
            Constant.bzgls_ltlx_tz = Utils.keep2Wdouble((Constant.bzgls_ltlx_sl * Constant.bzgls_ltlx_dj) / 10000, 2);

            Constant.bzgls_sl_sl = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gyy * 3 / 65, 0);
            if (SpUtil.getSpDouble(getContext(),"bzgls_sl_sl",0) != 0)
                Constant.bzgls_sl_sl = SpUtil.getSpDouble(getContext(),"bzgls_sl_sl",0);
            Constant.bzgls_sl_dj = Utils.keep2Wdouble(320, 2);
            if (SpUtil.getSpDouble(getContext(),"bzgls_sl_dj",0) != 0)
                Constant.bzgls_sl_dj = SpUtil.getSpDouble(getContext(),"bzgls_sl_dj",0);
            Constant.bzgls_sl_tz = Utils.keep2Wdouble((Constant.bzgls_sl_sl * Constant.bzgls_sl_dj) / 10000, 2);


            Constant.bzgls_fyfj_sl = Utils.keep2Wdouble(Math.round(Constant.bzgls_sl_sl / 2 + 0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"bzgls_fyfj_sl",0) != 0)
                Constant.bzgls_fyfj_sl = SpUtil.getSpDouble(getContext(),"bzgls_fyfj_sl",0);
            Constant.bzgls_fyfj_dj = Utils.keep2Wdouble(2800, 2);
            if (SpUtil.getSpDouble(getContext(),"bzgls_fyfj_dj",0) != 0)
                Constant.bzgls_fyfj_dj = SpUtil.getSpDouble(getContext(),"bzgls_fyfj_dj",0);
            Constant.bzgls_fyfj_tz = Utils.keep2Wdouble((Constant.bzgls_fyfj_sl * Constant.bzgls_fyfj_dj) / 10000, 2);

            Constant.bzgls_znhjkzq_sl = Utils.keep2Wdouble(Math.round(Constant.bzgls_fyfj_sl / 4 - 0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"bzgls_znhjkzq_sl",0) != 0)
                Constant.bzgls_znhjkzq_sl = SpUtil.getSpDouble(getContext(),"bzgls_znhjkzq_sl",0);
            Constant.bzgls_znhjkzq_dj = Utils.keep2Wdouble(20000, 2);
            if (SpUtil.getSpDouble(getContext(),"bzgls_znhjkzq_dj",0) != 0)
                Constant.bzgls_znhjkzq_dj = SpUtil.getSpDouble(getContext(),"bzgls_znhjkzq_dj",0);
            Constant.bzgls_znhjkzq_tz = Utils.keep2Wdouble((Constant.bzgls_znhjkzq_sl * Constant.bzgls_znhjkzq_dj) / 10000, 2);

            Constant.bzgls_lfdb_sl = Utils.keep2Wdouble(Constant.zfzyc_bzgls_gye / 5, 0);
            if (SpUtil.getSpDouble(getContext(),"bzgls_lfdb_sl",0) != 0)
                Constant.bzgls_lfdb_sl = SpUtil.getSpDouble(getContext(),"bzgls_lfdb_sl",0);
            Constant.bzgls_lfdb_dj = Utils.keep2Wdouble(160, 2);
            if (SpUtil.getSpDouble(getContext(),"bzgls_lfdb_dj",0) != 0)
                Constant.bzgls_lfdb_dj = SpUtil.getSpDouble(getContext(),"bzgls_lfdb_dj",0);
            Constant.bzgls_lfdb_tz = Utils.keep2Wdouble((Constant.bzgls_lfdb_sl * Constant.bzgls_lfdb_dj) / 10000, 2);

            Constant.bzgls_ysq_sl = Utils.keep2Wdouble(Constant.zfzyc_bzgll_gyy * 2, 0);
            if (SpUtil.getSpDouble(getContext(),"bzgls_ysq_sl",0) != 0)
                Constant.bzgls_ysq_sl = SpUtil.getSpDouble(getContext(),"bzgls_ysq_sl",0);
            Constant.bzgls_ysq_dj = Utils.keep2Wdouble(60, 2);
            if (SpUtil.getSpDouble(getContext(),"bzgls_ysq_dj",0) != 0)
                Constant.bzgls_ysq_dj = SpUtil.getSpDouble(getContext(),"bzgls_ysq_dj",0);
            Constant.bzgls_ysq_tz = Utils.keep2Wdouble((Constant.bzgls_ysq_sl * Constant.bzgls_ysq_dj) / 10000, 2);

            Constant.bzgls_tzze = Utils.keep2Wdouble(Constant.bzgls_xqjl_tz + Constant.bzgls_ltlx_tz + Constant.bzgls_sl_tz + Constant.bzgls_fyfj_tz
                    + Constant.bzgls_znhjkzq_tz + Constant.bzgls_lfdb_tz + Constant.bzgls_ysq_tz, 2);


            //引种隔离舍
            Constant.yzgls_xqjl_sl = Utils.keep2Wdouble(Constant.zfzyc_yzgll_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"yzgls_xqjl_sl",0) != 0)
                Constant.yzgls_xqjl_sl = SpUtil.getSpDouble(getContext(),"yzgls_xqjl_sl",0);
            Constant.yzgls_xqjl_dj = Utils.keep2Wdouble(1950, 2);
            if (SpUtil.getSpDouble(getContext(),"yzgls_xqjl_dj",0) != 0)
                Constant.yzgls_xqjl_dj = SpUtil.getSpDouble(getContext(),"yzgls_xqjl_dj",0);
            Constant.yzgls_xqjl_tz = Utils.keep2Wdouble((Constant.yzgls_xqjl_sl * Constant.yzgls_xqjl_dj) / 10000, 2);

            Constant.yzgls_ltlx_sl = Utils.keep2Wdouble(Constant.zfzyc_yzgll_gyy, 0);
            if (SpUtil.getSpDouble(getContext(),"yzgls_ltlx_sl",0) != 0)
                Constant.yzgls_ltlx_sl = SpUtil.getSpDouble(getContext(),"yzgls_ltlx_sl",0);
            Constant.yzgls_ltlx_dj = Utils.keep2Wdouble(800, 2);
            if (SpUtil.getSpDouble(getContext(),"yzgls_ltlx_dj",0) != 0)
                Constant.yzgls_ltlx_dj = SpUtil.getSpDouble(getContext(),"yzgls_ltlx_dj",0);
            Constant.yzgls_ltlx_tz = Utils.keep2Wdouble((Constant.yzgls_ltlx_sl * Constant.yzgls_ltlx_dj) / 10000, 2);

            Constant.yzgls_sl_sl = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gyy * 3 / 65, 0);
            if (SpUtil.getSpDouble(getContext(),"yzgls_sl_sl",0) != 0)
                Constant.yzgls_sl_sl = SpUtil.getSpDouble(getContext(),"yzgls_sl_sl",0);
            Constant.yzgls_sl_dj = Utils.keep2Wdouble(320, 2);
            if (SpUtil.getSpDouble(getContext(),"yzgls_sl_dj",0) != 0)
                Constant.yzgls_sl_dj = SpUtil.getSpDouble(getContext(),"yzgls_sl_dj",0);
            Constant.yzgls_sl_tz = Utils.keep2Wdouble((Constant.yzgls_sl_sl * Constant.yzgls_sl_dj) / 10000, 2);


            Constant.yzgls_fyfj_sl = Utils.keep2Wdouble(Math.round(Constant.yzgls_sl_sl / 2 ), 0);
            if (SpUtil.getSpDouble(getContext(),"yzgls_fyfj_sl",0) != 0)
                Constant.yzgls_fyfj_sl = SpUtil.getSpDouble(getContext(),"yzgls_fyfj_sl",0);
            Constant.yzgls_fyfj_dj = Utils.keep2Wdouble(2800, 2);
            if (SpUtil.getSpDouble(getContext(),"yzgls_fyfj_dj",0) != 0)
                Constant.yzgls_fyfj_dj = SpUtil.getSpDouble(getContext(),"yzgls_fyfj_dj",0);
            Constant.yzgls_fyfj_tz = Utils.keep2Wdouble((Constant.yzgls_fyfj_sl * Constant.yzgls_fyfj_dj) / 10000, 2);

            Constant.yzgls_znhjkzq_sl = Utils.keep2Wdouble(Math.round(Constant.yzgls_fyfj_sl / 4 - 0.5), 0);
            if (SpUtil.getSpDouble(getContext(),"yzgls_znhjkzq_sl",0) != 0)
                Constant.yzgls_znhjkzq_sl = SpUtil.getSpDouble(getContext(),"yzgls_znhjkzq_sl",0);
            Constant.yzgls_znhjkzq_dj = Utils.keep2Wdouble(20000, 2);
            if (SpUtil.getSpDouble(getContext(),"yzgls_znhjkzq_dj",0) != 0)
                Constant.yzgls_znhjkzq_dj = SpUtil.getSpDouble(getContext(),"yzgls_znhjkzq_dj",0);
            Constant.yzgls_znhjkzq_tz = Utils.keep2Wdouble((Constant.yzgls_znhjkzq_sl * Constant.yzgls_znhjkzq_dj) / 10000, 2);

            Constant.yzgls_lfdb_sl = Utils.keep2Wdouble(Constant.zfzyc_yzgls_gye / 5, 0);
            if (SpUtil.getSpDouble(getContext(),"yzgls_lfdb_sl",0) != 0)
                Constant.yzgls_lfdb_sl = SpUtil.getSpDouble(getContext(),"yzgls_lfdb_sl",0);
            Constant.yzgls_lfdb_dj = Utils.keep2Wdouble(160, 2);
            if (SpUtil.getSpDouble(getContext(),"yzgls_lfdb_dj",0) != 0)
                Constant.yzgls_lfdb_dj = SpUtil.getSpDouble(getContext(),"yzgls_lfdb_dj",0);
            Constant.yzgls_lfdb_tz = Utils.keep2Wdouble((Constant.yzgls_lfdb_sl * Constant.yzgls_lfdb_dj) / 10000, 2);

            Constant.yzgls_ysq_sl = Utils.keep2Wdouble(Constant.zfzyc_yzgll_gyy * 2, 0);
            if (SpUtil.getSpDouble(getContext(),"yzgls_ysq_sl",0) != 0)
                Constant.yzgls_ysq_sl = SpUtil.getSpDouble(getContext(),"yzgls_ysq_sl",0);
            Constant.yzgls_ysq_dj = Utils.keep2Wdouble(60, 2);
            if (SpUtil.getSpDouble(getContext(),"yzgls_ysq_dj",0) != 0)
                Constant.yzgls_ysq_dj = SpUtil.getSpDouble(getContext(),"yzgls_ysq_dj",0);
            Constant.yzgls_ysq_tz = Utils.keep2Wdouble((Constant.yzgls_ysq_sl * Constant.yzgls_ysq_dj) / 10000, 2);

            Constant.yzgls_tzze = Utils.keep2Wdouble(Constant.yzgls_xqjl_tz + Constant.yzgls_ltlx_tz + Constant.yzgls_sl_tz + Constant.yzgls_fyfj_tz
                    + Constant.yzgls_znhjkzq_tz + Constant.yzgls_lfdb_tz + Constant.yzgls_ysq_tz, 2);

            initTz();

        } catch (Exception e) {
            LogUtil.e( e.getMessage());
        }
    }

    @Override
    public void refreshViews() {
        //后备母猪舍
        if (Constant.hbmzs_xqjl_sl == 0){
            Toast.makeText(getContext(),"请先设置基本参数和猪舍建筑单价",Toast.LENGTH_LONG).show();
            return;
        }
        hbmzs_xqjl_sl.setText(Constant.hbmzs_xqjl_sl + "");

        hbmzs_xqjl_dj.setText(Constant.hbmzs_xqjl_dj + "");

        hbmzs_xqjl_tz.setText(Constant.hbmzs_xqjl_tz + "");

        hbmzs_ltlx_sl.setText(Constant.hbmzs_ltlx_sl + "");

        hbmzs_ltlx_dj.setText(Constant.hbmzs_ltlx_dj + "");

        hbmzs_ltlx_tz.setText(Constant.hbmzs_ltlx_tz + "");

        hbmzs_sl_sl.setText(Constant.hbmzs_sl_sl + "");

        hbmzs_sl_dj.setText(Constant.hbmzs_sl_dj + "");

        hbmzs_sl_tz.setText(Constant.hbmzs_sl_tz + "");


        hbmzs_fyfj_sl.setText(Constant.hbmzs_fyfj_sl + "");

        hbmzs_fyfj_dj.setText(Constant.hbmzs_fyfj_dj + "");

        hbmzs_fyfj_tz.setText(Constant.hbmzs_fyfj_tz + "");

        hbmzs_znhjkzq_sl.setText(Constant.hbmzs_znhjkzq_sl + "");

        hbmzs_znhjkzq_dj.setText(Constant.hbmzs_znhjkzq_dj + "");

        hbmzs_znhjkzq_tz.setText(Constant.hbmzs_znhjkzq_tz + "");

        hbmzs_lfdb_sl.setText(Constant.hbmzs_lfdb_sl + "");

        hbmzs_lfdb_dj.setText(Constant.hbmzs_lfdb_dj + "");

        hbmzs_lfdb_tz.setText(Constant.hbmzs_lfdb_tz + "");

        hbmzs_ysq_sl.setText(Constant.hbmzs_ysq_sl + "");

        hbmzs_ysq_dj.setText(Constant.hbmzs_ysq_dj + "");

        hbmzs_ysq_tz.setText(Constant.hbmzs_ysq_tz + "");

        hbmzs_tzze.setText(Constant.hbmzs_tzze + "");

        //公猪及配种壬检母猪舍
        gzjpzrjmzs_bzj_sl.setText(Constant.gzjpzrjmzs_bzj_sl + "");

        gzjpzrjmzs_bzj_dj.setText(Constant.gzjpzrjmzs_bzj_dj + "");

        gzjpzrjmzs_bzj_tz.setText(Constant.gzjpzrjmzs_bzj_tz + "");

        gzjpzrjmzs_jyzlzdfxy_sl.setText(Constant.gzjpzrjmzs_jyzlzdfxy_sl + "");

        gzjpzrjmzs_jyzlzdfxy_dj.setText(Constant.gzjpzrjmzs_jyzlzdfxy_dj + "");

        gzjpzrjmzs_jyzlzdfxy_tz.setText(Constant.gzjpzrjmzs_jyzlzdfxy_tz + "");

        gzjpzrjmzs_szsj_sl.setText(Constant.gzjpzrjmzs_szsj_sl + "");

        gzjpzrjmzs_szsj_dj.setText(Constant.gzjpzrjmzs_szsj_dj + "");

        gzjpzrjmzs_szsj_tz.setText(Constant.gzjpzrjmzs_szsj_tz + "");

        gzjpzrjmzs_szysjybzdgzj_sl.setText(Constant.gzjpzrjmzs_szysjybzdgzj_sl + "");

        gzjpzrjmzs_szysjybzdgzj_dj.setText(Constant.gzjpzrjmzs_szysjybzdgzj_dj + "");

        gzjpzrjmzs_szysjybzdgzj_tz.setText(Constant.gzjpzrjmzs_szysjybzdgzj_tz + "");

        gzjpzrjmzs_xqjl_sl.setText(Constant.gzjpzrjmzs_xqjl_sl + "");

        gzjpzrjmzs_xqjl_dj.setText(Constant.gzjpzrjmzs_xqjl_dj + "");

        gzjpzrjmzs_xqjl_tz.setText(Constant.gzjpzrjmzs_xqjl_tz + "");

        gzjpzrjmzs_ltxx_sl.setText(Constant.gzjpzrjmzs_ltxx_sl + "");

        gzjpzrjmzs_ltxx_dj.setText(Constant.gzjpzrjmzs_ltxx_dj + "");

        gzjpzrjmzs_ltxx_tz.setText(Constant.gzjpzrjmzs_ltxx_tz + "");

        gzjpzrjmzs_sl_sl.setText(Constant.gzjpzrjmzs_sl_sl + "");

        gzjpzrjmzs_sl_dj.setText(Constant.gzjpzrjmzs_sl_dj + "");

        gzjpzrjmzs_sl_tz.setText(Constant.gzjpzrjmzs_sl_tz + "");

        gzjpzrjmzs_fyfj_sl.setText(Constant.gzjpzrjmzs_fyfj_sl + "");

        gzjpzrjmzs_fyfj_dj.setText(Constant.gzjpzrjmzs_fyfj_dj + "");

        gzjpzrjmzs_fyfj_tz.setText(Constant.gzjpzrjmzs_fyfj_tz + "");

        gzjpzrjmzs_znhjkzq_sl.setText(Constant.gzjpzrjmzs_znhjkzq_sl + "");

        gzjpzrjmzs_znhjkzq_dj.setText(Constant.gzjpzrjmzs_znhjkzq_dj + "");

        gzjpzrjmzs_znhjkzq_tz.setText(Constant.gzjpzrjmzs_znhjkzq_tz + "");

        gzjpzrjmzs_lfdb_sl.setText(Constant.gzjpzrjmzs_lfdb_sl + "");

        gzjpzrjmzs_lfdb_dj.setText(Constant.gzjpzrjmzs_lfdb_dj + "");

        gzjpzrjmzs_lfdb_tz.setText(Constant.gzjpzrjmzs_lfdb_tz + "");

        gzjpzrjmzs_ysq_sl.setText(Constant.gzjpzrjmzs_ysq_sl + "");

        gzjpzrjmzs_ysq_dj.setText(Constant.gzjpzrjmzs_ysq_dj + "");

        gzjpzrjmzs_ysq_tz.setText(Constant.gzjpzrjmzs_ysq_tz + "");

        gzjpzrjmzs_rcvczdy_sl.setText(Constant.gzjpzrjmzs_rcvczdy_sl + "");

        gzjpzrjmzs_rcvczdy_dj.setText(Constant.gzjpzrjmzs_rcvczdy_dj + "");

        gzjpzrjmzs_rcvczdy_tz.setText(Constant.gzjpzrjmzs_rcvczdy_tz + "");

        gzjpzrjmzs_tzze.setText(Constant.gzjpzrjmzs_tzze + "");


        //妊娠母猪舍
        rcmzs_xwl_sl.setText(Constant.rcmzs_xwl_sl + "");

        rcmzs_xwl_dj.setText(Constant.rcmzs_xwl_dj + "");

        rcmzs_xwl_tz.setText(Constant.rcmzs_xwl_tz + "");

        rcmzs_ltlx_sl.setText(Constant.rcmzs_ltlx_sl + "");

        rcmzs_ltlx_dj.setText(Constant.rcmzs_ltlx_dj + "");

        rcmzs_ltlx_tz.setText(Constant.rcmzs_ltlx_tz + "");

        rcmzs_sl_sl.setText(Constant.rcmzs_sl_sl + "");

        rcmzs_sl_dj.setText(Constant.rcmzs_sl_dj + "");

        rcmzs_sl_tz.setText(Constant.rcmzs_sl_tz + "");

        rcmzs_fyfj_sl.setText(Constant.rcmzs_fyfj_sl + "");

        rcmzs_fyfj_dj.setText(Constant.rcmzs_fyfj_dj + "");

        rcmzs_fyfj_tz.setText(Constant.rcmzs_fyfj_tz + "");

        rcmzs_znhjkzq_sl.setText(Constant.rcmzs_znhjkzq_sl + "");

        rcmzs_znhjkzq_dj.setText(Constant.rcmzs_znhjkzq_dj + "");

        rcmzs_znhjkzq_tz.setText(Constant.rcmzs_znhjkzq_tz + "");

        rcmzs_lfdb_sl.setText(Constant.rcmzs_lfdb_sl + "");

        rcmzs_lfdb_dj.setText(Constant.rcmzs_lfdb_dj + "");

        rcmzs_lfdb_tz.setText(Constant.rcmzs_lfdb_tz + "");

        rcmzs_ysq_sl.setText(Constant.rcmzs_ysq_sl + "");

        rcmzs_ysq_dj.setText(Constant.rcmzs_ysq_dj + "");

        rcmzs_ysq_tz.setText(Constant.rcmzs_ysq_tz + "");

        rcmzs_tzze.setText(Constant.rcmzs_tzze + "");

        //分娩栏舍
        fws_fwl_sl.setText(Constant.fws_fwl_sl + "");

        fws_fwl_dj.setText(Constant.fws_fwl_dj + "");

        fws_fwl_tz.setText(Constant.fws_fwl_tz + "");

        fws_ltlx_sl.setText(Constant.fws_ltlx_sl + "");

        fws_ltlx_dj.setText(Constant.fws_ltlx_dj + "");

        fws_ltlx_tz.setText(Constant.fws_ltlx_tz + "");

        fws_sl_sl.setText(Constant.fws_sl_sl + "");

        fws_sl_dj.setText(Constant.fws_sl_dj + "");

        fws_sl_tz.setText(Constant.fws_sl_tz + "");

        fws_flsj_dj.setText(Constant.fws_flsj_dj + "");

        fws_flsj_sl.setText(Constant.fws_flsj_sl + "");

        fws_flsj_tz.setText(Constant.fws_flsj_tz + "");


        fws_znhjkzq_sl.setText(Constant.fws_znhjkzq_sl + "");

        fws_znhjkzq_dj.setText(Constant.fws_znhjkzq_dj + "");

        fws_znhjkzq_tz.setText(Constant.fws_znhjkzq_tz + "");

        fws_ysq_sl.setText(Constant.fws_ysq_sl + "");

        fws_ysq_dj.setText(Constant.fws_ysq_dj + "");

        fws_ysq_tz.setText(Constant.fws_ysq_tz + "");


        fws_znbwx_sl.setText(Constant.fws_znbwx_sl + "");

        fws_znbwx_dj.setText(Constant.fws_znbwx_dj + "");

        fws_znbwx_tz.setText(Constant.fws_znbwx_tz + "");


        fws_dhjbysb_sl.setText(Constant.fws_dhjbysb_sl + "");

        fws_dhjbysb_dj.setText(Constant.fws_dhjbysb_dj + "");

        fws_dhjbysb_tz.setText(Constant.fws_dhjbysb_tz + "");

        fws_tzze.setText(Constant.fws_tzze + "");

        //分娩舍
        bys_byl_sl.setText(Constant.bys_byl_sl + "");

        bys_byl_dj.setText(Constant.bys_byl_dj + "");

        bys_byl_tz.setText(Constant.bys_byl_tz + "");

        bys_ltlx_sl.setText(Constant.bys_ltlx_sl + "");

        bys_ltlx_dj.setText(Constant.bys_ltlx_dj + "");

        bys_ltlx_tz.setText(Constant.bys_ltlx_tz + "");

        bys_sl_sl.setText(Constant.bys_sl_sl + "");

        bys_sl_dj.setText(Constant.bys_sl_dj + "");

        bys_sl_tz.setText(Constant.bys_sl_tz + "");

        bys_fyfj_sl.setText(Constant.bys_fyfj_sl + "");

        bys_fyfj_dj.setText(Constant.bys_fyfj_dj + "");

        bys_fyfj_tz.setText(Constant.bys_fyfj_tz + "");

        bys_znhjkzq_sl.setText(Constant.bys_znhjkzq_sl + "");

        bys_znhjkzq_dj.setText(Constant.bys_znhjkzq_dj + "");

        bys_znhjkzq_tz.setText(Constant.bys_znhjkzq_tz + "");

        bys_ysq_sl.setText(Constant.bys_ysq_sl + "");

        bys_ysq_dj.setText(Constant.bys_ysq_dj + "");

        bys_ysq_tz.setText(Constant.bys_ysq_tz + "");

        bys_dhjbwsb_sl.setText(Constant.bys_dhjbwsb_sl + "");

        bys_dhjbwsb_dj.setText(Constant.bys_dhjbwsb_dj + "");

        bys_dhjbwsb_tz.setText(Constant.bys_dhjbwsb_tz + "");

        bys_tzze.setText(Constant.bys_tzze + "");


        //生长育肥舍
        szyfs_xqjl_sl.setText(Constant.szyfs_xqjl_sl + "");

        szyfs_xqjl_dj.setText(Constant.szyfs_xqjl_dj + "");

        szyfs_xqjl_tz.setText(Constant.szyfs_xqjl_tz + "");

        szyfs_ltlx_sl.setText(Constant.szyfs_ltlx_sl + "");

        szyfs_ltlx_dj.setText(Constant.szyfs_ltlx_dj + "");

        szyfs_ltlx_tz.setText(Constant.szyfs_ltlx_tz + "");

        szyfs_sl_sl.setText(Constant.szyfs_sl_sl + "");

        szyfs_sl_dj.setText(Constant.szyfs_sl_dj + "");

        szyfs_sl_tz.setText(Constant.szyfs_sl_tz + "");


        szyfs_fyfj_sl.setText(Constant.szyfs_fyfj_sl + "");

        szyfs_fyfj_dj.setText(Constant.szyfs_fyfj_dj + "");

        szyfs_fyfj_tz.setText(Constant.szyfs_fyfj_tz + "");

        szyfs_znhjkzq_sl.setText(Constant.szyfs_znhjkzq_sl + "");

        szyfs_znhjkzq_dj.setText(Constant.szyfs_znhjkzq_dj + "");

        szyfs_znhjkzq_tz.setText(Constant.szyfs_znhjkzq_tz + "");

        szyfs_lfdb_sl.setText(Constant.szyfs_lfdb_sl + "");

        szyfs_lfdb_dj.setText(Constant.szyfs_lfdb_dj + "");

        szyfs_lfdb_tz.setText(Constant.szyfs_lfdb_tz + "");

        szyfs_ysq_sl.setText(Constant.szyfs_ysq_sl + "");

        szyfs_ysq_dj.setText(Constant.szyfs_ysq_dj + "");

        szyfs_ysq_tz.setText(Constant.szyfs_ysq_tz + "");

        szyfs_tzze.setText(Constant.szyfs_tzze + "");

        //病猪隔离舍
        bzgls_xqjl_sl.setText(Constant.bzgls_xqjl_sl + "");

        bzgls_xqjl_dj.setText(Constant.bzgls_xqjl_dj + "");

        bzgls_xqjl_tz.setText(Constant.bzgls_xqjl_tz + "");

        bzgls_ltlx_sl.setText(Constant.bzgls_ltlx_sl + "");

        bzgls_ltlx_dj.setText(Constant.bzgls_ltlx_dj + "");

        bzgls_ltlx_tz.setText(Constant.bzgls_ltlx_tz + "");

        bzgls_sl_sl.setText(Constant.bzgls_sl_sl + "");

        bzgls_sl_dj.setText(Constant.bzgls_sl_dj + "");

        bzgls_sl_tz.setText(Constant.bzgls_sl_tz + "");


        bzgls_fyfj_sl.setText(Constant.bzgls_fyfj_sl + "");

        bzgls_fyfj_dj.setText(Constant.bzgls_fyfj_dj + "");

        bzgls_fyfj_tz.setText(Constant.bzgls_fyfj_tz + "");

        bzgls_znhjkzq_sl.setText(Constant.bzgls_znhjkzq_sl + "");

        bzgls_znhjkzq_dj.setText(Constant.bzgls_znhjkzq_dj + "");

        bzgls_znhjkzq_tz.setText(Constant.bzgls_znhjkzq_tz + "");

        bzgls_lfdb_sl.setText(Constant.bzgls_lfdb_sl + "");

        bzgls_lfdb_dj.setText(Constant.bzgls_lfdb_dj + "");

        bzgls_lfdb_tz.setText(Constant.bzgls_lfdb_tz + "");

        bzgls_ysq_sl.setText(Constant.bzgls_ysq_sl + "");

        bzgls_ysq_dj.setText(Constant.bzgls_ysq_dj + "");

        bzgls_ysq_tz.setText(Constant.bzgls_ysq_tz + "");

        bzgls_tzze.setText(Constant.bzgls_tzze + "");


        //引种隔离舍
        yzgls_xqjl_sl.setText(Constant.yzgls_xqjl_sl + "");

        yzgls_xqjl_dj.setText(Constant.yzgls_xqjl_dj + "");

        yzgls_xqjl_tz.setText(Constant.yzgls_xqjl_tz + "");

        yzgls_ltlx_sl.setText(Constant.yzgls_ltlx_sl + "");

        yzgls_ltlx_dj.setText(Constant.yzgls_ltlx_dj + "");

        yzgls_ltlx_tz.setText(Constant.yzgls_ltlx_tz + "");

        yzgls_sl_sl.setText(Constant.yzgls_sl_sl + "");

        yzgls_sl_dj.setText(Constant.yzgls_sl_dj + "");

        yzgls_sl_tz.setText(Constant.yzgls_sl_tz + "");


        yzgls_fyfj_sl.setText(Constant.yzgls_fyfj_sl + "");

        yzgls_fyfj_dj.setText(Constant.yzgls_fyfj_dj + "");

        yzgls_fyfj_tz.setText(Constant.yzgls_fyfj_tz + "");

        yzgls_znhjkzq_sl.setText(Constant.yzgls_znhjkzq_sl + "");

        yzgls_znhjkzq_dj.setText(Constant.yzgls_znhjkzq_dj + "");

        yzgls_znhjkzq_tz.setText(Constant.yzgls_znhjkzq_tz + "");

        yzgls_lfdb_sl.setText(Constant.yzgls_lfdb_sl + "");

        yzgls_lfdb_dj.setText(Constant.yzgls_lfdb_dj + "");

        yzgls_lfdb_tz.setText(Constant.yzgls_lfdb_tz + "");

        yzgls_ysq_sl.setText(Constant.yzgls_ysq_sl + "");

        yzgls_ysq_dj.setText(Constant.yzgls_ysq_dj + "");

        yzgls_ysq_tz.setText(Constant.yzgls_ysq_tz + "");

        yzgls_tzze.setText(Constant.yzgls_tzze + "");
    }
}
