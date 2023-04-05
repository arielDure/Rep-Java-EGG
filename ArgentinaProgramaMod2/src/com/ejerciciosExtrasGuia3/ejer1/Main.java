package com.ejerciciosExtrasGuia3.ejer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min, dias, horas;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos: ");
        min= leer.nextInt();
        horas=min/60;
        dias=horas/24;
        horas=horas%24;
        System.out.println("el quivalente es "+ dias + " dias, "+horas+" horas.");
    }
}
