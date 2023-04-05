package com.ejerciciosExtrasGuia3.ejer7;

import java.util.Scanner;

public class MainDoWhile {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valorMax = Integer.MIN_VALUE;
        int valorMin = Integer.MAX_VALUE;
        double valorPromedio = 0;
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int n = leer.nextInt();
        int c = 0;
        double promedio = 0;
        int valor;
        do {
            System.out.println("Ingrese un valor numerico");
            valor = leer.nextInt();
            if (valor > valorMax) {
                valorMax = valor;
            }
            if (valor < valorMin) {
                valorMin = valor;
            }
            promedio += valor;
            c++;
        }while (c < n);
        System.out.println("El valor máximo es: " + valorMax);
        System.out.println("El valor mínimo es: " + valorMin);
        System.out.println("El promedio es: " + (promedio / n));
    }
}
