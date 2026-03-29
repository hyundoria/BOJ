
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        for (int i=0; i<n; i++) {

            String name = sc.next();
            int score = Integer.parseInt(sc.next());

            if (score > 89 ) {
                if (score > 96) {
                    System.out.println(name + " A+");
                }
                else {
                    System.out.println(name + " A");
                }

            } else if (score > 79) {
                if (score > 86) {
                    System.out.println(name + " B+");
                }
                else {
                    System.out.println(name + " B");
                }
            } else if (score > 69) {
                if (score > 76) {
                    System.out.println(name + " C+");
                }
                else {
                    System.out.println(name + " C");
                }
            } else if (score > 59) {
                if (score > 66) {
                    System.out.println(name + " D+");
                } else {
                    System.out.println(name + " D");
                }
            }
            else {
                System.out.println(name + " F");
            }

        }






    }

}

