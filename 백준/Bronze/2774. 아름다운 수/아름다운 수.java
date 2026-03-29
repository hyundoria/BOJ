
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            int[] arr = new int[10];

            String str = sc.next();

            for (int j=0; j<str.length(); j++) {
                arr[Integer.parseInt(str.substring(j,j+1))]++;
            }

            int beauty = 0;

            for (int k : arr) {

                if (k > 0) {
                    beauty++;
                }

            }

            System.out.println(beauty);


        }

    }
}



