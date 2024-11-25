import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        int a;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        a=input.nextInt();

        for(int i=a;i>=1;i--){
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
