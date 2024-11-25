import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        double total = 0;
        for (double i = 1; i <= number; i++) {
            total += (1 / i);
        }
        System.out.println(total);

    }
}
