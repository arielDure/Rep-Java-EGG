package com.ejerciciosExtrasGuia5.ejer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vec1;
        int n,suma=0;
        System.out.print("Ingrese el tamaño del vector: ");
        n=leer.nextInt();
        vec1=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Ingrese un número: ");
            vec1[i]=leer.nextInt();
            suma+=vec1[i];
        }
        System.out.println("La suma de todos los numeros del vector es: " + suma);
    }
}
