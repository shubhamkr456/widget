package com.example.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // widget variables
    private EditText name;
    private EditText email;
    private EditText password;
    private Button submit;
    private Button SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // variables
        name= findViewById(R.id.name);
        email= findViewById(R.id.email);
        password=findViewById(R.id.password);
        submit=findViewById(R.id.Signup_submit);
        SignIn=findViewById(R.id.SignIn);

    }
}
