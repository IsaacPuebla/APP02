package Clases;

public class Plan_Sur {
    private String Id,Pichilemu,Araucania,ParquesyReservas,LosLagos,LosRios,Chiloe;
    private Boolean comida;
    private int precio,dias;

    public Plan_Sur(){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPichilemu() {
        return Pichilemu+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setPichilemu(String pichilemu) {
        Pichilemu = pichilemu;
        precio=85000;
        dias=5;
        comida=false;
    }

    public String getAraucania() {
        return Araucania+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setAraucania(String araucania) {
        Araucania = araucania;
        precio=90000;
        dias=5;
        comida=true;
    }

    public String getParquesyReservas() {
        return ParquesyReservas+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setParquesyReservas(String parquesyReservas) {
        ParquesyReservas = parquesyReservas;
        precio=125000;
        dias=6;
        comida=true;
    }

    public String getLosLagos() {
        return LosLagos+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setLosLagos(String losLagos) {
        LosLagos = losLagos;
        precio=120000;
        dias=5;
        comida=true;
    }

    public String getLosRios() {
        return LosRios+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setLosRios(String losRios) {
        LosRios = losRios;
        precio=115000;
        dias=5;
        comida=true;
    }

    public String getChiloe() {
        return Chiloe+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setChiloe(String chiloe) {
        Chiloe = chiloe;
        precio=110000;
        dias=5;
        comida=true;
    }
}
