
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n+1];

        int cnt = 0;

        for(int i = 2; i <=n; i++) {
            arr[i] = i;
        }

        arr[0] = arr[1] = 0;

        int idx = 0;

        loop1 : for(int i = 2; i <=n; i++){

            if(arr[i] == 0)  {
                continue;
            }
            else {
                cnt++;
            }


            if (cnt == k) {
                System.out.println(i);
                break;
            }

            for(int j = 2*i; j <= n; j+=i) {

                if (arr[j] == 0) {
                    continue;
                }

                arr[j] = 0;
                idx = j;
                cnt++;

                if (cnt == k) {
                    System.out.println(j);
                    break loop1;
                }

            }

        }



    }
}
