package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 08/11/2016.
 */
public class EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase;
        System.out.println("Dime un frase: ");
        frase = scanner.nextLine();

        frase = frase.replaceAll(" ","");

        System.out.println(frase.length());
    }
}