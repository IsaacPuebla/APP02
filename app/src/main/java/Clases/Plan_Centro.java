package Clases;

public class Plan_Centro {
    private String Id,Valparaiso,Vina,Rancagua,skyParva,skyNevado,Santiago;
    private Boolean comida;
    private int precio,dias;

    public Plan_Centro(){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getValparaiso() {
        return Valparaiso+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setValparaiso(String valparaiso) {
        Valparaiso = valparaiso;
        precio=105000;
        dias=6;
        comida=false;
    }

    public String getVina() {
        return Vina+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setVina(String vina) {
        Vina = vina;
        precio=110000;
        dias=5;
        comida=false;
    }

    public String getRancagua() {
        return Rancagua+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setRancagua(String rancagua) {
        Rancagua = rancagua;
        precio=90000;
        dias=4;
        comida=false;
    }

    public String getSkyParva() {
        return skyParva+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setSkyParva(String skyParva) {
        this.skyParva = skyParva;
        precio=80000;
        dias=5;
        comida=true;
    }

    public String getSkyNevado() {
        return skyNevado+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setSkyNevado(String skyNevado) {
        this.skyNevado = skyNevado;
        precio=75000;
        dias=5;
        comida=true;
    }

    public String getSantiago() {
        return Santiago+"\n"+
                "Precio: "+precio+"\n"+
                "Dias: "+dias+"\n"+
                "Comida: "+comida;
    }

    public void setSantiago(String santiago) {
        Santiago = santiago;
        precio=80000;
        dias=5;
        comida=false;
    }
}


