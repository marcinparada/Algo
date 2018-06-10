//Napisz aplikację która korzystając z algorytmu sortowania bąbelkowego posortuje wszystkie elementy tablicy • wielkość tablicy będzie podana przez użytkownika
//        • tablica zostanie wypełniona losowymi liczbami całkowitymi
//        • aplikacja wypisze zawartość nieposortowanej tablicy
//        • aplikacja wypisze zawartość posortowanej tablicy
package Rozgrzewka;

import java.util.Arrays;
import java.util.Random;

public class SortowanieBabelkowe {
    public static void main(String[] args) {


        int[] tablicaPrzed = generujTablice();
        System.out.println(Arrays.toString(tablicaPrzed));
        int[] tablicaPo = posortujTablice(tablicaPrzed);
        System.out.println(Arrays.toString(tablicaPo));

    }

    public static int[] generujTablice() {
        Random rd = new Random();
        int[] tablica = new int[7];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rd.nextInt(100) + 1;
        }
        return tablica;
    }


    public static int[] posortujTablice(int[] tablica) {

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int temp;
                    temp = tablica[j + 1];
                    tablica[j + 1] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
        return tablica;
    }

}
