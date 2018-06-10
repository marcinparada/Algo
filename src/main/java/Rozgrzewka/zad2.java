
//Napisz aplikację konsolową która:
//• przyjmuje od użytkownika słowo
//• zwraca informację czy podane słowo jest palindromem
//• opcjonalnie: rozszerz zadanie o sprawdzanie całych wyrażeń (Ma tarapaty ta para tam, Ile Roman ładny dyndał na moreli?, O, ty
//z Katowic, Iwo? Tak, Zyto.)
//Palindrom (gr. palindromeo – biec z powrotem) – wyrażenie brzmiące tak samo czytane od lewej do prawej i od prawej do lewej.
package Rozgrzewka;

import java.util.Scanner;

import static Rozgrzewka.zad2.czyJestPalindromem;

public class zad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz slowo");
        String slowo = scanner.nextLine();
        System.out.println(czyJestPalindromem(slowo));
    }


    public static boolean czyJestPalindromem(String slowo) {
        StringBuilder sprawdz = new StringBuilder();
        sprawdz.append(slowo).toString();

        StringBuilder sprawdzOdwrocona = new StringBuilder();
        sprawdzOdwrocona.append(sprawdz.toString()).reverse();

        for (int i = 0; i < sprawdz.length()/2; i++) {
            if (sprawdz.charAt(i) == sprawdzOdwrocona.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}

//        SPRAWDZENIE CZY KAZDY ZNAK W SPRAWDZ JEST TAKI SAM JAK W SPRAWDZODWROCONA
//        for (int i = 0; i < sprawdz.length(); i++) {
////            if (sprawdz.charAt(i) == sprawdzOdwrocona.charAt(i)) {
////                System.out.println(i + " znak jest taki sam");
////            } else {
////                System.out.println(i + " znak jest inny");
////            }
////
////        }
//
//
//    }