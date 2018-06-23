package Niedziela1.PracaDomowa;

import java.util.Scanner;


public class Main {

    private static int licznik;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj podstawe");
        int podstawa = sc.nextInt();
        System.out.println("Podaj wykladnik");
        int wykladnik = sc.nextInt();
        licznik = 0;
        System.out.println(potegowanie(podstawa, wykladnik));
        System.out.println("Licznik działań: " + licznik);

    }

    public static int potegowanie(int podst, int wykl) {
        licznik++;
        if (wykl == 0) {
            return 1;
        }
        if (wykl % 2 == 0) {
            licznik++;
            int wyk = potegowanie(podst, wykl / 2);

            return wyk * wyk;
        }
        if (wykl % 2 != 0) {
            licznik++;
            int wy = potegowanie(podst, (wykl - 1) / 2);
            int w = wy * wy;
            int w1 = w * podst;
            return w1;
        }
        return 0;
    }

}
