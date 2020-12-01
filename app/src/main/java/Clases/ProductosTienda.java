package Clases;

public class ProductosTienda {
    private String Id,Mochila,Bolsos,Gorro,Lentes,Bloqueador,Guantes,Pantalones,Parka,Bufanda,Zapatillas;
    private int precio,stock;
    private String codigo;

    public ProductosTienda(){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMochila() {
        return Mochila+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setMochila(String mochila) {
        Mochila = mochila;
        precio=15000;
        stock=20;
        codigo="QBMHl23";
    }

    public String getBolsos() {
        return Bolsos+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setBolsos(String bolsos) {
        Bolsos = bolsos;
        precio=12000;
        stock=25;
        codigo="QBJBSl55";
    }

    public String getGorro() {
        return Gorro+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setGorro(String gorro) {
        Gorro = gorro;
        precio=7500;
        stock=30;
        codigo="QBHGRs98";
    }

    public String getLentes() {
        return Lentes+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setLentes(String lentes) {
        Lentes = lentes;
        precio=7500;
        stock=24;
        codigo="QBHLTs55";
    }

    public String getBloqueador() {
        return Bloqueador+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setBloqueador(String bloqueador) {
        Bloqueador = bloqueador;
        precio=2500;
        stock=60;
        codigo="QBHBLq74";
    }

    public String getGuantes() {
        return Guantes+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setGuantes(String guantes) {
        Guantes = guantes;
        precio=8000;
        stock=15;
        codigo="QBHGTs12";
    }

    public String getPantalones() {
        return Pantalones+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setPantalones(String pantalones) {
        Pantalones = pantalones;
        precio=18500;
        stock=35;
        codigo="QBHPTl43";
    }

    public String getParka() {
        return Parka+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setParka(String parka) {
        Parka = parka;
        precio=31980;
        stock=29;
        codigo="QBHPk65";
    }

    public String getBufanda() {
        return Bufanda+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setBufanda(String bufanda) {
        Bufanda = bufanda;
        precio=5300;
        stock=25;
        codigo="QBHBFd46";
    }

    public String getZapatillas() {
        return Zapatillas+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock+"\n"+
                "Codigo: "+codigo;
    }

    public void setZapatillas(String zapatillas) {
        Zapatillas = zapatillas;
        precio=35000;
        stock=35;
        codigo="QBHZPt53";
    }
}
