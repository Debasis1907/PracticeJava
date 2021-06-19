package Arrays;

public class FindMaxValueInArray {

    public static void main(String[] args) {

        int arr[] = {-90,20,-8,9,75,3,26};

        int max = arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
