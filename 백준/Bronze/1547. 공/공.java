
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[4];

        for (int i=0; i<=3; i++) {
            arr[i] = i;
        }

        for (int i=0; i<n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp = 0;
            int idxa = 0;
            int idxb = 0;

            for (int j=1; j<=3; j++) {

                if (arr[j] == a) {
                    idxa = j;
                }
                else if (arr[j] == b) {
                    idxb = j;
                }

            }


            if (a != b) {

                tmp = arr[idxa];
                arr[idxa] = arr[idxb];
                arr[idxb] = tmp;

            }

        }


        System.out.println(arr[1]);

    }
}
