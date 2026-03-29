import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        loop1 : for (int i = 0; i < t; i++) {

            boolean turn = true;

            String AC = sc.next();

            int n = sc.nextInt();
            sc.nextLine();

            String str = sc.next();

            str = str.substring(1,str.length()-1);
            str = str.replaceAll("," ," ");

            String[] arr = str.split(" ");

            Deque<String> deque = new LinkedList<>(Arrays.asList(arr));

            for (int j = 0; j < AC.length(); j++) {

                char ch = AC.charAt(j);

                if (ch == 'R') {

                    turn = !turn;

                }else{

                    if (n == 0) {
                        System.out.println("error");
                        continue loop1;
                    }

                    try {

                        if (turn) {
                            deque.removeFirst();
                        }else {
                            deque.removeLast();
                        }
                    }
                    catch (Exception e) {
                        System.out.println("error");
                        continue loop1;
                    }


                }

            }

            StringBuilder sb = new StringBuilder();

            sb.append("[");

            if (turn) {

                while (deque.size() > 0) {

                    sb.append(deque.getFirst()).append(",");
                    deque.removeFirst();

                }

            }
            else {
                while (deque.size() > 0) {

                    sb.append(deque.getLast()).append(",");
                    deque.removeLast();

                }
            }


            if (sb.length() > 1) {
                System.out.println(sb.substring(0, sb.length() - 1) + "]");
            }
            else {
                System.out.println(sb.append("]"));
            }

        }


    }



}
