import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayısı giriniz: ");
        a = input.nextInt();
        System.out.print("2. sayısı giriniz: ");
        b = input.nextInt();
        System.out.print("3. sayısı giriniz: ");
        c = input.nextInt();

        if ((a < c) && (a < b)) {
            if (b < c) {
                System.out.print("a < b < c");
            }else{
                System.out.print("a < c < b");
            }
        }else if ((b < c) && (b < a)) {
            if (a < c) {
                System.out.print("b < a < c");
            }else{
                System.out.print("b < c < a");
            }
        }else{
            if (a < b) {
                System.out.print("c < a < b");
            }else{
                System.out.print("c < b < a");
            }
        }
    }
}
