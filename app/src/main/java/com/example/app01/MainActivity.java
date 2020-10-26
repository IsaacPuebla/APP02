package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnMenu, btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu=(Button)findViewById(R.id.button);
        btnLogin=(Button)findViewById(R.id.button2);
    }
    public void MenuSin(View v){
        Intent i=new Intent(this,MenuSin_act.class);
        startActivity(i);
    }
    public void Login(View v){
        Intent i=new Intent(this,Login_act.class);
        startActivity(i);
    }
}