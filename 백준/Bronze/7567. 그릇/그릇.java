
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int sum = 10;

        for (int i=0; i<str.length()-1; i++) {

            if (str.charAt(i) != str.charAt(i+1)) {
                sum += 10;
            }
            else {
                sum += 5;
            }


        }


        System.out.println(sum);

    }
}