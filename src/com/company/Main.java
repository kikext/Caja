package com.company;

public class Main {

    public static void main(String[] args) {

        /**
         Caja c = new Caja(40,30,10, Caja.unidad.CM);
         c.etiqueta = "Enrique Imbert / valencia 12";
         c.getVolumen();
         System.out.println(c);
         System.out.println(c.getVolumen());
         */

        CajaCarton c = new CajaCarton(50,50,60);
        c.etiqueta = 777;

        System.out.println("Cliente: " + c.etiqueta + " Volumen: " + c.getVolumen());
        System.out.println(c);
    }
}