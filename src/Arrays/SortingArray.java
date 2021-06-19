package Arrays;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int arr[] = {-90,20,-8,9,75,3,26};

        //Method 1 - traditional approach
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

        //Method 2
        Arrays.sort(arr);
        for(int num : arr){
            System.out.println(num);
        }

    }
}
