import java.util.Scanner;
import java.util.Random; // Rastgele sayı üretmek için kütüphane

public class tahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // Random nesnesi oluşturuyoruz
        // Rastgele sayı üretmek için Random sınıfını kullanıyoruz

        // 1 ile 100 arasında rastgele bir sayı tutuyoruz
        int tutulanSayi = random.nextInt(100) + 1;

        // Kullanıcının tahmini için bir değişken (Başta 0 yaptık ki döngüye girsin)
        int tahmin = 0;
        int denemeSayisi = 0;

        System.out.println("--- SAYI TAHMİN OYUNU ---");
        System.out.println("Aklımdan 1 ile 100 arasında bir sayı tuttum.");
        System.out.println("Bakalım bulabilecek misin?");

        // MANTIK: Tahmin, tutulan sayıya EŞİT OLMADIĞI SÜRECE dön.
        // Yani: "Yanlış bildiğin sürece sormaya devam et."
        while (tahmin != tutulanSayi) {

            System.out.print("Tahminin ne? : ");
            tahmin = scanner.nextInt();
            denemeSayisi++; // Her tahminde sayacı artır

            if (tahmin < tutulanSayi) {
                System.out.println("Daha BÜYÜK bir sayı söyle! ⬆️");
            } else if (tahmin > tutulanSayi) {
                System.out.println("Daha KÜÇÜK bir sayı söyle! ⬇️");
            } else {
                System.out.println("\n🎉 TEBRİKLER! Sayıyı buldun!");
                System.out.println(denemeSayisi + ". denemede bildin.");
            }
        }
    }
}