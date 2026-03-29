
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        loop1 : while (true) {

            String str = sc.nextLine();
            if (str.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            boolean ck = true;
            //true면 소괄호;

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if (ch == '(') {
                    stack.push(ch);
                    ck = true;
                }
                else if (ch == ')') {
                    if (stack.isEmpty()) {
                        System.out.println("no");
                        continue loop1;
                    }
                    if (ck) {
                        stack.pop();
                        if (!stack.isEmpty()) {
                            if (stack.peek() == '[' || stack.peek() == ']') {
                                ck = false;
                            }
                        }
                    }
                    else {
                        System.out.println("no");
                        continue loop1;
                    }


                }
                else if (ch == '[') {
                    stack.push(ch);
                    ck = false;
                }
                else if (ch == ']') {
                    if (stack.isEmpty()) {
                        System.out.println("no");
                        continue loop1;
                    }
                    if (!ck) {
                        stack.pop();
                        if (!stack.isEmpty()) {
                            if (stack.peek() == '(' || stack.peek() == ')') {
                                ck = true;
                            }
                        }
                    }
                    else {
                        System.out.println("no");
                        continue loop1;
                    }

                }

            }

            if (stack.isEmpty()) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }




        }




    }
}
