
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        int min = 100;
        int idx = 0;
        int sum =0;

        for (int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] <= min) {
                min = arr[i];
                idx = i;
            }
        }

        if (sum >= 100) {
            System.out.println("OK");
        }
        else {
            if (idx == 0) {
                System.out.println("Soongsil");
            } else if (idx == 1) {
                System.out.println("Korea");
            }
            else {
                System.out.println("Hanyang");
            }
        }




    }
}

