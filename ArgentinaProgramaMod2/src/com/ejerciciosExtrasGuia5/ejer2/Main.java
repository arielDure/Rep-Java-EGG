package com.ejerciciosExtrasGuia5.ejer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,cont=0;
        System.out.print("Ingrese el tamaño de los vectores: ");
        n=leer.nextInt();
        int[] vec1=new int[n];
        int[] vec2=new int[n];
        for (int i=0;i<n;i++){
            vec1[i]=(int) (Math.random()*10);
            vec2[i]=(int) (Math.random()*10);
            System.out.println("v1: "+ vec1[i] + " v2: "+vec2[i]);
        }
        for (int i=0;i<n;i++){
            if (vec1[i]!=vec2[i]){
                System.out.println("Los vectores no son iguales.");
                break;
            }else {
                cont++;
            }
        }
        if(cont==n){
            System.out.println("Los vectores son iguales.");
        }
    }
}
