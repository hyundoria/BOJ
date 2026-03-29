
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();

        int[][] arr = new int[6][2];

        int maxw = 0;
        int maxh = 0;
        int maxwi = 0;
        int maxhi = 0;

        for (int i = 0; i < 6; i++) {

            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

            if (arr[i][0] == 1 || arr[i][0] == 2) {

                if (maxh < arr[i][1]) {
                    maxh = arr[i][1];
                    maxhi = i;
                }

            }
            else {
                if (maxw < arr[i][1]) {
                    maxw = arr[i][1];
                    maxwi = i;
                }
            }


        }

        int size = maxh * maxw - (arr[(maxhi+3) % 6][1] * arr[(maxwi+3) % 6][1]);
        System.out.println(size*n);











        }
    }
