package locale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

//1. Utwórz program który zliczy liczbę wystąpień danego języka w różnych krajach. Uży klasy java.util.Locale:
//https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html
//
//2. Rozszerz program o funkcjonalność w której program wypisze wszystkie kraje w których używany jest dany język.
// Język do sprawdzenia będzie podawany przez użytkownika w formie 2-literowego kodu języka
public class Main {
    public static void main(String[] args) {


        Locale[] lok = Locale.getAvailableLocales();
        Map<String, Integer> mapa = new HashMap<>();

        Map<String, ArrayList<String>> mapaZadanie2 = new HashMap<>();


        for (Locale l : lok) {
            System.out.println(l.getDisplayLanguage());
        }

        for (Locale l : lok) {
            if (!mapa.containsKey(l.getDisplayLanguage())) {
                mapa.put(l.getDisplayLanguage(), 1);
            } else {
                int ilosc = mapa.get(l.getDisplayLanguage());
                mapa.replace(l.getDisplayLanguage(), ++ilosc);
            }
        }


        System.out.println(mapa);
        // zad. 2

        System.out.println("\n Zadanie 2.");

//        for (Locale l: lok){
//            System.out.println(l.getDisplayCountry());
//        }

//        ArrayList<String> listaPanstw = new ArrayList<>();


        for (Locale l : lok) {
            ArrayList<String> listaPanstw = new ArrayList<>(0);
            if (!mapaZadanie2.containsKey(l.getLanguage())) {
                  listaPanstw.add(l.getDisplayCountry());
                mapaZadanie2.put(l.getLanguage(),listaPanstw);
            } else {
             listaPanstw = mapaZadanie2.get(l.getLanguage());
             listaPanstw.add(l.getDisplayCountry()); //??!
            }
        }
        System.out.println(mapaZadanie2);
    }
}

