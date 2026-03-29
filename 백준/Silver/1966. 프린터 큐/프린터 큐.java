
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node {

    int priority;
    int order;

    node(int priority, int order) {

        this.priority = priority;
        this.order = order;
    }

}

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            int[] priority = new int[10];
            Queue<node> queue = new LinkedList<>();

            String[] str = br.readLine().split(" ");

            int[] nm = new int[str.length];

            for (int j = 0; j < str.length; j++) {
                nm[j] = Integer.parseInt(str[j]);
            }

            String[] stt = br.readLine().split(" ");

            for (int j = 0; j < stt.length; j++) {
               queue.add(new node(Integer.parseInt(stt[j]),j));
               priority[Integer.parseInt(stt[j])]++;
            }

            int max = max(priority);
            int cnt = 0;

            while (!queue.isEmpty()) {

                int num = queue.peek().priority;
                int ord = queue.peek().order;
                
                if(num == max && ord == nm[1]) {
                    System.out.println(cnt+1);
                    break;
                }
                else if (num == max){

                    queue.remove();
                    cnt++;
                    priority[max]--;
                    max = max(priority);

                }
                else {
                    queue.remove();
                    queue.add(new node(num, ord));
                }



            }
        }


    }

    static int max(int[] arr) {

        int max=0;

        for (int i = arr.length-1; i > 0; i--) {

            if (arr[i] != 0) {
                max = i;
                break;
            }

        }
        return max;
    }



}
