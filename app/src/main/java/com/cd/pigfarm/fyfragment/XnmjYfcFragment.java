package com.cd.pigfarm.fyfragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
import com.cd.pigfarm.entities.NzwEntity;
import com.cd.pigfarm.util.LogUtil;
import com.cd.pigfarm.util.SpUtil;
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.List;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/23 21:49
 * @Description: 消纳面积
 */
public class XnmjYfcFragment extends BaseFragment implements AdapterView.OnItemSelectedListener{

    @NotEmpty
    private EditText mYfc_zcdl;
    @NotEmpty
    private EditText mYfc_sd_sdl;
    @NotEmpty
    private EditText mYfc_sd_jshns;
    @NotEmpty
    private EditText mYfc_sd_mj;
    @NotEmpty
    private EditText mYfc_sd_zsdl;
    @NotEmpty
    private EditText mYfc_xm_sdl;
    @NotEmpty
    private EditText mYfc_xm_jshns;
    @NotEmpty
    private EditText mYfc_xm_mj;
    @NotEmpty
    private EditText mYfc_xm_zsdl;
    @NotEmpty
    private EditText mYfc_ym_sdl;
    @NotEmpty
    private EditText mYfc_ym_jshns;
    @NotEmpty
    private EditText mYfc_ym_mj;
    @NotEmpty
    private EditText mYfc_ym_zsdl;
    @NotEmpty
    private EditText mYfc_yc_sdl;
    @NotEmpty
    private EditText mYfc_yc_jshns;
    @NotEmpty
    private EditText mYfc_yc_mj;
    @NotEmpty
    private EditText mYfc_yc_zsdl;
    @NotEmpty
    private EditText mYfc_gs_sdl;
    @NotEmpty
    private EditText mYfc_gs_jshns;
    @NotEmpty
    private EditText mYfc_gs_mj;
    @NotEmpty
    private EditText mYfc_gs_zsdl;
    @NotEmpty
    private EditText mYfc_mls_sdl;
    @NotEmpty
    private EditText mYfc_mls_jshns;
    @NotEmpty
    private EditText mYfc_mls_mj;
    @NotEmpty
    private EditText mYfc_mls_zsdl;
    @NotEmpty
    private EditText mYfc_qglsc_sdl;
    @NotEmpty
    private EditText mYfc_qglsc_jshns;
    @NotEmpty
    private EditText mYfc_qglsc_mj;
    @NotEmpty
    private EditText mYfc_qglsc_zsdl;
    @NotEmpty
    private EditText mYfc_ggsc_sdl;
    @NotEmpty
    private EditText mYfc_ggsc_jshns;
    @NotEmpty
    private EditText mYfc_ggsc_mj;
    @NotEmpty
    private EditText mYfc_ggsc_zsdl;
    @NotEmpty
    private EditText mYfc_yclsc_sdl;
    @NotEmpty
    private EditText mYfc_yclsc_jshns;
    @NotEmpty
    private EditText mYfc_yclsc_mj;
    @NotEmpty
    private EditText mYfc_yclsc_zsdl;
    @NotEmpty
    private EditText mYfc_gclsc_sdl;
    @NotEmpty
    private EditText mYfc_gclsc_jshns;
    @NotEmpty
    private EditText mYfc_gclsc_mj;
    @NotEmpty
    private EditText mYfc_gclsc_zsdl;
    @NotEmpty
    private EditText mYfc_dlsc_sdl;
    @NotEmpty
    private EditText mYfc_dlsc_jshns;
    @NotEmpty
    private EditText mYfc_dlsc_mj;
    @NotEmpty
    private EditText mYfc_dlsc_zsdl;
    @NotEmpty
    private EditText mYfc_cslsc_sdl;
    @NotEmpty
    private EditText mYfc_cslsc_jshns;
    @NotEmpty
    private EditText mYfc_cslsc_mj;
    @NotEmpty
    private EditText mYfc_cslsc_zsdl;
    @NotEmpty
    private EditText mYfc_lygs_sdl;
    @NotEmpty
    private EditText mYfc_lygs_jshns;
    @NotEmpty
    private EditText mYfc_lygs_mj;
    @NotEmpty
    private EditText mYfc_lygs_zsdl;
    @NotEmpty
    private EditText mYfc_clgs_sdl;
    @NotEmpty
    private EditText mYfc_clgs_jshns;
    @NotEmpty
    private EditText mYfc_clgs_mj;
    @NotEmpty
    private EditText mYfc_clgs_zsdl;
    @NotEmpty
    private EditText mYfc_cy_sdl;
    @NotEmpty
    private EditText mYfc_cy_jshns;
    @NotEmpty
    private EditText mYfc_cy_mj;
    @NotEmpty
    private EditText mYfc_cy_zsdl;
    @NotEmpty
    private EditText mYfc_mc_sdl;
    @NotEmpty
    private EditText mYfc_mc_jshns;
    @NotEmpty
    private EditText mYfc_mc_mj;
    @NotEmpty
    private EditText mYfc_mc_zsdl;
    @NotEmpty
    private EditText mYfc_hj_sdl;
    @NotEmpty
    private EditText mYfc_hj_jshns;
    @NotEmpty
    private EditText mYfc_hj_mj;
    @NotEmpty
    private EditText mYfc_hj_zsdl;
    @NotEmpty
    private EditText mYfc_cz_sdl;
    @NotEmpty
    private EditText mYfc_cz_jshns;
    @NotEmpty
    private EditText mYfc_cz_mj;
    @NotEmpty
    private EditText mYfc_cz_zsdl;


    private Spinner yfc_sd_bfb;
    private Spinner yfc_xm_bfb;
    private Spinner yfc_ym_bfb;
    private Spinner yfc_yc_bfb;
    private Spinner yfc_gs_bfb;
    private Spinner yfc_mls_bfb;
    private Spinner yfc_jglsc_bfb;
    private Spinner yfc_yclsc_bfb;
    private Spinner yfc_glsc_bfb;
    private Spinner yfc_dlsc_bfb;
    private Spinner yfc_cslsc_bfb;
    private Spinner yfc_lygs_bfb;
    private Spinner yfc_clgs_bfb;
    private Spinner yfc_cy_bfb;
    private Spinner yfc_mc_bfb;

    private Button yfc_czjs;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_xnmj_yfc, null);
        bindViews();
        bindButton();
        return view;
    }


    private LinearLayout yfc_Lin;




    AlertDialog alertDialog;

    String[] items = {"水稻","小麦","玉米","油菜","甘薯","马铃薯","茄果类蔬菜","瓜类蔬菜","叶菜类蔬菜","根菜类蔬菜",
            "豆类蔬菜","葱蒜类蔬菜","落叶果树","常绿果树","茶叶","牧草"};

    private void czjsYfc() {
        if (Constant.yfc_cz_zsdl <= 0){
            Toast.makeText(getContext(),"差值小于或等于0,无法分配",Toast.LENGTH_SHORT).show();
            return;
        }
        alertDialog = new AlertDialog.Builder(getContext()).setTitle("请选择差值分配农作物")
                .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if (which == 0){
                            //水稻
                            if (Constant.yfc_sd_mj == 0){
                                Constant.yfc_sd_mj = Constant.yfc_cz_zsdl/Constant.sd/Constant.yfc_sd_jshns/Constant.yfc_sd_bfb;
                                Constant.yfc_sd_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_sd_mj",Constant.yfc_sd_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 1){
                            //水稻
                            if (Constant.yfc_xm_mj == 0){
                                Constant.yfc_xm_mj = Constant.yfc_cz_zsdl/Constant.xm/Constant.yfc_xm_jshns/Constant.yfc_xm_bfb;
                                Constant.yfc_xm_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_xm_mj",Constant.yfc_xm_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else  if (which == 2){
                            //水稻
                            if (Constant.yfc_ym_mj == 0){
                                Constant.yfc_ym_mj = Constant.yfc_cz_zsdl/Constant.ym/Constant.yfc_ym_jshns/Constant.yfc_ym_bfb;
                                Constant.yfc_ym_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_ym_mj",Constant.yfc_ym_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 3){
                            //水稻
                            if (Constant.yfc_yc_mj == 0){
                                Constant.yfc_yc_mj = Constant.yfc_cz_zsdl/Constant.yc/Constant.yfc_yc_jshns/Constant.yfc_yc_bfb;
                                Constant.yfc_yc_zsdl = Constant.yfc_cz_zsdl;
                                Constant.yfc_cz_zsdl = 0;
                                SpUtil.saveSP(getContext(),"yfc_yc_mj",Constant.yfc_yc_mj);
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 4){
                            //水稻
                            if (Constant.yfc_gs_mj == 0){
                                Constant.yfc_gs_mj = Constant.yfc_cz_zsdl/Constant.gs/Constant.yfc_gs_jshns/Constant.yfc_gs_bfb;
                                Constant.yfc_gs_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_gs_mj",Constant.yfc_gs_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 5){
                            //水稻
                            if (Constant.yfc_mls_mj == 0){
                                Constant.yfc_mls_mj = Constant.yfc_cz_zsdl/Constant.mls/Constant.yfc_mls_jshns/Constant.yfc_mls_bfb;
                                Constant.yfc_mls_zsdl = Constant.yfc_cz_zsdl;
                                Toast.makeText(getContext(),Constant.yfc_mls_mj+"",Toast.LENGTH_SHORT).show();
                                SpUtil.saveSP(getContext(),"yfc_mls_mj",Constant.yfc_mls_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else  if (which == 6){
                            //水稻
                            if (Constant.yfc_qglsc_mj == 0){
                                Constant.yfc_qglsc_mj = Constant.yfc_cz_zsdl/Constant.qglsc/Constant.yfc_qglsc_jshns/Constant.yfc_qglsc_bfb;
                                Constant.yfc_qglsc_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_qglsc_mj",Constant.yfc_qglsc_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else  if (which == 7){
                            //水稻
                            if (Constant.yfc_ggsc_mj == 0){
                                Constant.yfc_ggsc_mj = Constant.yfc_cz_zsdl/Constant.glsc/Constant.yfc_ggsc_jshns/Constant.yfc_ggsc_bfb;
                                Constant.yfc_ggsc_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_ggsc_mj",Constant.yfc_ggsc_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 8){
                            //水稻
                            if (Constant.yfc_yclsc_mj == 0){
                                Constant.yfc_yclsc_mj = Constant.yfc_cz_zsdl/Constant.yclsc/Constant.yfc_yclsc_jshns/Constant.yfc_yclsc_bfb;
                                Constant.yfc_yclsc_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_yclsc_mj",Constant.yfc_yclsc_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 9){
                            //水稻
                            if (Constant.yfc_gclsc_mj == 0){
                                Constant.yfc_gclsc_mj = Constant.yfc_cz_zsdl/Constant.gclsc/Constant.yfc_gclsc_jshns/Constant.yfc_gclsc_bfb;
                                Constant.yfc_gclsc_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_gclsc_mj",Constant.yfc_gclsc_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else  if (which == 10){
                            //水稻
                            if (Constant.yfc_dlsc_mj == 0){
                                Constant.yfc_dlsc_mj = Constant.yfc_cz_zsdl/Constant.dlsc/Constant.yfc_dlsc_jshns/Constant.yfc_dlsc_bfb;
                                Constant.yfc_dlsc_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_dlsc_mj",Constant.yfc_dlsc_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 11){
                            //水稻
                            if (Constant.yfc_cslsc_mj == 0){
                                Constant.yfc_cslsc_mj = Constant.yfc_cz_zsdl/Constant.cslsc/Constant.yfc_cslsc_jshns/Constant.yfc_cslgs_bfb;
                                Constant.yfc_cslsc_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_cslsc_mj",Constant.yfc_cslsc_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 12){
                            //水稻
                            if (Constant.yfc_lygs_mj == 0){
                                Constant.yfc_lygs_mj = Constant.yfc_cz_zsdl/Constant.lygs/Constant.yfc_lygs_jshns/Constant.yfc_lygs_bfb;
                                Constant.yfc_lygs_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_lygs_mj",Constant.yfc_lygs_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 13){
                            //水稻
                            if (Constant.yfc_clgs_mj == 0){
                                Constant.yfc_clgs_mj = Constant.yfc_cz_zsdl/Constant.clgs/Constant.yfc_clgs_jshns/Constant.yfc_clgs_bfb;
                                Constant.yfc_clgs_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_clgs_mj",Constant.yfc_clgs_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }

                        else if (which == 14){
                            //水稻
                            if (Constant.yfc_cy_mj == 0){
                                Constant.yfc_cy_mj = Constant.yfc_cz_zsdl/Constant.cy/Constant.yfc_cy_jshns/Constant.yfc_cy_bfb;
                                Constant.yfc_cy_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_cy_mj",Constant.yfc_cy_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();

                            }
                        }

                        else if (which == 15){
                            //水稻
                            if (Constant.yfc_mc_mj == 0){
                                Constant.yfc_mc_mj = Constant.yfc_cz_zsdl/Constant.mc/Constant.yfc_mc_jshns/Constant.yfc_mc_bfb;
                                Constant.yfc_mc_zsdl = Constant.yfc_cz_zsdl;
                                SpUtil.saveSP(getContext(),"yfc_mc_mj",Constant.yfc_mc_mj);
                                Constant.yfc_cz_zsdl = 0;
                            }else {
                                Toast.makeText(getContext(),"请选择未设置面积的农作物",Toast.LENGTH_SHORT).show();
                            }
                        }
                        jsDatas();
                        refreshViews();

                        alertDialog.dismiss();
                    }
                }).show();
    }


    private void addViewByType(LinearLayout lin,NzwEntity nzwEntity){

        TextView textView = (TextView) View.inflate(getContext(),R.layout.lin_textview,null);
        lin.addView(textView,new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,1));
        LinearLayout linearLayout = (LinearLayout) View.inflate(getContext(),R.layout.xnmj_item,null);
        TextView textView1 = (TextView) linearLayout.findViewById(R.id.name);
        textView1.setText(nzwEntity.getName());
        lin.addView(linearLayout,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, Utils.dip2px(getContext(),50f)));
    }

    private void bindViews() {

        yfc_czjs = (Button) view.findViewById(R.id.yfc_czjs);
        yfc_czjs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                czjsYfc();
            }
        });


        yfc_Lin = (LinearLayout) view.findViewById(R.id.yfc_Lin);


        List<NzwEntity> nzwEntities = App.sqlOpenHelper.queryAllNzw();
       // Toast.makeText(getContext(),nzwEntities.size()+"",Toast.LENGTH_SHORT).show();
        if (nzwEntities != null && nzwEntities.size() > 0){
            //Toast.makeText(getContext(),nzwEntities.size()+"",Toast.LENGTH_SHORT).show();
            for (NzwEntity nzwEntity : nzwEntities){
                addViewByType(yfc_Lin,nzwEntity);
            }
        }

        yfc_sd_bfb = (Spinner) view.findViewById(R.id.yfc_sd_bfb);
        yfc_sd_bfb.setOnItemSelectedListener(this);

        if (Constant.yfc_sd_bfb != 1){
            yfc_sd_bfb.setSelection((int)(10-1 - Constant.yfc_sd_bfb*10));
            //Toast.makeText(getContext(),(int)(10-1 - Constant.yfc_sd_bfb*10)+"",Toast.LENGTH_SHORT).show();
        }
        yfc_xm_bfb = (Spinner) view.findViewById(R.id.yfc_xm_bfb);
        yfc_xm_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_xm_bfb != 1){
            yfc_xm_bfb.setSelection((int)(10-1 - Constant.yfc_xm_bfb*10));
        }
        yfc_ym_bfb = (Spinner) view.findViewById(R.id.yfc_ym_bfb);
        yfc_ym_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_ym_bfb != 1){
            yfc_ym_bfb.setSelection((int)(10-1 - Constant.yfc_ym_bfb*10));
        }
        yfc_yc_bfb = (Spinner) view.findViewById(R.id.yfc_yc_bfb);
        yfc_yc_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_yc_bfb != 1){
            yfc_yc_bfb.setSelection((int)(10-1 - Constant.yfc_yc_bfb*10));
        }
        yfc_gs_bfb = (Spinner) view.findViewById(R.id.yfc_gs_bfb);
        yfc_gs_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_gs_bfb != 1){
            yfc_gs_bfb.setSelection((int)(10-1 - Constant.yfc_gs_bfb*10));
        }
        yfc_mls_bfb = (Spinner) view.findViewById(R.id.yfc_mls_bfb);
        yfc_mls_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_mls_bfb != 1){
            yfc_mls_bfb.setSelection((int)(10-1 - Constant.yfc_mls_bfb*10));
        }
        yfc_jglsc_bfb = (Spinner) view.findViewById(R.id.yfc_qglsc_bfb);
        yfc_jglsc_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_qglsc_bfb != 1){
            yfc_jglsc_bfb.setSelection((int)(10-1 - Constant.yfc_qglsc_bfb*10));
        }
        yfc_yclsc_bfb = (Spinner) view.findViewById(R.id.yfc_yclsc_bfb);
        yfc_yclsc_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_yclsc_bfb != 1){
            yfc_yclsc_bfb.setSelection((int)(10-1 - Constant.yfc_yclsc_bfb*10));
        }
        yfc_glsc_bfb = (Spinner) view.findViewById(R.id.yfc_glsc_bfb);
        yfc_glsc_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_ggsc_bfb != 1){
            yfc_glsc_bfb.setSelection((int)(10-1 - Constant.yfc_ggsc_bfb*10));
        }
        yfc_dlsc_bfb = (Spinner) view.findViewById(R.id.yfc_dlsc_bfb);
        yfc_dlsc_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_dlsc_bfb != 1){
            yfc_dlsc_bfb.setSelection((int)(10-1 - Constant.yfc_dlsc_bfb*10));
        }
        yfc_cslsc_bfb = (Spinner) view.findViewById(R.id.yfc_cslsc_bfb);
        yfc_cslsc_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_cslgs_bfb != 1){
            yfc_cslsc_bfb.setSelection((int)(10-1 - Constant.yfc_cslgs_bfb*10));
        }
        yfc_lygs_bfb = (Spinner) view.findViewById(R.id.yfc_lygs_bfb);
        yfc_lygs_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_lygs_bfb != 1){
            yfc_lygs_bfb.setSelection((int)(10-1 - Constant.yfc_lygs_bfb*10));
        }
        yfc_clgs_bfb = (Spinner) view.findViewById(R.id.yfc_clgs_bfb);
        yfc_clgs_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_clgs_bfb != 1){
            yfc_clgs_bfb.setSelection((int)(10-1 - Constant.yfc_clgs_bfb*10));
        }
        yfc_cy_bfb = (Spinner) view.findViewById(R.id.yfc_cy_bfb);
        yfc_cy_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_cy_bfb != 1){
            yfc_cy_bfb.setSelection((int)(10-1 - Constant.yfc_cy_bfb*10));
        }
        yfc_mc_bfb = (Spinner) view.findViewById(R.id.yfc_mc_bfb);
        yfc_mc_bfb.setOnItemSelectedListener(this);
        if (Constant.yfc_mc_bfb != 1){
            yfc_mc_bfb.setSelection((int)(10-1 - Constant.yfc_mc_bfb*10));
        }
        
        
        
        
        

        mYfc_zcdl = (EditText) view.findViewById(R.id.yfc_zcdl);
        mYfc_zcdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_zcdl != 0)
            mYfc_zcdl.setText(Constant.yfc_zcdl + "");

        mYfc_sd_sdl = (EditText) view.findViewById(R.id.yfc_sd_sdl);
        mYfc_sd_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.sd != 0)
            mYfc_sd_sdl.setText(Constant.sd + "");

        mYfc_sd_jshns = (EditText) view.findViewById(R.id.yfc_sd_jshns);
        mYfc_sd_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_sd_jshns != 0)
            mYfc_sd_jshns.setText(Constant.yfc_sd_jshns + "");

        mYfc_sd_mj = (EditText) view.findViewById(R.id.yfc_sd_mj);
        mYfc_sd_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_sd_mj != 0)
            mYfc_sd_mj.setText(Constant.yfc_sd_mj + "");

        mYfc_sd_zsdl = (EditText) view.findViewById(R.id.yfc_sd_zsdl);
        mYfc_sd_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_sd_zsdl != 0)
            mYfc_sd_zsdl.setText(Constant.yfc_sd_zsdl + "");

        mYfc_xm_sdl = (EditText) view.findViewById(R.id.yfc_xm_sdl);
        mYfc_xm_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.xm != 0)
            mYfc_xm_sdl.setText(Constant.xm + "");

        mYfc_xm_jshns = (EditText) view.findViewById(R.id.yfc_xm_jshns);
        mYfc_xm_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_xm_jshns != 0)
            mYfc_xm_jshns.setText(Constant.yfc_xm_jshns + "");

        mYfc_xm_mj = (EditText) view.findViewById(R.id.yfc_xm_mj);
        mYfc_xm_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_xm_mj != 0)
            mYfc_xm_mj.setText(Constant.yfc_xm_mj + "");

        mYfc_xm_zsdl = (EditText) view.findViewById(R.id.yfc_xm_zsdl);
        mYfc_xm_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_xm_zsdl != 0)
            mYfc_xm_zsdl.setText(Constant.yfc_xm_zsdl + "");

        mYfc_ym_sdl = (EditText) view.findViewById(R.id.yfc_ym_sdl);
        mYfc_ym_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.ym != 0)
            mYfc_ym_sdl.setText(Constant.ym + "");

        mYfc_ym_jshns = (EditText) view.findViewById(R.id.yfc_ym_jshns);
        mYfc_ym_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_ym_jshns != 0)
            mYfc_ym_jshns.setText(Constant.yfc_ym_jshns + "");

        mYfc_ym_mj = (EditText) view.findViewById(R.id.yfc_ym_mj);
        mYfc_ym_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_ym_mj != 0)
            mYfc_ym_mj.setText(Constant.yfc_ym_mj + "");
        mYfc_ym_zsdl = (EditText) view.findViewById(R.id.yfc_ym_zsdl);
        mYfc_ym_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_ym_zsdl != 0)
            mYfc_ym_zsdl.setText(Constant.yfc_ym_zsdl + "");

        mYfc_yc_sdl = (EditText) view.findViewById(R.id.yfc_yc_sdl);
        mYfc_yc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yc != 0)
            mYfc_yc_sdl.setText(Constant.yc + "");

        mYfc_yc_jshns = (EditText) view.findViewById(R.id.yfc_yc_jshns);
        mYfc_yc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_yc_jshns != 0)
            mYfc_yc_jshns.setText(Constant.yfc_yc_jshns + "");

        mYfc_yc_mj = (EditText) view.findViewById(R.id.yfc_yc_mj);
        mYfc_yc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_yc_mj != 0)
            mYfc_yc_mj.setText(Constant.yfc_yc_mj + "");

        mYfc_yc_zsdl = (EditText) view.findViewById(R.id.yfc_yc_zsdl);
        mYfc_yc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_yc_zsdl != 0)
            mYfc_yc_zsdl.setText(Constant.yfc_yc_zsdl + "");

        mYfc_gs_sdl = (EditText) view.findViewById(R.id.yfc_gs_sdl);
        mYfc_gs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.gs != 0)
            mYfc_gs_sdl.setText(Constant.gs + "");

        mYfc_gs_jshns = (EditText) view.findViewById(R.id.yfc_gs_jshns);
        mYfc_gs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_gs_jshns != 0)
            mYfc_gs_jshns.setText(Constant.yfc_gs_jshns + "");

        mYfc_gs_mj = (EditText) view.findViewById(R.id.yfc_gs_mj);
        mYfc_gs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_gs_mj != 0)
            mYfc_gs_mj.setText(Constant.yfc_gs_mj + "");

        mYfc_gs_zsdl = (EditText) view.findViewById(R.id.yfc_gs_zsdl);
        mYfc_gs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_gs_zsdl != 0)
            mYfc_gs_zsdl.setText(Constant.yfc_gs_zsdl + "");

        mYfc_mls_sdl = (EditText) view.findViewById(R.id.yfc_mls_sdl);
        mYfc_mls_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.mls != 0)
            mYfc_mls_sdl.setText(Constant.mls + "");
        mYfc_mls_jshns = (EditText) view.findViewById(R.id.yfc_mls_jshns);
        mYfc_mls_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_mls_jshns != 0)
            mYfc_mls_jshns.setText(Constant.yfc_mls_jshns + "");

        mYfc_mls_mj = (EditText) view.findViewById(R.id.yfc_mls_mj);
        mYfc_mls_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_mls_mj != 0)
            mYfc_mls_mj.setText(Constant.yfc_mls_mj + "");

        mYfc_mls_zsdl = (EditText) view.findViewById(R.id.yfc_mls_zsdl);
        mYfc_mls_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_mls_zsdl != 0)
            mYfc_mls_zsdl.setText(Constant.yfc_mls_zsdl + "");

        mYfc_qglsc_sdl = (EditText) view.findViewById(R.id.yfc_qglsc_sdl);
        mYfc_qglsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.qglsc != 0)
            mYfc_qglsc_sdl.setText(Constant.qglsc + "");

        mYfc_qglsc_jshns = (EditText) view.findViewById(R.id.yfc_qglsc_jshns);
        mYfc_qglsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_qglsc_jshns != 0)
            mYfc_qglsc_jshns.setText(Constant.yfc_qglsc_jshns + "");

        mYfc_qglsc_mj = (EditText) view.findViewById(R.id.yfc_qglsc_mj);
        mYfc_qglsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_qglsc_mj != 0)
            mYfc_qglsc_mj.setText(Constant.yfc_qglsc_mj + "");

        mYfc_qglsc_zsdl = (EditText) view.findViewById(R.id.yfc_qglsc_zsdl);
        mYfc_qglsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_qglsc_zsdl != 0)
            mYfc_zcdl.setText(Constant.yfc_qglsc_zsdl + "");

        mYfc_ggsc_sdl = (EditText) view.findViewById(R.id.yfc_ggsc_sdl);
        mYfc_ggsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.glsc != 0)
            mYfc_ggsc_sdl.setText(Constant.glsc + "");

        mYfc_ggsc_jshns = (EditText) view.findViewById(R.id.yfc_ggsc_jshns);
        mYfc_ggsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_ggsc_jshns != 0)
            mYfc_ggsc_jshns.setText(Constant.yfc_ggsc_jshns + "");

        mYfc_ggsc_mj = (EditText) view.findViewById(R.id.yfc_ggsc_mj);
        mYfc_ggsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_ggsc_mj != 0)
            mYfc_ggsc_mj.setText(Constant.yfc_ggsc_mj + "");

        mYfc_ggsc_zsdl = (EditText) view.findViewById(R.id.yfc_ggsc_zsdl);
        mYfc_ggsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_ggsc_zsdl != 0)
            mYfc_ggsc_zsdl.setText(Constant.yfc_ggsc_zsdl + "");

        mYfc_yclsc_sdl = (EditText) view.findViewById(R.id.yfc_yclsc_sdl);
        mYfc_yclsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yclsc != 0)
            mYfc_yclsc_sdl.setText(Constant.yclsc + "");

        mYfc_yclsc_jshns = (EditText) view.findViewById(R.id.yfc_yclsc_jshns);
        mYfc_yclsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_yclsc_jshns != 0)
            mYfc_yclsc_jshns.setText(Constant.yfc_yclsc_jshns + "");

        mYfc_yclsc_mj = (EditText) view.findViewById(R.id.yfc_yclsc_mj);
        mYfc_yclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_yclsc_mj != 0)
            mYfc_yclsc_mj.setText(Constant.yfc_yclsc_mj + "");

        mYfc_yclsc_zsdl = (EditText) view.findViewById(R.id.yfc_yclsc_zsdl);
        mYfc_yclsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_yclsc_zsdl != 0)
            mYfc_yclsc_zsdl.setText(Constant.yfc_yclsc_zsdl + "");

        mYfc_gclsc_sdl = (EditText) view.findViewById(R.id.yfc_gclsc_sdl);
        mYfc_gclsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.gclsc != 0)
            mYfc_gclsc_sdl.setText(Constant.gclsc + "");

        mYfc_gclsc_jshns = (EditText) view.findViewById(R.id.yfc_gclsc_jshns);
        mYfc_gclsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_gclsc_jshns != 0)
            mYfc_gclsc_jshns.setText(Constant.yfc_gclsc_jshns + "");

        mYfc_gclsc_mj = (EditText) view.findViewById(R.id.yfc_gclsc_mj);
        mYfc_gclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_gclsc_mj != 0)
            mYfc_gclsc_mj.setText(Constant.yfc_gclsc_mj + "");

        mYfc_gclsc_zsdl = (EditText) view.findViewById(R.id.yfc_gclsc_zsdl);
        mYfc_gclsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_gclsc_zsdl != 0)
            mYfc_gclsc_zsdl.setText(Constant.yfc_gclsc_zsdl + "");

        mYfc_dlsc_sdl = (EditText) view.findViewById(R.id.yfc_dlsc_sdl);
        mYfc_dlsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.dlsc != 0)
            mYfc_dlsc_sdl.setText(Constant.dlsc + "");

        mYfc_dlsc_jshns = (EditText) view.findViewById(R.id.yfc_dlsc_jshns);
        mYfc_dlsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_dlsc_jshns != 0)
            mYfc_dlsc_jshns.setText(Constant.yfc_dlsc_jshns + "");

        mYfc_dlsc_mj = (EditText) view.findViewById(R.id.yfc_dlsc_mj);
        mYfc_dlsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_dlsc_mj != 0)
            mYfc_dlsc_mj.setText(Constant.yfc_dlsc_mj + "");

        mYfc_dlsc_zsdl = (EditText) view.findViewById(R.id.yfc_dlsc_zsdl);
        mYfc_dlsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_dlsc_zsdl != 0)
            mYfc_dlsc_zsdl.setText(Constant.yfc_dlsc_zsdl + "");

        mYfc_cslsc_sdl = (EditText) view.findViewById(R.id.yfc_cslsc_sdl);
        mYfc_cslsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.cslsc != 0)
            mYfc_cslsc_sdl.setText(Constant.cslsc + "");

        mYfc_cslsc_jshns = (EditText) view.findViewById(R.id.yfc_cslsc_jshns);
        mYfc_cslsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cslsc_jshns != 0)
            mYfc_cslsc_jshns.setText(Constant.yfc_cslsc_jshns + "");

        mYfc_cslsc_mj = (EditText) view.findViewById(R.id.yfc_cslsc_mj);
        mYfc_cslsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cslsc_mj != 0)
            mYfc_cslsc_mj.setText(Constant.yfc_cslsc_mj + "");

        mYfc_cslsc_zsdl = (EditText) view.findViewById(R.id.yfc_cslsc_zsdl);
        mYfc_cslsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cslsc_zsdl != 0)
            mYfc_cslsc_zsdl.setText(Constant.yfc_cslsc_zsdl + "");

        mYfc_lygs_sdl = (EditText) view.findViewById(R.id.yfc_lygs_sdl);
        mYfc_lygs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.lygs != 0)
            mYfc_lygs_sdl.setText(Constant.lygs + "");

        mYfc_lygs_jshns = (EditText) view.findViewById(R.id.yfc_lygs_jshns);
        mYfc_lygs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_lygs_jshns != 0)
            mYfc_lygs_jshns.setText(Constant.yfc_lygs_jshns + "");

        mYfc_lygs_mj = (EditText) view.findViewById(R.id.yfc_lygs_mj);
        mYfc_lygs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_lygs_mj != 0)
            mYfc_lygs_mj.setText(Constant.yfc_lygs_mj + "");

        mYfc_lygs_zsdl = (EditText) view.findViewById(R.id.yfc_lygs_zsdl);
        mYfc_lygs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_lygs_zsdl != 0)
            mYfc_lygs_zsdl.setText(Constant.yfc_lygs_zsdl + "");

        mYfc_clgs_sdl = (EditText) view.findViewById(R.id.yfc_clgs_sdl);
        mYfc_clgs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.clgs != 0)
            mYfc_clgs_sdl.setText(Constant.clgs + "");

        mYfc_clgs_jshns = (EditText) view.findViewById(R.id.yfc_clgs_jshns);
        mYfc_clgs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_clgs_jshns != 0)
            mYfc_clgs_jshns.setText(Constant.yfc_clgs_jshns + "");

        mYfc_clgs_mj = (EditText) view.findViewById(R.id.yfc_clgs_mj);
        mYfc_clgs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_clgs_mj != 0)
            mYfc_clgs_mj.setText(Constant.yfc_clgs_mj + "");

        mYfc_clgs_zsdl = (EditText) view.findViewById(R.id.yfc_clgs_zsdl);
        mYfc_clgs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_clgs_zsdl != 0)
            mYfc_clgs_zsdl.setText(Constant.yfc_clgs_zsdl + "");

        mYfc_cy_sdl = (EditText) view.findViewById(R.id.yfc_cy_sdl);
        mYfc_cy_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.cy != 0)
            mYfc_cy_sdl.setText(Constant.cy + "");

        mYfc_cy_jshns = (EditText) view.findViewById(R.id.yfc_cy_jshns);
        mYfc_cy_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cy_jshns != 0)
            mYfc_cy_jshns.setText(Constant.yfc_cy_jshns + "");

        mYfc_cy_mj = (EditText) view.findViewById(R.id.yfc_cy_mj);
        mYfc_cy_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cy_mj != 0)
            mYfc_cy_mj.setText(Constant.yfc_cy_mj + "");

        mYfc_cy_zsdl = (EditText) view.findViewById(R.id.yfc_cy_zsdl);
        mYfc_cy_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cy_zsdl != 0)
            mYfc_cy_zsdl.setText(Constant.yfc_cy_zsdl + "");

        mYfc_mc_sdl = (EditText) view.findViewById(R.id.yfc_mc_sdl);
        mYfc_mc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.mc != 0)
            mYfc_mc_sdl.setText(Constant.mc + "");

        mYfc_mc_jshns = (EditText) view.findViewById(R.id.yfc_mc_jshns);
        mYfc_mc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_mc_jshns != 0)
            mYfc_mc_jshns.setText(Constant.yfc_mc_jshns + "");

        mYfc_mc_mj = (EditText) view.findViewById(R.id.yfc_mc_mj);
        mYfc_mc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_mc_mj != 0)
            mYfc_mc_mj.setText(Constant.yfc_mc_mj + "");

        mYfc_mc_zsdl = (EditText) view.findViewById(R.id.yfc_mc_zsdl);
        mYfc_mc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_mc_zsdl != 0)
            mYfc_mc_zsdl.setText(Constant.yfc_mc_zsdl + "");

        mYfc_hj_sdl = (EditText) view.findViewById(R.id.yfc_hj_sdl);
        mYfc_hj_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_hj_sdl != 0)
            mYfc_hj_sdl.setText(Constant.yfc_hj_sdl + "");

        mYfc_hj_jshns = (EditText) view.findViewById(R.id.yfc_hj_jshns);
        mYfc_hj_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_hj_jshns != 0)
            mYfc_hj_jshns.setText(Constant.yfc_hj_jshns + "");

        mYfc_hj_mj = (EditText) view.findViewById(R.id.yfc_hj_mj);
        mYfc_hj_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_hj_mj != 0)
            mYfc_hj_mj.setText(Constant.yfc_hj_mj + "");

        mYfc_hj_zsdl = (EditText) view.findViewById(R.id.yfc_hj_zsdl);
        mYfc_hj_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_hj_zsdl != 0)
            mYfc_hj_zsdl.setText(Constant.yfc_hj_zsdl + "");

        mYfc_cz_sdl = (EditText) view.findViewById(R.id.yfc_cz_sdl);
        mYfc_cz_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cz_sdl != 0)
            mYfc_cz_sdl.setText(Constant.yfc_cz_sdl + "");

        mYfc_cz_jshns = (EditText) view.findViewById(R.id.yfc_cz_jshns);
        mYfc_cz_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cz_jshns != 0)
            mYfc_cz_jshns.setText(Constant.yfc_cz_jshns + "");

        mYfc_cz_mj = (EditText) view.findViewById(R.id.yfc_cz_mj);
        mYfc_cz_mj.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cz_mj != 0)
            mYfc_cz_mj.setText(Constant.yfc_cz_mj + "");

        mYfc_cz_zsdl = (EditText) view.findViewById(R.id.yfc_cz_zsdl);
        mYfc_cz_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.yfc_cz_zsdl != 0)
            mYfc_cz_zsdl.setText(Constant.yfc_cz_zsdl + "");

    }

    @Override
    public void saveData(EditText view, String text) {
        if (view == mYfc_zcdl) {
            String yfc_zcdl = mYfc_zcdl.getText().toString();
            Constant.yfc_zcdl = Double.parseDouble(yfc_zcdl);
            SpUtil.saveSP(getContext(), "yfc_zcdl", Constant.yfc_zcdl);
        }
        if (view == mYfc_sd_sdl) {
            String yfc_sd_sdl = mYfc_sd_sdl.getText().toString();
            Constant.sd = Double.parseDouble(yfc_sd_sdl);
            SpUtil.saveSP(getContext(), "sd", Constant.sd);
        }
        if (view == mYfc_sd_jshns) {
            String yfc_sd_jshns = mYfc_sd_jshns.getText().toString();
            Constant.yfc_sd_jshns = Double.parseDouble(yfc_sd_jshns);
            SpUtil.saveSP(getContext(), "yfc_sd_jshns", Constant.yfc_sd_jshns);
        }
        if (view == mYfc_sd_mj) {
            String yfc_sd_mj = mYfc_sd_mj.getText().toString();
            Constant.yfc_sd_mj = Double.parseDouble(yfc_sd_mj);
            SpUtil.saveSP(getContext(), "yfc_sd_mj", Constant.yfc_sd_mj);
        }
        if (view == mYfc_sd_zsdl) {
            String yfc_sd_zsdl = mYfc_sd_zsdl.getText().toString();
            Constant.yfc_sd_zsdl = Double.parseDouble(yfc_sd_zsdl);
            SpUtil.saveSP(getContext(), "yfc_sd_zsdl", Constant.yfc_sd_zsdl);
        }
        if (view == mYfc_xm_sdl) {
            String yfc_xm_sdl = mYfc_xm_sdl.getText().toString();
            Constant.xm = Double.parseDouble(yfc_xm_sdl);
            SpUtil.saveSP(getContext(), "xm", Constant.xm);
        }
        if (view == mYfc_xm_jshns) {
            String yfc_xm_jshns = mYfc_xm_jshns.getText().toString();
            Constant.yfc_xm_jshns = Double.parseDouble(yfc_xm_jshns);
            SpUtil.saveSP(getContext(), "yfc_xm_jshns", Constant.yfc_xm_jshns);
        }
        if (view == mYfc_xm_mj) {
            String yfc_xm_mj = mYfc_xm_mj.getText().toString();
            Constant.yfc_xm_mj = Double.parseDouble(yfc_xm_mj);
            SpUtil.saveSP(getContext(), "yfc_xm_mj", Constant.yfc_xm_mj);
        }
        if (view == mYfc_xm_zsdl) {
            String yfc_xm_zsdl = mYfc_xm_zsdl.getText().toString();
            Constant.yfc_xm_zsdl = Double.parseDouble(yfc_xm_zsdl);
            SpUtil.saveSP(getContext(), "yfc_xm_zsdl", Constant.yfc_xm_zsdl);
        }
        if (view == mYfc_ym_sdl) {
            String yfc_ym_sdl = mYfc_ym_sdl.getText().toString();
            Constant.ym = Double.parseDouble(yfc_ym_sdl);
            SpUtil.saveSP(getContext(), "ym", Constant.ym);
        }
        if (view == mYfc_ym_jshns) {
            String yfc_ym_jshns = mYfc_ym_jshns.getText().toString();
            Constant.yfc_ym_jshns = Double.parseDouble(yfc_ym_jshns);
            SpUtil.saveSP(getContext(), "yfc_ym_jshns", Constant.yfc_ym_jshns);
        }
        if (view == mYfc_ym_mj) {
            String yfc_ym_mj = mYfc_ym_mj.getText().toString();
            Constant.yfc_ym_mj = Double.parseDouble(yfc_ym_mj);
            SpUtil.saveSP(getContext(), "yfc_ym_mj", Constant.yfc_ym_mj);
        }
        if (view == mYfc_ym_zsdl) {
            String yfc_ym_zsdl = mYfc_ym_zsdl.getText().toString();
            Constant.yfc_ym_zsdl = Double.parseDouble(yfc_ym_zsdl);
            SpUtil.saveSP(getContext(), "yfc_ym_zsdl", Constant.yfc_ym_zsdl);
        }
        if (view == mYfc_yc_sdl) {
            String yfc_yc_sdl = mYfc_yc_sdl.getText().toString();
            Constant.yc = Double.parseDouble(yfc_yc_sdl);
            SpUtil.saveSP(getContext(), "yc", Constant.yc);
        }
        if (view == mYfc_yc_jshns) {
            String yfc_yc_jshns = mYfc_yc_jshns.getText().toString();
            Constant.yfc_yc_jshns = Double.parseDouble(yfc_yc_jshns);
            SpUtil.saveSP(getContext(), "yfc_yc_jshns", Constant.yfc_yc_jshns);
        }
        if (view == mYfc_yc_mj) {
            String yfc_yc_mj = mYfc_yc_mj.getText().toString();
            Constant.yfc_yc_mj = Double.parseDouble(yfc_yc_mj);
            SpUtil.saveSP(getContext(), "yfc_yc_mj", Constant.yfc_yc_mj);
        }
        if (view == mYfc_yc_zsdl) {
            String yfc_yc_zsdl = mYfc_yc_zsdl.getText().toString();
            Constant.yfc_yc_zsdl = Double.parseDouble(yfc_yc_zsdl);
            SpUtil.saveSP(getContext(), "yfc_yc_zsdl", Constant.yfc_yc_zsdl);
        }
        if (view == mYfc_gs_sdl) {
            String yfc_gs_sdl = mYfc_gs_sdl.getText().toString();
            Constant.gs = Double.parseDouble(yfc_gs_sdl);
            SpUtil.saveSP(getContext(), "gs", Constant.gs);
        }
        if (view == mYfc_gs_jshns) {
            String yfc_gs_jshns = mYfc_gs_jshns.getText().toString();
            Constant.yfc_gs_jshns = Double.parseDouble(yfc_gs_jshns);
            SpUtil.saveSP(getContext(), "yfc_gs_jshns", Constant.yfc_gs_jshns);
        }
        if (view == mYfc_gs_mj) {
            String yfc_gs_mj = mYfc_gs_mj.getText().toString();
            Constant.yfc_gs_mj = Double.parseDouble(yfc_gs_mj);
            SpUtil.saveSP(getContext(), "yfc_gs_mj", Constant.yfc_gs_mj);
        }
        if (view == mYfc_gs_zsdl) {
            String yfc_gs_zsdl = mYfc_gs_zsdl.getText().toString();
            Constant.yfc_gs_zsdl = Double.parseDouble(yfc_gs_zsdl);
            SpUtil.saveSP(getContext(), "yfc_gs_zsdl", Constant.yfc_gs_zsdl);
        }
        if (view == mYfc_mls_sdl) {
            String yfc_mls_sdl = mYfc_mls_sdl.getText().toString();
            Constant.mls = Double.parseDouble(yfc_mls_sdl);
            SpUtil.saveSP(getContext(), "mls", Constant.mls);
        }
        if (view == mYfc_mls_jshns) {
            String yfc_mls_jshns = mYfc_mls_jshns.getText().toString();
            Constant.yfc_mls_jshns = Double.parseDouble(yfc_mls_jshns);
            SpUtil.saveSP(getContext(), "yfc_mls_jshns", Constant.yfc_mls_jshns);
        }
        if (view == mYfc_mls_mj) {
            String yfc_mls_mj = mYfc_mls_mj.getText().toString();
            Constant.yfc_mls_mj = Double.parseDouble(yfc_mls_mj);
            SpUtil.saveSP(getContext(), "yfc_mls_mj", Constant.yfc_mls_mj);
        }
        if (view == mYfc_mls_zsdl) {
            String yfc_mls_zsdl = mYfc_mls_zsdl.getText().toString();
            Constant.yfc_mls_zsdl = Double.parseDouble(yfc_mls_zsdl);
            SpUtil.saveSP(getContext(), "yfc_mls_zsdl", Constant.yfc_mls_zsdl);
        }
        if (view == mYfc_qglsc_sdl) {
            String yfc_qglsc_sdl = mYfc_qglsc_sdl.getText().toString();
            Constant.qglsc = Double.parseDouble(yfc_qglsc_sdl);
            SpUtil.saveSP(getContext(), "qglsc", Constant.qglsc);
        }
        if (view == mYfc_qglsc_jshns) {
            String yfc_qglsc_jshns = mYfc_qglsc_jshns.getText().toString();
            Constant.yfc_qglsc_jshns = Double.parseDouble(yfc_qglsc_jshns);
            SpUtil.saveSP(getContext(), "yfc_qglsc_jshns", Constant.yfc_qglsc_jshns);
        }
        if (view == mYfc_qglsc_mj) {
            String yfc_qglsc_mj = mYfc_qglsc_mj.getText().toString();
            Constant.yfc_qglsc_mj = Double.parseDouble(yfc_qglsc_mj);
            SpUtil.saveSP(getContext(), "yfc_qglsc_mj", Constant.yfc_qglsc_mj);
        }
        if (view == mYfc_qglsc_zsdl) {
            String yfc_qglsc_zsdl = mYfc_qglsc_zsdl.getText().toString();
            Constant.yfc_qglsc_zsdl = Double.parseDouble(yfc_qglsc_zsdl);
            SpUtil.saveSP(getContext(), "yfc_qglsc_zsdl", Constant.yfc_qglsc_zsdl);
        }
        if (view == mYfc_ggsc_sdl) {
            String yfc_ggsc_sdl = mYfc_ggsc_sdl.getText().toString();
            Constant.glsc = Double.parseDouble(yfc_ggsc_sdl);
            SpUtil.saveSP(getContext(), "glsc", Constant.glsc);
        }
        if (view == mYfc_ggsc_jshns) {
            String yfc_ggsc_jshns = mYfc_ggsc_jshns.getText().toString();
            Constant.yfc_ggsc_jshns = Double.parseDouble(yfc_ggsc_jshns);
            SpUtil.saveSP(getContext(), "yfc_ggsc_jshns", Constant.yfc_ggsc_jshns);
        }
        if (view == mYfc_ggsc_mj) {
            String yfc_ggsc_mj = mYfc_ggsc_mj.getText().toString();
            Constant.yfc_ggsc_mj = Double.parseDouble(yfc_ggsc_mj);
            SpUtil.saveSP(getContext(), "yfc_ggsc_mj", Constant.yfc_ggsc_mj);
        }
        if (view == mYfc_ggsc_zsdl) {
            String yfc_ggsc_zsdl = mYfc_ggsc_zsdl.getText().toString();
            Constant.yfc_ggsc_zsdl = Double.parseDouble(yfc_ggsc_zsdl);
            SpUtil.saveSP(getContext(), "yfc_ggsc_zsdl", Constant.yfc_ggsc_zsdl);
        }
        if (view == mYfc_yclsc_sdl) {
            String yfc_yclsc_sdl = mYfc_yclsc_sdl.getText().toString();
            Constant.yclsc = Double.parseDouble(yfc_yclsc_sdl);
            SpUtil.saveSP(getContext(), "yclsc", Constant.yclsc);
        }
        if (view == mYfc_yclsc_jshns) {
            String yfc_yclsc_jshns = mYfc_yclsc_jshns.getText().toString();
            Constant.yfc_yclsc_jshns = Double.parseDouble(yfc_yclsc_jshns);
            SpUtil.saveSP(getContext(), "yfc_yclsc_jshns", Constant.yfc_yclsc_jshns);
        }
        if (view == mYfc_yclsc_mj) {
            String yfc_yclsc_mj = mYfc_yclsc_mj.getText().toString();
            Constant.yfc_yclsc_mj = Double.parseDouble(yfc_yclsc_mj);
            SpUtil.saveSP(getContext(), "yfc_yclsc_mj", Constant.yfc_yclsc_mj);
        }
        if (view == mYfc_yclsc_zsdl) {
            String yfc_yclsc_zsdl = mYfc_yclsc_zsdl.getText().toString();
            Constant.yfc_yclsc_zsdl = Double.parseDouble(yfc_yclsc_zsdl);
            SpUtil.saveSP(getContext(), "yfc_yclsc_zsdl", Constant.yfc_yclsc_zsdl);
        }
        if (view == mYfc_gclsc_sdl) {
            String yfc_gclsc_sdl = mYfc_gclsc_sdl.getText().toString();
            Constant.gclsc = Double.parseDouble(yfc_gclsc_sdl);
            SpUtil.saveSP(getContext(), "gclsc", Constant.gclsc);
        }
        if (view == mYfc_gclsc_jshns) {
            String yfc_gclsc_jshns = mYfc_gclsc_jshns.getText().toString();
            Constant.yfc_gclsc_jshns = Double.parseDouble(yfc_gclsc_jshns);
            SpUtil.saveSP(getContext(), "yfc_gclsc_jshns", Constant.yfc_gclsc_jshns);
        }
        if (view == mYfc_gclsc_mj) {
            String yfc_gclsc_mj = mYfc_gclsc_mj.getText().toString();
            Constant.yfc_gclsc_mj = Double.parseDouble(yfc_gclsc_mj);
            SpUtil.saveSP(getContext(), "yfc_gclsc_mj", Constant.yfc_gclsc_mj);
        }
        if (view == mYfc_gclsc_zsdl) {
            String yfc_gclsc_zsdl = mYfc_gclsc_zsdl.getText().toString();
            Constant.yfc_gclsc_zsdl = Double.parseDouble(yfc_gclsc_zsdl);
            SpUtil.saveSP(getContext(), "yfc_gclsc_zsdl", Constant.yfc_gclsc_zsdl);
        }
        if (view == mYfc_dlsc_sdl) {
            String yfc_dlsc_sdl = mYfc_dlsc_sdl.getText().toString();
            Constant.dlsc = Double.parseDouble(yfc_dlsc_sdl);
            SpUtil.saveSP(getContext(), "dlsc", Constant.dlsc);
        }
        if (view == mYfc_dlsc_jshns) {
            String yfc_dlsc_jshns = mYfc_dlsc_jshns.getText().toString();
            Constant.yfc_dlsc_jshns = Double.parseDouble(yfc_dlsc_jshns);
            SpUtil.saveSP(getContext(), "yfc_dlsc_jshns", Constant.yfc_dlsc_jshns);
        }
        if (view == mYfc_dlsc_mj) {
            String yfc_dlsc_mj = mYfc_dlsc_mj.getText().toString();
            Constant.yfc_dlsc_mj = Double.parseDouble(yfc_dlsc_mj);
            SpUtil.saveSP(getContext(), "yfc_dlsc_mj", Constant.yfc_dlsc_mj);
        }
        if (view == mYfc_dlsc_zsdl) {
            String yfc_dlsc_zsdl = mYfc_dlsc_zsdl.getText().toString();
            Constant.yfc_dlsc_zsdl = Double.parseDouble(yfc_dlsc_zsdl);
            SpUtil.saveSP(getContext(), "yfc_dlsc_zsdl", Constant.yfc_dlsc_zsdl);
        }
        if (view == mYfc_cslsc_sdl) {
            String yfc_cslsc_sdl = mYfc_cslsc_sdl.getText().toString();
            Constant.cslsc = Double.parseDouble(yfc_cslsc_sdl);
            SpUtil.saveSP(getContext(), "cslsc", Constant.cslsc);
        }
        if (view == mYfc_cslsc_jshns) {
            String yfc_cslsc_jshns = mYfc_cslsc_jshns.getText().toString();
            Constant.yfc_cslsc_jshns = Double.parseDouble(yfc_cslsc_jshns);
            SpUtil.saveSP(getContext(), "yfc_cslsc_jshns", Constant.yfc_cslsc_jshns);
        }
        if (view == mYfc_cslsc_mj) {
            String yfc_cslsc_mj = mYfc_cslsc_mj.getText().toString();
            Constant.yfc_cslsc_mj = Double.parseDouble(yfc_cslsc_mj);
            SpUtil.saveSP(getContext(), "yfc_cslsc_mj", Constant.yfc_cslsc_mj);
        }
        if (view == mYfc_cslsc_zsdl) {
            String yfc_cslsc_zsdl = mYfc_cslsc_zsdl.getText().toString();
            Constant.yfc_cslsc_zsdl = Double.parseDouble(yfc_cslsc_zsdl);
            SpUtil.saveSP(getContext(), "yfc_cslsc_zsdl", Constant.yfc_cslsc_zsdl);
        }
        if (view == mYfc_lygs_sdl) {
            String yfc_lygs_sdl = mYfc_lygs_sdl.getText().toString();
            Constant.lygs = Double.parseDouble(yfc_lygs_sdl);
            SpUtil.saveSP(getContext(), "lygs", Constant.lygs);
        }
        if (view == mYfc_lygs_jshns) {
            String yfc_lygs_jshns = mYfc_lygs_jshns.getText().toString();
            Constant.yfc_lygs_jshns = Double.parseDouble(yfc_lygs_jshns);
            SpUtil.saveSP(getContext(), "yfc_lygs_jshns", Constant.yfc_lygs_jshns);
        }
        if (view == mYfc_lygs_mj) {
            String yfc_lygs_mj = mYfc_lygs_mj.getText().toString();
            Constant.yfc_lygs_mj = Double.parseDouble(yfc_lygs_mj);
            SpUtil.saveSP(getContext(), "yfc_lygs_mj", Constant.yfc_lygs_mj);
        }
        if (view == mYfc_lygs_zsdl) {
            String yfc_lygs_zsdl = mYfc_lygs_zsdl.getText().toString();
            Constant.yfc_lygs_zsdl = Double.parseDouble(yfc_lygs_zsdl);
            SpUtil.saveSP(getContext(), "yfc_lygs_zsdl", Constant.yfc_lygs_zsdl);
        }
        if (view == mYfc_clgs_sdl) {
            String yfc_clgs_sdl = mYfc_clgs_sdl.getText().toString();
            Constant.clgs = Double.parseDouble(yfc_clgs_sdl);
            SpUtil.saveSP(getContext(), "clgs", Constant.clgs);
        }
        if (view == mYfc_clgs_jshns) {
            String yfc_clgs_jshns = mYfc_clgs_jshns.getText().toString();
            Constant.yfc_clgs_jshns = Double.parseDouble(yfc_clgs_jshns);
            SpUtil.saveSP(getContext(), "yfc_clgs_jshns", Constant.yfc_clgs_jshns);
        }
        if (view == mYfc_clgs_mj) {
            String yfc_clgs_mj = mYfc_clgs_mj.getText().toString();
            Constant.yfc_clgs_mj = Double.parseDouble(yfc_clgs_mj);
            SpUtil.saveSP(getContext(), "yfc_clgs_mj", Constant.yfc_clgs_mj);
        }
        if (view == mYfc_clgs_zsdl) {
            String yfc_clgs_zsdl = mYfc_clgs_zsdl.getText().toString();
            Constant.yfc_clgs_zsdl = Double.parseDouble(yfc_clgs_zsdl);
            SpUtil.saveSP(getContext(), "yfc_clgs_zsdl", Constant.yfc_clgs_zsdl);
        }
        if (view == mYfc_cy_sdl) {
            String yfc_cy_sdl = mYfc_cy_sdl.getText().toString();
            Constant.cy = Double.parseDouble(yfc_cy_sdl);
            SpUtil.saveSP(getContext(), "cy", Constant.cy);
        }
        if (view == mYfc_cy_jshns) {
            String yfc_cy_jshns = mYfc_cy_jshns.getText().toString();
            Constant.yfc_cy_jshns = Double.parseDouble(yfc_cy_jshns);
            SpUtil.saveSP(getContext(), "yfc_cy_jshns", Constant.yfc_cy_jshns);
        }
        if (view == mYfc_cy_mj) {
            String yfc_cy_mj = mYfc_cy_mj.getText().toString();
            Constant.yfc_cy_mj = Double.parseDouble(yfc_cy_mj);
            SpUtil.saveSP(getContext(), "yfc_cy_mj", Constant.yfc_cy_mj);
        }
        if (view == mYfc_cy_zsdl) {
            String yfc_cy_zsdl = mYfc_cy_zsdl.getText().toString();
            Constant.yfc_cy_zsdl = Double.parseDouble(yfc_cy_zsdl);
            SpUtil.saveSP(getContext(), "yfc_cy_zsdl", Constant.yfc_cy_zsdl);
        }
        if (view == mYfc_mc_sdl) {
            String yfc_mc_sdl = mYfc_mc_sdl.getText().toString();
            Constant.mc = Double.parseDouble(yfc_mc_sdl);
            SpUtil.saveSP(getContext(), "mc", Constant.mc);
        }
        if (view == mYfc_mc_jshns) {
            String yfc_mc_jshns = mYfc_mc_jshns.getText().toString();
            Constant.yfc_mc_jshns = Double.parseDouble(yfc_mc_jshns);
            SpUtil.saveSP(getContext(), "yfc_mc_jshns", Constant.yfc_mc_jshns);
        }
        if (view == mYfc_mc_mj) {
            String yfc_mc_mj = mYfc_mc_mj.getText().toString();
            Constant.yfc_mc_mj = Double.parseDouble(yfc_mc_mj);
            SpUtil.saveSP(getContext(), "yfc_mc_mj", Constant.yfc_mc_mj);
        }
        if (view == mYfc_mc_zsdl) {
            String yfc_mc_zsdl = mYfc_mc_zsdl.getText().toString();
            Constant.yfc_mc_zsdl = Double.parseDouble(yfc_mc_zsdl);
            SpUtil.saveSP(getContext(), "yfc_mc_zsdl", Constant.yfc_mc_zsdl);
        }
        if (view == mYfc_hj_sdl) {
            String yfc_hj_sdl = mYfc_hj_sdl.getText().toString();
            Constant.yfc_hj_sdl = Double.parseDouble(yfc_hj_sdl);
            SpUtil.saveSP(getContext(), "yfc_hj_sdl", Constant.yfc_hj_sdl);
        }
        if (view == mYfc_hj_jshns) {
            String yfc_hj_jshns = mYfc_hj_jshns.getText().toString();
            Constant.yfc_hj_jshns = Double.parseDouble(yfc_hj_jshns);
            SpUtil.saveSP(getContext(), "yfc_hj_jshns", Constant.yfc_hj_jshns);
        }
        if (view == mYfc_hj_mj) {
            String yfc_hj_mj = mYfc_hj_mj.getText().toString();
            Constant.yfc_hj_mj = Double.parseDouble(yfc_hj_mj);
            SpUtil.saveSP(getContext(), "yfc_hj_mj", Constant.yfc_hj_mj);
        }
        if (view == mYfc_hj_zsdl) {
            String yfc_hj_zsdl = mYfc_hj_zsdl.getText().toString();
            Constant.yfc_hj_zsdl = Double.parseDouble(yfc_hj_zsdl);
            SpUtil.saveSP(getContext(), "yfc_hj_zsdl", Constant.yfc_hj_zsdl);
        }
        if (view == mYfc_cz_sdl) {
            String yfc_cz_sdl = mYfc_cz_sdl.getText().toString();
            Constant.yfc_cz_sdl = Double.parseDouble(yfc_cz_sdl);
            SpUtil.saveSP(getContext(), "yfc_cz_sdl", Constant.yfc_cz_sdl);
        }
        if (view == mYfc_cz_jshns) {
            String yfc_cz_jshns = mYfc_cz_jshns.getText().toString();
            Constant.yfc_cz_jshns = Double.parseDouble(yfc_cz_jshns);
            SpUtil.saveSP(getContext(), "yfc_cz_jshns", Constant.yfc_cz_jshns);
        }
        if (view == mYfc_cz_mj) {
            String yfc_cz_mj = mYfc_cz_mj.getText().toString();
            Constant.yfc_cz_mj = Double.parseDouble(yfc_cz_mj);
            SpUtil.saveSP(getContext(), "yfc_cz_mj", Constant.yfc_cz_mj);
        }
        if (view == mYfc_cz_zsdl) {
            String yfc_cz_zsdl = mYfc_cz_zsdl.getText().toString();
            Constant.yfc_cz_zsdl = Double.parseDouble(yfc_cz_zsdl);
            SpUtil.saveSP(getContext(), "yfc_cz_zsdl", Constant.yfc_cz_zsdl);
        }


    }

    @Override
    public void jsDatas() {
        try {
            Constant.yfc_zcdl = Utils.keep2Wdouble(Constant.clspzs * Constant.szyfz_flhj * 365, 0);
            //ddd
            Constant.yfc_sd_zsdl = Constant.sd * Constant.yfc_sd_mj* Constant.yfc_sd_jshns* Constant.yfc_sd_bfb;
            //SpUtil.saveSP(getContext(), "yfc_sd_zsdl", Constant.yfc_sd_zsdl);

            Constant.yfc_xm_zsdl = Constant.xm * Constant.yfc_xm_mj* Constant.yfc_xm_jshns* Constant.yfc_xm_bfb;
            //SpUtil.saveSP(getContext(), "yfc_xm_zsdl", Constant.yfc_xm_zsdl);

            Constant.yfc_ym_zsdl = Constant.ym * Constant.yfc_ym_mj* Constant.yfc_ym_jshns* Constant.yfc_ym_bfb;
            //SpUtil.saveSP(getContext(), "yfc_ym_zsdl", Constant.yfc_ym_zsdl);

            Constant.yfc_yc_zsdl = Constant.yc * Constant.yfc_yc_mj* Constant.yfc_yc_jshns* Constant.yfc_yc_bfb;
            //SpUtil.saveSP(getContext(), "yfc_yc_zsdl", Constant.yfc_yc_zsdl);

            Constant.yfc_gs_zsdl = Constant.gs * Constant.yfc_gs_mj* Constant.yfc_gs_jshns* Constant.yfc_gs_bfb;
            //SpUtil.saveSP(getContext(), "yfc_gs_zsdl", Constant.yfc_gs_zsdl);

            Constant.yfc_mls_zsdl = Constant.mls * Constant.yfc_mls_mj* Constant.yfc_mls_jshns* Constant.yfc_mls_bfb;
            //SpUtil.saveSP(getContext(), "yfc_mls_zsdl", Constant.yfc_mls_zsdl);

            Constant.yfc_qglsc_zsdl = Constant.qglsc * Constant.yfc_qglsc_mj* Constant.yfc_qglsc_jshns* Constant.yfc_qglsc_bfb;
            //SpUtil.saveSP(getContext(), "yfc_qglsc_zsdl", Constant.yfc_qglsc_zsdl);

            Constant.yfc_ggsc_zsdl = Constant.glsc * Constant.yfc_ggsc_mj* Constant.yfc_ggsc_jshns* Constant.yfc_ggsc_bfb;
            //SpUtil.saveSP(getContext(), "yfc_ggsc_zsdl", Constant.yfc_ggsc_zsdl);

            Constant.yfc_yclsc_zsdl = Constant.yclsc * Constant.yfc_yclsc_mj* Constant.yfc_yclsc_jshns* Constant.yfc_yclsc_bfb;
            //SpUtil.saveSP(getContext(), "yfc_yclsc_zsdl", Constant.yfc_yclsc_zsdl);

            Constant.yfc_gclsc_zsdl = Constant.gclsc * Constant.yfc_gclsc_mj* Constant.yfc_gclsc_jshns* Constant.yfc_gclsc_bfb;
            //SpUtil.saveSP(getContext(), "yfc_gclsc_zsdl", Constant.yfc_gclsc_zsdl);

            Constant.yfc_dlsc_zsdl = Constant.dlsc * Constant.yfc_dlsc_mj* Constant.yfc_dlsc_jshns* Constant.yfc_dlsc_bfb;
            //SpUtil.saveSP(getContext(), "yfc_dlsc_zsdl", Constant.yfc_dlsc_zsdl);

            Constant.yfc_cslsc_zsdl = Constant.cslsc * Constant.yfc_cslsc_mj* Constant.yfc_cslsc_jshns* Constant.yfc_cslgs_bfb;
            //SpUtil.saveSP(getContext(), "yfc_cslsc_zsdl", Constant.yfc_cslsc_zsdl);

            Constant.yfc_lygs_zsdl = Constant.lygs * Constant.yfc_lygs_mj* Constant.yfc_lygs_jshns* Constant.yfc_lygs_bfb;
            //SpUtil.saveSP(getContext(), "yfc_lygs_zsdl", Constant.yfc_lygs_zsdl);

            Constant.yfc_clgs_zsdl = Constant.clgs * Constant.yfc_clgs_mj* Constant.yfc_clgs_jshns* Constant.yfc_clgs_bfb;
            //SpUtil.saveSP(getContext(), "yfc_clgs_zsdl", Constant.yfc_clgs_zsdl);

            Constant.yfc_cy_zsdl = Constant.cy * Constant.yfc_cy_mj* Constant.yfc_cy_jshns* Constant.yfc_cy_bfb;
            //SpUtil.saveSP(getContext(), "yfc_cy_zsdl", Constant.yfc_cy_zsdl);

            Constant.yfc_mc_zsdl = Constant.mc * Constant.yfc_mc_mj* Constant.yfc_mc_jshns* Constant.yfc_mc_bfb;
            //SpUtil.saveSP(getContext(), "yfc_mc_zsdl", Constant.yfc_mc_zsdl);

            Constant.yfc_hj_zsdl = Constant.yfc_sd_zsdl + Constant.yfc_xm_zsdl + Constant.yfc_ym_zsdl + Constant.yfc_yc_zsdl +
                    Constant.yfc_gs_zsdl + Constant.yfc_mls_zsdl + Constant.yfc_qglsc_zsdl + Constant.yfc_ggsc_zsdl +
                    Constant.yfc_yclsc_zsdl + Constant.yfc_gclsc_zsdl + Constant.yfc_dlsc_zsdl + Constant.yfc_cslsc_zsdl +
                    Constant.yfc_lygs_zsdl + Constant.yfc_clgs_zsdl + Constant.yfc_cy_zsdl + Constant.yfc_mc_zsdl;

            Constant.yfc_hj_mj = Constant.yfc_sd_mj + Constant.yfc_xm_mj + Constant.yfc_ym_mj + Constant.yfc_yc_mj +
                    Constant.yfc_gs_mj + Constant.yfc_mls_mj + Constant.yfc_qglsc_mj + Constant.yfc_ggsc_mj +
                    Constant.yfc_yclsc_mj + Constant.yfc_gclsc_mj + Constant.yfc_dlsc_mj + Constant.yfc_cslsc_mj +
                    Constant.yfc_lygs_mj + Constant.yfc_clgs_mj + Constant.yfc_cy_mj + Constant.yfc_mc_mj;
            //SpUtil.saveSP(getContext(), "yfc_hj_zsdl", Constant.yfc_hj_zsdl);

            Constant.yfc_cz_zsdl = Constant.yfc_zcdl - Constant.yfc_hj_zsdl;
            //SpUtil.saveSP(getContext(), "yfc_cz_zsdl", Constant.yfc_cz_zsdl);
        } catch (Exception e) {
            LogUtil.e(e.getMessage());
        }

    }

    @Override
    public void refreshViews() {
        if (Constant.yfc_zcdl == 0){
            Toast.makeText(getContext(),"请先设置存栏商品猪数和猪场设计参数",Toast.LENGTH_SHORT).show();
            return;
        }
        mYfc_zcdl.setText(Constant.yfc_zcdl + "");

        //ddd
        

        Constant.yfc_gs_zsdl = Constant.gs * Constant.yfc_gs_mj;
        SpUtil.saveSP(getContext(), "yfc_gs_zsdl", Constant.yfc_gs_zsdl);
        

        Constant.yfc_qglsc_zsdl = Constant.qglsc * Constant.yfc_qglsc_mj;
        SpUtil.saveSP(getContext(), "yfc_qglsc_zsdl", Constant.yfc_qglsc_zsdl);

        mYfc_gs_zsdl.setText(Constant.yfc_gs_zsdl + "");

        mYfc_mls_zsdl.setText(Constant.yfc_mls_zsdl + "");

        mYfc_sd_zsdl.setText(Constant.yfc_sd_zsdl + "");

        mYfc_xm_zsdl.setText(Constant.yfc_xm_zsdl + "");

        mYfc_ym_zsdl.setText(Constant.yfc_ym_zsdl + "");

        mYfc_yc_zsdl.setText(Constant.yfc_yc_zsdl + "");
        mYfc_qglsc_zsdl.setText(Constant.yfc_qglsc_zsdl + "");

        mYfc_ggsc_zsdl.setText(Constant.yfc_ggsc_zsdl + "");

        mYfc_yclsc_zsdl.setText(Constant.yfc_yclsc_zsdl + "");

        mYfc_gclsc_zsdl.setText(Constant.yfc_gclsc_zsdl + "");

        mYfc_dlsc_zsdl.setText(Constant.yfc_dlsc_zsdl + "");

        mYfc_cslsc_zsdl.setText(Constant.yfc_cslsc_zsdl + "");

        mYfc_lygs_zsdl.setText(Constant.yfc_lygs_zsdl + "");

        mYfc_clgs_zsdl.setText(Constant.yfc_clgs_zsdl + "");

        mYfc_cy_zsdl.setText(Constant.yfc_cy_zsdl + "");

        mYfc_mc_zsdl.setText(Constant.yfc_mc_zsdl + "");

        mYfc_hj_zsdl.setText(Constant.yfc_hj_zsdl + "");

        mYfc_hj_mj.setText(Constant.yfc_hj_mj + "");

        mYfc_cz_zsdl.setText(Constant.yfc_cz_zsdl + "");


        mYfc_gs_mj.setText(Constant.yfc_gs_mj + "");

        mYfc_mls_mj.setText(Constant.yfc_mls_mj + "");

        mYfc_sd_mj.setText(Constant.yfc_sd_mj + "");

        mYfc_xm_mj.setText(Constant.yfc_xm_mj + "");

        mYfc_ym_mj.setText(Constant.yfc_ym_mj + "");

        mYfc_yc_mj.setText(Constant.yfc_yc_mj + "");
        mYfc_qglsc_mj.setText(Constant.yfc_qglsc_mj + "");

        mYfc_ggsc_mj.setText(Constant.yfc_ggsc_mj + "");

        mYfc_yclsc_mj.setText(Constant.yfc_yclsc_mj + "");

        mYfc_gclsc_mj.setText(Constant.yfc_gclsc_mj + "");

        mYfc_dlsc_mj.setText(Constant.yfc_dlsc_mj + "");

        mYfc_cslsc_mj.setText(Constant.yfc_cslsc_mj + "");

        mYfc_lygs_mj.setText(Constant.yfc_lygs_mj + "");

        mYfc_clgs_mj.setText(Constant.yfc_clgs_mj + "");

        mYfc_cy_mj.setText(Constant.yfc_cy_mj + "");

        mYfc_mc_mj.setText(Constant.yfc_mc_mj + "");

        mYfc_hj_mj.setText(Constant.yfc_hj_mj + "");

        mYfc_cz_mj.setText(Constant.yfc_cz_mj + "");
    }

    private double[] arr = new double[]{1,0.9,0.8,0.7,0.6,0.5,0.4,0.2,0.1,0};

    private boolean isFirst = true;
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        double temp = arr[position];
        if (isFirst){
            if (parent == yfc_mc_bfb){
                isFirst = false;
            }
            return;
        }
        if (parent == yfc_sd_bfb){
            Constant.yfc_sd_bfb = temp;
            //Toast.makeText(getContext(),Constant.yfc_sd_bfb+"-----1",Toast.LENGTH_SHORT).show();
            SpUtil.saveSP(getContext(),"yfc_sd_bfb",Constant.yfc_sd_bfb);
        }else if(parent == yfc_xm_bfb){
            Constant.yfc_xm_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_xm_bfb",Constant.yfc_xm_bfb);
        }else if(parent == yfc_ym_bfb){
            Constant.yfc_ym_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_ym_bfb",Constant.yfc_ym_bfb);
        }else if(parent == yfc_yc_bfb){
            Constant.yfc_yc_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_yc_bfb",Constant.yfc_yc_bfb);
        }else if(parent == yfc_gs_bfb){
            Constant.yfc_gs_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_gs_bfb",Constant.yfc_gs_bfb);
        }else if(parent == yfc_mls_bfb){
            Constant.yfc_mls_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_mls_bfb",Constant.yfc_mls_bfb);
        }else if(parent == yfc_jglsc_bfb){
            Constant.yfc_qglsc_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_qglsc_bfb",Constant.yfc_qglsc_bfb);
        }else if(parent == yfc_glsc_bfb){
            Constant.yfc_ggsc_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_ggsc_bfb",Constant.yfc_ggsc_bfb);
        }else if(parent == yfc_dlsc_bfb){
            Constant.yfc_dlsc_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_dlsc_bfb",Constant.yfc_dlsc_bfb);
        }else if(parent == yfc_cslsc_bfb){
            Constant.yfc_cslgs_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_cslgs_bfb",Constant.yfc_cslgs_bfb);
        }else if(parent == yfc_clgs_bfb){
            Constant.yfc_clgs_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_clgs_bfb",Constant.yfc_clgs_bfb);
        }else if(parent == yfc_cy_bfb){
            Constant.yfc_cy_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_cy_bfb",Constant.yfc_cy_bfb);
        }else if(parent == yfc_mc_bfb){
            Constant.yfc_mc_bfb = temp;
            SpUtil.saveSP(getContext(),"yfc_mc_bfb",Constant.yfc_mc_bfb);
        }
        

        jsDatas();
        refreshViews();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
