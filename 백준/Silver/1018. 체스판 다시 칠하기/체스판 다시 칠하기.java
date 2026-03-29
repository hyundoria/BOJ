import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[][] arr = new boolean[n][m];

        for (int i = 0; i <n; i++) {
			String str = sc.next();
			
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				}
 
			}
		}

        int min = 64;

        
        
        for(int i=0; i<n-7; i++) {
            for(int j = 0; j<m-7; j++) {

                boolean start = arr[i][j];
                int cnt = 0;

                for (int r=i; r<i+8; r++) {
                    for(int k=j; k<j+8; k++){

                        
                        if (arr[r][k] != start) {
                            cnt++;                            
                        }
                        
                        start = !start;
                        
                    }
                    start = !start;
                }

                cnt = Math.min(cnt, 64-cnt);
                min = Math.min(min, cnt);
                
                
            }
        }

        System.out.print(min);
        
        
        
    }
}