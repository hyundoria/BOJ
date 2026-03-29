

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next( ));



        for (int i=0; i<n; i++) {

            String k = sc.next();

            if (Integer.parseInt(k.substring(k.length()-1,k.length())) % 2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }





        }




    }
}



