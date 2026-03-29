

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) * 2;

        String[] lawarr = br.readLine().split(" ");

        int[] arr = new int[lawarr.length];

        for (int i = 0; i < lawarr.length; i++) {

            arr[i] = Integer.parseInt(lawarr[i]);

        }

        Arrays.sort(arr);

        int min = arr[0] + arr[arr.length-1];

        for (int i = 1; i < arr.length/2; i++) {
            
            int k = arr[i] + arr[arr.length - i-1];

            if (k < min) {
                min = k;
            }

        }


        System.out.println(min);



        }
    }
