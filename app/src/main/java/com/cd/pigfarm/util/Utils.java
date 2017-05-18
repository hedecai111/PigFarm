package com.cd.pigfarm.util;

import android.app.Activity;
import android.content.Context;

import com.cd.pigfarm.activity.MainActivity;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/3/22 21:17
 * @Description: 常用工具
 */
public class Utils {
    /**
     * 利用正则表达式判断字符串是否是数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        if (str == null || str.trim().equals("")){
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    public static double keep2Wdouble(double doubleNumber,int w){
        double number = doubleNumber;
        int   scale  =   w;//设置位数
        int   roundingMode  =  4;//表示四舍五入，可以选择其他舍值方式，例如去尾，等等.
        BigDecimal   bd  =   new BigDecimal((double)number);
        bd   =  bd.setScale(scale,roundingMode);
        number   =  bd.doubleValue();
        return number;
    }

    public static double quWei(double doubleNumber){
        int number = (int)doubleNumber;
        return number;
    }

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
