package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje) {
        System.out.print(mensaje);
        Scanner scn = new Scanner(System.in);
        String dato = scn.nextLine();
        return dato;
    }
}