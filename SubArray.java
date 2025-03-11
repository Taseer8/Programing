import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubArray {

    public static  int findSplitPoint(int arr[], int n)
    {

        int leftSum = 0 ;
        for (int i = 0; i < n; i++)
        {
            leftSum += arr[i] ;
            int rightSum = 0 ;

            for (int j = i+1 ; j < n ; j++ )
                rightSum += arr[j] ;

            if (leftSum == rightSum)
                return i+1 ;
        }

        return -1;
    }
    public static void printTwoParts(int arr[], int n) {

        int splitPoint = findSplitPoint(arr, n);

        if (splitPoint == -1 || splitPoint == n) {
            System.out.println("Not Possible");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (splitPoint == i)
                System.out.println();

            System.out.print(arr[i] + " ");

        }
    }
    public static void findSumOfNNaturalNumber(int n){
        int sum = 0;
        for (int i = 0 ; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void findTheIntersectionofElement(int arr1[], int arr2[]){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : arr1){
            set.add(num);
        }
        for (int num : arr2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        int array[] = new int[list.size()];
        for (int i =0; i<array.length;i++){
            array[i] = list.get(i);
            System.out.println(array[i]);
        }
    }
    public static  void findDublicate(int array[]){
        int n = array.length;;
        for (int i =0; i<n;i++){
            boolean isUnique = true;
            for (int j =0; j<=n-1; j++ ){
                if(i!=j && array[i]==array[j]){
                    isUnique = false;
                    break;
                }


            }
            if (isUnique){
                System.out.println(array[i]);
            }
        }
    }
    public static  void findTheIndexValueOfParticularValue(int array[]){
        for (int i =0; i< array.length; i++){
            boolean isUnique =true;
            for (int j=0;j< array.length; j++){
                if(i!=j && array[i]==array[j]){
                    System.out.println("index value is:" +i);
                }
            }
        }
    }
    public static void moveZeroToEnd(int array[]){
        int index =0;
        for (int num : array){
            if(num!= 0){
                array[index++] =num;


            }

        }
        while (index< array.length){
            array[index++] = 0;
        }
    }
}