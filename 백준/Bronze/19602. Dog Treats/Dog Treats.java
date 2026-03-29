
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] + arr[1]*2 + arr[2]*3 >= 10) {
            System.out.println("happy");
        }
        else {
            System.out.println("sad");
        }
        


    }
}

