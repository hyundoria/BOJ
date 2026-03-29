

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();



            if (r + c == e) {
                System.out.println("does not matter");
            }
            else  if (r + c > e) {
                System.out.println("do not advertise");
            }
            else if (r + c < e) {
                System.out.println("advertise");
            }


        }




    }
}



