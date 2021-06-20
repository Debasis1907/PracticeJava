package Arrays;

import java.util.HashMap;
import java.util.Map;

public class PrintElementsInReverseOrder {

    public static void main(String[] args) {

        int arr[] = {1,5,7,10,65};

        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
