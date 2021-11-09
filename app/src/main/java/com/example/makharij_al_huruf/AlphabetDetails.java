package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AlphabetDetails extends AppCompatActivity {

    ImageView imageView;
    TextView name;
    TextView type;
    TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_details);
        imageView = findViewById(R.id.makhrijImage);
        name = findViewById(R.id.makhrijName);
        type = findViewById(R.id.type);
        details = findViewById(R.id.makhrijDetails);
        imageView.setImageResource(getIntent().getExtras().getInt("image"));
        name.setText(getIntent().getExtras().getString("letter"));
        type.setText(getIntent().getExtras().getString("type"));
        details.setText(getIntent().getExtras().getString("emission"));
    }
}