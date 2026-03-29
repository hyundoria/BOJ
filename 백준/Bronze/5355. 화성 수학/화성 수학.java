import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String str = sc.nextLine();

            String[] arr = str.split(" ");




            double k = Double.parseDouble(arr[0]);

            for (int j = 1; j < arr.length; j++) {

                switch (arr[j]) {

                    case "@" : k = k*3;
                    break;
                    case "%" : k += 5;
                    break;
                    case "#" : k -= 7;

                }


            }

            System.out.printf("%.2f%n", k);
            


        }


    }
}




