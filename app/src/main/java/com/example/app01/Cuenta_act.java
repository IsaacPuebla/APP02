package com.example.app01;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import Clases.ClienteSQL;

public class Cuenta_act extends AppCompatActivity {
    private EditText name,lastname,direction,city,phone,pass,repite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_act);

        name=findViewById(R.id.nombre);
        lastname=findViewById(R.id.apellido);
        direction=findViewById(R.id.direccion);
        city=findViewById(R.id.ciudad);
        phone=findViewById(R.id.telefono);
        pass=findViewById(R.id.pass);
        repite=findViewById(R.id.repite);
    }
    public void Guardar(View v){
        ClienteSQL agregar=new ClienteSQL(this,"ficheroCliente",null,1);
        SQLiteDatabase db=agregar.getWritableDatabase();

        String Anombre=name.getText().toString();
        String Alastname=lastname.getText().toString();
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