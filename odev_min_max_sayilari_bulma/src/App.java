import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int sayi = input.nextInt();
        int minimum = 0;
        int maximum = 0;
        int number;

        for (int deger = 1; deger <= sayi; deger++) {
            System.out.print(deger + ". Sayıyı giriniz : ");
            number = input.nextInt();
            if (number < minimum) {
                minimum = number;
            }
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println("En Küçük Sayı: " + minimum);
        System.out.println("En Büyük Sayı: " + maximum);

    }
}
