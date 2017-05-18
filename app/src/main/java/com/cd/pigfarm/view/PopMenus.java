package com.cd.pigfarm.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

import com.cd.pigfarm.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

@SuppressLint({ "ResourceAsColor", "ShowToast" })
public class PopMenus {
	private Context context;
	private PopupWindow popupWindow;
	private LinearLayout listView;
	private int width, height;
	private View containerView;
	
	private OnItemClickListener itemClickListener;

	private String[] dataList;
	
	private int position;

	public PopMenus(Context context, String[] dataList, int _width, int _height) {
		this.context = context;
		this.dataList = dataList;
		this.width = _width;
		this.height = _height;
		containerView = LayoutInflater.from(context).inflate(R.layout.popmenus, null);
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, 1.0f);
		containerView.setLayoutParams(lp);
		listView = (LinearLayout) containerView.findViewById(R.id.layout_subcustommenu);
		try {
			setSubMenu();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listView.setBackgroundColor(R.color.black);
		listView.setFocusableInTouchMode(true);
		listView.setFocusable(true);

		popupWindow = new PopupWindow(containerView, width == 0 ? LayoutParams.WRAP_CONTENT : width, height == 0 ? LayoutParams.WRAP_CONTENT : height);
	}

	public void showAsDropDown(View parent) {
		popupWindow.setBackgroundDrawable(new ColorDrawable());
		popupWindow.showAsDropDown(parent);
		popupWindow.setOutsideTouchable(true);

		popupWindow.setFocusable(true);

		popupWindow.update();

		popupWindow.setOnDismissListener(new OnDismissListener() {


			@Override
			public void onDismiss() {
			}
		});
	}

	public void showAtLocation(View parent) {
		popupWindow.setBackgroundDrawable(new ColorDrawable());
		containerView.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
		int[] location = new int[2];
		parent.getLocationOnScreen(location);
		int x = location[0] - 5;
		int y = parent.getHeight() - (parent.getHeight() / 3);
		// Utils.toast(context, y +""); //location[1] - popupHeight -
		// parent.getHeight()
		popupWindow.showAtLocation(parent, Gravity.LEFT | Gravity.BOTTOM, x, y);


		popupWindow.setOutsideTouchable(true);

		popupWindow.setFocusable(true);

		popupWindow.update();

		popupWindow.setOnDismissListener(new OnDismissListener() {

			@Override
			public void onDismiss() {
			}
		});
	}

	public void dismiss() {
		popupWindow.dismiss();
	}

	void setSubMenu() throws JSONException {
		listView.removeAllViews();
		for (int i = 0; i < dataList.length; i++) {
			final int pos = i;
			LinearLayout layoutItem = (LinearLayout) ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.pomenu_menuitem, null);
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, 1.0f);
			containerView.setLayoutParams(lp);
			layoutItem.setFocusable(true);
			TextView tv_funbtntitle = (TextView) layoutItem.findViewById(R.id.pop_item_textView);
			View pop_item_line = layoutItem.findViewById(R.id.pop_item_line);
			if ((i + 1) == dataList.length) {
				pop_item_line.setVisibility(View.GONE);
			}
			tv_funbtntitle.setText(dataList[i]);
			layoutItem.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					if (itemClickListener != null) {
						itemClickListener.onItemClick(v, pos);
					}
					dismiss();

				}
			});
			listView.addView(layoutItem);
		}
		listView.setVisibility(View.VISIBLE);
	}
	
	public interface OnItemClickListener{
		public void onItemClick(View v, int position);
	}

	public OnItemClickListener getItemClickListener() {
		return itemClickListener;
	}

	public void setItemClickListener(OnItemClickListener itemClickListener) {
		this.itemClickListener = itemClickListener;
	}

    public String[] getDataList() {
        return dataList;
    }

    public void setDataList(String[] dataList) {
        this.dataList = dataList;
		try {
			setSubMenu();
		}catch (Exception e){

		}

    }
}
