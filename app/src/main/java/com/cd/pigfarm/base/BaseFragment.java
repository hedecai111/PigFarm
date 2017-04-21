package com.cd.pigfarm.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cd.pigfarm.R;
import com.cd.pigfarm.activity.MainActivity;
import com.cd.pigfarm.activity.YfcActivity;
import com.cd.pigfarm.activity.ZzcActivity;
import com.cd.pigfarm.fragment.ClmzFragment;
import com.cd.pigfarm.fragment.TzgsFragment;
import com.cd.pigfarm.fragment.ZzysFragment;
import com.cd.pigfarm.fyfragment.ClspzsFragment;
import com.cd.pigfarm.fyfragment.TzgsYfcFragment;
import com.cd.pigfarm.util.Utils;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;

import java.util.List;

/**
 * @author hedecai
 * @version V1.0
 * @date 2017/4/9 11:49
 * @Description: 添加描述
 */
public class BaseFragment extends Fragment implements View.OnClickListener{

    public View view;

    public Validator validator;

    public FocusListener focusListener;

    public Button leftButton,rightButton,saveButton;

    private int time = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        validator = new Validator(this);
        validator.setValidationListener(new Listener());
        focusListener = new FocusListener();
    }
    /**
     *
     */
    public void bindButton(){
        leftButton = (Button) view.findViewById(R.id.left_But);
        rightButton = (Button) view.findViewById(R.id.right_But);
        saveButton = (Button) view.findViewById(R.id.save_But);
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
        saveButton.setOnClickListener(this);
        //jsDatas();
        //refreshViews();
    }

    @Override
    public void onResume() {
        super.onResume();
        jsDatas();
        refreshViews();
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (isVisibleToUser && view != null){
            jsDatas();
            refreshViews();
        }
    }

    /**
     * 初始化数据
     * @param view
     * @param text
     */
    public void saveData(EditText view, String text){

    }

    /**
     * 经过计算的出来的数据
     */
    public void jsDatas(){

    }

    /**
     * 刷新控件
     */
    public void refreshViews(){

    }

    class FocusListener implements View.OnFocusChangeListener{

        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (!hasFocus){
                if (v instanceof EditText){
                    EditText editText = (EditText)v;
                    String text = editText.getText().toString().trim();
                    if (!text.equals("")){
                        if (text.endsWith("%")){
                            text = text.substring(0,text.length()-1);
                        }
                        if (!text.endsWith("--")) {
                            saveData(editText, text);
                            jsDatas();
                            refreshViews();
                        }
                    }
                }
            }
        }
    }



    /**
     * @author  hedecai
     * @time    2017/4/5 14:12
     * @desc    输入框非空验证监听器
     */
    class Listener implements Validator.ValidationListener {

        @Override
        public void onValidationSucceeded() {
           /* View focusView = view.findFocus();
            if (focusView instanceof EditText){
                saveData((EditText)focusView,((EditText)focusView).getText().toString());
            }
            Activity activity = getActivity();
            if (activity instanceof ZzcActivity){
                ((ZzcActivity)activity).nextPage();
            }
            if (activity instanceof YfcActivity){
                ((YfcActivity)activity).nextPage();
            }*/

            Toast.makeText(getContext(),"保存成功", Toast.LENGTH_LONG).show();
            ((MainActivity)getActivity()).jsDatas();
        }

        @Override
        public void onValidationFailed(List<ValidationError> errors) {
            for (ValidationError error : errors){
                View view = error.getView();
                if (view instanceof EditText){
                    Toast.makeText(getContext(),"请输入必要的参数", Toast.LENGTH_LONG).show();
                    view.requestFocus();
                    return;
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
        if (v == leftButton){
            Activity activity = getActivity();
            if (activity instanceof ZzcActivity){
                if (this instanceof ClmzFragment){
                    getActivity().finish();
                }else {
                    ((ZzcActivity)activity).beforePage();
                }
            }
            if (activity instanceof YfcActivity){
                if (this instanceof ClspzsFragment){
                    getActivity().finish();
                }else {
                    ((YfcActivity)activity).beforePage();
                }

            }
        }else if (v == rightButton){

            if ( this instanceof TzgsFragment || this instanceof TzgsYfcFragment){
                Toast.makeText(getContext(),"当前已是最后一页",Toast.LENGTH_LONG).show();
            }else {
                validator.validate();
            }
        }
        else if (v == saveButton){
            validator.validate();
        }
    }
}
