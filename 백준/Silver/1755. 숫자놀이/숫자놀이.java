
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String[] arr = new String[b-a+1];
        String[][] num = new String[b-a+1][2];

        for (int i=a; i<=b; i++) {

            String str = String.valueOf(i);
            num[i-a][0] = str;

            StringBuilder sb = new StringBuilder();

            for (int j=0; j<str.length(); j++) {

                if (str.charAt(j) == '0') {
                    sb.append("zero");
                }
                else if (str.charAt(j) == '1') {
                    sb.append("one");
                }
                else if (str.charAt(j) == '2') {
                    sb.append("two");
                }
                else if (str.charAt(j) == '3') {
                    sb.append("three");
                }
                else if (str.charAt(j) == '4') {
                    sb.append("four");
                }
                else if (str.charAt(j) == '5') {
                    sb.append("five");
                }
                else if (str.charAt(j) == '6') {
                    sb.append("six");
                }
                else if (str.charAt(j) == '7') {
                    sb.append("seven");
                }
                else if (str.charAt(j) == '8') {
                    sb.append("eight");
                }
                else if (str.charAt(j) == '9') {
                    sb.append("nine");
                }
                num[i-a][1] = String.valueOf(sb);


            }
        }

        Arrays.sort(num, (e1, e2) -> {

            if (e1[1].length() == e2[1].length()) {
                return e1[1].compareTo(e2[1]);
            }
            else {
               return e1[1].compareTo(e2[1]);
            }


        });


        int cnt = 0;

        for (int i=0; i<=b-a; i++) {
            if (cnt == 10) {
                cnt = 0;
                System.out.println();
            }
            System.out.print(num[i][0] + " ");
            cnt++;
        }




    }
}
