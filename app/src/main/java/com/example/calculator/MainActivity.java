package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText x;
    EditText y;
    Button phytagorasCalculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phytagorasCalculate.findViewById(R.id.phytagoras_btn);
        x.findViewById(R.id.et_x);
        y.findViewById(R.id.et_y);
        result.findViewById(R.id.tv_result);

        phytagorasCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xString = x.getText().toString();
                float convertedX = Float.parseFloat(xString);
                String yString = x.getText().toString();
                float convertedY = Float.parseFloat(yString);
                result.setText(String.valueOf(phytagoras(convertedX,convertedY)));


            }
        });

    }

    private float phytagoras(float a, float b){
              a = a * a;
              b = b * b;
       float  c = a + b;

        float hypotenusa = c;
        return hypotenusa;
    }

}