package com.ejerciciosExtrasGuia5.ejer1;

import java.util.Scanner;

public class Mainex {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vec1;
        int n,suma;
        System.out.print("Ingrese el tamaño del vector: ");
        n=leer.nextInt();
        vec1=new int[n];
        suma=0;
        for (int i=0;i<n;i++){
            System.out.print("Ingrese los números: ");
            vec1[i]=leer.nextInt();
            suma+=vec1[i];
        }
        System.out.println("La suma de los elementos del vector es: "+ suma);
    }
}
