
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ex = new int[5];

        for (int i=0; i<ex.length; i++) {
            ex[i] = i+1;
        }

        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        loop1 : while (true) {

            boolean ck = false;

            for (int i=0; i<arr.length-1; i++) {

                int tmp = 0;

                if (arr[i] > arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;

                    for (int j=0; j<arr.length; j++) {

                        System.out.print(arr[j] + " ");

                    }
                    System.out.println();

                }


            }

            for (int i=0; i<arr.length; i++) {

                if (arr[i] == ex[i]) {
                    ck = true;
                }
                else {
                    ck = false;
                }

                if (!ck) {
                    continue loop1;
                }

            }

            if (ck) {
                break;
            }


        }

    }
}