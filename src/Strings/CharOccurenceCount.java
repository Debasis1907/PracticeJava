package Strings;

public class CharOccurenceCount {
    public static void main(String[] args) {
        String str = "Testing soluTions";
        System.out.println(countOccurences(str,'s'));
        System.out.println(getCharCount(str,'T'));
    }

    private static long getCharCount(String str, char t) {
      return str.chars().filter(e -> (char)e == t).count();
    }

    private static int countOccurences(String str, char s) {
        int count =0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == s){
                count++;
            }
        }
        return count;
    }
}
