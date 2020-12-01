package Clases;

public class PLan_Norte {

    private String Id,Arica,Antofagasta,LaSerena,Desierto,Salar,Elqui;
    private int precio,fecha;
    private Boolean comida;

    public void PLan_Norte(){

    }
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }



    public String getArica() {
        return Arica+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+fecha+"\n"+
                "Comida: "+comida;
    }

    public void setArica(String arica) {
        Arica = arica;
        precio=150000;
        fecha=5;
        comida=true;
    }

    public String getAntofagasta() {
        return Antofagasta+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+fecha+"\n"+
                "Comida: "+comida;
    }

    public void setAntofagasta(String antofagasta) {
        Antofagasta = antofagasta;
        precio=110000;
        fecha=6;
        comida=true;
    }

    public String getLaSerena() {
        return LaSerena+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+fecha+"\n"+
                "Comida: "+comida;
    }

    public void setLaSerena(String laSerena) {
        LaSerena = laSerena;
        precio=100000;
        fecha=7;
        comida=true;
    }

    public String getDesierto() {
        return "Plan: "+Desierto +"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+fecha+"\n"+
                "Comida: "+comida;
    }

    public void setDesierto(String desierto) {
        Desierto = desierto;
        precio=150000;
        fecha=5;
        comida=true;
    }

    public String getSalar() {
        return Salar+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+fecha+"\n"+
                "Comida: "+comida;
    }

    public void setSalar(String salar) {
        Salar = salar;
        precio=100000;
        fecha=4;
        comida=true;
    }

    public String getElqui() {
        return Elqui+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+fecha+"\n"+
                "Comida: "+comida;

    }

    public void setElqui(String elqui) {
        Elqui = elqui;
        precio=120000;
        fecha=5;
        comida=true;
    }
}