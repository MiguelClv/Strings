package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 08/11/2016.
 */
public class EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra;
        System.out.println("Dime un palabra: ");
        palabra = scanner.next();

        System.out.println(palabra.charAt(0));
    }
}
