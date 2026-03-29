import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String arr = sc.nextLine();
        

        if (arr.equals("(1)")) {
            System.out.println(0);
        }
        else if (arr.equals(")1(")) {
            System.out.println(2);
        }
        else  {
            System.out.println(1);
        }

       





    }




}




