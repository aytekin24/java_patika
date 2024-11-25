import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        int a = 0;
        int b = 1;
        int total=0;

        for (int i = 0; i < number; i++) {
            total = a + b;
            System.out.println(a + "+" + b + "=" + total);
            a = b;
            b = total;
        }
    }
}
