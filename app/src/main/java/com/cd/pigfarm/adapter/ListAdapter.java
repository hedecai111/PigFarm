package com.cd.pigfarm.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cd.pigfarm.R;

import java.util.List;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/4/19 10:32
 * @Description: 菜单列表的适配器
 */
public class ListAdapter extends BaseAdapter {

    private List<String> datas;
    private Context context;

    private int selectPosition = 0;


    public ListAdapter(List<String> datas,Context context){
        this.datas = datas;
        this.context = context;
    }

    public List<String> getDatas() {
        return datas;
    }

    public void setDatas(List<String> datas) {
        this.datas = datas;
    }

    public int getSelectPosition() {
        return selectPosition;
    }

    public void setSelectPosition(int selectPosition) {
        this.selectPosition = selectPosition;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (datas != null)
            return datas.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = View.inflate(context, R.layout.menu_list_menu,null);
        }
        ((TextView)convertView).setText(datas.get(position));

        if (position == selectPosition){
            convertView.setBackgroundColor(Color.WHITE);
            ((TextView)convertView).setTextColor(context.getResources().getColor(R.color.titlebar_bg_color4));
        }else {
            convertView.setBackgroundColor(Color.TRANSPARENT);
            ((TextView)convertView).setTextColor(context.getResources().getColor(R.color.text_white));
        }
        return convertView;
    }
}
