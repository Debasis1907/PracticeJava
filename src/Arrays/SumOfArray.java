package Arrays;

import java.util.Arrays;

public class SumOfArray {

    public static void main(String[] args) {

        int arr[] = {1,2,8,3,2,2,2,5,1,5};

        //Method 1
        int total = Arrays.stream(arr).sum();
        System.out.println(total);

        //Method 2
        int sum = 0;
        for (int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

        int sumTotal = Arrays.stream(arr).reduce(0,Integer::sum);
        System.out.println(sumTotal);
    }
}
