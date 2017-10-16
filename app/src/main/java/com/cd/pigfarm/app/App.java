package com.cd.pigfarm.app;

import android.app.Application;
import android.content.Context;


import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.sql.SqlOpenHelper;
import com.cd.pigfarm.util.LogUtil;
import com.cd.pigfarm.util.SpUtil;
import com.cd.pigfarm.util.Utils;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/4/5 20:46
 * @Description: 全局类
 */
public class App extends Application {

    public static SqlOpenHelper sqlOpenHelper;

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        sqlOpenHelper = new SqlOpenHelper(this);

        context = getApplicationContext();
        //初始化数据
        initData();
    }

    /**
     * 初始化数据，从sp里面去数据出来给Constant里面的变量赋值
     */
    public void initData() {
        Constant.clmzz = SpUtil.getSpLong(this, "clmzz", 1000);
        //************************************育肥场*************************************************************
        Constant.clspzs = SpUtil.getSpLong(this, "clspzs", 500);
        Constant.mlsyspzs = SpUtil.getSpDouble(this, "mlsyspzs", 10);
        Constant.spzyfl = SpUtil.getSpDouble(this, "spzyfl", 100);


        //*********************************基本参数********************************************************


        Constant.gwzcql = SpUtil.getSpDouble(this, "gwzcql", 0.3);

        Constant.zqccrcql = SpUtil.getSpDouble(this, "zqccrcql", 0.2);


        Constant.dnzzfzc_gqfbl = SpUtil.getSpDouble(this, "dnzzfzc_gqfbl", 0.7);
        Constant.zzfzc_gqfbl = SpUtil.getSpDouble(this, "zzfzc_gqfbl", 0.7);
        Constant.zfzyc_gqfbl = SpUtil.getSpDouble(this, "zfzyc_gqfbl", 0.7);


        Constant.dnzpzjg = SpUtil.getSpDouble(this, "dnzpzjg", 10);

        Constant.rcjc = SpUtil.getSpDouble(this, "rcjc", 32);

        Constant.mzrcq = SpUtil.getSpDouble(this, "mzrcq", 114);

        Constant.mzphl = SpUtil.getSpDouble(this, "mzphl", 0.87);

        Constant.rcmzfwl = SpUtil.getSpDouble(this, "rcmzfwl", 0.98);

        Constant.mzstfwl = SpUtil.getSpDouble(this, "mzstfwl", 0.8526);

        Constant.dnrl = SpUtil.getSpDouble(this, "dnrl", 21);

        Constant.mzncws = SpUtil.getSpDouble(this, "mzncws", 2.15);

        Constant.byq = SpUtil.getSpDouble(this, "byq", 49);

        Constant.szyfq = SpUtil.getSpDouble(this, "szyfq", 105);

        Constant.mzwchzs = SpUtil.getSpDouble(this, "mzwchzs", 10.5);

        Constant.prqchl = SpUtil.getSpDouble(this, "prqchl", 0.9);

        Constant.byqchl = SpUtil.getSpDouble(this, "byqchl", 0.95);

        Constant.szyfqchl = SpUtil.getSpDouble(this, "szyfqchl", 0.98);

        Constant.ntgyczzs = SpUtil.getSpDouble(this, "ntgyczzs", 19.3);

        Constant.ntgspzs = SpUtil.getSpDouble(this, "ntgspzs", 18.9);

        Constant.zznttgxl = SpUtil.getSpDouble(this, "zznttgxl", 0.25);

        Constant.hbzpypc = SpUtil.getSpDouble(this, "hbzpypc", 2);

        Constant.fyjl = SpUtil.getSpDouble(this, "fyjl", 7);

        Constant.mzncts = SpUtil.getSpDouble(this, "mzncts", 2.5);

        Constant.mzcpmzs = SpUtil.getSpDouble(this, "mzcpmzs", 54);

        Constant.mzrcmzs = SpUtil.getSpDouble(this, "mzrcmzs", 42);

        Constant.mzczmzs = SpUtil.getSpDouble(this, "mzczmzs", 41);

        Constant.mzbyws = SpUtil.getSpDouble(this, "mzbyws", 41);

        Constant.mzyfws = SpUtil.getSpDouble(this, "mzyfws", 41);

        Constant.zlkzxdts = SpUtil.getSpDouble(this, "zlkzxdts", 7);

        //*************************************猪只饮水参数***********************************************//
        Constant.zzys_qnjcngz_zx = SpUtil.getSpDouble(this, "zzys_qnjcngz_zx", 15);

        Constant.zzys_qnjcngz_zd = SpUtil.getSpDouble(this, "zzys_qnjcngz_zd", 20);

        Constant.zzgs_qnjcngz = SpUtil.getSpDouble(this, "zzgs_qnjcngz", 35);

        Constant.zzys_hbmz_zx = SpUtil.getSpDouble(this, "zzys_hbmz_zx", 15);

        Constant.zzys_hbmz_zd = SpUtil.getSpDouble(this, "zzys_hbmz_zd", 20);

        Constant.zzgs_hbmz = SpUtil.getSpDouble(this, "zzgs_hbmz", 30);

        Constant.zzys_rcmz_zx = SpUtil.getSpDouble(this, "zzys_rcmz_zx", 15);

        Constant.zzys_rcmz_zd = SpUtil.getSpDouble(this, "zzys_rcmz_zd", 20);

        Constant.zzgs_rcmz = SpUtil.getSpDouble(this, "zzgs_rcmz", 30);

        Constant.zzys_pzrjmz_zx = SpUtil.getSpDouble(this, "zzys_pzrjmz_zx", 15);

        Constant.zzys_pzrjmz_zd = SpUtil.getSpDouble(this, "zzys_pzrjmz_zd", 20);

        Constant.zzgs_pzrjmz = SpUtil.getSpDouble(this, "zzgs_pzrjmz", 30);

        Constant.zzys_prmz_zx = SpUtil.getSpDouble(this, "zzys_prmz_zx", 30);

        Constant.zzys_prmz_zd = SpUtil.getSpDouble(this, "zzys_prmz_zd", 45);

        Constant.zzgs_prmz = SpUtil.getSpDouble(this, "zzgs_prmz", 65);

        Constant.zzys_przz_zx = SpUtil.getSpDouble(this, "zzys_przz_zx", 1.5);

        Constant.zzys_przz_zd = SpUtil.getSpDouble(this, "zzys_przz_zd", 2.5);

        Constant.zzgs_przz = SpUtil.getSpDouble(this, "zzgs_przz", 3.5);

        Constant.zzys_byzz_zx = SpUtil.getSpDouble(this, "zzys_byzz_zx", 3);

        Constant.zzys_byzz_zd = SpUtil.getSpDouble(this, "zzys_byzz_zd", 5);

        Constant.zzgs_byzz = SpUtil.getSpDouble(this, "zzgs_byzz", 10);

        Constant.zzys_szyfz_zx = SpUtil.getSpDouble(this, "zzys_szyfz_zx", 6);

        Constant.zzys_szyfz_zd = SpUtil.getSpDouble(this, "zzys_szyfz_zd", 8);

        Constant.zzgs_szyfz = SpUtil.getSpDouble(this, "zzgs_szyfz", 15);

        //*************************************************猪舍建筑设置***************************************************//

        Constant.gzjxqsyj_c = SpUtil.getSpDouble(this, "gzjxqsyj_c", 3.6);
        Constant.gzjxqsyj_k = SpUtil.getSpDouble(this, "gzjxqsyj_k", 2.8);
        Constant.gzjxqsyj_gdk = SpUtil.getSpDouble(this, "gzjxqsyj_gdk", 1.4);
        Constant.gzjxqsyj_dj = SpUtil.getSpDouble(this, "gzjxqsyj_dj", 1408);

        Constant.fwl_c = SpUtil.getSpDouble(this, "fwl_c", 2.4);
        Constant.fwl_k = SpUtil.getSpDouble(this, "fwl_k", 2.1);
        Constant.fwl_gdk = SpUtil.getSpDouble(this, "fwl_gdk", 1.4);
        Constant.fwl_dj = SpUtil.getSpDouble(this, "fwl_dj", 4350);

        Constant.rcl_c = SpUtil.getSpDouble(this, "rcl_c", 2.4);
        Constant.rcl_k = SpUtil.getSpDouble(this, "rcl_k", 0.75);
        Constant.rcl_gdk = SpUtil.getSpDouble(this, "rcl_gdk", 1.4);
        Constant.rcl_dj = SpUtil.getSpDouble(this, "rcl_dj", 680);

        Constant.byl_c = SpUtil.getSpDouble(this, "byl_c", 2.4);
        Constant.byl_k = SpUtil.getSpDouble(this, "byl_k", 1.8);
        Constant.byl_gdk = SpUtil.getSpDouble(this, "byl_gdk", 1.4);
        Constant.byl_dj = SpUtil.getSpDouble(this, "byl_dj", 2650);

        Constant.szyfl_c = SpUtil.getSpDouble(this, "szyfl_c", 3.6);
        Constant.szyfl_k = SpUtil.getSpDouble(this, "szyfl_k", 2.8);
        Constant.szyfl_gdk = SpUtil.getSpDouble(this, "szyfl_gdk", 1.2);
        Constant.szyfl_dj = SpUtil.getSpDouble(this, "szyfl_dj", 1408);


        //**************************************************猪只铲粪量***************************************************//

        Constant.qnjcngz_f_xf = SpUtil.getSpDouble(this, "qnjcngz_f_xf", 1.01);

        Constant.qnjcngz_f_gwz = SpUtil.getSpDouble(this, "qnjcngz_f_gwz", 0.38);

        Constant.qnjcngz_l_l = SpUtil.getSpDouble(this, "qnjcngz_l_l", 5.6);

        Constant.qnjcngz_l_gwz = SpUtil.getSpDouble(this, "qnjcngz_l_gwz", 0.17);

        Constant.qnjcngz_flhj = SpUtil.getSpDouble(this, "qnjcngz_flhj", 0.019);

        Constant.qnjcngz_gwz = SpUtil.getSpDouble(this, "qnjcngz_gwz", 0.55);


        Constant.hbmz_f_xf = SpUtil.getSpDouble(this, "hbmz_f_xf", 1.01);

        Constant.hbmz_f_gwz = SpUtil.getSpDouble(this, "hbmz_f_gwz", 0.38);

        Constant.hbmz_l_l = SpUtil.getSpDouble(this, "hbmz_l_l", 5.6);

        Constant.hbmz_l_gwz = SpUtil.getSpDouble(this, "hbmz_l_gwz", 0.17);

        Constant.hbmz_flhj = SpUtil.getSpDouble(this, "hbmz_flhj", 0.019);

        Constant.hbmz_gwz = SpUtil.getSpDouble(this, "hbmz_gwz", 0.55);


        Constant.pzrjmz_f_xf = SpUtil.getSpDouble(this, "pzrjmz_f_xf", 1.01);

        Constant.pzrjmz_f_gwz = SpUtil.getSpDouble(this, "pzrjmz_f_gwz", 0.38);

        Constant.pzrjmz_l_l = SpUtil.getSpDouble(this, "pzrjmz_l_l", 5.6);

        Constant.pzrjmz_l_gwz = SpUtil.getSpDouble(this, "pzrjmz_l_gwz", 0.17);

        Constant.pzrjmz_flhj = SpUtil.getSpDouble(this, "pzrjmz_flhj", 0.019);

        Constant.pzrjmz_gwz = SpUtil.getSpDouble(this, "pzrjmz_gwz", 0.55);


        Constant.rcmz_f_xf = SpUtil.getSpDouble(this, "rcmz_f_xf", 1.01);

        Constant.rcmz_f_gwz = SpUtil.getSpDouble(this, "rcmz_f_gwz", 0.38);

        Constant.rcmz_l_l = SpUtil.getSpDouble(this, "rcmz_l_l", 5.6);

        Constant.rcmz_l_gwz = SpUtil.getSpDouble(this, "rcmz_l_gwz", 0.17);

        Constant.rcmz_flhj = SpUtil.getSpDouble(this, "rcmz_flhj", 0.019);

        Constant.rcmz_gwz = SpUtil.getSpDouble(this, "rcmz_gwz", 0.55);


        Constant.prmz_f_xf = SpUtil.getSpDouble(this, "prmz_f_xf", 1.01);

        Constant.prmz_f_gwz = SpUtil.getSpDouble(this, "prmz_f_gwz", 0.38);

        Constant.prmz_l_l = SpUtil.getSpDouble(this, "prmz_l_l", 5.6);

        Constant.prmz_l_gwz = SpUtil.getSpDouble(this, "prmz_l_gwz", 0.17);

        Constant.prmz_flhj = SpUtil.getSpDouble(this, "prmz_flhj", 0.019);

        Constant.prmz_gwz = SpUtil.getSpDouble(this, "prmz_gwz", 0.55);


        Constant.przz_f_xf = SpUtil.getSpDouble(this, "przz_f_xf", 1.01);

        Constant.przz_f_gwz = SpUtil.getSpDouble(this, "przz_f_gwz", 0.38);

        Constant.przz_l_l = SpUtil.getSpDouble(this, "przz_l_l", 5.6);

        Constant.przz_l_gwz = SpUtil.getSpDouble(this, "przz_l_gwz", 0.17);

        Constant.przz_flhj = SpUtil.getSpDouble(this, "przz_flhj", 0.019);

        Constant.przz_gwz = SpUtil.getSpDouble(this, "przz_gwz", 0.55);


        Constant.byzz_f_xf = SpUtil.getSpDouble(this, "byzz_f_xf", 0.45);

        Constant.byzz_f_gwz = SpUtil.getSpDouble(this, "byzz_f_gwz", 0.14);

        Constant.byzz_l_l = SpUtil.getSpDouble(this, "byzz_l_l", 1.65);

        Constant.byzz_l_gwz = SpUtil.getSpDouble(this, "byzz_l_gwz", 0.05);

        Constant.byzz_flhj = SpUtil.getSpDouble(this, "byzz_flhj", 0.008);

        Constant.byzz_gwz = SpUtil.getSpDouble(this, "byzz_gwz", 0.19);


        Constant.szyfz_f_xf = SpUtil.getSpDouble(this, "szyfz_f_xf", 0.79);

        Constant.szyfz_f_gwz = SpUtil.getSpDouble(this, "szyfz_f_gwz", 0.27);

        Constant.szyfz_l_l = SpUtil.getSpDouble(this, "szyfz_l_l", 3.47);

        Constant.szyfz_l_gwz = SpUtil.getSpDouble(this, "szyfz_l_gwz", 0.10);

        Constant.szyfz_flhj = SpUtil.getSpDouble(this, "szyfz_flhj", 0.013);

        Constant.szyfz_gwz = SpUtil.getSpDouble(this, "szyfz_gwz", 0.37);

        //*********************************************尿氮含量************************************************************//


        Constant.fymz_f_gwz = SpUtil.getSpDouble(this, "fymz_f_gwz", 0.379);

        Constant.fymz_f_gwzhdl = SpUtil.getSpDouble(this, "fymz_f_gwzhdl", 0.02);

        Constant.fymz_l_gwz = SpUtil.getSpDouble(this, "fymz_l_gwz", 0.03);

        Constant.fymz_l_ld = SpUtil.getSpDouble(this, "fymz_l_ld", 1971);

        Constant.byz_f_gwz = SpUtil.getSpDouble(this, "byz_f_gwz", 0.318);

        Constant.byz_f_gwzhdl = SpUtil.getSpDouble(this, "byz_f_gwzhdl", 0.0341);


        Constant.byz_l_gwz = SpUtil.getSpDouble(this, "byz_l_gwz", 0.03);

        Constant.byz_l_ld = SpUtil.getSpDouble(this, "byz_l_ld", 2017);

        Constant.ycz_f_gwz = SpUtil.getSpDouble(this, "ycz_f_gwz", 0.345);

        Constant.ycz_f_gwzhdl = SpUtil.getSpDouble(this, "ycz_f_gwzhdl", 0.0262);

        Constant.ycz_l_gwz = SpUtil.getSpDouble(this, "ycz_l_gwz", 0.03);

        Constant.ycz_l_ld = SpUtil.getSpDouble(this, "ycz_l_ld", 1672);

        //********************************************农作物施氮量******************************************//

        Constant.sd = SpUtil.getSpDouble(this, "sd", 10);

        Constant.xm = SpUtil.getSpDouble(this, "xm", 8);

        Constant.ym = SpUtil.getSpDouble(this, "ym", 16);

        Constant.yc = SpUtil.getSpDouble(this, "yc", 14);

        Constant.gs = SpUtil.getSpDouble(this, "gs", 6);

        Constant.mls = SpUtil.getSpDouble(this, "mls", 8);

        Constant.qglsc = SpUtil.getSpDouble(this, "qglsc", 14);

        Constant.glsc = SpUtil.getSpDouble(this, "glsc", 16);

        Constant.yclsc = SpUtil.getSpDouble(this, "yclsc", 14);

        Constant.gclsc = SpUtil.getSpDouble(this, "gclsc", 10);

        Constant.dlsc = SpUtil.getSpDouble(this, "dlsc", 6);

        Constant.cslsc = SpUtil.getSpDouble(this, "cslsc", 10);

        Constant.lygs = SpUtil.getSpDouble(this, "lygs", 20);

        Constant.clgs = SpUtil.getSpDouble(this, "clgs", 18);

        Constant.cy = SpUtil.getSpDouble(this, "cy", 16);

        Constant.mc = SpUtil.getSpDouble(this, "mc", 18);

        //*******************************************猪舍建筑单价************************************************************8//

        Constant.hbmzs_d = SpUtil.getSpDouble(this, "hbmzs_d", 800);

        Constant.gzjpzrcmzs_d = SpUtil.getSpDouble(this, "gzjpzrcmzs_d", 800);

        Constant.rcmzs_d = SpUtil.getSpDouble(this, "rcmzs_d", 800);

        Constant.fws_d = SpUtil.getSpDouble(this, "fws_d", 1200);

        Constant.bys_d = SpUtil.getSpDouble(this, "bys_d", 1200);

        Constant.szyfs_d = SpUtil.getSpDouble(this, "szyfs_d", 0);

        Constant.szyfs_d = SpUtil.getSpDouble(this, "szyfs_d", 800);

        Constant.bzgls_d = SpUtil.getSpDouble(this, "bzgls_d", 800);

        Constant.yzgls_d = SpUtil.getSpDouble(this, "yzgls_d", 800);

        Constant.zqc_d = SpUtil.getSpDouble(this, "zqc_d", 1100);

        Constant.zyc_d = SpUtil.getSpDouble(this, "zyc_d", 300);

        Constant.fzwjzmj_d = SpUtil.getSpDouble(this, "fzwjzmj_d", 0);

        Constant.slkf_d = SpUtil.getSpDouble(this, "slkf_d", 800);

        Constant.bgdqtjz_d = SpUtil.getSpDouble(this, "bgdqtjz_d", 1000);

        //常量
        Constant.zrjpbl = 0.04;
        Constant.zrgsj = 0.005;
        Constant.mnts = 365;
        Constant.mnzs = 52;
        Constant.mzncts = Constant.mnts / 145;

        /// /*********************************************************消纳面积***********************************************//

        Constant.zfzyc_sd_bfb = SpUtil.getSpDouble(this, "zfzyc_sd_bfb", 1);
        Constant.zfzyc_xm_bfb = SpUtil.getSpDouble(this, "zfzyc_xm_bfb", 1);
        Constant.zfzyc_ym_bfb = SpUtil.getSpDouble(this, "zfzyc_ym_bfb", 1);
        Constant.zfzyc_yc_bfb = SpUtil.getSpDouble(this, "zfzyc_yc_bfb", 1);
        Constant.zfzyc_gs_bfb = SpUtil.getSpDouble(this, "zfzyc_gs_bfb", 1);
        Constant.zfzyc_mls_bfb = SpUtil.getSpDouble(this, "zfzyc_mls_bfb", 1);
        Constant.zfzyc_qglsc_bfb = SpUtil.getSpDouble(this, "zfzyc_qglsc_bfb", 1);
        Constant.zfzyc_ggsc_bfb = SpUtil.getSpDouble(this, "zfzyc_ggsc_bfb", 1);
        Constant.zfzyc_yclsc_bfb = SpUtil.getSpDouble(this, "zfzyc_yclsc_bfb", 1);
        Constant.zfzyc_gclsc_bfb = SpUtil.getSpDouble(this, "zfzyc_gclsc_bfb", 1);
        Constant.zfzyc_lygs_bfb = SpUtil.getSpDouble(this, "zfzyc_lygs_bfb", 1);
        Constant.zfzyc_clgs_bfb = SpUtil.getSpDouble(this, "zfzyc_clgs_bfb", 1);
        Constant.zfzyc_cy_bfb = SpUtil.getSpDouble(this, "zfzyc_cy_bfb", 1);
        Constant.zfzyc_mc_bfb = SpUtil.getSpDouble(this, "zfzyc_mc_bfb", 1);
        Constant.zfzyc_dlsc_bfb = SpUtil.getSpDouble(this, "zfzyc_dlsc_bfb", 1);
        Constant.zfzyc_cslgs_bfb = SpUtil.getSpDouble(this, "zfzyc_cslgs_bfb", 1);

        Constant.byzzfzc_sd_bfb = SpUtil.getSpDouble(this, "byzzfzc_sd_bfb", 1);
        Constant.byzzfzc_xm_bfb = SpUtil.getSpDouble(this, "byzzfzc_xm_bfb", 1);
        Constant.byzzfzc_ym_bfb = SpUtil.getSpDouble(this, "byzzfzc_ym_bfb", 1);
        Constant.byzzfzc_yc_bfb = SpUtil.getSpDouble(this, "byzzfzc_yc_bfb", 1);
        Constant.byzzfzc_gs_bfb = SpUtil.getSpDouble(this, "byzzfzc_gs_bfb", 1);
        Constant.byzzfzc_mls_bfb = SpUtil.getSpDouble(this, "byzzfzc_mls_bfb", 1);
        Constant.byzzfzc_qglsc_bfb = SpUtil.getSpDouble(this, "byzzfzc_qglsc_bfb", 1);
        Constant.byzzfzc_ggsc_bfb = SpUtil.getSpDouble(this, "byzzfzc_ggsc_bfb", 1);
        Constant.byzzfzc_yclsc_bfb = SpUtil.getSpDouble(this, "byzzfzc_yclsc_bfb", 1);
        Constant.byzzfzc_gclsc_bfb = SpUtil.getSpDouble(this, "byzzfzc_gclsc_bfb", 1);
        Constant.byzzfzc_lygs_bfb = SpUtil.getSpDouble(this, "byzzfzc_lygs_bfb", 1);
        Constant.byzzfzc_clgs_bfb = SpUtil.getSpDouble(this, "byzzfzc_clgs_bfb", 1);
        Constant.byzzfzc_cy_bfb = SpUtil.getSpDouble(this, "byzzfzc_cy_bfb", 1);
        Constant.byzzfzc_mc_bfb = SpUtil.getSpDouble(this, "byzzfzc_mc_bfb", 1);
        Constant.byzzfzc_dlsc_bfb = SpUtil.getSpDouble(this, "byzzfzc_dlsc_bfb", 1);
        Constant.byzzfzc_cslgs_bfb = SpUtil.getSpDouble(this, "byzzfzc_cslgs_bfb", 1);

        Constant.dnzzfzc_sd_bfb = SpUtil.getSpDouble(this, "dnzzfzc_sd_bfb", 1);
        Constant.dnzzfzc_xm_bfb = SpUtil.getSpDouble(this, "dnzzfzc_xm_bfb", 1);
        Constant.dnzzfzc_ym_bfb = SpUtil.getSpDouble(this, "dnzzfzc_ym_bfb", 1);
        Constant.dnzzfzc_yc_bfb = SpUtil.getSpDouble(this, "dnzzfzc_yc_bfb", 1);
        Constant.dnzzfzc_gs_bfb = SpUtil.getSpDouble(this, "dnzzfzc_gs_bfb", 1);
        Constant.dnzzfzc_mls_bfb = SpUtil.getSpDouble(this, "dnzzfzc_mls_bfb", 1);
        Constant.dnzzfzc_qglsc_bfb = SpUtil.getSpDouble(this, "dnzzfzc_qglsc_bfb", 1);
        Constant.dnzzfzc_ggsc_bfb = SpUtil.getSpDouble(this, "dnzzfzc_ggsc_bfb", 1);
        Constant.dnzzfzc_yclsc_bfb = SpUtil.getSpDouble(this, "dnzzfzc_yclsc_bfb", 1);
        Constant.dnzzfzc_gclsc_bfb = SpUtil.getSpDouble(this, "dnzzfzc_gclsc_bfb", 1);
        Constant.dnzzfzc_lygs_bfb = SpUtil.getSpDouble(this, "dnzzfzc_lygs_bfb", 1);
        Constant.dnzzfzc_clgs_bfb = SpUtil.getSpDouble(this, "dnzzfzc_clgs_bfb", 1);
        Constant.dnzzfzc_cy_bfb = SpUtil.getSpDouble(this, "dnzzfzc_cy_bfb", 1);
        Constant.dnzzfzc_mc_bfb = SpUtil.getSpDouble(this, "dnzzfzc_mc_bfb", 1);
        Constant.dnzzfzc_dlsc_bfb = SpUtil.getSpDouble(this, "dnzzfzc_dlsc_bfb", 1);
        Constant.dnzzfzc_cslgs_bfb = SpUtil.getSpDouble(this, "dnzzfzc_cslgs_bfb", 1);


        Constant.yfc_sd_bfb = SpUtil.getSpDouble(this, "yfc_sd_bfb", 1);
        Constant.yfc_xm_bfb = SpUtil.getSpDouble(this, "yfc_xm_bfb", 1);
        Constant.yfc_ym_bfb = SpUtil.getSpDouble(this, "yfc_ym_bfb", 1);
        Constant.yfc_yc_bfb = SpUtil.getSpDouble(this, "yfc_yc_bfb", 1);
        Constant.yfc_gs_bfb = SpUtil.getSpDouble(this, "yfc_gs_bfb", 1);
        Constant.yfc_mls_bfb = SpUtil.getSpDouble(this, "yfc_mls_bfb", 1);
        Constant.yfc_qglsc_bfb = SpUtil.getSpDouble(this, "yfc_qglsc_bfb", 1);
        Constant.yfc_ggsc_bfb = SpUtil.getSpDouble(this, "yfc_ggsc_bfb", 1);
        Constant.yfc_yclsc_bfb = SpUtil.getSpDouble(this, "yfc_yclsc_bfb", 1);
        Constant.yfc_gclsc_bfb = SpUtil.getSpDouble(this, "yfc_gclsc_bfb", 1);
        Constant.yfc_lygs_bfb = SpUtil.getSpDouble(this, "yfc_lygs_bfb", 1);
        Constant.yfc_clgs_bfb = SpUtil.getSpDouble(this, "yfc_clgs_bfb", 1);
        Constant.yfc_cy_bfb = SpUtil.getSpDouble(this, "yfc_cy_bfb", 1);
        Constant.yfc_mc_bfb = SpUtil.getSpDouble(this, "yfc_mc_bfb", 1);
        Constant.yfc_dlsc_bfb = SpUtil.getSpDouble(this, "yfc_dlsc_bfb", 1);
        Constant.yfc_cslgs_bfb = SpUtil.getSpDouble(this, "yfc_cslgs_bfb", 1);


        Constant.zfzycnph_sd_jshns = SpUtil.getSpDouble(this, "zfzycnph_sd_jshns", 1);
        Constant.zfzycnph_xm_jshns = SpUtil.getSpDouble(this, "zfzycnph_xm_jshns", 1);
        Constant.zfzycnph_ym_jshns = SpUtil.getSpDouble(this, "zfzycnph_ym_jshns", 1);
        Constant.zfzycnph_yc_jshns = SpUtil.getSpDouble(this, "zfzycnph_yc_jshns", 1);
        Constant.zfzycnph_gs_jshns = SpUtil.getSpDouble(this, "zfzycnph_gs_jshns", 1);
        Constant.zfzycnph_mls_jshns = SpUtil.getSpDouble(this, "zfzycnph_mls_jshns", 1);
        Constant.zfzycnph_dlsc_jshns = SpUtil.getSpDouble(this, "zfzycnph_dlsc_jshns", 1);
        Constant.zfzycnph_cslsc_jshns = SpUtil.getSpDouble(this, "zfzycnph_cslsc_jshns", 1);
        Constant.zfzycnph_qglsc_jshns = SpUtil.getSpDouble(this, "zfzycnph_jglsc_jshns", 1);
        Constant.zfzycnph_ggsc_jshns = SpUtil.getSpDouble(this, "zfzycnph_ggsc_jshns", 1);
        Constant.zfzycnph_yclsc_jshns = SpUtil.getSpDouble(this, "zfzycnph_yclsc_jshns", 1);
        Constant.zfzycnph_gclsc_jshns = SpUtil.getSpDouble(this, "zfzycnph_gclsc_jshns", 1);
        Constant.zfzycnph_lygs_jshns = SpUtil.getSpDouble(this, "zfzycnph_lygs_jshns", 1);
        Constant.zfzycnph_clgs_jshns = SpUtil.getSpDouble(this, "zfzycnph_clgs_jshns", 1);
        Constant.zfzycnph_yc_jshns = SpUtil.getSpDouble(this, "zfzycnph_cy_jshns", 1);
        Constant.zfzycnph_mc_jshns = SpUtil.getSpDouble(this, "zfzycnph_mc_jshns", 1);

        Constant.zzfzcdph_sd_jshns = SpUtil.getSpDouble(this, "zzfzcdph_sd_jshns", 1);
        Constant.zzfzcdph_xm_jshns = SpUtil.getSpDouble(this, "zzfzcdph_xm_jshns", 1);
        Constant.zzfzcdph_ym_jshns = SpUtil.getSpDouble(this, "zzfzcdph_ym_jshns", 1);
        Constant.zzfzcdph_yc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_yc_jshns", 1);
        Constant.zzfzcdph_gs_jshns = SpUtil.getSpDouble(this, "zzfzcdph_gs_jshns", 1);
        Constant.zzfzcdph_mls_jshns = SpUtil.getSpDouble(this, "zzfzcdph_mls_jshns", 1);
        Constant.zzfzcdph_qglsc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_qglsc_jshns", 1);
        Constant.zzfzcdph_ggsc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_ggsc_jshns", 1);
        Constant.zzfzcdph_yclsc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_yclsc_jshns", 1);
        Constant.zzfzcdph_gclsc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_gclsc_jshns", 1);
        Constant.zzfzcdph_lygs_jshns = SpUtil.getSpDouble(this, "zzfzcdph_lygs_jshns", 1);
        Constant.zzfzcdph_clgs_jshns = SpUtil.getSpDouble(this, "zzfzcdph_clgs_jshns", 1);
        Constant.zzfzcdph_yc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_cy_jshns", 1);
        Constant.zzfzcdph_mc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_mc_jshns", 1);
        Constant.zzfzcdph_dlsc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_dlsc_jshns", 1);
        Constant.zzfzcdph_cslsc_jshns = SpUtil.getSpDouble(this, "zzfzcdph_cslsc_jshns", 1);


        Constant.dnzzfzcdph_dlsc_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_dlsc_jshns", 1);
        Constant.dnzzfzcdph_cslsc_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_cslsc_jshns", 1);
        Constant.dnzzfzcdph_sd_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_sd_jshns", 1);
        Constant.dnzzfzcdph_xm_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_xm_jshns", 1);
        Constant.dnzzfzcdph_ym_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_ym_jshns", 1);
        Constant.dnzzfzcdph_yc_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_yc_jshns", 1);
        Constant.dnzzfzcdph_gs_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_gs_jshns", 1);
        Constant.dnzzfzcdph_mls_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_mls_jshns", 1);
        Constant.dnzzfzcdph_qglsc_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_qglsc_jshns", 1);
        Constant.dnzzfzcdph_ggsc_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_ggsc_jshns", 1);
        Constant.dnzzfzcdph_yclsc_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_yclsc_jshns", 1);
        Constant.dnzzfzcdph_gclsc_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_gclsc_jshns", 1);
        Constant.dnzzfzcdph_lygs_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_lygs_jshns", 1);
        Constant.dnzzfzcdph_clgs_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_clgs_jshns", 1);
        Constant.dnzzfzcdph_cy_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_cy_jshns", 1);
        Constant.dnzzfzcdph_mc_jshns = SpUtil.getSpDouble(this, "dnzzfzcdph_mc_jshns", 1);


        Constant.yfc_sd_jshns = SpUtil.getSpDouble(this, "yfc_sd_jshns", 1);
        Constant.yfc_xm_jshns = SpUtil.getSpDouble(this, "yfc_xm_jshns", 1);
        Constant.yfc_ym_jshns = SpUtil.getSpDouble(this, "yfc_ym_jshns", 1);
        Constant.yfc_yc_jshns = SpUtil.getSpDouble(this, "yfc_yc_jshns", 1);
        Constant.yfc_gs_jshns = SpUtil.getSpDouble(this, "yfc_gs_jshns", 1);
        Constant.yfc_mls_jshns = SpUtil.getSpDouble(this, "yfc_mls_jshns", 1);
        Constant.yfc_qglsc_jshns = SpUtil.getSpDouble(this, "yfc_qglsc_jshns", 1);
        Constant.yfc_ggsc_jshns = SpUtil.getSpDouble(this, "yfc_ggsc_jshns", 1);
        Constant.yfc_yclsc_jshns = SpUtil.getSpDouble(this, "yfc_yclsc_jshns", 1);
        Constant.yfc_gclsc_jshns = SpUtil.getSpDouble(this, "yfc_gclsc_jshns", 1);
        Constant.yfc_lygs_jshns = SpUtil.getSpDouble(this, "yfc_lygs_jshns", 1);
        Constant.yfc_clgs_jshns = SpUtil.getSpDouble(this, "yfc_clgs_jshns", 1);
        Constant.yfc_cy_jshns = SpUtil.getSpDouble(this, "yfc_cy_jshns", 1);
        Constant.yfc_mc_jshns = SpUtil.getSpDouble(this, "yfc_mc_jshns", 1);
        Constant.yfc_dlsc_jshns = SpUtil.getSpDouble(this, "yfc_dlsc_jshns", 1);


        Constant.zfzycnph_sd_mj = SpUtil.getSpDouble(this, "zfzycnph_sd_mj", 150);
        Constant.zfzycnph_xm_mj = SpUtil.getSpDouble(this, "zfzycnph_xm_mj", 200);
        Constant.zfzycnph_ym_mj = SpUtil.getSpDouble(this, "zfzycnph_ym_mj", 300);
        Constant.zfzycnph_yc_mj = SpUtil.getSpDouble(this, "zfzycnph_yc_mj", 500);
        Constant.zfzycnph_gs_mj = SpUtil.getSpDouble(this, "zfzycnph_gs_mj", 200);

        Constant.zfzycnph_mls_mj = SpUtil.getSpDouble(this, "zfzycnph_mls_mj", 0);
        Constant.zfzycnph_qglsc_mj = SpUtil.getSpDouble(this, "zfzycnph_qglsc_mj", 0);
        Constant.zfzycnph_ggsc_mj = SpUtil.getSpDouble(this, "zfzycnph_ggsc_mj", 0);
        Constant.zfzycnph_yclsc_mj = SpUtil.getSpDouble(this, "zfzycnph_yclsc_mj", 0);
        Constant.zfzycnph_gclsc_mj = SpUtil.getSpDouble(this, "zfzycnph_gclsc_mj", 0);

        Constant.zfzycnph_dlsc_mj = SpUtil.getSpDouble(this, "zfzycnph_dlsc_mj", 0);
        Constant.zfzycnph_cslsc_mj = SpUtil.getSpDouble(this, "zfzycnph_cslsc_mj", 0);
        Constant.zfzycnph_lygs_mj = SpUtil.getSpDouble(this, "zfzycnph_lygs_mj", 97.4);
        Constant.zfzycnph_clgs_mj = SpUtil.getSpDouble(this, "zfzycnph_clgs_mj", 0);
        Constant.zfzycnph_cy_mj = SpUtil.getSpDouble(this, "zfzycnph_cy_mj", 0);

        Constant.zfzycnph_mc_mj = SpUtil.getSpDouble(this, "zfzycnph_mc_mj", 0);
        Constant.zfzycnph_hj_mj = SpUtil.getSpDouble(this, "zfzycnph_hj_mj", 0);
        Constant.zfzycnph_cz_mj = SpUtil.getSpDouble(this, "zfzycnph_cz_mj", 0);

        Constant.zzfzcdph_sd_mj = SpUtil.getSpDouble(this, "zzfzcdph_sd_mj", 0);
        Constant.zzfzcdph_xm_mj = SpUtil.getSpDouble(this, "zzfzcdph_xm_mj", 0);

        Constant.zzfzcdph_ym_mj = SpUtil.getSpDouble(this, "zzfzcdph_ym_mj", 0);
        Constant.zzfzcdph_yc_mj = SpUtil.getSpDouble(this, "zzfzcdph_yc_mj", 0);
        Constant.zzfzcdph_gs_mj = SpUtil.getSpDouble(this, "zzfzcdph_gs_mj", 0);
        Constant.zzfzcdph_mls_mj = SpUtil.getSpDouble(this, "zzfzcdph_mls_mj", 0);
        Constant.zzfzcdph_qglsc_mj = SpUtil.getSpDouble(this, "zzfzcdph_qglsc_mj", 0);


        Constant.zzfzcdph_ggsc_mj = SpUtil.getSpDouble(this, "zzfzcdph_ggsc_mj", 0);
        Constant.zzfzcdph_yclsc_mj = SpUtil.getSpDouble(this, "zzfzcdph_yclsc_mj", 0);
        Constant.zzfzcdph_gclsc_mj = SpUtil.getSpDouble(this, "zzfzcdph_gclsc_mj", 0);
        Constant.zzfzcdph_dlsc_mj = SpUtil.getSpDouble(this, "zzfzcdph_dlsc_mj", 0);
        Constant.zzfzcdph_cslsc_mj = SpUtil.getSpDouble(this, "zzfzcdph_cslsc_mj", 0);

        Constant.zzfzcdph_lygs_mj = SpUtil.getSpDouble(this, "zzfzcdph_lygs_mj", 300);
        Constant.zzfzcdph_clgs_mj = SpUtil.getSpDouble(this, "zzfzcdph_clgs_mj", 0);
        Constant.zzfzcdph_cy_mj = SpUtil.getSpDouble(this, "zzfzcdph_cy_mj", 300);
        Constant.zzfzcdph_mc_mj = SpUtil.getSpDouble(this, "zzfzcdph_mc_mj", 66.55);
        Constant.zzfzcdph_hj_mj = SpUtil.getSpDouble(this, "zzfzcdph_hj_mj", 0);

        Constant.zzfzcdph_cz_mj = SpUtil.getSpDouble(this, "zzfzcdph_cz_mj", 0);

        Constant.dnzzfzcdph_sd_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_sd_mj", 0);
        Constant.dnzzfzcdph_xm_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_xm_mj", 0);
        Constant.dnzzfzcdph_ym_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_ym_mj", 150);
        Constant.dnzzfzcdph_yc_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_yc_mj", 62.8);

        Constant.dnzzfzcdph_gs_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_gs_mj", 0);
        Constant.dnzzfzcdph_mls_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_mls_mj", 0);
        Constant.dnzzfzcdph_qglsc_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_qglsc_mj", 0);
        Constant.dnzzfzcdph_ggsc_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_ggsc_mj", 0);
        Constant.dnzzfzcdph_yclsc_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_yclsc_mj", 0);

        Constant.dnzzfzcdph_gclsc_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_gclsc_mj", 0);
        Constant.dnzzfzcdph_dlsc_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_dlsc_mj", 0);
        Constant.dnzzfzcdph_cslsc_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_cslsc_mj", 0);
        Constant.dnzzfzcdph_lygs_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_lygs_mj", 0);
        Constant.dnzzfzcdph_clgs_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_clgs_mj", 0);

        Constant.dnzzfzcdph_cy_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_cy_mj", 300);
        Constant.dnzzfzcdph_mc_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_mc_mj", 0);
        Constant.dnzzfzcdph_hj_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_hj_mj", 0);
        Constant.dnzzfzcdph_cz_mj = SpUtil.getSpDouble(this, "dnzzfzcdph_cz_mj", 0);


        Constant.yfc_sd_mj = SpUtil.getSpDouble(this, "yfc_sd_mj", 0);
        Constant.yfc_xm_mj = SpUtil.getSpDouble(this, "yfc_xm_mj", 0);
        Constant.yfc_ym_mj = SpUtil.getSpDouble(this, "yfc_ym_mj", 0);
        Constant.yfc_yc_mj = SpUtil.getSpDouble(this, "yfc_yc_mj", 0);

        Constant.yfc_gs_mj = SpUtil.getSpDouble(this, "yfc_gs_mj", 0);
        Constant.yfc_mls_mj = SpUtil.getSpDouble(this, "yfc_mls_mj", 200);
        Constant.yfc_qglsc_mj = SpUtil.getSpDouble(this, "yfc_qglsc_mj", 0);
        Constant.yfc_ggsc_mj = SpUtil.getSpDouble(this, "yfc_ggsc_mj", 0);
        Constant.yfc_yclsc_mj = SpUtil.getSpDouble(this, "yfc_yclsc_mj", 0);

        Constant.yfc_gclsc_mj = SpUtil.getSpDouble(this, "yfc_gclsc_mj", 0);
        Constant.yfc_dlsc_mj = SpUtil.getSpDouble(this, "yfc_dlsc_mj", 50);
        Constant.yfc_cslsc_mj = SpUtil.getSpDouble(this, "yfc_cslsc_mj", 0);
        Constant.yfc_lygs_mj = SpUtil.getSpDouble(this, "yfc_lygs_mj", 0);
        Constant.yfc_clgs_mj = SpUtil.getSpDouble(this, "yfc_clgs_mj", 0);

        Constant.yfc_cy_mj = SpUtil.getSpDouble(this, "yfc_cy_mj", 177.8);
        Constant.yfc_mc_mj = SpUtil.getSpDouble(this, "yfc_mc_mj", 0);
        Constant.yfc_hj_mj = SpUtil.getSpDouble(this, "yfc_hj_mj", 0);
        Constant.yfc_cz_mj = SpUtil.getSpDouble(this, "yfc_cz_mj", 0);



        Constant.hbmzs_xqjl_dj = SpUtil.getSpDouble(this, "hbmzs_xqjl_dj", 0);



        Constant.hbmzs_ltlx_dj = SpUtil.getSpDouble(this, "hbmzs_ltlx_dj", 0);



        Constant.hbmzs_sl_dj = SpUtil.getSpDouble(this, "hbmzs_sl_dj", 0);



        Constant.hbmzs_fyfj_dj = SpUtil.getSpDouble(this, "hbmzs_fyfj_dj", 0);



        Constant.hbmzs_znhjkzq_dj = SpUtil.getSpDouble(this, "hbmzs_znhjkzq_dj", 0);



        Constant.hbmzs_lfdb_dj = SpUtil.getSpDouble(this, "hbmzs_lfdb_dj", 0);



        Constant.hbmzs_ysq_dj = SpUtil.getSpDouble(this, "hbmzs_ysq_dj", 0);


        //公猪及配种壬检母猪舍
        Constant.gzjpzrjmzs_bzj_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_bzj_dj", 0);

        Constant.gzjpzrjmzs_jyzlzdfxy_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_jyzlzdfxy_dj", 0);

        Constant.gzjpzrjmzs_szsj_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_szsj_dj", 0);

        Constant.gzjpzrjmzs_szysjybzdgzj_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_szysjybzdgzj_dj", 0);

        Constant.gzjpzrjmzs_xqjl_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_xqjl_dj", 0);

        Constant.gzjpzrjmzs_ltxx_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_ltxx_dj", 0);

        Constant.gzjpzrjmzs_sl_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_sl_dj", 0);

        Constant.gzjpzrjmzs_fyfj_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_fyfj_dj", 0);

        Constant.gzjpzrjmzs_znhjkzq_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_znhjkzq_dj", 0);


        Constant.gzjpzrjmzs_lfdb_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_lfdb_dj", 0);

        Constant.gzjpzrjmzs_ysq_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_ysq_dj", 0);


        Constant.gzjpzrjmzs_rcvczdy_dj = SpUtil.getSpDouble(this, "gzjpzrjmzs_rcvczdy_dj", 0);


        //妊娠母猪舍
        Constant.rcmzs_xwl_dj = SpUtil.getSpDouble(this, "rcmzs_xwl_dj", 0);

        Constant.rcmzs_ltlx_dj = SpUtil.getSpDouble(this, "rcmzs_ltlx_dj", 0);

        Constant.rcmzs_sl_dj = SpUtil.getSpDouble(this, "rcmzs_sl_dj", 0);

        Constant.rcmzs_fyfj_dj = SpUtil.getSpDouble(this, "rcmzs_fyfj_dj", 0);

        Constant.rcmzs_znhjkzq_dj = SpUtil.getSpDouble(this, "rcmzs_znhjkzq_dj", 0);

        Constant.rcmzs_lfdb_dj = SpUtil.getSpDouble(this, "rcmzs_lfdb_dj", 0);

        Constant.rcmzs_ysq_dj = SpUtil.getSpDouble(this, "rcmzs_ysq_dj", 0);

        //分娩栏舍
        Constant.fws_fwl_dj = SpUtil.getSpDouble(this, "fws_fwl_dj", 0);


        Constant.fws_ltlx_dj = SpUtil.getSpDouble(this, "fws_ltlx_dj", 0);
        // LogUtil.e(Constant.fws_ltlx_sl+"---"+Constant.fws_ltlx_dj);


        Constant.fws_sl_dj = SpUtil.getSpDouble(this, "fws_sl_dj", 0);

        Constant.fws_flsj_dj = SpUtil.getSpDouble(this, "fws_flsj_dj", 0);

        Constant.fws_znhjkzq_dj = SpUtil.getSpDouble(this, "fws_znhjkzq_dj", 0);


        Constant.fws_ysq_dj = SpUtil.getSpDouble(this, "fws_ysq_dj", 0);


        Constant.fws_znbwx_dj = SpUtil.getSpDouble(this, "fws_znbwx_dj", 0);


        Constant.fws_dhjbysb_dj = SpUtil.getSpDouble(this, "fws_dhjbysb_dj", 0);

        //保育舍
        Constant.bys_byl_dj = SpUtil.getSpDouble(this, "bys_byl_dj", 0);

        Constant.bys_ltlx_dj = SpUtil.getSpDouble(this, "bys_ltlx_dj", 0);
        Constant.bys_sl_dj = SpUtil.getSpDouble(this, "bys_sl_dj", 0);

        Constant.bys_fyfj_dj = SpUtil.getSpDouble(this, "bys_fyfj_dj", 0);

        Constant.bys_znhjkzq_dj = SpUtil.getSpDouble(this, "bys_znhjkzq_dj", 0);

        Constant.bys_ysq_dj = SpUtil.getSpDouble(this, "bys_ysq_dj", 0);

        Constant.bys_dhjbwsb_dj = SpUtil.getSpDouble(this, "bys_dhjbwsb_dj", 0);


        //生长育肥舍
        Constant.szyfs_xqjl_dj = SpUtil.getSpDouble(this, "szyfs_xqjl_dj", 0);

        Constant.szyfs_ltlx_dj = SpUtil.getSpDouble(this, "szyfs_ltlx_dj", 0);

        Constant.szyfs_sl_dj = SpUtil.getSpDouble(this, "szyfs_sl_dj", 0);


        Constant.szyfs_fyfj_dj = SpUtil.getSpDouble(this, "szyfs_fyfj_dj", 0);

        Constant.szyfs_znhjkzq_dj = SpUtil.getSpDouble(this, "szyfs_znhjkzq_dj", 0);

        Constant.szyfs_lfdb_dj = SpUtil.getSpDouble(this, "szyfs_lfdb_dj", 0);

        Constant.szyfs_ysq_dj = SpUtil.getSpDouble(this, "szyfs_ysq_dj", 0);

        //病猪隔离舍
        Constant.bzgls_xqjl_dj = SpUtil.getSpDouble(this, "bzgls_xqjl_dj", 0);

        Constant.bzgls_ltlx_dj = SpUtil.getSpDouble(this, "bzgls_ltlx_dj", 0);

        Constant.bzgls_sl_dj = SpUtil.getSpDouble(this, "bzgls_sl_dj", 0);


        Constant.bzgls_fyfj_dj = SpUtil.getSpDouble(this, "bzgls_fyfj_dj", 0);

        Constant.bzgls_znhjkzq_dj = SpUtil.getSpDouble(this, "bzgls_znhjkzq_dj", 0);

        Constant.bzgls_lfdb_dj = SpUtil.getSpDouble(this, "bzgls_lfdb_dj", 0);

        Constant.bzgls_ysq_dj = SpUtil.getSpDouble(this, "bzgls_ysq_dj", 0);


        //引种隔离舍
        Constant.yzgls_xqjl_dj = SpUtil.getSpDouble(this, "yzgls_xqjl_dj", 0);

        Constant.yzgls_ltlx_dj = SpUtil.getSpDouble(this, "yzgls_ltlx_dj", 0);

        Constant.yzgls_sl_dj = SpUtil.getSpDouble(this, "yzgls_sl_dj", 0);


        Constant.yzgls_fyfj_dj = SpUtil.getSpDouble(this, "yzgls_fyfj_dj", 0);

        Constant.yzgls_znhjkzq_dj = SpUtil.getSpDouble(this, "yzgls_znhjkzq_dj", 0);

        Constant.yzgls_lfdb_dj = SpUtil.getSpDouble(this, "yzgls_lfdb_dj", 0);

        Constant.yzgls_ysq_dj = SpUtil.getSpDouble(this, "yzgls_ysq_dj", 0);


    }
}
