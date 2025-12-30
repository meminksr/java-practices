import java.util.Scanner;

public class doWhileAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bakiye = 1000.0;
        int islem;

        // Bu bizim kontrol anahtarımız (Flag/Bayrak denir)
        boolean devam = true;

        System.out.println("--- Do-While ATM'ye Hoş Geldiniz ---");

        // "DO" -> Önce bunları bir yap bakalım...
        do {
            System.out.println("\n1-Bakiye 2-Yatır 3-Çek 4-Çıkış");
            System.out.print("Seçiminiz: ");
            islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("Bakiye: " + bakiye);
                    break;
                case 2:
                    System.out.print("Yatırılacak miktar: ");
                    bakiye += scanner.nextDouble();
                    System.out.println("Yeni bakiye: " + bakiye);
                    break;
                case 3:
                    System.out.print("Çekilecek miktar: ");
                    double tutar = scanner.nextDouble();
                    if (tutar > bakiye) {
                        System.out.println("Yetersiz bakiye.");
                    } else {
                        bakiye -= tutar;
                        System.out.println("Kalan bakiye: " + bakiye);
                    }
                    break;
                case 4:
                    System.out.println("Kart iade ediliyor...");
                    devam = false; // ANAHTARI KAPATTIK!
                    break;
                default:
                    System.out.println("Hatalı seçim.");
            }

            // "WHILE" -> İşlemler bitti, şimdi soruyoruz: Devam edelim mi?
            // Eğer case 4 seçildiyse 'devam' false olduğu için döngü burada biter.
        } while (devam == true);

        System.out.println("Program başarıyla sonlandı.");
    }
}