//Napisz aplikację która oblicza NWD za pomocą rekurencji.
//Aplikacja powinna przyjąć dwie liczby całkowite od użytkownika.
package Niedziela1.Zadanka;

import java.util.Scanner;

public class DzielenieKwadratu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierszy bok");
        int pierwszyBok = sc.nextInt();
        System.out.println("Podaj drugi bok");
        int drugiBok = sc.nextInt();
        System.out.println("Najwiekszy wspolny dzielnik to: " + nwd(pierwszyBok, drugiBok));

    }

    public static int nwd(int bok1, int bok2) {
        if (bok1 % bok2 == 0) {
            return bok2;
        }
        return nwd(bok2, bok1 % bok2);
    }
}
