package com.ejerciciosPracticosGuia5.ejer3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vetor: ");
        int n = leer.nextInt();
        int[] vec1 = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Ingrese un numero: ");
            vec1[i] = leer.nextInt();
        }
        int[] digitos=new int[5];
        for (int elemento:vec1){
            if (elemento<=9){
                digitos[0]++;
            }else if (elemento<=99){
                digitos[1]++;
            }else if (elemento<=999){
                digitos[2]++;
            }else if (elemento<9999){
                digitos[3]++;
            }else {
                digitos[4]++;
            }
        }
        System.out.println("La cantidad de numeros con 1 dígito: " + digitos[0]);
        System.out.println("La cantidad de numeros con 2 dígito: " + digitos[1]);
        System.out.println("La cantidad de numeros con 3 dígito: " + digitos[2]);
        System.out.println("La cantidad de numeros con 4 dígito: " + digitos[3]);
        System.out.println("La cantidad de numeros con 5 dígito: " + digitos[4]);
    }
}
