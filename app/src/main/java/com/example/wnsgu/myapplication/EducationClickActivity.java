package com.example.wnsgu.myapplication;


import android.app.Activity;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EducationClickActivity extends Activity{
    ImageView iv;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.education_click);

        iv = (ImageView)findViewById(R.id.STAR);
        iv.setOnClickListener(new MyListener());
    }
    class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            if(num==0)
            {
                iv.setImageResource(R.drawable.star2);
                num++;
            }
            else
            {
                iv.setImageResource(R.drawable.star1);
                num--;
            }
        }
    }

}
