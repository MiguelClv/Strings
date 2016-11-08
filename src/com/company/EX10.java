package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 54167208T on 08/11/2016.
 */
public class EX10 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        char caracter1, caracter2;
        System.out.println("Dame el primer caracter: ");
        caracter1 = (char)System.in.read();

        System.in.read();

        System.out.println("Dame el segundo caracter: ");
        caracter2 = (char)System.in.read();

        if (Character.isLowerCase(caracter1)){
            if (Character.isLowerCase(caracter2)){
                System.out.println("Los dos estan en minuscula.");
            }
            else {
                System.out.println("El primero esta en minuscula pero el segundo no.");
            }
        }
        else {
            if (Character.isLowerCase(caracter2)){
                System.out.println("El segundo esta en minuscula pero el primero no.");
            }
            else {
                System.out.println("Ninguno esta en minúscula.");
            }
        }
    }
}
