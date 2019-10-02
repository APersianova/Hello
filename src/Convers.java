import java.io.*;
import java.util.Scanner;
public class Convers {

    public static String ones[] = {"one", "two", "three", "four", "five", "six", " seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};
    public static String tens[] = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number ");
            if (!sc.hasNextInt())
                break;
            int number = sc.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("Try again..");
                continue;
            }
            if (number < 20)
                System.out.println(ones[number - 1]);
            else if (number < 50) {
                int high = number / 10;
                int low = number % 10;
                String text = tens[high - 2];
                if (low != 0)
                    text = text + " " + ones[low - 1];
                System.out.println("Entered number is:" + text);
            } else
                System.out.println(tens[0]);
            break;
        }
    }
}



