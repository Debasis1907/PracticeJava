package Arrays;

public class PrintElementsInOddPosition {

    public static void main(String[] args) {

        int arr[] = {-90,20,-8,9,75,3,26}; // -90,-8,75,26

        for(int i = 0;i< arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
