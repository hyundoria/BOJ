
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n != 1) {
            for (int i = 0; i < n; i++) {

                System.out.print("*");

            }
            System.out.println();
        }

        for (int i=1; i<=n-2; i++) {
            for (int j=0; j<=n-1; j++) {

                if (i == j || i+j +1 == n || j==0 || j==n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for (int i=0; i<n; i++){
            System.out.print("*");
        }


    }
}



