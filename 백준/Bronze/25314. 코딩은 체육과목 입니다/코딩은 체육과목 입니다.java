import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {


            int n = sc.nextInt();
            int k = n/4;

            StringBuilder str = new StringBuilder();

            for (int i=0; i<k; i++) {
                str.append("long ");
            }

            str.append("int");

            System.out.println(str);





        }
    }
}