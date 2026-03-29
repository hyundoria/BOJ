

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String[] str = br.readLine().split(" ");

        int[] arr = new int[str.length];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(str[i]);

        }


        for (int i = 1; i < arr.length; i++) {

            int k = Euclidean(arr[0], arr[i]);

            System.out.println(arr[0]/k + "/" + arr[i]/k);




        }


    }

    static int Euclidean(int a, int b) {
        if (b == 0)
            return a;
        return Euclidean(b, a % b);
    }

}
