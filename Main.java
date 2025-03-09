public class Main {

    public static void main(String[] args) {
        int[][] array = {{3, 15, 5}, {4, 5, 6}, {5, 7, 9}};
        int[][] array1 = {{1, 2, 3}, {4, 6, 5}, {5, 6, 8}};
        FindMaxElementArray.findTheMaxElementInArray(array);
        FindMaxElementArray.findTheSumOfEachColunm(array);
        FindMaxElementArray.findTheSumOfEachArray(2,array1);
        FindMaxElementArray.findTheMaxValueInTheColumn(1,array);
        FindMaxElementArray.findRowWithMaxSum(array1);
        FindMaxElementArray.findTheSumOfSepcifiedRow(0,array);
        FindMaxElementArray.findMaxElementFromTheEachRow(1,array1);
        FindMaxElementArray.findtheSumOfSpecifiedColumn(2,array);

        Rotation.rotateArray180Degree(array);
        Rotation.rotateMatrix90Degree(array1);

        ArthamticOperationsWithArrays.substract2matrix(array1,array);
        ArthamticOperationsWithArrays.add2Matrix(array,array1);
        ArthamticOperationsWithArrays.mulitplyThe2Matrix(array,array1);



    }

}
