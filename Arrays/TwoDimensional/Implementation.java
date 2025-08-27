package Array.twoDimensional;

import java.util.*;
public class Implementation
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter number of rows: ");
        rows=scanner.nextInt();
        System.out.print("Enter number of columns:" );
        cols=scanner.nextInt();
        int[][] matrix=new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element: ");
                matrix[i][j]=scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
