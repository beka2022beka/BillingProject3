package com.example.billingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idEdit_Text;
    private EditText nameEdit_Text;
    private EditText prdNameEdit_Text;
    private EditText prdPriceEdit_Text;
    private EditText prdQtyEdit_Text;
    private TextView textView;
    private TextView calculateText_View;
    private Button totalInputButton;
    private Button totalRecordButton;
    private Button nextButton;
    private Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}