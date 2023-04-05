package com.ejerciciosPracticosGuia5.ejer4;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matriztr = new int[4][4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                matriz[i][j]=(int) (Math.random()*10);
                System.out.println("[ "+matriz[i][j] +" ]");
            }
            System.out.println("");
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                matriztr[i][j]=matriz[j][i];
            }
        }
        mostrarmat(matriztr,matriz);
    }

    private static void mostrarmat(int[][] matriztr,int[][] matriz) {
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.println("[ "+matriztr[i][j] +" ]");
            }
            System.out.println("");
        }
    }
}
