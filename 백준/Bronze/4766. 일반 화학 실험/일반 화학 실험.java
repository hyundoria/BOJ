

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();

        while (true) {

            float b = sc.nextFloat();

            if (b == 999) {
                break;
            }

           System.out.printf("%.2f%n", b-a);

            a = b;

        }



    }
}