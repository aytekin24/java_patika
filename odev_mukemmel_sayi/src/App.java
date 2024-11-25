import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        int total = 0;

         if (number > 0) {
            for (int i = 1; i > 0; i++) {
                if (number % i == 0) {
                    if(i != number){
                        total+=i;
                    }
                }
            }
            if(total==number){
                System.out.println(number+" Mükemmel Sayıdır");
            }else{
                System.out.println(number+" Mükemmel Sayı değildir.");
            }     
        }else{
            System.out.println("Lütfen pozitif tamsayı giriniz.");
        }
    }
}
