package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartMenu extends AppCompatActivity implements View.OnClickListener{

    TextView urduTitle;
    TextView englishTitle;
    Button practice;
    Button quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
        urduTitle = findViewById(R.id.urduTitle);
        urduTitle.setText("مخارج الحروف");
        englishTitle = findViewById(R.id.englishTitle);
        englishTitle.setText("Makharij-al-Huruf");
        practice = findViewById(R.id.practice);
        practice.setOnClickListener(this);
        quiz = findViewById(R.id.quiz);
        quiz.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.practice:
                Intent intent = new Intent(StartMenu.this, Alphabet.class);
                startActivity(intent);
                break;
            case R.id.quiz:
                Intent intent1 = new Intent(StartMenu.this, QuizUI.class);
                startActivity(intent1);
                break;
        }
    }
}