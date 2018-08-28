package com.bignerdranch.android.sessionapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SessionsActivity extends AppCompatActivity {
    private ImageView mSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions);

        mSession = (ImageView) findViewById(R.id.imageView7);
        mSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Switch to sessions
                Intent intent = new Intent(SessionsActivity.this,SessionViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
