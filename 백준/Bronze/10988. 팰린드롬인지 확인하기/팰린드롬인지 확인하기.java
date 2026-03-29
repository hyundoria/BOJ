
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != sb.charAt(i)) {
                System.out.println("0");
                break;
            }
            else if (i == str.length()-1) {
                System.out.println("1");
            }

        }

    }

}

