package com.pingze.shadow_plan;

/**
 * Created by mayifei on 16-10-10.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EditNumberEverydayActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTitleText;
    private TextView mConfirm;

    private EditText mEditImei;
    private EditText mEditDate;
    private EditText mNumberText;

    private LinearLayout mEverydayLayout;
    private LinearLayout mPermobileLayout;
    private LinearLayout mTotalLayout;

    private ImageView mEverydayImageIcon;
    private ImageView mPermobileImageIcon;
    private ImageView mTotalImageIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_number_everyday);

        initUI();

    }

    private void initUI() {
        mTitleText = (TextView) findViewById(R.id.title_text);
        mConfirm = (TextView) findViewById(R.id.confirm);
        mConfirm.setOnClickListener(this);
        mEditImei = (EditText) findViewById(R.id.edit_imei);
        mEditDate = (EditText) findViewById(R.id.edit_date);
        mNumberText = (EditText) findViewById(R.id.number_text);

        mEverydayLayout = (LinearLayout) findViewById(R.id.everyday_number);
        mEverydayLayout.setOnClickListener(this);
        mEverydayImageIcon = (ImageView) mEverydayLayout.findViewById(R.id.image_icon);
        mEverydayImageIcon.setImageResource(R.drawable.editicon_click_selector);

        mPermobileLayout = (LinearLayout) findViewById(R.id.permoblie_number);
        mPermobileLayout.setOnClickListener(this);
        mPermobileImageIcon = (ImageView) mPermobileLayout.findViewById(R.id.image_icon);
        mPermobileImageIcon.setImageResource(R.drawable.editicon_click_selector);

        mTotalLayout = (LinearLayout) findViewById(R.id.total_number);
        mTotalLayout.setOnClickListener(this);
        mTotalImageIcon = (ImageView) mTotalLayout.findViewById(R.id.image_icon);
        mTotalImageIcon.setImageResource(R.drawable.editicon_click_selector);


    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.confirm:

                break;
            case R.id.everyday_number:
                intent = new Intent(this, EverydayDesActivity.class);
                startActivity(intent);
                break;
            case R.id.permoblie_number:
                intent = new Intent(this, PermobileDesActivity.class);
                startActivity(intent);
                break;
            case R.id.total_number:
                intent = new Intent(this, TotalDesActivity.class);
                startActivity(intent);
                break;

        }
    }
}
