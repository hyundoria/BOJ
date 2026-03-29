
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            map.put(sc.next(), 1);
        }

        for (int i = 0; i < m; i++) {
            String str = sc.next();
            if(map.containsKey(str)) {
                cnt += map.get(str);
            }
        }

        System.out.println(cnt);


    }
}




