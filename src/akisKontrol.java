public class akisKontrol {
    public static void main(String[] args) {

//== -> ramde aynı değerleri mi  gösteriyorlar
//!= eşit değil mi
//< > >= <= büyük küçük
// ! tersini al demek

        int sayi1 = 20;
        int sayi2 = 250;


        if (sayi1 < 250) {

            System.out.println("girdi ");
        }

        System.out.println("Program Bitti");


        String isim1 = "mehmet";
        String isim2 = "mehmet";
        if (isim1 == isim2) {
            System.out.println("girdi ");
        }
        System.out.println("Program Kontrol");


        int Sayi = -1;

        if (Sayi > 0) {
            System.out.println("EVET ");
            Sayi= Sayi - 1;

        } else if (Sayi == 0) {
            System.out.println("EVET ");
        } else if (Sayi < 0) {
            System.out.println("EVET ");
            Sayi = Sayi + 1;
        }
        System.out.println(Sayi);


        String isim3 = "mehmet";
        if (isim3 == "mehmet") {
            System.out.println("EVET ");
        }
        else  {
            System.out.println("Değer Mehmet Değil ");
        }
        System.out.println("Program Kontrol");



    }
}
