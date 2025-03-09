public class FindMaxElementArray {

    public static void findTheMaxElementInArray(int[][] array) {
        int max = 0;

        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[i].length; ++j) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("maxvalue:" + max);
    }

    public static void findMaxElementFromTheEachRow(int no, int[][] array) {
        int max = 0;
        int i = 0;

        int[] no_of_rows;
        int j;
        for(no_of_rows = new int[no]; i < no; ++i) {
            for(j = 0; j < array[i].length; ++j) {
                if (array[i][j] > max) {
                    max = array[i][i];
                }
            }

            no_of_rows[i] = max;
            max = 0;
        }

        for(j = 0; j < no_of_rows.length; ++j) {
            System.out.println("max element in a each row:" + no_of_rows[j]);
        }

    }

    public static void findTheSumOfEachArray(int no, int[][] array) {
        int sum = 0;

        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[2].length; ++j) {
                sum += array[i][j];
            }

            System.out.println("sum of each row: " + i + " " + sum);
            sum = 0;
        }

    }

    public static void findTheMaxValueInTheColumn(int no, int[][] array) {
        for(int i = 0; i < no; ++i) {
            int max = array[0][i];

            for(int j = 1; j < array.length; ++j) {
                if (array[i][j] > max) {
                    max = array[j][i];
                }
            }

            System.out.println("Max in column " + i + ": " + max);
        }

    }

    public static void findRowWithMaxSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < matrix.length; ++i) {
            int sum = 0;

            for(int j = 0; j < matrix[i].length; ++j) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of row " + i + ": " + sum);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum sum: " + maxSum);
    }

    public static void findTheSumOfSepcifiedRow(int specificRow, int[][] array) {
        int sum = 0;

        for(int i = 0; i < array.length; ++i) {
            if (i == specificRow) {
                for(int j = 0; j < array[i].length; ++j) {
                    sum += array[i][j];
                }

                System.out.println(sum);
            }
        }

    }

    public static void findTheSumOfEachColunm(int[][] array) {
        int row = array.length;
        int column = array[0].length;

        for(int i = 0; i < column; ++i) {
            int sum = 0;

            for(int j = 0; j < row; ++j) {
                sum += array[i][j];
            }

            System.out.println(sum);
        }

    }

    public static void findtheSumOfSpecifiedColumn(int specifiedColunm, int[][] array) {
        int row = array.length;
        int column = array[0].length;
        int sum = 0;

        for(int i = 0; i < column; ++i) {
            if (i == specifiedColunm) {
                for(int j = 0; j < row; ++j) {
                    sum += array[i][j];
                }

                System.out.println(sum);
            }
        }

    }
}
