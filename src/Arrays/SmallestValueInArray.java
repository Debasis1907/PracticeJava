package Arrays;

public class SmallestValueInArray {

    public static void main(String[] args) {

        int arr[] = {90,20,-8,9,75,3,26};

        int min = arr[0];
        for(int i = 0;i< arr.length;i++){
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
