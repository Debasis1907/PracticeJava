package Arrays;

public class PrintElementsInEvenPosition {

    public static void main(String[] args) {

        int arr[] = {-90,20,-8,9,75,3,26};

        for(int i = 1;i< arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
