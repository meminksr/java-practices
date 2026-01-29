package JavaPractice2;

import java.util.Scanner;

public class sudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. ADIM: 2 Boyutlu Array ile Haritayı Oluşturuyoruz
        // 0 olan yerler BOŞ kutuları temsil ediyor.
        int[][] tahta = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println("--- SUDOKU OYUNUNA HOŞ GELDİN HACI ---");
        System.out.println("Çıkmak için satır kısmına -1 yazabilirsin.\n");

        while (true) {
            // 2. ADIM: Tahtayı Ekrana Çizdirme (İç İçe For Döngüsü)
            // i = satır, j = sütun
            for (int i = 0; i < 9; i++) {
                if (i % 3 == 0 && i != 0) { // 3 satırda bir çizgi çek (görsellik)
                    System.out.println("---------------------");
                }

                for (int j = 0; j < 9; j++) {
                    if (j % 3 == 0 && j != 0) { // 3 sütunda bir çizgi çek
                        System.out.print("| ");
                    }

                    // Eğer sayı 0 ise boş kutu (.) göster, değilse sayıyı yaz
                    if (tahta[i][j] == 0) {
                        System.out.print(". ");
                    } else {
                        System.out.print(tahta[i][j] + " ");
                    }
                }
                System.out.println(); // Bir alt satıra geç
            }

            // 3. ADIM: Kullanıcıdan Hamle Alma
            System.out.println("\nLütfen hamleni yap!");

            System.out.print("Satır (1-9): ");
            int satir = scanner.nextInt();

            if (satir == -1) break; // Oyundan çıkış

            System.out.print("Sütun (1-9): ");
            int sutun = scanner.nextInt();

            System.out.print("Değer (1-9): ");
            int deger = scanner.nextInt();

            // 4. ADIM: Array Mantığı (Kullanıcı 1 diyor ama Array 0'dan başlar!)
            // Bu yüzden kullanıcının girdiği sayıdan 1 çıkarıyoruz.
            int gercekSatir = satir - 1;
            int gercekSutun = sutun - 1;

            // Hamle Kontrolü (Basitçe)
            if (gercekSatir >= 0 && gercekSatir < 9 && gercekSutun >= 0 && gercekSutun < 9) {
                // Oraya değer ata
                tahta[gercekSatir][gercekSutun] = deger;
                System.out.println("Hamle yapıldı! \n");
            } else {
                System.out.println("Hatalı koordinat girdin hacı! Tekrar dene.\n");
            }
        }

        System.out.println("Oyun bitti. Görüşürüz!");
    }
}