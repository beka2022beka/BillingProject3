package com.example.billingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    private int currentIndex=0;
    public static final String TAG="Billing Project";
    public static final String KEY_INDEX="index";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Billing.credits = 3;

        Billing billingRecord1 = new Billing(105, "Johnston Jane", "Chair", 99.99, 2);
        Billing billingRecord2 = new Billing(108, "Fikhali Samuel", "Table", 139.99, 1);
        Billing billingRecord3 = new Billing(113, "Samson Amina", "KeyUSB", 14.99, 2);

        Billing[] all_billings = new Billing[]{billingRecord1, billingRecord2, billingRecord3};
        if (savedInstanceState != null) {
            currentIndex = savedInstanceState.getInt(KEY_INDEX);

        }
        //get the Edit text view
        idEdit_Text = (EditText) findViewById(R.id.id_edit_text);
        nameEdit_Text = (EditText) findViewById(R.id.name_edit_text);
        prdNameEdit_Text = (EditText) findViewById(R.id.prdname_edit_text);
        prdPriceEdit_Text = (EditText) findViewById(R.id.prdprice_edit_text);
        prdQtyEdit_Text = (EditText) findViewById(R.id.prdqty_edit_text);
        textView = (TextView) findViewById(R.id.text_view);

        calculateText_View = (TextView) findViewById(R.id.calculate_text_view);
        calculateText_View.setText("Client " + all_billings[currentIndex].calculateInput() + "");

        totalInputButton=(Button) findViewById(R.id.totalinput_button);
        totalInputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }











}