package Clases;

import java.io.Serializable;

public class Plan_Centro implements Serializable {
    private String Id,Valparaiso,Vina,Rancagua,skyParva,skyNevado,Santiago;
    private Boolean comidaTrue,comidaFalse;
    private int precioValparaiso,precioVina,precioRancagua,precioParva,precioNevado,precioSantiago;
    private int diasValparaiso,diasVina,diasRancagua,diasParva,diasNevado,diasSantiago;

    sliders img=new sliders();

    public Plan_Centro(){
        precioValparaiso=105000;
        precioVina=110000;
        precioRancagua=90000;
        precioParva=80000;
        precioNevado=75000;
        precioSantiago=80000;
        //---------------------
        diasValparaiso=6;
        diasVina=5;
        diasRancagua=4;
        diasParva=5;
        diasNevado=5;
        diasSantiago=5;
        //---------------------
        comidaFalse=false;
        comidaTrue=true;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getValparaiso() {
        return
                "Precio: "+precioValparaiso+"\n"+
                "Dias: "+diasValparaiso+"\n"+
                "Comida: "+comidaFalse;
    }

    public void setValparaiso(String valparaiso) {
        Valparaiso = valparaiso;
        img.getValparaiso();
    }

    public String getVina() {
        return
                "Precio: "+precioVina+"\n"+
                "Dias: "+diasVina+"\n"+
                "Comida: "+comidaFalse;
    }

    public void setVina(String vina) {
        Vina = vina;
        img.getVina();
    }

    public String getRancagua() {
        return
                "Precio: "+precioRancagua+"\n"+
                "Dias: "+diasRancagua+"\n"+
                "Comida: "+comidaFalse;
    }

    public void setRancagua(String rancagua) {
        Rancagua = rancagua;
        img.getRancagua();
    }

    public String getSkyParva() {
        return
                "Precio: "+precioParva+"\n"+
                "Dias: "+diasParva+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setSkyParva(String skyParva) {
        this.skyParva = skyParva;
        img.getParva();
    }

    public String getSkyNevado() {
        return
                "Precio: "+precioNevado+"\n"+
                "Dias: "+diasNevado+"\n"+
                "Comida: "+comidaTrue;
    }

    public void setSkyNevado(String skyNevado) {
        this.skyNevado = skyNevado;
        img.getNevado();
    }

    public String getSantiago() {
        return
                "Precio: "+precioSantiago+"\n"+
                "Dias: "+diasSantiago+"\n"+
                "Comida: "+comidaFalse;
    }

    public void setSantiago(String santiago) {
        Santiago = santiago;
        img.getSantiago();
    }
}


