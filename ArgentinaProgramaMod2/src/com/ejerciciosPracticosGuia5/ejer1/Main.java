package com.ejerciciosPracticosGuia5.ejer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] vec1;
        vec1=new int[100];
        for (int i=0;i<100;i++){
            vec1[i]=i;
        }
        for (int i=99;i>=0;i--){
            System.out.println(vec1[i]);
        }
    }
}
