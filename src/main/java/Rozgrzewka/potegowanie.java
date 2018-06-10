//Napisz aplikację konsolową która:
//• przyjmuje od użytkownika ciąg znaków reprezentujący działanie potęgowania lub silni
//• zwraca odpowiedni wynik obliczony za pomocą rekurencji


package Rozgrzewka;

import java.util.Scanner;

public class potegowanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int podstawa = scanner.nextInt();
        System.out.println("Podaj potege");
        int wykladnik = scanner.nextInt();
        System.out.println("Podaj liczbe do silni");
        int liczba = scanner.nextInt();

        System.out.println(potegowanie(podstawa ,wykladnik));
        System.out.println(silnia(liczba));
    }

    public static int potegowanie(int podstawa, int wykladnik) {

        if (wykladnik == 0) {
            return 1;
        } else if (wykladnik == 1) {
            int wynik = podstawa;
            return wynik;
        } else {
            int pot = wykladnik - 1;
            int wynik = podstawa * potegowanie(podstawa, pot);
            return wynik;
        }
    }

    private static int silnia(int liczba){
        if (liczba==0){
            return 1;
        }else {
            return liczba * silnia(liczba-1);
        }
    }


}
