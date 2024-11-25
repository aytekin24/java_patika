public class App {
    public static void main(String[] args) throws Exception {

        int number = 100;
        for (int i = 2; i <= number; i++) {
            boolean durum = true;
            for (int j = 2; j < ((i/2)+1); j++) {
                if (i % j == 0) {
                    durum = false;
                    break;
                }
            }
            if (durum == true) {
                System.out.print(i +" ");
            }
        }
    }

}
