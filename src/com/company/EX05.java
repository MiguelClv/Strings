package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 08/11/2016.
 */
public class EX05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int conta = 0;
        int conte = 0;
        String frase;

        System.out.println("Dime una frase y te dire las 'a' y 'e'");
        frase = scanner.nextLine();

        System.out.println(frase.replace("a","e"));
    }
}
