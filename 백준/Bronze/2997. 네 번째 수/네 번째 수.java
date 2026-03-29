

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int a = arr[1] - arr[0];
        int b = arr[2] - arr[1];

        if (a == b) {
            System.out.println(arr[2] + b);
        }
        else if (a < b){
            System.out.println(arr[1] + a);
        }
        else {
            System.out.println(arr[0] + b);
        }

    }
}
