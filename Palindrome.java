// Check if String is palindrome or not
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        char[] chars = s.toCharArray();
        char [] reverse=new char[s.length()];
        int lastIndex= chars.length - 1;

        for(int i=0;i< chars.length;i++){
            reverse[lastIndex]=chars[i];
            lastIndex--;

        }

        String reverseString = new String(reverse);
        System.out.println(reverseString);
        if(s.equals(reverseString)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }
}
