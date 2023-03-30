package com.ejercicioPracticosGuia3.ejer8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cant;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos: ");
        cant=Sc.nextInt();
        for (int i=0;i<cant;i++){
            for (int j=0;j<cant;j++){
                if(i>0 && i<(cant-1) ){
                    if(j>0 && j<(cant-1)){
                        System.out.print("  ");
                    }else {
                        System.out.print(" *");
                    }
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}
