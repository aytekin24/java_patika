import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
        double a,b,c,alan,u;

        Scanner input=new Scanner(System.in);
        System.out.print("1.kenarı girin:");
        a=input.nextDouble();
        System.out.print("2.kenarı girin:");
        b=input.nextDouble();
        System.out.print("3.kenarı girin:");
        c=input.nextDouble();
   
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı:"+alan);
    }
}
