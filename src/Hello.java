import java.util.*;
import java.math.*;


public class Hello {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 20) {
            System.out.println(" меньше 20-ти");
        }
        else {
            System.out.println("не меньше чем 20-ть");
        }
    }

}
