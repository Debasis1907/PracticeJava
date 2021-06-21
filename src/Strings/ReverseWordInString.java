package Strings;

public class ReverseWordInString {

    public static void main(String[] args) {

        String str = "I Love Programming";
        String newStr[] = str.split(" ");
        String revStr ="";

        for(int i = newStr.length-1;i>=0;i--){
            revStr = revStr + newStr[i] + " ";
        }
        System.out.println(revStr);

    }
}
