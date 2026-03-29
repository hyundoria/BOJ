

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            int[] arr = new int[7];

            int sum = 0;
            int min = 0;

            for (int j=0; j<7; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] % 2 ==0) {
                    sum+=arr[j];
                    min = arr[j];
                }
            }



            for (int j=0; j<7; j++) {
                if (arr[j] % 2 ==0) {
                    if (arr[j] <= min) {
                        min = arr[j];
                    }
                }
            }

            System.out.println(sum + " " + min);


        }



    }
}