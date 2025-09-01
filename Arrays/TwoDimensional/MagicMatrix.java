package Array.twoDimensional;

import java.util.*;

public class MagicMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the size:");
        n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(mat[i][j]+" ");
            }
            System.out.println();
        }

        // we need total n (rows) + n (cols) + 2 (diagonals) sums
        int[] sums = new int[2 * n + 2];
        int idx = 0;

        // row sums
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }

            sums[idx] = rowSum;
            idx++;
        }

        // column sums
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += mat[i][j];
            }

            sums[idx] = colSum;
            idx++;
        }

        // left diagonal
        int leftDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            leftDiagonalSum += mat[i][i];
        }
        sums[idx++] = leftDiagonalSum;

        // right diagonal
        int rightDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            rightDiagonalSum += mat[i][n - 1 - i];
        }
        sums[idx++] = rightDiagonalSum;

        // print all sums
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i]+" ");
        }

        // check magic matrix
        boolean isMagic = true;
        for (int i = 1; i < sums.length; i++) {
            if (sums[i] != sums[0]) {
                isMagic = false;
                break;
            }
        }

        System.out.println();
        if (isMagic) {
            System.out.println("It is a Magic Matrix!");
        } else {
            System.out.println("Not a Magic Matrix.");
        }
    }
}
