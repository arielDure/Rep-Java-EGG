package com.ejerciciosExtrasGuia5.ejer3;

public class Main {
    public static void main(String[] args) {
        int[] vec1=new int[5];
        rellenar(vec1);
        mostrar(vec1);
    }

    private static void mostrar(int[] vec1) {
        for (int i=0; i<5; i++){
            System.out.print("[ "+vec1[i]+" ] ");
        }
    }


    public static void rellenar(int[] vec1){
        for (int i=0; i<5; i++){
            vec1[i]=(int) (Math.random()*10);
            System.out.print(vec1[i]+" ");
        }
        System.out.println("");
    }

}
