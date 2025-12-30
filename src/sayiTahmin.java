import java.util.Scanner;

public class sayıTahmin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hedefSayi = 50; // Bilgisayarın tuttuğu sayı (Şimdilik sabit)
        int tahmin;         // Kullanıcının gireceği sayı
        int sayac = 0;      // Kaç kere denediğini sayacak

        System.out.println("Hadi Oyun Başlasın! 1-100 arası bir sayı tuttum.");

        while (true) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            sayac++; // Her tahminde sayacı 1 arttırıyoruz (Unutma!)

            if (tahmin < hedefSayi) {
                System.out.println("Daha BÜYÜK bir sayı gir!");

            } else if (tahmin > hedefSayi) {
                System.out.println("Daha KÜÇÜK bir sayı gir!");

            } else {
                // Eşit olduğu durum (tahmin == hedefSayi)
                System.out.println("Tebrikler! Sayıyı buldun.");
                System.out.println("Toplam " + sayac + ". denemede bildin!");
                break; // Döngüyü kırıp oyunu bitiriyoruz
            }
        }
    }
}