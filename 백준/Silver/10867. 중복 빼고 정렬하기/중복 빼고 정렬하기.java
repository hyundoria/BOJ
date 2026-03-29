
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[1001];
        int[] arr1 = new int[1001];

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {

            int a = sc.nextInt();


            if (a < 0) {
                arr1[-a]++;
            }
            else if (a == 0){
                arr[a]++;
            }
            else {
                arr[a]++;
            }
        }

        for (int i=1000; i>0; i--) {

            if (arr1[i] != 0) {
                sb.append(-i).append(" ");
            }
        }

        for (int i=0; i<1001; i++) {

            if (arr[i] != 0) {
                sb.append(i).append(" ");
            }

        }

        String str = String.valueOf(sb).trim();
        System.out.println(str);





    }
}



