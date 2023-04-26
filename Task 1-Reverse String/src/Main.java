import java.util.Scanner;
public class Main {

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
    }
}