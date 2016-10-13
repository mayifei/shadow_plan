package com.pingze.shadow_plan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by mayifei on 16-10-13.
 */
public class EverydayDesActivity extends AppCompatActivity {

    private TextView mTitleText;
    private TextView mEverydayDescribeOne;
    private TextView mEverydayDescribeTwo;

    private ImageView mEverydayDescribePic;
    private ImageView mOrderOne;
    private ImageView mOrderTwo;

    private LinearLayout mEverydayDescribeBodyOne;
    private LinearLayout mEverydayDescribeBodyTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.everyday_describe);

        initUI();

    }

    private void initUI(){
        mTitleText = (TextView) findViewById(R.id.title_text);
        mEverydayDescribeOne = (TextView) findViewById(R.id.everyday_describe_one);
        mEverydayDescribeTwo = (TextView) findViewById(R.id.everyday_describe_two);

        mEverydayDescribePic = (ImageView) findViewById(R.id.everyday_describe_pic);
        mOrderOne = (ImageView) findViewById(R.id.orderone);
        mOrderTwo = (ImageView) findViewById(R.id.ordertwo);

        mEverydayDescribeBodyOne = (LinearLayout) findViewById(R.id.everyday_describe_body_one);
        mEverydayDescribeBodyTwo = (LinearLayout) findViewById(R.id.everyday_describe_body_two);

    }

}
