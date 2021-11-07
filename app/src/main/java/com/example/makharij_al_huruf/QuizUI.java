package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class QuizUI extends AppCompatActivity implements View.OnClickListener{
    Map<String, String> table = new HashMap<String, String>(){{ put("أ", "Sound produced from the End of Throat");
        put("ب", "Sound produced from Inner part of the both lips touch each other");
        put("ت", "Sound produced from Tip of the tongue touching the base of the front 2 teeth");
        put("ث", "Sound produced from Tip of the tongue touching the tip of the frontal 2 teeth");
        put("ج", "Sound produced from Tongue touching the center of the mouth roof");
        put("ح", "Sound produced from the Middle of Throat");
        put("خ", "Sound produced from the Start of Throat");
        put("د", "Sound produced from Tip of the tongue touching the base of the front 2 teeth");
        put("ذ", "Sound produced from Tip of the tongue touching the tip of the frontal 2 teeth");
        put("ر", "Sound produced from Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
        put("ز", "Sound produced from Tip of the tongue comes between the front top and bottom teeth");
        put("س", "Sound produced from Tip of the tongue comes between the front top and bottom teeth");
        put("ش", "Sound produced from Tongue touching the center of the mouth roof");
        put("ص", "Sound produced from Tip of the tongue comes between the front top and bottom teeth");
        put("ض", "Sound produced from One side of the tongue touching the molar teeth");
        put("ط", "Sound produced from Tip of the tongue touching the base of the front 2 teeth");
        put("ظ", "Sound produced from Tip of the tongue touching the tip of the frontal 2 teeth");
        put("ع", "Sound produced from the Middle of Throat");
        put("غ", "Sound produced from the Start of Throat");
        put("ف", "Sound produced from Tip of the two upper jaw teeth touches the inner part of the lower lip");
        put("ق", "Sound produced from Base of Tongue which is near Uvula touching the mouth roof");
        put("ك", "Sound produced from Portion of Tongue near its base touching the roof of mouth");
        put("ل", "Sound produced from Rounded tip of the tongue touching the base of the frontal 8 teeth");
        put("م", "Sound produced from Outer part of both lips touch each other");
        put("ن", "Sound produced from Rounded tip of the tongue touching the base of the frontal 6 teeth");
        put("و", "Sound produced from Rounding both lips and not closing the mouth");
        put("ه", "Sound produced from the End of Throat");
        put("ي", "Sound produced from Tongue touching the center of the mouth roof");}};
    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    int counter = 1;
    List<String> valueList = new ArrayList<String>(table.values());
    List<String> keyList = new ArrayList<String>(table.keySet());
    List<String> optionList = new ArrayList<String>();
    Random generator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_ui);
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.optionA);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.optionB);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.optionC);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.optionD);
        button4.setOnClickListener(this);
        generateQuestion();
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.optionA:
            case R.id.optionB:
            case R.id.optionC:
            case R.id.optionD:
                verifyAnswer(v);
                if(counter < 10) {
                    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
                    service.schedule(this::generateQuestion, 2, TimeUnit.SECONDS);
                    counter++;
                }else{
                    //Move to next activity
                }
                break;
        }
    }

    public void verifyAnswer(View v){
        if(table.get(textView.getText().toString()) == ((Button)v).getText()){
            v.setBackgroundColor(getResources().getColor(R.color.correct));
        }
        else{
            v.setBackgroundColor(getResources().getColor(R.color.wrong));
            if(table.get(textView.getText().toString()) == (button1.getText())){
                button1.setBackgroundColor(getResources().getColor(R.color.correct));
            }else if(table.get(textView.getText().toString()) == (button2.getText())){
                button2.setBackgroundColor(getResources().getColor(R.color.correct));
            }else if(table.get(textView.getText().toString()) == (button3.getText())){
                button3.setBackgroundColor(getResources().getColor(R.color.correct));
            }else{
                button4.setBackgroundColor(getResources().getColor(R.color.correct));
            }
        }
    }


    public void generateQuestion(){
        button1.setBackgroundColor(new Button(this).getHighlightColor());
        button2.setBackgroundColor(new Button(this).getHighlightColor());
        button3.setBackgroundColor(new Button(this).getHighlightColor());
        button4.setBackgroundColor(new Button(this).getHighlightColor());
        int randomIndex = generator.nextInt(keyList.size());
        String randomQuestion = keyList.get(randomIndex);
        textView.setText(randomQuestion);
        List<String> optionList = new ArrayList<String>();
        optionList.add(valueList.get(randomIndex));
        optionList.add(valueList.get(generator.nextInt(valueList.size())));
        optionList.add(valueList.get(generator.nextInt(valueList.size())));
        optionList.add(valueList.get(generator.nextInt(valueList.size())));
        Collections.shuffle(optionList);
        button1.setText(optionList.get(0));
        button2.setText(optionList.get(1));
        button3.setText(optionList.get(2));
        button4.setText(optionList.get(3));
    }
}