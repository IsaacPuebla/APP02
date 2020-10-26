package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuCon_Act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_con_);
    }
    public void Planes(View v){
        Intent i=new Intent(this,Planes_act.class);
        startActivity(i);
    }
    public void Mapa(View v){
        Intent i=new Intent(this,Mapa_act.class);
        startActivity(i);
    }
    public void Tienda(View v){
        Intent i=new Intent(this,Tienda_act.class);
        startActivity(i);
    }
    public void Contacto(View v){
        Intent i=new Intent(this, Contacto_act.class);
        startActivity(i);
    }
    public void Videos(View v){
        Intent i=new Intent(this,Video_Act.class);
        startActivity(i);
    }
    public void DatosPe(View v){
        Intent i=new Intent(this,DatosPersonales_act.class);
        startActivity(i);
    }
    public void Actividad(View v){
        Intent i=new Intent(this,Actividad_act.class);
        startActivity(i);
    }
}