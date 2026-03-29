
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String size = br.readLine();

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < Integer.parseInt(size); i++) {

            long n = Long.parseLong(br.readLine());

            if (map.containsKey(n)) {

                map.replace(n, map.get(n) + 1);

            }
            else {
                map.put(n,1);
            }


        }

        int max = 0;
        long num = 0;

        ArrayList<Long> list = new ArrayList<>();

        for (Long key: map.keySet()) {
            
            if (map.get(key) > max) {
                list.clear();
                max = map.get(key);
                list.add(key);
            }
            else if (map.get(key) == max) {
                list.add(key);
            }
            
        }

        Collections.sort(list);

        System.out.println(list.get(0));



    }
}
