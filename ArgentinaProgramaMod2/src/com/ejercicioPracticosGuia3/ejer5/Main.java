package com.ejercicioPracticosGuia3.ejer5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int limite, num, cont=0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el limite positivo: ");
        limite=leer.nextInt();
        while (cont<limite){
            System.out.println("Ingrese un número: ");
            num=leer.nextInt();
            cont+=num;
        }
        System.out.println("El número que supero el límite es: " + cont);
    }
}
