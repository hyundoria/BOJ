

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] distance = new long[n - 1];
        long[] value = new long[n];




        for (int i=0; i<n-1; i++) {
            distance[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            value[i] = sc.nextInt();
        }

        long sum = value[0] * distance[0];
        int cnt = 1;


        for (int i=0; i<n-1; i++) {

            if (i+cnt == n-1) {
                break;
            }


            if (value[i] <= value[i+cnt])  {
                sum += value[i] * distance[i+cnt];
                i--;
                cnt++;

            }
            else {
                sum += value[i+cnt] * distance[i+cnt];
                i = i+cnt-1;
                cnt = 1;
            }


        }

        System.out.println(sum);



    }
}



