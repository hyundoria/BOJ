import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i++) {
            String str = "";
            for (int j=0; j<arr[i]; j++) {
                str += "=";
            }
            System.out.println(str);
        }

    }
}