import java.util.Scanner;
public class Main {

    // time complexity : O(n)
    // space complexity : O(n)
    static String reverseString(String s){
        char []chars = s.toCharArray();
        int begin = 0 , end = s.length()-1;

        while(begin < end){
            char temp = chars[begin];
            chars[begin]= chars[end];
            chars[end] = temp;

            begin++;
            end--;
        }
        return new String(chars);
    }

    // time complexity : O(n)
    // space complexity : O(n)
    static String reverseStringBuilder(String s){
       StringBuilder sb = new StringBuilder();
       for(int i=s.length()-1; i>=0; i--){
           sb.append(s.charAt(i));
       }
       return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        // use String class
        System.out.println(reverseString(str));

        // use StringBuilder class
        System.out.println(reverseStringBuilder(str));
    }
}