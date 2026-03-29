
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        String str = sc.next();

        int cnt2 = 0;
        int cnte = 0;

        for (int i=0; i<s; i++) {
            if (str.charAt(i) == 'e') {
                cnte++;
            }
            else {
                cnt2++;
            }
        }

        if (cnt2 > cnte) {
            System.out.println("2");
        }
        else if (cnt2 < cnte) {
            System.out.println("e");
        }
        else {
            System.out.println("yee");
        }




    }
}

