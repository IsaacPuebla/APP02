package Clases;

import java.io.Serializable;

public class ProductosTienda implements Serializable {
    private String Id,Mochila,Bolsos,Gorro,Lentes,Bloqueador,Guantes,Pantalones,Parka,Bufanda,Zapatillas;
    private int precioMochila,precioBolsos,precioGorro,precioLentes,precioBloqueador,precioGuantes,precioPantalones,precioParka,precioBufanda,precioZapatilla;
    private int stockMochila,stockBolsos,stockGorro,stockLentes,stockBloqueador,stockGuantes,stockPantalones,stockParka,stockBufanda,stockZapatilla;
    private String codigoMochila,codigoBolsos,codigoGorro,codigoLentes,codigoBloqueador,codigoGuantes,codigoPantalones,codigoParka,codigoBufanda,codigoZapatilla;

    public ProductosTienda(){
        precioMochila=15000;
        precioBolsos=15000;
        precioGorro=15000;
        precioLentes=15000;
        precioBloqueador=15000;
        precioGuantes=15000;
        precioPantalones=15000;
        precioParka=15000;
        precioBufanda=15000;
        precioZapatilla=15000;
        //--------------------
        stockMochila=20;
        stockBolsos=25;
        stockGorro=20;
        stockLentes=28;
        stockBloqueador=50;
        stockGuantes=21;
        stockPantalones=27;
        stockParka=20;
        stockBufanda=40;
        stockZapatilla=35;
        //--------------------
        codigoMochila="QBMHl23";
        codigoBolsos="QBJBSl55";
        codigoGorro="QBHGRs98";
        codigoLentes="QBHLTs55";
        codigoBloqueador="QBHBLq74";
        codigoGuantes="QBHGTs12";
        codigoPantalones="QBHPTl43";
        codigoParka="QBHPk65";
        codigoBufanda="QBHBFd46";
        codigoZapatilla="QBHZPt53";
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMochila() {
        return Mochila+"\n"+
                "Precio: "+precioMochila+"\n"+
                "Stock: "+stockMochila+"\n"+
                "Codigo: "+codigoMochila;
    }

    public void setMochila(String mochila) {
        Mochila = mochila;
    }

    public String getBolsos() {
        return Bolsos+"\n"+
                "Precio: "+precioBolsos+"\n"+
                "Stock: "+stockBolsos+"\n"+
                "Codigo: "+codigoBolsos;
    }

    public void setBolsos(String bolsos) {
        Bolsos = bolsos;
    }

    public String getGorro() {
        return Gorro+"\n"+
                "Precio: "+precioGorro+"\n"+
                "Stock: "+stockGorro+"\n"+
                "Codigo: "+codigoGorro;
    }

    public void setGorro(String gorro) {
        Gorro = gorro;
    }

    public String getLentes() {
        return Lentes+"\n"+
                "Precio: "+precioLentes+"\n"+
                "Stock: "+stockLentes+"\n"+
                "Codigo: "+codigoLentes;
    }

    public void setLentes(String lentes) {
        Lentes = lentes;
    }

    public String getBloqueador() {
        return Bloqueador+"\n"+
                "Precio: "+precioBloqueador+"\n"+
                "Stock: "+stockBloqueador+"\n"+
                "Codigo: "+codigoBloqueador;
    }

    public void setBloqueador(String bloqueador) {
        Bloqueador = bloqueador;
    }

    public String getGuantes() {
        return Guantes+"\n"+
                "Precio: "+precioGuantes+"\n"+
                "Stock: "+stockGuantes+"\n"+
                "Codigo: "+codigoGuantes;
    }

    public void setGuantes(String guantes) {
        Guantes = guantes;
    }

    public String getPantalones() {
        return Pantalones+"\n"+
                "Precio: "+precioPantalones+"\n"+
                "Stock: "+stockPantalones+"\n"+
                "Codigo: "+codigoPantalones;
    }

    public void setPantalones(String pantalones) {
        Pantalones = pantalones;
    }

    public String getParka() {
        return Parka+"\n"+
                "Precio: "+precioParka+"\n"+
                "Stock: "+stockParka+"\n"+
                "Codigo: "+codigoParka;
    }

    public void setParka(String parka) {
        Parka = parka;
    }

    public String getBufanda() {
        return Bufanda+"\n"+
                "Precio: "+precioBufanda+"\n"+
                "Stock: "+stockBufanda+"\n"+
                "Codigo: "+codigoBufanda;
    }

    public void setBufanda(String bufanda) {
        Bufanda = bufanda;
    }

    public String getZapatillas() {
        return Zapatillas+"\n"+
                "Precio: "+precioZapatilla+"\n"+
                "Stock: "+stockZapatilla+"\n"+
                "Codigo: "+codigoZapatilla;
    }

    public void setZapatillas(String zapatillas) {
        Zapatillas = zapatillas;
    }
}
