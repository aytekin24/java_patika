import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz:");
        yil = input.nextInt();

        if (0 < yil) {
            if (yil % 4 == 0) {
                System.out.print(yil + " bir artık yıldır !");
            } else {
                System.out.print(yil + " bir artık yıl değildir !");
            }
        } else {
            System.out.print("Lütfen geçerli bir sayı giriniz !");
        }
    }
}
