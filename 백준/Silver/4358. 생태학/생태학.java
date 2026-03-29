

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        double cnt = 0;


        TreeMap<String, Double> map = new TreeMap<>();

        while ((str = br.readLine()) != null) {

            if(map.containsKey(str)) {

                map.replace(str, map.get(str) + 1);

            }
            else {
                map.put(str, 1.0);
            }
            cnt++;
        }



        for (String key: map.keySet()) {

            double num = (map.get(key) / cnt) * 100.0;

            System.out.println(key + " " + String.format("%.4f", num));

        }



    }
}
