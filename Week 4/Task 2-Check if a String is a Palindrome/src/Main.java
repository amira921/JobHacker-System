import java.util.Scanner;

public class Main {
    static void checkPalindrome(String str){
        str = str.toLowerCase();
        int begin = 0 , end = str.length()-1;
        while(begin < end){
            if(str.charAt(begin) != str.charAt(end)){
                  System.out.println("Not Palindrome");
                  return;
            }
            begin++; end--;
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        checkPalindrome(str);
    }
}