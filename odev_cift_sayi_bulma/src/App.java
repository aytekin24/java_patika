import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number, total, adet;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        total = 0;
        adet = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                adet += 1;
            }
        }
        System.out.println(total / adet);
    }
}
