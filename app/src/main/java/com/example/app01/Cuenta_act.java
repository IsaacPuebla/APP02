package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import Clases.ClienteSQL;

public class Cuenta_act extends AppCompatActivity {
    private EditText name,lastname,direction,city,phone,pass,repite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_act);

        name=(EditText)findViewById(R.id.nombre);
        lastname=(EditText)findViewById(R.id.apellido);
        direction=(EditText)findViewById(R.id.direccion);
        city=(EditText)findViewById(R.id.ciudad);
        phone=(EditText)findViewById(R.id.telefono);
        pass=(EditText)findViewById(R.id.pass);
        repite=(EditText)findViewById(R.id.repite);
    }
    public void Guardar(View v){
        ClienteSQL agregar=new ClienteSQL(this,"ficheroCliente",null,1);
        SQLiteDatabase db=agregar.getWritableDatabase();

        String Anombre=name.getText().toString();
        String Alastname=lastname.getText().toString();
        String Adireccion=direction.getText().toString();
        String Acity=city.getText().toString();
        String Afono=phone.getText().toString();
        String Apass=pass.getText().toString();
        String Arepite=repite.getText().toString();
        if(!Arepite.isEmpty() && !Apass.isEmpty()){

            if(!Anombre.isEmpty() && !Alastname.isEmpty() && !Afono.isEmpty() && Arepite.equals(Apass)){
                ContentValues cont=new ContentValues();

                cont.put("telefono",phone.getText().toString());
                cont.put("nombre",name.getText().toString());
                cont.put("direccion",direction.getText().toString());
                cont.put("ciudad",city.getText().toString());
                cont.put("apellido",lastname.getText().toString());
                cont.put("pass",pass.getText().toString());
                cont.put("repite",repite.getText().toString());

                db.insert("cuenta",null,cont);
                db.close();

                Toast.makeText(this,"Cuenta creada. Felicidades", Toast.LENGTH_LONG).show();
                name.setText("");
                lastname.setText("");
                direction.setText("");
                city.setText("");
                phone.setText("");
                pass.setText("");
                repite.setText("");

                Intent i=new Intent(this,MenuCon_Act.class);
                startActivity(i);
            }
            else{
                Toast.makeText(this,"Todos los Campos con '*' deben estar llenos",Toast.LENGTH_LONG).show();
                pass.setText("");
                repite.setText("");
            }
        }
        else{
            Toast.makeText(this,"La contraseña no coincide",Toast.LENGTH_LONG).show();
            pass.setText("");
            repite.setText("");
        }

    }
    public void Borrar(View v){
        name.setText("");
        lastname.setText("");
        direction.setText("");
        city.setText("");
        phone.setText("");
        pass.setText("");
        repite.setText("");
    }
}