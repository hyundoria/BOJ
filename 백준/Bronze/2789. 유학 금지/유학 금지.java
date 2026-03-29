
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {

            if (    str.charAt(i) == 'C' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'M' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'B' || str.charAt(i) == 'D' ||
                    str.charAt(i) == 'R' || str.charAt(i) == 'G' ||
                    str.charAt(i) == 'E') {
                continue;

            }
            else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);



    }
}



