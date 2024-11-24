import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double sayi1, sayi2;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz:");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.print("Çarpma: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 != 0) {
                    System.out.print("Bölme: " + (sayi1 / sayi2));
                } else {
                    System.out.print("Bir sayı sıfıra bölünemez");
                }
                break;
        }
    }
}
