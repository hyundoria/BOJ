

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        int num = 1;
        int sum = 0;

        for (int i=0; i<n; i++) {
            sum += num;
            arr[i] = num++;
        }

        int nu = 1;
        int cnt = 0;

        StringBuilder str = new StringBuilder("<");


        while (true) {

            if (sum == 0) {
                break;
            }

            if (cnt >= n) {
                cnt = 0;
            }

            if (arr[cnt] != 0) {
                nu++;
            }
            else {
                cnt++;
                continue;
            }

            if (nu == k+1) {
                str.append(arr[cnt]).append(", ");
                sum -= arr[cnt];
                arr[cnt] = 0;
                nu = 1;
                cnt++;
                continue;
            }

            cnt++;


        }
        str.delete(str.length()-2, str.length());
        str.append(">");
        System.out.println(str);

    }
}



