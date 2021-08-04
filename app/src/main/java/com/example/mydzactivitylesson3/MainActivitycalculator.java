package com.example.mydzactivitylesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivitycalculator extends AppCompatActivity {
private Counters counters;


    private TextView textCounter1;
    private TextView textCounter2;
    private TextView textCounter3;
    private TextView textCounter4;
    private TextView textCounter5;
    private TextView textCounter6;
    private TextView textCounter7;
    private TextView textCounter8;
    private TextView textCounter9;
    private TextView textCounter0;
    private TextView textCounterDELE;
    private TextView textCounterYM;
    private TextView textCounterRAV;
    private TextView textCounterPlus;
    private TextView textCounterMinus;
    private TextView textCounterTOCHKA;

    public MainActivitycalculator() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitycalculator);
        counters = new Counters();
        initView();
    }

    private void initView() {

        textCounter1 = findViewById(R.id.textView1);
        textCounter2 = findViewById(R.id.textView2) ;
         textCounter3 = findViewById(R.id.textViwe3);
        textCounter4 = findViewById(R.id.textView4);
        textCounter5 = findViewById(R.id.textView5) ;
        textCounter6 = findViewById(R.id.textViwe6);
        textCounter7 = findViewById(R.id.textView7);
        textCounter8 = findViewById(R.id.textView8) ;
        textCounter9 = findViewById(R.id.textViwe9);
        textCounter0 = findViewById(R.id.textView0);
        textCounterDELE = findViewById(R.id.textViewDELE) ;
        textCounterYM = findViewById(R.id.textViweYM);
        textCounterRAV = findViewById(R.id.textViewRAV);
        textCounterPlus = findViewById(R.id.textViewPlus) ;
        textCounterMinus = findViewById(R.id.textViweMinus);
        textCounterTOCHKA = findViewById(R.id.textViweTOCHKA);
        initButton1ClickListener();
    }

    private void initButton1ClickListener() {
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this::onClick);
    }
    public void butto0_onClick(View view) {

        counters.incrementcounter0();
        setTextCounter(textCounter0,
                counters.getCounter0());
    }

    public void buttoTOCHKA_onClick(View view) {
        counters.incrementTOCHKA();
        setTextCounter(textCounterTOCHKA, counters.getTOCHKA());
    }

    public void butto9_onClick(View view) {
        counters.incrementCounter9();
        setTextCounter(textCounter9, counters.getCounter9());
    }

    public void butto8_onClick(View view) {
        counters.incrementCounter8();
        setTextCounter(textCounter8,
                counters.getCounter8());
    }

    public void butto7_onClick(View view) {
        counters.incrementCounter7();
        setTextCounter(textCounter7, counters.getCounter7());
    }

    public void butto6_onClick(View view) {
        counters.incrementCounter6();
        setTextCounter(textCounter6, counters.getCounter6());
    }


    public void butto5_onClick(View view) {
       counters.incrementCounter5();
        setTextCounter(textCounter5, counters.getCounter5());
    }

    public void butto4_onClick(View view) {
        counters.incrementCounter4();
        setTextCounter(textCounter4, counters.getCounter4());
    }

    public void butto3_onClick(View view) {
        counters.incrementCounter3();
        setTextCounter(textCounter3, counters.getCounter3());
    }

    public void butto2_onClick(View view) {
       counters.incrementCounter2();
        setTextCounter(textCounter2, counters.getCounter2());
    }



    public void buttominus_onClick(View view) {
        counters.incrementMinus();
        setTextCounter(textCounterMinus, counters.getMinus());
    }

    public void buttoPlus_onClick(View view) {

        counters.incrementPlus();
        setTextCounter(textCounterPlus, counters.getPlus());
    }

    public void buttoRAV_onClick(View view) {
        counters.incrementRAV();
        setTextCounter(textCounterRAV, counters.getRAV());
    }

    public void buttoYM_onClick(View view) {
        counters.incrementYM();
        setTextCounter(textCounterYM, counters.getYM());
    }

    public void buttoDELE_onClick(View view) {
      counters.incrementDELE();
        setTextCounter(textCounterDELE, counters.getDELE());
    }

    private void setTextCounter(TextView textCounter, int counter){
        textCounter.setText(String.format(Locale.getDefault(), "%d", counter));
    }


    private void onClick(View v) {

        counters.incrementCounter1();
        setTextCounter(textCounter1, counters.getCounter1());

    }
}