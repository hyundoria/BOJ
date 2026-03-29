
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int sum = 0;

        for (int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A') {
                sum += (str.charAt(i) - 55) * (Math.pow(n, str.length() - i - 1));
            }
            else {
                sum += (Integer.parseInt(str.substring(i,i+1))) *  (Math.pow(n, str.length() - i - 1));
            }


        }

        System.out.println(sum);


    }
}
