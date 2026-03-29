
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();

        int[] arr = new int[n];

        int cnt = 1;

        int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        stack.push(1);
        sb.append("+").append("\n");

        while (true){

                if (!stack.isEmpty()) {

                    if (cnt2 == n) {
                        break;
                    }

                    int k = stack.peek();

                    if (arr[cnt2] < k) {
                        sb = new StringBuilder("NO");
                        break;
                    }

                    if (arr[cnt2] > cnt) {
                        stack.push(++cnt);
                        sb.append("+").append("\n");
                    }

                    if (k == arr[cnt2]) {
                        stack.pop();
                        sb.append("-").append("\n");
                        cnt2++;
                    }


                } else {

                    if (cnt2 == n) {
                        break;
                    }

                    if (arr[cnt2] > cnt) {
                        stack.push(++cnt);
                        sb.append("+").append("\n");
                    }
                }



            }


        System.out.println(sb);


    }
}
