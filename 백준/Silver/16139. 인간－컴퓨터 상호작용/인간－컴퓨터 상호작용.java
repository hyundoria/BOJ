import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int t = Integer.parseInt(br.readLine());

        int[][] dp = new int[26][str.length() + 1];

        for (int i = 0; i < str.length(); i++) {

            int k = str.charAt(i) - 'a';

            dp[k][i+1]++;


            for (int j = i+1; j < str.length(); j++) {

                dp[k][j+1] = dp[k][j];

            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            char ch = st.nextToken().charAt(0);

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken())+1;

            sb.append(dp[ch - 97][m] - dp[ch - 97][n]).append("\n");
        }

        System.out.print(sb);
        br.close();




    }
}
