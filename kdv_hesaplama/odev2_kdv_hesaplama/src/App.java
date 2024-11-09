import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double para, kdvOrani, tutar, kdv;

        Scanner veri = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        para = veri.nextDouble();
        if (0 < para) {
            if (0 < para && para < 1000) {
                kdvOrani = 0.18;
            }else {
                kdvOrani = 0.08;
            }
            kdv = para * kdvOrani;
            tutar = para + kdv;
            System.out.println("Girilen Tutar:" + para);
            System.out.println("KDV Oranı:" + kdvOrani);
            System.out.println("KDV Miktarı:" + kdv);
            System.out.println("KDV Dahil Tutar Miktarı:" + tutar);
        } else {
            System.out.println("Girilen Tutar Negatif Değer Olamaz");
        }

    }
}
