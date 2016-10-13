package com.pingze.shadow_plan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 16-10-13.
 */
public class TotalDesActivity extends AppCompatActivity {

    private TextView mTitleText;
    private TextView mTotalDescribeOne;
    private TextView mTotalDescribeTwo;

    private ImageView mTotalDescribePic;
    private ImageView mOrderOne;
    private ImageView mOrderTwo;

    private LinearLayout mTotalDescribeBodyOne;
    private LinearLayout mTotalDescribeBodyTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_describe);

        initUI();

    }

    private void initUI(){
        mTitleText = (TextView) findViewById(R.id.title_text);
        mTotalDescribeOne = (TextView) findViewById(R.id.total_describe_one);
        mTotalDescribeTwo = (TextView) findViewById(R.id.total_describe_two);

        mTotalDescribePic = (ImageView) findViewById(R.id.total_describe_pic);
        mOrderOne = (ImageView) findViewById(R.id.orderone);
        mOrderTwo = (ImageView) findViewById(R.id.ordertwo);

        mTotalDescribeBodyOne = (LinearLayout) findViewById(R.id.total_describe_body_one);
        mTotalDescribeBodyTwo = (LinearLayout) findViewById(R.id.total_describe_body_two);

    }
}
