package Clases;

import java.io.Serializable;

public class Plan_Sur implements Serializable {
    private String Id,Pichilemu,Araucania,ParquesyReservas,LosLagos,LosRios,Chiloe;
    private Boolean comidaTrue,comidaFalse;
    private int precioPichilemu,precioAraucania,precioParques,precioLagos,precioRios,precioChioe;
    private int diasPichelemu,diasAraucania,diasParques,diasLagos,diasRios,diasChiloe;

    sliders img=new sliders();

    public Plan_Sur(){
        precioPichilemu=85000;
        precioAraucania=90000;
        precioParques=125000;
        precioLagos=120000;
        precioRios=115000;
        precioChioe=110000;
        //--------------------
        diasPichelemu=5;
        diasAraucania=5;
        diasParques=6;
        diasLagos=5;
        diasRios=5;
        diasChiloe=5;
        //--------------------
        comidaTrue=true;
        comidaFalse=false;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPichilemu() {
        return
                "Precio: "+precioPichilemu+"\n"+
                "Dias: "+diasPichelemu+"\n"+
                "Comida: "+comidaFalse;
    }

    public void setPichilemu(String pichilemu) {
        Pichilemu = pichilemu;
        img.getPichilemu();
    }

    public String getAraucania() {
        return
                "Precio: "+precioAraucania+"\n"+
                "Dias: "+diasAraucania+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setAraucania(String araucania) {
        Araucania = araucania;
        img.getAraucania();
    }

    public String getParquesyReservas() {
        return
                "Precio: "+precioParques+"\n"+
                "Dias: "+diasParques+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setParquesyReservas(String parquesyReservas) {
        ParquesyReservas = parquesyReservas;
        img.getParquesSur();
    }

    public String getLosLagos() {
        return
                "Precio: "+precioLagos+"\n"+
                "Dias: "+diasLagos+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setLosLagos(String losLagos) {
        LosLagos = losLagos;
        img.getLagos();
    }

    public String getLosRios() {
        return
                "Precio: "+precioRios+"\n"+
                "Dias: "+diasRios+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setLosRios(String losRios) {
        LosRios = losRios;
        img.getRios();
    }

    public String getChiloe() {
        return
                "Precio: "+precioChioe+"\n"+
                "Dias: "+diasChiloe+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setChiloe(String chiloe) {
        Chiloe = chiloe;
        img.getChiloe();
    }
}
