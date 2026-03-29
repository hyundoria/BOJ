
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            long n = (long) ((a*b)/c);
            long k = (long) ((a/b)*c);

            System.out.println(Math.max(n, k));




        }
    }
}