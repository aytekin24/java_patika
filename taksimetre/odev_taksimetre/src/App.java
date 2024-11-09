import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int km;
        double perKm=2.20, tutar,startPrice=10;

        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km=input.nextInt();
        tutar = startPrice+ km*perKm; 

        tutar=(tutar<20) ? 20 : tutar;
        System.out.println("Toplam Tutar:"+tutar);


    }
}
