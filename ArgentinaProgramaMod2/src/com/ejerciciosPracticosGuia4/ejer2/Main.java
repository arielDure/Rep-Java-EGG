package com.ejerciciosPracticosGuia4.ejer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ingresoDatos();
    }

    private static void ingresoDatos() {
        String nombre, resp;
        int edad,salir;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Ingrese nombre: ");
            nombre = leer.next();
            System.out.print("Ingrese edad: ");
            edad = leer.nextInt();

            if (edad>=18){
                System.out.println(nombre+" es mayor de edad!!!");
            }else if (edad>0 && edad<18){
                System.out.println(nombre+" es menor de edad!!!");
            }else {
                System.out.println("La edad ingresada es Inválida!!!");
            }
            System.out.println("Desea Ingresar mas datos?");
            resp= leer.next();
            if (resp.equalsIgnoreCase("si")){
                salir=0;
            }else {
                salir=1;
            }
        }while (salir!=1);
    }
}
