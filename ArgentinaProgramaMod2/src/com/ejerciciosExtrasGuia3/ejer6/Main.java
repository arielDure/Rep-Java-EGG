package com.ejerciciosExtrasGuia3.ejer6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cant,cont=0;
        double altura, suma=0 ,sum=0;
        System.out.println("Ingrese la cantidad de alturas: ");
        cant=leer.nextInt();
        for (int i=0; i<cant;i++){
            System.out.print("Ingrese la altura: ");
            altura= leer.nextDouble();
            suma+=altura;
            if (altura<1.6){
                sum+=altura;
                cont++;
            }
        }
        System.out.println("El promedio general de alturas es: "+ (suma/cant));
        System.out.println("el promedio de altura menor a 1,6 m es: "+ (sum/cont));
    }
}
