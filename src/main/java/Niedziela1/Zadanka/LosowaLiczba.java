//Napisz aplikację konsolową która:
//- będzie posiadać statyczne finalne pole typu int o nazwie N i wartości 1000
//- wygeneruje N-elementową tablicę wypełnioną kolejno wartościami od 1 do N
//- wylosuje liczbę z zakresu od 1 do N
//- za pomocą wyszukiwania prostego (od pierwszego do ostatniego elementu) przeszuka listę w poszukiwaniu wylosowanej liczby (w
//przypadku znalezienia liczby w tablicy pętla jest przerywana a liczba jej wykonań powinna zostać zapamiętana)
//Powyższa logika powinna wykonać się N razy. Ze wszystkich wykonań wypisz następujące wartości: - minimalna liczba zapytań wykonanych do znalezienia wyniku
//- średnia liczba zapytań wykonanych do znalezienia wyniku
//- maksymalna liczba zapytań zapytań wykonanych do znalezienia wyniku
//- łączny czas wykonania całej logiki aplikacji
//Jakie otrzymałeś wyniki dla N = 1000, N = 10000, N = 100000?
package Niedziela1.Zadanka;

import java.util.Random;

public class LosowaLiczba {


    public static final int N = 1000000;


    public static void main(String[] args) {
        long poczatek = System.currentTimeMillis();

        int[] tabbb = generowanieTablicy(N);
        int liczbaaa = losowanieLiczby(N);

        System.out.println("wylosowana liczba do szukania binarnego to : "+ liczbaaa);
        int qqq = szukanieBinarne(tabbb, liczbaaa);
        System.out.println("znalazlem : " + qqq);
        long konieccc = System.currentTimeMillis();
        System.out.println("czas wykonania szukania binarnego to : " + (konieccc - poczatek) + " milisekund");

    }

    private static int[] generowanieTablicy(int wielkosc) {
        int[] tabela = new int[wielkosc];
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = i + 1;
        }
        return tabela;
    }

    private static int losowanieLiczby(int wielkosc) {
        Random rand = new Random();
        return rand.nextInt(wielkosc) + 1;
    }

    private static int szukanieBinarne(int[] tab, int poszukiwana) {
        int lewo = 0;
        int prawo = tab.length;
        int srodek = (lewo + prawo) / 2;
        int index = 0;
        while (lewo < prawo) {

            if (srodek < poszukiwana) {
                lewo = srodek + 1;
                srodek = (lewo + prawo) / 2;
            } else if (srodek > poszukiwana) {
                prawo = srodek;
                srodek = (lewo + prawo) / 2;
            }
            while (lewo == poszukiwana) {
                index = lewo;
                return index;
            }
            while (prawo == poszukiwana) {
                index = prawo;
                return index;
            }
            while (srodek == poszukiwana) {
                index = srodek;
                return index;
            }
        }
        return 0;
    }
}
