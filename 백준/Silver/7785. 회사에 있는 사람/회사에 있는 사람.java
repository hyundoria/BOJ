
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, String> map = new HashMap<>();


        for (int i = 0; i < n; i++) {

            String[] str = sc.nextLine().split(" ");

            if (str[1].equals("enter")) {
                map.put(str[0], str[1]);
            }
            else {
                map.remove(str[0]);
            }

        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort(String::compareTo);

        StringBuilder sb = new StringBuilder();

        for (int i = list.size()-1; i >= 0; i--) {

            System.out.println(list.get(i));

        }


    }
}
