
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        for (int i=0; i<n; i++) {

            int k = Integer.parseInt(sc.next());
            String str = sc.next();

            StringBuilder sb = new StringBuilder();

            sb.append(str.substring(0,k-1));
            sb.append(str.substring(k));

            System.out.println(sb);

        }


    }
}



