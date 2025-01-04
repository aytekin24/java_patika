public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Matris : ");
        int[][] matris = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
        int[][] transpoze = new int[matris[0].length][matris.length];

        int satir = matris[0].length;
        int sutun = matris.length;

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoze[i][j] = matris[j][i];
            }
           
        }
        for (int[] row1 : transpoze) {
            for (int col1 : row1) {
                System.out.print(col1 + " ");
            }
            System.out.println();
        }

    }
}
