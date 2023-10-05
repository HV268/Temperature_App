package com.example.temp_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnConverterClick(View view) {
        EditText editText = findViewById(R.id.editTextNumberDecimal1);
        String inputInString = editText.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInFahrenheit = (inputInDouble*9/5)+32;
        Snackbar.make(view, "Temp in" +inputInDouble + "celsius is" +outputInFahrenheit
                + " in Fahrenheit",Snackbar.LENGTH_LONG).show();






    }
}