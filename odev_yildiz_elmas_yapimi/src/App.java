import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println(" ");
        for (int n = number-1 ; 0 <= n; n--) {
            for (int k = 1; k <= (2 * n - 1); k++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
