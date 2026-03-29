

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        boolean[] arr = new boolean[1000001];
        arr[0] = arr[1] = true;

        for (int i = 2; i*i <= arr.length; i++) {

            if(!arr[i]) {
                for (int j = i*i; j < arr.length; j+=i) {
                    arr[j] = true;
                }
            }

        }


        while (true) {


            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            boolean ck = false;

            for (int i = 2; i < arr.length/2; i++) {

                if (!arr[i]) {

                    int k = n - i;

                    if (!arr[k]) {
                        System.out.println(n + " = " + i + " + " + k);
                        ck = true;
                        break;
                    }
                }
            }

            if (!ck) {
                System.out.println("Goldbach's conjecture is wrong.");
            }





        }
    }





}
