import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;

class Postfix {

    // 입력받은 postfix 저장
    private String postfix;

    // 생성자, infix를 입력 받고, postfix 객체 생성 및 infixToPostfix 함수 실행
    public Postfix(String string){
        postfix = string;
    }

    // postfix 변수에 저장된 연산자를 사용해 값을 계산
    public double calculate(){

        // postfix 변수 수와 계산된 수를 저장할 스택 객체
        Stack<Double> stack = new Stack<>();

        String[] token = postfix.split(" ");

        // postfix의 전체를 순환
        for (int i = 0; i < token.length; i++) {
            try {
                double value = Double.parseDouble(token[i]);
                stack.push(value);
            } catch (NumberFormatException e) {
                // 숫자가 아니라는 뜻이니 연산자로 처리
                double a = stack.pop();
                double b = stack.pop();

                switch (token[i]) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }
        // 스택에 있는 계산된 값을 반환
        return stack.pop();


    }
    // 저장 되어 있는 postfix 반환
    public String getPostfix(){
        return postfix.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String input = sc.next();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char token = input.charAt(i);


            if (token >= 'A' && token <= 'Z') {

                int k = token - 'A';

                str.append(arr[k]).append(" ");

            }
            else {
                str.append(token).append(" ");
            }

        }


        Postfix postfix = new Postfix(str.toString());

        System.out.printf("%.2f%n", postfix.calculate());


    }
}
