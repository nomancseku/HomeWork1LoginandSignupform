package com.cseku.noman.loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView tvImportant;
    public static final String show = "null";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvImportant = findViewById(R.id.tv_important);
        Intent intent = getIntent();
        String messageValue = intent.getStringExtra(show);

        if(messageValue!=null){
            tvImportant.setText(messageValue);
        }
    }
}
