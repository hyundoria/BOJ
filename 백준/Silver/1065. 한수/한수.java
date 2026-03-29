import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int count=0;

        for (int i=1; i<=n; i++) {
            int a=0;
            int b=0;
            int c=0;

            if (i < 100) {
                count++;
                continue;
            }
            else {
                a = i%10;
                b = (i/10)%10;
                c = i/100;

                if ((b-a) == (c-b)) {
                    count++;
                }
            }
        }

        System.out.println(count);



    }
}