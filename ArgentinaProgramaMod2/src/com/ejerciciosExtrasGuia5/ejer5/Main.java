package com.ejerciciosExtrasGuia5.ejer5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int filas, columnas,suma;
        int [][] matriz;
        System.out.print("Ingrese la cantidad de filas: ");
        filas= leer.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        columnas= leer.nextInt();
        matriz=new int[filas][columnas];
        rellenarMatriz(matriz,filas,columnas);
        suma = sumaMatriz(matriz,filas,columnas);
        System.out.println("La suma de los elementos es: "+suma);
    }

    private static int sumaMatriz(int[][] matriz, int filas, int columnas) {
        int suma=0;
        for (int i=0;i<filas;i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    private static void rellenarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i=0;i<filas;i++){
            for (int j=0; j<columnas;j++){
                matriz[i][j]=(int) (Math.random()*10);
                System.out.print("[ "+matriz[i][j]+" ] ");
            }
            System.out.println(" ");
        }
    }
}
