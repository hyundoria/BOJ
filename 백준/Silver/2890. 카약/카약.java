import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[] rank = new int[10];

        String[] arr = new String[r];

        for (int i = 0; i < r; i++) {
            arr[i] = sc.next();
        }


        Arrays.sort(arr);

        int old = -1;
        int rak = 0;

        for (int i = arr.length-9; i < arr.length; i++) {

            int idx = 0;
            int cnt = 0;

            char[] arrch = arr[i].toCharArray();

            for (int j = arrch.length-2; j > 0; j--) {

                if (arrch[j] >= '1' && arrch[j] <= '9') {
                    idx = Integer.parseInt(Character.toString(arrch[j]));
                    break;
                }
                else {
                    cnt++;
                }

            }

            if (old == cnt) {
                rank[idx] = rak;
            }
            else if (old < cnt){

                rank[idx] = ++rak;
                old = cnt;
            }

        }

      for (int i = 1; i < rank.length; i++) {
            System.out.println(rank[i]);
        }


    }
}
