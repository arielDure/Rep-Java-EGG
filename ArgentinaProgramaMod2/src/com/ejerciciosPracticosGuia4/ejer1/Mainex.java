package com.ejerciciosPracticosGuia4.ejer1;

import java.util.Scanner;

public class Mainex {
    public static void main(String[] args) {
        int num1, num2, suma, resta,mult,opc;
        double div;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe 2 numeros: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        do {
            menu();
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    suma = sumar(num1, num2);
                    System.out.println(suma);
                    break;
                case 2:
                    resta = restar(num1, num2);
                    System.out.println(resta);
                    break;
                case 3:
                    mult = multiplicar(num1, num2);
                    System.out.println(mult);
                    break;
                case 4:
                    div = dividir(num1, num2);
                    System.out.println(div);
                    break;
                case 5:
                    System.out.println("Terminando el programa...");break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while (opc!=5);

    }
    private static void menu() {
        System.out.println("---------- MENU ----------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese una Opción: ");
    }
    public static int sumar(int num1, int num2){
        int resultado=num1+num2;
        return resultado;
    }
    public static int restar(int num1, int num2){
        int resultado=num1-num2;
        return resultado;
    }
    public static double dividir(double num1, double num2){
        double resultado=num1/num2;
        return resultado;
    }
    public static int multiplicar(int num1, int num2){
        int resultado=num1*num2;
        return resultado;
    }
}
