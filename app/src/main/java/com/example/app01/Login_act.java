package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ViewFlipper;


import Clases.ClienteSQL;
import android.os.AsyncTask;

public class Login_act extends AppCompatActivity {
    private Button btn;
    private EditText fonolo, pass;
    private ViewFlipper vf;
    private ProgressBar pb;

    private int[] image = {R.drawable.antofagasta, R.drawable.chiloe, R.drawable.cipres, R.drawable.deser,
            R.drawable.geyser, R.drawable.glaciar, R.drawable.rio, R.drawable.surf, R.drawable.tempanos, R.drawable.valparaiso};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_act);

        btn=findViewById(R.id.button4);
        fonolo = findViewById(R.id.editTelefono);
        pass = findViewById(R.id.editPassword);
        pb=findViewById(R.id.progressBar);
        pb.setVisibility(View.INVISIBLE);
        vf =findViewById(R.id.slider);

        for(int i = 0; i < image.length; i++) {
            flip_image(image[i]);
        }
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Task().execute();
            }
        });*/
    }

    /*class Task extends AsyncTask<String, Void, String>{
        @Override
        protected void onPreExecute() {
            pb.setVisibility(View.VISIBLE);

        }
        @Override
        protected String doInBackground(String... strings) {
            for(int i=0;i<=8;i++){
                try{
                    Thread.sleep(250);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            return null;
        }
        @Override
        protected void onPostExecute(String s) {
            pb.setVisibility(View.INVISIBLE);
            ClienteSQL cliente=new ClienteSQL(getApplicationContext(),"ficheroCliente",null,1);
            SQLiteDatabase db=cliente.getWritableDatabase();

            String fono=fonolo.getText().toString();
            int tel=Integer.parseInt(fono);
            String contra=pass.getText().toString();
                if(!contra.isEmpty() && !fono.isEmpty()){
                         Cursor cursor=db.rawQuery("SELECT telefono,repite,nombre FROM cuenta WHERE telefono='"+tel+"' AND pass='"+contra+"'",null);

                         if(cursor.moveToFirst()){

                                String tele= cursor.getString(0);
                                String con= cursor.getString(1);
                                String name=cursor.getString(2);


                                if(con.equals(contra) && tele.equals(tel)){
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
    }*/
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
        Intent i = new Intent(this, Cuenta_act.class);
        startActivity(i);
    }
    public void Inicio(View v){
        ClienteSQL cliente=new ClienteSQL(getApplicationContext(),"ficheroCliente",null,1);
        SQLiteDatabase db=cliente.getWritableDatabase();

        String fono=fonolo.getText().toString();
        int tel=Integer.parseInt(fono);
        String contra=pass.getText().toString();
        if(!contra.isEmpty() && !fono.isEmpty()){
            Cursor cursor=db.rawQuery("SELECT telefono,repite,nombre FROM cuenta WHERE telefono='"+tel+"' AND pass='"+contra+"'",null);

            if(cursor.moveToFirst()){

                String tele= cursor.getString(0);
                String con= cursor.getString(1);
                String name=cursor.getString(2);


                if(con.equals(contra) && tele.equals(tel)){
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