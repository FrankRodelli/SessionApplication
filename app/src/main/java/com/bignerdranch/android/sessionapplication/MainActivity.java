package com.bignerdranch.android.sessionapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mCustomersButton;
    private Button mSessionsButton;
    private Button mCreateCustomerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomersButton = (Button) findViewById(R.id.customers_button);
        mCustomersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Switch to customers
                Intent intent = new Intent(MainActivity.this,CustomersActivity.class);
                startActivity(intent);
            }
        });

        mSessionsButton = (Button) findViewById(R.id.sessions_button);
        mSessionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Switch to sessions
                Intent intent = new Intent(MainActivity.this,SessionsActivity.class);
                startActivity(intent);
            }
        });

        mCreateCustomerButton = (Button) findViewById(R.id.add_button);
        mCreateCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Switch to sessions
                Intent intent = new Intent(MainActivity.this,AddCustomerActivity.class);
                startActivity(intent);
            }
        });
    }
}
