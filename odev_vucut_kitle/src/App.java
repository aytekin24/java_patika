import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double kilo,boy;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo=input.nextDouble();
        System.out.print("Lütfen Boyunuzu(metre cinsinden) Giriniz: ");
        boy=input.nextDouble();
        double kitle=kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz: "+kitle);
        
    
    }
}
