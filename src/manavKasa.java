import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {

        double armutFiyat=2, elmaFiyat=3, muzFiyat=5 ,mandalinaFiyat=0.25;
        double armutKg, elmaKg, muzKg, mandalinaKg;
        double toplamTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mandalina Kaç Kilo?");
        mandalinaKg = scanner.nextDouble();
        System.out.println("Armut Kaç Kilo?");
        armutKg = scanner.nextDouble();
        System.out.println("Elma Kaç Kilo?");
        elmaKg = scanner.nextDouble();
        System.out.println("Muz Kaç Kilo?");
        muzKg = scanner.nextDouble();
        toplamTutar=(armutFiyat*armutKg)+(elmaFiyat*elmaKg)+(muzFiyat*muzKg);
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        //mandalina fiyatı %10 indirimli
        double mandalinaIndirimliFiyat=mandalinaFiyat*0.90;
        double mandalinaTutar=mandalinaIndirimliFiyat*mandalinaKg;
        System.out.println("Mandalina Tutar (İndirimli): " + mandalinaTutar + " TL");
        double genelToplam=toplamTutar+mandalinaTutar;
        System.out.println("Genel Toplam Tutar: " + genelToplam + " TL");
        scanner.close();




    }
}
