import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        HashSet<String> set = new HashSet<>();

        for (int i = 1; i <= str.length(); i++) {

            int cnt = 0;
            int k = i;

            while (k <= str.length()) {

                set.add(str.substring(cnt++, k++));

            }

        }

        System.out.println(set.size());

    }
}




