package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        Double d= Double.parseDouble(myTextField.getText().toString())*0.77;
        String str = d.toString();
        goToActivity2(str);
    }

    public void goToActivity2(String str) {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message",str);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
