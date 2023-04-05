package com.ejerciciosExtrasGuia5.ejer6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[25][25];

        // llena la matriz de numeros
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                int numeros = (int) (Math.random() * 10);
                String num = String.valueOf(numeros);
                matriz[i][j] = num;
            }
        }

        String[] palabras = new String[5];

        // llena el vector de palabras con las palabras ingresadas
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra " + (i + 1) + ":");
            palabras[i] = leer.next().toUpperCase();

            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("Ingrese una palabra de 3 a 5 letras:");
                palabras[i] = leer.next().toUpperCase();
            }
        }

        // el numero random de filas
        int fila = (int) (Math.random() * 20);

        // ubica las palabras en la fila seleccionada
        int columna = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                matriz[fila][columna] = palabras[i].substring(j, j + 1);
                columna++;
            }
        }

        // rellena los espacios no utilizados con numeros aleatorios
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }

        // imprime la sopa de letras
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.print("[ "+matriz[i][j] + " ] ");
            }
            System.out.println();
        }
    }
}