import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int basValue,total=0;
     
        while (number != 0) {
            basValue = number % 10;
            total+=basValue;
            number /=10;
        }
        System.out.println(total);
    }
}
