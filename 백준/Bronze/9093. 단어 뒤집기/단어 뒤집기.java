
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        sc.nextLine();


        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {

            String[] input = sc.nextLine().trim().split(" ");


            for (int r=0; r<input.length; r++) {

                String str = input[r];
                String stt = "";

                for (int j = str.length() - 1; j >= 0; j--) {

                    stt += str.charAt(j);

                }
                sb.append(stt).append(" ");
            }

            sb.append("\n");

        }

        System.out.println(sb.toString().trim());


    }
}
