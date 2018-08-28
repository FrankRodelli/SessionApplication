package com.bignerdranch.android.sessionapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CustomersActivity extends AppCompatActivity {
    private ImageView mCustomerPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);

        mCustomerPhoto = (ImageView) findViewById(R.id.imageView7);
        mCustomerPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Switch to customers
                Intent intent = new Intent(CustomersActivity.this,CustomerPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
