

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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (Objects.equals(arr[i], arr[j])) {
                    arr[j] = "0";
                    i--;
                }
            }
        }


        Arrays.sort(arr, (e1, e2)  -> {

            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            }
            else {
                return e1.length() - e2.length();
            }
        });

        for (int i=0; i<n; i++) {
            if (arr[i].equals("0")) {
                continue;
            }
            System.out.println(arr[i]);

        }

    }
}



