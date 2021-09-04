package com.example.apppizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMessage;
    private EditText myEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = (TextView) findViewById(R.id.tvMessage);
        myEditText = findViewById(R.id.myInput);
    }

    public void onClickMyButton(View view) {
        String text = myEditText.getText().toString();
        tvMessage.setText(text);
    }
}