
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int sum = 0;

        for (int i=0; i<5; i++) {
            sum += Math.pow(Integer.parseInt(str.substring(i,i+1)),5) ;
        }
        System.out.println(sum);

    }
}

