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

    //Creates EditText, TextView, Buttons
    EditText x,y;
    TextView result;
    Button pythagoreanCalculate,volumeCalculate,additionCalculate,circleCalculate,divisionCalculate,multiplyCalculate,subtractionCalculate,percentCalculate,squareRootCalculate;

    DecimalFormat decimalMaxNumber = new DecimalFormat("#.##");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = findViewById(R.id.et_x);
        y = findViewById(R.id.et_y);
        result = findViewById(R.id.tv_result);

        pythagoreanCalculate = findViewById(R.id.phytagoras_btn);
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


    // Method that contains all the onclick buttons
    private void setOnClick() {
        pythagoreanCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String xString = x.getText().toString();
                    float convertedX = Float.parseFloat(xString);
                    String yString = y.getText().toString();
                    float convertedY = Float.parseFloat(yString);
                    result.setText(String.valueOf(pythagorean(convertedX, convertedY)));
                    x.setText("");
                    y.setText("");
                } catch (NumberFormatException s) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });

        volumeCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            // A view method that runs the desired onclick code
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
        //  Addition onclick listener
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
        // Multiplication onclick listener
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

        //  Division onclick listener
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
        //  Circle area onclick listener
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

        //  Subtraction onclick listener
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
        //  Percent click listener
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
        //  Square root onclick listener
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

    //addition method
    private double addition(double x, double y) {
        return x + y;
    }
    // division method
    private double division(double x, double y) {
        return x / y;
    }

    private double volume(double r, double h) {
        return Math.PI * r * r * h;
    }
    // pythagorean method
    private float pythagorean(float a, float b) {
        a = a * a;
        b = b * b;

        return a + b;
    }
    // multiplication method
    private double multiply(double x, double y) {
        return x * y;
    }

    //  circle method
    private double circle_area(double r) {
        return Math.PI * r * r;
    }


    // subtraction method
    private double subtraction(double x, double y) {
        return x - y;

    }

    // Percent method
    private double percent( double part, double whole) {
        return (part / whole) * 100;
    }
    // Square root method
    private double squareRoot(double x) {
        return Math.sqrt(x);
    }

}