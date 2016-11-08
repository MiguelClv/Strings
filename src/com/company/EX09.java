package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 54167208T on 08/11/2016.
 */
public class EX09 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        char caracter1, caracter2;
        System.out.println("Dame el primer caracter: ");
        caracter1 = (char)System.in.read();

        System.in.read();

        System.out.println("Dame el segundo caracter: ");
        caracter2 = (char)System.in.read();

        if (caracter1 == caracter2){
            System.out.println("Son iguales!");
        }
        else {
            System.out.println("No son iguales!");
        }
    }
}
