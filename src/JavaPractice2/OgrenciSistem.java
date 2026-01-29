package JavaPractice2;

import java.util.Arrays;
import java.util.Scanner;

public class OgrenciSistem {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("öğrenci sayısı");
        int n = klavye.nextInt();

        if (n < 1) {
            System.out.println("geçersiz öğrenci sayısı");
            return;
        }

        // 1. DİZİLERİ TANIMLA
        String[] adlar = new String[n];
        int[] vizeler = new int[n];
        int[] finaller = new int[n];
        double[] ortalamalar = new double[n];

        // 2. VERİ GİRİŞİ DÖNGÜSÜ

        // Döngü başlıyor
        for (int i = 0; i < n; i++) {

            try {  // <--- TRY BURAYA (Döngünün içine)
                System.out.printf("\n%d.öğrencinin:", i + 1);

                System.out.print("\nadını gir:");
                adlar[i] = klavye.next();

                System.out.print("vize notunu gir");
                vizeler[i] = klavye.nextInt(); // Hata riski burada

                System.out.print("final notunu gir");
                finaller[i] = klavye.nextInt(); // Hata riski burada

                // Hesaplamayı da buraya alabilirsin
                ortalamalar[i] = (vizeler[i] * 0.4) + (finaller[i] * 0.6);

            } catch (Exception e) { // <--- CATCH DE DÖNGÜNÜN İÇİNE

                System.out.println("HATA: Lütfen sayı giriniz! Bu öğrenciyi tekrar girin.");

                // KRİTİK NOKTA 1: Tamponu temizle (Yoksa sonsuz döngüye girer!)
                klavye.nextLine();

                // KRİTİK NOKTA 2: Sayacı bir geri al ki bu öğrenciyi atlamasın, tekrar sorsun
                i--;
            }
        }

        // 3. TABLO YAZDIRMA DÖNGÜSÜ
        System.out.println("\n-----sınıf not listesi-----");
        System.out.println("adı    vize    final    ortalama");
        System.out.print("---------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("\n%-10s %-10d %-10d %10.2f", adlar[i], vizeler[i], finaller[i], ortalamalar[i]);
        }

        double[] SiraliOrt = ortalamalar.clone();

        Arrays.sort(SiraliOrt);
        System.out.println("\n------------------------------");
        System.out.println("sıralanmış not ortalamaları:");
        System.out.println(Arrays.toString(SiraliOrt));
        System.out.println("\n------------------------------");
        System.out.println("en yüksek not ortalaması:" + SiraliOrt[n - 1]);
        System.out.println("en düşük not ortalaması:" + SiraliOrt[0]);
        ;


        // 4. SON VURUŞ: İSİM ARAMA (EQUALS)
        System.out.println("\n\n------------------------------");
        System.out.print("Notunu öğrenmek istediğiniz kişinin adı: ");
        String aranan = klavye.next();

        boolean bulundu = false;

        for (int i = 0; i < n; i++) {

            // İşte sihirli kelime: equals
            if (adlar[i].equals(aranan)) {

                System.out.println("\nBULDUM!");
                System.out.println("Öğrenci: " + adlar[i]);
                System.out.println("Ortalaması: " + ortalamalar[i]);

                if (ortalamalar[i] >= 60 && ortalamalar[i] <= 100) {
                    System.out.println("Durum: GEÇTİ");
                } else {
                    System.out.println("Durum: KALDI");
                }

                bulundu = true;
            }
        }

        if (bulundu == false) {
            System.out.println("Böyle bir öğrenci listede yok.");
        }
    }
}