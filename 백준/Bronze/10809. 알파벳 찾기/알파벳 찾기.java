import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {


            String st = sc.next();

            int[] arr = new int[26];

            Arrays.fill(arr, -1);

            for (int i=0; i<st.length(); i++) {


                int num = st.charAt(i);

                int order = num-'a';

                if (arr[order] != -1 ) {
                    continue;
                }

                arr[order] = i;
            }


            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }



        }
    }
}