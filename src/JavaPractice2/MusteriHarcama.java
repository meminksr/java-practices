package JavaPractice2;

import java.util.Scanner;

public class MusteriHarcama {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("müşteri sayısı");
        int n = klavye.nextInt();
        String[] adlar = new String[n];
        int[] siparisler = new int[n];
        int[] tutarlar = new int[n];
        double[] ortalamalar = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%d.müşterinin:", i + 1);
            System.out.print("\n----------------------");
            System.out.print("\nadını gir:");
            adlar[i] = klavye.next();
            System.out.print("sipariş sayısını gir");
            siparisler[i] = klavye.nextInt();
            System.out.println("toplam harcamayı gir");
            tutarlar[i] = klavye.nextInt();
            ortalamalar[i] = (double) tutarlar[i] / siparisler[i];
        }
        System.out.println("\n-----müşteri harcama listesi-----");
        System.out.println("adı    sipariş    tutar    ortalama");
        System.out.print("---------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%-10s %-10d %-10d %10.2f", adlar[i], siparisler[i], tutarlar[i], ortalamalar[i]);
        }
        double eny = ortalamalar[0];
        for (int i = 1; i < n; i++) {
            if (ortalamalar[i] > eny) {
                eny = ortalamalar[i];
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("en yüksek sepet ortalaması:" + eny);
        for (int i = 0; i < n; i++) {
            if (ortalamalar[i] == eny) {
                System.out.println(adlar[i]);
            }
        }
    }
}

