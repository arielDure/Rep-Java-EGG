package com.ejerciciosExtrasGuia3.ejer4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner leer= new Scanner(System.in);
        do {
            System.out.print("Ingrese un número entre 1 y 10: ");
            num=leer.nextInt();
        }while (num<1 || num>10);
        switch (num){
            case 1:
                System.out.println("El número "+num+" en romano es: I");break;
            case 2:
                System.out.println("El número "+num+" en romano es: II");break;
            case 3:
                System.out.println("El número "+num+" en romano es: III");break;
            case 4:
                System.out.println("El número "+num+" en romano es: IV");break;
            case 5:
                System.out.println("El número "+num+" en romano es: V");break;
            case 6:
                System.out.println("El número "+num+" en romano es: VI");break;
            case 7:
                System.out.println("El número "+num+" en romano es: VII");break;
            case 8:
                System.out.println("El número "+num+" en romano es: VIII");break;
            case 9:
                System.out.println("El número "+num+" en romano es: IX");break;
            case 10:
                System.out.println("El número "+num+" en romano es: X");break;
        }
    }
}
