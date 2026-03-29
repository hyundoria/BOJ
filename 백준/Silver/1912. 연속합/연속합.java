import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int sum = max;

        for (int i = 1; i < n; i++) {

            sum = Math.max(arr[i] + sum, arr[i]);
            max = Math.max(sum, max);

        }

        System.out.println(max);


    }
}
