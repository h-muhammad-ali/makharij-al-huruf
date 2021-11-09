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
        button28 = findViewById(R.id.ya);
        button28.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        Button button = (Button)v;
        switch (v.getId()){
            case R.id.alif:
                Intent intent1 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent1.putExtra("image", R.drawable.halqiyah);
                intent1.putExtra("emission", "Sound produced from the End of Throat");
                intent1.putExtra("letter", button.getText().toString());
                intent1.putExtra("type", "حرف حلقیہ");
                startActivity(intent1);
                break;
            case R.id.ba:
                Intent intent2 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent2.putExtra("image", R.drawable.shafaviyah);
                intent2.putExtra("emission", "Inner part of the both lips touch each other");
                intent2.putExtra("letter", button.getText().toString());
                intent2.putExtra("type", "حرف شفويہ");
                startActivity(intent2);
                break;
            case R.id.ta:
                Intent intent3 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent3.putExtra("image", R.drawable.niteeyah);
                intent3.putExtra("emission", "Tip of the tongue touching the base of the front 2 teeth");
                intent3.putExtra("letter", button.getText().toString());
                intent3.putExtra("type", "حرف نطعيہ");
                startActivity(intent3);
                break;
            case R.id.tha:
                Intent intent4 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent4.putExtra("image", R.drawable.lisaveyah);
                intent4.putExtra("emission", "Tip of the tongue touching the tip of the frontal 2 teeth");
                intent4.putExtra("letter", button.getText().toString());
                intent4.putExtra("type", "حرف لثویہ");
                startActivity(intent4);
                break;
            case R.id.jeem:
                Intent intent5 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent5.putExtra("image", R.drawable.shajariyahhaafiyah);
                intent5.putExtra("emission", "Tongue touching the center of the mouth roof");
                intent5.putExtra("letter", button.getText().toString());
                intent5.putExtra("type", "حرف شجریہ");
                startActivity(intent5);
                break;
            case R.id.ha:
                Intent intent6 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent6.putExtra("image", R.drawable.halqiyah);
                intent6.putExtra("emission", "Sound produced from the Middle of Throat");
                intent6.putExtra("letter", button.getText().toString());
                intent6.putExtra("type", "حرف حلقیہ");
                startActivity(intent6);
                break;
            case R.id.kha:
                Intent intent7 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent7.putExtra("image", R.drawable.halqiyah);
                intent7.putExtra("emission", "Sound produced from the Start of Throat");
                intent7.putExtra("letter", button.getText().toString());
                intent7.putExtra("type", "حرف حلقیہ");
                startActivity(intent7);
                break;
            case R.id.daal:
                Intent intent8 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent8.putExtra("image", R.drawable.niteeyah);
                intent8.putExtra("emission", "Tip of the tongue touching the base of the front 2 teeth");
                intent8.putExtra("letter", button.getText().toString());
                intent8.putExtra("type", "حرف نطعيہ");
                startActivity(intent8);
                break;
            case R.id.zaal:
                Intent intent9 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent9.putExtra("image", R.drawable.lisaveyah);
                intent9.putExtra("emission", "Tip of the tongue touching the tip of the frontal 2 teeth");
                intent9.putExtra("letter", button.getText().toString());
                intent9.putExtra("type", "حرف لثویہ");
                startActivity(intent9);
                break;
            case R.id.ra:
                Intent intent10 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent10.putExtra("image", R.drawable.tarfiyah);
                intent10.putExtra("emission", "Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
                intent10.putExtra("letter", button.getText().toString());
                intent10.putExtra("type", "حرف طرفیہ");
                startActivity(intent10);
                break;
            case R.id.za:
                Intent intent11 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent11.putExtra("image", R.drawable.safariyah);
                intent11.putExtra("emission", "Tip of the tongue comes between the front top and bottom teeth");
                intent11.putExtra("letter", button.getText().toString());
                intent11.putExtra("type", "حرف صفيريہ");
                startActivity(intent11);
                break;
            case R.id.sin:
                Intent intent12 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent12.putExtra("image", R.drawable.safariyah);
                intent12.putExtra("emission", "Tip of the tongue comes between the front top and bottom teeth");
                intent12.putExtra("letter", button.getText().toString());
                intent12.putExtra("type", "حرف صفيريہ");
                startActivity(intent12);
                break;
            case R.id.shin:
                Intent intent13 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent13.putExtra("image", R.drawable.shajariyahhaafiyah);
                intent13.putExtra("emission", "Tongue touching the center of the mouth roof");
                intent13.putExtra("letter", button.getText().toString());
                intent13.putExtra("type", "حرف شجریہ");
                startActivity(intent13);
                break;
            case R.id.sad:
                Intent intent14 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent14.putExtra("image", R.drawable.safariyah);
                intent14.putExtra("emission", "Tip of the tongue comes between the front top and bottom teeth");
                intent14.putExtra("letter", button.getText().toString());
                intent14.putExtra("type", "حرف صفيريہ");
                startActivity(intent14);
                break;
            case R.id.zad:
                Intent intent15 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent15.putExtra("image", R.drawable.shajariyahhaafiyah);
                intent15.putExtra("emission", "One side of the tongue touching the molar teeth");
                intent15.putExtra("letter", button.getText().toString());
                intent15.putExtra("type", "حرف حافیہ");
                startActivity(intent15);
                break;
            case R.id.taa:
                Intent intent16 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent16.putExtra("image", R.drawable.niteeyah);
                intent16.putExtra("emission", "Tip of the tongue touching the base of the front 2 teeth");
                intent16.putExtra("letter", button.getText().toString());
                intent16.putExtra("type", "حرف نطعيہ");
                startActivity(intent16);
                break;
            case R.id.zaa:
                Intent intent17 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent17.putExtra("image", R.drawable.lisaveyah);
                intent17.putExtra("emission", "Tip of the tongue touching the tip of the frontal 2 teeth");
                intent17.putExtra("letter", button.getText().toString());
                intent17.putExtra("type", "حرف لثویہ");
                startActivity(intent17);
                break;
            case R.id.ayn:
                Intent intent18 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent18.putExtra("image", R.drawable.halqiyah);
                intent18.putExtra("emission", "Sound produced from the Middle of Throat");
                intent18.putExtra("letter", button.getText().toString());
                intent18.putExtra("type", "حرف حلقیہ");
                startActivity(intent18);
                break;
            case R.id.gayn:
                Intent intent19 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent19.putExtra("image", R.drawable.halqiyah);
                intent19.putExtra("emission", "Sound produced from the Start of Throat");
                intent19.putExtra("letter", button.getText().toString());
                intent19.putExtra("type", "حرف حلقیہ");
                startActivity(intent19);
                break;
            case R.id.fa:
                Intent intent20 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent20.putExtra("image", R.drawable.shafaviyah);
                intent20.putExtra("emission", "Tip of the two upper jaw teeth touches the inner part of the lower lip");
                intent20.putExtra("letter", button.getText().toString());
                intent20.putExtra("type", "حرف شفويہ");
                startActivity(intent20);
                break;
            case R.id.qaf:
                Intent intent21 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent21.putExtra("image", R.drawable.lahatiyah);
                intent21.putExtra("emission", "Base of Tongue which is near Uvula touching the mouth roof");
                intent21.putExtra("letter", button.getText().toString());
                intent21.putExtra("type", "حرف لہاتیہ");
                startActivity(intent21);
                break;
            case R.id.kaf:
                Intent intent22 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent22.putExtra("image", R.drawable.lahatiyah);
                intent22.putExtra("emission", "Portion of Tongue near its base touching the roof of mouth");
                intent22.putExtra("letter", button.getText().toString());
                intent22.putExtra("type", "حرف لہاتیہ");
                startActivity(intent22);
                break;
            case R.id.lam:
                Intent intent23 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent23.putExtra("image", R.drawable.tarfiyah);
                intent23.putExtra("emission", "Rounded tip of the tongue touching the base of the frontal 8 teeth");
                intent23.putExtra("letter", button.getText().toString());
                intent23.putExtra("type", "حرف طرفیہ");
                startActivity(intent23);
                break;
            case R.id.meem:
                Intent intent24 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent24.putExtra("image", R.drawable.shafaviyah);
                intent24.putExtra("emission", "Outer part of both lips touch each other");
                intent24.putExtra("letter", button.getText().toString());
                intent24.putExtra("type", "حرف شفويہ , م غنه");
                startActivity(intent24);
                break;
            case R.id.noon:
                Intent intent25 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent25.putExtra("image", R.drawable.tarfiyah);
                intent25.putExtra("emission", "Rounded tip of the tongue touching the base of the frontal 6 teeth");
                intent25.putExtra("letter", button.getText().toString());
                intent25.putExtra("type", "حرف طرفیہ , ن غنه");
                startActivity(intent25);
                break;
            case R.id.wow:
                Intent intent26 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent26.putExtra("image", R.drawable.shafaviyah);
                intent26.putExtra("emission", "Rounding both lips and not closing the mouth");
                intent26.putExtra("letter", button.getText().toString());
                intent26.putExtra("type", "حرف شفويہ");
                startActivity(intent26);
                break;
            case R.id.haa:
                Intent intent27 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent27.putExtra("image", R.drawable.halqiyah);
                intent27.putExtra("emission", "Sound produced from the End of Throat");
                intent27.putExtra("letter", button.getText().toString());
                intent27.putExtra("type", "حرف حلقیہ");
                startActivity(intent27);
                break;
            case R.id.ya:
                Intent intent28 = new Intent(Alphabet.this, AlphabetDetails.class);
                intent28.putExtra("image", R.drawable.shajariyahhaafiyah);
                intent28.putExtra("emission", "Tongue touching the center of the mouth roof");
                intent28.putExtra("letter", button.getText().toString());
                intent28.putExtra("type", "حرف شجریہ");
                startActivity(intent28);
                break;
        }
    }
}