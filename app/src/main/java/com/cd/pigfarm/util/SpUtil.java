package com.cd.pigfarm.util;

import android.content.Context;

/**
 * Created by hedecai on 2016/12/20.
 * 作用：封装SP存储，对外提供存和取的方法
 */

public class SpUtil {

    public static final String SP_NAME = "app_sp";

    /**
     * 存字符串
     * @param key
     * @param value
     */
    public  static  void saveSP(Context context ,String key ,String value){
       context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).edit().putString(key,value).commit();

    }
    /**
     * 存boolean型
     * @param key
     * @param value
     */
    public  static  void saveSP(Context context ,String key ,boolean value){
        context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).edit().putBoolean(key,value).commit();

    }
    /**
     * 存整形
     * @param key
     * @param value
     */
    public  static  void saveSP(Context context ,String key ,int value){
        context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).edit().putInt(key,value).commit();

    }
    /**
     * 存浮点型
     * @param key
     * @param value
     */
    public   static void saveSP(Context context ,String key ,float value){
        context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).edit().putFloat(key,value).commit();

    }
    /**
     * lang类型
     * @param key
     * @param value
     */
    public   static void saveSP(Context context ,String key ,long value){
        context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).edit().putLong(key,value).commit();

    }

    public   static void saveSP(Context context ,String key ,double value){
        context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).edit().putString(key,value+"").commit();

    }

    /**
     * 取字符串
     * @param key
     * @param defaultValue   默认值
     * @return
     */
    public static  String getSpString(Context context ,String key,String defaultValue){
        return context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).getString(key,defaultValue);
    }
    public static  boolean getSpBoolean(Context context ,String key,boolean defaultValue){
        return context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).getBoolean(key,defaultValue);
    }
    public  static int getSpInt(Context context ,String key,int defaultValue){
        return context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).getInt(key,defaultValue);
    }
    public static double getSpDouble(Context context ,String key,double defaultValue){
        String dString = context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).getString(key,"");
        if (dString.equals("") || Utils.isNumeric(dString)){
            return defaultValue;
        }
        return Double.parseDouble(dString);
    }
    public static long getSpLong(Context context ,String key,long defaultValue){
        return context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).getLong(key,defaultValue);
    }

    public static void clear(Context context){
        context.getSharedPreferences(SP_NAME,Context.MODE_PRIVATE).edit().clear().commit();
    }
}
