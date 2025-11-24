
import java.util.*;

public class greatest {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        if (a > b && a > c) {
            System.out.println( a +" is greater");
        } else if (b > a && b > c) {
            System.out.println( b +" is greater");
        } else {
            System.out.println(c +" is greater");
        }
    }
}
