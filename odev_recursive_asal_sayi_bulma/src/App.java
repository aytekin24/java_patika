import java.util.Scanner;

public class App {
    static int asal(int a,int i) {
        if (i == 1) {
            return 1;
        }else{
            if(a%i==0){
                return 0;
            }else{
                return asal(a,i-1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int number;
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        
        k=asal(number,number/2);
        if(k==1){
            System.out.println(number+" sayısı asal sayıdır. ");
        }else{
            System.out.println(number+ " sayısı asal sayı değildir.");
        }
    }
}
