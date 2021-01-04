package com.example.app01;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import Clases.ClienteSQL;

public class Login_act extends AppCompatActivity {
    private Button btn;
    private EditText nomre, pass;
    private VideoView vf;
    private ProgressBar pb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_act);

        btn=findViewById(R.id.button4);
        nomre = findViewById(R.id.editTelefono);
        pass = findViewById(R.id.editPassword);
        pb=findViewById(R.id.progressBar);
        pb.setVisibility(View.INVISIBLE);
        vf =findViewById(R.id.videoView);

        vf.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.rain);
        vf.start();
        vf.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {// Permite reproducir el video en bucle
            @Override
            public void onCompletion(MediaPlayer mp) {
                vf.start();
            }
        });


    }



    public void Registrarse(View v) {
        Intent i = new Intent(this, Cuenta_act.class);
        startActivity(i);
    }
    public void Inicio(View v){
        ClienteSQL cliente=new ClienteSQL(getApplicationContext(),"ficheroCliente",null,1);
        SQLiteDatabase db=cliente.getWritableDatabase();

        String nom=nomre.getText().toString();
        String contra=pass.getText().toString();
        if(!contra.isEmpty() && !nom.isEmpty()){
            Cursor cursor=db.rawQuery("SELECT repite,nombre FROM cuenta WHERE nombre='"+nom+"' AND pass='"+contra+"'",null);

            if(cursor.moveToFirst()){

                String con= cursor.getString(0);
                String name=cursor.getString(1);


                if(con.equals(contra) && name.equals(nom)){
                    Intent i=new Intent(getApplicationContext(),MenuCon_Act.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"Bienvenido "+name,Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"El telefono o la contraseña son erroneas",Toast.LENGTH_LONG).show();

                }
            }
            else{
                Toast.makeText(getApplicationContext(),"El telefono o la contraseña son erroneas",Toast.LENGTH_LONG).show();

            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Llene los campos solicitados",Toast.LENGTH_LONG).show();

        }
    }
}