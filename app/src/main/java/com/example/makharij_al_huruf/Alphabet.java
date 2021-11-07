package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet extends AppCompatActivity implements View.OnClickListener{
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;
    Button button28;
    Button button29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        button1 = findViewById(R.id.alif);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.ba);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.ta);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.tha);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.jeem);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.ha);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.kha);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.daal);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.zaal);
        button9.setOnClickListener(this);
        button10 = findViewById(R.id.ra);
        button10.setOnClickListener(this);
        button11 = findViewById(R.id.za);
        button11.setOnClickListener(this);
        button12 = findViewById(R.id.sin);
        button12.setOnClickListener(this);
        button13 = findViewById(R.id.shin);
        button13.setOnClickListener(this);
        button14 = findViewById(R.id.sad);
        button14.setOnClickListener(this);
        button15 = findViewById(R.id.zad);
        button15.setOnClickListener(this);
        button16 = findViewById(R.id.taa);
        button16.setOnClickListener(this);
        button17 = findViewById(R.id.zaa);
        button17.setOnClickListener(this);
        button18 = findViewById(R.id.ayn);
        button18.setOnClickListener(this);
        button19 = findViewById(R.id.gayn);
        button19.setOnClickListener(this);
        button20 = findViewById(R.id.fa);
        button20.setOnClickListener(this);
        button21 = findViewById(R.id.qaf);
        button21.setOnClickListener(this);
        button22 = findViewById(R.id.kaf);
        button22.setOnClickListener(this);
        button23 = findViewById(R.id.lam);
        button23.setOnClickListener(this);
        button24 = findViewById(R.id.meem);
        button24.setOnClickListener(this);
        button25 = findViewById(R.id.noon);
        button25.setOnClickListener(this);
        button26 = findViewById(R.id.wow);
        button26.setOnClickListener(this);
        button27 = findViewById(R.id.haa);
        button27.setOnClickListener(this);
        button28 = findViewById(R.id.hamza);
        button28.setOnClickListener(this);
        button29 = findViewById(R.id.ya);
        button29.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.alif:
                Intent intent1 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent1);
                break;
            case R.id.ba:
                Intent intent2 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent2);
                break;
            case R.id.ta:
                Intent intent3 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent3);
                break;
            case R.id.tha:
                Intent intent4 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent4);
                break;
            case R.id.jeem:
                Intent intent5 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent5);
                break;
            case R.id.ha:
                Intent intent6 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent6);
                break;
            case R.id.kha:
                Intent intent7 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent7);
                break;
            case R.id.daal:
                Intent intent8 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent8);
                break;
            case R.id.zaal:
                Intent intent9 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent9);
                break;
            case R.id.ra:
                Intent intent10 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent10);
                break;
            case R.id.za:
                Intent intent11 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent11);
                break;
            case R.id.sin:
                Intent intent12 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent12);
                break;
            case R.id.shin:
                Intent intent13 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent13);
                break;
            case R.id.sad:
                Intent intent14 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent14);
                break;
            case R.id.zad:
                Intent intent15 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent15);
                break;
            case R.id.taa:
                Intent intent16 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent16);
                break;
            case R.id.zaa:
                Intent intent17 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent17);
                break;
            case R.id.ayn:
                Intent intent18 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent18);
                break;
            case R.id.gayn:
                Intent intent19 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent19);
                break;
            case R.id.fa:
                Intent intent20 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent20);
                break;
            case R.id.qaf:
                Intent intent21 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent21);
                break;
            case R.id.kaf:
                Intent intent22 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent22);
                break;
            case R.id.lam:
                Intent intent23 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent23);
                break;
            case R.id.meem:
                Intent intent24 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent24);
                break;
            case R.id.noon:
                Intent intent25 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent25);
                break;
            case R.id.wow:
                Intent intent26 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent26);
                break;
            case R.id.haa:
                Intent intent27 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent27);
                break;
            case R.id.hamza:
                Intent intent28 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent28);
                break;
            case R.id.ya:
                Intent intent29 = new Intent(Alphabet.this, AlphabetDetails.class);
                startActivity(intent29);
                break;
        }
    }
}