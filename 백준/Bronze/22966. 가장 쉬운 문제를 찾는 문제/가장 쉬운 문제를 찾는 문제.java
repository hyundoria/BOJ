
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        String[] name = new String[n];
        int[] scr = new int[n];

        for (int i=0; i<n; i++) {
            name[i] = sc.next();
            scr[i] = Integer.parseInt(sc.next());
        }

        int min = scr[0];
        int idx = 0;

        for (int i=1; i<n; i++) {
            if (scr[i] <= min) {
                min = scr[i];
                idx = i;
            }
        }

        System.out.println(name[idx]);

    }
}

