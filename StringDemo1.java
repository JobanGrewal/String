import java.util.Arrays;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "Joban";
        s.concat("Grewal");
        System.out.println(s);   // It will print only Joban, not Joban Grewal because strings are immutable
        System.out.println(s.concat(" Grewal"));  // It will print Joban Grewal because we pass concat method in sout
        int a = 2;  // No method could perform on int data type
        Integer aa = 34;  // This is Integer Class and you can perform method on it
        int value = aa.intValue();
        System.out.println(value);

        String ss= "Grewal";
        System.out.println("Length of string is: " + ss.length());
        char c = ss.charAt(2);
        String s1 = String.valueOf(c);
        String obj = String.valueOf(c);
        System.out.println(c);
        char[] chars = ss.toCharArray();
        for(int i=0;i< chars.length;i++){
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        System.out.println(chars);
        boolean contains = ss.contains("al");  // Check if string contains particular character or not
        System.out.println(contains);
        System.out.println(Arrays.toString(chars));  // To convert character array to string
        System.out.println("Replace G in Grewal with g ");
        System.out.println(ss.replace( 'G','g'));  // to replace particular character in string
        System.out.println(ss.indexOf("Index of e in Grewal is: "+ 'e'));   // to find index of particular character in string

    }
}

