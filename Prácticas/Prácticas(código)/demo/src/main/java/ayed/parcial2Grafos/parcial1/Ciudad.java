package ayed.parcial2Grafos.parcial1;

public class Ciudad {
    private String nombre;
    private int fase;


    public Ciudad(String nombre, int fase){
        this.nombre=nombre;
        this.fase=fase;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getFase(){
        return this.fase;
    }
    public void setFase(int fase){
        this.fase=fase;
    }



}
