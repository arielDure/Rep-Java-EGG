package com.ejercicioPracticosGuia3.ejer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un Número: ");
        num= leer.nextInt();
        if (num%2==0){
            System.out.println("El número es par");
        }else {
            System.out.println("El número es Impar");
        }
    }
}
