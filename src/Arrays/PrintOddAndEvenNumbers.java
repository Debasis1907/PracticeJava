package Arrays;

public class PrintOddAndEvenNumbers {

    public static void main(String[] args) {

        int arr[] = {-91,20,-8,9,75,3,26};

        System.out.println("Print Even Numbers");
        for(int i = 0;i< arr.length;i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }

        System.out.println("Print Odd Numbers");
        for(int i = 0;i< arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
