
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = sc.nextLine();

        String stt = sc.nextLine();

        int cnt = 0;

        while (str.contains(stt)) {

            int k = str.indexOf(stt);

            StringBuilder sb = new StringBuilder();

            sb.append(str, 0, k).append("*").append(str.substring(stt.length()+k));

            str = sb.toString();

            cnt++;

        }

        System.out.println(cnt);


    }
}
