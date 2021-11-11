package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView name;
    TextView roll;
    Button app;
    Button repo;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        roll = findViewById(R.id.rollNo);
        app = findViewById(R.id.app);
        app.setOnClickListener(this);
        repo = findViewById(R.id.repo);
        repo.setOnClickListener(this);
        imageView = findViewById(R.id.imageView);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.app:
                Intent intent = new Intent(MainActivity.this, StartMenu.class);
                startActivity(intent);
                break;
            case R.id.repo:
                String url = "https://github.com/mali-ai/makharij-al-huruf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
        }
    }
}