
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String m = sc.next();

        int max = 0;
        int min = 0;

        StringBuilder sm = new StringBuilder();
        StringBuilder sn = new StringBuilder();

        for (int i=0; i<n.length(); i++) {

            if (n.charAt(i) == '6') {
                sn.append(5);
            }
            else {
                sn.append(n.charAt(i));
            }

        }

        for (int i=0; i<m.length(); i++) {

            if (m.charAt(i) == '6') {
                sm.append(5);
            }
            else {
                sm.append(m.charAt(i));
            }

        }
        System.out.print(Integer.parseInt(String.valueOf(sm)) + Integer.parseInt(String.valueOf(sn)) + " ");


        sm = new StringBuilder();
        sn = new StringBuilder();


        for (int i=0; i<n.length(); i++) {

            if (n.charAt(i) == '5') {
                sn.append(6);
            }
            else {
                sn.append(n.charAt(i));
            }

        }

        for (int i=0; i<m.length(); i++) {

            if (m.charAt(i) == '5') {
                sm.append("6");
            }
            else {
                sm.append(m.charAt(i));
            }

        }

        System.out.print(Integer.parseInt(String.valueOf(sm)) + Integer.parseInt(String.valueOf(sn)));




    }
}



