package com.company;

/**
 * Created by e-imb on 31/05/2017.
 */
public class CajaCarton extends Caja {
    static double tcarton;
    protected double area;
    int etiqueta;

    public CajaCarton (double ancho, double alto, double fondo){

        super(ancho, alto, fondo, CajaCarton.unidad.CM);
        area = 2*(ancho*alto + alto*fondo + ancho*fondo);
        tcarton += area;
    }

    public double getArea(){
        return area;
    }

    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.80;
    }

    @Override
    public String toString() {
        return "CajaCarton: " +
                "Cant. Carton=" + area + "cm2" +
                ", Cliente=" + etiqueta +
                super.toString();
    }
}