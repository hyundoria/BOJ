

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = Integer.parseInt(sc.next());

            String[] arr = new String[n];

            for (int i=0; i<n; i++) {
                arr[i] = sc.next();
            }

            String[] len = new String[arr[0].length()];

            for (int i=0; i < n-1; i++) {
                for (int r = i; r < n; r++) {
                    for (int j = 0; j < arr[0].length(); j++) {

                        if (Objects.equals(len[j], "?")) {
                            continue;
                        }
                        else {
                            if (arr[i].charAt(j) == arr[i + 1].charAt(j)) {
                                len[j] = String.valueOf(arr[i].charAt(j));
                            } else {
                                len[j] = "?";
                            }
                        }

                    }
                }
            }

            if (n==1) {
                System.out.println(arr[0]);
            }
            else {
                for (int i = 0; i < arr[0].length(); i++) {
                    System.out.print(len[i]);
                }
            }

        }
    }
}