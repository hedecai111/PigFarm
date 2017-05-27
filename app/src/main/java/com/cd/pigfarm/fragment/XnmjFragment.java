package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
 * @Description: 消纳面积
 */
public class XnmjFragment extends BaseFragment implements AdapterView.OnItemSelectedListener{

    @NotEmpty
    private EditText mZfzycnph_zcdl;
    @NotEmpty
    private EditText mZfzycnph_sd_sdl;
    @NotEmpty
    private EditText mZfzycnph_sd_jshns;
    @NotEmpty
    private EditText mZfzycnph_sd_mj;
    @NotEmpty
    private EditText mZfzycnph_sd_zsdl;
    @NotEmpty
    private EditText mZfzycnph_xm_sdl;
    @NotEmpty
    private EditText mZfzycnph_xm_jshns;
    @NotEmpty
    private EditText mZfzycnph_xm_mj;
    @NotEmpty
    private EditText mZfzycnph_xm_zsdl;
    @NotEmpty
    private EditText mZfzycnph_ym_sdl;
    @NotEmpty
    private EditText mZfzycnph_ym_jshns;
    @NotEmpty
    private EditText mZfzycnph_ym_mj;
    @NotEmpty
    private EditText mZfzycnph_ym_zsdl;
    @NotEmpty
    private EditText mZfzycnph_yc_sdl;
    @NotEmpty
    private EditText mZfzycnph_yc_jshns;
    @NotEmpty
    private EditText mZfzycnph_yc_mj;
    @NotEmpty
    private EditText mZfzycnph_yc_zsdl;
    @NotEmpty
    private EditText mZfzycnph_gs_sdl;
    @NotEmpty
    private EditText mZfzycnph_gs_jshns;
    @NotEmpty
    private EditText mZfzycnph_gs_mj;
    @NotEmpty
    private EditText mZfzycnph_gs_zsdl;
    @NotEmpty
    private EditText mZfzycnph_mls_sdl;
    @NotEmpty
    private EditText mZfzycnph_mls_jshns;
    @NotEmpty
    private EditText mZfzycnph_mls_mj;
    @NotEmpty
    private EditText mZfzycnph_mls_zsdl;
    @NotEmpty
    private EditText mZfzycnph_qglsc_sdl;
    @NotEmpty
    private EditText mZfzycnph_qglsc_jshns;
    @NotEmpty
    private EditText mZfzycnph_qglsc_mj;
    @NotEmpty
    private EditText mZfzycnph_qglsc_zsdl;
    @NotEmpty
    private EditText mZfzycnph_ggsc_sdl;
    @NotEmpty
    private EditText mZfzycnph_ggsc_jshns;
    @NotEmpty
    private EditText mZfzycnph_ggsc_mj;
    @NotEmpty
    private EditText mZfzycnph_ggsc_zsdl;
    @NotEmpty
    private EditText mZfzycnph_yclsc_sdl;
    @NotEmpty
    private EditText mZfzycnph_yclsc_jshns;
    @NotEmpty
    private EditText mZfzycnph_yclsc_mj;
    @NotEmpty
    private EditText mZfzycnph_yclsc_zsdl;
    @NotEmpty
    private EditText mZfzycnph_gclsc_sdl;
    @NotEmpty
    private EditText mZfzycnph_gclsc_jshns;
    @NotEmpty
    private EditText mZfzycnph_gclsc_mj;
    @NotEmpty
    private EditText mZfzycnph_gclsc_zsdl;
    @NotEmpty
    private EditText mZfzycnph_dlsc_sdl;
    @NotEmpty
    private EditText mZfzycnph_dlsc_jshns;
    @NotEmpty
    private EditText mZfzycnph_dlsc_mj;
    @NotEmpty
    private EditText mZfzycnph_dlsc_zsdl;
    @NotEmpty
    private EditText mZfzycnph_cslsc_sdl;
    @NotEmpty
    private EditText mZfzycnph_cslsc_jshns;
    @NotEmpty
    private EditText mZfzycnph_cslsc_mj;
    @NotEmpty
    private EditText mZfzycnph_cslsc_zsdl;
    @NotEmpty
    private EditText mZfzycnph_lygs_sdl;
    @NotEmpty
    private EditText mZfzycnph_lygs_jshns;
    @NotEmpty
    private EditText mZfzycnph_lygs_mj;
    @NotEmpty
    private EditText mZfzycnph_lygs_zsdl;
    @NotEmpty
    private EditText mZfzycnph_clgs_sdl;
    @NotEmpty
    private EditText mZfzycnph_clgs_jshns;
    @NotEmpty
    private EditText mZfzycnph_clgs_mj;
    @NotEmpty
    private EditText mZfzycnph_clgs_zsdl;
    @NotEmpty
    private EditText mZfzycnph_cy_sdl;
    @NotEmpty
    private EditText mZfzycnph_cy_jshns;
    @NotEmpty
    private EditText mZfzycnph_cy_mj;
    @NotEmpty
    private EditText mZfzycnph_cy_zsdl;
    @NotEmpty
    private EditText mZfzycnph_mc_sdl;
    @NotEmpty
    private EditText mZfzycnph_mc_jshns;
    @NotEmpty
    private EditText mZfzycnph_mc_mj;
    @NotEmpty
    private EditText mZfzycnph_mc_zsdl;
    @NotEmpty
    private EditText mZfzycnph_hj_sdl;
    @NotEmpty
    private EditText mZfzycnph_hj_jshns;
    @NotEmpty
    private EditText mZfzycnph_hj_mj;
    @NotEmpty
    private EditText mZfzycnph_hj_zsdl;
    @NotEmpty
    private EditText mZfzycnph_cz_sdl;
    @NotEmpty
    private EditText mZfzycnph_cz_jshns;
    @NotEmpty
    private EditText mZfzycnph_cz_mj;
    @NotEmpty
    private EditText mZfzycnph_cz_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_zcdl;
    @NotEmpty
    private EditText mZzfzcdph_sd_sdl;
    @NotEmpty
    private EditText mZzfzcdph_sd_jshns;
    @NotEmpty
    private EditText mZzfzcdph_sd_mj;
    @NotEmpty
    private EditText mZzfzcdph_sd_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_xm_sdl;
    @NotEmpty
    private EditText mZzfzcdph_xm_jshns;
    @NotEmpty
    private EditText mZzfzcdph_xm_mj;
    @NotEmpty
    private EditText mZzfzcdph_xm_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_ym_sdl;
    @NotEmpty
    private EditText mZzfzcdph_ym_jshns;
    @NotEmpty
    private EditText mZzfzcdph_ym_mj;
    @NotEmpty
    private EditText mZzfzcdph_ym_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_yc_sdl;
    @NotEmpty
    private EditText mZzfzcdph_yc_jshns;
    @NotEmpty
    private EditText mZzfzcdph_yc_mj;
    @NotEmpty
    private EditText mZzfzcdph_yc_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_gs_sdl;
    @NotEmpty
    private EditText mZzfzcdph_gs_jshns;
    @NotEmpty
    private EditText mZzfzcdph_gs_mj;
    @NotEmpty
    private EditText mZzfzcdph_gs_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_mls_sdl;
    @NotEmpty
    private EditText mZzfzcdph_mls_jshns;
    @NotEmpty
    private EditText mZzfzcdph_mls_mj;
    @NotEmpty
    private EditText mZzfzcdph_mls_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_qglsc_sdl;
    @NotEmpty
    private EditText mZzfzcdph_qglsc_jshns;
    @NotEmpty
    private EditText mZzfzcdph_qglsc_mj;
    @NotEmpty
    private EditText mZzfzcdph_qglsc_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_ggsc_sdl;
    @NotEmpty
    private EditText mZzfzcdph_ggsc_jshns;
    @NotEmpty
    private EditText mZzfzcdph_ggsc_mj;
    @NotEmpty
    private EditText mZzfzcdph_ggsc_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_yclsc_sdl;
    @NotEmpty
    private EditText mZzfzcdph_yclsc_jshns;
    @NotEmpty
    private EditText mZzfzcdph_yclsc_mj;
    @NotEmpty
    private EditText mZzfzcdph_yclsc_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_gclsc_sdl;
    @NotEmpty
    private EditText mZzfzcdph_gclsc_jshns;
    @NotEmpty
    private EditText mZzfzcdph_gclsc_mj;
    @NotEmpty
    private EditText mZzfzcdph_gclsc_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_dlsc_sdl;
    @NotEmpty
    private EditText mZzfzcdph_dlsc_jshns;
    @NotEmpty
    private EditText mZzfzcdph_dlsc_mj;
    @NotEmpty
    private EditText mZzfzcdph_dlsc_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_cslsc_sdl;
    @NotEmpty
    private EditText mZzfzcdph_cslsc_jshns;
    @NotEmpty
    private EditText mZzfzcdph_cslsc_mj;
    @NotEmpty
    private EditText mZzfzcdph_cslsc_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_lygs_sdl;
    @NotEmpty
    private EditText mZzfzcdph_lygs_jshns;
    @NotEmpty
    private EditText mZzfzcdph_lygs_mj;
    @NotEmpty
    private EditText mZzfzcdph_lygs_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_clgs_sdl;
    @NotEmpty
    private EditText mZzfzcdph_clgs_jshns;
    @NotEmpty
    private EditText mZzfzcdph_clgs_mj;
    @NotEmpty
    private EditText mZzfzcdph_clgs_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_cy_sdl;
    @NotEmpty
    private EditText mZzfzcdph_cy_jshns;
    @NotEmpty
    private EditText mZzfzcdph_cy_mj;
    @NotEmpty
    private EditText mZzfzcdph_cy_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_mc_sdl;
    @NotEmpty
    private EditText mZzfzcdph_mc_jshns;
    @NotEmpty
    private EditText mZzfzcdph_mc_mj;
    @NotEmpty
    private EditText mZzfzcdph_mc_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_hj_sdl;
    @NotEmpty
    private EditText mZzfzcdph_hj_jshns;
    @NotEmpty
    private EditText mZzfzcdph_hj_mj;
    @NotEmpty
    private EditText mZzfzcdph_hj_zsdl;
    @NotEmpty
    private EditText mZzfzcdph_cz_sdl;
    @NotEmpty
    private EditText mZzfzcdph_cz_jshns;
    @NotEmpty
    private EditText mZzfzcdph_cz_mj;
    @NotEmpty
    private EditText mZzfzcdph_cz_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_zcdl;
    @NotEmpty
    private EditText mDnzzfzcdph_sd_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_sd_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_sd_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_sd_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_xm_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_xm_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_xm_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_xm_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_ym_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_ym_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_ym_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_ym_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_yc_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_yc_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_yc_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_yc_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_gs_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_gs_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_gs_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_gs_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_mls_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_mls_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_mls_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_mls_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_qglsc_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_qglsc_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_qglsc_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_qglsc_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_ggsc_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_ggsc_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_ggsc_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_ggsc_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_yclsc_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_yclsc_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_yclsc_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_yclsc_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_gclsc_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_gclsc_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_gclsc_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_gclsc_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_dlsc_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_dlsc_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_dlsc_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_dlsc_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_cslsc_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_cslsc_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_cslsc_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_cslsc_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_lygs_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_lygs_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_lygs_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_lygs_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_clgs_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_clgs_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_clgs_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_clgs_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_cy_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_cy_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_cy_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_cy_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_mc_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_mc_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_mc_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_mc_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_hj_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_hj_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_hj_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_hj_zsdl;
    @NotEmpty
    private EditText mDnzzfzcdph_cz_sdl;
    @NotEmpty
    private EditText mDnzzfzcdph_cz_jshns;
    @NotEmpty
    private EditText mDnzzfzcdph_cz_mj;
    @NotEmpty
    private EditText mDnzzfzcdph_cz_zsdl;
    


    private Spinner zfzyc_sd_bfb;
    private Spinner zfzyc_xm_bfb;
    private Spinner zfzyc_ym_bfb;
    private Spinner zfzyc_yc_bfb;
    private Spinner zfzyc_gs_bfb;
    private Spinner zfzyc_mls_bfb;
    private Spinner zfzyc_jglsc_bfb;
    private Spinner zfzyc_yclsc_bfb;
    private Spinner zfzyc_glsc_bfb;
    private Spinner zfzyc_dlsc_bfb;
    private Spinner zfzyc_cslsc_bfb;
    private Spinner zfzyc_lygs_bfb;
    private Spinner zfzyc_clgs_bfb;
    private Spinner zfzyc_cy_bfb;
    private Spinner zfzyc_mc_bfb;

    private Spinner byzzfzc_sd_bfb;
    private Spinner byzzfzc_xm_bfb;
    private Spinner byzzfzc_ym_bfb;
    private Spinner byzzfzc_yc_bfb;
    private Spinner byzzfzc_gs_bfb;
    private Spinner byzzfzc_mls_bfb;
    private Spinner byzzfzc_jglsc_bfb;
    private Spinner byzzfzc_yclsc_bfb;
    private Spinner byzzfzc_glsc_bfb;
    private Spinner byzzfzc_dlsc_bfb;
    private Spinner byzzfzc_cslsc_bfb;
    private Spinner byzzfzc_lygs_bfb;
    private Spinner byzzfzc_clgs_bfb;
    private Spinner byzzfzc_cy_bfb;
    private Spinner byzzfzc_mc_bfb;

    private Spinner dnzzfzc_sd_bfb;
    private Spinner dnzzfzc_xm_bfb;
    private Spinner dnzzfzc_ym_bfb;
    private Spinner dnzzfzc_yc_bfb;
    private Spinner dnzzfzc_gs_bfb;
    private Spinner dnzzfzc_mls_bfb;
    private Spinner dnzzfzc_jglsc_bfb;
    private Spinner dnzzfzc_yclsc_bfb;
    private Spinner dnzzfzc_glsc_bfb;
    private Spinner dnzzfzc_dlsc_bfb;
    private Spinner dnzzfzc_cslsc_bfb;
    private Spinner dnzzfzc_lygs_bfb;
    private Spinner dnzzfzc_clgs_bfb;
    private Spinner dnzzfzc_cy_bfb;
    private Spinner dnzzfzc_mc_bfb;


    
    
    

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_xnmj, null);
        bindViews();
        bindButton();
        return view;
    }



    private LinearLayout zfzyc_Lin,byzzfzc_Lin,dnzzfzc_Lin;




    private void addViewByType(LinearLayout lin,NzwEntity nzwEntity){

        TextView textView = (TextView) View.inflate(getContext(),R.layout.lin_textview,null);
        lin.addView(textView,new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,1));
        LinearLayout linearLayout = (LinearLayout) View.inflate(getContext(),R.layout.xnmj_item,null);
        TextView textView1 = (TextView) linearLayout.findViewById(R.id.name);
        textView1.setText(nzwEntity.getName());
        lin.addView(linearLayout,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, Utils.dip2px(getContext(),50f)));
    }

    private void bindViews() {

        zfzyc_Lin = (LinearLayout) view.findViewById(R.id.zfzyc_Lin);
        byzzfzc_Lin = (LinearLayout) view.findViewById(R.id.byzzfzc_Lin);
        dnzzfzc_Lin = (LinearLayout) view.findViewById(R.id.dnzzfzc_Lin);


        List<NzwEntity> nzwEntities = App.sqlOpenHelper.queryAllNzw();
        Toast.makeText(getContext(),nzwEntities.size()+"",Toast.LENGTH_SHORT).show();
        if (nzwEntities != null && nzwEntities.size() > 0){
            Toast.makeText(getContext(),nzwEntities.size()+"",Toast.LENGTH_SHORT).show();
            for (NzwEntity nzwEntity : nzwEntities){
                addViewByType(zfzyc_Lin,nzwEntity);
                addViewByType(byzzfzc_Lin,nzwEntity);
                addViewByType(dnzzfzc_Lin,nzwEntity);
            }
        }

        zfzyc_sd_bfb = (Spinner) view.findViewById(R.id.zfzyc_sd_bfb);
        zfzyc_sd_bfb.setOnItemSelectedListener(this);

        if (Constant.zfzyc_sd_bfb != 1){
            zfzyc_sd_bfb.setSelection((int)(10 - Constant.zfzyc_sd_bfb*10));
            //Toast.makeText(getContext(),(int)(10 - Constant.zfzyc_sd_bfb*10)+"",Toast.LENGTH_SHORT).show();
        }
        zfzyc_xm_bfb = (Spinner) view.findViewById(R.id.zfzyc_xm_bfb);
        zfzyc_xm_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_xm_bfb != 1){
            zfzyc_xm_bfb.setSelection((int)(10 - Constant.zfzyc_xm_bfb*10));
        }
        zfzyc_ym_bfb = (Spinner) view.findViewById(R.id.zfzyc_ym_bfb);
        zfzyc_ym_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_ym_bfb != 1){
            zfzyc_ym_bfb.setSelection((int)(10 - Constant.zfzyc_ym_bfb*10));
        }
        zfzyc_yc_bfb = (Spinner) view.findViewById(R.id.zfzyc_yc_bfb);
        zfzyc_yc_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_yc_bfb != 1){
            zfzyc_yc_bfb.setSelection((int)(10 - Constant.zfzyc_yc_bfb*10));
        }
        zfzyc_gs_bfb = (Spinner) view.findViewById(R.id.zfzyc_gs_bfb);
        zfzyc_gs_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_gs_bfb != 1){
            zfzyc_gs_bfb.setSelection((int)(10 - Constant.zfzyc_gs_bfb*10));
        }
        zfzyc_mls_bfb = (Spinner) view.findViewById(R.id.zfzyc_mls_bfb);
        zfzyc_mls_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_mls_bfb != 1){
            zfzyc_mls_bfb.setSelection((int)(10 - Constant.zfzyc_mls_bfb*10));
        }
        zfzyc_jglsc_bfb = (Spinner) view.findViewById(R.id.zfzyc_qglsc_bfb);
        zfzyc_jglsc_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_qglsc_bfb != 1){
            zfzyc_jglsc_bfb.setSelection((int)(10 - Constant.zfzyc_qglsc_bfb*10));
        }
        zfzyc_yclsc_bfb = (Spinner) view.findViewById(R.id.zfzyc_yclsc_bfb);
        zfzyc_yclsc_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_yclsc_bfb != 1){
            zfzyc_yclsc_bfb.setSelection((int)(10 - Constant.zfzyc_yclsc_bfb*10));
        }
        zfzyc_glsc_bfb = (Spinner) view.findViewById(R.id.zfzyc_glsc_bfb);
        zfzyc_glsc_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_ggsc_bfb != 1){
            zfzyc_glsc_bfb.setSelection((int)(10 - Constant.zfzyc_ggsc_bfb*10));
        }
        zfzyc_dlsc_bfb = (Spinner) view.findViewById(R.id.zfzyc_dlsc_bfb);
        zfzyc_dlsc_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_dlsc_bfb != 1){
            zfzyc_dlsc_bfb.setSelection((int)(10 - Constant.zfzyc_dlsc_bfb*10));
        }
        zfzyc_cslsc_bfb = (Spinner) view.findViewById(R.id.zfzyc_cslsc_bfb);
        zfzyc_cslsc_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_cslgs_bfb != 1){
            zfzyc_cslsc_bfb.setSelection((int)(10 - Constant.zfzyc_cslgs_bfb*10));
        }
        zfzyc_lygs_bfb = (Spinner) view.findViewById(R.id.zfzyc_lygs_bfb);
        zfzyc_lygs_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_lygs_bfb != 1){
            zfzyc_lygs_bfb.setSelection((int)(10 - Constant.zfzyc_lygs_bfb*10));
        }
        zfzyc_clgs_bfb = (Spinner) view.findViewById(R.id.zfzyc_clgs_bfb);
        zfzyc_clgs_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_clgs_bfb != 1){
            zfzyc_clgs_bfb.setSelection((int)(10 - Constant.zfzyc_clgs_bfb*10));
        }
        zfzyc_cy_bfb = (Spinner) view.findViewById(R.id.zfzyc_cy_bfb);
        zfzyc_cy_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_cy_bfb != 1){
            zfzyc_cy_bfb.setSelection((int)(10 - Constant.zfzyc_cy_bfb*10));
        }
        zfzyc_mc_bfb = (Spinner) view.findViewById(R.id.zfzyc_mc_bfb);
        zfzyc_mc_bfb.setOnItemSelectedListener(this);
        if (Constant.zfzyc_mc_bfb != 1){
            zfzyc_mc_bfb.setSelection((int)(10 - Constant.zfzyc_mc_bfb*10));
        }



        byzzfzc_sd_bfb = (Spinner) view.findViewById(R.id.byzzfzc_sd_bfb);
        byzzfzc_sd_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_sd_bfb != 1){
            byzzfzc_sd_bfb.setSelection((int)(10 - Constant.byzzfzc_sd_bfb*10));
        }
        byzzfzc_xm_bfb = (Spinner) view.findViewById(R.id.byzzfzc_xm_bfb);
        byzzfzc_xm_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_xm_bfb != 1){
            byzzfzc_xm_bfb.setSelection((int)(10 - Constant.byzzfzc_xm_bfb*10));
        }
        byzzfzc_ym_bfb = (Spinner) view.findViewById(R.id.byzzfzc_ym_bfb);
        byzzfzc_ym_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_ym_bfb != 1){
            byzzfzc_ym_bfb.setSelection((int)(10 - Constant.byzzfzc_ym_bfb*10));
        }
        byzzfzc_yc_bfb = (Spinner) view.findViewById(R.id.byzzfzc_yc_bfb);
        byzzfzc_sd_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_sd_bfb != 1){
            byzzfzc_sd_bfb.setSelection((int)(10 - Constant.byzzfzc_sd_bfb*10));
        }
        byzzfzc_gs_bfb = (Spinner) view.findViewById(R.id.byzzfzc_gs_bfb);
        byzzfzc_gs_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_gs_bfb != 1){
            byzzfzc_gs_bfb.setSelection((int)(10 - Constant.byzzfzc_gs_bfb*10));
        }
        byzzfzc_mls_bfb = (Spinner) view.findViewById(R.id.byzzfzc_mls_bfb);
        byzzfzc_mls_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_mls_bfb != 1){
            byzzfzc_mls_bfb.setSelection((int)(10 - Constant.byzzfzc_mls_bfb*10));
        }
        byzzfzc_jglsc_bfb = (Spinner) view.findViewById(R.id.byzzfzc_jglsc_bfb);
        byzzfzc_jglsc_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_qglsc_bfb != 1){
            byzzfzc_jglsc_bfb.setSelection((int)(10 - Constant.byzzfzc_qglsc_bfb*10));
        }
        byzzfzc_yclsc_bfb = (Spinner) view.findViewById(R.id.byzzfzc_yclsc_bfb);
        byzzfzc_yclsc_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_yclsc_bfb != 1){
            byzzfzc_yclsc_bfb.setSelection((int)(10 - Constant.byzzfzc_yclsc_bfb*10));
        }
        byzzfzc_glsc_bfb = (Spinner) view.findViewById(R.id.byzzfzc_glsc_bfb);
        byzzfzc_glsc_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_ggsc_bfb != 1){
            byzzfzc_glsc_bfb.setSelection((int)(10 - Constant.byzzfzc_ggsc_bfb*10));
        }
        byzzfzc_dlsc_bfb = (Spinner) view.findViewById(R.id.byzzfzc_dlsc_bfb);
        byzzfzc_dlsc_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_dlsc_bfb != 1){
            byzzfzc_dlsc_bfb.setSelection((int)(10 - Constant.byzzfzc_dlsc_bfb*10));
        }
        byzzfzc_cslsc_bfb = (Spinner) view.findViewById(R.id.byzzfzc_cslsc_bfb);
        byzzfzc_cslsc_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_cslgs_bfb != 1){
            byzzfzc_cslsc_bfb.setSelection((int)(10 - Constant.byzzfzc_cslgs_bfb*10));
        }
        byzzfzc_lygs_bfb = (Spinner) view.findViewById(R.id.byzzfzc_lygs_bfb);
        byzzfzc_lygs_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_lygs_bfb != 1){
            byzzfzc_lygs_bfb.setSelection((int)(10 - Constant.byzzfzc_lygs_bfb*10));
        }
        byzzfzc_clgs_bfb = (Spinner) view.findViewById(R.id.byzzfzc_clgs_bfb);
        byzzfzc_clgs_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_clgs_bfb != 1){
            byzzfzc_clgs_bfb.setSelection((int)(10 - Constant.byzzfzc_clgs_bfb*10));
        }
        byzzfzc_cy_bfb = (Spinner) view.findViewById(R.id.byzzfzc_cy_bfb);
        byzzfzc_cy_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_cy_bfb != 1){
            byzzfzc_cy_bfb.setSelection((int)(10 - Constant.byzzfzc_cy_bfb*10));
        }
        byzzfzc_mc_bfb = (Spinner) view.findViewById(R.id.byzzfzc_mc_bfb);
        byzzfzc_mc_bfb.setOnItemSelectedListener(this);
        if (Constant.byzzfzc_mc_bfb != 1){
            byzzfzc_mc_bfb.setSelection((int)(10 - Constant.byzzfzc_mc_bfb*10));
        }



        dnzzfzc_sd_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_sd_bfb);
        dnzzfzc_sd_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_sd_bfb != 1){
            dnzzfzc_sd_bfb.setSelection((int)(10 - Constant.dnzzfzc_sd_bfb*10));
        }
        dnzzfzc_xm_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_xm_bfb);
        dnzzfzc_xm_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_xm_bfb != 1){
            dnzzfzc_xm_bfb.setSelection((int)(10 - Constant.dnzzfzc_xm_bfb*10));
        }
        dnzzfzc_ym_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_ym_bfb);
        dnzzfzc_ym_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_ym_bfb != 1){
            dnzzfzc_ym_bfb.setSelection((int)(10 - Constant.dnzzfzc_ym_bfb*10));
        }
        dnzzfzc_yc_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_yc_bfb);
        dnzzfzc_sd_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_yc_bfb != 1){
            zfzyc_sd_bfb.setSelection((int)(10 - Constant.dnzzfzc_yc_bfb*10));
        }
        dnzzfzc_gs_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_gs_bfb);
        dnzzfzc_gs_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_gs_bfb != 1){
            dnzzfzc_gs_bfb.setSelection((int)(10 - Constant.dnzzfzc_gs_bfb*10));
        }
        dnzzfzc_mls_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_mls_bfb);
        dnzzfzc_mls_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_mls_bfb != 1){
            dnzzfzc_mls_bfb.setSelection((int)(10 - Constant.dnzzfzc_mls_bfb*10));
        }
        dnzzfzc_jglsc_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_jglsc_bfb);
        dnzzfzc_jglsc_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_qglsc_bfb != 1){
            dnzzfzc_jglsc_bfb.setSelection((int)(10 - Constant.dnzzfzc_qglsc_bfb*10));
        }
        dnzzfzc_yclsc_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_yclsc_bfb);
        dnzzfzc_yclsc_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_yclsc_bfb != 1){
            dnzzfzc_yclsc_bfb.setSelection((int)(10 - Constant.dnzzfzc_yclsc_bfb*10));
        }
        dnzzfzc_glsc_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_glsc_bfb);
        dnzzfzc_glsc_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_ggsc_bfb != 1){
            dnzzfzc_glsc_bfb.setSelection((int)(10 - Constant.dnzzfzc_ggsc_bfb*10));
        }
        dnzzfzc_dlsc_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_dlsc_bfb);
        dnzzfzc_dlsc_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_dlsc_bfb != 1){
            dnzzfzc_dlsc_bfb.setSelection((int)(10 - Constant.dnzzfzc_dlsc_bfb*10));
        }
        dnzzfzc_cslsc_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_cslsc_bfb);
        dnzzfzc_cslsc_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_cslgs_bfb != 1){
            dnzzfzc_cslsc_bfb.setSelection((int)(10 - Constant.dnzzfzc_cslgs_bfb*10));
        }
        dnzzfzc_lygs_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_lygs_bfb);
        dnzzfzc_lygs_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_lygs_bfb != 1){
            dnzzfzc_lygs_bfb.setSelection((int)(10 - Constant.dnzzfzc_lygs_bfb*10));
        }
        dnzzfzc_clgs_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_clgs_bfb);
        dnzzfzc_clgs_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_clgs_bfb != 1){
            dnzzfzc_clgs_bfb.setSelection((int)(10 - Constant.dnzzfzc_clgs_bfb*10));
        }
        dnzzfzc_cy_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_cy_bfb);
        dnzzfzc_cy_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_cy_bfb != 1){
            dnzzfzc_cy_bfb.setSelection((int)(10 - Constant.dnzzfzc_cy_bfb*10));
        }
        dnzzfzc_mc_bfb = (Spinner) view.findViewById(R.id.dnzzfzc_mc_bfb);
        dnzzfzc_mc_bfb.setOnItemSelectedListener(this);
        if (Constant.dnzzfzc_mc_bfb != 1){
            dnzzfzc_mc_bfb.setSelection((int)(10 - Constant.dnzzfzc_mc_bfb*10));
        }


        mZzfzcdph_mls_sdl = (EditText) view.findViewById(R.id.zzfzcdph_mls_sdl);
        mZzfzcdph_mls_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_mls_sdl != 0)
            mZfzycnph_zcdl.setText(Constant.zzfzcdph_mls_sdl + "");

        mZfzycnph_zcdl = (EditText) view.findViewById(R.id.zfzycnph_zcdl);
        mZfzycnph_zcdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_zcdl != 0)
            mZfzycnph_zcdl.setText(Constant.zfzycnph_zcdl + "");

        mZfzycnph_sd_sdl = (EditText) view.findViewById(R.id.zfzycnph_sd_sdl);
        mZfzycnph_sd_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.sd != 0)
            mZfzycnph_sd_sdl.setText(Constant.sd + "");

        mZfzycnph_sd_jshns = (EditText) view.findViewById(R.id.zfzycnph_sd_jshns);
        mZfzycnph_sd_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_sd_jshns != 0)
            mZfzycnph_sd_jshns.setText(Constant.zfzycnph_sd_jshns + "");

        mZfzycnph_sd_mj = (EditText) view.findViewById(R.id.zfzycnph_sd_mj);
        mZfzycnph_sd_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_sd_mj != 0)
            mZfzycnph_sd_mj.setText(Constant.zfzycnph_sd_mj + "");

        mZfzycnph_sd_zsdl = (EditText) view.findViewById(R.id.zfzycnph_sd_zsdl);
        mZfzycnph_sd_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_sd_zsdl != 0)
            mZfzycnph_sd_zsdl.setText(Constant.zfzycnph_sd_zsdl + "");

        mZfzycnph_xm_sdl = (EditText) view.findViewById(R.id.zfzycnph_xm_sdl);
        mZfzycnph_xm_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.xm != 0)
            mZfzycnph_xm_sdl.setText(Constant.xm + "");

        mZfzycnph_xm_jshns = (EditText) view.findViewById(R.id.zfzycnph_xm_jshns);
        mZfzycnph_xm_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_xm_jshns != 0)
            mZfzycnph_xm_jshns.setText(Constant.zfzycnph_xm_jshns + "");

        mZfzycnph_xm_mj = (EditText) view.findViewById(R.id.zfzycnph_xm_mj);
        mZfzycnph_xm_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_xm_mj != 0)
            mZfzycnph_xm_mj.setText(Constant.zfzycnph_xm_mj + "");

        mZfzycnph_xm_zsdl = (EditText) view.findViewById(R.id.zfzycnph_xm_zsdl);
        mZfzycnph_xm_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_xm_zsdl != 0)
            mZfzycnph_xm_zsdl.setText(Constant.zfzycnph_xm_zsdl + "");

        mZfzycnph_ym_sdl = (EditText) view.findViewById(R.id.zfzycnph_ym_sdl);
        mZfzycnph_ym_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.ym != 0)
            mZfzycnph_ym_sdl.setText(Constant.ym + "");

        mZfzycnph_ym_jshns = (EditText) view.findViewById(R.id.zfzycnph_ym_jshns);
        mZfzycnph_ym_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_ym_jshns != 0)
            mZfzycnph_ym_jshns.setText(Constant.zfzycnph_ym_jshns + "");

        mZfzycnph_ym_mj = (EditText) view.findViewById(R.id.zfzycnph_ym_mj);
        mZfzycnph_ym_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_ym_mj != 0)
            mZfzycnph_ym_mj.setText(Constant.zfzycnph_ym_mj + "");
        mZfzycnph_ym_zsdl = (EditText) view.findViewById(R.id.zfzycnph_ym_zsdl);
        mZfzycnph_ym_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_ym_zsdl != 0)
            mZfzycnph_ym_zsdl.setText(Constant.zfzycnph_ym_zsdl + "");

        mZfzycnph_yc_sdl = (EditText) view.findViewById(R.id.zfzycnph_yc_sdl);
        mZfzycnph_yc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yc != 0)
            mZfzycnph_yc_sdl.setText(Constant.yc + "");

        mZfzycnph_yc_jshns = (EditText) view.findViewById(R.id.zfzycnph_yc_jshns);
        mZfzycnph_yc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_yc_jshns != 0)
            mZfzycnph_yc_jshns.setText(Constant.zfzycnph_yc_jshns + "");

        mZfzycnph_yc_mj = (EditText) view.findViewById(R.id.zfzycnph_yc_mj);
        mZfzycnph_yc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_yc_mj != 0)
            mZfzycnph_yc_mj.setText(Constant.zfzycnph_yc_mj + "");

        mZfzycnph_yc_zsdl = (EditText) view.findViewById(R.id.zfzycnph_yc_zsdl);
        mZfzycnph_yc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_yc_zsdl != 0)
            mZfzycnph_yc_zsdl.setText(Constant.zfzycnph_yc_zsdl + "");

        mZfzycnph_gs_sdl = (EditText) view.findViewById(R.id.zfzycnph_gs_sdl);
        mZfzycnph_gs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.gs != 0)
            mZfzycnph_gs_sdl.setText(Constant.gs + "");

        mZfzycnph_gs_jshns = (EditText) view.findViewById(R.id.zfzycnph_gs_jshns);
        mZfzycnph_gs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_gs_jshns != 0)
            mZfzycnph_gs_jshns.setText(Constant.zfzycnph_gs_jshns + "");

        mZfzycnph_gs_mj = (EditText) view.findViewById(R.id.zfzycnph_gs_mj);
        mZfzycnph_gs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_gs_mj != 0)
            mZfzycnph_gs_mj.setText(Constant.zfzycnph_gs_mj + "");

        mZfzycnph_gs_zsdl = (EditText) view.findViewById(R.id.zfzycnph_gs_zsdl);
        mZfzycnph_gs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_gs_zsdl != 0)
            mZfzycnph_gs_zsdl.setText(Constant.zfzycnph_gs_zsdl + "");

        mZfzycnph_mls_sdl = (EditText) view.findViewById(R.id.zfzycnph_mls_sdl);
        mZfzycnph_mls_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.mls != 0)
            mZfzycnph_mls_sdl.setText(Constant.mls + "");
        mZfzycnph_mls_jshns = (EditText) view.findViewById(R.id.zfzycnph_mls_jshns);
        mZfzycnph_mls_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_mls_jshns != 0)
            mZfzycnph_mls_jshns.setText(Constant.zfzycnph_mls_jshns + "");

        mZfzycnph_mls_mj = (EditText) view.findViewById(R.id.zfzycnph_mls_mj);
        mZfzycnph_mls_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_mls_mj != 0)
            mZfzycnph_mls_mj.setText(Constant.zfzycnph_mls_mj + "");

        mZfzycnph_mls_zsdl = (EditText) view.findViewById(R.id.zfzycnph_mls_zsdl);
        mZfzycnph_mls_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_mls_zsdl != 0)
            mZfzycnph_mls_zsdl.setText(Constant.zfzycnph_mls_zsdl + "");

        mZfzycnph_qglsc_sdl = (EditText) view.findViewById(R.id.zfzycnph_qglsc_sdl);
        mZfzycnph_qglsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.qglsc != 0)
            mZfzycnph_qglsc_sdl.setText(Constant.qglsc + "");

        mZfzycnph_qglsc_jshns = (EditText) view.findViewById(R.id.zfzycnph_qglsc_jshns);
        mZfzycnph_qglsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_qglsc_jshns != 0)
            mZfzycnph_qglsc_jshns.setText(Constant.zfzycnph_qglsc_jshns + "");

        mZfzycnph_qglsc_mj = (EditText) view.findViewById(R.id.zfzycnph_qglsc_mj);
        mZfzycnph_qglsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_qglsc_mj != 0)
            mZfzycnph_qglsc_mj.setText(Constant.zfzycnph_qglsc_mj + "");

        mZfzycnph_qglsc_zsdl = (EditText) view.findViewById(R.id.zfzycnph_qglsc_zsdl);
        mZfzycnph_qglsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_qglsc_zsdl != 0)
            mZfzycnph_zcdl.setText(Constant.zfzycnph_qglsc_zsdl + "");

        mZfzycnph_ggsc_sdl = (EditText) view.findViewById(R.id.zfzycnph_ggsc_sdl);
        mZfzycnph_ggsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.glsc != 0)
            mZfzycnph_ggsc_sdl.setText(Constant.glsc + "");

        mZfzycnph_ggsc_jshns = (EditText) view.findViewById(R.id.zfzycnph_ggsc_jshns);
        mZfzycnph_ggsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_ggsc_jshns != 0)
            mZfzycnph_ggsc_jshns.setText(Constant.zfzycnph_ggsc_jshns + "");

        mZfzycnph_ggsc_mj = (EditText) view.findViewById(R.id.zfzycnph_ggsc_mj);
        mZfzycnph_ggsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_ggsc_mj != 0)
            mZfzycnph_ggsc_mj.setText(Constant.zfzycnph_ggsc_mj + "");

        mZfzycnph_ggsc_zsdl = (EditText) view.findViewById(R.id.zfzycnph_ggsc_zsdl);
        mZfzycnph_ggsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_ggsc_zsdl != 0)
            mZfzycnph_ggsc_zsdl.setText(Constant.zfzycnph_ggsc_zsdl + "");

        mZfzycnph_yclsc_sdl = (EditText) view.findViewById(R.id.zfzycnph_yclsc_sdl);
        mZfzycnph_yclsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yclsc != 0)
            mZfzycnph_yclsc_sdl.setText(Constant.yclsc + "");

        mZfzycnph_yclsc_jshns = (EditText) view.findViewById(R.id.zfzycnph_yclsc_jshns);
        mZfzycnph_yclsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_yclsc_jshns != 0)
            mZfzycnph_yclsc_jshns.setText(Constant.zfzycnph_yclsc_jshns + "");

        mZfzycnph_yclsc_mj = (EditText) view.findViewById(R.id.zfzycnph_yclsc_mj);
        mZfzycnph_yclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_yclsc_mj != 0)
            mZfzycnph_yclsc_mj.setText(Constant.zfzycnph_yclsc_mj + "");

        mZfzycnph_yclsc_zsdl = (EditText) view.findViewById(R.id.zfzycnph_yclsc_zsdl);
        mZfzycnph_yclsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_yclsc_zsdl != 0)
            mZfzycnph_yclsc_zsdl.setText(Constant.zfzycnph_yclsc_zsdl + "");

        mZfzycnph_gclsc_sdl = (EditText) view.findViewById(R.id.zfzycnph_gclsc_sdl);
        mZfzycnph_gclsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.gclsc != 0)
            mZfzycnph_gclsc_sdl.setText(Constant.gclsc + "");

        mZfzycnph_gclsc_jshns = (EditText) view.findViewById(R.id.zfzycnph_gclsc_jshns);
        mZfzycnph_gclsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_gclsc_jshns != 0)
            mZfzycnph_gclsc_jshns.setText(Constant.zfzycnph_gclsc_jshns + "");

        mZfzycnph_gclsc_mj = (EditText) view.findViewById(R.id.zfzycnph_gclsc_mj);
        mZfzycnph_gclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_gclsc_mj != 0)
            mZfzycnph_gclsc_mj.setText(Constant.zfzycnph_gclsc_mj + "");

        mZfzycnph_gclsc_zsdl = (EditText) view.findViewById(R.id.zfzycnph_gclsc_zsdl);
        mZfzycnph_gclsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_gclsc_zsdl != 0)
            mZfzycnph_gclsc_zsdl.setText(Constant.zfzycnph_gclsc_zsdl + "");

        mZfzycnph_dlsc_sdl = (EditText) view.findViewById(R.id.zfzycnph_dlsc_sdl);
        mZfzycnph_dlsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.dlsc != 0)
            mZfzycnph_dlsc_sdl.setText(Constant.dlsc + "");

        mZfzycnph_dlsc_jshns = (EditText) view.findViewById(R.id.zfzycnph_dlsc_jshns);
        mZfzycnph_dlsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_dlsc_jshns != 0)
            mZfzycnph_dlsc_jshns.setText(Constant.zfzycnph_dlsc_jshns + "");

        mZfzycnph_dlsc_mj = (EditText) view.findViewById(R.id.zfzycnph_dlsc_mj);
        mZfzycnph_dlsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_dlsc_mj != 0)
            mZfzycnph_dlsc_mj.setText(Constant.zfzycnph_dlsc_mj + "");

        mZfzycnph_dlsc_zsdl = (EditText) view.findViewById(R.id.zfzycnph_dlsc_zsdl);
        mZfzycnph_dlsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_dlsc_zsdl != 0)
            mZfzycnph_dlsc_zsdl.setText(Constant.zfzycnph_dlsc_zsdl + "");

        mZfzycnph_cslsc_sdl = (EditText) view.findViewById(R.id.zfzycnph_cslsc_sdl);
        mZfzycnph_cslsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.cslsc != 0)
            mZfzycnph_cslsc_sdl.setText(Constant.cslsc + "");

        mZfzycnph_cslsc_jshns = (EditText) view.findViewById(R.id.zfzycnph_cslsc_jshns);
        mZfzycnph_cslsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cslsc_jshns != 0)
            mZfzycnph_cslsc_jshns.setText(Constant.zfzycnph_cslsc_jshns + "");

        mZfzycnph_cslsc_mj = (EditText) view.findViewById(R.id.zfzycnph_cslsc_mj);
        mZfzycnph_cslsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cslsc_mj != 0)
            mZfzycnph_cslsc_mj.setText(Constant.zfzycnph_cslsc_mj + "");

        mZfzycnph_cslsc_zsdl = (EditText) view.findViewById(R.id.zfzycnph_cslsc_zsdl);
        mZfzycnph_cslsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cslsc_zsdl != 0)
            mZfzycnph_cslsc_zsdl.setText(Constant.zfzycnph_cslsc_zsdl + "");

        mZfzycnph_lygs_sdl = (EditText) view.findViewById(R.id.zfzycnph_lygs_sdl);
        mZfzycnph_lygs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.lygs != 0)
            mZfzycnph_lygs_sdl.setText(Constant.lygs + "");

        mZfzycnph_lygs_jshns = (EditText) view.findViewById(R.id.zfzycnph_lygs_jshns);
        mZfzycnph_lygs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_lygs_jshns != 0)
            mZfzycnph_lygs_jshns.setText(Constant.zfzycnph_lygs_jshns + "");

        mZfzycnph_lygs_mj = (EditText) view.findViewById(R.id.zfzycnph_lygs_mj);
        mZfzycnph_lygs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_lygs_mj != 0)
            mZfzycnph_lygs_mj.setText(Constant.zfzycnph_lygs_mj + "");

        mZfzycnph_lygs_zsdl = (EditText) view.findViewById(R.id.zfzycnph_lygs_zsdl);
        mZfzycnph_lygs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_lygs_zsdl != 0)
            mZfzycnph_lygs_zsdl.setText(Constant.zfzycnph_lygs_zsdl + "");

        mZfzycnph_clgs_sdl = (EditText) view.findViewById(R.id.zfzycnph_clgs_sdl);
        mZfzycnph_clgs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.clgs != 0)
            mZfzycnph_clgs_sdl.setText(Constant.clgs + "");

        mZfzycnph_clgs_jshns = (EditText) view.findViewById(R.id.zfzycnph_clgs_jshns);
        mZfzycnph_clgs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_clgs_jshns != 0)
            mZfzycnph_clgs_jshns.setText(Constant.zfzycnph_clgs_jshns + "");

        mZfzycnph_clgs_mj = (EditText) view.findViewById(R.id.zfzycnph_clgs_mj);
        mZfzycnph_clgs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_clgs_mj != 0)
            mZfzycnph_clgs_mj.setText(Constant.zfzycnph_clgs_mj + "");

        mZfzycnph_clgs_zsdl = (EditText) view.findViewById(R.id.zfzycnph_clgs_zsdl);
        mZfzycnph_clgs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_clgs_zsdl != 0)
            mZfzycnph_clgs_zsdl.setText(Constant.zfzycnph_clgs_zsdl + "");

        mZfzycnph_cy_sdl = (EditText) view.findViewById(R.id.zfzycnph_cy_sdl);
        mZfzycnph_cy_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.cy != 0)
            mZfzycnph_cy_sdl.setText(Constant.cy + "");

        mZfzycnph_cy_jshns = (EditText) view.findViewById(R.id.zfzycnph_cy_jshns);
        mZfzycnph_cy_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cy_jshns != 0)
            mZfzycnph_cy_jshns.setText(Constant.zfzycnph_cy_jshns + "");

        mZfzycnph_cy_mj = (EditText) view.findViewById(R.id.zfzycnph_cy_mj);
        mZfzycnph_cy_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cy_mj != 0)
            mZfzycnph_cy_mj.setText(Constant.zfzycnph_cy_mj + "");

        mZfzycnph_cy_zsdl = (EditText) view.findViewById(R.id.zfzycnph_cy_zsdl);
        mZfzycnph_cy_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cy_zsdl != 0)
            mZfzycnph_cy_zsdl.setText(Constant.zfzycnph_cy_zsdl + "");

        mZfzycnph_mc_sdl = (EditText) view.findViewById(R.id.zfzycnph_mc_sdl);
        mZfzycnph_mc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.mc != 0)
            mZfzycnph_mc_sdl.setText(Constant.mc + "");

        mZfzycnph_mc_jshns = (EditText) view.findViewById(R.id.zfzycnph_mc_jshns);
        mZfzycnph_mc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_mc_jshns != 0)
            mZfzycnph_mc_jshns.setText(Constant.zfzycnph_mc_jshns + "");

        mZfzycnph_mc_mj = (EditText) view.findViewById(R.id.zfzycnph_mc_mj);
        mZfzycnph_mc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_mc_mj != 0)
            mZfzycnph_mc_mj.setText(Constant.zfzycnph_mc_mj + "");

        mZfzycnph_mc_zsdl = (EditText) view.findViewById(R.id.zfzycnph_mc_zsdl);
        mZfzycnph_mc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_mc_zsdl != 0)
            mZfzycnph_mc_zsdl.setText(Constant.zfzycnph_mc_zsdl + "");

        mZfzycnph_hj_sdl = (EditText) view.findViewById(R.id.zfzycnph_hj_sdl);
        mZfzycnph_hj_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_hj_sdl != 0)
            mZfzycnph_hj_sdl.setText(Constant.zfzycnph_hj_sdl + "");

        mZfzycnph_hj_jshns = (EditText) view.findViewById(R.id.zfzycnph_hj_jshns);
        mZfzycnph_hj_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_hj_jshns != 0)
            mZfzycnph_hj_jshns.setText(Constant.zfzycnph_hj_jshns + "");

        mZfzycnph_hj_mj = (EditText) view.findViewById(R.id.zfzycnph_hj_mj);
        mZfzycnph_hj_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_hj_mj != 0)
            mZfzycnph_hj_mj.setText(Constant.zfzycnph_hj_mj + "");

        mZfzycnph_hj_zsdl = (EditText) view.findViewById(R.id.zfzycnph_hj_zsdl);
        mZfzycnph_hj_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_hj_zsdl != 0)
            mZfzycnph_hj_zsdl.setText(Constant.zfzycnph_hj_zsdl + "");

        mZfzycnph_cz_sdl = (EditText) view.findViewById(R.id.zfzycnph_cz_sdl);
        mZfzycnph_cz_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cz_sdl != 0)
            mZfzycnph_cz_sdl.setText(Constant.zfzycnph_cz_sdl + "");

        mZfzycnph_cz_jshns = (EditText) view.findViewById(R.id.zfzycnph_cz_jshns);
        mZfzycnph_cz_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cz_jshns != 0)
            mZfzycnph_cz_jshns.setText(Constant.zfzycnph_cz_jshns + "");

        mZfzycnph_cz_mj = (EditText) view.findViewById(R.id.zfzycnph_cz_mj);
        mZfzycnph_cz_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cz_mj != 0)
            mZfzycnph_cz_mj.setText(Constant.zfzycnph_cz_mj + "");

        mZfzycnph_cz_zsdl = (EditText) view.findViewById(R.id.zfzycnph_cz_zsdl);
        mZfzycnph_cz_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_cz_zsdl != 0)
            mZfzycnph_cz_zsdl.setText(Constant.zfzycnph_cz_zsdl + "");

        mZzfzcdph_zcdl = (EditText) view.findViewById(R.id.zzfzcdph_zcdl);
        mZzfzcdph_zcdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_zcdl != 0)
            mZzfzcdph_zcdl.setText(Constant.zzfzcdph_zcdl + "");

        mZzfzcdph_sd_sdl = (EditText) view.findViewById(R.id.zzfzcdph_sd_sdl);
        mZzfzcdph_sd_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.sd != 0)
            mZzfzcdph_sd_sdl.setText(Constant.sd + "");

        mZzfzcdph_sd_jshns = (EditText) view.findViewById(R.id.zzfzcdph_sd_jshns);
        mZzfzcdph_sd_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_sd_jshns != 0)
            mZzfzcdph_sd_jshns.setText(Constant.zzfzcdph_sd_jshns + "");

        mZzfzcdph_sd_mj = (EditText) view.findViewById(R.id.zzfzcdph_sd_mj);
        mZzfzcdph_sd_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_sd_mj != 0)
            mZzfzcdph_sd_mj.setText(Constant.zzfzcdph_sd_mj + "");

        mZzfzcdph_sd_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_sd_zsdl);
        mZzfzcdph_sd_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_sd_zsdl != 0)
            mZzfzcdph_sd_zsdl.setText(Constant.zzfzcdph_sd_zsdl + "");

        mZzfzcdph_xm_sdl = (EditText) view.findViewById(R.id.zzfzcdph_xm_sdl);
        mZzfzcdph_xm_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.xm != 0)
            mZzfzcdph_xm_sdl.setText(Constant.xm + "");

        mZzfzcdph_xm_jshns = (EditText) view.findViewById(R.id.zzfzcdph_xm_jshns);
        mZzfzcdph_xm_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_xm_jshns != 0)
            mZzfzcdph_xm_jshns.setText(Constant.zzfzcdph_xm_jshns + "");

        mZzfzcdph_xm_mj = (EditText) view.findViewById(R.id.zzfzcdph_xm_mj);
        mZzfzcdph_xm_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_xm_mj != 0)
            mZzfzcdph_xm_mj.setText(Constant.zzfzcdph_xm_mj + "");

        mZzfzcdph_xm_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_xm_zsdl);
        mZfzycnph_zcdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_xm_zsdl != 0)
            mZzfzcdph_xm_zsdl.setText(Constant.zzfzcdph_xm_zsdl + "");

        mZzfzcdph_ym_sdl = (EditText) view.findViewById(R.id.zzfzcdph_ym_sdl);
        mZzfzcdph_ym_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.ym != 0)
            mZzfzcdph_ym_sdl.setText(Constant.ym + "");

        mZzfzcdph_ym_jshns = (EditText) view.findViewById(R.id.zzfzcdph_ym_jshns);
        mZzfzcdph_ym_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_ym_jshns != 0)
            mZzfzcdph_ym_jshns.setText(Constant.zzfzcdph_ym_jshns + "");

        mZzfzcdph_ym_mj = (EditText) view.findViewById(R.id.zzfzcdph_ym_mj);
        mZzfzcdph_ym_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_ym_mj != 0)
            mZzfzcdph_ym_mj.setText(Constant.zzfzcdph_ym_mj + "");

        mZzfzcdph_ym_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_ym_zsdl);
        mZzfzcdph_ym_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_ym_zsdl != 0)
            mZzfzcdph_ym_zsdl.setText(Constant.zzfzcdph_ym_zsdl + "");

        mZzfzcdph_yc_sdl = (EditText) view.findViewById(R.id.zzfzcdph_yc_sdl);
        mZzfzcdph_yc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yc != 0)
            mZzfzcdph_yc_sdl.setText(Constant.yc + "");

        mZzfzcdph_yc_jshns = (EditText) view.findViewById(R.id.zzfzcdph_yc_jshns);
        mZzfzcdph_yc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_yc_jshns != 0)
            mZzfzcdph_yc_jshns.setText(Constant.zzfzcdph_yc_jshns + "");

        mZzfzcdph_yc_mj = (EditText) view.findViewById(R.id.zzfzcdph_yc_mj);
        mZzfzcdph_yc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_yc_mj != 0)
            mZzfzcdph_yc_mj.setText(Constant.zzfzcdph_yc_mj + "");

        mZzfzcdph_yc_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_yc_zsdl);
        mZzfzcdph_yc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_yc_zsdl != 0)
            mZzfzcdph_yc_zsdl.setText(Constant.zzfzcdph_yc_zsdl + "");

        mZzfzcdph_gs_sdl = (EditText) view.findViewById(R.id.zzfzcdph_gs_sdl);
        mZzfzcdph_gs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.gs != 0)
            mZzfzcdph_gs_sdl.setText(Constant.gs + "");

        mZzfzcdph_gs_jshns = (EditText) view.findViewById(R.id.zzfzcdph_gs_jshns);
        mZzfzcdph_gs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_gs_jshns != 0)
            mZzfzcdph_gs_jshns.setText(Constant.zzfzcdph_gs_jshns + "");

        mZzfzcdph_gs_mj = (EditText) view.findViewById(R.id.zzfzcdph_gs_mj);
        mZzfzcdph_gs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_gs_mj != 0)
            mZzfzcdph_gs_mj.setText(Constant.zzfzcdph_gs_mj + "");

        mZzfzcdph_gs_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_gs_zsdl);
        mZzfzcdph_gs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_gs_zsdl != 0)
            mZzfzcdph_gs_zsdl.setText(Constant.zzfzcdph_gs_zsdl + "");

        mZzfzcdph_gs_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_mls_sdl);
        mZzfzcdph_gs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_gs_zsdl != 0)
            mZzfzcdph_gs_zsdl.setText(Constant.zzfzcdph_gs_zsdl + "");

        mZzfzcdph_mls_jshns = (EditText) view.findViewById(R.id.zzfzcdph_mls_jshns);
        mZzfzcdph_mls_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_mls_jshns != 0)
            mZzfzcdph_mls_jshns.setText(Constant.zzfzcdph_mls_jshns + "");

        mZzfzcdph_mls_mj = (EditText) view.findViewById(R.id.zzfzcdph_mls_mj);
        mZzfzcdph_mls_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_mls_mj != 0)
            mZzfzcdph_mls_mj.setText(Constant.zzfzcdph_mls_mj + "");

        mZzfzcdph_mls_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_mls_zsdl);
        mZzfzcdph_mls_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_mls_zsdl != 0)
            mZzfzcdph_mls_zsdl.setText(Constant.zzfzcdph_mls_zsdl + "");

        mZzfzcdph_qglsc_sdl = (EditText) view.findViewById(R.id.zzfzcdph_qglsc_sdl);
        mZzfzcdph_qglsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.qglsc != 0)
            mZzfzcdph_qglsc_sdl.setText(Constant.qglsc + "");

        mZzfzcdph_qglsc_jshns = (EditText) view.findViewById(R.id.zzfzcdph_qglsc_jshns);
        mZzfzcdph_qglsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_qglsc_jshns != 0)
            mZzfzcdph_qglsc_jshns.setText(Constant.zzfzcdph_qglsc_jshns + "");

        mZzfzcdph_qglsc_mj = (EditText) view.findViewById(R.id.zzfzcdph_qglsc_mj);
        mZzfzcdph_qglsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_qglsc_mj != 0)
            mZzfzcdph_qglsc_mj.setText(Constant.zzfzcdph_qglsc_mj + "");

        mZzfzcdph_qglsc_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_qglsc_zsdl);
        mZzfzcdph_qglsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_qglsc_zsdl != 0)
            mZzfzcdph_qglsc_zsdl.setText(Constant.zzfzcdph_qglsc_zsdl + "");

        mZzfzcdph_ggsc_sdl = (EditText) view.findViewById(R.id.zzfzcdph_ggsc_sdl);
        mZzfzcdph_ggsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.glsc != 0)
            mZzfzcdph_ggsc_sdl.setText(Constant.glsc + "");

        mZzfzcdph_ggsc_jshns = (EditText) view.findViewById(R.id.zzfzcdph_ggsc_jshns);
        mZzfzcdph_ggsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_ggsc_jshns != 0)
            mZzfzcdph_ggsc_jshns.setText(Constant.zzfzcdph_ggsc_jshns + "");

        mZzfzcdph_ggsc_mj = (EditText) view.findViewById(R.id.zzfzcdph_ggsc_mj);
        mZzfzcdph_ggsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_ggsc_mj != 0)
            mZzfzcdph_ggsc_mj.setText(Constant.zzfzcdph_ggsc_mj + "");

        mZzfzcdph_ggsc_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_ggsc_zsdl);
        mZzfzcdph_ggsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_ggsc_zsdl != 0)
            mZzfzcdph_ggsc_zsdl.setText(Constant.zzfzcdph_ggsc_zsdl + "");

        mZzfzcdph_yclsc_sdl = (EditText) view.findViewById(R.id.zzfzcdph_yclsc_sdl);
        mZzfzcdph_yclsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yclsc != 0)
            mZzfzcdph_yclsc_sdl.setText(Constant.yclsc + "");

        mZzfzcdph_yclsc_jshns = (EditText) view.findViewById(R.id.zzfzcdph_yclsc_jshns);
        mZzfzcdph_yclsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_yclsc_jshns != 0)
            mZzfzcdph_yclsc_jshns.setText(Constant.zzfzcdph_yclsc_jshns + "");

        mZzfzcdph_yclsc_mj = (EditText) view.findViewById(R.id.zzfzcdph_yclsc_mj);
        mZzfzcdph_yclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_yclsc_mj != 0)
            mZzfzcdph_yclsc_mj.setText(Constant.zzfzcdph_yclsc_mj + "");

        mZzfzcdph_yclsc_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_yclsc_zsdl);
        mZzfzcdph_yclsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_yclsc_zsdl != 0)
            mZzfzcdph_yclsc_zsdl.setText(Constant.zzfzcdph_yclsc_zsdl + "");

        mZzfzcdph_gclsc_sdl = (EditText) view.findViewById(R.id.zzfzcdph_gclsc_sdl);
        mZzfzcdph_gclsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.gclsc != 0)
            mZzfzcdph_gclsc_sdl.setText(Constant.gclsc + "");

        mZzfzcdph_gclsc_jshns = (EditText) view.findViewById(R.id.zzfzcdph_gclsc_jshns);
        mZzfzcdph_gclsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_gclsc_jshns != 0)
            mZzfzcdph_gclsc_jshns.setText(Constant.zzfzcdph_gclsc_jshns + "");

        mZzfzcdph_gclsc_mj = (EditText) view.findViewById(R.id.zzfzcdph_gclsc_mj);
        mZzfzcdph_gclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_gclsc_mj != 0)
            mZzfzcdph_gclsc_mj.setText(Constant.zzfzcdph_gclsc_mj + "");

        mZzfzcdph_gclsc_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_gclsc_zsdl);
        mZzfzcdph_gclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_gclsc_mj != 0)
            mZzfzcdph_gclsc_mj.setText(Constant.zzfzcdph_gclsc_mj + "");

        mZzfzcdph_dlsc_sdl = (EditText) view.findViewById(R.id.zzfzcdph_dlsc_sdl);
        mZzfzcdph_dlsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.dlsc != 0)
            mZzfzcdph_dlsc_sdl.setText(Constant.dlsc + "");

        mZzfzcdph_dlsc_jshns = (EditText) view.findViewById(R.id.zzfzcdph_dlsc_jshns);
        mZzfzcdph_dlsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_dlsc_jshns != 0)
            mZzfzcdph_dlsc_jshns.setText(Constant.zzfzcdph_dlsc_jshns + "");

        mZzfzcdph_dlsc_mj = (EditText) view.findViewById(R.id.zzfzcdph_dlsc_mj);
        mZzfzcdph_dlsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_dlsc_mj != 0)
            mZzfzcdph_dlsc_mj.setText(Constant.zzfzcdph_dlsc_mj + "");

        mZzfzcdph_dlsc_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_dlsc_zsdl);
        mZzfzcdph_dlsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_dlsc_zsdl != 0)
            mZzfzcdph_dlsc_zsdl.setText(Constant.zzfzcdph_dlsc_zsdl + "");

        mZzfzcdph_cslsc_sdl = (EditText) view.findViewById(R.id.zzfzcdph_cslsc_sdl);
        mZzfzcdph_cslsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.cslsc != 0)
            mZzfzcdph_cslsc_sdl.setText(Constant.cslsc + "");

        mZzfzcdph_cslsc_jshns = (EditText) view.findViewById(R.id.zzfzcdph_cslsc_jshns);
        mZzfzcdph_cslsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cslsc_jshns != 0)
            mZzfzcdph_cslsc_jshns.setText(Constant.zzfzcdph_cslsc_jshns + "");

        mZzfzcdph_cslsc_mj = (EditText) view.findViewById(R.id.zzfzcdph_cslsc_mj);
        mZzfzcdph_cslsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cslsc_mj != 0)
            mZzfzcdph_cslsc_mj.setText(Constant.zzfzcdph_cslsc_mj + "");

        mZzfzcdph_cslsc_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_cslsc_zsdl);
        mZzfzcdph_cslsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cslsc_zsdl != 0)
            mZzfzcdph_cslsc_zsdl.setText(Constant.zzfzcdph_cslsc_zsdl + "");

        mZzfzcdph_lygs_sdl = (EditText) view.findViewById(R.id.zzfzcdph_lygs_sdl);
        mZzfzcdph_lygs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.lygs != 0)
            mZzfzcdph_lygs_sdl.setText(Constant.lygs + "");

        mZzfzcdph_lygs_jshns = (EditText) view.findViewById(R.id.zzfzcdph_lygs_jshns);
        mZzfzcdph_lygs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_lygs_jshns != 0)
            mZzfzcdph_lygs_jshns.setText(Constant.zzfzcdph_lygs_jshns + "");

        mZzfzcdph_lygs_mj = (EditText) view.findViewById(R.id.zzfzcdph_lygs_mj);
        mZzfzcdph_lygs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_lygs_mj != 0)
            mZzfzcdph_lygs_mj.setText(Constant.zzfzcdph_lygs_mj + "");

        mZzfzcdph_lygs_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_lygs_zsdl);
        mZzfzcdph_lygs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_lygs_zsdl != 0)
            mZzfzcdph_lygs_zsdl.setText(Constant.zzfzcdph_lygs_zsdl + "");

        mZzfzcdph_clgs_sdl = (EditText) view.findViewById(R.id.zzfzcdph_clgs_sdl);
        mZzfzcdph_clgs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.clgs != 0)
            mZzfzcdph_clgs_sdl.setText(Constant.clgs + "");

        mZzfzcdph_clgs_jshns = (EditText) view.findViewById(R.id.zzfzcdph_clgs_jshns);
        mZzfzcdph_clgs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_clgs_jshns != 0)
            mZzfzcdph_clgs_jshns.setText(Constant.zzfzcdph_clgs_jshns + "");

        mZzfzcdph_clgs_mj = (EditText) view.findViewById(R.id.zzfzcdph_clgs_mj);
        mZzfzcdph_clgs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_clgs_mj != 0)
            mZzfzcdph_clgs_mj.setText(Constant.zzfzcdph_clgs_mj + "");

        mZzfzcdph_clgs_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_clgs_zsdl);
        mZzfzcdph_clgs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_clgs_zsdl != 0)
            mZzfzcdph_clgs_zsdl.setText(Constant.zzfzcdph_clgs_zsdl + "");

        mZzfzcdph_cy_sdl = (EditText) view.findViewById(R.id.zzfzcdph_cy_sdl);
        mZzfzcdph_cy_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.cy != 0)
            mZzfzcdph_cy_sdl.setText(Constant.cy + "");

        mZzfzcdph_cy_jshns = (EditText) view.findViewById(R.id.zzfzcdph_cy_jshns);
        mZzfzcdph_cy_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cy_jshns != 0)
            mZzfzcdph_cy_jshns.setText(Constant.zzfzcdph_cy_jshns + "");

        mZzfzcdph_cy_mj = (EditText) view.findViewById(R.id.zzfzcdph_cy_mj);
        mZzfzcdph_cy_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cy_mj != 0)
            mZzfzcdph_cy_mj.setText(Constant.zzfzcdph_cy_mj + "");

        mZzfzcdph_cy_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_cy_zsdl);
        mZzfzcdph_cy_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cy_zsdl != 0)
            mZzfzcdph_cy_zsdl.setText(Constant.zzfzcdph_cy_zsdl + "");

        mZzfzcdph_mc_sdl = (EditText) view.findViewById(R.id.zzfzcdph_mc_sdl);
        mZzfzcdph_mc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.mc != 0)
            mZzfzcdph_mc_sdl.setText(Constant.mc + "");

        mZzfzcdph_mc_jshns = (EditText) view.findViewById(R.id.zzfzcdph_mc_jshns);
        mZzfzcdph_mc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_mc_jshns != 0)
            mZzfzcdph_mc_jshns.setText(Constant.zzfzcdph_mc_jshns + "");

        mZzfzcdph_mc_mj = (EditText) view.findViewById(R.id.zzfzcdph_mc_mj);
        mZzfzcdph_mc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_mc_mj != 0)
            mZzfzcdph_mc_mj.setText(Constant.zzfzcdph_mc_mj + "");

        mZzfzcdph_mc_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_mc_zsdl);
        mZzfzcdph_mc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_mc_zsdl != 0)
            mZfzycnph_zcdl.setText(Constant.zzfzcdph_mc_zsdl + "");

        mZzfzcdph_hj_sdl = (EditText) view.findViewById(R.id.zzfzcdph_hj_sdl);
        mZzfzcdph_hj_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_hj_sdl != 0)
            mZzfzcdph_hj_sdl.setText(Constant.zzfzcdph_hj_sdl + "");

        mZzfzcdph_hj_jshns = (EditText) view.findViewById(R.id.zzfzcdph_hj_jshns);
        mZzfzcdph_hj_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_hj_jshns != 0)
            mZzfzcdph_hj_jshns.setText(Constant.zzfzcdph_hj_jshns + "");

        mZzfzcdph_hj_mj = (EditText) view.findViewById(R.id.zzfzcdph_hj_mj);
        mZzfzcdph_hj_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_hj_mj != 0)
            mZzfzcdph_hj_mj.setText(Constant.zzfzcdph_hj_mj + "");

        mZzfzcdph_hj_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_hj_zsdl);
        mZzfzcdph_hj_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_hj_zsdl != 0)
            mZzfzcdph_hj_zsdl.setText(Constant.zzfzcdph_hj_zsdl + "");

        mZzfzcdph_cz_sdl = (EditText) view.findViewById(R.id.zzfzcdph_cz_sdl);
        mZzfzcdph_cz_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cz_sdl != 0)
            mZzfzcdph_cz_sdl.setText(Constant.zzfzcdph_cz_sdl + "");

        mZzfzcdph_cz_jshns = (EditText) view.findViewById(R.id.zzfzcdph_cz_jshns);
        mZzfzcdph_cz_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cz_jshns != 0)
            mZzfzcdph_cz_jshns.setText(Constant.zzfzcdph_cz_jshns + "");

        mZzfzcdph_cz_mj = (EditText) view.findViewById(R.id.zzfzcdph_cz_mj);
        mZzfzcdph_cz_mj.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cz_mj != 0)
            mZzfzcdph_cz_mj.setText(Constant.zzfzcdph_cz_mj + "");

        mZzfzcdph_cz_zsdl = (EditText) view.findViewById(R.id.zzfzcdph_cz_zsdl);
        mZzfzcdph_cz_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.zzfzcdph_cz_zsdl != 0)
            mZzfzcdph_cz_zsdl.setText(Constant.zzfzcdph_cz_zsdl + "");

        mDnzzfzcdph_zcdl = (EditText) view.findViewById(R.id.dnzzfzcdph_zcdl);
        mDnzzfzcdph_zcdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_zcdl != 0)
            mDnzzfzcdph_zcdl.setText(Constant.dnzzfzcdph_zcdl + "");

        mDnzzfzcdph_sd_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_sd_sdl);
        mDnzzfzcdph_sd_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.sd != 0)
            mDnzzfzcdph_sd_sdl.setText(Constant.sd + "");

        mDnzzfzcdph_sd_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_sd_jshns);
        mDnzzfzcdph_sd_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_sd_jshns != 0)
            mDnzzfzcdph_sd_jshns.setText(Constant.dnzzfzcdph_sd_jshns + "");

        mDnzzfzcdph_sd_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_sd_mj);
        mDnzzfzcdph_sd_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_sd_mj != 0)
            mDnzzfzcdph_sd_mj.setText(Constant.dnzzfzcdph_sd_mj + "");

        mDnzzfzcdph_sd_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_sd_zsdl);
        mDnzzfzcdph_sd_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_sd_zsdl != 0)
            mDnzzfzcdph_sd_zsdl.setText(Constant.dnzzfzcdph_sd_zsdl + "");

        mDnzzfzcdph_xm_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_xm_sdl);
        mDnzzfzcdph_xm_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.xm != 0)
            mDnzzfzcdph_xm_sdl.setText(Constant.xm + "");

        mDnzzfzcdph_xm_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_xm_jshns);
        mDnzzfzcdph_xm_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_xm_jshns != 0)
            mDnzzfzcdph_xm_jshns.setText(Constant.dnzzfzcdph_xm_jshns + "");

        mDnzzfzcdph_xm_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_xm_mj);
        mDnzzfzcdph_xm_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_xm_mj != 0)
            mDnzzfzcdph_xm_mj.setText(Constant.dnzzfzcdph_xm_mj + "");

        mDnzzfzcdph_xm_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_xm_zsdl);
        mDnzzfzcdph_xm_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_xm_zsdl != 0)
            mDnzzfzcdph_xm_zsdl.setText(Constant.dnzzfzcdph_xm_zsdl + "");

        mDnzzfzcdph_ym_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_ym_sdl);
        mDnzzfzcdph_ym_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.ym != 0)
            mDnzzfzcdph_ym_sdl.setText(Constant.ym + "");

        mDnzzfzcdph_ym_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_ym_jshns);
        mDnzzfzcdph_ym_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_ym_jshns != 0)
            mDnzzfzcdph_ym_jshns.setText(Constant.dnzzfzcdph_ym_jshns + "");

        mDnzzfzcdph_ym_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_ym_mj);
        mDnzzfzcdph_ym_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_ym_mj != 0)
            mDnzzfzcdph_ym_mj.setText(Constant.dnzzfzcdph_ym_mj + "");

        mDnzzfzcdph_ym_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_ym_zsdl);
        mDnzzfzcdph_ym_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_ym_zsdl != 0)
            mDnzzfzcdph_ym_zsdl.setText(Constant.dnzzfzcdph_ym_zsdl + "");

        mDnzzfzcdph_yc_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_yc_sdl);
        mDnzzfzcdph_yc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yc != 0)
            mDnzzfzcdph_yc_sdl.setText(Constant.yc + "");

        mDnzzfzcdph_yc_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_yc_jshns);
        mDnzzfzcdph_yc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_yc_jshns != 0)
            mDnzzfzcdph_yc_jshns.setText(Constant.dnzzfzcdph_yc_jshns + "");

        mDnzzfzcdph_yc_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_yc_mj);
        mDnzzfzcdph_yc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_yc_mj != 0)
            mDnzzfzcdph_yc_mj.setText(Constant.dnzzfzcdph_yc_mj + "");

        mDnzzfzcdph_yc_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_yc_zsdl);
        mDnzzfzcdph_yc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_yc_zsdl != 0)
            mDnzzfzcdph_yc_zsdl.setText(Constant.dnzzfzcdph_yc_zsdl + "");

        mDnzzfzcdph_gs_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_gs_sdl);
        mDnzzfzcdph_gs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.gs != 0)
            mDnzzfzcdph_gs_sdl.setText(Constant.gs + "");

        mDnzzfzcdph_gs_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_gs_jshns);
        mDnzzfzcdph_gs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_gs_jshns != 0)
            mDnzzfzcdph_gs_jshns.setText(Constant.dnzzfzcdph_gs_jshns + "");

        mDnzzfzcdph_gs_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_gs_mj);
        mDnzzfzcdph_gs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_gs_mj != 0)
            mDnzzfzcdph_gs_mj.setText(Constant.dnzzfzcdph_gs_mj + "");

        mDnzzfzcdph_gs_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_gs_zsdl);
        mDnzzfzcdph_gs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_gs_zsdl != 0)
            mDnzzfzcdph_gs_zsdl.setText(Constant.dnzzfzcdph_gs_zsdl + "");

        mDnzzfzcdph_mls_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_mls_sdl);
        mDnzzfzcdph_mls_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.mls != 0)
            mDnzzfzcdph_mls_sdl.setText(Constant.mls + "");

        mDnzzfzcdph_mls_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_mls_jshns);
        mDnzzfzcdph_mls_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_mls_jshns != 0)
            mDnzzfzcdph_mls_jshns.setText(Constant.dnzzfzcdph_mls_jshns + "");

        mDnzzfzcdph_mls_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_mls_mj);
        mDnzzfzcdph_mls_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_mls_mj != 0)
            mDnzzfzcdph_mls_mj.setText(Constant.dnzzfzcdph_mls_mj + "");

        mDnzzfzcdph_mls_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_mls_zsdl);
        mDnzzfzcdph_mls_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_mls_zsdl != 0)
            mDnzzfzcdph_mls_zsdl.setText(Constant.dnzzfzcdph_mls_zsdl + "");

        mDnzzfzcdph_qglsc_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_qglsc_sdl);
        mDnzzfzcdph_qglsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.qglsc != 0)
            mDnzzfzcdph_qglsc_sdl.setText(Constant.qglsc + "");

        mDnzzfzcdph_qglsc_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_qglsc_jshns);
        mDnzzfzcdph_qglsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_qglsc_jshns != 0)
            mDnzzfzcdph_qglsc_jshns.setText(Constant.dnzzfzcdph_qglsc_jshns + "");

        mDnzzfzcdph_qglsc_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_qglsc_mj);
        mDnzzfzcdph_qglsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_qglsc_mj != 0)
            mDnzzfzcdph_qglsc_mj.setText(Constant.dnzzfzcdph_qglsc_mj + "");

        mDnzzfzcdph_qglsc_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_qglsc_zsdl);
        mDnzzfzcdph_qglsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_qglsc_zsdl != 0)
            mDnzzfzcdph_qglsc_zsdl.setText(Constant.dnzzfzcdph_qglsc_zsdl + "");

        mDnzzfzcdph_ggsc_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_ggsc_sdl);
        mDnzzfzcdph_ggsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.glsc != 0)
            mDnzzfzcdph_ggsc_sdl.setText(Constant.glsc + "");

        mDnzzfzcdph_ggsc_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_ggsc_jshns);
        mDnzzfzcdph_ggsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_ggsc_jshns != 0)
            mDnzzfzcdph_ggsc_jshns.setText(Constant.dnzzfzcdph_ggsc_jshns + "");

        mDnzzfzcdph_ggsc_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_ggsc_mj);
        mDnzzfzcdph_ggsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_ggsc_mj != 0)
            mDnzzfzcdph_ggsc_mj.setText(Constant.dnzzfzcdph_ggsc_mj + "");

        mDnzzfzcdph_ggsc_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_ggsc_zsdl);
        mDnzzfzcdph_ggsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_ggsc_zsdl != 0)
            mDnzzfzcdph_ggsc_zsdl.setText(Constant.dnzzfzcdph_ggsc_zsdl + "");

        mDnzzfzcdph_yclsc_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_yclsc_sdl);
        mDnzzfzcdph_yclsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.yclsc != 0)
            mDnzzfzcdph_yclsc_sdl.setText(Constant.yclsc + "");

        mDnzzfzcdph_yclsc_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_yclsc_jshns);
        mDnzzfzcdph_yclsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_yclsc_jshns != 0)
            mDnzzfzcdph_yclsc_jshns.setText(Constant.dnzzfzcdph_yclsc_jshns + "");

        mDnzzfzcdph_yclsc_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_yclsc_mj);
        mDnzzfzcdph_yclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_yclsc_mj != 0)
            mDnzzfzcdph_yclsc_mj.setText(Constant.dnzzfzcdph_yclsc_mj + "");

        mDnzzfzcdph_yclsc_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_yclsc_zsdl);
        mDnzzfzcdph_yclsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_yclsc_zsdl != 0)
            mDnzzfzcdph_yclsc_zsdl.setText(Constant.dnzzfzcdph_yclsc_zsdl + "");

        mDnzzfzcdph_gclsc_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_gclsc_sdl);
        mDnzzfzcdph_gclsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.gclsc != 0)
            mDnzzfzcdph_gclsc_sdl.setText(Constant.gclsc + "");

        mDnzzfzcdph_gclsc_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_gclsc_jshns);
        mDnzzfzcdph_gclsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_gclsc_jshns != 0)
            mDnzzfzcdph_gclsc_jshns.setText(Constant.dnzzfzcdph_gclsc_jshns + "");

        mDnzzfzcdph_gclsc_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_gclsc_mj);
        mDnzzfzcdph_gclsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_gclsc_mj != 0)
            mDnzzfzcdph_gclsc_mj.setText(Constant.dnzzfzcdph_gclsc_mj + "");

        mDnzzfzcdph_gclsc_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_gclsc_zsdl);
        mZfzycnph_zcdl.setOnFocusChangeListener(focusListener);
        if (Constant.zfzycnph_zcdl != 0)
            mZfzycnph_zcdl.setText(Constant.zfzycnph_zcdl + "");

        mDnzzfzcdph_dlsc_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_dlsc_sdl);
        mDnzzfzcdph_dlsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.dlsc != 0)
            mDnzzfzcdph_dlsc_sdl.setText(Constant.dlsc + "");

        mDnzzfzcdph_dlsc_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_dlsc_jshns);
        mDnzzfzcdph_dlsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_dlsc_jshns != 0)
            mDnzzfzcdph_dlsc_jshns.setText(Constant.dnzzfzcdph_dlsc_jshns + "");

        mDnzzfzcdph_dlsc_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_dlsc_mj);
        mDnzzfzcdph_dlsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_dlsc_mj != 0)
            mDnzzfzcdph_dlsc_mj.setText(Constant.dnzzfzcdph_dlsc_mj + "");

        mDnzzfzcdph_dlsc_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_dlsc_zsdl);
        mDnzzfzcdph_dlsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_dlsc_zsdl != 0)
            mDnzzfzcdph_dlsc_zsdl.setText(Constant.dnzzfzcdph_dlsc_zsdl + "");

        mDnzzfzcdph_cslsc_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_cslsc_sdl);
        mDnzzfzcdph_cslsc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.cslsc != 0)
            mDnzzfzcdph_cslsc_sdl.setText(Constant.cslsc + "");

        mDnzzfzcdph_cslsc_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_cslsc_jshns);
        mDnzzfzcdph_cslsc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cslsc_jshns != 0)
            mDnzzfzcdph_cslsc_jshns.setText(Constant.dnzzfzcdph_cslsc_jshns + "");

        mDnzzfzcdph_cslsc_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_cslsc_mj);
        mDnzzfzcdph_cslsc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cslsc_mj != 0)
            mDnzzfzcdph_cslsc_mj.setText(Constant.dnzzfzcdph_cslsc_mj + "");

        mDnzzfzcdph_cslsc_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_cslsc_zsdl);
        mDnzzfzcdph_cslsc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cslsc_zsdl != 0)
            mDnzzfzcdph_cslsc_zsdl.setText(Constant.dnzzfzcdph_cslsc_zsdl + "");

        mDnzzfzcdph_lygs_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_lygs_sdl);
        mDnzzfzcdph_lygs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.lygs != 0)
            mDnzzfzcdph_lygs_sdl.setText(Constant.lygs + "");

        mDnzzfzcdph_lygs_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_lygs_jshns);
        mDnzzfzcdph_lygs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_lygs_jshns != 0)
            mDnzzfzcdph_lygs_jshns.setText(Constant.dnzzfzcdph_lygs_jshns + "");

        mDnzzfzcdph_lygs_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_lygs_mj);
        mDnzzfzcdph_lygs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_lygs_mj != 0)
            mDnzzfzcdph_lygs_mj.setText(Constant.dnzzfzcdph_lygs_mj + "");

        mDnzzfzcdph_lygs_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_lygs_zsdl);
        mDnzzfzcdph_lygs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_lygs_zsdl != 0)
            mDnzzfzcdph_lygs_zsdl.setText(Constant.dnzzfzcdph_lygs_zsdl + "");

        mDnzzfzcdph_clgs_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_clgs_sdl);
        mDnzzfzcdph_clgs_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.clgs != 0)
            mDnzzfzcdph_clgs_sdl.setText(Constant.clgs + "");

        mDnzzfzcdph_clgs_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_clgs_jshns);
        mDnzzfzcdph_clgs_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_clgs_jshns != 0)
            mDnzzfzcdph_clgs_jshns.setText(Constant.dnzzfzcdph_clgs_jshns + "");

        mDnzzfzcdph_clgs_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_clgs_mj);
        mDnzzfzcdph_clgs_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_clgs_mj != 0)
            mDnzzfzcdph_clgs_mj.setText(Constant.dnzzfzcdph_clgs_mj + "");

        mDnzzfzcdph_clgs_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_clgs_zsdl);
        mDnzzfzcdph_clgs_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_clgs_zsdl != 0)
            mDnzzfzcdph_clgs_zsdl.setText(Constant.dnzzfzcdph_clgs_zsdl + "");

        mDnzzfzcdph_cy_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_cy_sdl);
        mDnzzfzcdph_cy_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.cy != 0)
            mDnzzfzcdph_cy_sdl.setText(Constant.cy + "");

        mDnzzfzcdph_cy_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_cy_jshns);
        mDnzzfzcdph_cy_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cy_jshns != 0)
            mDnzzfzcdph_cy_jshns.setText(Constant.dnzzfzcdph_cy_jshns + "");

        mDnzzfzcdph_cy_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_cy_mj);
        mDnzzfzcdph_cy_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cy_mj != 0)
            mDnzzfzcdph_cy_mj.setText(Constant.dnzzfzcdph_cy_mj + "");

        mDnzzfzcdph_cy_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_cy_zsdl);
        mDnzzfzcdph_cy_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cy_zsdl != 0)
            mDnzzfzcdph_cy_zsdl.setText(Constant.dnzzfzcdph_cy_zsdl + "");

        mDnzzfzcdph_mc_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_mc_sdl);
        mDnzzfzcdph_mc_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.mc != 0)
            mDnzzfzcdph_mc_sdl.setText(Constant.mc + "");

        mDnzzfzcdph_mc_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_mc_jshns);
        mDnzzfzcdph_mc_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_mc_jshns != 0)
            mDnzzfzcdph_mc_jshns.setText(Constant.dnzzfzcdph_mc_jshns + "");

        mDnzzfzcdph_mc_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_mc_mj);
        mDnzzfzcdph_mc_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_mc_mj != 0)
            mDnzzfzcdph_mc_mj.setText(Constant.dnzzfzcdph_mc_mj + "");

        mDnzzfzcdph_mc_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_mc_zsdl);
        mDnzzfzcdph_mc_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_mc_zsdl != 0)
            mDnzzfzcdph_mc_zsdl.setText(Constant.dnzzfzcdph_mc_zsdl + "");

        mDnzzfzcdph_hj_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_hj_sdl);
        mDnzzfzcdph_hj_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_hj_sdl != 0)
            mDnzzfzcdph_hj_sdl.setText(Constant.dnzzfzcdph_hj_sdl + "");

        mDnzzfzcdph_hj_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_hj_jshns);
        mDnzzfzcdph_hj_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_hj_jshns != 0)
            mDnzzfzcdph_hj_jshns.setText(Constant.dnzzfzcdph_hj_jshns + "");

        mDnzzfzcdph_hj_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_hj_mj);
        mDnzzfzcdph_hj_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_hj_mj != 0)
            mDnzzfzcdph_hj_mj.setText(Constant.dnzzfzcdph_hj_mj + "");

        mDnzzfzcdph_hj_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_hj_zsdl);
        mDnzzfzcdph_hj_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_hj_zsdl != 0)
            mDnzzfzcdph_hj_zsdl.setText(Constant.dnzzfzcdph_hj_zsdl + "");

        mDnzzfzcdph_cz_sdl = (EditText) view.findViewById(R.id.dnzzfzcdph_cz_sdl);
        mDnzzfzcdph_cz_sdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cz_sdl != 0)
            mDnzzfzcdph_cz_sdl.setText(Constant.dnzzfzcdph_cz_sdl + "");

        mDnzzfzcdph_cz_jshns = (EditText) view.findViewById(R.id.dnzzfzcdph_cz_jshns);
        mDnzzfzcdph_cz_jshns.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cz_jshns != 0)
            mDnzzfzcdph_cz_jshns.setText(Constant.dnzzfzcdph_cz_jshns + "");

        mDnzzfzcdph_cz_mj = (EditText) view.findViewById(R.id.dnzzfzcdph_cz_mj);
        mDnzzfzcdph_cz_mj.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cz_mj != 0)
            mDnzzfzcdph_cz_mj.setText(Constant.dnzzfzcdph_cz_mj + "");

        mDnzzfzcdph_cz_zsdl = (EditText) view.findViewById(R.id.dnzzfzcdph_cz_zsdl);
        mDnzzfzcdph_cz_zsdl.setOnFocusChangeListener(focusListener);
        if (Constant.dnzzfzcdph_cz_zsdl != 0)
            mDnzzfzcdph_cz_zsdl.setText(Constant.dnzzfzcdph_cz_zsdl + "");
    }

    @Override
    public void saveData(EditText view, String text) {
        if (view == mZfzycnph_zcdl) {
            String zfzycnph_zcdl = mZfzycnph_zcdl.getText().toString();
            Constant.zfzycnph_zcdl = Double.parseDouble(zfzycnph_zcdl);
            SpUtil.saveSP(getContext(), "zfzycnph_zcdl", Constant.zfzycnph_zcdl);
        }
        if (view == mZfzycnph_sd_sdl) {
            String zfzycnph_sd_sdl = mZfzycnph_sd_sdl.getText().toString();
            Constant.sd = Double.parseDouble(zfzycnph_sd_sdl);
            SpUtil.saveSP(getContext(), "sd", Constant.sd);
        }
        if (view == mZfzycnph_sd_jshns) {
            String zfzycnph_sd_jshns = mZfzycnph_sd_jshns.getText().toString();
            Constant.zfzycnph_sd_jshns = Double.parseDouble(zfzycnph_sd_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_sd_jshns", Constant.zfzycnph_sd_jshns);
        }
        if (view == mZfzycnph_sd_mj) {
            String zfzycnph_sd_mj = mZfzycnph_sd_mj.getText().toString();
            Constant.zfzycnph_sd_mj = Double.parseDouble(zfzycnph_sd_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_sd_mj", Constant.zfzycnph_sd_mj);
        }
        if (view == mZfzycnph_sd_zsdl) {
            String zfzycnph_sd_zsdl = mZfzycnph_sd_zsdl.getText().toString();
            Constant.zfzycnph_sd_zsdl = Double.parseDouble(zfzycnph_sd_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_sd_zsdl", Constant.zfzycnph_sd_zsdl);
        }
        if (view == mZfzycnph_xm_sdl) {
            String zfzycnph_xm_sdl = mZfzycnph_xm_sdl.getText().toString();
            Constant.xm = Double.parseDouble(zfzycnph_xm_sdl);
            SpUtil.saveSP(getContext(), "xm", Constant.xm);
        }
        if (view == mZfzycnph_xm_jshns) {
            String zfzycnph_xm_jshns = mZfzycnph_xm_jshns.getText().toString();
            Constant.zfzycnph_xm_jshns = Double.parseDouble(zfzycnph_xm_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_xm_jshns", Constant.zfzycnph_xm_jshns);
        }
        if (view == mZfzycnph_xm_mj) {
            String zfzycnph_xm_mj = mZfzycnph_xm_mj.getText().toString();
            Constant.zfzycnph_xm_mj = Double.parseDouble(zfzycnph_xm_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_xm_mj", Constant.zfzycnph_xm_mj);
        }
        if (view == mZfzycnph_xm_zsdl) {
            String zfzycnph_xm_zsdl = mZfzycnph_xm_zsdl.getText().toString();
            Constant.zfzycnph_xm_zsdl = Double.parseDouble(zfzycnph_xm_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_xm_zsdl", Constant.zfzycnph_xm_zsdl);
        }
        if (view == mZfzycnph_ym_sdl) {
            String zfzycnph_ym_sdl = mZfzycnph_ym_sdl.getText().toString();
            Constant.ym = Double.parseDouble(zfzycnph_ym_sdl);
            SpUtil.saveSP(getContext(), "ym", Constant.ym);
        }
        if (view == mZfzycnph_ym_jshns) {
            String zfzycnph_ym_jshns = mZfzycnph_ym_jshns.getText().toString();
            Constant.zfzycnph_ym_jshns = Double.parseDouble(zfzycnph_ym_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_ym_jshns", Constant.zfzycnph_ym_jshns);
        }
        if (view == mZfzycnph_ym_mj) {
            String zfzycnph_ym_mj = mZfzycnph_ym_mj.getText().toString();
            Constant.zfzycnph_ym_mj = Double.parseDouble(zfzycnph_ym_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_ym_mj", Constant.zfzycnph_ym_mj);
        }
        if (view == mZfzycnph_ym_zsdl) {
            String zfzycnph_ym_zsdl = mZfzycnph_ym_zsdl.getText().toString();
            Constant.zfzycnph_ym_zsdl = Double.parseDouble(zfzycnph_ym_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_ym_zsdl", Constant.zfzycnph_ym_zsdl);
        }
        if (view == mZfzycnph_yc_sdl) {
            String zfzycnph_yc_sdl = mZfzycnph_yc_sdl.getText().toString();
            Constant.yc = Double.parseDouble(zfzycnph_yc_sdl);
            SpUtil.saveSP(getContext(), "yc", Constant.yc);
        }
        if (view == mZfzycnph_yc_jshns) {
            String zfzycnph_yc_jshns = mZfzycnph_yc_jshns.getText().toString();
            Constant.zfzycnph_yc_jshns = Double.parseDouble(zfzycnph_yc_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_yc_jshns", Constant.zfzycnph_yc_jshns);
        }
        if (view == mZfzycnph_yc_mj) {
            String zfzycnph_yc_mj = mZfzycnph_yc_mj.getText().toString();
            Constant.zfzycnph_yc_mj = Double.parseDouble(zfzycnph_yc_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_yc_mj", Constant.zfzycnph_yc_mj);
        }
        if (view == mZfzycnph_yc_zsdl) {
            String zfzycnph_yc_zsdl = mZfzycnph_yc_zsdl.getText().toString();
            Constant.zfzycnph_yc_zsdl = Double.parseDouble(zfzycnph_yc_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_yc_zsdl", Constant.zfzycnph_yc_zsdl);
        }
        if (view == mZfzycnph_gs_sdl) {
            String zfzycnph_gs_sdl = mZfzycnph_gs_sdl.getText().toString();
            Constant.gs = Double.parseDouble(zfzycnph_gs_sdl);
            SpUtil.saveSP(getContext(), "gs", Constant.gs);
        }
        if (view == mZfzycnph_gs_jshns) {
            String zfzycnph_gs_jshns = mZfzycnph_gs_jshns.getText().toString();
            Constant.zfzycnph_gs_jshns = Double.parseDouble(zfzycnph_gs_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_gs_jshns", Constant.zfzycnph_gs_jshns);
        }
        if (view == mZfzycnph_gs_mj) {
            String zfzycnph_gs_mj = mZfzycnph_gs_mj.getText().toString();
            Constant.zfzycnph_gs_mj = Double.parseDouble(zfzycnph_gs_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_gs_mj", Constant.zfzycnph_gs_mj);
        }
        if (view == mZfzycnph_gs_zsdl) {
            String zfzycnph_gs_zsdl = mZfzycnph_gs_zsdl.getText().toString();
            Constant.zfzycnph_gs_zsdl = Double.parseDouble(zfzycnph_gs_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_gs_zsdl", Constant.zfzycnph_gs_zsdl);
        }
        if (view == mZfzycnph_mls_sdl) {
            String zfzycnph_mls_sdl = mZfzycnph_mls_sdl.getText().toString();
            Constant.mls = Double.parseDouble(zfzycnph_mls_sdl);
            SpUtil.saveSP(getContext(), "mls", Constant.mls);
        }
        if (view == mZfzycnph_mls_jshns) {
            String zfzycnph_mls_jshns = mZfzycnph_mls_jshns.getText().toString();
            Constant.zfzycnph_mls_jshns = Double.parseDouble(zfzycnph_mls_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_mls_jshns", Constant.zfzycnph_mls_jshns);
        }
        if (view == mZfzycnph_mls_mj) {
            String zfzycnph_mls_mj = mZfzycnph_mls_mj.getText().toString();
            Constant.zfzycnph_mls_mj = Double.parseDouble(zfzycnph_mls_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_mls_mj", Constant.zfzycnph_mls_mj);
        }
        if (view == mZfzycnph_mls_zsdl) {
            String zfzycnph_mls_zsdl = mZfzycnph_mls_zsdl.getText().toString();
            Constant.zfzycnph_mls_zsdl = Double.parseDouble(zfzycnph_mls_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_mls_zsdl", Constant.zfzycnph_mls_zsdl);
        }
        if (view == mZfzycnph_qglsc_sdl) {
            String zfzycnph_qglsc_sdl = mZfzycnph_qglsc_sdl.getText().toString();
            Constant.qglsc = Double.parseDouble(zfzycnph_qglsc_sdl);
            SpUtil.saveSP(getContext(), "qglsc", Constant.qglsc);
        }
        if (view == mZfzycnph_qglsc_jshns) {
            String zfzycnph_qglsc_jshns = mZfzycnph_qglsc_jshns.getText().toString();
            Constant.zfzycnph_qglsc_jshns = Double.parseDouble(zfzycnph_qglsc_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_qglsc_jshns", Constant.zfzycnph_qglsc_jshns);
        }
        if (view == mZfzycnph_qglsc_mj) {
            String zfzycnph_qglsc_mj = mZfzycnph_qglsc_mj.getText().toString();
            Constant.zfzycnph_qglsc_mj = Double.parseDouble(zfzycnph_qglsc_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_qglsc_mj", Constant.zfzycnph_qglsc_mj);
        }
        if (view == mZfzycnph_qglsc_zsdl) {
            String zfzycnph_qglsc_zsdl = mZfzycnph_qglsc_zsdl.getText().toString();
            Constant.zfzycnph_qglsc_zsdl = Double.parseDouble(zfzycnph_qglsc_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_qglsc_zsdl", Constant.zfzycnph_qglsc_zsdl);
        }
        if (view == mZfzycnph_ggsc_sdl) {
            String zfzycnph_ggsc_sdl = mZfzycnph_ggsc_sdl.getText().toString();
            Constant.glsc = Double.parseDouble(zfzycnph_ggsc_sdl);
            SpUtil.saveSP(getContext(), "glsc", Constant.glsc);
        }
        if (view == mZfzycnph_ggsc_jshns) {
            String zfzycnph_ggsc_jshns = mZfzycnph_ggsc_jshns.getText().toString();
            Constant.zfzycnph_ggsc_jshns = Double.parseDouble(zfzycnph_ggsc_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_ggsc_jshns", Constant.zfzycnph_ggsc_jshns);
        }
        if (view == mZfzycnph_ggsc_mj) {
            String zfzycnph_ggsc_mj = mZfzycnph_ggsc_mj.getText().toString();
            Constant.zfzycnph_ggsc_mj = Double.parseDouble(zfzycnph_ggsc_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_ggsc_mj", Constant.zfzycnph_ggsc_mj);
        }
        if (view == mZfzycnph_ggsc_zsdl) {
            String zfzycnph_ggsc_zsdl = mZfzycnph_ggsc_zsdl.getText().toString();
            Constant.zfzycnph_ggsc_zsdl = Double.parseDouble(zfzycnph_ggsc_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_ggsc_zsdl", Constant.zfzycnph_ggsc_zsdl);
        }
        if (view == mZfzycnph_yclsc_sdl) {
            String zfzycnph_yclsc_sdl = mZfzycnph_yclsc_sdl.getText().toString();
            Constant.yclsc = Double.parseDouble(zfzycnph_yclsc_sdl);
            SpUtil.saveSP(getContext(), "yclsc", Constant.yclsc);
        }
        if (view == mZfzycnph_yclsc_jshns) {
            String zfzycnph_yclsc_jshns = mZfzycnph_yclsc_jshns.getText().toString();
            Constant.zfzycnph_yclsc_jshns = Double.parseDouble(zfzycnph_yclsc_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_yclsc_jshns", Constant.zfzycnph_yclsc_jshns);
        }
        if (view == mZfzycnph_yclsc_mj) {
            String zfzycnph_yclsc_mj = mZfzycnph_yclsc_mj.getText().toString();
            Constant.zfzycnph_yclsc_mj = Double.parseDouble(zfzycnph_yclsc_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_yclsc_mj", Constant.zfzycnph_yclsc_mj);
        }
        if (view == mZfzycnph_yclsc_zsdl) {
            String zfzycnph_yclsc_zsdl = mZfzycnph_yclsc_zsdl.getText().toString();
            Constant.zfzycnph_yclsc_zsdl = Double.parseDouble(zfzycnph_yclsc_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_yclsc_zsdl", Constant.zfzycnph_yclsc_zsdl);
        }
        if (view == mZfzycnph_gclsc_sdl) {
            String zfzycnph_gclsc_sdl = mZfzycnph_gclsc_sdl.getText().toString();
            Constant.gclsc = Double.parseDouble(zfzycnph_gclsc_sdl);
            SpUtil.saveSP(getContext(), "gclsc", Constant.gclsc);
        }
        if (view == mZfzycnph_gclsc_jshns) {
            String zfzycnph_gclsc_jshns = mZfzycnph_gclsc_jshns.getText().toString();
            Constant.zfzycnph_gclsc_jshns = Double.parseDouble(zfzycnph_gclsc_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_gclsc_jshns", Constant.zfzycnph_gclsc_jshns);
        }
        if (view == mZfzycnph_gclsc_mj) {
            String zfzycnph_gclsc_mj = mZfzycnph_gclsc_mj.getText().toString();
            Constant.zfzycnph_gclsc_mj = Double.parseDouble(zfzycnph_gclsc_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_gclsc_mj", Constant.zfzycnph_gclsc_mj);
        }
        if (view == mZfzycnph_gclsc_zsdl) {
            String zfzycnph_gclsc_zsdl = mZfzycnph_gclsc_zsdl.getText().toString();
            Constant.zfzycnph_gclsc_zsdl = Double.parseDouble(zfzycnph_gclsc_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_gclsc_zsdl", Constant.zfzycnph_gclsc_zsdl);
        }
        if (view == mZfzycnph_dlsc_sdl) {
            String zfzycnph_dlsc_sdl = mZfzycnph_dlsc_sdl.getText().toString();
            Constant.dlsc = Double.parseDouble(zfzycnph_dlsc_sdl);
            SpUtil.saveSP(getContext(), "dlsc", Constant.dlsc);
        }
        if (view == mZfzycnph_dlsc_jshns) {
            String zfzycnph_dlsc_jshns = mZfzycnph_dlsc_jshns.getText().toString();
            Constant.zfzycnph_dlsc_jshns = Double.parseDouble(zfzycnph_dlsc_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_dlsc_jshns", Constant.zfzycnph_dlsc_jshns);
        }
        if (view == mZfzycnph_dlsc_mj) {
            String zfzycnph_dlsc_mj = mZfzycnph_dlsc_mj.getText().toString();
            Constant.zfzycnph_dlsc_mj = Double.parseDouble(zfzycnph_dlsc_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_dlsc_mj", Constant.zfzycnph_dlsc_mj);
        }
        if (view == mZfzycnph_dlsc_zsdl) {
            String zfzycnph_dlsc_zsdl = mZfzycnph_dlsc_zsdl.getText().toString();
            Constant.zfzycnph_dlsc_zsdl = Double.parseDouble(zfzycnph_dlsc_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_dlsc_zsdl", Constant.zfzycnph_dlsc_zsdl);
        }
        if (view == mZfzycnph_cslsc_sdl) {
            String zfzycnph_cslsc_sdl = mZfzycnph_cslsc_sdl.getText().toString();
            Constant.cslsc = Double.parseDouble(zfzycnph_cslsc_sdl);
            SpUtil.saveSP(getContext(), "cslsc", Constant.cslsc);
        }
        if (view == mZfzycnph_cslsc_jshns) {
            String zfzycnph_cslsc_jshns = mZfzycnph_cslsc_jshns.getText().toString();
            Constant.zfzycnph_cslsc_jshns = Double.parseDouble(zfzycnph_cslsc_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_cslsc_jshns", Constant.zfzycnph_cslsc_jshns);
        }
        if (view == mZfzycnph_cslsc_mj) {
            String zfzycnph_cslsc_mj = mZfzycnph_cslsc_mj.getText().toString();
            Constant.zfzycnph_cslsc_mj = Double.parseDouble(zfzycnph_cslsc_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_cslsc_mj", Constant.zfzycnph_cslsc_mj);
        }
        if (view == mZfzycnph_cslsc_zsdl) {
            String zfzycnph_cslsc_zsdl = mZfzycnph_cslsc_zsdl.getText().toString();
            Constant.zfzycnph_cslsc_zsdl = Double.parseDouble(zfzycnph_cslsc_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_cslsc_zsdl", Constant.zfzycnph_cslsc_zsdl);
        }
        if (view == mZfzycnph_lygs_sdl) {
            String zfzycnph_lygs_sdl = mZfzycnph_lygs_sdl.getText().toString();
            Constant.lygs = Double.parseDouble(zfzycnph_lygs_sdl);
            SpUtil.saveSP(getContext(), "lygs", Constant.lygs);
        }
        if (view == mZfzycnph_lygs_jshns) {
            String zfzycnph_lygs_jshns = mZfzycnph_lygs_jshns.getText().toString();
            Constant.zfzycnph_lygs_jshns = Double.parseDouble(zfzycnph_lygs_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_lygs_jshns", Constant.zfzycnph_lygs_jshns);
        }
        if (view == mZfzycnph_lygs_mj) {
            String zfzycnph_lygs_mj = mZfzycnph_lygs_mj.getText().toString();
            Constant.zfzycnph_lygs_mj = Double.parseDouble(zfzycnph_lygs_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_lygs_mj", Constant.zfzycnph_lygs_mj);
        }
        if (view == mZfzycnph_lygs_zsdl) {
            String zfzycnph_lygs_zsdl = mZfzycnph_lygs_zsdl.getText().toString();
            Constant.zfzycnph_lygs_zsdl = Double.parseDouble(zfzycnph_lygs_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_lygs_zsdl", Constant.zfzycnph_lygs_zsdl);
        }
        if (view == mZfzycnph_clgs_sdl) {
            String zfzycnph_clgs_sdl = mZfzycnph_clgs_sdl.getText().toString();
            Constant.clgs = Double.parseDouble(zfzycnph_clgs_sdl);
            SpUtil.saveSP(getContext(), "clgs", Constant.clgs);
        }
        if (view == mZfzycnph_clgs_jshns) {
            String zfzycnph_clgs_jshns = mZfzycnph_clgs_jshns.getText().toString();
            Constant.zfzycnph_clgs_jshns = Double.parseDouble(zfzycnph_clgs_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_clgs_jshns", Constant.zfzycnph_clgs_jshns);
        }
        if (view == mZfzycnph_clgs_mj) {
            String zfzycnph_clgs_mj = mZfzycnph_clgs_mj.getText().toString();
            Constant.zfzycnph_clgs_mj = Double.parseDouble(zfzycnph_clgs_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_clgs_mj", Constant.zfzycnph_clgs_mj);
        }
        if (view == mZfzycnph_clgs_zsdl) {
            String zfzycnph_clgs_zsdl = mZfzycnph_clgs_zsdl.getText().toString();
            Constant.zfzycnph_clgs_zsdl = Double.parseDouble(zfzycnph_clgs_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_clgs_zsdl", Constant.zfzycnph_clgs_zsdl);
        }
        if (view == mZfzycnph_cy_sdl) {
            String zfzycnph_cy_sdl = mZfzycnph_cy_sdl.getText().toString();
            Constant.cy = Double.parseDouble(zfzycnph_cy_sdl);
            SpUtil.saveSP(getContext(), "cy", Constant.cy);
        }
        if (view == mZfzycnph_cy_jshns) {
            String zfzycnph_cy_jshns = mZfzycnph_cy_jshns.getText().toString();
            Constant.zfzycnph_cy_jshns = Double.parseDouble(zfzycnph_cy_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_cy_jshns", Constant.zfzycnph_cy_jshns);
        }
        if (view == mZfzycnph_cy_mj) {
            String zfzycnph_cy_mj = mZfzycnph_cy_mj.getText().toString();
            Constant.zfzycnph_cy_mj = Double.parseDouble(zfzycnph_cy_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_cy_mj", Constant.zfzycnph_cy_mj);
        }
        if (view == mZfzycnph_cy_zsdl) {
            String zfzycnph_cy_zsdl = mZfzycnph_cy_zsdl.getText().toString();
            Constant.zfzycnph_cy_zsdl = Double.parseDouble(zfzycnph_cy_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_cy_zsdl", Constant.zfzycnph_cy_zsdl);
        }
        if (view == mZfzycnph_mc_sdl) {
            String zfzycnph_mc_sdl = mZfzycnph_mc_sdl.getText().toString();
            Constant.mc = Double.parseDouble(zfzycnph_mc_sdl);
            SpUtil.saveSP(getContext(), "mc", Constant.mc);
        }
        if (view == mZfzycnph_mc_jshns) {
            String zfzycnph_mc_jshns = mZfzycnph_mc_jshns.getText().toString();
            Constant.zfzycnph_mc_jshns = Double.parseDouble(zfzycnph_mc_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_mc_jshns", Constant.zfzycnph_mc_jshns);
        }
        if (view == mZfzycnph_mc_mj) {
            String zfzycnph_mc_mj = mZfzycnph_mc_mj.getText().toString();
            Constant.zfzycnph_mc_mj = Double.parseDouble(zfzycnph_mc_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_mc_mj", Constant.zfzycnph_mc_mj);
        }
        if (view == mZfzycnph_mc_zsdl) {
            String zfzycnph_mc_zsdl = mZfzycnph_mc_zsdl.getText().toString();
            Constant.zfzycnph_mc_zsdl = Double.parseDouble(zfzycnph_mc_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_mc_zsdl", Constant.zfzycnph_mc_zsdl);
        }
        if (view == mZfzycnph_hj_sdl) {
            String zfzycnph_hj_sdl = mZfzycnph_hj_sdl.getText().toString();
            Constant.zfzycnph_hj_sdl = Double.parseDouble(zfzycnph_hj_sdl);
            SpUtil.saveSP(getContext(), "zfzycnph_hj_sdl", Constant.zfzycnph_hj_sdl);
        }
        if (view == mZfzycnph_hj_jshns) {
            String zfzycnph_hj_jshns = mZfzycnph_hj_jshns.getText().toString();
            Constant.zfzycnph_hj_jshns = Double.parseDouble(zfzycnph_hj_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_hj_jshns", Constant.zfzycnph_hj_jshns);
        }
        if (view == mZfzycnph_hj_mj) {
            String zfzycnph_hj_mj = mZfzycnph_hj_mj.getText().toString();
            Constant.zfzycnph_hj_mj = Double.parseDouble(zfzycnph_hj_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_hj_mj", Constant.zfzycnph_hj_mj);
        }
        if (view == mZfzycnph_hj_zsdl) {
            String zfzycnph_hj_zsdl = mZfzycnph_hj_zsdl.getText().toString();
            Constant.zfzycnph_hj_zsdl = Double.parseDouble(zfzycnph_hj_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_hj_zsdl", Constant.zfzycnph_hj_zsdl);
        }
        if (view == mZfzycnph_cz_sdl) {
            String zfzycnph_cz_sdl = mZfzycnph_cz_sdl.getText().toString();
            Constant.zfzycnph_cz_sdl = Double.parseDouble(zfzycnph_cz_sdl);
            SpUtil.saveSP(getContext(), "zfzycnph_cz_sdl", Constant.zfzycnph_cz_sdl);
        }
        if (view == mZfzycnph_cz_jshns) {
            String zfzycnph_cz_jshns = mZfzycnph_cz_jshns.getText().toString();
            Constant.zfzycnph_cz_jshns = Double.parseDouble(zfzycnph_cz_jshns);
            SpUtil.saveSP(getContext(), "zfzycnph_cz_jshns", Constant.zfzycnph_cz_jshns);
        }
        if (view == mZfzycnph_cz_mj) {
            String zfzycnph_cz_mj = mZfzycnph_cz_mj.getText().toString();
            Constant.zfzycnph_cz_mj = Double.parseDouble(zfzycnph_cz_mj);
            SpUtil.saveSP(getContext(), "zfzycnph_cz_mj", Constant.zfzycnph_cz_mj);
        }
        if (view == mZfzycnph_cz_zsdl) {
            String zfzycnph_cz_zsdl = mZfzycnph_cz_zsdl.getText().toString();
            Constant.zfzycnph_cz_zsdl = Double.parseDouble(zfzycnph_cz_zsdl);
            SpUtil.saveSP(getContext(), "zfzycnph_cz_zsdl", Constant.zfzycnph_cz_zsdl);
        }
        if (view == mZzfzcdph_zcdl) {
            String zzfzcdph_zcdl = mZzfzcdph_zcdl.getText().toString();
            Constant.zzfzcdph_zcdl = Double.parseDouble(zzfzcdph_zcdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_zcdl", Constant.zzfzcdph_zcdl);
        }
        if (view == mZzfzcdph_sd_sdl) {
            String zzfzcdph_sd_sdl = mZzfzcdph_sd_sdl.getText().toString();
            Constant.sd = Double.parseDouble(zzfzcdph_sd_sdl);
            SpUtil.saveSP(getContext(), "sd", Constant.sd);
        }
        if (view == mZzfzcdph_sd_jshns) {
            String zzfzcdph_sd_jshns = mZzfzcdph_sd_jshns.getText().toString();
            Constant.zzfzcdph_sd_jshns = Double.parseDouble(zzfzcdph_sd_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_sd_jshns", Constant.zzfzcdph_sd_jshns);
        }
        if (view == mZzfzcdph_sd_mj) {
            String zzfzcdph_sd_mj = mZzfzcdph_sd_mj.getText().toString();
            Constant.zzfzcdph_sd_mj = Double.parseDouble(zzfzcdph_sd_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_sd_mj", Constant.zzfzcdph_sd_mj);
        }
        if (view == mZzfzcdph_sd_zsdl) {
            String zzfzcdph_sd_zsdl = mZzfzcdph_sd_zsdl.getText().toString();
            Constant.zzfzcdph_sd_zsdl = Double.parseDouble(zzfzcdph_sd_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_sd_zsdl", Constant.zzfzcdph_sd_zsdl);
        }
        if (view == mZzfzcdph_xm_sdl) {
            String zzfzcdph_xm_sdl = mZzfzcdph_xm_sdl.getText().toString();
            Constant.xm = Double.parseDouble(zzfzcdph_xm_sdl);
            SpUtil.saveSP(getContext(), "xm", Constant.xm);
        }
        if (view == mZzfzcdph_xm_jshns) {
            String zzfzcdph_xm_jshns = mZzfzcdph_xm_jshns.getText().toString();
            Constant.zzfzcdph_xm_jshns = Double.parseDouble(zzfzcdph_xm_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_xm_jshns", Constant.zzfzcdph_xm_jshns);
        }
        if (view == mZzfzcdph_xm_mj) {
            String zzfzcdph_xm_mj = mZzfzcdph_xm_mj.getText().toString();
            Constant.zzfzcdph_xm_mj = Double.parseDouble(zzfzcdph_xm_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_xm_mj", Constant.zzfzcdph_xm_mj);
        }
        if (view == mZzfzcdph_xm_zsdl) {
            String zzfzcdph_xm_zsdl = mZzfzcdph_xm_zsdl.getText().toString();
            Constant.zzfzcdph_xm_zsdl = Double.parseDouble(zzfzcdph_xm_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_xm_zsdl", Constant.zzfzcdph_xm_zsdl);
        }
        if (view == mZzfzcdph_ym_sdl) {
            String zzfzcdph_ym_sdl = mZzfzcdph_ym_sdl.getText().toString();
            Constant.ym = Double.parseDouble(zzfzcdph_ym_sdl);
            SpUtil.saveSP(getContext(), "ym", Constant.ym);
        }
        if (view == mZzfzcdph_ym_jshns) {
            String zzfzcdph_ym_jshns = mZzfzcdph_ym_jshns.getText().toString();
            Constant.zzfzcdph_ym_jshns = Double.parseDouble(zzfzcdph_ym_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_ym_jshns", Constant.zzfzcdph_ym_jshns);
        }
        if (view == mZzfzcdph_ym_mj) {
            String zzfzcdph_ym_mj = mZzfzcdph_ym_mj.getText().toString();
            Constant.zzfzcdph_ym_mj = Double.parseDouble(zzfzcdph_ym_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_ym_mj", Constant.zzfzcdph_ym_mj);
        }
        if (view == mZzfzcdph_ym_zsdl) {
            String zzfzcdph_ym_zsdl = mZzfzcdph_ym_zsdl.getText().toString();
            Constant.zzfzcdph_ym_zsdl = Double.parseDouble(zzfzcdph_ym_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_ym_zsdl", Constant.zzfzcdph_ym_zsdl);
        }
        if (view == mZzfzcdph_yc_sdl) {
            String zzfzcdph_yc_sdl = mZzfzcdph_yc_sdl.getText().toString();
            Constant.yc = Double.parseDouble(zzfzcdph_yc_sdl);
            SpUtil.saveSP(getContext(), "yc", Constant.yc);
        }
        if (view == mZzfzcdph_yc_jshns) {
            String zzfzcdph_yc_jshns = mZzfzcdph_yc_jshns.getText().toString();
            Constant.zzfzcdph_yc_jshns = Double.parseDouble(zzfzcdph_yc_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_yc_jshns", Constant.zzfzcdph_yc_jshns);
        }
        if (view == mZzfzcdph_yc_mj) {
            String zzfzcdph_yc_mj = mZzfzcdph_yc_mj.getText().toString();
            Constant.zzfzcdph_yc_mj = Double.parseDouble(zzfzcdph_yc_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_yc_mj", Constant.zzfzcdph_yc_mj);
        }
        if (view == mZzfzcdph_yc_zsdl) {
            String zzfzcdph_yc_zsdl = mZzfzcdph_yc_zsdl.getText().toString();
            Constant.zzfzcdph_yc_zsdl = Double.parseDouble(zzfzcdph_yc_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_yc_zsdl", Constant.zzfzcdph_yc_zsdl);
        }
        if (view == mZzfzcdph_gs_sdl) {
            String zzfzcdph_gs_sdl = mZzfzcdph_gs_sdl.getText().toString();
            Constant.gs = Double.parseDouble(zzfzcdph_gs_sdl);
            SpUtil.saveSP(getContext(), "gs", Constant.gs);
        }
        if (view == mZzfzcdph_gs_jshns) {
            String zzfzcdph_gs_jshns = mZzfzcdph_gs_jshns.getText().toString();
            Constant.zzfzcdph_gs_jshns = Double.parseDouble(zzfzcdph_gs_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_gs_jshns", Constant.zzfzcdph_gs_jshns);
        }
        if (view == mZzfzcdph_gs_mj) {
            String zzfzcdph_gs_mj = mZzfzcdph_gs_mj.getText().toString();
            Constant.zzfzcdph_gs_mj = Double.parseDouble(zzfzcdph_gs_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_gs_mj", Constant.zzfzcdph_gs_mj);
        }
        if (view == mZzfzcdph_gs_zsdl) {
            String zzfzcdph_gs_zsdl = mZzfzcdph_gs_zsdl.getText().toString();
            Constant.zzfzcdph_gs_zsdl = Double.parseDouble(zzfzcdph_gs_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_gs_zsdl", Constant.zzfzcdph_gs_zsdl);
        }
        if (view == mZzfzcdph_mls_sdl) {
            String zzfzcdph_mls_sdl = mZzfzcdph_mls_sdl.getText().toString();
            Constant.mls = Double.parseDouble(zzfzcdph_mls_sdl);
            SpUtil.saveSP(getContext(), "mls", Constant.mls);
        }
        if (view == mZzfzcdph_mls_jshns) {
            String zzfzcdph_mls_jshns = mZzfzcdph_mls_jshns.getText().toString();
            Constant.zzfzcdph_mls_jshns = Double.parseDouble(zzfzcdph_mls_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_mls_jshns", Constant.zzfzcdph_mls_jshns);
        }
        if (view == mZzfzcdph_mls_mj) {
            String zzfzcdph_mls_mj = mZzfzcdph_mls_mj.getText().toString();
            Constant.zzfzcdph_mls_mj = Double.parseDouble(zzfzcdph_mls_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_mls_mj", Constant.zzfzcdph_mls_mj);
        }
        if (view == mZzfzcdph_mls_zsdl) {
            String zzfzcdph_mls_zsdl = mZzfzcdph_mls_zsdl.getText().toString();
            Constant.zzfzcdph_mls_zsdl = Double.parseDouble(zzfzcdph_mls_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_mls_zsdl", Constant.zzfzcdph_mls_zsdl);
        }
        if (view == mZzfzcdph_qglsc_sdl) {
            String zzfzcdph_qglsc_sdl = mZzfzcdph_qglsc_sdl.getText().toString();
            Constant.qglsc = Double.parseDouble(zzfzcdph_qglsc_sdl);
            SpUtil.saveSP(getContext(), "qglsc", Constant.qglsc);
        }
        if (view == mZzfzcdph_qglsc_jshns) {
            String zzfzcdph_qglsc_jshns = mZzfzcdph_qglsc_jshns.getText().toString();
            Constant.zzfzcdph_qglsc_jshns = Double.parseDouble(zzfzcdph_qglsc_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_qglsc_jshns", Constant.zzfzcdph_qglsc_jshns);
        }
        if (view == mZzfzcdph_qglsc_mj) {
            String zzfzcdph_qglsc_mj = mZzfzcdph_qglsc_mj.getText().toString();
            Constant.zzfzcdph_qglsc_mj = Double.parseDouble(zzfzcdph_qglsc_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_qglsc_mj", Constant.zzfzcdph_qglsc_mj);
        }
        if (view == mZzfzcdph_qglsc_zsdl) {
            String zzfzcdph_qglsc_zsdl = mZzfzcdph_qglsc_zsdl.getText().toString();
            Constant.zzfzcdph_qglsc_zsdl = Double.parseDouble(zzfzcdph_qglsc_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_qglsc_zsdl", Constant.zzfzcdph_qglsc_zsdl);
        }
        if (view == mZzfzcdph_ggsc_sdl) {
            String zzfzcdph_ggsc_sdl = mZzfzcdph_ggsc_sdl.getText().toString();
            Constant.glsc = Double.parseDouble(zzfzcdph_ggsc_sdl);
            SpUtil.saveSP(getContext(), "glsc", Constant.glsc);
        }
        if (view == mZzfzcdph_ggsc_jshns) {
            String zzfzcdph_ggsc_jshns = mZzfzcdph_ggsc_jshns.getText().toString();
            Constant.zzfzcdph_ggsc_jshns = Double.parseDouble(zzfzcdph_ggsc_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_ggsc_jshns", Constant.zzfzcdph_ggsc_jshns);
        }
        if (view == mZzfzcdph_ggsc_mj) {
            String zzfzcdph_ggsc_mj = mZzfzcdph_ggsc_mj.getText().toString();
            Constant.zzfzcdph_ggsc_mj = Double.parseDouble(zzfzcdph_ggsc_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_ggsc_mj", Constant.zzfzcdph_ggsc_mj);
        }
        if (view == mZzfzcdph_ggsc_zsdl) {
            String zzfzcdph_ggsc_zsdl = mZzfzcdph_ggsc_zsdl.getText().toString();
            Constant.zzfzcdph_ggsc_zsdl = Double.parseDouble(zzfzcdph_ggsc_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_ggsc_zsdl", Constant.zzfzcdph_ggsc_zsdl);
        }
        if (view == mZzfzcdph_yclsc_sdl) {
            String zzfzcdph_yclsc_sdl = mZzfzcdph_yclsc_sdl.getText().toString();
            Constant.yclsc = Double.parseDouble(zzfzcdph_yclsc_sdl);
            SpUtil.saveSP(getContext(), "yclsc", Constant.yclsc);
        }
        if (view == mZzfzcdph_yclsc_jshns) {
            String zzfzcdph_yclsc_jshns = mZzfzcdph_yclsc_jshns.getText().toString();
            Constant.zzfzcdph_yclsc_jshns = Double.parseDouble(zzfzcdph_yclsc_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_yclsc_jshns", Constant.zzfzcdph_yclsc_jshns);
        }
        if (view == mZzfzcdph_yclsc_mj) {
            String zzfzcdph_yclsc_mj = mZzfzcdph_yclsc_mj.getText().toString();
            Constant.zzfzcdph_yclsc_mj = Double.parseDouble(zzfzcdph_yclsc_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_yclsc_mj", Constant.zzfzcdph_yclsc_mj);
        }
        if (view == mZzfzcdph_yclsc_zsdl) {
            String zzfzcdph_yclsc_zsdl = mZzfzcdph_yclsc_zsdl.getText().toString();
            Constant.zzfzcdph_yclsc_zsdl = Double.parseDouble(zzfzcdph_yclsc_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_yclsc_zsdl", Constant.zzfzcdph_yclsc_zsdl);
        }
        if (view == mZzfzcdph_gclsc_sdl) {
            String zzfzcdph_gclsc_sdl = mZzfzcdph_gclsc_sdl.getText().toString();
            Constant.gclsc = Double.parseDouble(zzfzcdph_gclsc_sdl);
            SpUtil.saveSP(getContext(), "gclsc", Constant.gclsc);
        }
        if (view == mZzfzcdph_gclsc_jshns) {
            String zzfzcdph_gclsc_jshns = mZzfzcdph_gclsc_jshns.getText().toString();
            Constant.zzfzcdph_gclsc_jshns = Double.parseDouble(zzfzcdph_gclsc_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_gclsc_jshns", Constant.zzfzcdph_gclsc_jshns);
        }
        if (view == mZzfzcdph_gclsc_mj) {
            String zzfzcdph_gclsc_mj = mZzfzcdph_gclsc_mj.getText().toString();
            Constant.zzfzcdph_gclsc_mj = Double.parseDouble(zzfzcdph_gclsc_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_gclsc_mj", Constant.zzfzcdph_gclsc_mj);
        }
        if (view == mZzfzcdph_gclsc_zsdl) {
            String zzfzcdph_gclsc_zsdl = mZzfzcdph_gclsc_zsdl.getText().toString();
            Constant.zzfzcdph_gclsc_zsdl = Double.parseDouble(zzfzcdph_gclsc_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_gclsc_zsdl", Constant.zzfzcdph_gclsc_zsdl);
        }
        if (view == mZzfzcdph_dlsc_sdl) {
            String zzfzcdph_dlsc_sdl = mZzfzcdph_dlsc_sdl.getText().toString();
            Constant.dlsc = Double.parseDouble(zzfzcdph_dlsc_sdl);
            SpUtil.saveSP(getContext(), "dlsc", Constant.dlsc);
        }
        if (view == mZzfzcdph_dlsc_jshns) {
            String zzfzcdph_dlsc_jshns = mZzfzcdph_dlsc_jshns.getText().toString();
            Constant.zzfzcdph_dlsc_jshns = Double.parseDouble(zzfzcdph_dlsc_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_dlsc_jshns", Constant.zzfzcdph_dlsc_jshns);
        }
        if (view == mZzfzcdph_dlsc_mj) {
            String zzfzcdph_dlsc_mj = mZzfzcdph_dlsc_mj.getText().toString();
            Constant.zzfzcdph_dlsc_mj = Double.parseDouble(zzfzcdph_dlsc_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_dlsc_mj", Constant.zzfzcdph_dlsc_mj);
        }
        if (view == mZzfzcdph_dlsc_zsdl) {
            String zzfzcdph_dlsc_zsdl = mZzfzcdph_dlsc_zsdl.getText().toString();
            Constant.zzfzcdph_dlsc_zsdl = Double.parseDouble(zzfzcdph_dlsc_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_dlsc_zsdl", Constant.zzfzcdph_dlsc_zsdl);
        }
        if (view == mZzfzcdph_cslsc_sdl) {
            String zzfzcdph_cslsc_sdl = mZzfzcdph_cslsc_sdl.getText().toString();
            Constant.cslsc = Double.parseDouble(zzfzcdph_cslsc_sdl);
            SpUtil.saveSP(getContext(), "cslsc", Constant.cslsc);
        }
        if (view == mZzfzcdph_cslsc_jshns) {
            String zzfzcdph_cslsc_jshns = mZzfzcdph_cslsc_jshns.getText().toString();
            Constant.zzfzcdph_cslsc_jshns = Double.parseDouble(zzfzcdph_cslsc_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_cslsc_jshns", Constant.zzfzcdph_cslsc_jshns);
        }
        if (view == mZzfzcdph_cslsc_mj) {
            String zzfzcdph_cslsc_mj = mZzfzcdph_cslsc_mj.getText().toString();
            Constant.zzfzcdph_cslsc_mj = Double.parseDouble(zzfzcdph_cslsc_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_cslsc_mj", Constant.zzfzcdph_cslsc_mj);
        }
        if (view == mZzfzcdph_cslsc_zsdl) {
            String zzfzcdph_cslsc_zsdl = mZzfzcdph_cslsc_zsdl.getText().toString();
            Constant.zzfzcdph_cslsc_zsdl = Double.parseDouble(zzfzcdph_cslsc_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_cslsc_zsdl", Constant.zzfzcdph_cslsc_zsdl);
        }
        if (view == mZzfzcdph_lygs_sdl) {
            String zzfzcdph_lygs_sdl = mZzfzcdph_lygs_sdl.getText().toString();
            Constant.lygs = Double.parseDouble(zzfzcdph_lygs_sdl);
            SpUtil.saveSP(getContext(), "lygs", Constant.lygs);
        }
        if (view == mZzfzcdph_lygs_jshns) {
            String zzfzcdph_lygs_jshns = mZzfzcdph_lygs_jshns.getText().toString();
            Constant.zzfzcdph_lygs_jshns = Double.parseDouble(zzfzcdph_lygs_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_lygs_jshns", Constant.zzfzcdph_lygs_jshns);
        }
        if (view == mZzfzcdph_lygs_mj) {
            String zzfzcdph_lygs_mj = mZzfzcdph_lygs_mj.getText().toString();
            Constant.zzfzcdph_lygs_mj = Double.parseDouble(zzfzcdph_lygs_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_lygs_mj", Constant.zzfzcdph_lygs_mj);
        }
        if (view == mZzfzcdph_lygs_zsdl) {
            String zzfzcdph_lygs_zsdl = mZzfzcdph_lygs_zsdl.getText().toString();
            Constant.zzfzcdph_lygs_zsdl = Double.parseDouble(zzfzcdph_lygs_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_lygs_zsdl", Constant.zzfzcdph_lygs_zsdl);
        }
        if (view == mZzfzcdph_clgs_sdl) {
            String zzfzcdph_clgs_sdl = mZzfzcdph_clgs_sdl.getText().toString();
            Constant.clgs = Double.parseDouble(zzfzcdph_clgs_sdl);
            SpUtil.saveSP(getContext(), "clgs", Constant.clgs);
        }
        if (view == mZzfzcdph_clgs_jshns) {
            String zzfzcdph_clgs_jshns = mZzfzcdph_clgs_jshns.getText().toString();
            Constant.zzfzcdph_clgs_jshns = Double.parseDouble(zzfzcdph_clgs_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_clgs_jshns", Constant.zzfzcdph_clgs_jshns);
        }
        if (view == mZzfzcdph_clgs_mj) {
            String zzfzcdph_clgs_mj = mZzfzcdph_clgs_mj.getText().toString();
            Constant.zzfzcdph_clgs_mj = Double.parseDouble(zzfzcdph_clgs_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_clgs_mj", Constant.zzfzcdph_clgs_mj);
        }
        if (view == mZzfzcdph_clgs_zsdl) {
            String zzfzcdph_clgs_zsdl = mZzfzcdph_clgs_zsdl.getText().toString();
            Constant.zzfzcdph_clgs_zsdl = Double.parseDouble(zzfzcdph_clgs_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_clgs_zsdl", Constant.zzfzcdph_clgs_zsdl);
        }
        if (view == mZzfzcdph_cy_sdl) {
            String zzfzcdph_cy_sdl = mZzfzcdph_cy_sdl.getText().toString();
            Constant.cy = Double.parseDouble(zzfzcdph_cy_sdl);
            SpUtil.saveSP(getContext(), "cy", Constant.cy);
        }
        if (view == mZzfzcdph_cy_jshns) {
            String zzfzcdph_cy_jshns = mZzfzcdph_cy_jshns.getText().toString();
            Constant.zzfzcdph_cy_jshns = Double.parseDouble(zzfzcdph_cy_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_cy_jshns", Constant.zzfzcdph_cy_jshns);
        }
        if (view == mZzfzcdph_cy_mj) {
            String zzfzcdph_cy_mj = mZzfzcdph_cy_mj.getText().toString();
            Constant.zzfzcdph_cy_mj = Double.parseDouble(zzfzcdph_cy_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_cy_mj", Constant.zzfzcdph_cy_mj);
        }
        if (view == mZzfzcdph_cy_zsdl) {
            String zzfzcdph_cy_zsdl = mZzfzcdph_cy_zsdl.getText().toString();
            Constant.zzfzcdph_cy_zsdl = Double.parseDouble(zzfzcdph_cy_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_cy_zsdl", Constant.zzfzcdph_cy_zsdl);
        }
        if (view == mZzfzcdph_mc_sdl) {
            String zzfzcdph_mc_sdl = mZzfzcdph_mc_sdl.getText().toString();
            Constant.mc = Double.parseDouble(zzfzcdph_mc_sdl);
            SpUtil.saveSP(getContext(), "mc", Constant.mc);
        }
        if (view == mZzfzcdph_mc_jshns) {
            String zzfzcdph_mc_jshns = mZzfzcdph_mc_jshns.getText().toString();
            Constant.zzfzcdph_mc_jshns = Double.parseDouble(zzfzcdph_mc_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_mc_jshns", Constant.zzfzcdph_mc_jshns);
        }
        if (view == mZzfzcdph_mc_mj) {
            String zzfzcdph_mc_mj = mZzfzcdph_mc_mj.getText().toString();
            Constant.zzfzcdph_mc_mj = Double.parseDouble(zzfzcdph_mc_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_mc_mj", Constant.zzfzcdph_mc_mj);
        }
        if (view == mZzfzcdph_mc_zsdl) {
            String zzfzcdph_mc_zsdl = mZzfzcdph_mc_zsdl.getText().toString();
            Constant.zzfzcdph_mc_zsdl = Double.parseDouble(zzfzcdph_mc_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_mc_zsdl", Constant.zzfzcdph_mc_zsdl);
        }
        if (view == mZzfzcdph_hj_sdl) {
            String zzfzcdph_hj_sdl = mZzfzcdph_hj_sdl.getText().toString();
            Constant.zzfzcdph_hj_sdl = Double.parseDouble(zzfzcdph_hj_sdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_hj_sdl", Constant.zzfzcdph_hj_sdl);
        }
        if (view == mZzfzcdph_hj_jshns) {
            String zzfzcdph_hj_jshns = mZzfzcdph_hj_jshns.getText().toString();
            Constant.zzfzcdph_hj_jshns = Double.parseDouble(zzfzcdph_hj_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_hj_jshns", Constant.zzfzcdph_hj_jshns);
        }
        if (view == mZzfzcdph_hj_mj) {
            String zzfzcdph_hj_mj = mZzfzcdph_hj_mj.getText().toString();
            Constant.zzfzcdph_hj_mj = Double.parseDouble(zzfzcdph_hj_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_hj_mj", Constant.zzfzcdph_hj_mj);
        }
        if (view == mZzfzcdph_hj_zsdl) {
            String zzfzcdph_hj_zsdl = mZzfzcdph_hj_zsdl.getText().toString();
            Constant.zzfzcdph_hj_zsdl = Double.parseDouble(zzfzcdph_hj_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_hj_zsdl", Constant.zzfzcdph_hj_zsdl);
        }
        if (view == mZzfzcdph_cz_sdl) {
            String zzfzcdph_cz_sdl = mZzfzcdph_cz_sdl.getText().toString();
            Constant.zzfzcdph_cz_sdl = Double.parseDouble(zzfzcdph_cz_sdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_cz_sdl", Constant.zzfzcdph_cz_sdl);
        }
        if (view == mZzfzcdph_cz_jshns) {
            String zzfzcdph_cz_jshns = mZzfzcdph_cz_jshns.getText().toString();
            Constant.zzfzcdph_cz_jshns = Double.parseDouble(zzfzcdph_cz_jshns);
            SpUtil.saveSP(getContext(), "zzfzcdph_cz_jshns", Constant.zzfzcdph_cz_jshns);
        }
        if (view == mZzfzcdph_cz_mj) {
            String zzfzcdph_cz_mj = mZzfzcdph_cz_mj.getText().toString();
            Constant.zzfzcdph_cz_mj = Double.parseDouble(zzfzcdph_cz_mj);
            SpUtil.saveSP(getContext(), "zzfzcdph_cz_mj", Constant.zzfzcdph_cz_mj);
        }
        if (view == mZzfzcdph_cz_zsdl) {
            String zzfzcdph_cz_zsdl = mZzfzcdph_cz_zsdl.getText().toString();
            Constant.zzfzcdph_cz_zsdl = Double.parseDouble(zzfzcdph_cz_zsdl);
            SpUtil.saveSP(getContext(), "zzfzcdph_cz_zsdl", Constant.zzfzcdph_cz_zsdl);
        }
        if (view == mDnzzfzcdph_zcdl) {
            String dnzzfzcdph_zcdl = mDnzzfzcdph_zcdl.getText().toString();
            Constant.dnzzfzcdph_zcdl = Double.parseDouble(dnzzfzcdph_zcdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_zcdl", Constant.dnzzfzcdph_zcdl);
        }
        if (view == mDnzzfzcdph_sd_sdl) {
            String dnzzfzcdph_sd_sdl = mDnzzfzcdph_sd_sdl.getText().toString();
            Constant.sd = Double.parseDouble(dnzzfzcdph_sd_sdl);
            SpUtil.saveSP(getContext(), "sd", Constant.sd);
        }
        if (view == mDnzzfzcdph_sd_jshns) {
            String dnzzfzcdph_sd_jshns = mDnzzfzcdph_sd_jshns.getText().toString();
            Constant.dnzzfzcdph_sd_jshns = Double.parseDouble(dnzzfzcdph_sd_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_sd_jshns", Constant.dnzzfzcdph_sd_jshns);
        }
        if (view == mDnzzfzcdph_sd_mj) {
            String dnzzfzcdph_sd_mj = mDnzzfzcdph_sd_mj.getText().toString();
            Constant.dnzzfzcdph_sd_mj = Double.parseDouble(dnzzfzcdph_sd_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_sd_mj", Constant.dnzzfzcdph_sd_mj);
        }
        if (view == mDnzzfzcdph_sd_zsdl) {
            String dnzzfzcdph_sd_zsdl = mDnzzfzcdph_sd_zsdl.getText().toString();
            Constant.dnzzfzcdph_sd_zsdl = Double.parseDouble(dnzzfzcdph_sd_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_sd_zsdl", Constant.dnzzfzcdph_sd_zsdl);
        }
        if (view == mDnzzfzcdph_xm_sdl) {
            String dnzzfzcdph_xm_sdl = mDnzzfzcdph_xm_sdl.getText().toString();
            Constant.xm = Double.parseDouble(dnzzfzcdph_xm_sdl);
            SpUtil.saveSP(getContext(), "xm", Constant.xm);
        }
        if (view == mDnzzfzcdph_xm_jshns) {
            String dnzzfzcdph_xm_jshns = mDnzzfzcdph_xm_jshns.getText().toString();
            Constant.dnzzfzcdph_xm_jshns = Double.parseDouble(dnzzfzcdph_xm_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_xm_jshns", Constant.dnzzfzcdph_xm_jshns);
        }
        if (view == mDnzzfzcdph_xm_mj) {
            String dnzzfzcdph_xm_mj = mDnzzfzcdph_xm_mj.getText().toString();
            Constant.dnzzfzcdph_xm_mj = Double.parseDouble(dnzzfzcdph_xm_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_xm_mj", Constant.dnzzfzcdph_xm_mj);
        }
        if (view == mDnzzfzcdph_xm_zsdl) {
            String dnzzfzcdph_xm_zsdl = mDnzzfzcdph_xm_zsdl.getText().toString();
            Constant.dnzzfzcdph_xm_zsdl = Double.parseDouble(dnzzfzcdph_xm_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_xm_zsdl", Constant.dnzzfzcdph_xm_zsdl);
        }
        if (view == mDnzzfzcdph_ym_sdl) {
            String dnzzfzcdph_ym_sdl = mDnzzfzcdph_ym_sdl.getText().toString();
            Constant.ym = Double.parseDouble(dnzzfzcdph_ym_sdl);
            SpUtil.saveSP(getContext(), "ym", Constant.ym);
        }
        if (view == mDnzzfzcdph_ym_jshns) {
            String dnzzfzcdph_ym_jshns = mDnzzfzcdph_ym_jshns.getText().toString();
            Constant.dnzzfzcdph_ym_jshns = Double.parseDouble(dnzzfzcdph_ym_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_ym_jshns", Constant.dnzzfzcdph_ym_jshns);
        }
        if (view == mDnzzfzcdph_ym_mj) {
            String dnzzfzcdph_ym_mj = mDnzzfzcdph_ym_mj.getText().toString();
            Constant.dnzzfzcdph_ym_mj = Double.parseDouble(dnzzfzcdph_ym_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_ym_mj", Constant.dnzzfzcdph_ym_mj);
        }
        if (view == mDnzzfzcdph_ym_zsdl) {
            String dnzzfzcdph_ym_zsdl = mDnzzfzcdph_ym_zsdl.getText().toString();
            Constant.dnzzfzcdph_ym_zsdl = Double.parseDouble(dnzzfzcdph_ym_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_ym_zsdl", Constant.dnzzfzcdph_ym_zsdl);
        }
        if (view == mDnzzfzcdph_yc_sdl) {
            String dnzzfzcdph_yc_sdl = mDnzzfzcdph_yc_sdl.getText().toString();
            Constant.yc = Double.parseDouble(dnzzfzcdph_yc_sdl);
            SpUtil.saveSP(getContext(), "yc", Constant.yc);
        }
        if (view == mDnzzfzcdph_yc_jshns) {
            String dnzzfzcdph_yc_jshns = mDnzzfzcdph_yc_jshns.getText().toString();
            Constant.dnzzfzcdph_yc_jshns = Double.parseDouble(dnzzfzcdph_yc_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_yc_jshns", Constant.dnzzfzcdph_yc_jshns);
        }
        if (view == mDnzzfzcdph_yc_mj) {
            String dnzzfzcdph_yc_mj = mDnzzfzcdph_yc_mj.getText().toString();
            Constant.dnzzfzcdph_yc_mj = Double.parseDouble(dnzzfzcdph_yc_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_yc_mj", Constant.dnzzfzcdph_yc_mj);
        }
        if (view == mDnzzfzcdph_yc_zsdl) {
            String dnzzfzcdph_yc_zsdl = mDnzzfzcdph_yc_zsdl.getText().toString();
            Constant.dnzzfzcdph_yc_zsdl = Double.parseDouble(dnzzfzcdph_yc_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_yc_zsdl", Constant.dnzzfzcdph_yc_zsdl);
        }
        if (view == mDnzzfzcdph_gs_sdl) {
            String dnzzfzcdph_gs_sdl = mDnzzfzcdph_gs_sdl.getText().toString();
            Constant.gs = Double.parseDouble(dnzzfzcdph_gs_sdl);
            SpUtil.saveSP(getContext(), "gs", Constant.gs);
        }
        if (view == mDnzzfzcdph_gs_jshns) {
            String dnzzfzcdph_gs_jshns = mDnzzfzcdph_gs_jshns.getText().toString();
            Constant.dnzzfzcdph_gs_jshns = Double.parseDouble(dnzzfzcdph_gs_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_gs_jshns", Constant.dnzzfzcdph_gs_jshns);
        }
        if (view == mDnzzfzcdph_gs_mj) {
            String dnzzfzcdph_gs_mj = mDnzzfzcdph_gs_mj.getText().toString();
            Constant.dnzzfzcdph_gs_mj = Double.parseDouble(dnzzfzcdph_gs_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_gs_mj", Constant.dnzzfzcdph_gs_mj);
        }
        if (view == mDnzzfzcdph_gs_zsdl) {
            String dnzzfzcdph_gs_zsdl = mDnzzfzcdph_gs_zsdl.getText().toString();
            Constant.dnzzfzcdph_gs_zsdl = Double.parseDouble(dnzzfzcdph_gs_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_gs_zsdl", Constant.dnzzfzcdph_gs_zsdl);
        }
        if (view == mDnzzfzcdph_mls_sdl) {
            String dnzzfzcdph_mls_sdl = mDnzzfzcdph_mls_sdl.getText().toString();
            Constant.mls = Double.parseDouble(dnzzfzcdph_mls_sdl);
            SpUtil.saveSP(getContext(), "mls", Constant.mls);
        }
        if (view == mDnzzfzcdph_mls_jshns) {
            String dnzzfzcdph_mls_jshns = mDnzzfzcdph_mls_jshns.getText().toString();
            Constant.dnzzfzcdph_mls_jshns = Double.parseDouble(dnzzfzcdph_mls_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_mls_jshns", Constant.dnzzfzcdph_mls_jshns);
        }
        if (view == mDnzzfzcdph_mls_mj) {
            String dnzzfzcdph_mls_mj = mDnzzfzcdph_mls_mj.getText().toString();
            Constant.dnzzfzcdph_mls_mj = Double.parseDouble(dnzzfzcdph_mls_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_mls_mj", Constant.dnzzfzcdph_mls_mj);
        }
        if (view == mDnzzfzcdph_mls_zsdl) {
            String dnzzfzcdph_mls_zsdl = mDnzzfzcdph_mls_zsdl.getText().toString();
            Constant.dnzzfzcdph_mls_zsdl = Double.parseDouble(dnzzfzcdph_mls_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_mls_zsdl", Constant.dnzzfzcdph_mls_zsdl);
        }
        if (view == mDnzzfzcdph_qglsc_sdl) {
            String dnzzfzcdph_qglsc_sdl = mDnzzfzcdph_qglsc_sdl.getText().toString();
            Constant.qglsc = Double.parseDouble(dnzzfzcdph_qglsc_sdl);
            SpUtil.saveSP(getContext(), "qglsc", Constant.qglsc);
        }
        if (view == mDnzzfzcdph_qglsc_jshns) {
            String dnzzfzcdph_qglsc_jshns = mDnzzfzcdph_qglsc_jshns.getText().toString();
            Constant.dnzzfzcdph_qglsc_jshns = Double.parseDouble(dnzzfzcdph_qglsc_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_qglsc_jshns", Constant.dnzzfzcdph_qglsc_jshns);
        }
        if (view == mDnzzfzcdph_qglsc_mj) {
            String dnzzfzcdph_qglsc_mj = mDnzzfzcdph_qglsc_mj.getText().toString();
            Constant.dnzzfzcdph_qglsc_mj = Double.parseDouble(dnzzfzcdph_qglsc_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_qglsc_mj", Constant.dnzzfzcdph_qglsc_mj);
        }
        if (view == mDnzzfzcdph_qglsc_zsdl) {
            String dnzzfzcdph_qglsc_zsdl = mDnzzfzcdph_qglsc_zsdl.getText().toString();
            Constant.dnzzfzcdph_qglsc_zsdl = Double.parseDouble(dnzzfzcdph_qglsc_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_qglsc_zsdl", Constant.dnzzfzcdph_qglsc_zsdl);
        }
        if (view == mDnzzfzcdph_ggsc_sdl) {
            String dnzzfzcdph_ggsc_sdl = mDnzzfzcdph_ggsc_sdl.getText().toString();
            Constant.glsc = Double.parseDouble(dnzzfzcdph_ggsc_sdl);
            SpUtil.saveSP(getContext(), "glsc", Constant.glsc);
        }
        if (view == mDnzzfzcdph_ggsc_jshns) {
            String dnzzfzcdph_ggsc_jshns = mDnzzfzcdph_ggsc_jshns.getText().toString();
            Constant.dnzzfzcdph_ggsc_jshns = Double.parseDouble(dnzzfzcdph_ggsc_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_ggsc_jshns", Constant.dnzzfzcdph_ggsc_jshns);
        }
        if (view == mDnzzfzcdph_ggsc_mj) {
            String dnzzfzcdph_ggsc_mj = mDnzzfzcdph_ggsc_mj.getText().toString();
            Constant.dnzzfzcdph_ggsc_mj = Double.parseDouble(dnzzfzcdph_ggsc_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_ggsc_mj", Constant.dnzzfzcdph_ggsc_mj);
        }
        if (view == mDnzzfzcdph_ggsc_zsdl) {
            String dnzzfzcdph_ggsc_zsdl = mDnzzfzcdph_ggsc_zsdl.getText().toString();
            Constant.dnzzfzcdph_ggsc_zsdl = Double.parseDouble(dnzzfzcdph_ggsc_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_ggsc_zsdl", Constant.dnzzfzcdph_ggsc_zsdl);
        }
        if (view == mDnzzfzcdph_yclsc_sdl) {
            String dnzzfzcdph_yclsc_sdl = mDnzzfzcdph_yclsc_sdl.getText().toString();
            Constant.yclsc = Double.parseDouble(dnzzfzcdph_yclsc_sdl);
            SpUtil.saveSP(getContext(), "yclsc", Constant.yclsc);
        }
        if (view == mDnzzfzcdph_yclsc_jshns) {
            String dnzzfzcdph_yclsc_jshns = mDnzzfzcdph_yclsc_jshns.getText().toString();
            Constant.dnzzfzcdph_yclsc_jshns = Double.parseDouble(dnzzfzcdph_yclsc_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_yclsc_jshns", Constant.dnzzfzcdph_yclsc_jshns);
        }
        if (view == mDnzzfzcdph_yclsc_mj) {
            String dnzzfzcdph_yclsc_mj = mDnzzfzcdph_yclsc_mj.getText().toString();
            Constant.dnzzfzcdph_yclsc_mj = Double.parseDouble(dnzzfzcdph_yclsc_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_yclsc_mj", Constant.dnzzfzcdph_yclsc_mj);
        }
        if (view == mDnzzfzcdph_yclsc_zsdl) {
            String dnzzfzcdph_yclsc_zsdl = mDnzzfzcdph_yclsc_zsdl.getText().toString();
            Constant.dnzzfzcdph_yclsc_zsdl = Double.parseDouble(dnzzfzcdph_yclsc_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_yclsc_zsdl", Constant.dnzzfzcdph_yclsc_zsdl);
        }
        if (view == mDnzzfzcdph_gclsc_sdl) {
            String dnzzfzcdph_gclsc_sdl = mDnzzfzcdph_gclsc_sdl.getText().toString();
            Constant.gclsc = Double.parseDouble(dnzzfzcdph_gclsc_sdl);
            SpUtil.saveSP(getContext(), "gclsc", Constant.gclsc);
        }
        if (view == mDnzzfzcdph_gclsc_jshns) {
            String dnzzfzcdph_gclsc_jshns = mDnzzfzcdph_gclsc_jshns.getText().toString();
            Constant.dnzzfzcdph_gclsc_jshns = Double.parseDouble(dnzzfzcdph_gclsc_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_gclsc_jshns", Constant.dnzzfzcdph_gclsc_jshns);
        }
        if (view == mDnzzfzcdph_gclsc_mj) {
            String dnzzfzcdph_gclsc_mj = mDnzzfzcdph_gclsc_mj.getText().toString();
            Constant.dnzzfzcdph_gclsc_mj = Double.parseDouble(dnzzfzcdph_gclsc_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_gclsc_mj", Constant.dnzzfzcdph_gclsc_mj);
        }
        if (view == mDnzzfzcdph_gclsc_zsdl) {
            String dnzzfzcdph_gclsc_zsdl = mDnzzfzcdph_gclsc_zsdl.getText().toString();
            Constant.dnzzfzcdph_gclsc_zsdl = Double.parseDouble(dnzzfzcdph_gclsc_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_gclsc_zsdl", Constant.dnzzfzcdph_gclsc_zsdl);
        }
        if (view == mDnzzfzcdph_dlsc_sdl) {
            String dnzzfzcdph_dlsc_sdl = mDnzzfzcdph_dlsc_sdl.getText().toString();
            Constant.dlsc = Double.parseDouble(dnzzfzcdph_dlsc_sdl);
            SpUtil.saveSP(getContext(), "dlsc", Constant.dlsc);
        }
        if (view == mDnzzfzcdph_dlsc_jshns) {
            String dnzzfzcdph_dlsc_jshns = mDnzzfzcdph_dlsc_jshns.getText().toString();
            Constant.dnzzfzcdph_dlsc_jshns = Double.parseDouble(dnzzfzcdph_dlsc_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_dlsc_jshns", Constant.dnzzfzcdph_dlsc_jshns);
        }
        if (view == mDnzzfzcdph_dlsc_mj) {
            String dnzzfzcdph_dlsc_mj = mDnzzfzcdph_dlsc_mj.getText().toString();
            Constant.dnzzfzcdph_dlsc_mj = Double.parseDouble(dnzzfzcdph_dlsc_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_dlsc_mj", Constant.dnzzfzcdph_dlsc_mj);
        }
        if (view == mDnzzfzcdph_dlsc_zsdl) {
            String dnzzfzcdph_dlsc_zsdl = mDnzzfzcdph_dlsc_zsdl.getText().toString();
            Constant.dnzzfzcdph_dlsc_zsdl = Double.parseDouble(dnzzfzcdph_dlsc_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_dlsc_zsdl", Constant.dnzzfzcdph_dlsc_zsdl);
        }
        if (view == mDnzzfzcdph_cslsc_sdl) {
            String dnzzfzcdph_cslsc_sdl = mDnzzfzcdph_cslsc_sdl.getText().toString();
            Constant.cslsc = Double.parseDouble(dnzzfzcdph_cslsc_sdl);
            SpUtil.saveSP(getContext(), "cslsc", Constant.cslsc);
        }
        if (view == mDnzzfzcdph_cslsc_jshns) {
            String dnzzfzcdph_cslsc_jshns = mDnzzfzcdph_cslsc_jshns.getText().toString();
            Constant.dnzzfzcdph_cslsc_jshns = Double.parseDouble(dnzzfzcdph_cslsc_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cslsc_jshns", Constant.dnzzfzcdph_cslsc_jshns);
        }
        if (view == mDnzzfzcdph_cslsc_mj) {
            String dnzzfzcdph_cslsc_mj = mDnzzfzcdph_cslsc_mj.getText().toString();
            Constant.dnzzfzcdph_cslsc_mj = Double.parseDouble(dnzzfzcdph_cslsc_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cslsc_mj", Constant.dnzzfzcdph_cslsc_mj);
        }
        if (view == mDnzzfzcdph_cslsc_zsdl) {
            String dnzzfzcdph_cslsc_zsdl = mDnzzfzcdph_cslsc_zsdl.getText().toString();
            Constant.dnzzfzcdph_cslsc_zsdl = Double.parseDouble(dnzzfzcdph_cslsc_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cslsc_zsdl", Constant.dnzzfzcdph_cslsc_zsdl);
        }
        if (view == mDnzzfzcdph_lygs_sdl) {
            String dnzzfzcdph_lygs_sdl = mDnzzfzcdph_lygs_sdl.getText().toString();
            Constant.lygs = Double.parseDouble(dnzzfzcdph_lygs_sdl);
            SpUtil.saveSP(getContext(), "lygs", Constant.lygs);
        }
        if (view == mDnzzfzcdph_lygs_jshns) {
            String dnzzfzcdph_lygs_jshns = mDnzzfzcdph_lygs_jshns.getText().toString();
            Constant.dnzzfzcdph_lygs_jshns = Double.parseDouble(dnzzfzcdph_lygs_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_lygs_jshns", Constant.dnzzfzcdph_lygs_jshns);
        }
        if (view == mDnzzfzcdph_lygs_mj) {
            String dnzzfzcdph_lygs_mj = mDnzzfzcdph_lygs_mj.getText().toString();
            Constant.dnzzfzcdph_lygs_mj = Double.parseDouble(dnzzfzcdph_lygs_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_lygs_mj", Constant.dnzzfzcdph_lygs_mj);
        }
        if (view == mDnzzfzcdph_lygs_zsdl) {
            String dnzzfzcdph_lygs_zsdl = mDnzzfzcdph_lygs_zsdl.getText().toString();
            Constant.dnzzfzcdph_lygs_zsdl = Double.parseDouble(dnzzfzcdph_lygs_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_lygs_zsdl", Constant.dnzzfzcdph_lygs_zsdl);
        }
        if (view == mDnzzfzcdph_clgs_sdl) {
            String dnzzfzcdph_clgs_sdl = mDnzzfzcdph_clgs_sdl.getText().toString();
            Constant.clgs = Double.parseDouble(dnzzfzcdph_clgs_sdl);
            SpUtil.saveSP(getContext(), "clgs", Constant.clgs);
        }
        if (view == mDnzzfzcdph_clgs_jshns) {
            String dnzzfzcdph_clgs_jshns = mDnzzfzcdph_clgs_jshns.getText().toString();
            Constant.dnzzfzcdph_clgs_jshns = Double.parseDouble(dnzzfzcdph_clgs_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_clgs_jshns", Constant.dnzzfzcdph_clgs_jshns);
        }
        if (view == mDnzzfzcdph_clgs_mj) {
            String dnzzfzcdph_clgs_mj = mDnzzfzcdph_clgs_mj.getText().toString();
            Constant.dnzzfzcdph_clgs_mj = Double.parseDouble(dnzzfzcdph_clgs_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_clgs_mj", Constant.dnzzfzcdph_clgs_mj);
        }
        if (view == mDnzzfzcdph_clgs_zsdl) {
            String dnzzfzcdph_clgs_zsdl = mDnzzfzcdph_clgs_zsdl.getText().toString();
            Constant.dnzzfzcdph_clgs_zsdl = Double.parseDouble(dnzzfzcdph_clgs_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_clgs_zsdl", Constant.dnzzfzcdph_clgs_zsdl);
        }
        if (view == mDnzzfzcdph_cy_sdl) {
            String dnzzfzcdph_cy_sdl = mDnzzfzcdph_cy_sdl.getText().toString();
            Constant.cy = Double.parseDouble(dnzzfzcdph_cy_sdl);
            SpUtil.saveSP(getContext(), "cy", Constant.cy);
        }
        if (view == mDnzzfzcdph_cy_jshns) {
            String dnzzfzcdph_cy_jshns = mDnzzfzcdph_cy_jshns.getText().toString();
            Constant.dnzzfzcdph_cy_jshns = Double.parseDouble(dnzzfzcdph_cy_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cy_jshns", Constant.dnzzfzcdph_cy_jshns);
        }
        if (view == mDnzzfzcdph_cy_mj) {
            String dnzzfzcdph_cy_mj = mDnzzfzcdph_cy_mj.getText().toString();
            Constant.dnzzfzcdph_cy_mj = Double.parseDouble(dnzzfzcdph_cy_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cy_mj", Constant.dnzzfzcdph_cy_mj);
        }
        if (view == mDnzzfzcdph_cy_zsdl) {
            String dnzzfzcdph_cy_zsdl = mDnzzfzcdph_cy_zsdl.getText().toString();
            Constant.dnzzfzcdph_cy_zsdl = Double.parseDouble(dnzzfzcdph_cy_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cy_zsdl", Constant.dnzzfzcdph_cy_zsdl);
        }
        if (view == mDnzzfzcdph_mc_sdl) {
            String dnzzfzcdph_mc_sdl = mDnzzfzcdph_mc_sdl.getText().toString();
            Constant.mc = Double.parseDouble(dnzzfzcdph_mc_sdl);
            SpUtil.saveSP(getContext(), "mc", Constant.mc);
        }
        if (view == mDnzzfzcdph_mc_jshns) {
            String dnzzfzcdph_mc_jshns = mDnzzfzcdph_mc_jshns.getText().toString();
            Constant.dnzzfzcdph_mc_jshns = Double.parseDouble(dnzzfzcdph_mc_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_mc_jshns", Constant.dnzzfzcdph_mc_jshns);
        }
        if (view == mDnzzfzcdph_mc_mj) {
            String dnzzfzcdph_mc_mj = mDnzzfzcdph_mc_mj.getText().toString();
            Constant.dnzzfzcdph_mc_mj = Double.parseDouble(dnzzfzcdph_mc_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_mc_mj", Constant.dnzzfzcdph_mc_mj);
        }
        if (view == mDnzzfzcdph_mc_zsdl) {
            String dnzzfzcdph_mc_zsdl = mDnzzfzcdph_mc_zsdl.getText().toString();
            Constant.dnzzfzcdph_mc_zsdl = Double.parseDouble(dnzzfzcdph_mc_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_mc_zsdl", Constant.dnzzfzcdph_mc_zsdl);
        }
        if (view == mDnzzfzcdph_hj_sdl) {
            String dnzzfzcdph_hj_sdl = mDnzzfzcdph_hj_sdl.getText().toString();
            Constant.dnzzfzcdph_hj_sdl = Double.parseDouble(dnzzfzcdph_hj_sdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_hj_sdl", Constant.dnzzfzcdph_hj_sdl);
        }
        if (view == mDnzzfzcdph_hj_jshns) {
            String dnzzfzcdph_hj_jshns = mDnzzfzcdph_hj_jshns.getText().toString();
            Constant.dnzzfzcdph_hj_jshns = Double.parseDouble(dnzzfzcdph_hj_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_hj_jshns", Constant.dnzzfzcdph_hj_jshns);
        }
        if (view == mDnzzfzcdph_hj_mj) {
            String dnzzfzcdph_hj_mj = mDnzzfzcdph_hj_mj.getText().toString();
            Constant.dnzzfzcdph_hj_mj = Double.parseDouble(dnzzfzcdph_hj_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_hj_mj", Constant.dnzzfzcdph_hj_mj);
        }
        if (view == mDnzzfzcdph_hj_zsdl) {
            String dnzzfzcdph_hj_zsdl = mDnzzfzcdph_hj_zsdl.getText().toString();
            Constant.dnzzfzcdph_hj_zsdl = Double.parseDouble(dnzzfzcdph_hj_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_hj_zsdl", Constant.dnzzfzcdph_hj_zsdl);
        }
        if (view == mDnzzfzcdph_cz_sdl) {
            String dnzzfzcdph_cz_sdl = mDnzzfzcdph_cz_sdl.getText().toString();
            Constant.dnzzfzcdph_cz_sdl = Double.parseDouble(dnzzfzcdph_cz_sdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cz_sdl", Constant.dnzzfzcdph_cz_sdl);
        }
        if (view == mDnzzfzcdph_cz_jshns) {
            String dnzzfzcdph_cz_jshns = mDnzzfzcdph_cz_jshns.getText().toString();
            Constant.dnzzfzcdph_cz_jshns = Double.parseDouble(dnzzfzcdph_cz_jshns);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cz_jshns", Constant.dnzzfzcdph_cz_jshns);
        }
        if (view == mDnzzfzcdph_cz_mj) {
            String dnzzfzcdph_cz_mj = mDnzzfzcdph_cz_mj.getText().toString();
            Constant.dnzzfzcdph_cz_mj = Double.parseDouble(dnzzfzcdph_cz_mj);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cz_mj", Constant.dnzzfzcdph_cz_mj);
        }
        if (view == mDnzzfzcdph_cz_zsdl) {
            String dnzzfzcdph_cz_zsdl = mDnzzfzcdph_cz_zsdl.getText().toString();
            Constant.dnzzfzcdph_cz_zsdl = Double.parseDouble(dnzzfzcdph_cz_zsdl);
            SpUtil.saveSP(getContext(), "dnzzfzcdph_cz_zsdl", Constant.dnzzfzcdph_cz_zsdl);
        }




    }

    @Override
    public void jsDatas() {
        try {

            Constant.zfzycnph_zcdl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_flhj + Constant.zfzyc_hbmz_gye * Constant.hbmz_flhj +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_flhj + Constant.zfzyc_rcmz_gye * Constant.rcmz_flhj + Constant.zfzyc_prmz_gye * Constant.prmz_flhj +
                    Constant.zfzyc_byzz_gye * Constant.byzz_flhj + Constant.zfzyc_szyfz_gye * Constant.szyfz_flhj) * 365, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_zcdl", Constant.zfzycnph_zcdl);
            Constant.zzfzcdph_zcdl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_flhj + Constant.zfzyc_hbmz_gye * Constant.hbmz_flhj +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_flhj + Constant.zfzyc_rcmz_gye * Constant.rcmz_flhj + Constant.zfzyc_prmz_gye * Constant.prmz_flhj +
                    Constant.zfzyc_byzz_gye * Constant.byzz_flhj) * 365, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_zcdl", Constant.zzfzcdph_zcdl);

            Constant.dnzzfzcdph_zcdl = Utils.keep2Wdouble((Constant.zfzyc_gzslzrjp_gye * Constant.qnjcngz_flhj + Constant.zfzyc_hbmz_gye * Constant.hbmz_flhj +
                    Constant.zfzyc_pzrcmz_gye * Constant.pzrjmz_flhj + Constant.zfzyc_rcmz_gye * Constant.rcmz_flhj + Constant.zfzyc_prmz_gye * Constant.prmz_flhj) * 365, 0);
            //SpUtil.saveSP(getContext(), "dnzzfzcdph_zcdl", Constant.dnzzfzcdph_zcdl);

            Constant.zfzycnph_sd_zsdl = Utils.keep2Wdouble(Constant.sd * Constant.zfzycnph_sd_mj* Constant.zfzycnph_sd_jshns* Constant.zfzyc_sd_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_sd_zsdl", Constant.zfzycnph_sd_zsdl);

            Constant.zfzycnph_xm_zsdl = Utils.keep2Wdouble(Constant.xm * Constant.zfzycnph_xm_mj* Constant.zfzycnph_xm_jshns* Constant.zfzyc_xm_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_xm_zsdl", Constant.zfzycnph_xm_zsdl);

            Constant.zfzycnph_ym_zsdl = Utils.keep2Wdouble(Constant.ym * Constant.zfzycnph_ym_mj* Constant.zfzycnph_ym_jshns* Constant.zfzyc_ym_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_ym_zsdl", Constant.zfzycnph_ym_zsdl);

            Constant.zfzycnph_yc_zsdl = Utils.keep2Wdouble(Constant.yc * Constant.zfzycnph_yc_mj* Constant.zfzycnph_yc_jshns* Constant.zfzyc_yc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_yc_zsdl", Constant.zfzycnph_yc_zsdl);

            Constant.zfzycnph_gs_zsdl = Utils.keep2Wdouble(Constant.gs * Constant.zfzycnph_gs_mj* Constant.zfzycnph_gs_jshns* Constant.zfzyc_gs_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_gs_zsdl", Constant.zfzycnph_gs_zsdl);

            Constant.zfzycnph_mls_zsdl = Utils.keep2Wdouble(Constant.mls * Constant.zfzycnph_mls_mj* Constant.zfzycnph_mls_jshns* Constant.zfzyc_mls_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_mls_zsdl", Constant.zfzycnph_mls_zsdl);

            Constant.zfzycnph_qglsc_zsdl = Utils.keep2Wdouble(Constant.qglsc * Constant.zfzycnph_qglsc_mj* Constant.zfzycnph_qglsc_jshns* Constant.zfzyc_qglsc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_qglsc_zsdl", Constant.zfzycnph_qglsc_zsdl);

            Constant.zfzycnph_ggsc_zsdl = Utils.keep2Wdouble(Constant.glsc * Constant.zfzycnph_ggsc_mj* Constant.zfzycnph_ggsc_jshns* Constant.zfzyc_ggsc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_ggsc_zsdl", Constant.zfzycnph_ggsc_zsdl);

            Constant.zfzycnph_yclsc_zsdl = Utils.keep2Wdouble(Constant.yclsc * Constant.zfzycnph_yclsc_mj* Constant.zfzycnph_yclsc_jshns* Constant.zfzyc_yclsc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_yclsc_zsdl", Constant.zfzycnph_yclsc_zsdl);

            Constant.zfzycnph_gclsc_zsdl = Utils.keep2Wdouble(Constant.gclsc * Constant.zfzycnph_gclsc_mj* Constant.zfzycnph_gclsc_jshns* Constant.zfzyc_gclsc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_gclsc_zsdl", Constant.zfzycnph_gclsc_zsdl);

            Constant.zfzycnph_dlsc_zsdl = Utils.keep2Wdouble(Constant.dlsc * Constant.zfzycnph_dlsc_mj* Constant.zfzycnph_dlsc_jshns* Constant.zfzyc_dlsc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_dlsc_zsdl", Constant.zfzycnph_dlsc_zsdl);

            Constant.zfzycnph_cslsc_zsdl = Utils.keep2Wdouble(Constant.cslsc * Constant.zfzycnph_cslsc_mj* Constant.zfzycnph_cslsc_jshns* Constant.zfzyc_cslgs_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_cslsc_zsdl", Constant.zfzycnph_cslsc_zsdl);

            Constant.zfzycnph_lygs_zsdl = Utils.keep2Wdouble(Constant.lygs * Constant.zfzycnph_lygs_mj* Constant.zfzycnph_lygs_jshns* Constant.zfzyc_lygs_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_lygs_zsdl", Constant.zfzycnph_lygs_zsdl);

            Constant.zfzycnph_clgs_zsdl = Utils.keep2Wdouble(Constant.clgs * Constant.zfzycnph_clgs_mj* Constant.zfzycnph_clgs_jshns* Constant.zfzyc_clgs_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_clgs_zsdl", Constant.zfzycnph_clgs_zsdl);

            Constant.zfzycnph_cy_zsdl = Utils.keep2Wdouble(Constant.cy * Constant.zfzycnph_cy_mj* Constant.zfzycnph_cy_jshns* Constant.zfzyc_cy_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_cy_zsdl", Constant.zfzycnph_cy_zsdl);

            Constant.zfzycnph_mc_zsdl = Utils.keep2Wdouble(Constant.mc * Constant.zfzycnph_mc_mj* Constant.zfzycnph_mc_jshns* Constant.zfzyc_mc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_mc_zsdl", Constant.zfzycnph_mc_zsdl);

            Constant.zfzycnph_hj_zsdl = Utils.keep2Wdouble(Constant.zfzycnph_sd_zsdl + Constant.zfzycnph_xm_zsdl + Constant.zfzycnph_ym_zsdl + Constant.zfzycnph_yc_zsdl +
                    Constant.zfzycnph_gs_zsdl + Constant.zfzycnph_mls_zsdl + Constant.zfzycnph_qglsc_zsdl + Constant.zfzycnph_ggsc_zsdl +
                    Constant.zfzycnph_yclsc_zsdl + Constant.zfzycnph_gclsc_zsdl + Constant.zfzycnph_dlsc_zsdl + Constant.zfzycnph_cslsc_zsdl +
                    Constant.zfzycnph_lygs_zsdl + Constant.zfzycnph_clgs_zsdl + Constant.zfzycnph_cy_zsdl + Constant.zfzycnph_mc_zsdl, 0);
            //SpUtil.saveSP(getContext(), "zfzycnph_hj_zsdl", Constant.zfzycnph_hj_zsdl);

            Constant.zfzycnph_cz_zsdl = Utils.keep2Wdouble(Constant.zfzycnph_zcdl - Constant.zfzycnph_hj_zsdl, 0);
           // SpUtil.saveSP(getContext(), "zfzycnph_cz_zsdl", Constant.zfzycnph_cz_zsdl);

            Constant.zzfzcdph_sd_zsdl = Utils.keep2Wdouble(Constant.sd * Constant.zzfzcdph_sd_mj* Constant.zzfzcdph_sd_jshns* Constant.byzzfzc_sd_bfb, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_sd_zsdl", Constant.zzfzcdph_sd_zsdl);

            Constant.zzfzcdph_xm_zsdl = Utils.keep2Wdouble(Constant.xm * Constant.zzfzcdph_xm_mj* Constant.zzfzcdph_xm_jshns* Constant.byzzfzc_xm_bfb, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_xm_zsdl", Constant.zzfzcdph_xm_zsdl);

            Constant.zzfzcdph_ym_zsdl = Utils.keep2Wdouble(Constant.ym * Constant.zzfzcdph_ym_mj* Constant.zzfzcdph_ym_jshns* Constant.byzzfzc_ym_bfb, 0);
           // SpUtil.saveSP(getContext(), "zzfzcdph_ym_zsdl", Constant.zzfzcdph_ym_zsdl);

            Constant.zzfzcdph_yc_zsdl = Utils.keep2Wdouble(Constant.yc * Constant.zzfzcdph_yc_mj* Constant.zzfzcdph_yc_jshns* Constant.byzzfzc_yc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_yc_zsdl", Constant.zzfzcdph_yc_zsdl);

            Constant.zzfzcdph_gs_zsdl = Utils.keep2Wdouble(Constant.gs * Constant.zzfzcdph_gs_mj* Constant.zzfzcdph_gs_jshns* Constant.byzzfzc_gs_bfb, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_gs_zsdl", Constant.zzfzcdph_gs_zsdl);

            Constant.zzfzcdph_mls_zsdl = Utils.keep2Wdouble(Constant.mls * Constant.zzfzcdph_mls_mj* Constant.zzfzcdph_mls_jshns* Constant.byzzfzc_mls_bfb, 0);
           // SpUtil.saveSP(getContext(), "zzfzcdph_mls_zsdl", Constant.zzfzcdph_mls_zsdl);

            Constant.zzfzcdph_qglsc_zsdl = Utils.keep2Wdouble(Constant.qglsc * Constant.zzfzcdph_qglsc_mj* Constant.zzfzcdph_qglsc_jshns* Constant.byzzfzc_qglsc_bfb, 0);
           // SpUtil.saveSP(getContext(), "zzfzcdph_qglsc_zsdl", Constant.zzfzcdph_qglsc_zsdl);

            Constant.zzfzcdph_ggsc_zsdl = Utils.keep2Wdouble(Constant.glsc * Constant.zzfzcdph_ggsc_mj* Constant.zzfzcdph_ggsc_jshns* Constant.byzzfzc_ggsc_bfb, 0);
          //  SpUtil.saveSP(getContext(), "zzfzcdph_ggsc_zsdl", Constant.zzfzcdph_ggsc_zsdl);

            Constant.zzfzcdph_yclsc_zsdl = Utils.keep2Wdouble(Constant.yclsc * Constant.zzfzcdph_yclsc_mj* Constant.zzfzcdph_yclsc_jshns* Constant.byzzfzc_yclsc_bfb, 0);
           // SpUtil.saveSP(getContext(), "zzfzcdph_yclsc_zsdl", Constant.zzfzcdph_yclsc_zsdl);

            Constant.zzfzcdph_gclsc_zsdl = Utils.keep2Wdouble(Constant.gclsc * Constant.zzfzcdph_gclsc_mj* Constant.zzfzcdph_gclsc_jshns* Constant.byzzfzc_gclsc_bfb, 0);
           // SpUtil.saveSP(getContext(), "zzfzcdph_gclsc_zsdl", Constant.zzfzcdph_gclsc_zsdl);

            Constant.zzfzcdph_dlsc_zsdl = Utils.keep2Wdouble(Constant.dlsc * Constant.zzfzcdph_dlsc_mj* Constant.zzfzcdph_dlsc_jshns* Constant.byzzfzc_dlsc_bfb, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_dlsc_zsdl", Constant.zzfzcdph_dlsc_zsdl);

            Constant.zzfzcdph_cslsc_zsdl = Utils.keep2Wdouble(Constant.cslsc * Constant.zzfzcdph_cslsc_mj* Constant.zzfzcdph_cslsc_jshns* Constant.byzzfzc_cslgs_bfb, 0);
           // SpUtil.saveSP(getContext(), "zzfzcdph_cslsc_zsdl", Constant.zzfzcdph_cslsc_zsdl);

            Constant.zzfzcdph_lygs_zsdl = Utils.keep2Wdouble(Constant.lygs * Constant.zzfzcdph_lygs_mj* Constant.zzfzcdph_lygs_jshns* Constant.byzzfzc_lygs_bfb, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_lygs_zsdl", Constant.zzfzcdph_lygs_zsdl);

            Constant.zzfzcdph_clgs_zsdl = Utils.keep2Wdouble(Constant.clgs * Constant.zzfzcdph_clgs_mj* Constant.zzfzcdph_clgs_jshns* Constant.byzzfzc_clgs_bfb, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_clgs_zsdl", Constant.zzfzcdph_clgs_zsdl);

            Constant.zzfzcdph_cy_zsdl = Utils.keep2Wdouble(Constant.cy * Constant.zzfzcdph_cy_mj* Constant.zzfzcdph_cy_jshns* Constant.byzzfzc_cy_bfb, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_cy_zsdl", Constant.zzfzcdph_cy_zsdl);

            Constant.zzfzcdph_mc_zsdl = Utils.keep2Wdouble(Constant.mc * Constant.zzfzcdph_mc_mj* Constant.zzfzcdph_mc_jshns* Constant.byzzfzc_mc_bfb, 0);
           // SpUtil.saveSP(getContext(), "zzfzcdph_mc_zsdl", Constant.zzfzcdph_mc_zsdl);

            Constant.zzfzcdph_hj_zsdl = Utils.keep2Wdouble(Constant.zzfzcdph_sd_zsdl + Constant.zzfzcdph_xm_zsdl + Constant.zzfzcdph_ym_zsdl + Constant.zzfzcdph_yc_zsdl +
                    Constant.zzfzcdph_gs_zsdl + Constant.zzfzcdph_mls_zsdl + Constant.zzfzcdph_qglsc_zsdl + Constant.zzfzcdph_ggsc_zsdl +
                    Constant.zzfzcdph_yclsc_zsdl + Constant.zzfzcdph_gclsc_zsdl + Constant.zzfzcdph_dlsc_zsdl + Constant.zzfzcdph_cslsc_zsdl +
                    Constant.zzfzcdph_lygs_zsdl + Constant.zzfzcdph_clgs_zsdl + Constant.zzfzcdph_cy_zsdl + Constant.zzfzcdph_mc_zsdl, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_hj_zsdl", Constant.zzfzcdph_hj_zsdl);

            Constant.zzfzcdph_cz_zsdl = Utils.keep2Wdouble(Constant.zzfzcdph_zcdl - Constant.zzfzcdph_hj_zsdl, 0);
            //SpUtil.saveSP(getContext(), "zzfzcdph_cz_zsdl", Constant.zzfzcdph_cz_zsdl);

            Constant.dnzzfzcdph_sd_zsdl = Utils.keep2Wdouble(Constant.sd * Constant.dnzzfzcdph_sd_mj* Constant.dnzzfzcdph_sd_jshns* Constant.dnzzfzc_sd_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_sd_zsdl", Constant.dnzzfzcdph_sd_zsdl);

            Constant.dnzzfzcdph_xm_zsdl = Utils.keep2Wdouble(Constant.xm * Constant.dnzzfzcdph_xm_mj* Constant.dnzzfzcdph_xm_jshns* Constant.dnzzfzc_xm_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_xm_zsdl", Constant.dnzzfzcdph_xm_zsdl);

            Constant.dnzzfzcdph_ym_zsdl = Utils.keep2Wdouble(Constant.ym * Constant.dnzzfzcdph_ym_mj* Constant.dnzzfzcdph_ym_jshns* Constant.dnzzfzc_ym_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_ym_zsdl", Constant.dnzzfzcdph_ym_zsdl);

            Constant.dnzzfzcdph_yc_zsdl = Utils.keep2Wdouble(Constant.yc * Constant.dnzzfzcdph_yc_mj* Constant.dnzzfzcdph_yc_jshns* Constant.dnzzfzc_yc_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_yc_zsdl", Constant.dnzzfzcdph_yc_zsdl);

            Constant.dnzzfzcdph_gs_zsdl = Utils.keep2Wdouble(Constant.gs * Constant.dnzzfzcdph_gs_mj* Constant.dnzzfzcdph_gs_jshns* Constant.dnzzfzc_gs_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_gs_zsdl", Constant.dnzzfzcdph_gs_zsdl);

            Constant.dnzzfzcdph_mls_zsdl = Utils.keep2Wdouble(Constant.mls * Constant.dnzzfzcdph_mls_mj* Constant.dnzzfzcdph_mls_jshns* Constant.dnzzfzc_mls_bfb, 0);
            //saveSP(getContext(), "dnzzfzcdph_mls_zsdl", Constant.dnzzfzcdph_mls_zsdl);

            Constant.dnzzfzcdph_qglsc_zsdl = Utils.keep2Wdouble(Constant.qglsc * Constant.dnzzfzcdph_qglsc_mj* Constant.dnzzfzcdph_qglsc_jshns* Constant.dnzzfzc_qglsc_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_qglsc_zsdl", Constant.dnzzfzcdph_qglsc_zsdl);

            Constant.dnzzfzcdph_ggsc_zsdl = Utils.keep2Wdouble(Constant.glsc * Constant.dnzzfzcdph_ggsc_mj* Constant.dnzzfzcdph_ggsc_jshns* Constant.dnzzfzc_ggsc_bfb, 0);
            //SpUtil.saveSP(getContext(), "dnzzfzcdph_ggsc_zsdl", Constant.dnzzfzcdph_ggsc_zsdl);

            Constant.dnzzfzcdph_yclsc_zsdl = Utils.keep2Wdouble(Constant.yclsc * Constant.dnzzfzcdph_yclsc_mj* Constant.dnzzfzcdph_yclsc_jshns* Constant.dnzzfzc_yclsc_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_yclsc_zsdl", Constant.dnzzfzcdph_yclsc_zsdl);

            Constant.dnzzfzcdph_gclsc_zsdl = Utils.keep2Wdouble(Constant.gclsc * Constant.dnzzfzcdph_gclsc_mj* Constant.dnzzfzcdph_gclsc_jshns* Constant.dnzzfzc_gclsc_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_gclsc_zsdl", Constant.dnzzfzcdph_gclsc_zsdl);

            Constant.dnzzfzcdph_dlsc_zsdl = Utils.keep2Wdouble(Constant.dlsc * Constant.dnzzfzcdph_dlsc_mj* Constant.dnzzfzcdph_dlsc_jshns* Constant.dnzzfzc_dlsc_bfb, 0);
            //SpUtil.saveSP(getContext(), "dnzzfzcdph_dlsc_zsdl", Constant.dnzzfzcdph_dlsc_zsdl);

            Constant.dnzzfzcdph_cslsc_zsdl = Utils.keep2Wdouble(Constant.cslsc * Constant.dnzzfzcdph_cslsc_mj* Constant.dnzzfzcdph_cslsc_jshns* Constant.dnzzfzc_cslgs_bfb, 0);
            //SpUtil.saveSP(getContext(), "dnzzfzcdph_cslsc_zsdl", Constant.dnzzfzcdph_cslsc_zsdl);

            Constant.dnzzfzcdph_lygs_zsdl = Utils.keep2Wdouble(Constant.lygs * Constant.dnzzfzcdph_lygs_mj* Constant.dnzzfzcdph_lygs_jshns* Constant.dnzzfzc_lygs_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_lygs_zsdl", Constant.dnzzfzcdph_lygs_zsdl);

            Constant.dnzzfzcdph_clgs_zsdl = Utils.keep2Wdouble(Constant.clgs * Constant.dnzzfzcdph_clgs_mj* Constant.dnzzfzcdph_clgs_jshns* Constant.dnzzfzc_clgs_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_clgs_zsdl", Constant.dnzzfzcdph_clgs_zsdl);

            Constant.dnzzfzcdph_cy_zsdl = Utils.keep2Wdouble(Constant.cy * Constant.dnzzfzcdph_cy_mj* Constant.dnzzfzcdph_cy_jshns* Constant.dnzzfzc_cy_bfb, 0);
            //SpUtil.saveSP(getContext(), "dnzzfzcdph_cy_zsdl", Constant.dnzzfzcdph_cy_zsdl);

            Constant.dnzzfzcdph_mc_zsdl = Utils.keep2Wdouble(Constant.mc * Constant.dnzzfzcdph_mc_mj* Constant.dnzzfzcdph_mc_jshns* Constant.dnzzfzc_mc_bfb, 0);
           // SpUtil.saveSP(getContext(), "dnzzfzcdph_mc_zsdl", Constant.dnzzfzcdph_mc_zsdl);

            Constant.dnzzfzcdph_hj_zsdl = Utils.keep2Wdouble(Constant.dnzzfzcdph_sd_zsdl + Constant.dnzzfzcdph_xm_zsdl + Constant.dnzzfzcdph_ym_zsdl + Constant.dnzzfzcdph_yc_zsdl +
                    Constant.dnzzfzcdph_gs_zsdl + Constant.dnzzfzcdph_mls_zsdl + Constant.dnzzfzcdph_qglsc_zsdl + Constant.dnzzfzcdph_ggsc_zsdl +
                    Constant.dnzzfzcdph_yclsc_zsdl + Constant.dnzzfzcdph_gclsc_zsdl + Constant.dnzzfzcdph_dlsc_zsdl + Constant.dnzzfzcdph_cslsc_zsdl +
                    Constant.dnzzfzcdph_lygs_zsdl + Constant.dnzzfzcdph_clgs_zsdl + Constant.dnzzfzcdph_cy_zsdl + Constant.dnzzfzcdph_mc_zsdl, 0);
            //SpUtil.saveSP(getContext(), "dnzzfzcdph_hj_zsdl", Constant.dnzzfzcdph_hj_zsdl);

            Constant.dnzzfzcdph_cz_zsdl = Utils.keep2Wdouble(Constant.dnzzfzcdph_zcdl - Constant.dnzzfzcdph_hj_zsdl, 0);
            //SpUtil.saveSP(getContext(), "dnzzfzcdph_cz_zsdl", Constant.dnzzfzcdph_cz_zsdl);

        } catch (Exception e) {
            LogUtil.e(e.getMessage());
        }

    }

    @Override
    public void refreshViews() {
        if (Constant.zfzycnph_zcdl == 0){
            Toast.makeText(getContext(),"请先设置基本参数和猪只产粪量",Toast.LENGTH_LONG).show();
            return;
        }
        mZfzycnph_zcdl.setText(Constant.zfzycnph_zcdl + "");

        mZzfzcdph_zcdl.setText(Constant.zzfzcdph_zcdl + "");

        mDnzzfzcdph_zcdl.setText(Constant.dnzzfzcdph_zcdl + "");

        mZfzycnph_sd_zsdl.setText(Constant.zfzycnph_sd_zsdl + "");

        mZfzycnph_xm_zsdl.setText(Constant.zfzycnph_xm_zsdl + "");

        mZfzycnph_ym_zsdl.setText(Constant.zfzycnph_ym_zsdl + "");

        mZfzycnph_yc_zsdl.setText(Constant.zfzycnph_yc_zsdl + "");

        mZfzycnph_gs_zsdl.setText(Constant.zfzycnph_gs_zsdl + "");

        mZfzycnph_mls_zsdl.setText(Constant.zfzycnph_mls_zsdl + "");

        mZfzycnph_qglsc_zsdl.setText(Constant.zfzycnph_qglsc_zsdl + "");

        mZfzycnph_ggsc_zsdl.setText(Constant.zfzycnph_ggsc_zsdl + "");

        mZfzycnph_yclsc_zsdl.setText(Constant.zfzycnph_yclsc_zsdl + "");

        mZfzycnph_gclsc_zsdl.setText(Constant.zfzycnph_gclsc_zsdl + "");

        mZfzycnph_dlsc_zsdl.setText(Constant.zfzycnph_dlsc_zsdl + "");

        mZfzycnph_cslsc_zsdl.setText(Constant.zfzycnph_cslsc_zsdl + "");

        mZfzycnph_lygs_zsdl.setText(Constant.zfzycnph_lygs_zsdl + "");

        mZfzycnph_clgs_zsdl.setText(Constant.zfzycnph_clgs_zsdl + "");

        mZfzycnph_cy_zsdl.setText(Constant.zfzycnph_cy_zsdl + "");

        mZfzycnph_mc_zsdl.setText(Constant.zfzycnph_mc_zsdl + "");

        mZfzycnph_hj_zsdl.setText(Constant.zfzycnph_hj_zsdl + "");

        mZfzycnph_cz_zsdl.setText(Constant.zfzycnph_cz_zsdl + "");

        mZzfzcdph_sd_zsdl.setText(Constant.zzfzcdph_sd_zsdl + "");

        mZzfzcdph_xm_zsdl.setText(Constant.zzfzcdph_xm_zsdl + "");

        mZzfzcdph_ym_zsdl.setText(Constant.zzfzcdph_ym_zsdl + "");

        mZzfzcdph_yc_zsdl.setText(Constant.zzfzcdph_yc_zsdl + "");

        mZzfzcdph_gs_zsdl.setText(Constant.zzfzcdph_gs_zsdl + "");

        mZzfzcdph_mls_zsdl.setText(Constant.zzfzcdph_mls_zsdl + "");

        mZzfzcdph_qglsc_zsdl.setText(Constant.zzfzcdph_qglsc_zsdl + "");

        mZzfzcdph_ggsc_zsdl.setText(Constant.zzfzcdph_ggsc_zsdl + "");

        mZzfzcdph_yclsc_zsdl.setText(Constant.zzfzcdph_yclsc_zsdl + "");

        mZzfzcdph_gclsc_zsdl.setText(Constant.zzfzcdph_gclsc_zsdl + "");

        mZzfzcdph_dlsc_zsdl.setText(Constant.zzfzcdph_dlsc_zsdl + "");

        mZzfzcdph_cslsc_zsdl.setText(Constant.zzfzcdph_cslsc_zsdl + "");

        mZzfzcdph_lygs_zsdl.setText(Constant.zzfzcdph_lygs_zsdl + "");

        mZzfzcdph_clgs_zsdl.setText(Constant.zzfzcdph_clgs_zsdl + "");

        mZzfzcdph_cy_zsdl.setText(Constant.zzfzcdph_cy_zsdl + "");

        mZzfzcdph_mc_zsdl.setText(Constant.zzfzcdph_mc_zsdl + "");

        mZzfzcdph_hj_zsdl.setText(Constant.zzfzcdph_hj_zsdl + "");

        mZzfzcdph_cz_zsdl.setText(Constant.zzfzcdph_cz_zsdl + "");

        mDnzzfzcdph_sd_zsdl.setText(Constant.dnzzfzcdph_sd_zsdl + "");

        mDnzzfzcdph_xm_zsdl.setText(Constant.dnzzfzcdph_xm_zsdl + "");

        mDnzzfzcdph_ym_zsdl.setText(Constant.dnzzfzcdph_ym_zsdl + "");

        mDnzzfzcdph_yc_zsdl.setText(Constant.dnzzfzcdph_yc_zsdl + "");

        mDnzzfzcdph_gs_zsdl.setText(Constant.dnzzfzcdph_gs_zsdl + "");

        mDnzzfzcdph_mls_zsdl.setText(Constant.dnzzfzcdph_mls_zsdl + "");

        mDnzzfzcdph_qglsc_zsdl.setText(Constant.dnzzfzcdph_qglsc_zsdl + "");

        mDnzzfzcdph_ggsc_zsdl.setText(Constant.dnzzfzcdph_ggsc_zsdl + "");

        mDnzzfzcdph_yclsc_zsdl.setText(Constant.dnzzfzcdph_yclsc_zsdl + "");

        mDnzzfzcdph_gclsc_zsdl.setText(Constant.dnzzfzcdph_gclsc_zsdl + "");

        mDnzzfzcdph_dlsc_zsdl.setText(Constant.dnzzfzcdph_dlsc_zsdl + "");

        mDnzzfzcdph_cslsc_zsdl.setText(Constant.dnzzfzcdph_cslsc_zsdl + "");

        mDnzzfzcdph_lygs_zsdl.setText(Constant.dnzzfzcdph_lygs_zsdl + "");

        mDnzzfzcdph_clgs_zsdl.setText(Constant.dnzzfzcdph_clgs_zsdl + "");

        mDnzzfzcdph_cy_zsdl.setText(Constant.dnzzfzcdph_cy_zsdl + "");

        mDnzzfzcdph_mc_zsdl.setText(Constant.dnzzfzcdph_mc_zsdl + "");

        mDnzzfzcdph_hj_zsdl.setText(Constant.dnzzfzcdph_hj_zsdl + "");

        mDnzzfzcdph_cz_zsdl.setText(Constant.dnzzfzcdph_cz_zsdl + "");
    }

    private double[] arr = new double[]{1,0.9,0.8,0.7,0.6,0.5,0.4,0.2,0.1};

    private boolean isFirst = true;
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        double temp = arr[position];
        if (isFirst){
           if (parent == dnzzfzc_mc_bfb){
               isFirst = false;
           }
            return;
        }
        if (parent == zfzyc_sd_bfb){
            Constant.zfzyc_sd_bfb = temp;
            //Toast.makeText(getContext(),Constant.zfzyc_sd_bfb+"-----1",Toast.LENGTH_SHORT).show();
            SpUtil.saveSP(getContext(),"zfzyc_sd_bfb",Constant.zfzyc_sd_bfb);
        }else if(parent == zfzyc_xm_bfb){
            Constant.zfzyc_xm_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_xm_bfb",Constant.zfzyc_xm_bfb);
        }else if(parent == zfzyc_ym_bfb){
            Constant.zfzyc_ym_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_ym_bfb",Constant.zfzyc_ym_bfb);
        }else if(parent == zfzyc_yc_bfb){
            Constant.zfzyc_yc_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_yc_bfb",Constant.zfzyc_yc_bfb);
        }else if(parent == zfzyc_gs_bfb){
            Constant.zfzyc_gs_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_gs_bfb",Constant.zfzyc_gs_bfb);
        }else if(parent == zfzyc_mls_bfb){
            Constant.zfzyc_mls_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_mls_bfb",Constant.zfzyc_mls_bfb);
        }else if(parent == zfzyc_jglsc_bfb){
            Constant.zfzyc_qglsc_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_qglsc_bfb",Constant.zfzyc_qglsc_bfb);
        }else if(parent == zfzyc_glsc_bfb){
            Constant.zfzyc_ggsc_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_ggsc_bfb",Constant.zfzyc_ggsc_bfb);
        }else if(parent == zfzyc_dlsc_bfb){
            Constant.zfzyc_dlsc_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_dlsc_bfb",Constant.zfzyc_dlsc_bfb);
        }else if(parent == zfzyc_cslsc_bfb){
            Constant.zfzyc_cslgs_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_cslgs_bfb",Constant.zfzyc_cslgs_bfb);
        }else if(parent == zfzyc_clgs_bfb){
            Constant.zfzyc_clgs_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_clgs_bfb",Constant.zfzyc_clgs_bfb);
        }else if(parent == zfzyc_cy_bfb){
            Constant.zfzyc_cy_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_cy_bfb",Constant.zfzyc_cy_bfb);
        }else if(parent == zfzyc_mc_bfb){
            Constant.zfzyc_mc_bfb = temp;
            SpUtil.saveSP(getContext(),"zfzyc_mc_bfb",Constant.zfzyc_mc_bfb);
        }

        if (parent == byzzfzc_sd_bfb){
            Constant.byzzfzc_sd_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_xm_bfb",Constant.byzzfzc_xm_bfb);
        }else if(parent == byzzfzc_xm_bfb){
            Constant.byzzfzc_xm_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_xm_bfb",Constant.byzzfzc_xm_bfb);
        }else if(parent == byzzfzc_ym_bfb){
            Constant.byzzfzc_ym_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_ym_bfb",Constant.byzzfzc_ym_bfb);
        }else if(parent == byzzfzc_yc_bfb){
            Constant.byzzfzc_yc_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_yc_bfb",Constant.byzzfzc_yc_bfb);
        }else if(parent == byzzfzc_gs_bfb){
            Constant.byzzfzc_gs_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_gs_bfb",Constant.byzzfzc_gs_bfb);
        }else if(parent == byzzfzc_mls_bfb){
            Constant.byzzfzc_mls_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_mls_bfb",Constant.byzzfzc_mls_bfb);
        }else if(parent == byzzfzc_jglsc_bfb){
            Constant.byzzfzc_qglsc_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_qglsc_bfb",Constant.byzzfzc_qglsc_bfb);
        }else if(parent == byzzfzc_glsc_bfb){
            Constant.byzzfzc_ggsc_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_ggsc_bfb",Constant.byzzfzc_ggsc_bfb);
        }else if(parent == byzzfzc_dlsc_bfb){
            Constant.byzzfzc_dlsc_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_dlsc_bfb",Constant.byzzfzc_dlsc_bfb);
        }else if(parent == byzzfzc_cslsc_bfb){
            Constant.byzzfzc_cslgs_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_cslgs_bfb",Constant.byzzfzc_cslgs_bfb);
        }else if(parent == byzzfzc_clgs_bfb){
            Constant.byzzfzc_clgs_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_clgs_bfb",Constant.byzzfzc_clgs_bfb);
        }else if(parent == byzzfzc_cy_bfb){
            Constant.byzzfzc_cy_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_cy_bfb",Constant.byzzfzc_cy_bfb);
        }else if(parent == byzzfzc_mc_bfb){
            Constant.byzzfzc_mc_bfb = temp;
            SpUtil.saveSP(getContext(),"byzzfzc_mc_bfb",Constant.byzzfzc_mc_bfb);
        }

        if (parent == dnzzfzc_sd_bfb){
            Constant.dnzzfzc_sd_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_xm_bfb",Constant.dnzzfzc_xm_bfb);
        }else if(parent == dnzzfzc_xm_bfb){
            Constant.dnzzfzc_xm_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_xm_bfb",Constant.dnzzfzc_xm_bfb);
        }else if(parent == dnzzfzc_ym_bfb){
            Constant.dnzzfzc_ym_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_ym_bfb",Constant.dnzzfzc_ym_bfb);
        }else if(parent == dnzzfzc_yc_bfb){
            Constant.dnzzfzc_yc_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_yc_bfb",Constant.dnzzfzc_yc_bfb);
        }else if(parent == dnzzfzc_gs_bfb){
            Constant.dnzzfzc_gs_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_gs_bfb",Constant.dnzzfzc_gs_bfb);
        }else if(parent == dnzzfzc_mls_bfb){
            Constant.dnzzfzc_mls_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_mls_bfb",Constant.dnzzfzc_mls_bfb);
        }else if(parent == dnzzfzc_jglsc_bfb){
            Constant.dnzzfzc_qglsc_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_qglsc_bfb",Constant.dnzzfzc_qglsc_bfb);
        }else if(parent == dnzzfzc_glsc_bfb){
            Constant.dnzzfzc_ggsc_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_ggsc_bfb",Constant.dnzzfzc_ggsc_bfb);
        }else if(parent == dnzzfzc_dlsc_bfb){
            Constant.dnzzfzc_dlsc_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_dlsc_bfb",Constant.dnzzfzc_dlsc_bfb);
        }else if(parent == dnzzfzc_cslsc_bfb){
            Constant.dnzzfzc_cslgs_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_cslgs_bfb",Constant.dnzzfzc_cslgs_bfb);
        }else if(parent == dnzzfzc_clgs_bfb){
            Constant.dnzzfzc_clgs_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_clgs_bfb",Constant.dnzzfzc_clgs_bfb);
        }else if(parent == dnzzfzc_cy_bfb){
            Constant.dnzzfzc_cy_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_cy_bfb",Constant.dnzzfzc_cy_bfb);
        }else if(parent == dnzzfzc_mc_bfb){
            Constant.dnzzfzc_mc_bfb = temp;
            SpUtil.saveSP(getContext(),"dnzzfzc_mc_bfb",Constant.dnzzfzc_mc_bfb);
        }


        jsDatas();
        refreshViews();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
