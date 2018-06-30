package dowodOsobisty;

import java.util.*;

public class dowod {


    public static void main(String[] args) {
        Map<String, Integer> mapa1 = tworzMape();
        System.out.println(mapa1);
        String dowodNumer;
    }

    //metoda tworzaca mape litera:wartosc
    public static Map<String, Integer> tworzMape() {
        Integer j = 10;
        Map<String, Integer> reference = new TreeMap<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            reference.put(String.valueOf(i), j++);
        }
        return reference;
    }


}
