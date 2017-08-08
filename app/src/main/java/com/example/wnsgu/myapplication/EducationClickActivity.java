package com.example.wnsgu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by yeonjin on 2017-08-08.
 */

public class EducationClickActivity extends Activity implements ImageView.OnClickListener{

    public ImageView iv = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.education_click);

        iv = (ImageView) findViewById(R.id.STAR);
        iv.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        iv.setImageResource(R.drawable.star2);
    }
}


