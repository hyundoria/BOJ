

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[][] arr = new String[n*m][2];
        int[] cnt = new int[11];

        int cntt = 0;

        while (true){
            String a = sc.next();
            String str = sc.next();

            if (a.equals("0")) {
                break;
            }

            if (cnt[Integer.parseInt(a)] < m) {
                cnt[Integer.parseInt(a)]++;
            }
            else {

                continue;
            }

            if (Integer.parseInt(a) == 0) {
                break;
            }

            arr[cntt][0] = a;
            arr[cntt++][1] = str;
        }

        for (int i=0; i<n*m; i++) {
            if (arr[i][0] == null) {
                arr[i][0] = "0";
                arr[i][1] = "0";
            }
        }


        Arrays.sort(arr, (e1, e2) -> {

            if (Objects.equals(e1[0], e2[0])) {
                if (e1[1].length() == e2[1].length()) {
                    return e1[1].compareTo(e2[1]);
                }
                else {
                    return e1[1].length() - e2[1].length();
                }
            }
            else {
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
            }

        });


        for (String[] strings : arr) {
            if (Integer.parseInt(strings[0]) % 2 != 0) {
                System.out.println(strings[0] + " " + strings[1]);
            }
        }


        for (String[] strings : arr) {
            if (!Objects.equals(strings[1], "0") && Integer.parseInt(strings[0]) % 2 == 0) {
                System.out.println(strings[0] + " " + strings[1]);
            }
        }





    }
}



