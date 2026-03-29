
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        String[] list = br.readLine().split(" ");

        ArrayList<Integer> num = new ArrayList<>(list.length);

        for (int i = 0; i < list.length; i++) {

            num.add(Integer.parseInt(list[i]));

        }

        Collections.sort(num);

        System.out.println(num.get(Integer.parseInt(size[1]) -1 ));




    }
}
