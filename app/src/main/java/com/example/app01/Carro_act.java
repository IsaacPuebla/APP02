package com.example.app01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import Clases.ProductosTienda;

public class Carro_act extends AppCompatActivity {
    private ListView listadoCarro;
    private Button btnCancelar,btnComprar;

    ProductosTienda delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_act);

        listadoCarro=findViewById(R.id.listaCarro);
        btnCancelar=findViewById(R.id.btnCancelar);
        btnComprar=findViewById(R.id.btnComprar);

        /*ArrayAdapter<String> listado=new ArrayAdapter <String>(getBaseContext(),android.R.layout.simple_list_item_1,f);
        listadoCarro.setAdapter(listado);*/

    }
    public void Cancelar(View v){                                  //revisar y corregir
        ProductosTienda eliminando=new ProductosTienda();
        eliminando.setId(delete.getId());

        databaseList();
    }

}