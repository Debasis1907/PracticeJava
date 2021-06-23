package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterDuplicateValuesInList {

    public static void main(String[] args) {

        List<String> values = new ArrayList<>();
        values.add("Java");
        values.add("Python");
        values.add("C#");
        values.add("Java");
        values.add("Python");

        Set<String>removeDuplicates = new HashSet<>();
        System.out.println(removeDuplicates.addAll(values));

        for(String s : removeDuplicates){
            System.out.println(s);
        }
    }
}
