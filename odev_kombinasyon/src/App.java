import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int n, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Grupların eleman sayısı: ");
        r = input.nextInt();

        int toplam = 1;
        int total = 1;
        int t = 1;
        for (int i = 1; i <= n; i++) {
            toplam = toplam * i;
        }
        for (int j = 1; j <= r; j++) {
            total = total * j;
        }
        for (int k = 1; k <= (n - r); k++) {
            t = t * k;
        }
        int kom = toplam / (total * t);
        System.out.print("Kombinasyon: " + kom);

    }
}
