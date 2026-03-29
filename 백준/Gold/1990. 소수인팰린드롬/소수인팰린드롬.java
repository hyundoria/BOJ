import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m > 100_000_000) {
            m = 10_000_000;
        }

        boolean[] arr = new boolean[m+1];
        arr[0] = arr[1] = true;

        ArrayList<Integer> list =  new ArrayList<>();

        for (int i = 2; i*i <= m; i++) {

            if(!arr[i]) {
                for (int j = i*i; j <= m ; j+=i) {
                    arr[j] = true;
                }
            }

        }





        for (int i = n; i < arr.length; i++) {
            if(!arr[i]) {

                String str = String.valueOf(i);
                StringBuilder sb = new StringBuilder();

                for (int j = str.length()-1; j >= 0 ; j--) {

                    sb.append(str.charAt(j));

                }

                if(str.equals(sb.toString())) {
                    System.out.println(str);
                }

            }
        }

        System.out.println(-1);



    }
}
