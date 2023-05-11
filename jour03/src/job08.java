import java.util.Arrays;

public class job08 {
    public static void main(String[] args) {
        int[][] matrice = {{5, 9, 3}, {7, 2, 8}, {1, 6, 4}};
        int row = matrice.length;
        int col = matrice[0].length;

        int i = 0;
        while(i < row * col) {
            int minVal = Integer.MAX_VALUE;
            int minRow = -1;
            int minCol = -1;
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (matrice[j][k] < minVal) {
                        minVal = matrice[j][k];
                        minRow = j;
                        minCol = k;
                    }
                }
            }
            System.out.print(minVal + " ");
            matrice[minRow][minCol] = Integer.MAX_VALUE;
            i++;

            if(i % col == 0) {
                System.out.println();
            }
        }
    }
}
