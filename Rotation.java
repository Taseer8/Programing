import java.util.Arrays;

public class Rotation {

    public static void rotateMatrix90Degree(int[][] matrix) {
        int[][] var1 = matrix;
        int j = matrix.length;

        int temp;
        int[] row;
        for(temp = 0; temp < j; ++temp) {
            row = var1[temp];
            System.out.println(Arrays.toString(row));
        }

        System.out.println(" -----------------------");

        int i;
        for(i = 0; i < matrix.length; ++i) {
            for(j = i; j < matrix.length; ++j) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(i = 0; i < matrix.length; ++i) {
            for(j = 0; j < matrix.length / 2; ++j) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        System.out.println(" 90 degree rotaion");
        var1 = matrix;
        j = matrix.length;

        for(temp = 0; temp < j; ++temp) {
            row = var1[temp];
            System.out.println(Arrays.toString(row));
        }

    }

    public static void rotateArray180Degree(int[][] array) {
        int[][] var1 = array;
        int i = array.length;

        int m;
        for(m = 0; m < i; ++m) {
            int[] array1 = var1[m];
            System.out.println(Arrays.toString(array1));
        }

        System.out.println("------------------");
        int n = array.length;

        int j;
        for(i = 0; i < n; ++i) {
            m = array[i].length;

            for(j = 0; j < m; ++j) {
                if (i < n / 2 || i == n / 2 && j < m / 2) {
                    int temp = array[i][j];
                    array[i][j] = array[n - 1 - i][m - 1 - j];
                    array[n - 1 - i][m - 1 - j] = temp;
                }
            }
        }

        int[][] var7 = array;
        m = array.length;

        for(j = 0; j < m; ++j) {
            int[] rotate180 = var7[j];
            System.out.println(Arrays.toString(rotate180));
        }

    }
}
