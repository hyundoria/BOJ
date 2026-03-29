
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = Integer.parseInt(sc.next());

        for (int i=0; i<n; i++) {

            String str = sc.next();

            int[] arr = new int[26];

            int sum = 0;

            for (int j=0; j<str.length(); j++) {

                arr[Integer.parseInt(String.valueOf(str.charAt(j)-65))]++;


            }

            for (int j=0; j<arr.length; j++) {

                if (arr[j] == 0) {

                    sum += j+65;
                }

            }


            System.out.println(sum);

        }




    }
}



