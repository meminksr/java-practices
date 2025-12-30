import java.util.Scanner;

public class faktöriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz");

        long sayi;
        try {
            sayi = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("lütfen bir sayı giriniz");
            return;
        }

        long faktoriyel = 1;


        if (sayi < 0) {
            System.out.println("faktöriyel negatif sayıların tanımlanamaz");
            return;
        } else {
            while (sayi >= 1) {

                faktoriyel = faktoriyel * sayi;
                sayi--;
                // neden sayıyı 1 azaltıyoruz çünkü faktöriyel hesaplamasında n*(n-1)*(n-2)...*1 şeklinde ilerliyoruz.

            }
            System.out.println(faktoriyel);
        }


    }
}
