import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            int m = sc.nextInt();
            sc.nextLine();
            // 의상의 수

            for (int j = 0; j < m; j++) {

                String[] arr = sc.nextLine().split(" ");

                if (map.containsKey(arr[1])) {
                    map.replace(arr[1], map.get(arr[1]) + 1);
                }
                else {
                    map.put(arr[1], 1);
                }
                
            }

            int sum = 1;

            for (String key : map.keySet()) {
                sum *= (map.get(key) + 1);
            }

            System.out.println(sum-1);


        }



    }
}




