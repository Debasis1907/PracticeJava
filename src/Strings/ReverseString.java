package Strings;

public class ReverseString {

    public static void main(String[] args) {

        String str = "This is Java Programming";

        //char ch[] = str.toCharArray();
        //System.out.println(ch[5]);

        for(int i = str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
