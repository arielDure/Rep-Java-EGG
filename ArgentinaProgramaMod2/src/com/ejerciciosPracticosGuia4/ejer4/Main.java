package com.ejerciciosPracticosGuia4.ejer4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = leer.nextInt();
        boolean retorn = esPrimo(n1);
        System.out.println("El numero " + n1 + " es " + retorn);
    }
    public static boolean esPrimo (int n1) {
        boolean retorno;
        if (n1 <= 1) {
            return false;
        }
        for (int i = 2; i <= n1/2; i++) {
            if (n1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}

