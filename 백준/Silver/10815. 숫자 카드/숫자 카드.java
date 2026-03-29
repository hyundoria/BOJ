
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tkdrms = new int[n];

        for (int i=0; i<n; i++) {
            tkdrms[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] arr = new int[k];

        for (int i=0; i<k; i++) {
           arr[i] = sc.nextInt();
        }

        Arrays.sort(tkdrms);

        for (int i=0; i<k; i++) {
            System.out.print(cnt(tkdrms, arr[i],0, tkdrms.length-1) + " ") ;
        }

    }

    static int cnt(int[] arr, int key, int low, int high) {

        int mid=0;

        while(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) {
                return 1;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0; // 탐색 실패
    }


}



