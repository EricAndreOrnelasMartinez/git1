package Proyecto1;


public class Tierra implements Planeta {
    String color;
    String name;
    String tipo;

    public Tierra(String color, String name, String tipo){
        this.color = color;
        this.name = name;
        this.tipo = tipo;
    }
    @Override
    public String getNombre() {
        return name;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getColor() {
        return color;
    }


}