import java.io.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String phrase1 = sc.nextLine();
        Palindrome pn = new Palindrome();
        if (pn.isPalindrome(phrase1)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
    public boolean isPalindrome (String paly) {
        int first = paly.length()-1;
        int last = 0;
        while (first>last) {
            if (paly.charAt(first) != paly.charAt(last)){
                return false;
            }
            first--;
            last++;
        }
        return true;
    }
}