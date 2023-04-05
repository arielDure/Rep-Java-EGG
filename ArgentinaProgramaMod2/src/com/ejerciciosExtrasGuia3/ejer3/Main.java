package com.ejerciciosExtrasGuia3.ejer3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String letra,aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        letra= leer.next();
        aux= letra.toLowerCase();
        /*if (letra.equalsIgnoreCase("a")||
                letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i")||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u")){
            System.out.println("La letra: "+ letra + " es una vocal!");
        }else {
            System.out.println("La letra: "+ letra + " no es una vocal!");
        }*/
        switch (aux){
            case "a","e","i","o","u":
                System.out.println("La letra: "+ letra + " es una vocal!");
                break;
            default:
                System.out.println("La letra: "+ letra + " no es una vocal!");
                break;
        }
    }
}
