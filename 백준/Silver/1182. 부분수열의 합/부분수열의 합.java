
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            combination(arr, visited, 0, n, i);
        }

        int cnt = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == l) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            sum(arr, visited, n);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static void sum(int[] arr, boolean[] visited, int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                sum += arr[i];
            }
        }
        list.add(sum);

    }


}
