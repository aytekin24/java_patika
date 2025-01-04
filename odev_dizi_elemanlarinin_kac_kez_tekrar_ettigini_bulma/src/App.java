
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] t = new int[arr.length];
        int visit = -1;
        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Tekrar Sayıları; ");

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    t[j] = visit;
                }
            }
            if (t[i] != visit) {
                t[i] = count;
            }

        }
        for (int k = 0; k < t.length; k++) {
            if (t[k] != visit) {
                System.out.println(arr[k] + " sayısı " + t[k] + " kere tekrar etmiştir.");
            }

        }

    }
}
