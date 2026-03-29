
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 1;
        int right = 1;
        int max_l = arr[0];
        int max_r = arr[n-1];


        for (int i=0; i<n-1; i++) {
            if (arr[i] < arr[i+1] && arr[i+1] > max_l) {
                left++;
                max_l = arr[i+1];
            }
        }

        for (int i=n-1; i>0; i--) {
            if (arr[i] < arr[i-1] && arr[i-1] > max_r ) {
                right++;
                max_r = arr[i-1];
            }
        }

        System.out.println(left);
        System.out.println(right);

    }
}



