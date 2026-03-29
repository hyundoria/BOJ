

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n = sc.nextInt();

        double k = Math.PI * n *n;

        System.out.printf(String.format("%.6f", k) + "\n");
        System.out.println(String.format("%.6f", 2 * n * n));










        }
    }
