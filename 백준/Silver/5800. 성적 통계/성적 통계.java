
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int k = sc.nextInt();

            int[] arr = new int[k];

            for (int j=0; j<k; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            int gap = arr[0] - arr[1];

            for (int j=k-1; j>0; j--) {
                if (arr[j] - arr[j-1] > gap) {
                    gap = arr[j] - arr[j-1];
                }

            }


            System.out.println("Class " + i);
            System.out.println("Max " + arr[k-1] + ", Min " + arr[0] + ", Largest gap "+ gap);



        }

    }

}