import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = 1,a=0; i <= sayi; i *= 4,a++) {
            System.out.println("4'ün "+a+". kuvveti: " + i );
        }
        for(int j = 1,b=0;j<=sayi;j*=5,b++){
            System.out.println("5'in " +b+". kuvveti: " + j ); 
        }
    }
}
