import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            sb.append(queue.poll()).append(" ");
            queue.add(queue.poll());

        }

        System.out.println(sb.toString().trim());






    }
}
