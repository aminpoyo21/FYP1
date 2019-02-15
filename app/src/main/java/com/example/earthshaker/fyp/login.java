package com.example.earthshaker.fyp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username, password;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.et_username);
        password = (EditText)findViewById(R.id.et_password);
        button1  = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // return value true
                // !validate is retunr value false
                if(validate())
                {
                    Intent i = new Intent(login.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }

    private boolean validate()
    {
        if((username.getText().toString().equals("amin"))&&((password.getText().toString().equals("123"))))
        {
            return true;
        }
        Toast.makeText(login.this,"Your Username and Password is not Valid", Toast.LENGTH_SHORT).show();
        return false;
    }
}
