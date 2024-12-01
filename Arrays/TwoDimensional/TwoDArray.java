package Arrays.TwoDimensional;

public class TwoDArray
{
    public static void main(String[] args) {
//        int[] arr=new int[4];

        //int [][] matrix=new int[3][3]; //3 rows and 3 columns
      int[][] matrix={
              {1,2,3},
              {4,5,6},
              {7,8,9}
      };

      //For traversing two-dimensional array we have to run 2 loops to traverse the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
