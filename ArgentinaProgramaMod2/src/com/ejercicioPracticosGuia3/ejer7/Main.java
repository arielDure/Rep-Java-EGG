package com.ejercicioPracticosGuia3.ejer7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase;
        int correctas=0,incorrectas=0;
        Scanner Sc=new Scanner(System.in);
        do {
            System.out.println("Ingrese una frase que comiense con X y finalice con O: ");
            frase=Sc.nextLine();
            if (frase.equals("&&&&&")){
                break;
            }
            if (frase.length()==5){
                if ((frase.substring(0,1)).equalsIgnoreCase("x") && (frase.substring(4,5)).equalsIgnoreCase("o") ) {
                    correctas++;
                }else {
                    incorrectas++;
                }
            }else {
                incorrectas++;
            }

        }while (true);
        System.out.println("La cantidad de palabras correctas son: "+ correctas);
        System.out.println("La cantidad de palabras incorrectas son: "+ (incorrectas));
    }
}
