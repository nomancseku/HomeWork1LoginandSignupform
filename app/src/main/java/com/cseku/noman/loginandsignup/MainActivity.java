package com.cseku.noman.loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String name,pass;
    EditText username,password;
    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.idlogin);
        password = (EditText)findViewById(R.id.idpassword);
        login = (Button)findViewById(R.id.btnlogin);
        signup = (Button)findViewById(R.id.btnsignup);

        login.setOnClickListener(this);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnlogin)
        {
            name = username.getText().toString();
            pass = password.getText().toString();
            if ((name.equals("noman")) && (pass.equals("12345"))){
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        }
        else if(view.getId() == R.id.btnsignup)
        {
            Toast.makeText(MainActivity.this, "Sing up button pressed", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(intent);
        }
    }
}
