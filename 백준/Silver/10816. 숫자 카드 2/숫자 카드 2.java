
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();

            if (map.containsKey(k)) {
                map.replace(k , map.get(k) + 1);
            }
            else {
                map.put(k, 1);
            }

        }

        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {

            int k = sc.nextInt();

            if (map.containsKey(k)) {
                sb.append(map.get(k)).append(" ");
            }
            else {
                sb.append(0).append(" ");
            }

        }

        System.out.println(sb.toString().trim());



    }
}




