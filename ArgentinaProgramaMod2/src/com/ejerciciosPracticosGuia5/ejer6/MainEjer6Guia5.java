package com.ejerciciosPracticosGuia5.ejer6;

public class MainEjer6Guia5 {
    public static void main(String[] args) {
        int[][] matriz={{2,7,6}, {9,5,1}, {4,3,8}};
        int sumac,sumaf,sumad,sumadi;
        sumac=matriz[0][0] + matriz[1][0] + matriz[2][0];
        sumaf=matriz[0][0] + matriz[0][1] + matriz[0][2];
        sumad=matriz[0][0] + matriz[1][1] + matriz[2][2];
        sumadi=matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (sumac==sumaf && sumad==sumadi && sumad==sumac){
            System.out.println("ES UNA MATRIZ MÁGICA!!!");
        }else {
            System.out.println("NO ES UNA MATRIZ MÁGICA!!!");
        }
    }
}
