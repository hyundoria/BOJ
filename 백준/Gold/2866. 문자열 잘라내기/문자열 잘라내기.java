import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int r = Integer.parseInt(arr[0]);
        int c = Integer.parseInt(arr[1]);

        int cnt = 0;

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < r; i++) {

            String str = br.readLine();

            if (i == 0) {
                for (int j = 0; j < c; j++) {
                    list.add(str.substring(j, j + 1));
                }
            }
            else {

                for (int j = 0; j < c; j++) {
                    String sb = list.get(j) + str.charAt(j);
                    list.set(j, sb);
                }

            }

        }

        for (int i = 0; i < r; i++) {

            HashSet<String> set = new HashSet<>(list);

            if (set.size() != c){
                break;
            }
            else {
                cnt++;

                for (int j = 0; j < c; j++) {
                    list.set(j, list.get(j).substring(1));
                }


            }

        }

        System.out.println(cnt-1);






    }
}
