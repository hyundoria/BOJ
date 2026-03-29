
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0; i<t; i++) {

            int n = sc.nextInt();
            int k = n;

            int[] arr = new int[n+1];

            for (int j=2; j <= Math.sqrt(n); j++) {
                while (n%j == 0) {
                    arr[j]++;
                    n/=j;
                }
            }

            if (n != 1) {
                arr[n]++;
            }




            for (int j=1; j<=k; j++) {

                if (arr[j] != 0) {
                    System.out.println(j + " " + arr[j]);
                }

            }




        }

    }
}
