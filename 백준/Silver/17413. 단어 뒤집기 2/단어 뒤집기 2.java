
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        boolean ck = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '<') {

                while (!stack.empty()) {
                    sb.append(stack.peek());
                    stack.pop();
                }

                ck = true;
                sb.append(ch);
                continue;

            } else if (ch == '>') {
                ck = false;
                sb.append(ch);
                continue;
            }

            if (ch == ' ') {
                while (!stack.empty()) {
                    sb.append(stack.peek());
                    stack.pop();
                }
                sb.append(ch);
                continue;
            }
            if (ck) {
                sb.append(ch);
            }
            else {
                stack.push(ch);
            }


        }

        while (!stack.empty()) {
            sb.append(stack.peek());
            stack.pop();
        }

        System.out.println(sb.toString().trim());


    }
}




