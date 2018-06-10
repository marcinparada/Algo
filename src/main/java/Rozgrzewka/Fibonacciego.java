//Napisz aplikację która oblicza n-tą wartość ciągu Fibonacciego.
//W ciągu Fibonacciego n-ta wartość ciągu jest wyznaczana na podstawie sumy dwóch poprzednich wyrazów ciągu.

package Rozgrzewka;

import java.util.Scanner;

public class Fibonacciego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj wyraz ciagu");
        int liczba = sc.nextInt();
        System.out.println(ciagFibo(liczba));

        for (int i = 0; i < 100; i++) {
            System.out.println(i + " element CF wynosi: " + ciagFibo(i) + " czas obliczen " + System.currentTimeMillis());
        }
    }


    public static long ciagFibo(int liczba) {
        if (liczba < 2) {
            return liczba;
        } else {
            return ciagFibo(liczba - 1) + ciagFibo(liczba - 2);
        }
    }


}
