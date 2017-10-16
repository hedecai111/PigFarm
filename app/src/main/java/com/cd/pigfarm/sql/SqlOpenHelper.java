package com.cd.pigfarm.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.cd.pigfarm.entities.NzwEntity;
import com.cd.pigfarm.entities.SbEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/5/15 21:22
 * @Description: 数据库帮助类
 */
public class SqlOpenHelper extends SQLiteOpenHelper {


    public SqlOpenHelper(Context context){
        super(context,"pig_farm",null,1);

    }

    /**
     * 创建表
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        //增加农作物的SQL语句
        String sql1 = "create table nzwsdl (name varchar(50),sdl number);";
        db.execSQL(sql1);
        //增加设备参数
        String sql2 = "create table sbcs (zslx int,sbmc varchar(50),sbxh caechar(50),dw varchar(50),sl int,dj number);";
        db.execSQL(sql2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /**
     * 添加农作物
     * @param name
     * @param sdl
     * @return
     */
    public long addNzwsdl(String name,double sdl){
        SQLiteDatabase db = getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        contentValues.put("sdl",sdl);
        return db.insert("nzwsdl",null,contentValues);

    }

    /**
     * 查询所有的农作物
     * @return
     */
    public List<NzwEntity> queryAllNzw(){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query("nzwsdl",new String[]{"name","sdl"},"1=1",null,null,null,null,null);

        if (cursor != null && cursor.getCount() > 0){
            List<NzwEntity> list = new ArrayList<>();
            while (cursor.moveToNext()){
                NzwEntity nzwEntity = new NzwEntity();
                nzwEntity.setName(cursor.getString(0));
                nzwEntity.setSdl(cursor.getDouble(1));
                list.add(nzwEntity);
            }
            return list;
        }else {
            return null;
        }
    }

    /**
     * 添加设备
     *
     */
    public long addSb(int sblx,String sbmc,String sbxh,String dw,int sl,double dj){
        if (querySbByName(sbmc)){//如果是返回0，则说明已经添加过了
            return 0;
        }
        SQLiteDatabase db = getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("zslx",sblx);
        contentValues.put("sbmc",sbmc);
        contentValues.put("sbxh",sbxh);
        contentValues.put("dw",dw);
        contentValues.put("sl",sl);
        contentValues.put("dj",dj);
        return db.insert("sbcs",null,contentValues);

    }

    /**
     * 根据类型查询设备参数
     * @return
     */
    public List<SbEntity> querySbByLx(int sblx){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query("sbcs",new String[]{"zslx","sbmc","sbxh","dw","sl","dj"},"zslx="+sblx,null,null,null,null,null);

        if (cursor != null && cursor.getCount() > 0){
            List<SbEntity> list = new ArrayList<>();
            while (cursor.moveToNext()){
                SbEntity sbEntity = new SbEntity();
                sbEntity.setSblx(cursor.getInt(0));
                sbEntity.setSbmc(cursor.getString(1));
                sbEntity.setSbxh(cursor.getString(2));
                sbEntity.setDw(cursor.getString(3));
                sbEntity.setSl(cursor.getInt(4));
                sbEntity.setDj(cursor.getDouble(5));
                list.add(sbEntity);
            }
            return list;
        }else {
            return null;
        }
    }

    /**
     * 根据类型查询设备参数
     * @return
     */
    public List<SbEntity> queryAllSb(){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query("sbcs",new String[]{"zslx","sbmc","sbxh","dw","sl","dj"},null,null,null,null,null,null);

        if (cursor != null && cursor.getCount() > 0){
            List<SbEntity> list = new ArrayList<>();
            while (cursor.moveToNext()){
                SbEntity sbEntity = new SbEntity();
                sbEntity.setSblx(cursor.getInt(0));
                sbEntity.setSbmc(cursor.getString(1));
                sbEntity.setSbxh(cursor.getString(2));
                sbEntity.setDw(cursor.getString(3));
                sbEntity.setSl(cursor.getInt(4));
                sbEntity.setDj(cursor.getDouble(5));
                list.add(sbEntity);
            }
            cursor.close();
            return list;
        }else {
            if (cursor != null){
                cursor.close();
            }
            return null;
        }
    }

    public long updateSb(SbEntity sbEntity){
        SQLiteDatabase db = getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("zslx",sbEntity.getSblx());
        contentValues.put("sbmc",sbEntity.getSbmc());
        contentValues.put("sbxh",sbEntity.getSbxh());
        contentValues.put("dw",sbEntity.getDw());
        contentValues.put("sl",sbEntity.getSl());
        contentValues.put("dj",sbEntity.getDj());
        long count = db.update("sbcs",contentValues,"sbmc='"+sbEntity.getSbmc()+"' ",null);
        return count;
    }
    public boolean querySbByName(String name){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query("sbcs",new String[]{"zslx","sbmc","sbxh","dw","sl","dj"},"sbmc='"+name+"'",null,null,null,null,null);

        if (cursor != null && cursor.getCount() > 0){
            cursor.close();
            return true;
        }else {
            if (cursor != null)
                cursor.close();
            return false;
        }
    }

    /**
     * 删除所有数据
     */
    public void deleteAll(){
        SQLiteDatabase db = getReadableDatabase();
        db.delete("sbcs","1=1",null);
        db.delete("nzwsdl","1=1",null);
    }
}
