package com.ejercicioPracticosGuia3.ejer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        if(frase.equals("eureka")){
            System.out.println("La frase es CORRECTA");
        }else {
            System.out.println("La frase es INCORRECTA");
        }
    }
}
