
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] arr = new int[10];

        for (int i=0; i<str.length(); i++) {
            arr[Integer.parseInt(str.substring(i,i+1))]++;
        }

        long sum =0;

        for (int i=0; i<arr.length; i++) {

            sum += (long) arr[i] * i;
        }

        StringBuilder sb = new StringBuilder();

        if (arr[0] > 0 && sum%3 == 0) {
            for(int i = 9; i >= 0; i--) {
                while(arr[i] > 0) {
                    sb.append(i);
                    arr[i]--;

                }

            }
            System.out.println(sb);


        }
        else {
            System.out.println("-1");
        }

    }
}



