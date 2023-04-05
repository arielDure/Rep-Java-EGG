package com.ejerciciosExtrasGuia3.ejer5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clase;
        double monto;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese la clase del socio y el monto a pagar: ");
        clase=Sc.nextLine();
        monto= Sc.nextDouble();
        descuento(clase,monto);
    }

    private static void descuento(String clase, double monto) {
        double precioFinal;
        switch (clase){
            case "A","a":{
                precioFinal=monto - (monto*.5);
                System.out.println("El Afiliado recibe un 50% de descuento el monto a pagar es: $ "+precioFinal); break;
            }
            case "B","b":{
                precioFinal=monto -(monto*.35);
                System.out.println("El Afiliado recibe un 35% de descuento el monto a pagar es: $ "+precioFinal);break;
            }
            case "C","c":{
                System.out.println("El Afiliado es categoria C no recibe descuentos el monto a pagar es: $ "+monto);break;
            }
            default:
                System.out.println("El afiliado no se encuentra dentro de las categorias.");
        }
    }
}
