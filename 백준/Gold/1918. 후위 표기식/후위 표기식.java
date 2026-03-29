import java.util.Stack;
import java.util.Scanner;

class Postfix {

    // 입력받은 infix 저장
    private String infix;
    // infix를 postfix로 변환후 저장할 변수
    private StringBuilder postfix;

    // 생성자, infix를 입력 받고, postfix 객체 생성 및 infixToPostfix 함수 실행
    public Postfix(String string){
        infix = string;
        postfix = new StringBuilder();
        infixToPostfix();
    }

    // infix를 postfix로 변환
    private void infixToPostfix(){

        // char 타입의 ArrayStack 객체 생성
        Stack<Character> stack = new Stack<>();

        // index 입력부터 infix의 길이만큼 반복
        for(int i = 0; i < infix.length(); i++){

            // infix 수식을 i 인덱스 부분을 슬라이싱
            char token = infix.charAt(i);
            // 스택이 비어있는지 확인
            boolean ck = stack.isEmpty();

            // 슬라이싱한 토큰이 숫자이면 postfix에 입력
            if(token >= 'A' && token <= 'Z'){
                postfix.append(token).append(" ");
            }
            // 연산자 일경우 (연산자 우선순위는 / == * > + == - 순서)
            else{

                // 스택이 비어있으면 스택에 연산자 삽입
                if(ck){
                    stack.push(token);
                    continue;
                }

                // 스택이 비어있지 않을 겨우
                // 여는 괄호의 경우 스택에 바로 삽입
                if(token == '(') {
                    stack.push(token);
                }
                // 닫는 괄호의 경우
                else if(token == ')') {
                    // 스택이 비어있지 않고, 여는 괄호 이전까지 스택을 pop 해준다.
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop()).append(" ");
                    }
                    // 여는 괄호 pop
                    stack.pop();
                }
                // +와 -의 경우 가장 낮은 우선순위
                else if(token == '+' || token == '-') {
                    // 스택의 top이 여는 괄호일경우 스택에 삽입
                    if(stack.peek() == '(') {
                        stack.push(token);
                    }
                    else if (stack.peek() == '*' || stack.peek() == '/') {
                        while (!stack.isEmpty() && stack.peek() != '(' ) {
                            postfix.append(stack.pop()).append(" ");
                        }
                        stack.push(token);
                    }
                    // 아닐경우
                    else {
                        // 스택에 있는 연산자를 pop하고 스택에 + 삽입
                        postfix.append(stack.pop()).append(" ");
                        stack.push(token);
                    }
                }
                // *와 /의 경우 스택에 top이 *보다 낮은 우선순위와 여는 괄호일경우 스택에 삽입
                else if(token == '*' || token == '/') {
                    if(stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '('){
                        stack.push(token);
                    }
                    // 아닐경우
                    else{
                        // 스택에 있는 연산자를 pop하고 스택에 * 삽입
                        postfix.append(stack.pop()).append(" ");
                        stack.push(token);
                    }
                }
            }
        }

        // 스택에 남아있는 항목들을 모두 출력
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }

    }

    // postfix 변수에 저장된 연산자를 사용해 값을 계산
    public double calculate(){

        // postfix 변수 수와 계산된 수를 저장할 스택 객체
        Stack<Double> stack = new Stack();

        // 띄어쓰기가 적용된 postfix 수식의 띄어쓰기를 제거
        String postfix = getPostfix().replace(" ", "");

        // postfix의 전체를 순환
        for(int i = 0; i < postfix.length(); i++) {

            // postfix의 수식을 슬라이싱
            char token = postfix.charAt(i);

            // 슬라이싱한 요소가 숫자일 경우 스택에 삽입
            if (token >= '0' && token <= '9') {
                stack.push(Double.parseDouble(String.valueOf(token)));
            }
            // 연산자 일경우
            else {
                // 계산을 위해 스택의 요소를 pop
                double a = stack.pop();
                double b = stack.pop();
                // b가 계산되고 있는 값, a가 새로 들어온 값이다.
                // 연산자에 맞춰 계산을 진행
                switch (token) {
                    case '+':
                        stack.push(b + a);
                        break;
                    case '-':
                        stack.push(b - a);
                        break;
                    case '*':
                        stack.push(b * a);
                        break;
                    case '/':
                        stack.push(b / a);
                        break;
                }

            }
        }

        // 스택에 있는 계산된 값을 반환
        return stack.pop();


    }
    // 저장 되어 있는 postfix를 반환
    public String getPostfix(){
        return postfix.toString();
    }
    // 저장 되어 있는 infix를 반환
    public String getInfix(){
        return infix;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Postfix postfix = new Postfix(input);

        System.out.println(postfix.getPostfix().replace(" ", ""));


    }
}
