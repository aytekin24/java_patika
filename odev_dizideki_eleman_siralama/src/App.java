import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int boyut;
        int eleman;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        boyut = input.nextInt();
        int[] arr = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < boyut; i++) {
            
            System.out.print((i+1) + ". Elemanı: ");
            eleman = input.nextInt();
            arr[i] += eleman;
        }

        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

    }
}
