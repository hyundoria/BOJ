

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());

            String[] lawarr = br.readLine().split(" ");

            int[] arr = new int[lawarr.length];

            for (int j = 0; j < lawarr.length; j++) {

                arr[j] = Integer.parseInt(lawarr[j]);

            }

            long max = arr[arr.length-1];

            long money = 0;
            int cnt = 0;


            for (int j = arr.length-1; j >= 0; j--) {

                if (arr[j] > max) {
                    max = arr[j];
                }
                else {
                    money += max - arr[j];
                }

            }

            sb.append(money).append("\n");

        }


        System.out.println(sb.toString().trim());


    }
}
