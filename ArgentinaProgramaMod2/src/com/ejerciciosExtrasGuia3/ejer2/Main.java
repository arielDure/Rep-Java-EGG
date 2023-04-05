package com.ejerciciosExtrasGuia3.ejer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,d,aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 números: ");
        a= leer.nextInt();
        b= leer.nextInt();
        c= leer.nextInt();
        d= leer.nextInt();
        System.out.println("Los números ingresados son: a: "+a+", b: "+b+", c: "+c+", d: "+d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("Los números intercambiados son: a: "+a+", b: "+b+", c: "+c+", d: "+d);
    }
}
