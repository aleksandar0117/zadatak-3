package com.example.zadatak3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    TextView G;

    TextView O;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        G = (TextView) findViewById(R.id.textViewG);

        O = (TextView) findViewById(R.id.textViewO);
    }
    public void pritisakG(View v)
    {
        G.setText(G.getText() + " Pirot");
    }

    public void pritisakO(View v)
    {
        O.setText(O.getText() + " III5");
    }

}