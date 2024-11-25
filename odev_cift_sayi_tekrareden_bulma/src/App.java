public class App {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {

        int[] list = { 3, 8, 3, 1, 2, 2, 5, 8, 6, 4, 9, 8, 5, 6, 9, 1 };
        int[] duplicate = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        if (list[i] % 2 == 0) {
                            duplicate[i] = list[i];
                            break;
                        }
                    }
                    break;
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
}
