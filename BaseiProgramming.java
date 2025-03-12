public class BaseiProgramming {

    public static void  findMaxElement(int arr[]){
        int max =0;
        for (int i =0; i< arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
    }

    public static  void findSecondMaxElement(int arr[]){
        int max = 0;
        int secondMax =0;
        for (int i =0; i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }

        }
        for (int i =0; i<arr.length; i++) {
            if (secondMax < arr[i] && max > arr[i]){
                secondMax = arr[i];

            }
        }
        System.out.println("maximum value:"+max);
        System.out.println("second maximum value:"+secondMax);
    }
    public static  void feboninceSeries(int n){
        int previous =0; int next=1;
        for (int i =1; i<=n; i++){
            System.out.println(previous);
            int temp = next + previous;
            previous = next;
            next = temp;
        }

    }
    public static  void factorical(int n){
        int factorial = 1;
        for (int i =1; i<=n; i++){
            factorial *= i;
        }
        System.out.println("factorial:" +factorial);
    }

    public static  void reverseNumber(int n){
        int rev =0;

        int rem ;
        while (n>0){
            rem = n%10;
            rev = (rev *10)+rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
