

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        String[][] arr = new String[n][4];

        for (int i=0; i<n; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
            arr[i][2] = sc.next();
            arr[i][3] = sc.next();
        }

        Arrays.sort(arr, (e1, e2) -> {

           if (Objects.equals(e1[1], e2[1])) {

               if (Objects.equals(e1[2], e2[2])) {

                   if (Objects.equals(e1[3], e2[3])) {
                       return e1[0].compareTo(e2[0]);
                   }
                   else {
                       return Integer.parseInt(e2[3]) - Integer.parseInt(e1[3]);
                   }
               }
               else {
                   return Integer.parseInt(e1[2]) - Integer.parseInt(e2[2]);
               }

           }
           else {
               return Integer.parseInt(e2[1]) - Integer.parseInt(e1[1]);
           }

        });

        for (int i=0; i<n; i++) {
            System.out.println(arr[i][0]);
        }


    }
}



