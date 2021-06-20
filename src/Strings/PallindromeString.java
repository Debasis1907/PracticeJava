package Strings;

import java.util.Scanner;

public class PallindromeString {

    public static void main(String[] args) {

        String str;
        String rev = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        str = scanner.nextLine();
        //char ch[] = str.toCharArray();
        //System.out.println(str.charAt(4));
        for(int i = str.length()-1;i>=0;i--){
            //rev = rev + ch[i];
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("String is pallindrome");
        }
        else{
            System.out.println("String is not pallindrome");
        }

    }
}
