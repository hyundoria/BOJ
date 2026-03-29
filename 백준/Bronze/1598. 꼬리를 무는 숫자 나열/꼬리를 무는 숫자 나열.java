
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int aa = ((a-1)/4)+1;
        int aaa = a%4;
        int bb = ((b-1)/4)+1;
        int bbb = b%4;

        if (aaa==0) {
            aaa = 4;
        }
        if (bbb==0) {
            bbb=4;
        }

        System.out.println(Math.abs(aa-bb) + Math.abs(aaa-bbb));



    }
}
