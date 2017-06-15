package com.example.jirayu.senddataforuser;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    String yourName;
    String yourName1;
    String yourID;
    String image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button button = (Button) findViewById(R.id.button);

        SharedPreferences sharedPreferences = getSharedPreferences("jet", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =sharedPreferences.edit(); //editor ของ jet
        editor.putString("name","Elena");
        editor.putInt("idName",12);
        editor.commit(); //ป้องกันข้อมูลที่ใช้ร่วมกันหลายๆแอฟ



    }
    public void sendData(View view){
        ImageView image1 = (ImageView) findViewById(R.id.image1);



        EditText edittextName = (EditText) findViewById(R.id.EyourName); //ดึงค่าจากeditText มี r เพราะเราเอามาจากคลาสR
        yourName = edittextName.getText().toString();

        EditText edittextName1= (EditText) findViewById(R.id.editText2); //ดึงค่าจากeditText มี r เพราะเราเอามาจากคลาสR
        yourName1 = edittextName1.getText().toString();

        EditText edittextName2= (EditText) findViewById(R.id.editText); //ดึงค่าจากeditText มี r เพราะเราเอามาจากคลาสR
        yourID = edittextName2.getText().toString();

        Intent intent = new Intent(this,Main2Activity.class); //ส่งค่าไปหน้า2


        intent.putExtra("yourName",yourName);
        intent.putExtra("yourName1",yourName1);
        intent.putExtra("yourName2",yourID);
       startActivity(intent);
    }

}
