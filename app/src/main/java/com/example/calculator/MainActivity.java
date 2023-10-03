package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText x;
    EditText y;
    TextView result;

    Button phytagorasCalculate;
    Button volumeCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = findViewById(R.id.et_x);
        y = findViewById(R.id.et_y);
        result = findViewById(R.id.tv_result);

        phytagorasCalculate = findViewById(R.id.phytagoras_btn);
        volumeCalculate = findViewById(R.id.cylinder_btn);

        setOnClick();

    }



    private void setOnClick() {
        phytagorasCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    float convertedX = Float.parseFloat(xString);
                    String yString = x.getText().toString();
                    float convertedY = Float.parseFloat(yString);
                    result.setText(String.valueOf(phytagoras(convertedX,convertedY)));
                } catch(NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Skriv in giltiga värden", Toast.LENGTH_SHORT).show();
                }
            }
        });

        volumeCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   String xString = x.getText().toString();
                   double convertedX = Float.parseFloat(xString);
                   String yString = x.getText().toString();
                   double convertedY = Float.parseFloat(yString);
                   result.setText(String.valueOf(volume(convertedX, convertedY)));
               } catch (NumberFormatException s){
                   Toast.makeText(MainActivity.this, "Skriv in giltiga värden", Toast.LENGTH_SHORT).show();
               }

            }
        });


    }

    private double volume (double r, double h){
        r = r*r;

        double volyme = Math.PI * r * h;
        return volyme;

    }
    private float phytagoras(float a, float b){
              a = a * a;
              b = b * b;
       float  c = a + b;

        float hypotenusa = c;
        return hypotenusa;
    }

}