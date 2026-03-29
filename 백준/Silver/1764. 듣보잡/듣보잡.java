
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = a+b;

        int big = 0;

        if (a >= b) {
            big = a;
        }
        else {
            big = b;
        }

        String[] name = new String[big];
        String[] arr = new String[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        int cnt = 0;
        int count = 0;

        for (int i=0; i<n-1; i++) {

            if (Objects.equals(arr[i], arr[i + 1])) {
                cnt++;
                name[count++] = arr[i];
                i++;
            }


        }

        System.out.println(cnt);

        for (int i=0; i<big; i++) {
            if (name[i] != null) {
                System.out.println(name[i]);
            }
        }



    }
}
