package strumienie;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

    public static Path file = Paths.get("/Users/marcinparada/Desktop/slowa.txt");
    public static Charset charset = Charset.forName("UTF-8");
    public static ArrayList<String> lista = new ArrayList<>();
    public static ArrayList<String> lista2 = new ArrayList<>();

    public static void main(String[] args) {


        tworzenieListy();
        slowaDluzszeNiz13(lista);
        System.out.println(lista.size());
        System.out.println(lista2.size());


    }

    private static ArrayList<String> tworzenieListy() {
        try (BufferedReader br = Files.newBufferedReader(file, charset)) {
            br.lines().forEach(lista::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }

    private static ArrayList<String> slowaDluzszeNiz13(ArrayList<String> lista) {

        for (String l : lista) {
            if (l.length() > 13) {
                lista2.add(l);
            }else{
                continue;
            }
        }return lista2;
    }

//    private static ArrayList<String> zaczynajaceSieOdLiteryA(){
//        ArrayList<String> listaOdA = new ArrayList<>();
//        try (BufferedReader br = Files.newBufferedReader(file, charset)){
//            if (){
//                br.lines().forEach(listaOdA::add);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return listaOdA;
//
//    }

}