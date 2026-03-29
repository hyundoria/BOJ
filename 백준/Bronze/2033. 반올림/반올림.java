

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int[] arr = new int[n.length()];

        for (int i=0; i<n.length(); i++) {
            arr[i] = Integer.parseInt(n.substring(i,i+1));
        }

        for (int i=arr.length-1; i>0; i--) {

            if (arr[i] >= 5) {
                arr[i] = 0;
                arr[i-1] += 1;
            }
            else {
                arr[i] = 0;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);

    }
}



