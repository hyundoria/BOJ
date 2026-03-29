
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = sc.next().split("");

        int cnt = 0;
        int cnta = 0;
        int cntn = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].equals("A") ) {
                cnta++;

                if(cnta == 2 && cntn == 1) {
                    cnt += 1;
                    cnta = 1;
                    cntn = 0;
                }
                else if(cnta == 2) {
                    cnta = 1;
                    cntn = 0;
                }


            }
            if(arr[i].equals("N") && cnta == 1) {
                cntn++;
            }

        }

        System.out.println(cnt);











    }
}




