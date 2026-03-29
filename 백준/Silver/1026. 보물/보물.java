

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arra = new int[n];
        int[] arrb = new int[n];

        for (int i=0; i<n; i++) {
            arra[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            arrb[i] = sc.nextInt();
        }



        Arrays.sort(arra);
        int sum = 0;



        for (int i=0; i<n; i++) {
            int max = 0;
        }


        for (int i=0; i<n; i++) {
            int max = 0;
            int idx = 0;
            for (int j=0; j<n; j++) {
                if (arrb[j] > max) {
                    max = arrb[j];
                    idx = j;
                }
            }
            sum += arra[i] * max;
            arrb[idx] = 0;
        }

        System.out.println(sum);


    }
}



