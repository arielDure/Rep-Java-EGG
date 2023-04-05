package com.ejercicioPracticosGuia3.ejer4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        String letra=frase.substring(0,1);
        if(letra.equalsIgnoreCase("a")){
            System.out.println("CORRECTA");
        }else {
            System.out.println("INCORRECTA");
        }
    }
}
