import java.util.Scanner;

public class indirimHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //İndirim Hesaplama Bir alışveriş tutarı için double tutar değişkeni tanımla.
        // Eğer tutar 100 TL'den az ise indirim uygulanmaz.
        // Eğer tutar 100 TL ile 500 TL arasında ise %10 indirim uygulanır.
        // Eğer tutar 500 TL'den fazla ise %20 indirim uygulanır.
        // Toplam tutarı ekrana yazdır.
        System.out.print("Alışveriş tutarını giriniz:");
        double tutar = scanner.nextDouble();
        double indirimliTutar;



        if (tutar <= 20) {
            System.out.println("Hata! Geçersiz tutar girdiniz.");
            return;
        }

        if (tutar < 100) {
            System.out.println("İndirim uygulanmaz. \nToplam tutar: " + tutar);

        } else if (tutar >= 100 && tutar < 500) {

            indirimliTutar = tutar * 0.90; // %10 indirim
            System.out.println("Toplam tutar (indirimli): " +(int) indirimliTutar);

        } else {
            indirimliTutar = tutar * 0.80;
            System.out.println("Toplam tutar (indirimli): " + (int) indirimliTutar);
        }
        scanner.close();// Kapatma işlemi


    }
}
