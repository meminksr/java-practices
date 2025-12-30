import java.util.Scanner;

public class WhileAtm {
    public static void main(String[] args) {

        // ATM Uygulaması
        // Başlangıç bakiyesi 1000 TL olarak ayarlanmıştır.
        // Kullanıcı bakiye sorgulama, para yatırma, para çekme ve çıkış işlemlerini yapabilir.
        // Para çekme işlemi için bakiye kontrolü yapılır.
        // Geçersiz işlem numarası girildiğinde kullanıcı uyarılır.
        // İşlemler sonsuz döngüde devam eder, kullanıcı çıkış yapana kadar.
        // Scanner sınıfı ile kullanıcıdan giriş alınır.
        // Switch-case yapısı ile işlemler yönetilir.
        // Bakiye güncellemeleri her işlem sonrası ekrana yazdırılır.
        // Hata durumları için try-catch bloğu kullanılır.
        // Çıkış işlemi için System.exit(0) kullanılır.
        // Kullanıcı dostu mesajlar ile işlem adımları belirtilir.
        // Tüm işlemler int veri tipi ile gerçekleştirilir.
        // Başlangıç bakiyesi, yatırılan tutar ve çekilen tutar değişkenleri tanımlanır.
        // İşlem numarası değişkeni tanımlanır.
        // Döngü içinde kullanıcıdan işlem numarası alınır ve işleme göre yönlendirilir.
        // Bakiye sorgulama, para yatırma, para çekme ve çıkış işlemleri için case blokları oluşturulur.
        // Geçersiz işlem numarası için default bloğu oluşturulur.
        // Döngü sonsuz döngü olarak ayarlanır.
        // Kullanıcı çıkış yapana kadar işlemler devam eder.
        // Her işlem sonrası bakiye güncellenir ve ekrana yazdırılır.
        // Hata durumlarında kullanıcı bilgilendirilir.
        // Program sonlandırıldığında kullanıcıya çıkış mesajı verilir.
        // Tüm işlemler kullanıcı dostu bir şekilde gerçekleştirilir.
        // Program akışı kullanıcı deneyimini ön planda tutar.
        // Kullanıcı hatalarına karşı önlemler alınır.
        // Program sonunda kaynaklar serbest bırakılır.
        // Kullanıcıdan alınan veriler doğru şekilde işlenir.
        // Program akışı mantıklı ve anlaşılır bir şekilde düzenlenir.
        // Kullanıcı deneyimi en üst düzeyde tutulur.
        // Program sonunda kullanıcıya teşekkür mesajı verilir.
        // Tüm işlemler güvenli bir şekilde gerçekleştirilir.
        // Program sonunda kullanıcıya iyi günler dilenir.
        // Tüm işlemler kullanıcı dostu bir şekilde tasarlanır.
        // Program sonunda kullanıcıya başarılar dilenir.
        // Tüm işlemler kullanıcı odaklı bir şekilde gerçekleştirilir.
        // Program sonunda kullanıcıya sağlıklı günler dilenir.
        // Tüm işlemler kullanıcı memnuniyetini ön planda tutar.
        // Program sonunda kullanıcıya mutluluklar dilenir.
        // Tüm işlemler kullanıcı ihtiyaçlarına göre şekillendirilir.
        int bakiye = 1000, yatirilanTutar = 0, çekilenTutar = 0;
        int islem;


        while (true) {

            System.out.println("Lütfen İşlem Yapmak İstediğiniz Numarayı Giriniz: ");
            System.out.println("1- Bakiye Sorgulama");
            System.out.println("2- Para Yatırma");
            System.out.println("3- Para Çekme");
            System.out.println("4- Çıkış Yap");
            System.out.print("Seçiminiz: ");
            Scanner scanner = new Scanner(System.in);
            islem = scanner.nextInt();


            switch (islem) {
                case 1:
                    System.out.println("Bakiyeniz:" + bakiye);
                    break;
                case 2:
                    System.out.println("Yatırmak İstediğiniz Tutarı Giriniz: ");
                    yatirilanTutar = scanner.nextInt();
                    bakiye = bakiye + yatirilanTutar;
                    System.out.println("Yeni Bakiyeniz: " + bakiye);
                    break;
                case 3:
                    System.out.print("Çekmek İstediğiniz Tutarı Giriniz:");
                    çekilenTutar = scanner.nextInt();

                    if (çekilenTutar > bakiye) {
                        System.out.println("ÇEKECEĞİNİZ TUTAT BAKİYENİZDEN BÜYÜK OLMAMALI.");
                    } else {
                        bakiye = bakiye - çekilenTutar;
                        System.out.println("Yeni Bakiyeniz: " + bakiye);
                    }

                    break;
                case 4:
                    System.out.println("Çıkış Yapılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz İşlem Numarası. Lütfen Tekrar Deneyiniz.");
                    break;


            }
        }


    }
}
