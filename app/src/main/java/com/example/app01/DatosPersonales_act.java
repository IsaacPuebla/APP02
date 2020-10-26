package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import Clases.ClienteSQL;

public class DatosPersonales_act extends AppCompatActivity {
    private EditText nombre, apellido, telefono, direccion, ciudad, pass, repite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_personales_act);

        nombre=(EditText)findViewById(R.id.editNombre);
        apellido=(EditText)findViewById(R.id.editApellido);
        telefono=(EditText)findViewById(R.id.editFono);
        direccion=(EditText)findViewById(R.id.editDireccion);
        ciudad=(EditText)findViewById(R.id.editCiudad);
        pass=(EditText)findViewById(R.id.editPass);
        repite=(EditText)findViewById(R.id.editRepite);
    }
    public void Actualizar(View v){
        ClienteSQL datos=new ClienteSQL(this,"ficheroCliente",null,1);
        SQLiteDatabase db=datos.getWritableDatabase();

        String name=nombre.getText().toString();
        String lastname=apellido.getText().toString();
        String fono=telefono.getText().toString();

        ContentValues cont =new ContentValues();

        cont.put("nombre",nombre.getText().toString());
        cont.put("apellido",apellido.getText().toString());
        cont.put("direccion",direccion.getText().toString());
        cont.put("ciudad",ciudad.getText().toString());
        cont.put("telefono",telefono.getText().toString());


            if(!name.isEmpty() && !lastname.isEmpty() && !fono.isEmpty()){
                db.update("cliente",cont,"telefono="+telefono,null);
                db.close();

                Toast.makeText(this,"Has actualizado tu cuenta.",Toast.LENGTH_LONG).show();

            }
    }
    public void Eliminar(View v){
        ClienteSQL eliminar=new ClienteSQL(this,"ficheroCliente",null,1);
        SQLiteDatabase db=eliminar.getWritableDatabase();

        db.delete("cuenta","telefono="+telefono,null);
        db.close();
        Toast.makeText(this,"Has eliminado tu cuenta",Toast.LENGTH_LONG).show();
        nombre.setText("");
        apellido.setText("");
        direccion.setText("");
        ciudad.setText("");
        telefono.setText("");
        pass.setText("");
        repite.setText("");

        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);

        }
    public void CambioPass(View v){
        ClienteSQL contra=new ClienteSQL(this,"ficheroCliente",null,1);
        SQLiteDatabase db=contra.getWritableDatabase();

        String pas=pass.getText().toString();
        String rep=repite.getText().toString();

        ContentValues cont =new ContentValues();

        cont.put("pass",pass.getText().toString());
        cont.put("repite",repite.getText().toString());

        if(rep.equals(pas)){
            db.update("cliente",cont,"telefono="+telefono,null);
            db.close();

            Toast.makeText(this,"Contraseña cambiada",Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(this,"Repita la misma contraseña",Toast.LENGTH_LONG).show();
            pass.setText("");
            repite.setText("");
        }
    }
}
