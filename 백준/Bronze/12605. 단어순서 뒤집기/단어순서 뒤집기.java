

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n; i++) {

            String[] arr = sc.nextLine().split(" ");


            StringBuilder sb = new StringBuilder("Case #" + (i + 1) + ":");

            for (int j=arr.length-1; j>=0; j--) {
                sb.append(" " + arr[j]);
            }

            System.out.println(sb);

        }




    }
}