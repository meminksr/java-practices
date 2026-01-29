package JavaPractice2;

import java.util.Scanner;
public class EmlakPrim {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("çalışan sayısı");
        int n = klavye.nextInt();
        String[] adlar = new String[n];
        int[] SattığıEvler = new int[n];
        int[] ToplamTutar = new int[n];
        double[] primler = new double[n];
        for (int i = 0; i < n; i++) {

            System.out.print((i + 1) + ".çalışanın ADI: ");
            adlar[i] = klavye.next();
            System.out.print("Sattığı ev sayısı:");
            SattığıEvler[i] = klavye.nextInt();
            System.out.print("Toplam tutar:");
            ToplamTutar[i] = klavye.nextInt();
            primler[i] = (ToplamTutar[i] * 0.02) + (SattığıEvler[i] * 500);

        }
        System.out.println("------------------------------------------------");
        System.out.println("\n-----emlakçı prim listesi-----");
        System.out.println("adı    satılan ev    toplam tutar    prim");
        System.out.print("---------------------------");
        for (int i = 0; i < n; i++) {

            System.out.printf("\n %-10s %-10d %-10d %-10.2f", adlar[i], SattığıEvler[i], ToplamTutar[i], primler[i]);
        }

        double eny = primler[0];
        for (int i = 1; i < n; i++) {
            if (primler[i] > eny) {
                eny = primler[i];
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("en yüksek prim:" + eny);
        for (int i = 0; i < n; i++) {
            if (primler[i] == eny) {
                System.out.println(adlar[i]);

            }
        }
    }
}