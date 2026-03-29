
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");

        HashMap<String, String> map = new HashMap<>(Integer.parseInt(size[0]));

        for (int i = 0; i < Integer.parseInt(size[0]); i++) {
            String[] list = br.readLine().split(" ");

            map.put(list[0],list[1]);

        }

        for (int i = 0; i < Integer.parseInt(size[1]); i++) {
            String str = br.readLine();

            System.out.println(map.get(str));

        }





    }
}
