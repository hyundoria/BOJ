

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m == n || n<m ) {
            System.out.println(2*(n-1));
        }
        else {
            System.out.println(2*(m-1)+1);
        }




    }
}



