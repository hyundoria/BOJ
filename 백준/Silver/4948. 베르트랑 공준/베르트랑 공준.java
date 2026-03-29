


import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);


        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int count = 0;

            loop1 : for (int i=n+1; i<=2*n; i++) {
                if (i == 2 || i == 3) {
                    count++;
                    continue;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        continue loop1;
                    }
                    if (j == (int) Math.sqrt(i)) {
                        count++;
                    }
                }
            }

            System.out.println(count);

        }



    }

}