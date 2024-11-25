import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] arr = { 15, 12, 788, 1, -1, -778, 2, 0 };

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        System.out.println("Dizi : " + Arrays.toString(arr));
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayı : " + number);
        System.out.println("Girilen sayıdan en küçük yakın sayı : " + min);
        System.out.println("Girilen sayıdan en büyük yakın sayı : " + max);

    }
}
