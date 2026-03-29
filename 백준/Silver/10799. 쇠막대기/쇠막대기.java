
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        String str = sc.nextLine();


        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {

                stack.push(ch);
                cnt++;

            }
            else {

                stack.pop();

                if (str.charAt(i-1) == '(') {
                    cnt--;
                    cnt += stack.size();
                }


            }

        }
        
        System.out.println(cnt);








    }
}
