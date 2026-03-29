

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {


            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            int count = 0;
            int max = 0;

            for (int i=0; i<=(int)Math.sqrt(b); i++) {
                if (a <= i*i  && i*i <= b) {
                    sum += i*i;
                    count++;
                    max = i;
                }
            }

            int min = max - count + 1;

            if (sum > 0) {
                System.out.println(sum);
                System.out.println(min*min);
            }
            else {
                System.out.println("-1");
            }




        }
    }
}