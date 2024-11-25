import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double km, kmFiyat = 0.10, total,in20=((100-20)/100.0),in50=((100-50)/100.0),in10=((100-10)/100.0),in30=((100-30)/100.0);
        int yas, yolculukTipi;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe (KM cinsinden) giriniz: ");
        km = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk Tipini Seçiniz: ");
        System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
        yolculukTipi = input.nextInt();

        if (0 < km && 0 <= yas && (yolculukTipi == 1 || yolculukTipi == 2)) {

            if (yolculukTipi == 2) {
                if (yas < 12) {
                    total = (km * kmFiyat) * in50 * in20;
                } else if (12 <= yas && yas <= 24) {
                    total = (km * kmFiyat) * in10 * in20;
                } else if (65 < yas) {
                    total = (km * kmFiyat) * in30 * in20;
                } else {
                    total = (km * kmFiyat) * in20;
                }
            } else {
                if (yas < 12) {
                    total = (km * kmFiyat) * in50;
                } else if (12 <= yas && yas <= 24) {
                    total = (km * kmFiyat) * in10;
                } else if (65 < yas) {
                    total = (km * kmFiyat) * in30;
                } else {
                    total = (km * kmFiyat);
                }
            }
            System.out.print("Bilet Fiyatı: " + total);
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
}
