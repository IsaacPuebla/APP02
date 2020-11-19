package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Contacto_act extends AppCompatActivity {
    private RatingBar rating;
    private TextView tx;
    private Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_act);

        rating=findViewById(R.id.ratingBar);
        tx=findViewById(R.id.TeView);
        btnEnviar=findViewById(R.id.btnenviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Rating="Rating: "+rating.getRating();
                tx.getText();
                Toast.makeText(getBaseContext(),"Gracias por su comentario",Toast.LENGTH_LONG).show();
            }
        });
    }
}