package modelo;

public abstract class FiguraGeometrica{

    public abstract double calcularArea();

    public String toString(){
        return "Area= "+ calcularArea();
    }

}