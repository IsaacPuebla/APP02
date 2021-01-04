package com.example.app01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import Clases.PLan_Norte;
import Clases.Plan_Centro;
import Clases.Plan_Patagonia;
import Clases.Plan_Sur;


public class Detalle_plan extends AppCompatActivity {
    private ViewFlipper vd;
    private TextView tx;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_plan);

        vd=findViewById(R.id.slider1);
        tx=findViewById(R.id.TView);
        btn=findViewById(R.id.btnContratar);


        /*for(int i = 0; i < image.length; i++) {
            flip_image(image[i]);//AQUI HAY QUE DECIRLE QUE ARRAY DEBE SELECCIONAR.
        }*/

        PLan_Norte pn=new PLan_Norte();
        Plan_Centro pc=new Plan_Centro();
        Plan_Sur ps=new Plan_Sur();
        Plan_Patagonia pp=new Plan_Patagonia();

    }
    public void flip_image(int i) {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        vd.addView(view);
        vd.setFlipInterval(2800);
        vd.setAutoStart(true);

        vd.setInAnimation(this, android.R.anim.slide_in_left);
        vd.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}