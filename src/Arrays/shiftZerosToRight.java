package Arrays;

import java.util.Arrays;

public class shiftZerosToRight {

    public static void main(String[] args) {
         int arr[] = {2,3,5,0,0,0,6,8};
         int[] newArr = new int[arr.length];
         int count = 0;
         for (int num : arr){
             if(num!=0){
                 newArr[count] = num;
                 count++;
             }
         }
        /*for (int i = 0;i< newArr.length;i++){
            System.out.println(newArr[i]);
        }*/
        System.out.println(Arrays.toString(newArr));
    }
}
