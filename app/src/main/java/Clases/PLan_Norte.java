package Clases;

import java.io.Serializable;

public class PLan_Norte implements Serializable{

    private String Id,Arica,Antofagasta,LaSerena,Desierto,Salar,Elqui;
    private int precioArica,precioAntofagasta,precioLaSerena,precioDesierto,precioSalar,precioElqui;
    private int fechaArica,fechaAntofagasta,fechaLaSerena,fechaDesierto,fechaSalar,fechaElqui;
    private Boolean comidaTrue,comidaFalse;

    sliders img=new sliders();


    public PLan_Norte(){
        precioArica=150000;
        precioAntofagasta=170000;
        precioLaSerena=110000;
        precioDesierto=150000;
        precioSalar=100000;
        precioElqui=120000;
        //-------------------
        fechaArica=5;
        fechaAntofagasta=6;
        fechaLaSerena=7;
        fechaDesierto=5;
        fechaSalar=4;
        fechaElqui=5;
        //-------------------
        comidaTrue=true;
        comidaFalse=false;

    }
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }



    public String getArica() {

        return
                "Precio: "+precioArica+"\n"+
                "Dias: "+fechaArica+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setArica(String arica) {
        Arica = arica;
        img.getArica();
    }

    public String getAntofagasta() {
        return
                "Precio: "+precioAntofagasta+"\n"+
                "Dias: "+fechaAntofagasta+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setAntofagasta(String antofagasta) {
        Antofagasta = antofagasta;
        img.getAntofagasta();
    }

    public String getLaSerena() {
        return
                "Precio: "+precioLaSerena+"\n"+
                "Dias: "+fechaLaSerena+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setLaSerena(String laSerena) {
        LaSerena = laSerena;
        img.getLaSerena();
    }

    public String getDesierto() {
        return
                "Precio: "+precioDesierto+"\n"+
                "Dias: "+fechaDesierto+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setDesierto(String desierto) {
        Desierto = desierto;
        img.getDesierto();
    }

    public String getSalar() {
        return
                "Precio: "+precioSalar+"\n"+
                "Dias: "+fechaSalar+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setSalar(String salar) {
        Salar = salar;
        img.getSalar();
    }

    public String getElqui() {
        return
                "Precio: "+precioElqui+"\n"+
                "Dias: "+fechaElqui+"\n"+
                "Comida: "+comidaTrue;

    }

    public void setElqui(String elqui) {
        Elqui = elqui;
        img.getElqui();

    }
}