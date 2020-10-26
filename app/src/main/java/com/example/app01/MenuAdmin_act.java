package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuAdmin_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin_act);
    }
    public void GesPlanes(View v){
        Intent i=new Intent(this,GestionPlanes_act.class);
        startActivity(i);
    }
    public void GesClientes(View v){
        Intent i=new Intent(this,GestionClientes_act.class);
        startActivity(i);
    }
    public void GesProductos(View v){
        Intent i=new Intent(this,GestionProductos_act.class);
        startActivity(i);
    }
}