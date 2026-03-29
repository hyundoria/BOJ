import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int cnt = 0;

        ArrayList<Integer> arr = new ArrayList<>();


        for (int i = 1; i <= t; i++) {

            if (t % i == 0) {
                arr.add(i);
            }

        }

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a > t) {
                cnt += Math.abs(t-a);
            }
            else {
              cnt += Math.abs(find(arr,a) - a);
            }



        }

        System.out.println(cnt);






    }

    static int find(ArrayList<Integer> arr, int n) {

        int result = 0;
        int middle = 0;
        int low = 0, high = arr.size() - 1;
        int lowD = 0, highD = 0;

        boolean find = false;

        while (low <= high) {

            middle = (low + high) / 2;
            if (arr.get(middle) < n) {
                low = middle + 1;
            }
            else if (arr.get(middle) > n) {
                high = middle - 1;
            }
            else {
                result = arr.get(middle);
                find = true;
                break;
            }

        }

        if(!find) {
            lowD = Math.abs(n - arr.get(low));
            highD = Math.abs(arr.get(high) - n);

            result = lowD < highD ? arr.get(low) : arr.get(high);

        }

        return result;


    }

}




