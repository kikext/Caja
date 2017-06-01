package com.company;

/**
 * Created by e-imb on 31/05/2017.
 */
public class Caja {
    protected enum unidad {CM, M}

    protected double ancho;
    protected double alto;
    protected double fondo;
    protected unidad unid;
    public String etiqueta;



    public Caja (double ancho, double alto, double fondo, unidad unid){

        this.ancho=ancho;
        this.alto=alto;
        this.fondo=fondo;
        this.unid=unid;
    }

    public double getVolumen(){

        if(unid == unidad.CM){
            double volumen =(ancho/100)*(fondo/100)*(alto/100);
            return volumen;
        }else{
            double volumen = ancho*alto*fondo;
            return volumen;
        }
    }

    @Override
    public String toString() {
        return "Caja:" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", unidades=" + unid
                ;
    }
}