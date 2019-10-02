import java.util.Scanner;

public class Upper {
        public static void main(String args[]){
            System.out.println("Enter a world or phase:");
            Scanner sc = new Scanner(System.in);
            String phrase = sc.nextLine();
            String result = phrase.toUpperCase();
            System.out.println("Result: " + result);
        }
    }

