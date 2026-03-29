import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

            for (int j = n; j > 0; j--) {
                int k = j;
                while (k%5 == 0) {
                    count++;
                    k/=5;
                }
            }


        System.out.println(count);

    }
}