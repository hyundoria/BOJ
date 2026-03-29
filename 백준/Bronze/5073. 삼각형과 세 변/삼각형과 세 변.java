

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a+c+b == 0) {
                break;
            }

            boolean ck1 = false;
            boolean ck2 = false;
            boolean ck3 = false;

            if (a==b) {
                ck1 = true;
            }
            if (c==b) {
                ck2 = true;
            }
            if (a==c) {
                ck3 = true;
            }


            if (a > b && a > c) {
                if (a >= b + c) {
                    System.out.println("Invalid");
                    continue;
                }
            } else if (b > a && b > c) {
                if (b >= a + c) {
                    System.out.println("Invalid");
                    continue;
                }
            } else if (c > b && c > a) {
                if (c >= b + a) {
                    System.out.println("Invalid");
                    continue;
                }
            }


            if (ck1 && ck2) {
                System.out.println("Equilateral");
            }
            else if (ck1 && !ck3) {
                System.out.println("Isosceles");
            }
            else if (ck2 && !ck3) {
                System.out.println("Isosceles");
            }
            else if (ck3 && !ck1) {
                System.out.println("Isosceles");
            }
            else if (!ck1 && !ck2) {
                System.out.println("Scalene");
            }




        }





    }
}
