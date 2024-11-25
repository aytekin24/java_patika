import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int sayi, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi % 4 == 0) {
                total += sayi;
            }
        } while (sayi%2==0);
        System.out.print("Toplam: " + total);
    }
}
