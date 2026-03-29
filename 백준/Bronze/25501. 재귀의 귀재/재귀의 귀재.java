
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] arr = new int[2];
            String str = sc.next();

            arr = isPalindrome(str);
            System.out.println(arr[0] + " " + arr[1]);

        }



    }


    public static int[] recursion(String s, int l, int r, int cnt){
        int[] arr = new int[2];
        cnt++;
        if(l >= r) {
            arr[0] = 1;
            arr[1] = cnt;
            return arr;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            arr[0] = 0;
            arr[1] = cnt;
            return arr;
        }
        else {
            return recursion(s, l+1, r-1, cnt);
        }
    }
    public static int[] isPalindrome(String s){
        int cnt = 0;
        return recursion(s, 0, s.length()-1, cnt);
    }

}




