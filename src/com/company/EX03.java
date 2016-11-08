package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 08/11/2016.
 */
public class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase1, frase2;
        System.out.println("Dime la primera frase: ");
        frase1 = scanner.nextLine();
        System.out.println("Dime la segunda frase: ");
        frase2 = scanner.nextLine();

        System.out.println(frase1 +" "+ frase2);
    }
}
