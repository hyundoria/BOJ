

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.length()/10;
        int s = str.length()%10;

        String stt = "";

        for (int i=0; i<n; i++) {
            stt += str.substring(i*10,(i+1)*10);
            System.out.println(stt);
            stt = "";
        }

        stt += str.substring(n*10,n*10+s);
        System.out.println(stt);




    }
}