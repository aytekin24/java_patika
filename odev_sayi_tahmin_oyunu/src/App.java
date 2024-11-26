import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random(); 
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0; 
        int selected;
        int[] wrong = new int[5]; 
        boolean isWin = false; 
        boolean isWrong = false; 
                             
        while (right < 5) {
            System.out.print("Lütfen Tahmininizi Giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayı giriniz.");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde can hakkınızdan düşülecektir");
                } else {
                    right++; 
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + (5 - right));
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin Ettiğiniz Sayı: " + selected);
                isWin = true;
                break;
            } else {
                wrong[right] = selected; 

                System.out.println("Üzgünüz, yanlış tahmin ! Lütfen Tekrar Deneyiniz.");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                right++;
                System.out.println("Kalan Hakkınız: " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz :( ");
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
        System.out.println("Gizli Sayı: " + number);
    }
}
