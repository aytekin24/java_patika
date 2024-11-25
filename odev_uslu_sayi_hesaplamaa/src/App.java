import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number, k, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        number = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= number;
        }
        System.out.print("Sonuç: " + total);
    }
}
