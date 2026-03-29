
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        loop1 : for (int i = 0; i < n; i++) {

            int[] arr = new int[26];

            String str = sc.next();

            arr[str.charAt(0) - 'a']++;

            for (int j = 1; j < str.length(); j++) {

                char c = str.charAt(j);

                if (arr[c-'a'] == 0) {
                    arr[c-'a']++;
                }
                else {

                    if (str.charAt(j-1) != c) {
                        continue loop1;
                    }


                }


            }

            cnt++;

        }

        System.out.println(cnt);



    }
}