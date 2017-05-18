package com.cd.pigfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cd.pigfarm.R;
import com.cd.pigfarm.base.BaseFragment;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/5/18 10:42
 * @Description: 关于我们
 */
public class AboutFragment extends BaseFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view = View.inflate(getContext(), R.layout.fragment_about,null);
        return view;
    }
}
