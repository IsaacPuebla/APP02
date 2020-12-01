package Clases;

public class Plan_Patagonia {
    private String Id,Patagonia,Antartica,Fiordos,TierradeFuego,ParquesyReservas,CamposdeHielo;
    private Boolean comida;
    private int precio,dias;

    public Plan_Patagonia(){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPatagonia() {
        return Patagonia+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setPatagonia(String patagonia) {
        Patagonia = patagonia;
        precio=110000;
        dias=5;
        comida=true;
    }

    public String getAntartica() {
        return Antartica+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setAntartica(String antartica) {
        Antartica = antartica;
        precio=160000;
        dias=4;
        comida=true;
    }

    public String getFiordos() {
        return Fiordos+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setFiordos(String fiordos) {
        Fiordos = fiordos;
        precio=110000;
        dias=5;
        comida=true;
    }

    public String getTierradeFuego() {
        return TierradeFuego+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setTierradeFuego(String tierradeFuego) {
        TierradeFuego = tierradeFuego;
        precio=110000;
        dias=4;
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
        precio=110000;
        dias=5;
        comida=true;
    }

    public String getCamposdeHielo() {
        return CamposdeHielo+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setCamposdeHielo(String camposdeHielo) {
        CamposdeHielo = camposdeHielo;
        precio=120000;
        dias=4;
        comida=true;
    }
}
