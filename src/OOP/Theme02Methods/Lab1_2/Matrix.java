package OOP.Theme02Methods.Lab1_2;

/**
 * Create a Matrix class that contains the methods of addition and multiplication of matrices (work with two-dimensional arrays);
 */
public class Matrix {

        static int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        static int[][] matrix2 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        static int[][] sum = new int[4][4];

    public static void sumM(){
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + (j == matrix1.length - 1?"\n":"\t"));
            }
        }
    }
}
    

