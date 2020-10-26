package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class Login_act extends AppCompatActivity {
    private Button btn;
    private EditText nombre, pass;
    private ViewFlipper vf;

    private int[] image = {R.drawable.antofagasta, R.drawable.chiloe, R.drawable.cipres, R.drawable.deser,
            R.drawable.geyser, R.drawable.glaciar, R.drawable.rio, R.drawable.surf, R.drawable.tempanos, R.drawable.valparaiso};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_act);

        btn=(Button)findViewById(R.id.button4);
        nombre = (EditText) findViewById(R.id.editApellido);
        pass = (EditText) findViewById(R.id.editPassword);


        vf = (ViewFlipper) findViewById(R.id.slider);

        for (int i = 0; i < image.length; i++) {
            flip_image(image[i]);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(nombre.getText().toString(),pass.getText().toString());
            }
        });

    }

    public void flip_image(int i) {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        vf.addView(view);
        vf.setFlipInterval(2800);
        vf.setAutoStart(true);

        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);

    }

    public void Registrarse(View v) {
        Intent i =new Intent(this,Cuenta_act.class);
        startActivity(i);
    }
    public void Login(String nombre,String pass){

        if(nombre.equals("admin") && pass.equals("admin")){
            Intent i =new Intent(this,MenuAdmin_act.class);
            startActivity(i);

        }
        else if(nombre.equals("hola") && pass.equals("123")){//comparar nombre y pass con la bbdd
            Intent i= new Intent(this,MenuCon_Act.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this,"El nombre o contraseña no se encuentra registrado",Toast.LENGTH_LONG).show();

        }

    }
}