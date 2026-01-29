package JavaPractice2;

import java.util.Scanner;

public class OyuncuBasketPuanSistem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç oyuncu için puan gireceksiniz: ");
        int n = input.nextInt();
        String[] adlar = new String[n];
        int[] sayilar = new int[n];
        int[] asit = new int[n];
        double[] puanlar = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.println((i + 1) + ". oyuncunun adını giriniz: ");
            adlar[i] = input.next();
            System.out.println("Oyuncunun sayılarını giriniz: ");
            sayilar[i] = input.nextInt();
            System.out.println("Oyuncunun asistlerini giriniz: ");
            asit[i] = input.nextInt();
            puanlar[i] = (sayilar[i]) + (asit[i] * 1.5);


        }

        System.out.println("Oyuncu Bilgileri:");
        System.out.println("------------------------------------");
        System.out.println("Ad        Sayı      Asist     Puan");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("\n %-10s %-10d %-10d %-10.2f\n", adlar[i], sayilar[i], asit[i], puanlar[i]);
        }


        double eny = puanlar[0];
        for (int i = 1; i < n; i++) {
            if (puanlar[i] > eny) {
                eny = puanlar[i];
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("en yüksek verimlilik (MVP):" + eny);
        System.out.println("----------------------------");
        for (int i = 0; i < n; i++) {
            if (puanlar[i] == eny) {
                System.out.println(adlar[i]);
            }
        }


    }
}
