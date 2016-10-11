package com.pingze.shadow_plan;

/**
 * Created by mayifei on 16-10-10.
 */

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EditNumberEverydayActivity extends AppCompatActivity {

    private TextView mTitleText;
    private TextView mConfirm;

    private EditText mEditImei;
    private EditText mEditDate;
    private EditText mNumberText;

    private LinearLayout mEverydayLayout;
    private LinearLayout mPermobileLayout;
    private LinearLayout mTotalLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_number_everyday);

        initUI();

    }

    private void initUI(){
        mTitleText = (TextView) findViewById(R.id.title_text);
        mConfirm = (TextView) findViewById(R.id.confirm);
//        mConfirm.setOnClickListener(this);
        mEditImei = (EditText) findViewById(R.id.edit_imei);
        mEditDate = (EditText) findViewById(R.id.edit_date);
        mNumberText = (EditText) findViewById(R.id.number_text);

    }

}
