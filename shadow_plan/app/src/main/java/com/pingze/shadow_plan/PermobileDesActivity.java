package com.pingze.shadow_plan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 16-10-13.
 */
public class PermobileDesActivity extends AppCompatActivity {

    private TextView mTitleText;
    private TextView mPermobileDescribeOne;
    private TextView mPermobileDescribeTwo;
    private TextView mPermobileDescribeThree;

    private ImageView mPermobileDescribePic;
    private ImageView mOrderOne;
    private ImageView mOrderTwo;
    private ImageView mOrderThree;

    private LinearLayout mEverydayDescribeBodyOne;
    private LinearLayout mEverydayDescribeBodyTwo;
    private LinearLayout mEverydayDescribeBodyThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.permobile_describe);

        initUI();

    }

    private void initUI(){
        mTitleText = (TextView) findViewById(R.id.title_text);
        mPermobileDescribeOne = (TextView) findViewById(R.id.permobile_describe_one);
        mPermobileDescribeTwo = (TextView) findViewById(R.id.permobile_describe_two);
        mPermobileDescribeThree = (TextView) findViewById(R.id.permobile_describe_three);

        mPermobileDescribePic = (ImageView) findViewById(R.id.permobile_describe_pic);
        mOrderOne = (ImageView) findViewById(R.id.orderone);
        mOrderTwo = (ImageView) findViewById(R.id.ordertwo);
        mOrderThree = (ImageView) findViewById(R.id.orderthree);

        mEverydayDescribeBodyOne = (LinearLayout) findViewById(R.id.permobile_describe_body_one);
        mEverydayDescribeBodyTwo = (LinearLayout) findViewById(R.id.permobile_describe_body_two);
        mEverydayDescribeBodyThree = (LinearLayout) findViewById(R.id.permobile_describe_body_three);
    }
}
