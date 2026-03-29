
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        for (int i=0; i<n; i++) {

            StringBuilder sb = new StringBuilder();
            String str = sc.nextLine();
            String stt = sc.next();

            String[] arr = new String[26];

            for (int j=0; j<arr.length; j++) {

                arr[j] = stt.substring(j,j+1);

            }

            for (int j=0; j<str.length(); j++) {

                if (str.charAt(j) == ' ') {
                    sb.append(" ");
                }
                else {
                    sb.append(arr[str.charAt(j) - 'A']);
                }


            }


            System.out.println(sb);
            sc.nextLine();



        }

    }
}
