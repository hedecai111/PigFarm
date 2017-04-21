package com.cd.pigfarm.app;

import android.app.Application;


import com.cd.pigfarm.constant.Constant;
import com.cd.pigfarm.util.SpUtil;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/4/5 20:46
 * @Description: 全局类
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化数据
        initData();
    }

    /**
     * 初始化数据，从sp里面去数据出来给Constant里面的变量赋值
     */
    private void initData() {
        Constant. clmzz =SpUtil.getSpLong(this,"clmzz",0);
        //************************************育肥场*************************************************************
        Constant. clspzs =SpUtil.getSpLong(this,"clspzs",0);
        Constant. mlsyspzs =SpUtil.getSpDouble(this,"mlsyspzs",0);
        Constant. spzyfl =SpUtil.getSpDouble(this,"spzyfl",0);



        //*********************************基本参数********************************************************


        Constant. gwzcql =SpUtil.getSpDouble(this,"gwzcql",0);

        Constant. zqccrcql =SpUtil.getSpDouble(this,"zqccrcql",0);



        Constant. dnzpzjg = SpUtil.getSpDouble(this,"dnzpzjg",0);

        Constant. rcjc =SpUtil.getSpDouble(this,"rcjc",0);

        Constant. mzrcq =SpUtil.getSpDouble(this,"mzrcq",0);

        Constant. mzphl =SpUtil.getSpDouble(this,"mzphl",0);

        Constant. rcmzfwl =SpUtil.getSpDouble(this,"rcmzfwl",0);

        Constant. mzstfwl=SpUtil.getSpDouble(this,"mzstfwl",0);

        Constant.  dnrl=SpUtil.getSpDouble(this,"dnrl",0);

        Constant. mzncws =SpUtil.getSpDouble(this,"mzncws",0);

        Constant. byq =SpUtil.getSpDouble(this,"byq",0);

        Constant. szyfq =SpUtil.getSpDouble(this,"szyfq",0);

        Constant. mzwchzs =SpUtil.getSpDouble(this,"mzwchzs",0);

        Constant. prqchl =SpUtil.getSpDouble(this,"prqchl",0);

        Constant. byqchl =SpUtil.getSpDouble(this,"byqchl",0);

        Constant. szyfqchl =SpUtil.getSpDouble(this,"szyfqchl",0);

        Constant. ntgyczzs =SpUtil.getSpDouble(this,"ntgyczzs",0);

        Constant. ntgspzs =SpUtil.getSpDouble(this,"ntgspzs",0);

        Constant. zznttgxl =SpUtil.getSpDouble(this,"zznttgxl",0);

        Constant. hbzpypc =SpUtil.getSpDouble(this,"hbzpypc",0);

        Constant. fyjl =SpUtil.getSpDouble(this,"fyjl",7);

        Constant. mzncts =SpUtil.getSpDouble(this,"mzncts",0);

        Constant. mzcpmzs=SpUtil.getSpDouble(this,"mzcpmzs",0);

        Constant. mzrcmzs  =SpUtil.getSpDouble(this,"mzrcmzs",0);

        Constant. mzczmzs =SpUtil.getSpDouble(this,"mzczmzs",0);

        Constant. mzbyws=SpUtil.getSpDouble(this,"mzbyws",0);

        Constant. mzyfws =SpUtil.getSpDouble(this,"mzyfws",0);

        Constant. zlkzxdts =SpUtil.getSpDouble(this,"zlkzxdts",0);

        //*************************************猪只饮水参数***********************************************//
        Constant. zzys_qnjcngz_zx =SpUtil.getSpDouble(this,"zzys_qnjcngz_zx",0);

        Constant. zzys_qnjcngz_zd =SpUtil.getSpDouble(this,"zzys_qnjcngz_zd",0);

        Constant. zzgs_qnjcngz =SpUtil.getSpDouble(this,"zzgs_qnjcngz",0);

        Constant. zzys_hbmz_zx =SpUtil.getSpDouble(this,"zzys_hbmz_zx",0);

        Constant. zzys_hbmz_zd=SpUtil.getSpDouble(this,"zzys_hbmz_zd",0);

        Constant. zzgs_hbmz  =SpUtil.getSpDouble(this,"zzgs_hbmz",0);

        Constant. zzys_rcmz_zx =SpUtil.getSpDouble(this,"zzys_rcmz_zx",0);

        Constant. zzys_rcmz_zd=SpUtil.getSpDouble(this,"zzys_rcmz_zd",0);

        Constant. zzgs_rcmz =SpUtil.getSpDouble(this,"zzgs_rcmz",0);

        Constant. zzys_pzrjmz_zx =SpUtil.getSpDouble(this,"zzys_pzrjmz_zx",0);

        Constant. zzys_pzrjmz_zd =SpUtil.getSpDouble(this,"zzys_pzrjmz_zd",0);

        Constant. zzgs_pzrjmz =SpUtil.getSpDouble(this,"zzgs_pzrjmz",0);

        Constant. zzys_prmz_zx =SpUtil.getSpDouble(this,"zzys_prmz_zx",0);

        Constant. zzys_prmz_zd=SpUtil.getSpDouble(this,"zzys_prmz_zd",0);

        Constant. zzgs_prmz  =SpUtil.getSpDouble(this,"zzgs_prmz",0);

        Constant. zzys_przz_zx =SpUtil.getSpDouble(this,"zzys_przz_zx",0);

        Constant. zzys_przz_zd=SpUtil.getSpDouble(this,"zzys_przz_zd",0);

        Constant. zzgs_przz =SpUtil.getSpDouble(this,"zzgs_przz",0);

        Constant. zzys_byzz_zx =SpUtil.getSpDouble(this,"zzys_byzz_zx",0);

        Constant. zzys_byzz_zd=SpUtil.getSpDouble(this,"zzys_byzz_zd",0);

        Constant. zzgs_byzz  =SpUtil.getSpDouble(this,"zzgs_byzz",0);

        Constant. zzys_szyfz_zx =SpUtil.getSpDouble(this,"zzys_szyfz_zx",0);

        Constant. zzys_szyfz_zd=SpUtil.getSpDouble(this,"zzys_szyfz_zd",0);

        Constant. zzgs_szyfz =SpUtil.getSpDouble(this,"zzgs_szyfz",0);

        //*************************************************猪舍建筑设置***************************************************//

        Constant. gzjxqsyj_c =SpUtil.getSpDouble(this,"gzjxqsyj_c",0);
        Constant. gzjxqsyj_k =SpUtil.getSpDouble(this,"gzjxqsyj_k",0);
        Constant. gzjxqsyj_gdk =SpUtil.getSpDouble(this,"gzjxqsyj_gdk",0);
        Constant. gzjxqsyj_dj =SpUtil.getSpDouble(this,"gzjxqsyj_dj",0);

        Constant. fwl_c =SpUtil.getSpDouble(this,"fwl_c",0);
        Constant. fwl_k =SpUtil.getSpDouble(this,"fwl_k",0);
        Constant. fwl_gdk =SpUtil.getSpDouble(this,"fwl_gdk",0);
        Constant. fwl_dj =SpUtil.getSpDouble(this,"fwl_dj",0);

        Constant. rcl_c =SpUtil.getSpDouble(this,"rcl_c",0);
        Constant. rcl_k =SpUtil.getSpDouble(this,"rcl_k",0);
        Constant. rcl_gdk =SpUtil.getSpDouble(this,"rcl_gdk",0);
        Constant. rcl_dj =SpUtil.getSpDouble(this,"rcl_dj",0);

        Constant. byl_c =SpUtil.getSpDouble(this,"byl_c",0);
        Constant. byl_k =SpUtil.getSpDouble(this,"byl_k",0);
        Constant. byl_gdk =SpUtil.getSpDouble(this,"byl_gdk",0);
        Constant. byl_dj =SpUtil.getSpDouble(this,"byl_dj",0);

        Constant. szyfl_c =SpUtil.getSpDouble(this,"szyfl_c",0);
        Constant. szyfl_k =SpUtil.getSpDouble(this,"szyfl_k",0);
        Constant. szyfl_gdk =SpUtil.getSpDouble(this,"szyfl_gdk",0);
        Constant. szyfl_dj =SpUtil.getSpDouble(this,"szyfl_dj",0);


        //**************************************************猪只铲粪量***************************************************//

        Constant. qnjcngz_f_xf =SpUtil.getSpDouble(this,"qnjcngz_f_xf",0);

        Constant. qnjcngz_f_gwz=SpUtil.getSpDouble(this,"qnjcngz_f_gwz",0);

        Constant. qnjcngz_l_l  =SpUtil.getSpDouble(this,"qnjcngz_l_l",0);

        Constant. qnjcngz_l_gwz =SpUtil.getSpDouble(this,"qnjcngz_l_gwz",0);

        Constant. qnjcngz_flhj=SpUtil.getSpDouble(this,"qnjcngz_flhj",0);

        Constant. qnjcngz_gwz =SpUtil.getSpDouble(this,"qnjcngz_gwz",0);


        Constant. hbmz_f_xf =SpUtil.getSpDouble(this,"hbmz_f_xf",0);

        Constant. hbmz_f_gwz=SpUtil.getSpDouble(this,"hbmz_f_gwz",0);

        Constant. hbmz_l_l  =SpUtil.getSpDouble(this,"hbmz_l_l",0);

        Constant. hbmz_l_gwz =SpUtil.getSpDouble(this,"hbmz_l_gwz",0);

        Constant. hbmz_flhj=SpUtil.getSpDouble(this,"hbmz_flhj",0);

        Constant. hbmz_gwz =SpUtil.getSpDouble(this,"hbmz_gwz",0);


        Constant. pzrjmz_f_xf =SpUtil.getSpDouble(this,"pzrjmz_f_xf",0);

        Constant. pzrjmz_f_gwz=SpUtil.getSpDouble(this,"pzrjmz_f_gwz",0);

        Constant. pzrjmz_l_l  =SpUtil.getSpDouble(this,"pzrjmz_l_l",0);

        Constant. pzrjmz_l_gwz =SpUtil.getSpDouble(this,"pzrjmz_l_gwz",0);

        Constant. pzrjmz_flhj=SpUtil.getSpDouble(this,"pzrjmz_flhj",0);

        Constant. pzrjmz_gwz =SpUtil.getSpDouble(this,"pzrjmz_gwz",0);


        Constant. rcmz_f_xf =SpUtil.getSpDouble(this,"rcmz_f_xf",0);

        Constant. rcmz_f_gwz=SpUtil.getSpDouble(this,"rcmz_f_gwz",0);

        Constant. rcmz_l_l  =SpUtil.getSpDouble(this,"rcmz_l_l",0);

        Constant. rcmz_l_gwz =SpUtil.getSpDouble(this,"rcmz_l_gwz",0);

        Constant. rcmz_flhj=SpUtil.getSpDouble(this,"rcmz_flhj",0);

        Constant. rcmz_gwz =SpUtil.getSpDouble(this,"rcmz_gwz",0);


        Constant. prmz_f_xf =SpUtil.getSpDouble(this,"prmz_f_xf",0);

        Constant. prmz_f_gwz=SpUtil.getSpDouble(this,"prmz_f_gwz",0);

        Constant. prmz_l_l  =SpUtil.getSpDouble(this,"prmz_l_l",0);

        Constant. prmz_l_gwz =SpUtil.getSpDouble(this,"prmz_l_gwz",0);

        Constant. prmz_flhj=SpUtil.getSpDouble(this,"prmz_flhj",0);

        Constant. prmz_gwz =SpUtil.getSpDouble(this,"prmz_gwz",0);


        Constant. przz_f_xf =SpUtil.getSpDouble(this,"przz_f_xf",0);

        Constant. przz_f_gwz=SpUtil.getSpDouble(this,"przz_f_gwz",0);

        Constant. przz_l_l  =SpUtil.getSpDouble(this,"przz_l_l",0);

        Constant. przz_l_gwz=SpUtil.getSpDouble(this,"przz_l_gwz",0);

        Constant. przz_flhj=SpUtil.getSpDouble(this,"przz_flhj",0);

        Constant. przz_gwz =SpUtil.getSpDouble(this,"przz_gwz",0);


        Constant. byzz_f_xf =SpUtil.getSpDouble(this,"byzz_f_xf",0);

        Constant. byzz_f_gwz=SpUtil.getSpDouble(this,"byzz_f_gwz",0);

        Constant. byzz_l_l  =SpUtil.getSpDouble(this,"byzz_l_l",0);

        Constant. byzz_l_gwz =SpUtil.getSpDouble(this,"byzz_l_gwz",0);

        Constant. byzz_flhj=SpUtil.getSpDouble(this,"byzz_flhj",0);

        Constant. byzz_gwz =SpUtil.getSpDouble(this,"byzz_gwz",0);


        Constant. szyfz_f_xf =SpUtil.getSpDouble(this,"szyfz_f_xf",0);

        Constant. szyfz_f_gwz=SpUtil.getSpDouble(this,"szyfz_f_gwz",0);

        Constant. szyfz_l_l  =SpUtil.getSpDouble(this,"szyfz_l_l",0);

        Constant. szyfz_l_gwz =SpUtil.getSpDouble(this,"szyfz_l_gwz",0);

        Constant. szyfz_flhj=SpUtil.getSpDouble(this,"szyfz_flhj",0);

        Constant. szyfz_gwz =SpUtil.getSpDouble(this,"szyfz_gwz",0);

    //*********************************************尿氮含量************************************************************//



        Constant. fymz_f_gwz =SpUtil.getSpDouble(this,"fymz_f_gwz",0);

        Constant. fymz_f_gwzhdl=SpUtil.getSpDouble(this,"fymz_f_gwzhdl",0);

        Constant. fymz_l_gwz  =SpUtil.getSpDouble(this,"fymz_l_gwz",0);

        Constant. fymz_l_ld =SpUtil.getSpDouble(this,"fymz_l_ld",0);

        Constant. byz_f_gwz=SpUtil.getSpDouble(this,"byz_f_gwz",0);

        Constant. byz_f_gwzhdl =SpUtil.getSpDouble(this,"byz_f_gwzhdl",0);


        Constant. byz_l_gwz =SpUtil.getSpDouble(this,"byz_l_gwz",0);

        Constant. byz_l_ld=SpUtil.getSpDouble(this,"byz_l_ld",0);

        Constant. ycz_f_gwz  =SpUtil.getSpDouble(this,"ycz_f_gwz",0);

        Constant. ycz_f_gwzhdl =SpUtil.getSpDouble(this,"ycz_f_gwzhdl",0);

        Constant. ycz_l_gwz=SpUtil.getSpDouble(this,"ycz_l_gwz",0);

        Constant. ycz_l_ld =SpUtil.getSpDouble(this,"ycz_l_ld",0);

        //********************************************农作物施氮量******************************************//

        Constant. sd =SpUtil.getSpDouble(this,"sd",0);

        Constant. xm=SpUtil.getSpDouble(this,"xm",0);

        Constant. ym  =SpUtil.getSpDouble(this,"ym",0);

        Constant. yc =SpUtil.getSpDouble(this,"yc",0);

        Constant. gs=SpUtil.getSpDouble(this,"gs",0);

        Constant. mls =SpUtil.getSpDouble(this,"mls",0);

        Constant. qglsc =SpUtil.getSpDouble(this,"qglsc",0);

        Constant. glsc=SpUtil.getSpDouble(this,"glsc",0);

        Constant. yclsc  =SpUtil.getSpDouble(this,"yclsc",0);

        Constant. gclsc  =SpUtil.getSpDouble(this,"gclsc",0);

        Constant. dlsc =SpUtil.getSpDouble(this,"dlsc",0);

        Constant. cslsc=SpUtil.getSpDouble(this,"cslsc",0);

        Constant. lygs =SpUtil.getSpDouble(this,"lygs",0);

        Constant. clgs =SpUtil.getSpDouble(this,"clgs",0);

        Constant. cy=SpUtil.getSpDouble(this,"cy",0);

        Constant. mc =SpUtil.getSpDouble(this,"mc",0);

        //*******************************************猪舍建筑单位************************************************************8//

        Constant. hbmzs_d  =SpUtil.getSpDouble(this,"hbmzs_d",0);

        Constant. gzjpzrcmzs_d  =SpUtil.getSpDouble(this,"gzjpzrcmzs_d",0);

        Constant. rcmzs_d =SpUtil.getSpDouble(this,"rcmzs_d",0);

        Constant. fws_d=SpUtil.getSpDouble(this,"fws_d",0);

        Constant. bys_d =SpUtil.getSpDouble(this,"bys_d",0);

        Constant. szyfs_d =SpUtil.getSpDouble(this,"szyfs_d",0);

        Constant. szyfs_d=SpUtil.getSpDouble(this,"szyfs_d",0);

        Constant. bzgls_d =SpUtil.getSpDouble(this,"bzgls_d",0);

        Constant. yzgls_d =SpUtil.getSpDouble(this,"yzgls_d",0);

        Constant. zqc_d=SpUtil.getSpDouble(this,"zqc_d",0);

        Constant. zyc_d =SpUtil.getSpDouble(this,"zyc_d",0);

        Constant. fzwjzmj_d =SpUtil.getSpDouble(this,"fzwjzmj_d",0);

        Constant. slkf_d=SpUtil.getSpDouble(this,"slkf_d",0);

        Constant. bgdqtjz_d =SpUtil.getSpDouble(this,"bgdqtjz_d",0);

        //常量
        Constant.zrjpbl = 0.04;
        Constant.zrgsj = 0.005;
        Constant.mnts = 365;
        Constant.mnzs = 52;
        Constant.mzncts =Constant.mnts/145;
    }
}
