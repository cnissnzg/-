package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class TeacherMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_main);
        MainActivity.instance.finish();
        ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(new View.OnClickListener( ){
            @Override
            public void onClick(View v) {
                //Toast.makeText(TeacherMainActivity.this,"",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TeacherMainActivity.this,TeacherQuestionActivity.class);
                //Intent intent = new Intent(TeacherMainActivity.this,DMTest.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener( ){
            @Override
            public void onClick(View v) {
                //Toast.makeText(TeacherMainActivity.this,"",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TeacherMainActivity.this,ForumMainActivity.class);
                intent.putExtra("search_info","");
                startActivity(intent);
            }
        });
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener( ){
            @Override
            public void onClick(View v) {
                //Toast.makeText(TeacherMainActivity.this,"",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TeacherMainActivity.this,ScoreManageActivity.class);
                intent.putExtra("search_info","");
                startActivity(intent);
            }
        });
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener( ){
           @Override
           public void onClick(View v) {
               //Toast.makeText(TeacherMainActivity.this,"进入账户管理",Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(TeacherMainActivity.this,mineinfo.class);
               startActivity(intent);
           }
        });
        ImageButton imageButton7 = (ImageButton)findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherMainActivity.this,course.class);
                intent.putExtra("teacher",true);
                startActivity(intent);
            }
        });
        ImageButton imageButton6 = (ImageButton)findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherMainActivity.this,OnAirAccess.class);
                //Intent intent = new Intent(TeacherMainActivity.this,OnAirOpen.class);
                //intent.putExtra("user_name",getIntent().getStringExtra("user_name"));
                startActivity(intent);
            }
        });
        ImageButton imageButton8 = (ImageButton)findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherMainActivity.this,uploadTest.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton9 = (ImageButton)findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherMainActivity.this,OnAirOpen.class);
                intent.putExtra("user_name",getIntent().getStringExtra("user_name"));
                startActivity(intent);
            }
        });
    }
}
