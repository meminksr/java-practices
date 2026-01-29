package JavaPractice2;

import java.util.Scanner;

public class KitapPopulerlik {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("kitap sayısı");
        int n = klavye.nextInt();
        String[] adlar = new String[n];
        int[] adet = new int[n];
        int[] odunc = new int[n];
        double[] oranlar = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%d.kitabın:", i + 1);
            System.out.print("\n----------------------");
            System.out.print("\nadını gir:");
            adlar[i] = klavye.next();
            System.out.print("ADET sayısını gir");
            adet[i] = klavye.nextInt();
            System.out.println("ödünç sayısını gir");
            odunc[i] = klavye.nextInt();
            oranlar[i] = (double) odunc[i] / adet[i];
        }
        System.out.println("\n-----kitap ilgi listesi-----");
        System.out.println("adı    sayfa    ödünç    oran");
        System.out.print("---------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%-10s %-10d %-10d %10.2f", adlar[i], adet[i], odunc[i], oranlar[i]);
        }
        double eny = oranlar[0];
        for (int i = 1; i < n; i++) {
            if (oranlar[i] > eny) {
                eny = oranlar[i];
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("en popüler kitap oranı:" + eny);
        for (int i = 0; i < n; i++) {
            if (oranlar[i] == eny) {
                System.out.println(adlar[i]);
            }
        }
    }
}

