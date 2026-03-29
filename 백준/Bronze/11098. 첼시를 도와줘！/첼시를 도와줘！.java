

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            int  t = Integer.parseInt(sc.next());

            int[] arr1 = new int[t];
            String[] arr2 = new String[t];


            for (int j=0; j<t; j++) {
                arr1[j] = Integer.parseInt(sc.next());
                arr2[j] = sc.next();
            }

            int max = arr1[0];
            int maxindex = 0;

            for (int j=1; j<t; j++) {
                if (arr1[j] > max) {
                    max = arr1[j];
                    maxindex = j;
                }
            }

            System.out.println(arr2[maxindex]);

        }





    }
}