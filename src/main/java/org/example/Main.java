package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<BankAcc> bankList = new ArrayList<>();

        System.out.println("System bankowy xXx - Made by SW");
        System.out.println("Wybierz co chcesz zrobić poniżej:");
        System.out.println("1. Dodaj budżet");
        System.out.println("2. Usuń budżet - not working");
        System.out.println("3. Sprawdź stan konta");
        System.out.print("> ");
        int in = input.nextInt();

        //test
        if (in == 1) {
            while (true) {
                System.out.print("Podaj kwotę (Lub napisz KONIEC by zakończyć pracę): ");
                String value = input.next();
                if (value.equalsIgnoreCase("KONIEC")) {
                    break;
                }
                System.out.print("Podaj walutę: ");
                String currency = input.next();
                BigDecimal v2 = new BigDecimal(value);

                bankList.add(new BankAcc(v2, currency));
            }

            System.out.println(Arrays.toString(bankList.toArray()));
        }
    }
}