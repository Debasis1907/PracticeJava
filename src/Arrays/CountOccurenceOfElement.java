package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfElement {

    public static void main(String[] args) {

        int arr[] = {1,2,8,3,2,2,2,5,1,5};

        //Using Hashmap technique
        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i = 0;i< arr.length;i++){
            //if value present in hashmap , increment its count by 1
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        //Print the map
        for(Map.Entry entry: hm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
