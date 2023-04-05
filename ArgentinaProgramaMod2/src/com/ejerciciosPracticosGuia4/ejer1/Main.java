package com.ejerciciosPracticosGuia4.ejer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        do {
            menu();
            opc= leer.nextInt();
            casos(opc,num1,num2);
        }while (opc!=5);
    }

    private static void casos(int opc, int num1, int num2) {
        switch (opc){
            case 1:
                suma(num1,num2);break;
            case 2:
                resta(num1, num2);break;
            case 3:
                multiplicar(num1, num2); break;
            case 4:
                dividir(num1, num2);break;
            case 5:
                System.out.println("FINALIZANDO EL PROGRAMA..."); break;
        }
    }

    private static void suma(int num1, int num2) {
        System.out.println("La suma de "+num1+" + "+num2+" = "+(num1+num2));
    }
    private static void resta(int num1, int num2) {
        System.out.println("La suma de "+num1+" - "+num2+" = "+(num1-num2));
    }
    private static void multiplicar(int num1, int num2) {
        System.out.println("La suma de "+num1+" * "+num2+" = "+(num1*num2));
    }
    private static void dividir(int num1, int num2) {
        System.out.println("La suma de "+num1+" / "+num2+" = "+(num1/num2));
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
}
