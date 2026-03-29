import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        // h행에 w개씩, 세로 n칸 가로 m칸 비우고 앉기
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int k = h / (n+1);
        int t = w / (m+1);

        if (h % (n+1) != 0 || k == 0) {
            k++;
        }
        if (w % (m+1) != 0 || t == 0) {
            t++;
        }


        System.out.println(k * t);



    }
}