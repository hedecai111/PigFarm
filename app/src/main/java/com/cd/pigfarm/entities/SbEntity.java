package com.cd.pigfarm.entities;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/5/18 15:59
 * @Description: 设备实体
 */
public class SbEntity {

    private int sblx;
    private String sbmc;
    private String sbxh;
    private String dw;
    private int sl;
    private double dj;

    public int getSblx() {
        return sblx;
    }

    public void setSblx(int sblx) {
        this.sblx = sblx;
    }

    public String getSbmc() {
        return sbmc;
    }

    public void setSbmc(String sbmc) {
        this.sbmc = sbmc;
    }

    public String getSbxh() {
        return sbxh;
    }

    public void setSbxh(String sbxh) {
        this.sbxh = sbxh;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDj() {
        return dj;
    }

    public void setDj(double dj) {
        this.dj = dj;
    }
}
