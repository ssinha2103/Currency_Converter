package com.sudarshan.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText dollar_amount = findViewById(R.id.editText);
        Double dollar = Double.parseDouble(dollar_amount.getText().toString());
        Double inr = dollar * 70;
        TextView output = (TextView) findViewById(R.id.textView);
        output.setText(inr.toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
