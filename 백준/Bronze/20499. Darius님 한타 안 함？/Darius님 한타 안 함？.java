

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] arr = str.split("/");

        int[] arr1 = new int[3];

        for (int i=0; i<3; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }

        if (arr1[0] + arr1[2] < arr1[1] || arr1[1] == 0) {
            System.out.println("hasu");
        }
        else {
            System.out.println("gosu");
        }
    }
}

