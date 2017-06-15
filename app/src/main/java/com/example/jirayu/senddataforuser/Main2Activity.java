package com.example.jirayu.senddataforuser;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences sharedPreferences = getSharedPreferences("jet", Context.MODE_PRIVATE);
        String sharedYour = sharedPreferences.getString("name"," ");

        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName"); //รับค่ามาเก็บไว้ในตัวแปรstring รับแบบextrea
        String name1 = intent.getStringExtra("yourName1"); //รับค่ามาเก็บไว้ในตัวแปรstring รับแบบextrea
        String nameID = intent.getStringExtra("yourName2"); //รับค่ามาเก็บไว้ในตัวแปรstring รับแบบextrea

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
       

        textView.setText(name);
        textView3.setText(name1);
        textView2.setText(nameID);



    }

}
