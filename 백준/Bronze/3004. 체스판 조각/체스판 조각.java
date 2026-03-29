

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int arr[] = new int[n+1];

        int a = 1;
        int b = 1;

        for (int i=0; i<=n; i++) {

            arr[i] = a*b;

            if (i % 2 == 0) {
                b++;
            }
            else {
                a++;
            }

        }

        System.out.println(arr[n]);

    }
}



