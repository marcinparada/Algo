package strumienie;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//Używając strumieni:
//- wypisz tylko linie nieparzyste
//- wypisz tylko linie zaczynające są od litery "a"
//- wypisz całą zawartość pliku, ale zamień każde wystąpienie “a” na “b”
//- wypisz ilość wystąpień litery “a” w linii
//
//Użyj pliku słownikowego utworzonego na potrzeby gry Wisielec.

public class Main {

    public static ArrayList<String> lista = new ArrayList<>();

    public static void main(String[] args) {


        tworzenieListy();

        for (String l : lista) {
            if (lista.indexOf(l) % 2 == 0){

            }
        }


    }

    private static ArrayList<String> tworzenieListy() {
        Path file = Paths.get("/Users/marcinparada/Desktop/slowa.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                lista.add(line);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return lista;
    }
}
