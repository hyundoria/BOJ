
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int newscore = sc.nextInt();

        int p = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
            System.exit(0);
        }

        int[][] arr = new int[n + 1][2];

        for (int i = 0; i <n; i++) {
            arr[i][0] = i;
            arr[i][1] = sc.nextInt();
        }


        arr[n][0] = n;
        arr[n][1] = newscore;


        Arrays.sort(arr, (e1, e2) -> {

            if (e1[1] == e2[1]) {
                return e1[0] - e2[0];
            }
            else {
                return e2[1] - e1[1];
            }

        });




        int cnt = 1;

        for (int i = 0; i <= n; i++) {
            if (arr[i][0] == n) {
                cnt = i;
            }
        }

        int[] count = new int[n+1];

        int rank = 1;
        int ct = 0;

        boolean ck = false;


        for (int i = 0; i <= n - 1; i++) {

            if (!ck) {
                ct = 0;
            }

            if (ck) {
                ct++;
            }


            if (arr[i][1] == arr[i + 1][1]) {
                ck = true;
                count[i] = rank;
                count[i + 1] = rank;
                rank--;
            }

            else {
                count[i] = rank;

                if (ck) {
                    count[i + 1] = rank + ct + 1;
                    rank = rank + ct;
                    ck = false;
                }
                else {
                    count[i + 1] = rank + 1;
                }

            }

            if (arr[i][0] == n) {
                break;
            }

            rank++;

        }
   if (cnt >= p) {
            System.out.println(-1);
        }
        else {
            System.out.println(count[cnt]);
        }




    }
}
