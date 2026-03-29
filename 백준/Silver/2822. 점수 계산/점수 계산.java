

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[8];

        int[] idx = new int[5];

        for (int i=0; i<8; i++) {
            score[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i=0; i<5; i++) {

            int max = score[0];
            int idxc = 0;

            for (int j=1; j<8; j++) {

                if (score[j] >= max) {
                    idxc = j;
                    max = score[j];
                }

            }

            idx[i] = idxc+1;
            score[idxc] = -1;
            sum += max;

        }

        Arrays.sort(idx);

        System.out.println(sum);

        for (int i=0; i<5; i++) {
            System.out.print(idx[i] + " ");
        }




    }
}



