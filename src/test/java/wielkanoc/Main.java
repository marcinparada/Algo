package wielkanoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//wyznacz date wielkanocy

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj rok:");
        int rokPodanyPrzeUzytkownika = sc.nextInt();

        int a = rokPodanyPrzeUzytkownika % 19;
        int b = rokPodanyPrzeUzytkownika / 100;
        int c = rokPodanyPrzeUzytkownika % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int p = (h + l - 7 * m + 114) % 31;

        int dzienWielkanocy = p + 1;
        int miesiacWielkanocy = (h + l - 7 * m + 114) / 31;
        String miesiacDoWyswietlenia;

        if (miesiacWielkanocy == 4) {
            miesiacDoWyswietlenia = "kwietnia";
        } else {
            miesiacDoWyswietlenia = "marca";
        }

        System.out.println("Data wielkanocy w " + rokPodanyPrzeUzytkownika + " roku: " + dzienWielkanocy + " " + miesiacDoWyswietlenia);


    }
}
