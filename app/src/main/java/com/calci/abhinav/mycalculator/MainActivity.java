package com.calci.abhinav.mycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
    implements View.OnClickListener {
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0 = (Button) findViewById(R.id.a0);
        b0.setOnClickListener(this);
        Button b1 = (Button) findViewById(R.id.a1);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.a2);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.a3);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.a4);
        b4.setOnClickListener(this);
        Button b5 = (Button) findViewById(R.id.a5);
        b5.setOnClickListener(this);
        Button b6 = (Button) findViewById(R.id.a6);
        b6.setOnClickListener(this);
        Button b7 = (Button) findViewById(R.id.a7);
        b7.setOnClickListener(this);
        Button b8 = (Button) findViewById(R.id.a8);
        b8.setOnClickListener(this);
        Button b9 = (Button) findViewById(R.id.a9);
        b9.setOnClickListener(this);
        Button badd = (Button) findViewById(R.id.aadd);
        badd.setOnClickListener(this);
        Button bsub = (Button) findViewById(R.id.asub);
        bsub.setOnClickListener(this);
        Button bmulti = (Button) findViewById(R.id.amulti);
        bmulti.setOnClickListener(this);
        Button bdiv = (Button) findViewById(R.id.adiv);
        b0.setOnClickListener(this);
        Button bequ = (Button) findViewById(R.id.aequ);
        bequ.setOnClickListener(this);
        Button bpara = (Button) findViewById(R.id.apara);
        bpara.setOnClickListener(this);
        Button bboth = (Button) findViewById(R.id.aboth);
        bboth.setOnClickListener(this);
        Button bcut = (Button) findViewById(R.id.acut);
        bcut.setOnClickListener(this);
        Button bclear = (Button) findViewById(R.id.aclear);
        bclear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView) findViewById(R.id.tv1);

        int id=v.getId();
        String str ="";
        while(id!=R.id.aequ) {
            switch (id) {
                case R.id.a0:
                    str = str + "0";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.a1:
                    str = str + "1";
                    tv.setText(String.valueOf(str));
                    break;

                case R.id.a2:
                    str = str + "2";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.a3:
                    str = str + "3";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.a4:
                    str = str + "4";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.a5:
                    str = str + "5";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.a6:
                    str = str + "6";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.a7:
                    str = str + "7";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.a8:
                    str = str + "8";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.a9:
                    str = str + "9";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.aadd:
                    str = str + "+";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.asub:
                    str = str + "-";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.amulti:
                    str = str + "*";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.adiv:
                    str = str + "/";
                    tv.setText(String.valueOf(str));
                    break;
                case R.id.aclear:
                    str = "";
                    tv.setText(String.valueOf(str));
                    break;
            }
        }

        String str1= tv.getText().toString();


    }
}