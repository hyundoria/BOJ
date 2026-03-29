import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        String[] n = br.readLine().split(" ");
        String[] m = br.readLine().split(" ");

        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();

        while (i < Integer.parseInt(size[0]) && j < Integer.parseInt(size[1])) {

            if (Integer.parseInt(n[i]) < Integer.parseInt(m[j])) {
                sb.append(n[i]).append(" ");
                i++;
            }else {
                sb.append(m[j]).append(" ");
                j++;
            }


        }

        while (i < Integer.parseInt(size[0])) {
            sb.append(n[i]).append(" ");
            i++;
        }
        while (j < Integer.parseInt(size[1])) {
            sb.append(m[j]).append(" ");
            j++;
        }

        System.out.println(sb.toString().trim());





    }
}
