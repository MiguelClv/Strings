package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 10/11/2016.
 */
public class EX12 {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Escribe un DNI");
            String dni = scanner.next();


            if (dni.length() != 9) {
                throw new RuntimeException("El DNI no tiene nueve carácteres.");
            }

            char lletra = dni.charAt(8);
            if (!Character.isLetter(lletra)) {
                throw new RuntimeException("El último carácter del DNI no es una letra.");
            }

            String numsStr = dni.substring(0, 8);
            int nums = Integer.parseInt(numsStr);
            System.out.println("El DNI es correcto.");


        } catch (NumberFormatException nfe){
            System.out.println("Los 8 primeros carácteres del DNI no representan un número. ");
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
