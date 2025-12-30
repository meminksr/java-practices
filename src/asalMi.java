import java.util.Scanner;

public class asalMi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi;
        try {
            sayi = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Lütfen geçerli bir sayı giriniz.");
            return;
        }
        boolean asalMi = true;
        if (sayi < 2) {
            System.out.println("1 veya daha küçük sayılar asal değildir.");
            return;
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % 2 == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi == true) {

                System.out.println(sayi + " sayısı asaldır.");
            } else {
                System.out.println(sayi + " sayısı asal değildir.");


            }
        }
    }
}
