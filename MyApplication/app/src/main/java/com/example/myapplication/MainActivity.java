package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etfirstnumber = findViewById(R.id.editTextFirstNumber);
        EditText etsecondnumber = findViewById(R.id.editTextSecondNumber);
        TextView textResult = findViewById(R.id.textViewResult);
        Button calc = findViewById(R.id.buttonCalc);
        Button calc2 = findViewById(R.id.buttonCalc2);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texta = etfirstnumber.getText().toString(); //from editable text to string
                int x = Integer.parseInt(texta); //pasrseInt --> from string to int
                int y = Integer.parseInt(etsecondnumber.getText().toString());
                int z = sum(x,y);

                textResult.setText(String.valueOf(z)); //from int to text

            }
        });

        calc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texta = etfirstnumber.getText().toString(); //from editable text to string
                int x = Integer.parseInt(texta); //pasrseInt --> from string to int
                int y = Integer.parseInt(etsecondnumber.getText().toString());
                int z = sub(x,y);
                textResult.setText(String.valueOf(z)); //from int to text
            }
        });

    }

    public int sum (int x, int y){
       int a = x+y;
        return a;
    }
    public int sub (int x, int y){
        int a = x-y;
        return a;
    }
}