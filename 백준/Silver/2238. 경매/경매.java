

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u = sc.nextInt();
        int n = sc.nextInt();

        sc.nextLine();

        String[][] arr = new String[n][2];


        for (int i=0; i<n; i++) {

            arr[i][0] = sc.next();
            arr[i][1] = sc.next();


        }

        int[] cnt = new int[u+1];

        for (int i=0; i<n; i++) {

            cnt[Integer.parseInt(arr[i][1])]++;

        }

        int min = 10001;
        int idx = 0;

        for (int i=1; i<=u; i++) {

            if (cnt[i] == 0) {
                continue;
            }

            if (cnt[i] < min) {
                min = cnt[i];
                idx = i;
            }

        }


        for (int i=0; i<n; i++) {

            if (Integer.parseInt(arr[i][1]) == idx) {
                System.out.println(arr[i][0] + " " + arr[i][1]);
                break;
            }

        }








    }
}
