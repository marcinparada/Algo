//Napisz aplikację konsolową:
//- aplikacja będzie posiadać statyczne finalne pole typu int o nazwie N i dowolnej wartości
//- aplikacja będzie posiadać interface Sort posiadający jedną metodę: int[] sort(int[] array); Metoda przyjmuje w argumencie
//nieposortowaną tablicę dowolnej wielkości, zwraca posortowaną tablicę
//- zaimplementuj interface Sort w klasach BubbleSort, MergeSort, QuickSort reprezentujących odpowiednie algorytmy sortowania
//- https://pl.wikipedia.org/wiki/Sortowanie_b%C4%85belkowe - https://pl.wikipedia.org/wiki/Sortowanie_przez_scalanie
//- https://pl.wikipedia.org/wiki/Sortowanie_szybkie
//- wygeneruje N-elementową tablicę wypełnioną losowymi wartościami z zakresu 1 - N
//- posortuj tę tablicę wszystkimi zaimplementowanymi algorytmami i porównaj czasy wykonania
//Który algorytm działa najszybciej?
//Opcjonalnie:
//Dodaj implementacje algorytmów:
//Insertion Sort - https://pl.wikipedia.org/wiki/Sortowanie_przez_wstawianie Heap Sort - https://pl.wikipedia.org/wiki/Sortowanie_przez_kopcowanie

package Niedziela1.AplikacjaSortowanie;


import java.util.Random;

public class Main {
    static final int N = 10;

    public static void main(String[] args) {

        int [] tab = stworzTabele(N);

        for (int i:tab){
            System.out.print(i + ", ");
        }
    }

    public static int[] stworzTabele(int wielkoscTabeli) {
        int[] tablica = new int[wielkoscTabeli];
        Random rd = new Random();
        for (int i = 0; i < wielkoscTabeli; i++) {
            tablica[i] = i + rd.nextInt(N)+1;
        }  return tablica;
    }

}
