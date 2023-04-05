package com.ejerciciosPracticosGuia4.ejemplo11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase=leer.nextLine();
        String retorno=funcion(frase);
        System.out.println(retorno);
    }

    private static String funcion(String frase) {
        int tamanio=frase.length();
        String frasecambio="", letra;
        for (int i=0; i<tamanio; i++){
            letra=frase.substring(i,(i+1));
            switch (letra){
                case "a":
                    frasecambio+="@";
                    break;
                case "e":
                    frasecambio+="#";
                    break;
                case "i":
                    frasecambio+="$";
                    break;
                case "o":
                    frasecambio+="%";
                    break;
                case "u":
                    frasecambio+="*";
                    break;
                default:
                    frasecambio+=letra;
            }
        }
        return frasecambio;
    }
}
