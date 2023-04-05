package com.ejercicioPracticosGuia3.ejer3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        if(frase.length()==8){
            System.out.println("CORRECTA");
        }else {
            System.out.println("INCORRECTA");
        }
    }
}
