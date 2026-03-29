

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        LinkedHashSet<String> set = new LinkedHashSet<>();
        ArrayList<String> list = new ArrayList<>(n);
        ArrayList<String> llist = new ArrayList<>(n);

        int cnt = 0;

        for (int i = 0; i < n; i++) {

            String str = br.readLine();

            list.add(str);

        }

        for (int i = 0; i < n; i++) {

            llist.add(br.readLine());

        }

        while (llist.size() > 0) {

            if (llist.get(0).equals(list.get(0))) {

                llist.remove(0);
                list.remove(0);

            }
            else {

                cnt++;
                list.remove(llist.get(0));
                llist.remove(0);

            }


        }

        System.out.println(cnt);


    }
}
