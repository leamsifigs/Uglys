package com.example.uglys;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class createAccount extends AppCompatActivity {

    private RadioGroup radioUserGroup;
    private RadioButton radioBtn;
    private EditText mEditTextFirstName;
    private EditText mEditTextLastName;
    private EditText mEditTextEmail;
    private EditText mEditTextPassword;
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
                int selectedId = radioUserGroup.getCheckedRadioButtonId();
                radioBtn = (RadioButton) findViewById(selectedId);
                mEditTextFirstName = (EditText)findViewById(R.id.User_First_Name);
                mEditTextLastName = (EditText)findViewById(R.id.User_Last_Name);
                mEditTextEmail = (EditText)findViewById(R.id.User_Email);
                mEditTextPassword = (EditText)findViewById(R.id.User_Password);
                mEditTextPhoneNumber = (EditText)findViewById(R.id.User_Phone_Number);
                mEditTextStreetAddress = (EditText)findViewById(R.id.User_Street_Address);
                mEditTextCity = (EditText)findViewById(R.id.User_City);
                mEditTextState = (EditText)findViewById(R.id.User_State);
                mEditTextCountry = (EditText)findViewById(R.id.User_Country);

                String userAccount = radioBtn.getText().toString();
                String fName = mEditTextFirstName.getText().toString();
                String lName = mEditTextLastName.getText().toString();
                String email = mEditTextEmail.getText().toString();
                String passsword = mEditTextPassword.getText().toString();
                String phoneNumber = mEditTextPhoneNumber.getText().toString();
                String streetAddress = mEditTextStreetAddress.getText().toString();
                String city = mEditTextCity.getText().toString();
                String state = mEditTextState.getText().toString();
                String country = mEditTextCountry.getText().toString();


                Intent resultIntent = new Intent();

                resultIntent.putExtra("user", userAccount);
                resultIntent.putExtra("fname", fName);
                resultIntent.putExtra("lname", lName);
                resultIntent.putExtra("email", email);
                resultIntent.putExtra("password", passsword);
                resultIntent.putExtra("phoneNumber", phoneNumber);
                resultIntent.putExtra("streetAddress", streetAddress);
                resultIntent.putExtra("city", city);
                resultIntent.putExtra("state", state);
                resultIntent.putExtra("country", country);

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}
