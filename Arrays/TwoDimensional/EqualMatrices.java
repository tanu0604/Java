package Array.twoDimensional;
import java.util.*;
public class EqualMatrices
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r1,r2,c1,c2;
        System.out.print("Enter the number of rows of the 1st matrix: ");
        r1=scanner.nextInt();
        System.out.print("Enter the number of columns of the 1st matrix: ");
        c1=scanner.nextInt();
        int[][] mat1=enterElements(r1,c1);
        printMatrix(mat1,r1,c1);

        System.out.print("Enter the number of rows of the 2nd matrix: ");
        r2=scanner.nextInt();
        System.out.print("Enter the number of columns of the 2nd matrix: ");
        c2=scanner.nextInt();
        int[][] mat2=enterElements(r2,c2);
        printMatrix(mat2,r2,c2);


        //method to check whether the two matrices are equal or not
        checkMatrixEquality(r1,c1,mat1,r2,c2,mat2);

    }

    public static int[][] enterElements(int rows,int cols)
    {
        Scanner scanner=new Scanner(System.in);
        int[][] matrix=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element: ");
                matrix[i][j]=scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix,int rows,int cols)
    {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void checkMatrixEquality(int row1,int col1,int[][] mat1,int row2,int col2,int[][]mat2)
    {
        if (row1==row2 && col1==col2)
        {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    if (mat1[i][j]!=mat1[i][j]) {
                        System.out.println("The matrices are not equal");
                        return;
                    }
                }
            }
            System.out.println("The matrices are equal");
        }
        else
        {
            System.out.println("The matrices are not equal");
        }
    }
}
