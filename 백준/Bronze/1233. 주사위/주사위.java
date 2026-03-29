
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[a+b+c+1];

        for (int i=1; i<=a; i++) {
            for (int j=1; j<=b; j++) {
                for (int r=1; r<=c; r++) {

                 arr[i+j+r]++;

                }
            }
        }


        int max = arr[0];
        int idx = 0;

        for (int i=1; i<a+b+c; i++) {

            if (arr[i] > arr[i-1]) {
                max = arr[i];
                idx = i;

            }

        }


        System.out.println(idx);


    }
}
