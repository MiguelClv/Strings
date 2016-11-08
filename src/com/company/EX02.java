package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 08/11/2016.
 */
public class EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra1, palabra2;
        System.out.println("Dime la primera palabra: ");
        palabra1 = scanner.next();
        System.out.println("Dime la segunda palabra: ");
        palabra2 = scanner.next();

        if (palabra1.equals(palabra2)){
            System.out.println("Son iguals!");
        }
        else {
            System.out.println("No son iguales!");
        }
    }
}
