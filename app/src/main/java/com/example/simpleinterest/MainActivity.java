package com.example.simpleinterest;

import static com.example.simpleinterest.R.id.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {
    private EditText principal;
    private EditText time;
    private EditText rate;
    private Button calculateBtn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText principal = (EditText) findViewById(R.id.principal);
        EditText time = (EditText) findViewById(R.id.time);
        EditText rate = (EditText) findViewById(R.id.rate);
        Button calculateBtn = (Button) findViewById(R.id.calculateBtn);
        TextView result = (TextView) findViewById(R.id.result);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double P = Double.parseDouble(principal.getText().toString());
                double T = Double.parseDouble(time.getText().toString());
                double R = Double.parseDouble(rate.getText().toString());
                double answer = calculateSimpleInterest(P,T,R);
                result.setText("The result is: " + answer);
            }
        });
    }
    private double calculateSimpleInterest(double principal, double time, double rate){
        double SimpleInterest = (principal * time * rate)/100;
        return SimpleInterest;
    }
}

