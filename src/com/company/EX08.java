package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 54167208T on 08/11/2016.
 */
public class EX08 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        char caracter;
        System.out.println("Dame un solo caracter: ");
        caracter = (char)System.in.read();

        if (Character.isUpperCase(caracter)){
            System.out.println("Esta en Majúscula!");
        }
        else {
            System.out.println("No esta en Majúscula!");
        }
    }
}
