import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double r,alan,x;

        Scanner input=new Scanner(System.in);
        System.out.print("Yarıçap Değerini Giriniz: ");
        r=input.nextDouble();
        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        x=input.nextDouble();
        alan=(Math.PI*(r*r)*x)/360;

        System.out.println("Daire Diliminin Alanı: "+alan);

    }
}
