package com.ejerciciosPracticosGuia4.ejer2;

import java.util.Scanner;

public class MainEx {
    public static void main(String[] args) {
        ingresoDatos();
    }
    public static void ingresoDatos(){
        Scanner leer=new Scanner(System.in);
        String nombre, resp="si";
        int edad;

        while (!resp.equalsIgnoreCase("no")){
            System.out.print("Ingrese el nombre: ");
            nombre= leer.next();
            System.out.print("Ingrese la edad: ");
            edad= leer.nextInt();
            if (edad>=18){
                System.out.println(nombre+" es mayor de edad!!!");
            }else {
                System.out.println(nombre+" es menor de edad!!!");
            }
            System.out.println("Desea ingresar otros datos? Ingrese si o no");
            resp= leer.next();
        }
    }
}
