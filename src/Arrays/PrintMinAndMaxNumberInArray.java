package Arrays;

public class PrintMinAndMaxNumberInArray {
    public static void main(String[] args) {
        /*
        2 4 5
        3 4 7
        1 2 9
        */

        int arr[][] = {{2,4,5},{3,4,7},{1,-3,9}};
        int min = arr[0][0];
        int max = arr[0][0];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
                else{
                    max = arr[i][j];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
