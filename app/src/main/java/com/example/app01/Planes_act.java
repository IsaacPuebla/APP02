package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


public class Planes_act extends AppCompatActivity {
    private Spinner spin1;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes_act);

        spin1 = findViewById(R.id.spinner);
        lista = findViewById(R.id.listview);

        String[] zona = {"SELECCIONE ZONA", "NORTE", "CENTRO", "SUR", "PATAGONIA"};
        final ArrayAdapter < String > spinerZona = new ArrayAdapter < String >(getBaseContext(), android.R.layout.simple_list_item_1, zona);
        spin1.setAdapter(spinerZona);

    }

    public void Desplegar(View v){
        String seleccion=spin1.getSelectedItem().toString();
        String Norte[] = {"Arica", "Antofagasta", "La Serena", "Desierto", "salar", "elqui"};
        final ArrayAdapter < String > planNorte = new ArrayAdapter < String >(getBaseContext(), android.R.layout.simple_list_item_1, Norte);
        String Centro[] = {"Valparaiso", "Vina", "Rancagua", "sky La Parva", "sky Valle Nevado", "Santiago"};
        final ArrayAdapter < String > planCentro = new ArrayAdapter < String >(getBaseContext(), android.R.layout.simple_list_item_1, Centro);
        String Sur[] = {"Pichilemu", "Araucania", "Parques y Reservas", "Los Lagos", "Los Rios", "Chiloe"};
        final ArrayAdapter < String > planSur = new ArrayAdapter < String >(getBaseContext(), android.R.layout.simple_list_item_1, Sur);
        String Extremo[] = {"Patagonia", "Antartica", "Fiordos", "Tierra del Fuego", "Parques y Reservas", "Campos de Hielo"};
        final ArrayAdapter < String > planExtremo = new ArrayAdapter < String >(getBaseContext(), android.R.layout.simple_list_item_1, Extremo);


        switch (seleccion) {
            case "SELECCIONE ZONA":
                Toast.makeText(getBaseContext(), "Seleccione una zona", Toast.LENGTH_SHORT).show();
                break;
            case "NORTE":
                lista.setAdapter(planNorte);
                break;
            case "CENTRO":
                lista.setAdapter(planCentro);
                break;
            case "SUR":
                lista.setAdapter(planSur);
                break;
            case "PATAGONIA":
                lista.setAdapter(planExtremo);
                break;
            default:
                break;
        }

    }
}