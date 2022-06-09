import java.util.Scanner;

/**
 * @author Matthew 08.06.2022
 **/
public class Pow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double x = 0;

        if (c < 0) {
            System.out.println("NO SOLUTION");
        } else if (a == 0 && b == (c*c)) {
            System.out.println("MANY SOLUTIONS");
        } else {
            x = (((Math.pow(c,2)) - b) / a);
            if (x == (int) x){
                System.out.println((int)x);
            } else System.out.println("NO SOLUTION");
        }
    }
}