

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int k = sc.nextInt();

        int[][] arr = new int[n][4];

        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {

            if (e1[1] == e2[1]) {
                if (e1[2] == e2[2]) {
                    if (e1[3] == e2[3]) {
                        return e1[0] - e2[0];
                    }else {
                        return e2[3] - e1[3];
                    }
                }
                else {
                    return e2[2] - e1[2];
                }
            }
            else {
                return e2[1] - e1[1];
            }

        });

        int cnt = 1;

        for (int i=0; i<n; i++) {
            if (arr[i][0] == k) {
                cnt = i;
            }
        }

        int[] count = new int[n];

        int rank = 1;
        int ct = 0;

        boolean ck = false;

        for (int i=0; i<n-1; i++) {

            if (!ck) {
                ct = 0;
            }

            if (ck) {
                ct++;
            }

           
            if (arr[i][1] == arr[i+1][1] && arr[i][2] == arr[i+1][2] && arr[i][3] == arr[i+1][3] ) {
                ck = true;
                count[i] = rank;
                count[i+1] = rank;
                rank--;
            }
            else {
                count[i] = rank;

                if (ck) {
                    count[i+1] = rank+ct+1;
                    rank = rank + ct;
                    ck = false;
                }
                else {
                    count[i+1] = rank+1;
                }
            }

            if (arr[i][0] == k) {
                break;
            }

            rank++;



        }
        

        System.out.println(count[cnt]);

    }
}



