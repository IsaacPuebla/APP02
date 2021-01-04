package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import Clases.ProductosTienda;

public class Tienda_act extends AppCompatActivity {
    private ListView lista;
    private ArrayList < ProductosTienda > listabbdd =new ArrayList <ProductosTienda>();
    private Button btnAgrega;

    ProductosTienda delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda_act);

        btnAgrega=findViewById(R.id.btnagregar);
        lista=findViewById(R.id.listview);

        final String[] listado = {"MOCHILA","BOLSO","GORRO","LENTE","BLOQUEADOR","GUANTES","PANTALONES","PARKA","BUFANDA","ZAPATILLA"};
        ArrayAdapter<String>adapter=new ArrayAdapter <String>(getBaseContext(),android.R.layout.simple_list_item_1,listado);
        lista.setAdapter(adapter);

        btnAgrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductosTienda select=new ProductosTienda();
                listabbdd.add(select);

                ArrayAdapter adapterCarro=new ArrayAdapter(getBaseContext(),android.R.layout.simple_list_item_1,listabbdd);
                lista.setAdapter(adapterCarro);

            }
        });
    }
}