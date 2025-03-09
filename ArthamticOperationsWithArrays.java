public class ArthamticOperationsWithArrays {
    public static void mulitplyThe2Matrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("multiplation of 2 matrix");
        int rowM1 = matrix1.length;
        int columnM1 = matrix1[0].length;
        int rowM2 = matrix1.length;
        int columnM2 = matrix2[0].length;
        int[][] matrix3 = new int[rowM1][columnM2];
        if (rowM1 != columnM2) {
            System.out.println("matrix multiplaction is not possible");
        }

        int m;
        int n;
        for(m = 0; m < rowM1; ++m) {
            for(n = 0; n < columnM2; ++n) {
                for(int k = 0; k < columnM1; ++k) {
                    matrix3[m][n] = matrix1[m][k] * matrix2[k][n];
                }
            }
        }

        for(m = 0; m < matrix3.length; ++m) {
            for(n = 0; n < matrix3.length; ++n) {
                System.out.print(matrix3[m][n] + ",");
            }

            System.out.println();
        }

    }

    public static void add2Matrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("addition of two matrix");
        int rowM1 = matrix1.length;
        int colunmM1 = matrix1[0].length;
        int rowM2 = matrix2.length;
        int colunmM2 = matrix2[0].length;
        int[][] matrix3 = new int[rowM1][colunmM2];

        int i;
        int j;
        for(i = 0; i < rowM1; ++i) {
            for(j = 0; j < colunmM2; ++j) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(i = 0; i < matrix3.length; ++i) {
            for(j = 0; j < matrix3[i].length; ++j) {
                System.out.print(matrix3[i][j] + ",");
            }

            System.out.println();
        }

    }

    public static void substract2matrix(int[][] matrix1, int[][] matrix) {
        int rowM1 = matrix1.length;
        int colunmM2 = matrix[0].length;
        int[][] matrix3 = new int[rowM1][colunmM2];

        int i;
        int j;
        for(i = 0; i < rowM1; ++i) {
            for(j = 0; j < colunmM2; ++j) {
                matrix3[i][j] = matrix1[i][j] - matrix[i][j];
            }
        }

        for(i = 0; i < matrix3.length; ++i) {
            for(j = 0; j < matrix3[i].length; ++j) {
                System.out.print(" " + matrix3[i][j]);
            }

            System.out.println();
        }

    }
}
