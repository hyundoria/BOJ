

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String stt = sc.next();

        int[] arr = new int[10];

        for (int i=0; i<stt.length(); i++) {

            int k = Integer.parseInt(stt.substring(i,i+1));

            arr[k]++;

        }

        int i69 = arr[6] + arr[9];

        if (i69 % 2 == 0) {
            i69 = i69/2;
        }else {
            i69 = i69/2 +1;
        }

        arr[6] = 0;
        arr[9] = 0;

        int max=arr[0];

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        if (stt.length() == 1) {
            System.out.println("1");
        }
        else {
            System.out.println(Math.max(i69, max));
        }





    }
}