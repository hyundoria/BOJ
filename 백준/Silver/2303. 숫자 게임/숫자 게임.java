
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] score = new int[n+1];

        for (int i=0; i<n; i++) {

            int[] arr = new int[5];

            for (int j=0; j<5; j++) {
                arr[j] = sc.nextInt();
            }

            int max = 0;

            for (int j=0; j<5; j++) {
                for (int r=j+1; r<5; r++) {
                    for (int k=r+1; k<5; k++) {

                        int x = (arr[j] + arr[r] + arr[k]) % 10;

                        if (x >= max) {
                            max = x;
                        }


                    }
                }
            }

            score[i+1] = max;

        }

        int idx = 1;
        int max = score[1];



        for (int i=2; i<=n; i++) {

            if (score[i] >= max) {
                max = score[i];
                idx = i;
            }

        }

        System.out.println(idx);


    }
}
