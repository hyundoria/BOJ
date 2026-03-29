import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);



        loop1 : for (int j=1; j<10001; j++) {

            if (j == 1) {
                System.out.println(j);
                continue;
            }

            for (int i = 1; i < j; i++) {
                int sum = 0;
                int k = i;

                do {
                    int b = k % 10;
                    sum += b;
                    k = k / 10;


                } while (k >= 10);

                if (sum + i + k == j) {
                    continue loop1;
                }
                if (i == j - 1) {
                    System.out.println(i + 1);
                }
            }

        }

    }
}