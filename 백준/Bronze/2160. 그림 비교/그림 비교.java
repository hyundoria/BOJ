

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        String[] arr = new String[((5*n)+1)];

        for (int i=1; i < arr.length; i++) {

            arr[i] = sc.next();

        }
        
        int min = 36;
        int cnt = 0;
        int idxi = 0;
        int idxj = 0;

        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=1; k<=5; k++) {
                    for (int r = 0; r < 7; r++) {


                        if (arr[k+(5*i)].charAt(r) != arr[k+(5*j)].charAt(r)) {
                            cnt++;
                        }

                    }
                }
                if (cnt <= min) {
                    min = cnt;
                    idxi = i;
                    idxj = j;
                }
                cnt = 0;
            }
        }


        System.out.println((idxi+1) + " " + (idxj+1));




    }
}



