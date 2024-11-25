import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int yil, kalan;
        String burc;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        yil = input.nextInt();
        burc = "";
        kalan = yil % 12;
        LocalDateTime date = LocalDateTime.now();

        if (0 < yil && yil < date.getYear()) {
            if (kalan == 0) {
                burc = "Maymun";
            } else if (kalan == 1) {
                burc = "Horoz";
            } else if (kalan == 2) {
                burc = "Köpek";
            } else if (kalan == 3) {
                burc = "Domuz";
            } else if (kalan == 4) {
                burc = "Fare";
            } else if (kalan == 5) {
                burc = "Öküz";
            } else if (kalan == 6) {
                burc = "Kaplan";
            } else if (kalan == 7) {
                burc = "Tavşan";
            } else if (kalan == 8) {
                burc = "Ejderha";
            } else if (kalan == 9) {
                burc = "Yılan";
            } else if (kalan == 10) {
                burc = "At";
            } else if (kalan == 11) {
                burc = "Koyun";
            }
            System.out.print("Çin Zodyağı Burcunuz: " + burc);
        } else {
            System.out.print("Geçersiz yıl bilgisi girdiniz");
        }

    }
}
