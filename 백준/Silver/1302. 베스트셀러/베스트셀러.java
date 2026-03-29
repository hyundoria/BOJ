

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = Integer.parseInt(sc.next());

        String[] arr = new String[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        String max = "";
        int maxvalue = 0;
        int cnt = 1;

        if (n==1) {
            System.out.println(arr[0]);
            System.exit(0);
        }

        for (int i=0; i<n-1; i++) {

            if (Objects.equals(arr[i], arr[i + 1])) {
                cnt++;
            }else {
                cnt = 1;
            }

            if (cnt > maxvalue) {
                max = arr[i];
                maxvalue = cnt;
            }

        }

        System.out.println(max);




    }
}
