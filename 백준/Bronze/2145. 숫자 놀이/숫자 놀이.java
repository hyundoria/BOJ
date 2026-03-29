
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        while (true) {

            String str = sc.next();

            if (Objects.equals(str, "0")) {
                break;
            }


            while (true) {

                int sum = 0;

                for (int i=0; i<str.length(); i++) {

                    sum += Integer.parseInt(str.substring(i,i+1));

                }

                str = String.valueOf(sum);

                if (Integer.parseInt(str) < 10) {
                    break;
                }

            }

            System.out.println(str);



        }



    }
}
