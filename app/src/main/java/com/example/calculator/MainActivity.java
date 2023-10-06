package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    //Group Diamond Knights

    //Skapar EditText, TextView och Button variabler
    EditText x;
    EditText y;
    TextView result;
    Button pythagoreanCalculate;
    Button volumeCalculate;
    Button additionCalculate;
    Button circleCalculate;
    Button divisionCalculate;
    Button multiplyCalculate;
    Button subtractionCalculate;
    Button percentCalculate;
    Button squareRootCalculate;

    DecimalFormat decimalMaxNumber = new DecimalFormat("#.##");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = findViewById(R.id.et_x);
        y = findViewById(R.id.et_y);
        result = findViewById(R.id.tv_result);

        pythagoreanCalculate = findViewById(R.id.pythagorean_btn);
        volumeCalculate = findViewById(R.id.cylinder_btn);
        additionCalculate = findViewById(R.id.addition_btn);
        circleCalculate = findViewById(R.id.circle_btn);
        divisionCalculate = findViewById(R.id.division_btn);
        multiplyCalculate = findViewById(R.id.multiply_btn);
        subtractionCalculate = findViewById(R.id.subtraction_btn);
        percentCalculate = findViewById(R.id.percent_btn);
        squareRootCalculate= findViewById(R.id.square_root_btn);



        setOnClick();

    }


    private void setOnClick() {
        pythagoreanCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    float convertedX = Float.parseFloat(xString);
                    String yString = y.getText().toString();
                    float convertedY = Float.parseFloat(yString);
                    result.setText(String.valueOf(phytagoras(convertedX, convertedY)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });

        volumeCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    double convertedX = Double.parseDouble(xString);
                    String yString = y.getText().toString();
                    double convertedY = Double.parseDouble(yString);
                    result.setText(String.valueOf(volume(convertedX, convertedY)));
                    result.setText(decimalMaxNumber.format(volume(convertedX, convertedY)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });

        additionCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    double convertedX = Double.parseDouble(xString);
                    String yString = y.getText().toString();
                    double convertedY = Double.parseDouble(yString);
                    result.setText(String.valueOf(addition(convertedX, convertedY)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });
        multiplyCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    double convertedX = Float.parseFloat(xString);
                    String yString = y.getText().toString();
                    double convertedY = Float.parseFloat(yString);
                    result.setText(String.valueOf(multiply(convertedX, convertedY)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });


        divisionCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    double convertedX = Double.parseDouble(xString);
                    String yString = y.getText().toString();
                    double convertedY = Double.parseDouble(yString);
                    result.setText(String.valueOf(division(convertedX, convertedY)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });

        circleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    double convertedX = Float.parseFloat(xString);
                    result.setText(String.valueOf(circle_area(convertedX)));
                    result.setText(decimalMaxNumber.format(circle_area(convertedX)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                }
            }
        });


        subtractionCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    double convertedX = Double.parseDouble(xString);
                    String yString = y.getText().toString();
                    double convertedY = Double.parseDouble(yString);
                    result.setText(String.valueOf(subtraction(convertedX, convertedY)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });

        percentCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    double convertedX = Float.parseFloat(xString);
                    String yString = y.getText().toString();
                    double convertedY = Double.parseDouble(yString);
                    result.setText((String.format("%s%%", percent(convertedX, convertedY))));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        squareRootCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    double convertedX = Float.parseFloat(xString);
                    result.setText(String.valueOf(squareRoot(convertedX)));
                    result.setText(decimalMaxNumber.format(squareRoot(convertedX)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s){
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    private double addition(double x, double y) {
        return x + y;
    }

    private double division(double x, double y) {
        return x / y;
    }

    private double volume(double r, double h) {
        return Math.PI * r * r * h;
    }

    private float phytagoras(float a, float b) {
        a = a * a;
        b = b * b;

        return a + b;
    }

    private double multiply(double x, double y) {
        return x * y;
    }


    private double circle_area(double r) {
        return Math.PI * r * r;
    }



    private double subtraction(double x, double y) {
        return x - y;

    }


    private double percent( double part, double whole) {
        return (part / whole) * 100;
    }
    private double squareRoot(double x) {
        return Math.sqrt(x);
    }

}