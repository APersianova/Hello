import java.io.*;
import java.util.Scanner;

public class Binary {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int variable = scan.nextInt();
        boolean isBinary = true;
        while (variable != 0) {
            int temp = variable % 10;
            System.out.println(temp);
            if (temp > 1) {
                isBinary = false;
                break;
            } else {
                variable = variable / 10;
            }
        }
        if (isBinary) {
            System.out.println("Binary");
        } else {
            System.out.println("Not Binary");
        }
    }
}


