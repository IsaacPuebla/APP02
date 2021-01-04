package Clases;

import java.io.Serializable;

public class Plan_Patagonia implements Serializable {
    private String Id,Patagonia,Antartica,Fiordos,TierradeFuego,ParquesyReservas,CamposdeHielo;
    private Boolean comidaTrue,comidaFalse;
    private int precioPatagonia,precioAntartica,precioFiordos,precioTierra,precioParques,precioCampos;
    private int diasPatagonia,diasAntartica,diasFiordos,diasTierra,diasParques,diasCampos;

    sliders img=new sliders();

    public Plan_Patagonia(){
        precioPatagonia=110000;
        precioAntartica=160000;
        precioFiordos=110000;
        precioTierra=110000;
        precioParques=110000;
        precioCampos=120000;
        //---------------------
        diasPatagonia=5;
        diasAntartica=4;
        diasFiordos=5;
        diasTierra=4;
        diasParques=5;
        diasCampos=4;
        //---------------------
        comidaTrue=true;
        comidaFalse=false;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPatagonia() {
        return
                "Precio: "+precioPatagonia+"\n"+
                "Dias: "+diasPatagonia+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setPatagonia(String patagonia) {
        Patagonia = patagonia;
        img.getPatagonia();
    }

    public String getAntartica() {
        return
                "Precio: "+precioAntartica+"\n"+
                "Dias: "+diasAntartica+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setAntartica(String antartica) {
        Antartica = antartica;
        img.getAntartica();
    }

    public String getFiordos() {
        return
                "Precio: "+precioFiordos+"\n"+
                "Dias: "+diasFiordos+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setFiordos(String fiordos) {
        Fiordos = fiordos;
        img.getFiordos();
    }

    public String getTierradeFuego() {
        return
                "Precio: "+precioTierra+"\n"+
                "Dias: "+diasTierra+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setTierradeFuego(String tierradeFuego) {
        TierradeFuego = tierradeFuego;
        img.getTierra();
    }

    public String getParquesyReservas() {
        return
                "Precio: "+precioParques+"\n"+
                "Dias: "+diasParques+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setParquesyReservas(String parquesyReservas) {
        ParquesyReservas = parquesyReservas;
        img.getParquesPat();
    }

    public String getCamposdeHielo() {
        return
                "Precio: "+precioCampos+"\n"+
                "Dias: "+diasCampos+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setCamposdeHielo(String camposdeHielo) {
        CamposdeHielo = camposdeHielo;
        img.getCampos();
    }
}
