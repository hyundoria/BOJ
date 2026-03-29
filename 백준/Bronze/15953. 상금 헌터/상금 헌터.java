import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {


            int t = sc.nextInt();

            int[] arr = new int[2*t];

            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i=0; i<t; i++) {
                int sum = 0;
                int a = arr[i*2];
                int b = arr[i*2+1];

                if(a > 21) {
                    a = 0;
                }
                if(b > 31) {
                    b = 0;
                }

                if (a == 1) {
                    sum += 5_000_000;
                }
                else if (a == 2 || a == 3) {
                    sum += 3_000_000;
                }
                else if (a == 4 || a == 5 || a == 6 ) {
                    sum += 2_000_000;
                }
                else if (a > 6 && a < 11) {
                    sum += 500_000;
                }
                else if (a > 10 && a < 16) {
                    sum += 300_000;
                }
                else if (a > 15) {
                    sum += 100_000;
                }

                if (b == 1) {
                    sum += 5_120_000;
                }
                else if (b == 2 || b == 3) {
                    sum += 2_560_000;
                }
                else if (b > 3 && b < 8 ) {
                    sum += 1_280_000;
                }
                else if (b > 7 && b < 16) {
                    sum += 640_000;
                }
                else if (b > 15) {
                    sum += 320_000;
                }

                System.out.println(sum);
            }





        }
    }
}