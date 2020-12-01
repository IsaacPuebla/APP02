package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class Detalle_plan extends AppCompatActivity {
    private VideoView vd;
    private TextView tx;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_plan);

        vd=findViewById(R.id.videoView);
        tx=findViewById(R.id.TView);


        btn=findViewById(R.id.btnContratar);


    }

}