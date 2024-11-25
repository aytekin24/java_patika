import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int sayi, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        do {

            if ((sayi % 2 == 0) && (sayi % 4 == 0)) {
                total += sayi;
            }
        } while (0<=sayi);
        System.out.print("Toplam: " + total);
    }
}
