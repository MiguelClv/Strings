package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 11/11/2016.
 */
public class EX13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nomb, cogn, majoredat;
        int edat, nota = -1, notacomp1, notacomp2;

        bucle:
        while (true) {
            System.out.println("----------------------------Menú----------------------------");
            System.out.println("1. Nom i cognoms complerts");
            System.out.println("2. Edat");
            System.out.println("3. Informacio sobre la nota mitjana del cicle");
            System.out.println("4. Comparativa nota de dos companys");
            System.out.println("5. Nombre de caracters, Inicial del nom i inicial de cognoms");
            System.out.println("6. Nom i Cognoms de dos companys");
            System.out.println("7. Salir del programa");
            System.out.println("------------------------------------------------------------");
            System.out.println("Introduce una opcion: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Introdueix el teu nom:");
                    nomb = scanner.nextLine();
                    System.out.println("Introdueix el cognom:");
                    cogn = scanner.nextLine();
                    System.out.println("Et dius: " + nomb + " " + cogn);
                    break;
                case 2:
                    System.out.println("Introdueix la teva edat:");
                    edat = scanner.nextInt();
                    majoredat = (edat >= 18) ? "Major d'edat" : "Menor d'edat";
                    System.out.println("Tens :" + edat + " Y ets: " + majoredat);
                    break;
                case 3:
                    System.out.println("Introdueix la teva nota mitjana:");
                    nota = scanner.nextInt();
                    if (nota >= 9) {
                        System.out.println("Molt bé! Tens un excel·lent!");
                    } else if (nota < 9 && nota >= 7) {
                        System.out.println("Tens un notable!");
                    } else if (nota < 7 && nota >= 6) {
                        System.out.println("Tens un bé!");
                    } else if (nota < 6 && nota >= 5) {
                        System.out.println("Tens un suficient!");
                    } else {
                        System.out.println("Tens un suspès!");
                    }
                    break;
                case 4:

                    if (nota == -1) {
                        System.out.println("No se puede hacer este paso sin antes pasar por el paso 3!!!!");
                        continue bucle;
                    }
                    System.out.println("Nota del primer company:");
                    notacomp1 = scanner.nextInt();
                    System.out.println("Nota del segon company:");
                    notacomp2 = scanner.nextInt();
                    if (nota > notacomp1 && nota > notacomp2) {
                        System.out.println("La nota mes alta es la teva! " + nota);
                    } else if (notacomp1 > nota && notacomp1 > notacomp2) {
                        System.out.println("La nota mes alta es la del teu primer company " + notacomp1);
                    } else {
                        System.out.println("La nota mes alta es la del teu segon company " + notacomp2);
                    }
                    if (nota < notacomp1 && nota < notacomp2){
                        System.out.println("La nota mes baixa es la teva! " +nota);
                    } else if (notacomp1 < nota && notacomp1 < notacomp2){
                        System.out.println("La nota mes baixa es la del teu primer company " +notacomp1);
                    } else {
                        System.out.println("La nota mes baixa es la del teu segon company " +notacomp2);
                    }
                    int mitjana3=(nota+notacomp1+notacomp2)/3;
                    System.out.println("La nota mitjana es: "+mitjana3);
                case 7:
                    break bucle;
            }
        }
    }
}
