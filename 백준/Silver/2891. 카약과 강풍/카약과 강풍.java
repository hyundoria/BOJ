
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();
        int s = sc.nextInt();
        int r = sc.nextInt();

        int[] arr = new int[n+1];

        for (int i = 0; i < s; i++) {
            arr[sc.nextInt()] = 1;
        }

        for (int i = 0; i < r; i++) {

            int k = sc.nextInt();

            if (arr[k] == 1) {
                arr[k] = 0;
            }
            else {
                arr[k] = 2;
            }

        }

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {

                if (i == 0) {

                    if (arr[i+1] == 2) {
                        arr[i+1] = 0;
                        arr[i] = 0;
                    }

                }
                else if (i == arr.length-1) {

                    if (arr[i-1] == 2) {

                        arr[i-1] = 0;
                        arr[i] = 0;

                    }

                }
                else {

                    if (arr[i-1] == 2){

                        arr[i-1] = 0;
                        arr[i] = 0;
                    }
                    else if (arr[i+1] == 2) {
                        arr[i+1] = 0;
                        arr[i] = 0;
                    }



                }


            }


        }


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}
