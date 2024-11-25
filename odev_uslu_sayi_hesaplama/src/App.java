import java.util.Scanner;

public class App {

    static int pow(int a, int b) {
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }

    public static void main(String[] args) throws Exception {

        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        b = input.nextInt();
        System.out.println("Sonuç: " + pow(a, b));

    }
}
