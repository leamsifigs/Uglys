package com.example.uglys;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class createAccount extends AppCompatActivity {

    private RadioGroup radioUserGroup;
    private RadioButton radioConsumerButton;
    private RadioButton radioProducerButton;
    private EditText mEditTextFirstName;
    private EditText mEditTextLastName;
    private EditText mEditTextEmail;
    private EditText mEditTextPhoneNumber;
    private EditText mEditTextStreetAddress;
    private EditText mEditTextCity;
    private EditText mEditTextState;
    private EditText mEditTextCountry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button buttonSubmit = (Button)findViewById(R.id.Submit);

        buttonSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                radioUserGroup = (RadioGroup) findViewById(R.id.radioUser);
                radioConsumerButton = (RadioButton) findViewById(R.id.Consumer_Button);
                radioProducerButton = (RadioButton) findViewById(R.id.Producer_Button);
                mEditTextFirstName = (EditText)findViewById(R.id.User_First_Name);
                mEditTextLastName = (EditText)findViewById(R.id.User_Last_Name);
                mEditTextEmail = (EditText)findViewById(R.id.User_Email);
                mEditTextPhoneNumber = (EditText)findViewById(R.id.User_Phone_Number);
                mEditTextStreetAddress = (EditText)findViewById(R.id.User_Street_Address);
                mEditTextCity = (EditText)findViewById(R.id.User_City);
                mEditTextState = (EditText)findViewById(R.id.User_State);
                mEditTextCountry = (EditText)findViewById(R.id.User_Country);


                Intent intent = new Intent(createAccount.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
