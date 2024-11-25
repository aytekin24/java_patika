import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number1;
        int number2;
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        number2 = input.nextInt();

        // ebob

        int i = number1;
        int ebob;
        while (i >= 1) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
                System.out.println(number1 + " ve " + number2 + " sayılarının ebob değeri: " + ebob);
                break;
            }
            i--;
        }

        // ekok

        int j = 1;
        while (j <= number1 * number2) {
            if (j % number1 == 0 && j % number2 == 0) {
                System.out.println(number1 + " ve " + number2 + " sayılarının ekok değeri: " + j);
                break;
            }
            j++;
        }
    }
}
