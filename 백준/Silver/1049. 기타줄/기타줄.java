import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m][2];

        for (int i=0; i<m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int pack = n/6;
        int each = n%6;
        
        int minpack = 6000; 
        int mineach = 6000;

        int temp = 0;
        
        for (int i=0; i<m; i++) {

            temp = 0;
            
            if (pack > 0) {
                temp = Math.min(arr[i][0], arr[i][1] * 6);
                minpack = Math.min(minpack, temp);
            }
            else{
                minpack = 0;
            }
            temp = Math.min(arr[i][0], arr[i][1] * each);
            mineach = Math.min(temp, mineach);
             
        }

        System.out.print((minpack*pack) + mineach);
        
    }
}