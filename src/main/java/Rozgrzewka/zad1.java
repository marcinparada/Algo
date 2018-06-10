//Napisz aplikację konsolową która:
//• przyjmuje od użytkownika liczbę całkowitą w systemie dziesiętnym • zwraca reprezentację liczby zapisaną w systemie binarnym

package Rozgrzewka;

import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println(zamienNaSystemDwojkowy(liczba));

    }

    private static StringBuilder zamienNaSystemDwojkowy(int liczba) {
        StringBuilder liczbaDwojkowo = new StringBuilder();
        do {
            int reszta = liczba % 2;
            liczba = liczba / 2;
            liczbaDwojkowo.append(reszta);

        } while (liczba != 0);
        liczbaDwojkowo.reverse();

        return liczbaDwojkowo;
    }
}
