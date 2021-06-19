package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray {

    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("Amazon");
        arr.add("Azure");
        arr.add("GCP");
        arr.add("IBM");
        arr.add("Azure");
        arr.add("IBM");
        arr.add("Netezza");

        //1. using brute force technique
        for(int i = 0;i<arr.size();i++){
            for (int j =i+1 ;j< arr.size();j++){
                if(arr.get(i) == arr.get(j)){
                    System.out.println(arr.get(i));
                }
            }
        }

        //2. using hashset

        System.out.println("Using Hashset Technique");
        Set<String>data = new HashSet<>();
        for(String s : arr){
            System.out.println(data.add(s));
            if(data.add(s) != true){
                System.out.println(s);
            }
        }
    }
}
