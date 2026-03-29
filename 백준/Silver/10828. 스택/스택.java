import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {

            String str = br.readLine();

            if (str.length() >= 6) {
                stack.push(Integer.valueOf(str.substring(5)));
            }

            else if (str.equals("pop")) {
                if (stack.size() == 0) {
                    bw.write("-1\n");
                }
                else {
                    bw.write(stack.peek() + "\n");
                    stack.pop();
                }
            }

            else if (str.equals("size")) {
                bw.write(stack.size() + "\n");
            }

            else if (str.equals("empty")) {
                if (stack.size() == 0) {
                    bw.write("1\n");
                }
                else {
                    bw.write("0\n");
                }
            }

            else if (str.equals("top")) {
                if (stack.size() == 0) {
                    bw.write("-1\n");
                }
                else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();



    }
}




