package com.ejerciciosPracticosGuia5.ejer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vetor: ");
        int n = leer.nextInt();
        int[] vec1 = new int[n];
        for (int i=0;i<n;i++){
            vec1[i]=(int) (Math.random()*10);
            System.out.println(vec1[i]);
        }
        System.out.print("Ingrese el número a buscar: ");
        int num= leer.nextInt();
        int cont=0;
        int x=0;
        for (int elemento:vec1){
            x++;
            if (elemento==num){
                System.out.println("El elemento se encuentra en la poscion: "+x);
                cont++;
            }
        }
        System.out.println("La cantidad de veces que se repite es: "+cont);
    }
}
