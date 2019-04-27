package com.example.uglys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConsumer = (Button)findViewById(R.id.Consumer_Login);
        Button buttonProducer = (Button)findViewById(R.id.Producer_Login);
        final TextView createAccount = (TextView)findViewById(R.id.dont_have_an_account);

        buttonConsumer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, consumerLogin.class);
                intent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity(intent);
            }
        });

        buttonProducer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, producerLogin.class);
                intent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity(intent);
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, createAccount.class);
                startActivityForResult(intent,1);


            }
        });



    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode ==1)
        {
            if(resultCode == RESULT_OK) {
                String userAccount = data.getStringExtra("user");
                String fname = data.getStringExtra("fname");
                String lname = data.getStringExtra("lname");
                String email = data.getStringExtra("email");
                String phoneNumber = data.getStringExtra("phoneNumber");
                String streetAddress = data.getStringExtra("streetAddress");
                String city = data.getStringExtra("city");
                String state = data.getStringExtra("state");
                String country = data.getStringExtra("country");

                UserAccount user = new UserAccount(userAccount,fname,lname,email, phoneNumber,streetAddress,city,state,country);

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("/");
                myRef.child("/").push().setValue("test");

            }

        }
    }
}
